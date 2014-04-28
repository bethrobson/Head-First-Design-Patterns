package headfirst.designpatterns.proxy.javaproxy;

public class PersonBeanImpl implements PersonBean {
	String name;
	String gender;
	String interests;
	int rating;
	int ratingCount = 0;
  
	public String getName() {
		return name;	
	} 
  
	public String getGender() {
		return gender;
	}
  
	public String getInterests() {
		return interests;
	}
   
	public int getHotOrNotRating() {
		if (ratingCount == 0) return 0;
		return (rating/ratingCount);
	}
  
 
	public void setName(String name) {
		this.name = name;
	}
 
	public void setGender(String gender) {
		this.gender = gender;
	} 
  
	public void setInterests(String interests) {
		this.interests = interests;
	} 
  
	public void setHotOrNotRating(int rating) {
		this.rating += rating;	
		ratingCount++;
	}
}
