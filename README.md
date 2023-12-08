# Netty jSerialComm Transport

This project is a Netty transport plugin for connecting to a serial port using the jSerialComm library.

## Documentation
Unfortunately, there is no dedicated documentation available. 
You can refer to the Netty documentation or look at the JUnit test cases for usage examples.

## Installation
1. 先把本项目打包，安装在本地maven仓库中
    ```
    mvn clean package install
    ```
2. Include these lines in your pom file:
    ```
    <dependency>
        <groupId>se.koc</groupId>
        <artifactId>netty-transport-jserialcomm</artifactId>
        <version>2.0.0</version>
    </dependency>
    ```

## Authors

* **Ziver Koc**

## Related Projects

* [jSerialComm](https://github.com/Fazecast/jSerialComm)
* [Netty](https://github.com/netty/netty)

## License

This project is licensed under the Apache License version 2.0

