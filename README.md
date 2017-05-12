# Clojure Sketch

A really simple etch-a-sketch application to learn ClojureScript.

Play online [here](https://magentanova.github.io/clojureSketch/dist/).

## Development Setup

Make sure [Leiningen] is installed, then from this folder:

```sh
# clear all CLJS-generated files
lein clean

# watch CLJS files for changes
lein cljsbuild auto

# if you only want to watch the "dev" build
lein cljsbuild auto dev

# if you only want to watch the "prod" build
lein cljsbuild auto prod

# run a web server out of this directory
python -m SimpleHTTPServer
```

Note that you can pass a `?devscript` query parameter to the page in order to
load the dev file. ie: `https://magentanova.github.io/clojureSketch/dist/index.html?devscript`

[Leiningen]:https://leiningen.org/
