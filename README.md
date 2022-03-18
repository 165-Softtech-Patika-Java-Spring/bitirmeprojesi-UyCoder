<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://softtech.com.tr">
    <img src="https://softtech.com.tr/wp-content/uploads/2017/12/standart-logo.png" alt="Logo" height="80">
  </a>

<h3 align="center">Softtech Spring Bootcamp Guraduation Project</h3>

  <p align="center">
    <a href="https://www.patika.dev/bootcamp/softtech-java-spring-bootcamp"><strong>More about bootcamp »</strong></a>
    <br />
    <br />
    <a href="https://github.com/165-Softtech-Patika-Java-Spring/bitirmeprojesi-UyCoder/blob/main/BitirmeProjesiTalepleri.md">Project Requirements</a>
    ·
    <a href="https://github.com/165-Softtech-Patika-Java-Spring/bitirmeprojesi-UyCoder/blob/main/BitirmeProjesiHazirlikDokumani.pdf">Project Prapration Doc</a>
    ·
    <a href="https://github.com/othneildrew/Best-README-Template/issues">View Demo</a>
  </p>
</div>



# Table of contents

* [About The Project](#About-The-Graduation-Project)
    + [Project Requirements](#Project-Requirements)
* [Project Prepration Documents](#Project-Prepration-Documents)
* [Project Structure](#Project-Structure)
    + [Diagram](#Diagram)
    + [Demo](#demo)
    + [Swagger Documentation](#Swagger-Documentation)
    + [Technologies](#Technologies)
    + [Dependencies](#Dependencies)
    + [File Structure](#File-Structure)
* [Reference](#Reference)
    + [Articles](#Articles)
    + [Videos](#Videos)
* [Acknowledgments](#Acknowledgments)
    + [Patika](#Patika)
    + [Softtech](#Softtech)
    + [Teacher](#Teacher)
    + [Attendees](#Attendees)
* [License](#license)
* [Contact me](#linkedIn)



## About The Graduation Project
This is a graduation project for Softtech Spring Bootcamp. The Graduation Project was given at the end of the 5th week in this bootcamp. It is a project that'll ensures that the subjects we learned during this bootcamp are reinforced with the technologies used by the sponsor company Softtech. [<img src='https://softtech.com.tr/wp-content/uploads/2017/12/standart-logo.png' alt='softtech' height='20'>](https://softtech.com.tr/) .

### Project Requirements
[The requirements for this project is here in Turkish](https://github.com/165-Softtech-Patika-Java-Spring/bitirmeprojesi-UyCoder/blob/main/BitirmeProjesiTalepleri.md)


### Project Prepration Documents
[The Project Prepration Documents in Turkish](https://github.com/165-Softtech-Patika-Java-Spring/bitirmeprojesi-UyCoder/blob/main/BitirmeProjesiHazirlikDokumani.pdf)

## Project Structure


### Diagram
### Demo
###Swagger Documentation
###Technologies
###Dependencies
I used maven for dependency management framework. Here is how I configured the pom.xml file 
<details>
<summary>Show more</summary>

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>dev.ahmed</groupId>
    <artifactId>ahmed</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>

    </dependencies>

    <build>
        <testResources>
            <testResource>
                <directory>src/test/java</directory>
                <excludes>
                    <exclude>**/*.java</exclude>
                </excludes>
            </testResource>
        </testResources>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.6.0</version>
                <configuration>
                    <encoding>UTF-8</encoding>
                    <source>1.8</source>
                    <target>1.8</target>
                    <compilerArgument>-Werror</compilerArgument>
                </configuration>
            </plugin>
        </plugins>
    </build>

</project>
```
</details>


### File Structure
<details>
<summary>Show more</summary>

```bash
tree /f
Graduation Project
│   .gitignore
│   demo.iml
│   mvnw
│   mvnw.cmd
│   pom.xml
│   postman.json
│   README.md
│
├───.idea
│   │   .gitignore
│   │   .name
│   │   compiler.xml
│   │   encodings.xml
│   │   jarRepositories.xml
│   │   misc.xml
│   │   modules.xml
│   │   workspace.xml
│   │
│   ├───codeStyles
│   │       codeStyleConfig.xml
│   │       Project.xml
│   │
│   └───libraries
│
├───.mvn
│   └───wrapper
│           maven-wrapper.jar
│           maven-wrapper.properties
│           MavenWrapperDownloader.java
│
├───src
│   ├───main
│   │   ├───java
│   │   │   │   Notes-For-Part-6.txt
│   │   │   │   Notes-For_Part-7.txt
│   │   │   │
│   │   │   └───com
│   │   │       └───uycoder
│   │   │           └───demo
│   │   │               │   DemoApplication.java
│   │   │               │
│   │   │               ├───beans
│   │   │               │       Country.java
│   │   │               │
│   │   │               ├───controllers
│   │   │               │       AddResponse.java
│   │   │               │       CountryController.java
│   │   │               │
│   │   │               ├───repository
│   │   │               │       CountryRepository.java
│   │   │               │
│   │   │               └───services
│   │   │                       Capture.PNG
│   │   │                       CountryService.java
│   │   │
│   │   └───resources
│   │           application.properties
│   │           banner.txt
│   │
│   └───test
│       └───java
│           └───com
│               └───uycoder
│                   └───demo
│                           DemoApplicationTests.java
│
└───target
    ├───classes
    │   └───com
    │       └───uycoder
    │           └───demo
    │               │   DemoApplication.class
    │               │
    │               ├───beans
    │               │       Country.class
    │               │
    │               ├───controllers
    │               │       AddResponse.class
    │               │       CountryController.class
    │               │
    │               ├───repository
    │               │       CountryRepository.class
    │               │
    │               └───services
    │                       CountryService.class
    │
    ├───generated-sources
    │   └───annotations
    ├───generated-test-sources
    │   └───test-annotations
    └───test-classes
        └───com
            └───uycoder
                └───demo
                        DemoApplicationTests.class

```

</details>

## Reference

### Articles

### Videos

## Acknowledgments

### To Patika
### To ofttech
### To Teacher
### To Attendees

## Contact me
| me       | me              | me                                                                                   |
| ------------------ | ----------------------- | ---------------------------------------------------------------------------------------------- |
| ***Any***          | **[ahmed]**         | `sample`                                                                |
| *Any*              | [me]           | `I`                                                          |

