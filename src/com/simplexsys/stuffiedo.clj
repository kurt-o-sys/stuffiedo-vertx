(ns com.simplexsys.stuffiedo
  (:require [vertx.core :refer [config deploy-verticle deploy-module]]))

(defn init []
  (let [cfg (config)]
    (deploy-verticle "com/simplexsys/stuffiedo/auth-mgr.clj"
                     :config (:auth-mgr cfg))
  
 ;   (deploy-verticle "com/simplexsys/stuffiedo/durability.clj"
 ;                    :config (:durability cfg))

    (deploy-module "io.vertx~mod-web-server~2.0.0-final"
                   :config (:webserver cfg))) )

