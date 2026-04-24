(ns guestbook.app
  (:require
   ;[devtools.core :as devtools]
   [guestbook.core :as core]))

(enable-console-print!)

(println "loading env/dev/cljs/guestbook/app.cljs...")

; (devtools/install!)

; now compiling with cljsbuild, this cannot be called maybe this file is not included in the coımpiltaion, though it is listed in source-paths in dev profile. For now I will call this in where it si defined
<<<<<<< HEAD
(core/init!)

=======
; (core/init!)
>>>>>>> c019be7 (after reverting to cljsbuild from shadow-cljs, things work. Though included the refactor section with init and mount-components I have drawn in the book in the shadow-cljs section. Though called init not in nev/dev/cljs/gb/app.cljs but just where it is defined as it did not work. Will continue without js thingies like shadow-cljs or reframe-10x, all went down as usual as js enters the scene.)
