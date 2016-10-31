<%-- 
    Document   : Home
    Created on : Oct 25, 2015, 12:19:27 AM
    Author     : HeeraSingh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="StyleSheet" type="text/css" href="Style.css">
    
        <title>services</title>
    </head>
    
    <body>
        <div class="main_body">
    <jsp:include page="header.jsp"></jsp:include>
        <h1>WHAT HNT SOLUTION OFFERS</h1>
        <p> HNT Solution is a leading educational services provider in India.
            We provide Solution of Mathematics problem 24X7.
            Our solution is easy to understandable. Since, we provide step to step solution of a problem.
            We also provide content writing in Computer Science & all stream Engineering.
            It specializes in developing mathematics software and programs for various disciplines. 
        </p>
    <div class="home_border">
        <div class="first_part">
            <div class="elementry_two">
                <div  class="font_index">
                Check Your Project status
                </div>
            </div>
        </div>
        <div class="part_one">
            <div class="one">ID</div> 
            <div class="one">Name</div> 
            <div class="one">Date</div> 
            
        </div>
        <div class="part_two">
            <div class="two">
                <input type="text" name="text" value="Book ID">
            </div>
            <div class="two">
                <input type="text" name="text" value="Boook  or Problem Name">
            </div> 
            <div class="two">
                <input type="date" name="text" value="Deadline date">
            </div> 
        </div>
    </div>
        <div class="sub_border">
            <div class="submit">
            <input type="submit" name="submit" value="Check">
            </div>
        </div>
        <div class="bottom_border"></div>
       <jsp:include page="Footer.jsp"></jsp:include> 
    </div>
        
</body>
</html>