# BOOK 

Using Spring Boot >>> MVC,spring-Data,JPA,ORM
JAVA 8
Database >>> MySql

#### Pre require <br/>
Java 8<br/>
Maven<br/>
MY-SQL database connect with Database name : book<br/>

Database Connection :
datasource.url=jdbc:mysql://localhost:3306/book?useUnicode=true&characterEncoding=utf8
username=root
password=
####

#### How to run: 
Download sources “https://github.com/anacondong/book” unzip and 
run command  “mvn <br/>
clean” and “mvn install” <br/>
then “cd target” and  <br/>
run program micro service as <br/>
“java -jar book--SNAPSHOT.jar”<br/>

OR

Just run as "mvn spring-boot:run"<br/>

####


Open browser url : http://localhost:8081/book/

*****************************************************
*** Relational <br/>
Book ---> OneToOne -----> BookDetail<br/>
Book ---> OneToMany -----> BookCategory<br/>
Book ---> ManyToMany -----> Publisher<br/>

** Create Table relational<br/>
book<br/>
book_category<br/>
book_detail<br/>
book_publisher<br/>
publisher<br/>
*****************************************************

Thanks and enjoy Coding
