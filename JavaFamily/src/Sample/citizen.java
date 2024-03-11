package Sample;

public class citizen {
	private String name;
	private String aadharNo;
	private String address;
	private long phNo; 
	
public Citizen()
	System.out.println("citizen object");
}
public citizen() {
	System.out.println("citizen object created");
}
public citizen(String name, String aadharNo, String address, long phno) {
	this.name=name;
	this.aadharNo=aadharNo;
	this.phNo=phno;
	
}
public String getName() {
	return name;
}
public void setNAme(String name) {
	this.name=name
}