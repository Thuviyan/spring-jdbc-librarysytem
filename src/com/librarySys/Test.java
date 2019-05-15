package com.librarySys;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.librarySys.model.Classification;
import com.librarySys.service.ClassificationService;
import com.librarySys.service.impl.ClassificationServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		ClassificationService classificationService = ctx.getBean("classificationService", ClassificationServiceImpl.class);
		
		//Classification classification = new Classification();
		//classification.setClassificationName("Maths");
		//classificationService.addClassification(classification);
		
		for(Classification classification: classificationService.fetchClassificationList()) {
			System.out.println(classification.getClassificationId() + " " + classification.getClassificationName());
		}
		
		

	}

}
