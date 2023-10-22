(ns grq-prolific.core
  (:require [org.httpkit.server :refer [run-server]]
            [clj-time.core :as t])) 

(def PORT 8080)

(defn get-quote
  []
  (rand-nth (clojure.string/split (slurp "resources/quotes.txt") #"\n")))

(defn app [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (str (get-quote))})

(defn -main 
  [& args]
  (run-server app {:port PORT})
  (println "Server started on port" PORT))
