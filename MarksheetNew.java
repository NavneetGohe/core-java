package practice;

public class MarksheetNew implements Comparable<MarksheetNew>{
	
@Override
	public String toString() {
		return "MarksheetNew [rolln=" + rolln + ", fname=" + fname + ", lname=" + lname + ", phy=" + phy + ", chy="
				+ chy + ", mat=" + mat + "]";
	}
private String rolln = null;
private String fname = null;
private String lname = null;
private int phy = 0;
private int chy = 0;	
private int mat = 0;
public String getRolln() {
	return rolln;
}
public void setRolln(String rolln) {
	this.rolln = rolln;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getPhy() {
	return phy;
}
public void setPhy(int phy) {
	this.phy = phy;
}
public int getChy() {
	return chy;
}
public void setChy(int chy) {
	this.chy = chy;
}
public int getMat() {
	return mat;
}
public void setMat(int mat) {
	this.mat = mat;
}
@Override
public int compareTo(MarksheetNew o) {
	// TODO Auto-generated method stub
	return 0;
}


}
