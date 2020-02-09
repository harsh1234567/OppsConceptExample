package Encapsulation;

import java.util.Scanner;

public class Test {
	   
  private static Scanner sr=new Scanner(System.in);

//	private static  void  commonField(){
	    
//	}
	public static void main(String[] args) {
       System.out.println("please enter the detail for type of person");
       String personType=(sr.next()).toLowerCase();
       
	
       switch (personType) {
	     case "engineer":
	    	   System.out.println("Engineer");
	           Engineer p =new Engineer();
	    	   int id=sr.nextInt();
	           String name=sr.next();
	           String dob=sr.next();
	           int phy=sr.nextInt();
	           int chem=sr.nextInt();
	           int maths=sr.nextInt();
	           p.setId(id);
	           p.setName(name);
	           p.setDob(dob);
	           p.setPhysics(phy);
	           p.setMaths(maths);
	           p.setChemistry(chem);
	           System.out.println(p);
	           
		      break;
	     case "doctor":

	    	   System.out.println("doctor");
	           Doctor d=new Doctor();
	           id=sr.nextInt();
	           name=sr.next();
	           dob=sr.next();
	           int bio=sr.nextInt();
	           maths=sr.nextInt();
	           d.setId(id);
	           d.setDob(dob);
	           d.setMath(maths);
	           d.setName(name);
	           d.setBiology(bio);
	          
		      break;
	     case "ca":

	    	   System.out.println("ca");
	    	   Ca c=new Ca();
	           id=sr.nextInt();
	           name=sr.next();
	           dob=sr.next();
	           int com=sr.nextInt();
	           maths=sr.nextInt();
	           c.setId(id);
	           c.setDob(dob);
	           c.setMaths(maths);
	           c.setName(name);
	           c.setCommerce(com);;
	         
	    	   
	    	 
		      break; 

	    default:
		   System.out.println("not valid user!!");
	    	break;
	}
	   
    
		  
	}

}
