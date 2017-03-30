# Java package reduction

The example demonstrates reduction the size of the distribution for applications in *Java 9*.

## Requirements

* [JDK 9 Early Access](https://jdk9.java.net/download/)
* [Apache Maven 3.3.9+](https://maven.apache.org/download.cgi)
* [Inno Setup 5.5.9+](http://www.jrsoftware.org/isinfo.php)

## Compilation and package creation

For *Windows* and *macOS*:

    mvn clean package -P native-deploy
    
For *Linux*:

    mvn clean package -P native-deploy,tar-gz
    
## Location of package files

`<module name>/target/deploy/native/<file name>.exe` (*Windows*)

`<module name>/target/deploy/native/<file name>.dmg` (*macOS*)

`<module name>/target/<file name>.tar.gz` (*Linux*)
