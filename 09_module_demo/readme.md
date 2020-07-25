
<h1> To compile the module </h1>

`javac --module-source-path src -d out -m moduleA`

<h1>To execute the module</h1>

`java --module-path out -m moduleA/pack1.Test`

<h1> Notes: </h1>

    1. Modules mandatorily need module-info.java
    2. package declaration is mandatory.
    3. A warning will be reported by compiler if module names end with number.
    
    
 <h1> Various ways to compile modules </h1> 
 
     1. compile whole module `javac --module-source-path src -d out -m moduleA`
     2. compile whole module `javac --module-source-path src -d out --module moduleA`
     3.  compile file by file  `javac --module-source-path src -d out src/moduleA/module-info.java src/moduleA/pack1/Test.java`
     4. compile file by file  `javac --module-source-path src -d out /home/raj/Coding/Java/java9_simple_way/src/moduleA/module-info.java /home/raj/Coding/Java/java9_simple_way/src/moduleA/pack1/Test.java`
      
  <h1> Various ways to compile modules </h1> 

    1. `java --module-path out -m moduleA/pack1.Test`
    2. `java --module-path out --module moduleA/pack1.Test`
    3. `java --module-path out --add-modules moduleA pack1.Test`
    
    
