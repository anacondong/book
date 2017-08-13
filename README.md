# BOOK 

Using Spring Boot >>> MVC,spring-Data,JPA,ORM
JAVA 8
Database >>> MySql

#### Pre require
Java 8
Maven
MY-SQL database connect with Database name : book

Database Connection :
datasource.url=jdbc:mysql://localhost:3306/book?useUnicode=true&characterEncoding=utf8
username=root
password=
####

#### How to run: 
Download sources “https://github.com/anacondong/book” unzip and run command  “mvn clean” and “mvn install” 
then “cd target” and  
run program micro service as 
“java -jar book--SNAPSHOT.jar”

OR

Just run as "mvn spring-boot:run"

####


Open browser url : http://localhost:8081/book/

*****************************************************
*** Relational 
Book ---> OneToOne -----> BookDetail
Book ---> OneToMany -----> BookCategory
Book ---> ManyToMany -----> Publisher

** Create Table relational
book
book_category
book_detail
book_publisher
publisher
*****************************************************

Thanks and enjoy Coding
