# bootique-logback-demo

Simple [Bootique](http://bootique.io) app demonstrating the Bootique Logback Module.

# Prerequisites
* Java 1.8 or newer.
* Apache Maven.

# Build the demo

```
git clone https://github.com/bootique-examples/bootique-logback-demo.git
cd bootique-logback-demo
mvn package
```

Enter the following (with -m prefix) to launch the app with all commands in Maven:

```bash
java -jar target/bootique-logback-demo-1.0-SNAPSHOT.jar -m --config=classpath:bootique.yml
```

List of the prefixes to lounch different commands:

```
-m - runa main Commnad with all other commands (Debug, Error, Info, Trace, Warn)
-d - run only DebugCommand. You will see logs under the DEBUG level such as: debug, info, warn and error
-e - run only ErrorCommand. You will see logs under the ERROR only error
-i - run only InfoCommand. You will see logs under the INFO level such as: info, warn and error
-t - run only TraceCommand. You will see logs under the TRACE level such as: trace, debyg, info, warn and error
-w - run only WarnCommand. You will see logs under the WARN level such as: iwarn and error
```

After lounch you can see logs in terminal or igit initn logfile: target/logback/demo.log