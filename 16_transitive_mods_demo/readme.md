<h1> when compiling modules to same output target directory </h1>

1. `javac --module-source-path src -d out -m moduleA,moduleB,moduleC`
2. `java --module-path out -m moduleC/pack3.C`

