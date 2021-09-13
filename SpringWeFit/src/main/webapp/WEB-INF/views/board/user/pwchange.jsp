<%@ page languages="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>pwchange</title>
    <!--reset.css (css 초기화)-->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css">
    
    <link rel="stylesheet" href="/FRONT/resource/css/bootstrap.css">
    <link rel="stylesheet" href="/FRONT/resource/css/bootstrap-theme.css">
    
    <style>

        .row h2 {
            text-align: center;
            color: rgb(0, 173, 181);
            font-size: 35px;
            font-weight: bold;
        }
        .empty-space{
            height:100px;
        }

        .passwordForm{
            margin-top: 100px;
            margin-bottom: 100px;
        }
  
    </style>
</head>

<body>
    <div class="container-fluid h-100">
        <div class="row">
            <div class="header"></div>
        </div>
        
        <div class="container passwordForm">
        
            <div class="row">
                <h2>비밀번호 변경</h2>
            </div>
            <div class="empty-space"></div>
            
            <form class="form-horizontal">
        
                <div class="form-group">
                  <label for="input-password" class="col-sm-2 control-label">비밀번호</label>
                  <div class="col-sm-10">
                    <input type="password" class="form-control" id="input-password" placeholder="비밀번호">
                  </div>
                </div>
                <div class="form-group">
                  <label for="input-password-check" class="col-sm-2 control-label">비밀번호확인</label>
                  <div class="col-sm-10">
                    <input type="password" class="form-control" id="input-password-check" placeholder="비밀번호확인">
                  </div>
                </div>
                <div class="empty-space"></div>
                <div class="row">
                    <div class="col-sm-offset-6 col-sm-2">
                        <button type="submit" class="btn btn-primary">변경하기</button>
                    </div>
                    <div class="col-sm-2">
                        <button type="button" class="btn btn-defalut">취소하기</button>
                    </div>       
                </div>
            </form>
        
        </div>
        
        <div class="row">
            <div class="footer"></div>
        </div>
        <!-- <div class="sidebar"></div>   -->
    </div>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>    
    <script src="/FRONT/resource/js/bootstrap.js"></script>
    <script src="/FRONT/resource/js/bootstrap.min.js"></script>

    <script defer>
        $(document).ready(function(){
            $('.header').load("/FRONT/views/include/header.html");
            $('.footer').load("/FRONT/views/include/footer.html");
            // $('.sidebar').load("/FRONT/views/include/side_bar.html");
        });
    </script>
</body>
</html>