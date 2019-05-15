package com.librarySys;

import java.io.IOException;
import java.io.PrintWriter;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.librarySys.model.Classification;
import com.librarySys.service.ClassificationService;
import com.librarySys.service.impl.ClassificationServiceImpl;

/**
 * Servlet implementation class ClassificationControllers
 */
@WebServlet("/ClassificationControllers")
public class ClassificationControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassificationControllers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		ClassificationService classificationService = context.getBean("classificationService", ClassificationServiceImpl.class);
		response.setContentType("application/json");
		PrintWriter writer=response.getWriter();
		
		JsonObjectBuilder rootBuilder = Json.createObjectBuilder();
		JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
		JsonObjectBuilder planBuilder = Json.createObjectBuilder();
		
		for(Classification classification : classificationService.fetchClassificationList()) {
			JsonObject planJson = planBuilder.add("classification_id", classification.getClassificationId())
					.add("classification_name", classification.getClassificationName()).build();
			arrayBuilder.add(planJson);
		}
		
		JsonObject root = rootBuilder.add("classifications", arrayBuilder).build();
		System.out.println(root);
		writer.print(root);
		writer.flush();
		writer.close();
		
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String classificationName=request.getParameter("classificationName");
		System.out.println(classificationName);
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		ClassificationService classificationService = context.getBean("classificationService", ClassificationServiceImpl.class);
		Classification classification = new Classification();
		//classification.setClassificationId(1);
		classification.setClassificationName(classificationName);
		
		classificationService.addClassification(classification);
		
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("delete")) {
			String classificationId = request.getParameter("id");
			int clsid = Integer.parseInt(classificationId);
			classificationService.deleteClassification(clsid);
		}
		
		System.out.println(action);
	}

}
