<h1> when compiling modules to same output target directory </h1>

1. `javac --module-source-path src -d out -m moduleA`
2. `javac --module-source-path src -d out -m moduleB`
3. `java --module-path out --add-modules moduleB pack2.B`


<h2> when compiling modules to different target directory </h1>

1. `javac --module-source-path src -d out1 -m moduleA`
2. `javac --module-source-path src -d out2 -m moduleB`
3. `rm -rf out2/moduleA`
4. `java --upgrade-module-path out1 --module-path out2 --add-modules moduleB pack2.B`

