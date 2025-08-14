(defproject second-edition "1.0.0"
  :description "Example sources for the second edition of JoC"
  :url "http://www.joyfoclojure.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.12.1"]
                 [org.clojure/clojurescript "1.12.42"]
                 [org.clojure/core.unify "0.7.0"]
                 [org.clojure/core.logic "1.1.0"]]
  :source-paths ["src/clj"]
  ;; :aot [joy.gui.DynaFrame]
  :plugins [[lein-cljsbuild "1.1.8"]]
  :cljsbuild
  {:builds
   [{:source-paths ["src/cljs"]
     :compiler
     {:output-to "dev-target/all.js"
      :optimizations :whitespace
      :pretty-print true}}
    {:source-paths ["src/cljs"]
     :compiler
     {:output-to "prod-target/all.js"
      :optimizations :advanced
      :externs ["externs.js"]
      :pretty-print false}}]})
