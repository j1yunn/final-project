<%@ page
    language="java"
    contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="moum.project.vo.User" %>
    
<!doctype html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>Title</title>
  <link href='/css/common.css' rel='stylesheet'>
</head>
<body>

<header>
  <a href='/'><img src='/images/home.png'></a>
  <nav>
    <ul>
      <li class='btn'><a href='/'>마이홈</a></li>
      <li class='btn'><a href='/'>게시판</a></li>
      <li class='btn'><a href='/'>수집품거래</a></li>
      <li class='btn'><a href='/'>하비위키</a></li>
    </ul>
  </nav>

  <div class='login-state pos-right'>
    <c:if test="${empty loginUser}">
      <button class='btn btn-join'>회원가입</button>
      <button class='btn btn-login' onClick="loginPopup();">로그인</button>
    </c:if>
    <c:if test="${not empty loginUser}">
      <a href='/app/user/view?no=${loginUser.no}' class='btn btn-light'>${loginUser.name}</a>
      <a href='/app/auth/logout' class='btn btn-secondary'>로그아웃</a>
    </c:if>
  </div>

</header>

<div class="overlay">
    <div class="layer login_layer" onClick="closePopup();">
        <img class="x" src="/images/common/x.png" onClick="closePopup();">
        <h2>Login</h2>
        <c:if test="${param.error != null}">
          <p style="color: red;">Invalid username or password.</p>
        </c:if>
        <form action="/app/login" method="post">
          <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
          </div>
          <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
          </div>
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
          <button type="submit">Login</button>
        </form>
    </div>
</div>

<script>
    function loginPopup() {
        document.getElementsByClassName("overlay")[0].style.display = "block";
        document.getElementsByClassName("login_layer")[0].style.display = "block";
    }

    function closePopup() {
        document.getElementsByClassName("overlay")[0].style.display = "none";
        document.getElementsByClassName("login_layer")[0].style.display = "none";
    }
</script>
