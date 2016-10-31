<%-- 
    Document   : MathSolution
    Created on : Oct 26, 2015, 7:53:58 PM
    Author     : HeeraSingh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="StyleSheet" type="text/css" href="Style.css">
        <title>Math Solution</title>
    </head>
    <jsp:include page="header.jsp"></jsp:include>
    <body>
        <h1>Book Solution & for Content Writing.</h1>
        <div class="Math_solution_home_border">
        <div class="first_part">
            <div class="elementry_two">
                <div  class="font_index">
                Provide Your Contact Detail
                </div>
            </div>
        </div>
        <div class="Math_solution_part_one">
            <div class="one">Name</div>
            <div class="one">Address 1</div>
            <div class="one">Address 2</div>
            <div class="one">Contact Number</div>
            <div class="one">Company Name</div>
            <div class="one">Date</div> 
            
        </div>
        <div class="Math_solution_part_two">
            <div class="two">
                <input type="text" name="text" placeholder="Name">
            </div>
            <div class="two">
                <input type="text" name="text" placeholder="Correspondence Address">
            </div>
            <div class="two">
                <input type="text" name="text" placeholder="Permanent Address">
            </div>
            <div class="two">
                <input type="text" name="text" placeholder="Mobile Number">
            </div>
            <div class="two">
                <input type="text" name="text" placeholder="Company Name">
            </div>
            <div class="two">
                <input type="date" name="text" placeholder="Deadline date">
            </div> 
        </div>
    </div>
        <div class="sub_border">
            <div class="submit">
            <input type="submit" name="submit" value="Check">
            </div>
        </div>
    </body>
    
    <jsp:include page="Footer.jsp"></jsp:include>
</html>
