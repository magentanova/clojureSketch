(ns src.core)
(enable-console-print!)

(defn qs[sel] (.querySelector js/document sel))
(defn populate[] 
	; (def bodEl (qs "body"))
	; (def x (int 0))
	; (def html (str ""))
	(loop [x 0 html ""]
		(if (> x 1000) 
			html 
			(recur (inc x) (str html "<div class='block'></div>"))
		)
	)
)

(def containerEl (qs "#container"))

(defn getNewColor[inputColor] (if (= inputColor "white") "#ddd" "white") )

(defn clickHandler[eObj] 
	(def newColor (getNewColor (aget (.-style (.-target eObj)) "background")))
	(aset (.-style (.-target eObj)) "background" newColor)
	)

(.addEventListener containerEl "click" clickHandler)

(aset containerEl "innerHTML" (populate))


