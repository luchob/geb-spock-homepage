# geb-spock-homepage

This little project contains some Geb-Spock test cases which verify that my home page hosted at [balev.eu](http://balev.eu) is up and some contents is present on it.

The project is built with Gradle but gradle wrapped is included. If you are interested you may download and try it. 

```
git clone https://github.com/luchob/geb-spock-homepage.git
cd geb-spock-homepage
```

For FF:

```
gradlew firefoxTest
```

For Chrome:

```
gradlew chromeTest
```

For both FF and Chrome:

```
gradlew test
```

PhantomJS is not supported. Selenium 3 is used with Gecko and Chrome drivers. There is support for downloading the drivers.

The eclipse plugin is included and may generate eclipse environment.

```
gradlew eclipse
```
