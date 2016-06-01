(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies []
  :warn-on-reflection true
  :min-lein-version "2.0.0"
  :plugins [[lein-clr "0.2.2"]]
  :clr {:cmd-templates  {:clj-exe   [[?PATH "mono"] [CLJCLR14_40 %1]]
                         :clj-dep   [[?PATH "mono"] ["target/clr/lib/Clojure.1.7.0/tools/net40" %1]]
                         :curl      ["curl" "--insecure" "-f" "-L" "-o" %1 %2]
                         :nuget-ver [[?PATH "mono"] [*PATH "nuget.exe"] "install" %1 "-Version" %2]
                         :nuget-any [[?PATH "mono"] [*PATH "nuget.exe"] "install" %1]
                         :unzip     ["unzip" "-d" %1 %2]
                         :wget      ["wget" "--no-check-certificate" "--no-clobber" "-O" %1 %2]}
        ;; for automatic download of ClojureCLR,
        ;; 1. make sure you have nuget installed and on PATH,
        ;; 2. uncomment deps in :deps-cmds, and
        ;; 3. use :clj-dep instead of :clj-exe in :main-cmd and :compile-cmd
        :deps-cmds      [
                         ; [:nuget-ver "Clojure" "1.7.0"]
                         ; ["cp" "Clojure.1.7.0/lib/net40/*" "Clojure.1.7.0/tools/net40"]
                         ]
        :main-cmd      [:clj-exe "Clojure.Main.exe"]
        :compile-cmd   [:clj-exe "Clojure.Compile.exe"]})
