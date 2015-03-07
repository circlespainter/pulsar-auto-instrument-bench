(ns cljbench)

(gen-class
  :name cljbench.CljMain
  :methods [^:static [fncall [Object] Object]])

(defn cljfn [x] x)

(defn -fncall [x] (cljfn x))