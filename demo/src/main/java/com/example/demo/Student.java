package com.example.demo;
public class Student {
private String name;
private String lastname;
private int age;
private int number;
private int Secretid;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public int getSecretid() {
	return Secretid;
}
public void setSecretid(int secretid) {
	Secretid = secretid;
}
public Student(String name, String lastname, int age, int number, int secretid) {
	super();
	this.name = name;
	this.lastname = lastname;
	this.age = age;
	this.number = number;
	Secretid = secretid;
}

}