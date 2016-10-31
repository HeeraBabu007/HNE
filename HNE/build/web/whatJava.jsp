<%-- 
    Document   : whatJava
    Created on : Dec 15, 2015, 10:02:24 PM
    Author     : HeeraSingh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>What is java</title>
<link rel="StyleSheet" type="text/css" href="Style.css">
</head>
<body>      
    <div class="main_body_two">
    <jsp:include page="header.jsp"></jsp:include>
    <div class="container">
    <jsp:include page="CoreJava_menu.jsp"></jsp:include>                     
    <div class="parts">
        <div class="whole">
            <div class="button_border">
                <div class="menu_one">About Java</div>
            </div>
                       
            <div class="part_first">
                <div class="material_one"> 
                    <p>We use Java mostly for Roboust technology.
                    we will go through from different kinds of basic questions,
                    like about Java ,why we use Java,where we use Java ,types of applications created in Java.</p>
                </div>
            </div>              
            <div class="part_second">
                <div class="material_one">
                    <ul>
                    <li>Applications of Java?</li>
                    <li>What is Java?</li>
                    <li>Where Java is used?</li>
                    <li> Why Java?</li>
                    </ul>
                </div>
            </div>
        </div>
                             
        <div class="whole">
            <div class="button_border">
                <div class="menu_one">What is Java?</div>
            </div>
            <div class="part_p1"> 
                <div class="material_one"> 
                    <p>Java is related to Object Oriented Language(oops).<br><br>
                       It is a high level ,Secured Programming language.<br>
                       It is also a plateform that can run on any Hardware or software environment.
                       well Java has its own run time environment i.e JRE and API i.e application programming interface.</p>
                </div>
            </div>
        </div>
                             
        <div class="whole">
            <div class="button_border">
                <div class="menu_one">Example</div>
            </div>
            <div class="part_p1">
                <div class="part_p2">
                    <div class="material_one">
                        <span>class</span>
                        <span>first{
                        </span>
                        <span>public static void  main(string args[]){</span>
                         System.out.println("hello java");<br>
                         }
                        }
                    </div>
                </div>
                <div class="next"><input type="submit" name="next" value="Run"></div>
            </div>
        </div>
                             
        <div class="whole">
            <div class="button_border">
                <div class="menu_one">Where Java is use?</div>
            </div>
            <div class="part_p1">
                <div class="material_one">
                    <ul>
                    <li>Games</li>
                    <li>Smart card</li>
                    <li>In Embedded System</li>                                        
                    <li>Robotic</li>
                    <li>In Mobile</li>
                    <li>In Media Player etc.</li>
                    </ul>
                </div>
            </div>
        </div>
                             
        <div class="whole">
            <div class="button_border">
                <div class="menu_one">Applications of Java</div>
            </div>
            <div class="material_one">
                <div class="button_border">There are 4 different Types of Java applications</div>
            </div>
            <div class="menu">Web Application</div>
            <div class="material_one">  
                <p>It is used for create the Dynamic pages it is run on server side.In Java these pages
                   are being created in jsp,struts,servlet and jsf etc.</p>
            </div>
        </div>
                
        <div class="whole">
            <div class="button_border">
                <div class="menu">Standalone Application</div>
            </div>
            <div class="material_one">
                <p>It is system-based application or desktop application.Such as
                   Antivirus, PDF reader, Word reader and system softwares.It provides
                   real time and off line, user custom installation and creation.</p>
            </div>     
        </div>
                             
        <div class="whole">
            <div class="button_border">
                <div class="menu">Mobile Application</div>
            </div>
            <div class="material_one">
                <p>It is very popular application these days and having wide range of applications
                   in daily use of mobiles.Such as for smart phones and mobile devices uses Android
                   which is based on totally Java.
                </p>
            </div>     
        </div>
                             
        <div class="whole">
            <div class="button_border">
                <div class="menu">Enterprise Application</div>
            </div>
            <div class="material_one">
                <p>It is enterprise edition based on EJB(enterprise Java Beans).
                   This is used for distributed system where high level security is required, such as
                   banking system and next generation transaction system(railways registration system and online transaction system).
                </p>
            </div>     
        </div>
        <div class="button_border">
            <a class="next" href="">Next-></a>
            <a class="next" href="">Prev</a>
        </div>
    </div>
</div>
    
    <div class="bottom_border"></div>
    <jsp:include page="Footer.jsp"></jsp:include>
</div> 
</body>
</html>
