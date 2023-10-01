package com.cms.model;

/**
 * @author pavan
 */
public enum ERole {
	
	ROLE_ADMIN,//ADMIN ROLE (ACCESS TO ALL APIS)
	ROLE_TEACHER,//TEACHER ROLE(ACCESS TO VIEW CLASSES, TIME TABLE, VIEW EXAM, VIEW RESULT, VIEW REPORTS)
	ROLE_STUDENT,//STUDENT ROLE(ACCESS TO VIEW ATTANDANCE, TIME TABLE, EXAM, RESULT, REPORT
	ROLE_MODERATOR //MODERATOR ROLE (ACCESS TO ADD MARKS, ATTANDANECE, FEE PAYMENTS, CREATE EXAM, UPLOAD PAPER, START EXAM)

}