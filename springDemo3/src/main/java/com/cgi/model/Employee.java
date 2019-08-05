package com.cgi.model;

public class Employee {
private int id;
private String name;
private String desig;
private Address address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", desig=" + desig + ", address=" + address + "]";
}
public Employee(int id, String name, String desig, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.desig = desig;
	this.address = address;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
