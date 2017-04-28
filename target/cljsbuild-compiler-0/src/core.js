// Compiled by ClojureScript 1.9.521 {}
goog.provide('src.core');
goog.require('cljs.core');
cljs.core.enable_console_print_BANG_.call(null);
src.core.qs = (function src$core$qs(sel){
return document.querySelector(sel);
});
src.core.populate = (function src$core$populate(){
var x = (0);
var html = "";
while(true){
if((x > (1000))){
return html;
} else {
var G__9753 = (x + (1));
var G__9754 = [cljs.core.str.cljs$core$IFn$_invoke$arity$1(html),cljs.core.str.cljs$core$IFn$_invoke$arity$1("<div class='block'></div>")].join('');
x = G__9753;
html = G__9754;
continue;
}
break;
}
});
src.core.containerEl = src.core.qs.call(null,"#container");
src.core.getNewColor = (function src$core$getNewColor(inputColor){
if(cljs.core._EQ_.call(null,inputColor,"white")){
return "#ddd";
} else {
return "white";
}
});
src.core.clickHandler = (function src$core$clickHandler(eObj){
src.core.newColor = src.core.getNewColor.call(null,(eObj.target.style["background"]));

return (eObj.target.style["background"] = src.core.newColor);
});
src.core.containerEl.addEventListener("click",src.core.clickHandler);
(src.core.containerEl["innerHTML"] = src.core.populate.call(null));
