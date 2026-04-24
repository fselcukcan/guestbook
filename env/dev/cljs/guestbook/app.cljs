(ns guestbook.app
  (:require
   ;[devtools.core :as devtools]
   [guestbook.core :as core]))

(enable-console-print!)

(println "loading env/dev/cljs/guestbook/app.cljs...")

; (devtools/install!)

; now compiling with cljsbuild, this cannot be called maybe this file is not included in the coımpiltaion, though it is listed in source-paths in dev profile. For now I will call this in where it si defined
(core/init!)

