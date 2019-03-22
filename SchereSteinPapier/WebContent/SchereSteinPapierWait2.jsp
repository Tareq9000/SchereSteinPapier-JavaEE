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
	<%
	Spieler spieler = new Spieler(); 
	int zahl = Spieler.getAmzug() / 2;
	
	%>
	<%if(zahl + zahl == Spieler.getAmzug()) { %>
		<form class="form" method="post" action="SchereSteinPapierGame.jsp">
				<h1>Schere Stein Papier</h1>
				<p>
					<%if(request.getParameter("gewonnen1") == "true") {%>
						Spieler1 hat gewonnen.
					<%} %>
					<%if(request.getParameter("gewonnen2") == "true") {%>
						Spieler2 hat gewonnen.
					<%} %>
				<p>
					<button class="button">GO</button>
				<p>
			</form>
			
		<%} else{%>
			<form class="form" method="post">
				<h1>Schere Stein Papier</h1>
				<p>
					Warten, bis der andere Spieler seinen Zug gemacht hat...
				<p>
		
		</form>
		<%} %>
		
		<%if(Spieler.getAmzug() == 3) { %>
		<form class="form" method="post">
				<h1>Schere Stein Papier</h1>
				<p>
					<%if(request.getParameter("gewonnen1") == "true") {%>
						Spieler1 hat gewonnen.
					<%} %>
					<%if(request.getParameter("gewonnen2") == "true") {%>
						Spieler2 hat gewonnen.
					<%} %>
				<p>
					<button class="button">GO</button>
				<p>
			</form>
		<%} %>
	<p>
	<img src="scheresteinpapier.png" width="500px" height="auto" >
</body>
</html>
