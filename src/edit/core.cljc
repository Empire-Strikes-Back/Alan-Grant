(ns edit.core
  (:require
   [clojure.string]
   [clojure.pprint :refer [pprint]]
   #?(:cljs [cljs.reader :refer [read-string]])
   #?(:cljs [goog.string.format])
   #?(:cljs [goog.string :refer [format]])
   [clojure.spec.alpha :as s]

   [clojure.tools.reader.reader-types :as r]

   [edit.spec :as edit.spec]
   [edit.string :as edit.string])
  #?(:cljs
     (:import [goog.string StringBuffer])))


(defn read-ns-symbol
  "Reads the namespace name (ns foo.bar ,,,) from a string.
   String after ns form can be invalid. 
   File may start with comments, drop-reads one form at a time until finds ns"
  [string]
  (let []))


