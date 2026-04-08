(ns guestbook.core)

(-> (.getElementById js/document "content1")
    (.-innerHTML)
    (set! "Hello, World!"))

