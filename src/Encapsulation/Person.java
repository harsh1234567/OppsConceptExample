package Encapsulation;
//POJO class
public class Person {
    private int id;
    private String name;
    private String dob;
    
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	} 
    @Override
	public String toString() {
		return "EncaExample [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	  
}
