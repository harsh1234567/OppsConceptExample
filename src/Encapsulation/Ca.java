package Encapsulation;

public class Ca extends Person{

    private int commerce;
    private int maths;
	
    public int getCommerce() {
		return commerce;
	}
	public void setCommerce(int commerce) {
		this.commerce = commerce;
	}
	@Override
	public String toString() {
		return "Ca [commerce=" + commerce + ", maths=" + maths + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getDob()=" + getDob()  + "]";
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	  
	 	  
}
