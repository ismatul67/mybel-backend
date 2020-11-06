# mybel-backend-java

## Create Database to mysql
```
1. Make sure you have installed mysql
2. Open cmd
3. Insert command : mysql -u db_user -p
4. Change db_user with your database username, then enter, after that input your password
5.  insert command: CREATE DATABASE mybel;
```
## Run backend
```
1. Before you run this program, make sure you have jdk 8 and maven
2. Open this project to document reader that you have
3. Open mybel-backend-java/src/main/java/com/enigma/mybel/constants/Constant.java 
4. Edit FOLDERPATH with your actual path to save image
5. Open mybel-backend-java/src/main/resources/application-local.properties
6. Setting spring.datasource.username base on your mysql database username
7. Setting spring.datasource.password base on your mysql database password
8. Open cmd
8. Insert command mvn clean install
9.Go to \mybel-backend-java\target
10. Insert command java -jar mybel-0.0.1-SNAPSHOT

now backend is running in port 8081

```
### *Optional Step (you can choose step A or B)

## A. Create Category room and type with swagger
```
1. Open browser
2. Go to http://localhost:8081/swagger-ui.html
2. Click category-room-controller then select post
3. Click try it now
4. Remove everything in example value and replace with this:
{
  
  "name": "Living Room"
}
5. click execute
6. repeat step 2 until 4, replace "Living Room" with "Dinning Room", then click execute
7. repeat step 2 until 4, replace "Living Room" with "Bed Room", then click execute
8. repeat step 2 until 4, replace "Living Room" with "Office Room", then click execute
9. click type-controller, and click try it now
10. Remove everything in example value and replace with this:
{
  "name":"sofa",
 
  "roomName": "Living Room"

}
11. click execute
12. replace "sofa" with "chair" in example value, then click execute
13. replace "chair" with "storage" in example value, then click execute
14. replace "storage" with "dinning chair"  and replace "Living Room" with "Dinning Room" in example value, then click execute
15. replace "dinning chair" with "dinning table" in example value, then click execute
16. replace "dinning table" with "dinning cabinet" in example value, then click execute
17. replace "dinning cabinet" with "bed"  and replace "Dinning Room" with "Bed Room" in example value, then click execute
18. replace "bed" with "mattress" in example value, then click execute
19. replace "mattress" with "cabinet" in example value, then click execute
20. replace "cabinet" with "office chair"  and replace "Bed Room" with "Office Room" in example value, then click execute
21. replace "office chair" with "office table" in example value, then click execute
22. replace "office table" with "office cabinet" in example value, then click execute
```

## B. Create Category room and type with cmd
```
1. Open cmd
2. Insert command : mysql -u db_user -p
3. Change db_user with your database username, then enter, after that input your password
4. insert command: use mybel;
5. insert this command:
INSERT INTO `mst_category_room` VALUES ('8a8a8c7a759a900b01759aa7c81f0000','Dining Room'),('8a8a8c7a759a900b01759aa829250001','Bed Room'),('8a8a8c7a759a900b01759aa877110002','Office Room'),('8a8a8cec750c44ed01750c5563d60001','Living Room');
6.  click enter, after that, insert this command:
INSERT INTO `type` VALUES ('8a8a8c7a759ac93001759ac9e9400000','sofa','8a8a8cec750c44ed01750c5563d60001'),('8a8a8c7a759ac93001759accaf890001','chair','8a8a8cec750c44ed01750c5563d60001'),('8a8a8c7a759ac93001759accf9cf0002','storage','8a8a8cec750c44ed01750c5563d60001'),('8a8a8c7a759ac93001759aceca370003','dining chair',NULL),('8a8a8c7a759ac93001759acf14c60004','dining table',NULL),('8a8a8c7a759ac93001759acf4cd20005','dining cabinet',NULL),('8a8a8c7a759ac93001759acfb01a0006','bed','8a8a8c7a759a900b01759aa829250001'),('8a8a8c7a759ac93001759ad024e90007','mattress','8a8a8c7a759a900b01759aa829250001'),('8a8a8c7a759ac93001759ad06b930008','cabinet','8a8a8c7a759a900b01759aa829250001'),('8a8a8c7a759ac93001759ad15c3a0009','office chair','8a8a8c7a759a900b01759aa877110002'),('8a8a8c7a759ac93001759ad1a68c000a','office table','8a8a8c7a759a900b01759aa877110002'),('8a8a8c7a759ac93001759ad1f81b000b','office cabinet','8a8a8c7a759a900b01759aa877110002');
```

You already finish the steps to run backend, now you can run mybel-frontend-web, clone that project in this link https://github.com/ismatul67/mybel-frontendweb-reactjs and read the instruction
