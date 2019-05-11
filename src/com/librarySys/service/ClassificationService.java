package com.librarySys.service;

import java.util.List;

import com.librarySys.model.Classification;

public interface ClassificationService {
	
	public abstract Classification addClassification(Classification classification);
	public abstract Integer deleteClassification(Integer classificationId);
	public abstract Classification updateClassification(Integer classificationId, Classification classification);
	public abstract Classification fetchClassification(Integer classificationId);
	public abstract List<Classification> fetchClassificationList();

}
