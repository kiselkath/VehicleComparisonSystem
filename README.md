## Vehicle Comparasion System

### Step 1
1. Added structure;
2. Updated pom.xml - fixed dependencies:
><dependencies>
>    <dependency>
>      <groupId>org.junit.jupiter</groupId>
>      <artifactId>junit-jupiter-engine</artifactId>
>      <version>5.9.1</version>
>      <scope>test</scope>
>    </dependency>
>    <dependency>
>      <groupId>org.junit.jupiter</groupId>
>      <artifactId>junit-jupiter</artifactId>
>      <version>RELEASE</version>
>      <scope>test</scope>
>    </dependency>
> </dependencies>
3. Udated .gitignore - make sure its excluded files below:
> .idea, *.iml

### Step 2 - Vehicle.java
1. Created public class
2. Added private final variables name and year
3. Added constructor
4. Implemented Comparable<Vehicle>
5. Added @Override method compareTo() for comparation the values
6. Added @Override method toString() for displaing the results

### Step 3 - VehicleBrandComparator.java
