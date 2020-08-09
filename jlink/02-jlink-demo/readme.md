For compilation

```javac --module-source-path src -d out -m demoModule```

For running with default JRE 

```java --module-path out -m demoModule/packA.Test```

To create custom JRE

1. ```cp $JAVA_HOME/jmods/java.base.jmod out/```
2. ```jlink --module-path out --add-modules demoModule,java.base --output helloworldjre```


To run the custom jre - 

```helloworldjre/bin/java -m demoModule/packA.Test```


