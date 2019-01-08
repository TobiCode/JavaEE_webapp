# JavaEE_webapp

##Explanation of the project
This is a simple webapplication on a Tomcat Server with Java Servlets, Java Server Pages (JSP) and a MySql Database. <br>


This code is for a revision of simple Java EE concepts according to the tutorial of Jon Bertelsen. 
(https://www.youtube.com/channel/UCyQXWm-Y8X4887c604FTPsA/videos)

##Security Outlook & Improovements to this project

If you want to deploy the web-server, then you would need to create the WAR file and upload it to a webserver. <br>
You would also need to make: <br>
- the Code SQL-Injection safe <br>
- use Encryption for sensible data <br>
- remoove the hardcoded DB-username and DB-userpassword -> work with Environment Variables or VM-options on your web server <br>
