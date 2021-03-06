<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>   

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book</title>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
    		<div class="col-6">
				<h1>Create Book</h1>
				<form:form action="/create" method="post" modelAttribute="book">
				    <div class="form-group">
				        <form:label path="title">Title</form:label>
				        <form:errors path="title"/>
				        <form:input path="title"/>
				    </div>
				    <div class="form-group">
				        <form:label path="description">Description</form:label>
				        <form:errors path="description"/>
				        <form:input path="description"/>
				    </div>
				    <div class="form-group">
				        <form:label path="language">Language</form:label>
				        <form:errors path="language"/>
				        <form:input path="language"/>
				    </div>
				    <div class="form-group">
				        <form:label path="numberOfPages">Pages</form:label>
				        <form:errors path="numberOfPages"/>     
				        <form:input path="numberOfPages"/>
				    </div>    
				    <form:button type="submit" class="btn btn-lg btn-primary">Submit</form:button>
				</form:form>


</div>
</div>
</div>
</body>
</html>
