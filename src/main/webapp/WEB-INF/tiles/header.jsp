<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<header>
    <div class="row" style="justify-content: flex-end; margin:20px 25px 0 0; height: 50%">
        <button type="button" class="btn btn-primary" style="background-color: #be79df">로그인</button>
        <button type="button" id="logoutbtn" class="btn btn-dark" style="background-color:#be79df">로그아웃</button>
        <button type="button" class="btn btn-primary" style="background-color: #be79df">회원가입</button>
        <button type="button"  class="btn btn-dark" style="background-color:  #be79df">내정보</button>
    </div>
    <div class="headerTop">
        <div class="headerLeft">
            <a href="/"><img src="/img/Thothlogo.png" ></a>
        </div>

        <div class="headerRight">
            <ul class="headerNav">
                <li class="nav-item"><a href="/product/plist" class="nav-link">도서</a></li>
                <li class="nav-item"><a href="/notice/ntlist" class="nav-link">공지사항</a></li>
                <li class="nav-item"><a href="#" class="nav-link">Q&A</a></li>
                <li class="nav-item"><a href="#" class="nav-link">이벤트</a></li>
            </ul>
        </div>

    </div>
</header>
<!-- nav Area -->