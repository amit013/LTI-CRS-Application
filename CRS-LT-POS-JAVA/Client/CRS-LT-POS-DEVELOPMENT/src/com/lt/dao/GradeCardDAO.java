package com.lt.dao;

import java.util.ArrayList;
import java.util.List;

import com.lt.bean.GradeCard;
import com.lt.constants.Grade;

public class GradeCardDAO {

	List<GradeCard> gradeCard = new ArrayList<GradeCard>();

	Grade grade;


	public List<GradeCard> getGradeCard() {
		gradeCard.add( new GradeCard(1, "101", grade.A ));
		gradeCard.add( new GradeCard(2, "102", grade.B));
		gradeCard.add( new GradeCard(3, "103", grade.C));
		gradeCard.add( new GradeCard(4, "104", grade.D));
		gradeCard.add( new GradeCard(5, "105", grade.F));

		return gradeCard;
	}
}
