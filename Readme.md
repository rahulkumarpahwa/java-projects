## COMMAND TO CREATE JAVA PACKAGES :

```bash
javac -d . *.java
```

### Explanation:
- `-d` represents the destination.
- `.` represents the current destination.
- `*.java` takes all the files in the current repository and combines them in the folder having `.class` files. The folder name in which all the `.class` files are created is the one mentioned at the top of each `.java` file, as:

```java
package CWH.OOPS._6_Packages;
```

- This will create a folder structure: `CWH > OOPS > _6_Packages > all the .class files`.

### Subfolder Creation:
You can also create subfolders by writing the inner package name with a `.` as:

```java
package Package.Inner;
```

- This will create an inner folder inside which the `.class` file/files will be stored.

---

## USAGE:

1. Just create the Java file, and then to import, you can write:

```java
import CWH.OOPS._6_Packages.Package;
```
or
```java
import CWH.OOPS._6_Packages.*;
```

2. Now, you can use the `Package` class in your code as:

```java
Package p = new Package();
```

3. If you have defined a set of methods within the `Package` class, you can use them too.