(ns com.simplexsys.stuffiedo.auth-mgr
  (:require [vertx.eventbus :as eb]
            [vertx.core :refer [config]]
            [clj-jwt.core :refer [str->jwt verify]]))

(defn epoch []
  (int (/ (System/currentTimeMillis) 1000)))

(let [cfg (config)
      address (:address cfg) ]
  (eb/on-message
    (:auth address)
    (fn [msg] (let [token (-> (:token msg) str->jwt)]
                (eb/reply msg 
                          (if (and (= (:aud token) (:aud cfg))
                                   (<= (:exp token) (epoch))
                                   (verify token :HS256 (:secret cfg))) 
                            {:status "ok"
                             :username (-> token :user_id) }
                            {:status "denied or expired"}) ))))
  (eb/on-message
    (:login address)
    (fn [msg] (eb/reply msg (if true
                              {:status "ok"
                               :sessionID "some-sessionid?" }
                              {:status "denied"})) ))
  (eb/on-message
    (:logout address)
    (fn [msg] (eb/reply (if true 
                          {:status "ok"}
                          {:status "error"})))))

