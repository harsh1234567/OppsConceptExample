package Encapsulation;

public class Doctor extends Person{
 
	private int biology;
	private int math;
	public int getBiology() {
		return biology;
	}
	public void setBiology(int biology) {
		this.biology = biology;
	}
	public int getMath() {
		return math;
	}
	@Override
	public String toString() {
		return "Doctor [biology=" + biology + ", math=" + math + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getDob()=" + getDob()  + "]";
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
}
