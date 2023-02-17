package collection.inheritance;

public class Cinheritance1 {
//	int tot;
	private String addressLine1,city,state,country;  
	  
	public Cinheritance1(String addressLine1, String city, String state, String country) {  
	    super();  
	    this.addressLine1 = addressLine1;  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	}  
	public String toString(){  
	    return addressLine1+" "+city+" "+state+" "+country;  
	}  

}
