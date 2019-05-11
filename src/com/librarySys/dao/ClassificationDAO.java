package com.librarySys.dao;

import java.util.List;

import com.librarySys.model.Classification;

public interface ClassificationDAO {
	
	public abstract Classification createClassification(Classification classification);
	public abstract Classification getClassificationById(Integer classificationId);
	public abstract Integer deleteClassification(Integer classificationId);
	public abstract Classification updateClassification(Integer classificationId, Classification classification);
	public abstract List<Classification> getClassificationList();
	

}
