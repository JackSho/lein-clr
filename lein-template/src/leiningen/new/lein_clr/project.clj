(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies []
  :warn-on-reflection true
  :min-lein-version "2.0.0"
  :plugins [[lein-clr "0.2.2"]]
  :clr {:cmd-templates  {:clj-exe   [[?PATH "mono"] [CLJCLR17_40 %1]]
                         :clj-dep   [[?PATH "mono"] ["target/clr/lib/Clojure.1.7.0/tools/net40" %1]]
                         :clj-dep2  [[?PATH "mono"] ["target/clr/clj/Release 4.0" %1]]
                         :clj-url   "https://sourceforge.net/projects/clojureclr/files/clojure-clr-1.7.0-Release-4.0.zip/download"
                         :clj-zip   "clojure-clr-1.7.0-Release-4.0.zip"
                         :curl      ["curl" "--insecure" "-f" "-L" "-o" %1 %2]
                         :nuget-ver [[?PATH "mono"] [*PATH "nuget.exe"] "install" %1 "-Version" %2]
                         :nuget-any [[?PATH "mono"] [*PATH "nuget.exe"] "install" %1]
                         :unzip     ["unzip" "-d" %1 %2]
                         :wget      ["wget" "--no-check-certificate" "--no-clobber" "-O" %1 %2]
                         :copy      ["cp" "-r" %1 %2]
                         :rm        ["rm" %1]}
        ;; for automatic download of ClojureCLR,
        ;; 1. make sure you have nuget and/or wget installed and on PATH,
        ;; 2. uncomment deps in :deps-cmds (for your preferred download method), and
        ;; 3. use :clj-dep or :clj-dep2 instead of :clj-exe in :main-cmd and :compile-cmd
        :deps-cmds      [
                         ;; download from nuget
                         ; [:nuget-ver "Clojure" "1.7.0"]
                         ; [:copy "Clojure.1.7.0/lib/*" "Clojure.1.7.0/tools/"]

                         ;; download from sourceforge
                         ; [:wget :clj-zip :clj-url]
                         ; [:unzip "../clj" :clj-zip]
                         ; [:rm :clj-zip]
                         ]
        :main-cmd      [:clj-exe "Clojure.Main.exe"]
        :compile-cmd   [:clj-exe "Clojure.Compile.exe"]})
