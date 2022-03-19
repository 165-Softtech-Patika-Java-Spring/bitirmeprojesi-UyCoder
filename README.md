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
![projectStrcuture](https://user-images.githubusercontent.com/50663127/159141313-288e892f-14ac-4b64-ab2e-5816c0006e0c.PNG)

### Diagram
![DatabaseAndColumns](https://user-images.githubusercontent.com/50663127/159141315-c19151ea-1980-4701-bfd4-03bb8249ea58.PNG)

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
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.6.4</version>
    <relativePath/> <!-- lookup parent from repository -->
  </parent>
  <groupId>dev.ahmed</groupId>
  <artifactId>graduationproject</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <name>graduationproject</name>
  <description>graduationproject</description>
  <properties>
    <java.version>17</java.version>
    <org.mapstruct.version>1.4.2.Final</org.mapstruct.version>
  </properties>
  <dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-hateoas</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-devtools</artifactId>
      <scope>runtime</scope>
      <optional>true</optional>
    </dependency>

    <dependency>
      <groupId>org.postgresql</groupId>
      <artifactId>postgresql</artifactId>
      <scope>runtime</scope>
    </dependency>

    <dependency>
      <groupId>org.mapstruct</groupId>
      <artifactId>mapstruct</artifactId>
      <version>${org.mapstruct.version}</version>
    </dependency>
    <dependency>
      <groupId>org.mapstruct</groupId>
      <artifactId>mapstruct-processor</artifactId>
      <version>${org.mapstruct.version}</version>
    </dependency>

    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <optional>true</optional>
    </dependency>

    <dependency>
      <groupId>org.springdoc</groupId>
      <artifactId>springdoc-openapi-ui</artifactId>
      <version>1.5.13</version>
    </dependency>

    <dependency>
      <groupId>org.thymeleaf</groupId>
      <artifactId>thymeleaf-spring5</artifactId>
    </dependency>
    <dependency>
      <groupId>org.webjars</groupId>
      <artifactId>bootstrap</artifactId>
      <version>4.3.1</version>
    </dependency>
    <dependency>
      <groupId>org.webjars</groupId>
      <artifactId>webjars-locator-core</artifactId>
    </dependency>

    <!--        <dependency>-->
    <!--            <groupId>org.springframework.boot</groupId>-->
    <!--            <artifactId>spring-boot-starter-security</artifactId>-->
    <!--        </dependency>-->
    <!--        <dependency>-->
    <!--            <groupId>io.jsonwebtoken</groupId>-->
    <!--            <artifactId>jjwt</artifactId>-->
    <!--            <version>0.9.1</version>-->
    <!--        </dependency>-->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <configuration>
          <excludes>
            <exclude>
              <groupId>org.projectlombok</groupId>
              <artifactId>lombok</artifactId>
            </exclude>
          </excludes>
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
│  BitirmeProjesiHazirlikDokumani.pdf
│  BitirmeProjesiTalepleri.md
│  README.md
│
├─.idea
│  │  .gitignore
│  │
│  ├─dataSources
│  │  │  13f2fc53-6397-4739-984e-1c4b103ec0e3.xml
│  │  │
│  │  └─13f2fc53-6397-4739-984e-1c4b103ec0e3
│  │      └─storage_v2
│  │          └─_src_
│  │              └─database
│  │                  │  finalproject.4xihCA.meta
│  │                  │
│  │                  └─finalproject.4xihCA
│  │                      └─schema
│  │                              information_schema.FNRwLQ.meta
│  │                              pg_catalog.0S1ZNQ.meta
│  │                              public.abK9xQ.meta
│  │
│  └─libraries
│
└─graduationproject
    │  .gitignore
    │  graduationproject.iml
    │  HELP.md
    │  mvnw
    │  mvnw.cmd
    │  pom.xml
    │
    ├─.mvn
    │  └─wrapper
    │          maven-wrapper.jar
    │          maven-wrapper.properties
    │
    ├─src
    │  ├─main
    │  │  ├─java
    │  │  │  └─dev
    │  │  │      └─ahmed
    │  │  │          └─graduationproject
    │  │  │              │  GraduationprojectApplication.java
    │  │  │              │
    │  │  │              ├─app
    │  │  │              │  ├─config
    │  │  │              │  ├─controller
    │  │  │              │  │      CategoryController.java
    │  │  │              │  │      ProductController.java
    │  │  │              │  │      UserController.java
    │  │  │              │  │
    │  │  │              │  ├─converter
    │  │  │              │  │      UserMapper.java
    │  │  │              │  │
    │  │  │              │  ├─dao
    │  │  │              │  │      CategoryDao.java
    │  │  │              │  │      ProductDao.java
    │  │  │              │  │      UserDao.java
    │  │  │              │  │
    │  │  │              │  ├─dto
    │  │  │              │  │      CategoryDto.java
    │  │  │              │  │      CategoryUpdateKdvDto.java
    │  │  │              │  │      ProductDto.java
    │  │  │              │  │      ProductSaveRequestDto.java
    │  │  │              │  │      ProductUpdatePriceDto.java
    │  │  │              │  │      UserDto.java
    │  │  │              │  │      UserResponseDto.java
    │  │  │              │  │      UserSaveRequestDto.java
    │  │  │              │  │      UserUpdateRequestDto.java
    │  │  │              │  │
    │  │  │              │  ├─entity
    │  │  │              │  │      Category.java
    │  │  │              │  │      Product.java
    │  │  │              │  │      User.java
    │  │  │              │  │
    │  │  │              │  ├─enums
    │  │  │              │  ├─exception
    │  │  │              │  │      CategoryAlreadyExistsException.java
    │  │  │              │  │      CategoryNotFoundException.java
    │  │  │              │  │      ProductAlreadyExistsException.java
    │  │  │              │  │      ProductNotFoundException.java
    │  │  │              │  │      UserAlreadyExistsException.java
    │  │  │              │  │      UserNotFoundException.java
    │  │  │              │  │
    │  │  │              │  ├─service
    │  │  │              │  │  │  Service.java
    │  │  │              │  │  │
    │  │  │              │  │  └─entityservice
    │  │  │              │  │          CategoryEntityService.java
    │  │  │              │  │          ProductEntityService.java
    │  │  │              │  │          UserEntityService.java
    │  │  │              │  │
    │  │  │              │  └─util
    │  │  │              └─gen
    │  │  │                  ├─dto
    │  │  │                  │      RestResponse.java
    │  │  │                  │
    │  │  │                  ├─entity
    │  │  │                  │      BaseAdditionalFields.java
    │  │  │                  │      BaseEntity.java
    │  │  │                  │      BaseModel.java
    │  │  │                  │
    │  │  │                  ├─enums
    │  │  │                  │      BaseErrorMessage.java
    │  │  │                  │      GenErrorMessage.java
    │  │  │                  │      GenStatusType.java
    │  │  │                  │
    │  │  │                  ├─exception
    │  │  │                  │      GenCustomizedResponseEntityExceptionHandler.java
    │  │  │                  │      GenExceptionResponse.java
    │  │  │                  │
    │  │  │                  ├─exceptions
    │  │  │                  │      GenBusinessException.java
    │  │  │                  │      ItemNotFoundException.java
    │  │  │                  │
    │  │  │                  ├─service
    │  │  │                  │      BaseEntityService.java
    │  │  │                  │
    │  │  │                  └─util
    │  │  │                          DateUtil.java
    │  │  │
    │  │  └─resources
    │  │      │  application.properties
    │  │      │  banner.txt
    │  │      │
    │  │      ├─static
    │  │      │  │  index.html
    │  │      │  │  style2.css
    │  │      │  │
    │  │      │  ├─homepage
    │  │      │  │      homepage.html
    │  │      │  │
    │  │      │  └─register
    │  │      │          register.html
    │  │      │          style3.css
    │  │      │
    │  │      └─templates
    │  └─test
    │      └─java
    │          └─dev
    │              └─ahmed
    │                  └─graduationproject
    │                          GraduationprojectApplicationTests.java
    │
    └─target
        ├─classes
        │  │  application.properties
        │  │  banner.txt
        │  │
        │  ├─dev
        │  │  └─ahmed
        │  │      └─graduationproject
        │  │          │  GraduationprojectApplication.class
        │  │          │
        │  │          ├─app
        │  │          │  ├─controller
        │  │          │  │      CategoryController.class
        │  │          │  │      ProductController.class
        │  │          │  │      UserController.class
        │  │          │  │
        │  │          │  ├─converter
        │  │          │  │      UserMapper.class
        │  │          │  │      UserMapperImpl.class
        │  │          │  │
        │  │          │  ├─dao
        │  │          │  │      CategoryDao.class
        │  │          │  │      ProductDao.class
        │  │          │  │      UserDao.class
        │  │          │  │
        │  │          │  ├─dto
        │  │          │  │      CategoryDto.class
        │  │          │  │      CategoryUpdateKdvDto.class
        │  │          │  │      ProductDto.class
        │  │          │  │      ProductSaveRequestDto.class
        │  │          │  │      ProductUpdatePriceDto.class
        │  │          │  │      UserDto.class
        │  │          │  │      UserResponseDto.class
        │  │          │  │      UserSaveRequestDto.class
        │  │          │  │      UserUpdateRequestDto.class
        │  │          │  │
        │  │          │  ├─entity
        │  │          │  │      Category.class
        │  │          │  │      Product.class
        │  │          │  │      User.class
        │  │          │  │
        │  │          │  ├─exception
        │  │          │  │      CategoryAlreadyExistsException.class
        │  │          │  │      CategoryNotFoundException.class
        │  │          │  │      ProductAlreadyExistsException.class
        │  │          │  │      ProductNotFoundException.class
        │  │          │  │      UserAlreadyExistsException.class
        │  │          │  │      UserNotFoundException.class
        │  │          │  │
        │  │          │  └─service
        │  │          │      │  Service.class
        │  │          │      │
        │  │          │      └─entityservice
        │  │          │              CategoryEntityService.class
        │  │          │              ProductEntityService.class
        │  │          │              UserEntityService.class
        │  │          │
        │  │          ├─converter
        │  │          │      UserMapperImpl.class
        │  │          │
        │  │          └─gen
        │  │              ├─dto
        │  │              │      RestResponse.class
        │  │              │
        │  │              ├─entity
        │  │              │      BaseAdditionalFields.class
        │  │              │      BaseEntity.class
        │  │              │      BaseModel.class
        │  │              │
        │  │              ├─enums
        │  │              │      BaseErrorMessage.class
        │  │              │      GenErrorMessage.class
        │  │              │      GenStatusType.class
        │  │              │
        │  │              ├─exception
        │  │              │      GenCustomizedResponseEntityExceptionHandler.class
        │  │              │      GenExceptionResponse.class
        │  │              │
        │  │              ├─exceptions
        │  │              │      GenBusinessException.class
        │  │              │      ItemNotFoundException.class
        │  │              │
        │  │              ├─service
        │  │              │      BaseEntityService.class
        │  │              │
        │  │              └─util
        │  │                      DateUtil.class
        │  │
        │  └─static
        │      │  index.html
        │      │  style2.css
        │      │
        │      ├─homepage
        │      │      homepage.html
        │      │
        │      └─register
        │              register.html
        │              style3.css
        │
        ├─generated-sources
        │  └─annotations
        │      └─dev
        │          └─ahmed
        │              └─graduationproject
        │                  └─app
        │                      └─converter
        │                              UserMapperImpl.java
        │
        ├─generated-test-sources
        │  └─test-annotations
        └─test-classes
            └─dev
                └─ahmed
                    └─graduationproject
                            GraduationprojectApplicationTests.class

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
