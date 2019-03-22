<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="scheresteinpapier.Spieler" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style.css" rel="stylesheet">
<title>Schere Stein Papier</title>
</head>
<body>
<%Spieler spieler = new Spieler(); %>
<%if(Spieler.getAnzSpieler() == 2){ %>
	<form class="form" method="post" action="SchereSteinPapierGame.jsp">
			<h1>Schere Stein Papier</h1>
			<p>
				<button class="button">GO</button>
			<p>
		</form>
		
	<%} else{%>
		<form class="form" method="post">
			<h1>Schere Stein Papier</h1>
			<p>
				Warten auf andere Spieler...
			<p>
	
				
		</form>
	<%} %>
	<p>
	<img src="scheresteinpapier.png" width="500px" height="auto" >
</body>
</html>
