<%-- 
    Document   : numberSystem
    Created on : Dec 15, 2015, 9:32:12 PM
    Author     : HeeraSingh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Number system</title>
        <link rel="StyleSheet" type="text/css" href="Style.css">
         <script src='http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML' type='text/javascript'>
</script>
    </head>
    <body>
       
        <div class="main_body">
         <jsp:include page="header.jsp"></jsp:include>
        <div class="question">
            <div class="formula">To remind</div>
        </div>
            <div class="container">
            <jsp:include page="Maths_menu.jsp"></jsp:include>
            
                    <div class="content">
                        <div class="big_space">
                            
                            <!--<div class="long_box">
                                <div class="short_box">1.</div>
                                <div class="short_box">2.</div>
                                <div class="short_box">3.</div>
                                <div class="short_box">4.</div>
                                <div class="short_box">5.</div>
                                <div class="short_box">6.</div>
                                <div class="short_box">7.</div>
                                <div class="short_box">8.</div>
                                <div class="short_box">9.</div>
                                <div class="short_box">10.</div>
                                <div class="short_box">11.</div>
                            </div>-->
                            
                            <div class="double_box">
                                <div class="double_field" >
                                    <div dir="ltr" style="text-align: left;" trbidi="on">
                                        \({\left( {a + b} \right)^2} = {a^2} + {b^2} + 2ab\)
                                    </div>
                                </div>
                                <div class="double_field" > 
                                    <div dir="ltr" style="text-align: left;" trbidi="on">
                                        \({\left( {a - b} \right)^2} = {a^2} + {b^2} - 2ab\)
                                    </div>
                                </div>
                                <div class="double_field" > 
                                    <div dir="ltr" style="text-align: left;" trbidi="on">
                                       \({\left( {a + b} \right)^3} = {a^3} + {b^3} + 3{a^2}b + 3a{b^2}\)
                                    </div>
                                </div>
                                
                                <div class="double_field" > 
                                    <div dir="ltr" style="text-align: left;" trbidi="on">
                                    \({\left( {a - b} \right)^3} = {a^3} - {b^3} - 3{a^2}b + 3a{b^2}\)
                                    </div>
                                </div>
                                
                                <div class="double_field" > 
                                    <div dir="ltr" style="text-align: left;" trbidi="on">
                                   \(\left( {a - b} \right)\left( {a + b} \right) = {a^2} - {b^2}\)
                                    </div>
                                </div>
                                
                                <div class="double_field" > 
                                    <div dir="ltr" style="text-align: left;" trbidi="on">
                                    \({\left( {a + b} \right)^2} + {\left( {a - b} \right)^2} = 2\left( {{a^2} + {b^2}} \right)\)
                                    </div>
                                </div>
                                
                                <div class="double_field" > 
                                    <div dir="ltr" style="text-align: left;" trbidi="on">
                                    \({\left( {a + b} \right)^2} - {\left( {a - b} \right)^2} = 4ab\)
                                    </div>
                                </div>
                                <div class="double_field" > 
                                    <div dir="ltr" style="text-align: left;" trbidi="on">
                                    \(\frac{{{a^3} + {b^3} + {c^3} - 3abc}}{{{a^2} + {b^2} + {c^2} - ab - bc - ca}} = \left( {a + b + c} \right)\)
                                    </div>
                                </div>
                                <div class="double_field" > 
                                    <div dir="ltr" style="text-align: left;" trbidi="on">
                                    \({a^3} + {b^3} = \left( {a + b} \right)\left( {{a^2} - ab + {b^2}} \right)\)
                                    </div>
                                </div>
                                <div class="double_field" > 
                                    <div dir="ltr" style="text-align: left;" trbidi="on">
                                    \({a^3} - {b^3} = \left( {a - b} \right)\left( {{a^2} + ab + {b^2}} \right)\)
                                    </div>
                                </div>
                                <div class="double_field_one" > 
                                    <div dir="ltr" style="text-align: left;" trbidi="on">
                                    \(\begin{array}{c}{a^4} - {b^4} = {\left( {{a^2}} \right)^2} - {\left( {{b^2}} \right)^2}\\ = \left( {{a^2} + {b^2}} \right)\left( {{a^2} - {b^2}} \right)\\ = \left( {{a^2} + {b^2}} \right)\left( {a + b} \right)\left( {a - b} \right)\end{array}\)
                                    </div>
                                </div>
                            </div>  
                        
            </div>
        </div>
    </div>
            <div class="bottom_border"></div>
            <jsp:include page="Footer.jsp"></jsp:include>
</div>
             
 
            
</body>
</html>
