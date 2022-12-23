package com.hw1.model.vo;

public class Employee { // 필드
	private int empNo; // 사번

	private String empName; // 사원 명
	private String dept; // 소속 부서
	private String job; // 직급
	private int age; // 나이
	private char gender; // 성별
	private int salary; // 급여
	private double bonusPoint; // 보너스 포인터
	private String phone; // 전화번호
	private String address; // 주소

	public Employee() {} // 기본 생성자

	// 매개변수 생성자
	public Employee(int empNo, String empName, int age, char gender, 
		String phone, String address) {

	this.empNo = empNo;
	this.empName = empName;
	this.age = age;
	this.gender = gender;
	this.phone = phone;
	this.address = address;
	}
	
	// 오버로딩
	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
		double bonusPoint, String phone, String address) {
	super();
	this.empNo = empNo;
	this.empName = empName;
	this.dept = dept;
	this.job = job;
	this.age = age;
	this.gender = gender;
	this.salary = salary;
	this.bonusPoint = bonusPoint;
	this.phone = phone;
	this.address = address;
	}
	
	public String information() {
		return " ";
	}


}
