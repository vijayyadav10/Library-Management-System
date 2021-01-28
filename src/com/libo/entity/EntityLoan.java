package com.libo.entity;

public class EntityLoan {

	private String studentName;
	private String bookName;

	public EntityLoan(String studentName, String bookName) {
		super();
		this.studentName = studentName;
		this.bookName = bookName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "LoanEntity [studentName=" + studentName + ", bookName=" + bookName + "]";
	}

}
