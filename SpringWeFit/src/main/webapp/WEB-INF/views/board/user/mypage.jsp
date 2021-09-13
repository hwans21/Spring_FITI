<%@ page languages="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/FRONT/resource/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

    <script src="/FRONT/resource/js/bootstrap.js"></script>
    <style>
        
        .subtitle{
            text-align: center;
            background-color: rgba(0, 173, 181, 1);
        }
        table{
            box-shadow: 5px 5px 5px 5px gray;
            border-radius: 15px;
        }
        .table tbody tr th{
            text-align: center;
            border-top: 0px;
        }
        .section{
            height: 900px;
            overflow: auto;
        }
        .sidebar{
            height: 900px;
        }
    </style>
</head>
<body>
    <!-- ë§ì´íì´ì§ - íìì ë³´ ë³ê²½ìì ë¹ë°ë²í¸ ë³ê²½ê°ë¥íê²ë -->
    <!-- 
        ë¤ì´ê°ì¼í  ê²ìë¬¼ ì¹êµ¬x 
        íê°ë¥¼ íë ì¥ìê²ìë¬¼ ëª©ë¡
        ëê¸ì ì´ ì´ëê°ì ê²ìë¬¼ ëª©ë¡
        ë³¸ì¸ì´ ì¼ë ìë¨ ê²ìë¬¼ ëª©ë¡
        ê³µì§ì¬í­
        ë³¸ì¸ì´ ì´ ìì ê²ìë¬¼ ëª©ë¡
        ë³¸ì¸ì´ ì´ ì§ë¬¸ ê²ìì°½ ëª©ë¡
        íìì ë³´ ë³ê²½ íì´ì§ - ëª¨ë¬ì°½
    -->

    <div class="container-fluid h-100">
        <div class="row">
            <div class="header"></div>
        </div>
        <div class="row">
            
            <div class="section col-xs-10">
                <div class="row">
                    <div class="col-sm-10">
                        <b>ëë¤ì</b>ë íìí©ëë¤ 
            
                    </div>
                    <div class="col-sm-2">
                        <button type="button" class="btn btn-info" data-toggle="modal" data-target="#modal-infochange">íìì ë³´ë³ê²½</button>
            
                    </div>
            
                </div>
                <br>
                
                
                <!--  -->
                <div class="row">
                    <div class="col-sm-6">
                        <div>
                            
                            <table class="table">
                                <th class="title-primary" colspan="2">
                                    ê³µì§ì¬í­
                                </th>
                                <tr>
                                    <td class="col-sm-9" onclick="location.href='/FRONT/views/board/notice/notice_detail.html'">3ë²ì§¸ ê³µì§ì¬í­ìëë¤.</td>
                                    <td class="col-sm-3">21.08.31</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">2ë²ì§¸ ê³µì§ì¬í­ìëë¤.</td>
                                    <td class="col-sm-3">21.08.20</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">1ë²ì§¸ ê³µì§ì¬í­ìëë¤.</td>
                                    <td class="col-sm-3">21.07.10</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">ìëíì¸ì ë°ê°ìµëë¤.</td>
                                    <td class="col-sm-3">21.06.20</td>
                                </tr>
                            </table>
                        </div>
            
                    </div>
                    <div class="col-sm-6">
                        <div>
                            
                            <table class="table">
                                <th class="title-primary" colspan="3">
                                    ë¤ëê°ë ì¥ì
                                </th>
                                <tr onclick="location.href='/FRONT/views/board/location/loc_detail.html'">
                                    <td class="col-sm-1">â4.5</td>
                                    <td class="col-sm-9">3ê°ì ìì 20kgê°ë!!</td>
                                    <td class="col-sm-2">21.08.31</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-1">â3.0</td>
                                    <td class="col-sm-8">ì´ìì¤ì¸ì âíí¸ëì¤</td>
                                    <td class="col-sm-3">21.08.20</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-1">â5.0</td>
                                    <td class="col-sm-8">ì¥ì2ìëë¤.</td>
                                    <td class="col-sm-3">21.07.10</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-1">â4.5</td>
                                    <td class="col-sm-8">ì¥ì1</td>
                                    <td class="col-sm-3">21.06.20</td>
                                </tr>
                    
                            </table>
                        </div>
            
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div>
                            
                            <table class="table">
                                <th class="title-primary">
                                    ë´ê° ë³¸ ê°ì
                                </th>
                                <tr>
                                    <td class="col-sm-9" onclick="location.href='/FRONT/views/board/course/course_detail.html'">3ê°ì ìì 20kgê°ë!!</td>
                                    <td class="col-sm-3">21.08.31</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">ì´ìì¤ì¸ì âíí¸ëì¤</td>
                                    <td class="col-sm-3">21.08.20</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">ì¥ì2ìëë¤.</td>
                                    <td class="col-sm-3">21.07.10</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">ì¥ì1</td>
                                    <td class="col-sm-3">21.06.20</td>
                                </tr>
                            </table>
                        </div>
            
                    </div>
                    <div class="col-sm-6">
                        <div>
                          
                            <table class="table">
                                <th class="title-primary">
                                    ë´ê° ë¨¹ìë ìë¨
                                </th>
                                <tr>
                                    <td class="col-sm-9" onclick="location.href='/FRONT/views/board/diet/diet_detail.html'">3ê°ì ìì 20kgê°ë!!</td>
                                    <td class="col-sm-3">21.08.31</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">ì´ìì¤ì¸ì âíí¸ëì¤</td>
                                    <td class="col-sm-3">21.08.20</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">ì¥ì2ìëë¤.</td>
                                    <td class="col-sm-3">21.07.10</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">ì¥ì1</td>
                                    <td class="col-sm-3">21.06.20</td>
                                </tr>
                    
                            </table>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
            
                        <div>
                            
                            <table class="table">
                                <th class="title-primary">
                                    ìì  ê²ìí
                                </th>
                                <tr>
                                    <td class="col-sm-9" onclick="location.href='/FRONT/views/board/free/free_detail.html'">ê¸¸ê°ë¤ê° ê³ ìì´ ë´</td>
                                    <td class="col-sm-3">21.08.31</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">ì¬ë¬ë¶ë í  ì ìë¤!</td>
                                    <td class="col-sm-3">21.08.20</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">ì¥ì2ìëë¤.</td>
                                    <td class="col-sm-3">21.07.10</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">ì¥ì1</td>
                                    <td class="col-sm-3">21.06.20</td>
                                </tr>
                            </table>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div>
                            
                            <table class="table">
                                <th class="title-primary">
                                    ë´ê° í ì§ë¬¸ë¤
                                </th>
                                <tr>
                                    <td class="col-sm-9" onclick="location.href='/FRONT/views/board/qna/qna_detail.html'">3ê°ì ìì 20kgê°ë!???</td>
                                    <td class="col-sm-3">21.08.31</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">ì ì´ì´ ìë¹ ì§ê¹ì?</td>
                                    <td class="col-sm-3">21.08.20</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">ì¬ì´í¸ ì´ì©ë°©ë²ì´....</td>
                                    <td class="col-sm-3">21.07.10</td>
                                </tr>
                                <tr>
                                    <td class="col-sm-9">ì¥ì1</td>
                                    <td class="col-sm-3">21.06.20</td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            
            
            <div class="sidebar col-xs-2"></div>
            
        </div>
        <div class="row">
            <div class="footer"></div>
        </div>
    </div>
    
    <script defer>
        $(document).ready(function(){
            $('.header').load("/FRONT/views/include/header.html");
            $('.footer').load("/FRONT/views/include/footer.html");
            $('.sidebar').load("/FRONT/views/include/side_bar.html");
        });
        
    </script>


    
    
    
   
    <!-- Modal íìì ë³´ë³ê²½ ëª¨ë¬ì°½ -->
    <div id="modal-infochange" class="modal fade">
        <div class="modal-dialog">

            <!-- Modal Content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">íìì ë³´ë³ê²½</h4>
                </div>
                <div class="modal-body">
                    <form action="" method="post" id="form-join" class="form-horizontal">
                        <!-- <table>
                            <tr>
                                <td>ì´ë©ì¼</td>
                                <td>
                                    <input type="text" name="" id="" size="15"> @
                                    <input type="text" name="" id="" size="15">
                                    <select name="" id="">
                                        <option value="naver.com" selected>naver.com</option>
                                        <option value="daum.net">daum.net</option>
                                        <option value="nate.com">nate.com</option>
                                        <option value="google.com">google.com</option>
                                        <option value="">ê¸°í</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>ëë¤ì</td>
                                <td>
                                    <input type="text" name="" id="" size="15">
                                </td>
                            </tr>
                            <tr>
                                <td>ë¹ë°ë²í¸</td>
                                <td>
                                    <input type="password" name="" id="">
                                </td>
                            </tr>
                            <tr>
                                <td>ë¹ë°ë²í¸íì¸</td>
                                <td>
                                    <input type="password" name="" id="">
                                </td>
                            </tr>
                            <tr>
                                <td>í¸ëí°(-ì ì¸)</td>
                                <td>
                                    <input type="text" name="" id="">
                                </td>
                            </tr>
                        </table> -->
                        <div class="form-group">
                            <label for="input-email" class="col-sm-3 control-label">ì´ë©ì¼</label>
                            <div class="col-sm-9">
                                <input type="email" class="form-control" id="input-email" readonly value="test@test.com">
                            </div>
                            
                        </div>
                        <div class="form-group">
                            <label for="input-nick" class="col-sm-3 control-label">ëë¤ì</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="input-nick" placeholder="ëë¤ìì ìë ¥í´ì£¼ì¸ì">
                            </div>
                            
                        </div>
                        <div class="form-group">
                            <label for="input-password" class="col-sm-3 control-label">ë¹ë°ë²í¸</label>
                            <div class="col-sm-9">
                                <input type="password" class="form-control" id="input-password" placeholder="ë¹ë°ë²í¸ë¥¼ ìë ¥í´ì£¼ì¸ì">
                            </div>
                            
                        </div>
                        <div class="form-group">
                            <label for="input-passwordchk" class="col-sm-3 control-label">ë¹ë°ë²í¸íì¸</label>
                            <div class="col-sm-9">
                                <input type="password" class="form-control" id="input-passwordchk" placeholder="ë¹ë°ë²í¸ë¥¼ íì¸í´ì£¼ì¸ì">
                            </div>
                            
                        </div>

                        <div class="form-group">
                            <label for="input-phone" class="col-sm-3 control-label">í¸ëí° ë²í¸</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="input-passwordchk" placeholder="'-'ë¹¼ê³  ìë ¥í´ì£¼ì¸ì">
                            </div>
                            
                        </div>

                        
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" data-dismiss="modal" id="btn-infochange">ì ë³´ë³ê²½</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">ì·¨ì</button>
                </div>


            </div>
        </div>
    </div>
   

    
    <script>
        $('#btn-infochange').click(function(){
            if(confirm('íìì ë³´ë¥¼ ì ë§ë¡ ìì íìê² ìµëê¹?') === true){
                alert('íìì ë³´ë¥¼ ìì íìµëë¤.')
            }

        });
        
    </script>
</body>
</html>