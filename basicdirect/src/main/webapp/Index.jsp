<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%-- <%@ include file="/common/header.jspf" %> --%>
<%
	Date now = new Date();
%>
	<p>현재 날짜 및 시간 정보 : <%= now %></p>