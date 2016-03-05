(defproject clj-json "0.5.3"
  :description "Fast JSON encoding and decoding for Clojure via the Jackson library."
  :url "http://github.com/mmcgrana/clj-json"
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :javac-fork "true"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.fasterxml.jackson.core/jackson-core "2.7.2"]])
