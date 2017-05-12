(ns clojure-sketch.core)

(def num-blocks 1000)

(def a-block "<div class='block'></div>")

(defn- all-the-blocks []
  (reduce
    str
    ""
    (repeat num-blocks a-block)))

(defn- qs [sel]
  (.querySelector js/document sel))

(def container-el (qs "#container"))

(def grey-color "#ddd")
(def white-color "white")

(defn- white? [color]
  (= color white-color))

(defn- click-on-container [js-evt]
  (let [target-el (aget js-evt "target")
        target-bg-color (aget target-el "style" "background")
        new-bg-color (if (white? target-bg-color) grey-color white-color)]
    (aset target-el "style" "background" new-bg-color)))

(.addEventListener container-el "click" click-on-container)

(aset container-el "innerHTML" (all-the-blocks))
