(defproject grq-prolific "0.1.0-SNAPSHOT"
  :author "Lian Araujo Fernandes"
  :description "api for getting random quotes"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [http-kit "2.3.0"]
                 [clj-time "0.14.0"]]
  :repl-options {:init-ns grq-prolific.core}
  :plugins [[cider/cider-nrepl "0.40.0"]]
  :main grq-prolific.core)
