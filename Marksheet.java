package practice;
public class Marksheet extends Object {

    private String rollNo=null;
    private String name = null;
    private int physics = 0;
    private int chemistry = 0;
	private  int maths = 0;
	public boolean equals(Object o) {
		if (o==null) return false ;
		if ( !(o instanceof Marksheet )) return false;
		Marksheet other = (Marksheet) o ;
		return this.getRollNo().equals(other.getRollNo());
		}
	public int hashCode() {
		return rollNo.hashCode();
	}
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	
	
}
	
	
	
	
	
	










