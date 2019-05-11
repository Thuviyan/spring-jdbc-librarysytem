package com.librarySys.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.librarySys.dao.ClassificationDAO;
import com.librarySys.model.Classification;

public class ClassificationDAOImpl implements ClassificationDAO {
	
	private DataSource datasource;
	

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public Classification createClassification(Classification classification) {
		Connection conn= null;
		PreparedStatement ps= null;
		
		try {
			conn=datasource.getConnection();
			String SQL="INSERT INTO mainclassification(classification_name) VALUES(?)";
			ps=conn.prepareStatement(SQL);
//			Classification classification1=new Classification();
			ps.setString(1,classification.getClassificationName());
			
			int executeUpdate=ps.executeUpdate();
			if(executeUpdate>0) {
				System.out.println("Classification is created");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return null;
	
	}

	

	@Override
	public Integer deleteClassification(Integer classificationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classification updateClassification(Integer classificationId, Classification classification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Classification> getClassificationList() {
		// TODO Auto-generated method stub
		List<Classification> classificationList=new ArrayList<Classification>();
		Connection conn= null;
		PreparedStatement ps= null;
		
		try {
			conn=datasource.getConnection();
			String SQL="SELECT classification_id, classification_name from mainclassification";
			ps=conn.prepareStatement(SQL);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Classification classification = new Classification();
				classification.setClassificationId(rs.getInt("classification_id"));
				classification.setClassificationName(rs.getString("classification_name"));
				classificationList.add(classification);
			}
			if(ps.executeUpdate()>0) {
				System.out.println("Classification is created");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public Classification getClassificationById(Integer classificationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
