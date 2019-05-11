package com.librarySys.service.impl;

import java.util.List;

import com.librarySys.dao.ClassificationDAO;
import com.librarySys.model.Classification;
import com.librarySys.service.ClassificationService;

public class ClassificationServiceImpl implements ClassificationService {
	
	//dependency injection goes here
	private ClassificationDAO classificationDAO;

	public ClassificationDAO getClassificationDAO() {
		return classificationDAO;
	}

	public void setClassificationDAO(ClassificationDAO classificationDAO) {
		this.classificationDAO = classificationDAO;
	}

	@Override
	public Classification addClassification(Classification classification) {
		// TODO Auto-generated method stub
		return classificationDAO.createClassification(classification);
	}

	@Override
	public Integer deleteClassification(Integer classificationId) {
		// TODO Auto-generated method stub
		return classificationDAO.deleteClassification(classificationId);
	}

	@Override
	public Classification updateClassification(Integer classificationId, Classification classification) {
		// TODO Auto-generated method stub
		return classificationDAO.updateClassification(classificationId, classification);
	}

	@Override
	public Classification fetchClassification(Integer classificationId) {
		// TODO Auto-generated method stub
		return classificationDAO.getClassificationById(classificationId);
	}

	@Override
	public List<Classification> fetchClassificationList() {
		// TODO Auto-generated method stub
		return classificationDAO.getClassificationList();
	}

}
