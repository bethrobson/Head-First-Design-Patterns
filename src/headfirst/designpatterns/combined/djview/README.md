# The Servlet code has been removed from 
# Head First Design Patterns 2nd edition
#
# No guarantees that it will work.
#
# 9/15/2020
#
# To run the DJView Servlet on localhost

1. Download Tomcat: http://tomcat.apache.org/index.html
Place the folder (apache-tomcat-VERSION) in a folder somewhere.
The instructions below refer to this folder as the "tomcat" folder.

2. Build the code and note where the binary files are generated (in the 
bin/ directory in your project directory).

3. In Eclipse, add the servlet and jsp jars:
   * lib/servlet-api-3.1.jar
   * lib/jsp/javax.servlet.jsp-2.3.2.jar

4. From tomcat folder, run:
   * bin/startup.sh

5. Navigate to localhost:8080 in your browser; if you see a page, Tomcat is running!

6. Under tomcat/webapps make a new folder, djview/

7. Copy the jsp/index.html file and the jsp/djview.jsp file there.

8. Make a new folder in the tomcat/webapps/djview/ folder named "WEB-INF".

9. Place a copy of the jsp/web.xml file there. This file maps the Servlet class to a URL 
for the form post/get in index.html

10. Create a set of folders that create the path: 
tomcat/webapps/djview/WEB-INF/classes/headfirst/designpatterns/combined/djview/

11. Copy the following classes from headfirst/designpatterns/combined/djview/ to the 
tomcat/webapps/djview/WEB-INF/classes/headfirst/designpatterns/combined/djview/ 
folder:
   * BeatModel.class 
   * BeatModelInterface.class 
   * BeatController.class
   * BeatObserver.class
   * BPMObserver.class
   * ControllerInterface.class
   * DJViewServlet.class 

12. Restart tomcat from the top tomcat folder:
   * bin/shutdown.sh
   * bin/startup.sh

13. Navigate to localhost:8080/djview/djview.jsp


NEW
Don't need tomcat.
Run DJViewHttpServer, this will run the server on port 8080.
CORS disabled so requests can come from different servers.
Client:
run HFDP/dj/dj.html from local web server (port 80 usually).





