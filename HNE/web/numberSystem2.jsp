<%-- 
    Document   : numberSystem2
    Created on : Dec 15, 2015, 9:45:11 PM
    Author     : HeeraSingh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Number system page 1</title>
        <link rel="StyleSheet" type="text/css" href="Style.css">  
    </head>
    
<body>
    <div class="main_body">
        
        <jsp:include page="header.jsp"></jsp:include>
      <!--  <div class="question">
            <div class="formula">Remindable</div>
        </div>-->
        <div class="container">
           
            <jsp:include page="Maths_menu.jsp"></jsp:include>
            <div class="double_big_space">
                <div class="menu_one">
                    <div class="hnt">
                        Types of Number System
                    </div>
                </div>
                
            <div class="whole">
                <div class="button_border">
                    <div class="menu">Even Numbers</div>
                </div>
                <div class="part_p1">
                    <div class="material_one">
                        <p>Those numbers which are exactly divisible by 2 are known as Even numbers.
                        <br>
                        e.g 2,4,6,8,10, ....,16,..... etc..
                        </p>
                    </div>
                </div>
            </div>
b                                     
            <div class="whole">
                <div class="button_border">
                    <div class="menu">Odd Numbers</div>
                </div>
                <div class="part_p1">
                    <div class="material_one">
                        <p>All those numbers which are not exactly divisible by<br>
                            2 are called Odd numbers.
                            e.g 1, 3 ,5 ,7,9 etc.
                        </p>
                    </div>
                </div>
            </div>

            <div class="whole">
                <div class="button_border">
                    <div class="menu">Prime Numbers</div>
                </div>
                <div class="part_p1">
                    <div class="material_one">
                        <p>Those numbers which are divisible by 1 and itself but not divisible<br>
                            by any other numbers are called Prime numbers.<br>
                            like 2,3,5,7etc.<br>
                            Where 2 is the only Even number which is also a prime number<br>
                            All rest are odd prime numbers.
                        </p>
                    </div>
                 </div>
            </div>

            <div class="whole">
                <div class="button_border">
                    <div class="menu">Composite Numbers</div>
                </div>
                <div class="material_one">
                    <p> Natural numbers which is greater than 1 are not prime numbers are called comosite
                        numbers.<br>
                        e.g 4,6,9,15 ect.
                    </p>
                </div>
            </div>

            <div class="whole">
                <div class="button_border">
                    <div class="menu">Co prime Number</div>
                </div>
                <div class="material_one">
                    <p>Two numbers which have only 1 as the common factor are called<br>
                       coprime numbers or relatively prime to each other numbers.<br>
                       e.g (3,7) (8,9)(36,25).
                       Here 8 and 9 are not prime numbers but it have one common factor i.e 1.<br>
                       so,they are coprime numbers.
                    </p>
                </div>
            </div>
            <div class="button_border">
                <a class="next" href="numberSysThree.html">Next-></a>
                <a class="next" href="numberSysOne.html">Prev </a>
            </div>
        </div>
    </div>
</div>
            <div class="bottom_border"></div>
            <jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>
