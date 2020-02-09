package Encapsulation;

public class Engineer extends Person{
  
	private int Maths; 
	private int physics;
	private int chemistry;
	public int getMaths() {
		return Maths;
	}
	public void setMaths(int maths) {
		Maths = maths;
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
	@Override
	public String toString() {
		return "Engineer [Maths=" + Maths + ", physics=" + physics + ", chemistry=" + chemistry + ", getMaths()="
				+ getMaths() + ", getPhysics()=" + getPhysics() + ", getChemistry()=" + getChemistry() + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getDob()=" + getDob() +"]";
	}
	
}
