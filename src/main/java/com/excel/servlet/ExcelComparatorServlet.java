package com.excel.servlet;

import java.io.IOException;
import java.io.InputStream;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;


@MultipartConfig(
	    fileSizeThreshold = 1024 * 1024, // Taille limite pour écrire le fichier sur le disque
	    maxFileSize = 1024 * 1024 * 5,   // Taille maximale d'un fichier (5 MB)
	    maxRequestSize = 1024 * 1024 * 10 // Taille maximale de la requête (10 MB)
	)
public class ExcelComparatorServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	@Override	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in ExcelComparatorServlet");

		// Récupérer les fichiers envoyés par le formulaire
		Part file1Part = request.getPart("file1");
		Part file2Part = request.getPart("file2");

		if(file1Part != null) {
			System.out.println("fichier 1 OK");
		}
		if(file2Part != null) {
			System.out.println("fichier 2 OK");
		}

		// Vous pouvez obtenir les flux d'entrée des fichiers pour les traiter
		InputStream file1InputStream = file1Part.getInputStream();
		InputStream file2InputStream = file2Part.getInputStream();

		// Configurer la réponse
		//        response.setContentType("text/html");
		//        PrintWriter out = response.getWriter();
		//
		//        // Générer la réponse
		//        out.println("<html>");
		//        out.println("<head><title>Hello World</title></head>");
		//        out.println("<body>");
		//        out.println("<h1>Hello, World!</h1>");
		//        out.println("</body>");
		//        out.println("</html>");
		//
		//        // Fermer l'output stream
		//        out.close();
	}
}
