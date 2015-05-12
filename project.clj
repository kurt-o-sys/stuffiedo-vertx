(defproject com.simplexsys.stuffiedo "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-jwt "0.0.13"]
                 ]
  :plugins [[lein-vertx "0.3.1"]]
  :vertx {:main com.simplexsys.stuffiedo/init
          :author "Kurt Sys"
          :keywords ["FIXME: keywords"]
          :developers [""]})
