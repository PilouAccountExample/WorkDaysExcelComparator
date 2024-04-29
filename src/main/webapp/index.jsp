<!DOCTYPE html>
<html>
<head>
<title>Comparator Excel</title>
<style>
/* Ajout de styles pour la page */
body {
	font-family: Arial, sans-serif;
	margin: 20px;
}

#output {
	margin-top: 10px;
	padding: 10px;
	border: 1px solid #ccc;
	height: 100px;
	overflow-y: auto;
}
</style>
</head>
<body>
	<form action="excelComparatorServlet" method="post" enctype="multipart/form-data">
		<h1>Traitement Java</h1>

		<!-- Deux champs pour la sélection de fichiers Excel -->
		<div>
			<label for="file1">Sélectionnez le premier fichier Excel :</label> <input
				type="file" id="file1" accept=".xlsx, .xls">
		</div>
		<div>
			<label for="file2">Sélectionnez le deuxième fichier Excel :</label>
			<input type="file" id="file2" accept=".xlsx, .xls">
		</div>

		<!-- Bouton pour lancer le traitement Java -->
		<!-- 		<button id="runJava">Lancer le traitement Java</button> -->
		<input type="submit" value="Envoyer" />

		<!-- Zone d'affichage de la console Java -->
		<div id="output">Console Java :</div>

	</form>
</body>
</html>
