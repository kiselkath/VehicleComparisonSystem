# Vehicle Comparison System

## Step 1 — Project Structure and Dependencies

**Purpose:**  
Initialize the project structure and configure all required dependencies to enable unit testing with JUnit 5.

### ✅ Actions Performed

- Created base project structure.
- Added `pom.xml` configuration with the required JUnit 5 dependencies.
- Updated `.gitignore` to exclude IDE and build-specific files.

### 📦 pom.xml Dependencies

```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.9.1</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>RELEASE</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```
### 📄 .gitignore Configuration
```
.idea/
*.iml
```
## Step 2 — Vehicle.java

**Purpose:**  
Define a data model class representing a vehicle, including built-in support for natural sorting by year.

### ✅ Actions Performed

- Created a public class named `Vehicle`.
- Added two private final fields:
    - `String name`
    - `int year`
- Implemented a constructor to initialize both fields.
- Implemented the `Comparable<Vehicle>` interface to allow sorting by year.
- Overrode the `compareTo(Vehicle other)` method to define the sort order:
    - Vehicles are sorted in descending order (newest year first).
- Overrode the `toString()` method for readable object representation in console output and test logs.

## Step 3 — VehicleBrandComparator.java

**Purpose:**  
Provide a custom sorting strategy to order vehicles alphabetically by brand name.

### ✅ Actions Performed

- Declared a new class named `VehicleBrandComparator`.
- Implemented the `Comparator<Vehicle>` interface.
- Overrode the `compare(Vehicle v1, Vehicle v2)` method to:
    - Compare vehicle brand names lexicographically using `String.compareTo()`.
- Enabled alternative sorting logic for use cases where alphabetical brand ordering is required.

## Step 4 — VehicleApp.java

**Purpose:**  
Build a runnable application to demonstrate sorting of vehicles by year and by brand using both natural and custom comparators.

### ✅ Actions Performed

- Declared the `main()` method in the `VehicleApp` class.
- Created a list of `Vehicle` objects within the `main()` method.
- Populated the list using `.add()` with various vehicle instances.
- Used `.sort()` with the natural ordering (`Comparable`) to sort by year:
    - Vehicles appear from newest to oldest.
- Used `.sort()` with `VehicleBrandComparator` to sort by brand:
    - Vehicles appear in alphabetical order by name.
- Printed the sorted lists to verify behavior manually.

## Step 5 - VehicleTest.java

**Purpose:**
Verify the correctness of vehicle sorting logic using unit tests with JUnit 5.

### ✅ Actions Performed

- Created a new class named `VehicleTest` in the same package as your `main` classes (e.g., org.vehicle).

- Added necessary `JUnit 5` imports, including: `@BeforeEach` for setup logic , `@Test` for defining test cases, `@DisplayName` for human-readable test descriptions , static assertions from org.junit.jupiter.api.Assertions

- Defined a list of vehicles as a class-level variable.

- Used the `@BeforeEach` method to populate the list with test data:

  - Add multiple Vehicle instances with varying years and brands.

- Create a test method to validate sorting by year:

  - Used `Collections.sort()` which applies the compareTo() logic.

  - Used `assertEquals()` to verify the expected order (newest to oldest).

- Created a test method to validate sorting by brand:

  - Used `.sort(new VehicleBrandComparator())`

  - Assert that the vehicles are sorted alphabetically by brand.

- Add `@DisplayName` annotations for better test readability in output.


