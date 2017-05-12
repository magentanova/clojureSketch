(defproject clojure-sketch "0.0.1"
  :description "A simple etch-a-sketch application using ClojureScript."

  :source-paths ["src"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.521"]]

  :plugins [[lein-cljsbuild "1.1.6"]]

  :clean-targets ["target"
                  "dist/main.js"
                  "dist/main.min.js"]

  :cljsbuild
    {:builds
      [{:id "dev"
        :source-paths ["src-cljs"]
        :compiler {:output-to "dist/main.js"
                   :optimizations :whitespace
                   :pretty-print true}}

       {:id "prod"
        :source-paths ["src-cljs"]
        :compiler {:output-to "dist/main.min.js"
                   :optimizations :advanced}}]})
