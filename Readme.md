# Playground

## Setup

* Install clj tool
* Run `clj`

## Starting nrepl

```clojure
user=> (require '[snow.repl :as r])
nil
user=> (r/start-nrepl)
```

nrepl server will be started at port 9001 by default.
You can change it by specifying `:repl-port` in profiles.edn.