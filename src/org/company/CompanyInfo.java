package org.company;

public class CompanyInfo {
public void companyName() {
System.out.println("Company Name: Greens Technologies");
}
public void companyId() {
System.out.println("Company Id: 123456");
}
public void companyAddress() {
System.out.println("Company Address: Thoraipakkam, Chennai");
}
public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName();
	c.companyId();
	c.companyAddress();
}
}
