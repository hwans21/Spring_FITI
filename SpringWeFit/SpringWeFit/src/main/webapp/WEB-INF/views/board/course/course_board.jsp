<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <style>
        
        .footer{
            background-color: red;
            height: 50px;
        }
        .section{
            background-color: yellowgreen;
            height: 500px;

        }
        .sidebar{
            background-color: yellow;
            position: fixed;
            right: 15px ;
            top: 250px;
        }
       
        .container {
          font-family: "NanumGothic";
        }

        #title {
          color: rgb(0, 173, 181);
          font-size: 45px;
          font-weight: bold;
        }

        #all {
          font-weight: bold;
        }

        input {
          padding: 5px;
          border: 1px solid lightgray;
          border-radius: 10px;
          width: 200px;
        }

        .page-link {
          color:rgb(0, 173, 181);
        }
        #btn-list {
          margin-top: 15px;
          margin-bottom: 25px;
        }





        .vid {
            margin: 25px 5px;
            padding: 5px;
            border: 1px solid #ccc;
            /* background: rgb(0, 173, 181); */
            
        }



        .vid .video {
            /* border: 1px solid #fff; */
            background: #fff;
            padding: 10px;
        }


        .subject {
            height: 70px;
            margin: 20px 30px;
        }

        .category {
            display: block;
            text-align: left;
            margin: 5px 0;
            padding: 5px 0;
            border-bottom: 1px solid #ccc; 
            font-size: 13px;
            font-weight: 500;
            color: #5a5a5a;
        }

        .auth {
            text-align: left;
            font-size: 15px;
            padding: 0 13px;
            overflow: hidden;
            margin-top: 30px;
        }

        .auth span {
            float: right;
            font-size: 14px;
            padding-left: 22px;
        }

        .glyphicon-comment {
            color: skyblue;
        }

        .glyphicon-eye-open {
            color: purple;
        }

        .glyphicon b {
            color: #000;
            padding-left: 8px;
        }


      

    </style>
</head>

<body>
    
    <div class="container-fluid h-100">

        <div class="row">
            <%@ include file="../../include/header.jsp" %>
        </div>
        
   
        <!-- <div class="row">
                
            <div class="col-sm-5">
                <span id="title">???????????????</span>
            </div>

            <div class="col-sm-7">
                <div id="btn-list" class="row" align="right">
                    <div class="btn-group text-center" role="group" aria-label="Basic outlined example">
                    <button type="button" class="btn btn-info btn-active" id="all">??????</button>
                    <button type="button" class="btn btn-info">?????????</button>
                    <button type="button" class="btn btn-info">??????/??????</button>
                    <button type="button" class="btn btn-info">??????</button>
                    <button type="button" class="btn btn-info">??????</button>
                    <button type="button" class="btn btn-info">??????</button>&nbsp;&nbsp;&nbsp;
                </div>
                
                <input type="text" placeholder="Search">
                  
                <button type="button" class="btn" aria-label="Left Align">
                    <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
                </button>

                </div>
            </div>
        </div> -->

        <div class="row">
            <div class="col-sm-10">
                <div>
                    <span id="title">?????? ??????</span>
                </div>
            </div>
        </div>           
        <div id="btn-list" class="row" align="right">
            <div class="btn-group text-center " role="group" aria-label="Basic outlined example">
                <button type="button" class="btn btn-info btn-active id="all">??????</button>
                <button type="button" class="btn btn-info">??????</button>
                <button type="button" class="btn btn-info">????????????</button>
                <button type="button" class="btn btn-info">?????????</button>
                <button type="button" class="btn btn-info">?????????</button>
                <button type="button" class="btn btn-info">?????????</button>
                <button type="button" class="btn btn-info">??????</button>
                <button type="button" class="btn btn-info">????????????</button>
                <button type="button" class="btn btn-info">????????????</button>
                <button type="button" class="btn btn-info">??????</button>
                <button type="button" class="btn btn-info">????????????</button>
                <button type="button" class="btn btn-info">??????</button>&nbsp;&nbsp;&nbsp;
            </div>
            
            <input type="text" placeholder="Search">
              
            <button type="button" class="btn" aria-label="Left Align">
                <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
            </button>
        </div>


        <div class="row margin-top-5">
            <!-- <table class="table table-hover table-responsive"> -->
            <table class="table">
                <!-- <thead class="bg-info">
                    <tr>       
                        <th scope="col" class="text-center">??????</th>
                        <th scope="col" class="text-center">?????????</th>
                        <th scope="col" class="text-center">??????</th>                      
                    </tr>
                </thead> -->
                <tbody>
                    <tr class="course">  
                    	<c:forEach var="vo" begin="1" end="3" items="${courseList}">                                   
<%-- 		                	<c:forEach begin="1" end="3"> --%>
		                        <td scope="col" class="text-center">
		                            <div class="vid">                               
		                                <div class="video" onclick="location.href='#'">
		                                    <a href="#"><img src="${pageContext.request.contextPath }/resources/img/course/vid01.jpg" width="280px" alt="vid01"></a>                                 
		                                    <p class="subject"><span class="category">${vo.cbCategory}</span><a href="#">${vo.cbTitle}</a></p>
		                                    <p class="auth">?????????
		                                        <span class="glyphicon glyphicon-comment" aria-hidden="true"><b>2</b></span>
		                                        <span class="glyphicon glyphicon-eye-open" aria-hidden="true"><b>100</b></span>
		                                    </p>
		                                </div>
		                            </div>
		                        </td>
<%-- 	                       </c:forEach> --%>
                        </c:forEach> 
                        
                        <%-- <td scope="col" class="text-center">
                            <div class="vid">                               
                                <div class="video" onclick="location.href='/FRONT/views/board/course/course_detail.html'">
                                    <a href="#"><img src="${pageContext.request.contextPath }/resources/img/course/vid01.jpg" width="280px" alt="vid01"></a>                                 
                                    <p class="subject"><span class="category">????????????</span><a href="#">?????? ?????? ?????? ?????? ?????? ?????? ??????! ??? 5??? ??????!</a></p>
                                    <p class="auth">?????????
                                        <span class="glyphicon glyphicon-comment" aria-hidden="true"><b>2</b></span>
                                        <span class="glyphicon glyphicon-eye-open" aria-hidden="true"><b>100</b></span>
                                    </p>
                                </div>
                            </div>
                        </td>
                        <td scope="col" class="text-center">
                            <div class="vid">
                                <div class="video">
                                    <a href="#"><img src="${pageContext.request.contextPath }/resources/img/course/vid02.jpg" width="280px" alt="vid02"></a>
                                    <p class="subject"><span class="category">????????????</span><a href="#">?????? ????????? ????????? ?????? ???????????? ?????? (feat. 90??? ????????????)</a></p>
                                    <p class="auth">?????????
                                        <span class="glyphicon glyphicon-comment" aria-hidden="true"><b>2</b></span>
                                        <span class="glyphicon glyphicon-eye-open" aria-hidden="true"><b>100</b></span>
                                    </p>
                                </div>
                            </div>   
                        </td>
                        <td scope="col" class="text-center">
                            <div class="vid">
                                <div class="video">
                                    <a href="#"><img src="${pageContext.request.contextPath }/resources/img/course/vid03.jpg" width="280px" alt="vid03"></a>
                                    <p class="subject"><span class="category">????????????</span><a href="#">???50??? ????????? ????????? ??????????????? ???????????? ?????? (No ????????????)</a></p>
                                    <p class="auth">?????????
                                        <span class="glyphicon glyphicon-comment" aria-hidden="true"><b>2</b></span>
                                        <span class="glyphicon glyphicon-eye-open" aria-hidden="true"><b>100</b></span>
                                    </p>
                                </div>
                            </div>   
                        </td>                                         
                    </tr> 

                    <tr>    
                        <td scope="col" class="text-center">
                            <div class="vid">
                                <div class="video">
                                    <a href="#"><img src="${pageContext.request.contextPath }/resources/img/course/vid04.jpg" width="280px" alt="vid04"></a>
                                    <p class="subject"><span class="category">?????????</span><a href="#">[?????????] ?????????????????? ????????? ???????????? ????????? ???????????? ???????????????</a></p>
                                    <p class="auth">?????????
                                        <span class="glyphicon glyphicon-comment" aria-hidden="true"><b>2</b></span>
                                        <span class="glyphicon glyphicon-eye-open" aria-hidden="true"><b>100</b></span>
                                    </p>
                                </div>
                            </div>
                        </td>
                        <td scope="col" class="text-center">
                            <div class="vid">
                                <div class="video">
                                    <a href="#"><img src="${pageContext.request.contextPath }/resources/img/course/vid05.jpg" width="280px" alt="vid05"></a>
                                    <p class="subject"><span class="category">??????</span><a href="#">[????????????]????????? ???????????? ?????? ?????? ?????????!!</a></p>
                                    <p class="auth">?????????
                                        <span class="glyphicon glyphicon-comment" aria-hidden="true"><b>2</b></span>
                                        <span class="glyphicon glyphicon-eye-open" aria-hidden="true"><b>100</b></span>
                                    </p>
                                </div>
                            </div>
                        </td>
                        <td scope="col" class="text-center">
                            <div class="vid">
                                <div class="video">
                                    <a href="#"><img src="${pageContext.request.contextPath }/resources/img/course/vid06.jpg" width="280px" alt="vid06"></a>
                                    <p class="subject"><span class="category">????????????</span><a href="#">[?????????tv ???????????? ??????] ????????? ????????? ??????4??? (????????? ?????? 3????????????)</a></p>
                                    <p class="auth">?????????
                                        <span class="glyphicon glyphicon-comment" aria-hidden="true"><b>2</b></span>
                                        <span class="glyphicon glyphicon-eye-open" aria-hidden="true"><b>100</b></span>
                                    </p>
                                </div>
                            </div>
                        </td>    
                    </tr>
                    
                    <tr>    
                        <td scope="col" class="text-center">
                            <div class="vid">
                                <div class="video">
                                    <a href="#"><img src="${pageContext.request.contextPath }/resources/img/course/vid07.jpg" width="280px" alt="vid07"></a>
                                    <p class="subject"><span class="category">?????????</span><a href="#">????????? ????????????</a></p>
                                    <p class="auth">?????????
                                        <span class="glyphicon glyphicon-comment" aria-hidden="true"><b>2</b></span>
                                        <span class="glyphicon glyphicon-eye-open" aria-hidden="true"><b>100</b></span>
                                    </p>
                                </div>
                            </div>
                        </td>
                        <td scope="col" class="text-center">
                            <div class="vid">
                                <div class="video">
                                    <a href="#"><img src="${pageContext.request.contextPath }/resources/img/course/vid08.jpg" width="280px" alt="vid08"></a>
                                    <p class="subject"><span class="category">??????</span><a href="#">????????????/???????????????/ ???????????? ????????? ??????</a></p>
                                    <p class="auth">?????????
                                        <span class="glyphicon glyphicon-comment" aria-hidden="true"><b>2</b></span>
                                        <span class="glyphicon glyphicon-eye-open" aria-hidden="true"><b>100</b></span>
                                    </p>
                                </div>
                            </div>
                        </td>
                        <td scope="col" class="text-center">
                            <div class="vid">
                                <div class="video">
                                    <a href="#"><img src="${pageContext.request.contextPath }/resources/img/course/vid09.jpg" width="280px" alt="vid09"></a>
                                    <p class="subject"><span class="category">??????</span><a href="#">[[ ????????? ???????????? ]] no.23 ????????? ??????. 1???</a></p>
                                    <p class="auth">?????????
                                        <span class="glyphicon glyphicon-comment" aria-hidden="true"><b>2</b></span>
                                        <span class="glyphicon glyphicon-eye-open" aria-hidden="true"><b>100</b></span>
                                    </p>
                                </div>
                            </div>
                        </td>   --%>    
                   </tr>                                 
                </tbody>
              </table>
        </div>

            <div class="row" align="right">
                <button type="button" class="btn btn-outline-primary" onclick="location.href='<c:url value="/courseBoard/write" />' "><b>?????????</b></button>
            </div>


        <div class="row text-center">
            <nav aria-label="Page navigation example">
                <ul class="pagination">
                    <li class="page-item"><a class="page-link" href="#">Prev</a></li>
                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                    <li class="page-item"><a class="page-link" href="#">4</a></li>
                    <li class="page-item"><a class="page-link" href="#">5</a></li>
                    <li class="page-item"><a class="page-link" href="#">Next</a></li>
                </ul>
                </nav>
        </div> 

        <div class="row">
            <%@ include file="../../include/footer.jsp" %>
        </div>

        
    </div>
    
    <script defer>
 	
    	const msg = '${msg}';
    	if(msg === 'registSuccess') {
    		alert('?????? ?????? ?????????????????????.');
    	}
    	
		$(document).ready(function(){
		      
		      
		      $('.vid').hover(function() {   
		          $(this).css('background-color', 'rgb(0, 173, 181)');
		          
		      });
		
		      $('.vid').mouseleave(function() {   
		          $(this).css('background-color', '#fff');
		          
		      });
		
		
		  });
      
  </script>
</body>
</html>