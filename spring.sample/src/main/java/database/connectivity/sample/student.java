package database.connectivity.sample;

public class student {
int stdid;
String name;
int phno;
String email;
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	this.stdid = stdid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPhno() {
	return phno;
}
public void setPhno(int phno) {
	this.phno = phno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public student(int stdid, String name, int phno, String email) {
	super();
	this.stdid = stdid;
	this.name = name;
	this.phno = phno;
	this.email = email;
}

}
