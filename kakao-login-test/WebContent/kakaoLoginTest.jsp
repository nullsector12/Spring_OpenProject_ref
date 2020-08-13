<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width" />
    <title>Login Demo - Kakao JavaScript SDK</title>
    <script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <style>

    </style>
</head>

<body>
    <a id="custom-login-btn" href="javascript:loginWithKakao()" style="display: none;">
        <img src="//mud-kage.kakao.com/14/dn/btqbjxsO6vP/KPiGpdnsubSq3a0PHEGUK1/o.jpg" width="300" />
    </a>

    <a href="javascript:infoWithKakao()">view</a>
    <a href="javascript:statusWithKakao()">Status</a>
    <a href="javascript:logoutWithKakao()">logout</a>
    <div id="content">

    </div>
    
    <h1>
        <a href="oauth_kakao2.html">페이지 이동</a>
    </h1>
    <script type='text/javascript'>
        //<![CDATA[
        // 사용할 앱의 JavaScript 키를 설정해 주세요.
        Kakao.init('10ec0c379afe638d7134b389741e27d1');

        function loginWithKakao() {
            // 로그인 창을 띄웁니다.
            Kakao.Auth.login({
                success: function(authObj) {
                    alert(JSON.stringify(authObj));

                    //Kakao.Auth.setAccessToken(authObj.access_token);

                    startWithKakao();


                },
                fail: function(err) {
                    alert(JSON.stringify(err));
                }
            });
        };

        function infoWithKakao() {
            // 로그인 성공시, API를 호출합니다.
            Kakao.API.request({
                url: '/v2/user/me',
                success: function(res) {
                    $('#content').html(JSON.stringify(res));
                    alert(JSON.stringify(res));
                    alert(res.propertise.nickname);
                    alert(res.propertise.profile_image);
                    alert(res.propertise.thumbnail_image);
                    alert(res.kakao_account.email);
                },
                fail: function(error) {
                    alert(JSON.stringify(error));
                }
            });
        };

        function statusWithKakao() {
            Kakao.Auth.getStatusInfo(function(statusObj) {
                alert(JSON.stringify(statusObj));
            });
        };



        function startWithKakao() {
            Kakao.Auth.getStatusInfo(function(statusObj) {
                if (statusObj.status == 'connected') {
                    $('#custom-login-btn').css('display', 'none');
                } else {
                    $('#custom-login-btn').css('display', 'inline');
                }
            });
        };

        function logoutWithKakao() {
            Kakao.Auth.logout(function() {
                alert('로그아웃');
                startWithKakao();
            });
        };
        //]]>
    </script>


    <script>
        $(document).ready(function() {
            startWithKakao();
        });
    </script>







</body>

</html>