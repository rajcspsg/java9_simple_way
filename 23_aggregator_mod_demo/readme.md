
```
javac --module-source-path src -d out -m moduleA
javac --module-source-path src -d out -m moduleB
javac --module-source-path src -d out -m moduleC
javac --module-source-path src -d out -m aggregatorModule
javac --module-source-path src -d out -m userModule


java --module-path out -m userModule/pack4.Test
```
