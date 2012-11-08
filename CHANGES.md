# Changes and TODO


## TODO

* Dependency support
  * Lein deps on CLOJURE_LOAD_PATH
  * NuGet deps download + autodetect + load
* C# compilation support
  * .NET -- :clr {:cs-compiler "csc"}
  * Mono -- :clr {:cs-compiler "gmcs"}
* CLR re-implementation (of Leiningen features)
  * eval-in-project
  * bultitude(??)
  * enable plugins written in ClojureCLR
* Tasks
  * test (test selector support - doable??)


## 2012-Nov-?? / 0.2.0

* Project config support (`:clr` key in `project.clj`)
  * Support for `:assembly-paths` (transparently calls `assembly-load-from`)
  * [TODO] Dependency support
    * Lein deps on CLOJURE_LOAD_PATH
    * NuGet deps download + autodetect + load
  * fixes for `compile` task


## 2012-Oct-28 / 0.1.0

* Tasks
  * clean
  * compile
  * repl
  * run
  * test (without test-selector support)
* Project config support (`:clr` key in `project.clj`)
  * Configurable Clojure executable names: `:compile-cmd` `:main-cmd`
  * Mono support: `:compile-cmd` and `:main-cmd`
  * External libraries support: `:load-paths`
  * Support for multiple ClojureCLR versions via env-var lookup
