(ns batman.server
  (:require [batman.handler :refer [app]]
            [config.core :refer [env]]
            [ring.adapter.jetty :refer [run-jetty]])
  (:gen-class))
;;; A Change, so CI will pick it up
 (defn -main [& args]
   (let [port (Integer/parseInt (or (env :port) "3000"))]
     (run-jetty app {:port port :join? false})))
