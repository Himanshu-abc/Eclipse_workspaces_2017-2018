package com.xyz;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		
		ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
		List<FileItem> multiFiles;
		try {
			multiFiles = sf.parseRequest(request);
		
		for(FileItem item:multiFiles) 
		{
			item.write(new File("C:\\Users\\Dell\\web_practise\\FileUploadDemo"+item.getName()));
		}
		out.println("successfully uploaded");
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
