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
### Swagger Documentation
### Technologies
- Spring
- PostgreSQL
- Hibernate
- Thymeleaf
- HTML
- Bootstrap 
- Docker
- AWS EC2

### Dependencies
I used Maven as a dependency management framework. Here is how I configured the pom.xml file:
<details>
<summary><strong>Show more</strong></summary>

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
<summary><strong>Show more</strong></summary>

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

## Thank you all !!!
### To Patika
Many thanks to the team of <img src='https://user-images.githubusercontent.com/49093196/123759976-178bdc00-d8c9-11eb-84e2-0fd001083756.png' alt='patika' height='20'> who organized this bootcamp. I believe they are now doing very god job for Turkey's technological development. <strong>Thank You for your efforts!</strong>👏🏻
### To Softtech
Special thanks to [<img src='https://softtech.com.tr/wp-content/uploads/2017/12/standart-logo.png' alt='softtech' height='20'>](https://softtech.com.tr/) for sponsorship. I hope you will succeed in your business🎯 to become the biggest IT company in Turkey.
### To Teacher
I would like to express my respect and appreciation to our teacher, <strong>*Sadık Bahadır Memiş*</strong>, who trained us with his valuable experience and help us to learn this wonderful technology Spring. 👏🏻
### To Attendees
Thank you everyone for participating. It was a pleasure to be in the same bootcamp with you. <strong>I wish you success in your life!💪</strong> I hope there will be a chance to continue our career together in the same development team.☕️
## Contact me
I wish we will keep in touch with each other later. 
<br/>
You can find me there: </br>
[<img src='https://www.pngall.com/wp-content/uploads/2016/07/Linkedin-Download-PNG.png' alt='linkedin' height='20'>](https://www.linkedin.com/in/ahmed-bughra/) [<img src='https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/github.svg' alt='github' height='20'>](https://github.com/Uycoder)
[<img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYcIooQ9bkjqGM1p-kwFPb0h4zZEVDzzRS3uhdg1sySKkvvNTE_wm5WTQWK36k7LH744w&usqp=CAU' alt='hackerrank' height='20'>](https://www.hackerrank.com/ahmedbughra)  [<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Stack_Overflow_icon.svg/768px-Stack_Overflow_icon.svg.png' alt='stackoverflow' height='20'>](https://stackoverflow.com/users/16111723/ahmad-ali)
