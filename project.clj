(defproject fullclosure "0.1.0"
  :description "a fullstack web application in clojure"
  :url "http://github.com/Ahbar1999/fullclosure.git"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.11.54"]]
  :plugins [[lein-cljsbuild "1.1.8"]]
  :cljsbuild {
    :builds [{
       :source-paths ["src/fullclosure-cljs"]
        :compiler {
          :output-to "www/js/main.js"
          :optimizations :whitespace
          :pretty-print true
          }}]}
  :main ^:skip-aot fullclosure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}} 
  )
