
# flexmoney intern project(yoga form)

## Deployed Web link:
```bash
  https://master.d379w6x7i1thpz.amplifyapp.com/
```
this project is basically build uopn given problem:

Assume that you are the CTO for the outsourcing firm which has been chosen to build an
admission form for the Yoga Classes which happen every month.
Requirements for the admission form are:
- Only people within the age limit of 18-65 can enroll for the monthly classes and they will
be paying the fees on a month on month basis. I.e. an individual will have to pay the fees
every month and he can pay it any time of the month.
- They can enroll any day but they will have to pay for the entire month. The monthly fee is
500/- Rs INR.
- There are a total of 4 batches a day namely 6-7AM, 7-8AM, 8-9AM and 5-6PM. The
participants can choose any batch in a month and can move to any other batch next
month. I.e. participants can shift from one batch to another in different months but in
same month they need to be in same batch.


## Tech Stack
Client: React,bootstrap

Server: java

Database: MySQL
## Run Locally(Frontend)


Clone the project

```bash
  git clone https://link-to-project
```

Take the folder named flexmoney_intern_project_frontend

Go to the project directory

```bash
  cd flexmoney_intern_project_frontend
```

Install dependencies(execute both commands seperately)

```bash
  npm install react-router-dom
  npm install axios
```

Start the server

```bash
  npm run start
```
Runs the app in the development mode.
Replace the base URL of your locally running backend in axios.jsx. 
Also make sure to start backend and database to run it properly.

## Backend


Install the preRequisites

```bash
  - java JDK 17(https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
  - maven3.8.6(https://maven.apache.org/download.cgi)
```

Take the folder called flexmoney_intern_project.

Clone the project in your Intellij idea

```bash
  Run the project in your intellij ide, for that run the maven build with pom.xml file.

```
Before running the project make sure to add database and it should run in the background.
change the cross origin in yoga_form_backend\src\main\java\com\example\yoga_form_backend\Controller\UserController.java to your locally running frontend url.


## Adding Database

Install the preRequisites

```bash
  - MySQL (https://dev.mysql.com/downloads/mysql/5.5.html?os=3&version=5)
   (also install MySQL Workbench for ease)
```
Add Database
```bash
CREATE DATABASE flexmoney_intern_project_db
```
In backend:

src>main>resources> application properties:
add this lines:

spring.datasource.url=jdbc:mysql://localhost:3306/flexmoney_intern_project_db?useSSL=false
spring.datasource.username=** your username **
spring.datasource.password=** your password **
spring.jpa.hibernate.ddl-auto=update
Access-Control-Allow-Origin:"http://localhost:3000/" (or the url of your locally running frontend)

## ER Diagram

[![ER-Diagram.png](https://i.postimg.cc/Y2x2MtG9/ER-Diagram.png)](https://postimg.cc/23VNxRxR)

## Screenshots


Home page:

[![1.png](https://i.postimg.cc/tTnPhcPG/1.png)](https://postimg.cc/jwKLTZZM)

New user page:

[![Screenshot-2022-12-29-140008.png](https://i.postimg.cc/xCsdsq5Z/Screenshot-2022-12-29-140008.png)](https://postimg.cc/Q9TsC8Rg)

after submitting form(you will be redirected to payment page once you click proceed to pay button):

[![Screenshot-2022-12-29-140036.png](https://i.postimg.cc/L4w9hcbj/Screenshot-2022-12-29-140036.png)](https://postimg.cc/9zP5nnVf)

payment page:

[![4.png](https://i.postimg.cc/zGdR4NF1/4.png)](https://postimg.cc/nXDzQ6Wd)

payment page after paying:

[![5.png](https://i.postimg.cc/LsnZpWxg/5.png)](https://postimg.cc/t1GgdBQ9)

* After clicking on (click here to go to main page) button, you will be redirected to home page.


For exising users(to check payment status and enrollment status):

[![6.png](https://i.postimg.cc/kXm8bfgL/6.png)](https://postimg.cc/14vfx06K)


Payment page (if your enrollment is finished):

[![9.png](https://i.postimg.cc/Gm3yMtYQ/9.png)](https://postimg.cc/0b3jj8VM)


New enrollment page for existing users:

[![10.png](https://i.postimg.cc/k5zRXyH1/10.png)](https://postimg.cc/94PQLyCZ)


after submitting new dates and batch (you will be redirected to payment page once you click proceed to pay button):

[![11.png](https://i.postimg.cc/HxMcJyDp/11.png)](https://postimg.cc/Fd9s81Hq)
