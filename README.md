# mybel-backend-java

## Create Database to mysql
```
1. Open cmd
2. Insert command : mysql -u db_user -p
3. Change db_user with your database username, then enter, after that input your password
4. CREATE DATABASE myble;
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
10. Insert command java -jar myble-0.0.1-SNAPSHOT

now backend is running in port 8081

```

## Create Category room and type before you create other or run frontend
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


You already finish the steps to run backend, now you can run mybel-frontend-web, clone that project in this link https://github.com/ismatul67/mybel-frontendweb-reactjs and read the instruction
```

