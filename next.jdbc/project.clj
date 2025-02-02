(defproject ragtime/next.jdbc "0.8.1"
  :description "Ragtime migrations for next.jdbc"
  :url "https://github.com/weavejester/ragtime"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [com.github.seancorfield/next.jdbc "1.2.737"]
                 [ragtime/core "0.8.1"]
                 [resauce "0.1.0"]]
  :profiles
  {:dev {:dependencies [[com.h2database/h2 "1.4.200"]]}})
