<%@ page
    language="java"
    contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"/>

<main>
    <aside class="sidemenu clearfix">
        <ul>
            <li>레고</li>
            <li>프라모델</li>
            <li>신발</li>
        </ul>
    </aside>
    <div class="myhome-collections clearfix">
        <c:if test="${empty collectionList}">
            
        </c:if>
        <c:if test="${not empty collectionList}">
            <c:forEach var="collection" items="${collectionList}">
                <div class="collection-box clearfix">
                    <c:if test="${not empty collection.attachedFiles}">
                        <img class="collection-image" src="${collection.attachedFiles.get(0).filepath}">
                    </c:if>
                    <c:if test="${empty collection.attachedFiles}">
                        <img class="collection-image" src="/images/common/empty-frame.png">
                    </c:if>
                    <div class="collection-title">${collection.name}</div>
                </div>
            </c:forEach>
        </c:if>
    </div>
</main>

<jsp:include page="footer.jsp"/>