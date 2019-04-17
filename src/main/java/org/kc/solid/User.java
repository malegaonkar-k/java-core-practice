package org.kc.solid;

import java.util.Comparator;

//single responsiblity principle
// what is responsiblity of your class/component/microserves
public class User implements Comparable<User>{
//	public class User{
	private int userId;
	private String username;
	private String city;

	User() {

	}

	User(int userId, String username) {
		this.userId = userId;
		this.username = username;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/*
	 * The contract between equals() and hashCode() is: 1) If two objects are
	 * equal, then they must have the same hash code. 2) If two objects have the
	 * same hash code, they may or may not be equal.
	 */

	// override user equals ie. when userid and username is same then only two
	// object will be same
	// if we are using User as parameter then it is overloading of equal method
	// ie. public boolean equals(User obj) this is overlaoding not overriding to
	// avoid this always use @override annotation which will give compile time
	// error if
	// we are not overriding
	// keep equals(Object obj) and compateTo(Object o1,Object o2 ) consistenet
	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		User user = (User) obj;
		return user.userId == this.userId
				&& (user.username == this.username || (user.username != null && user.username
						.equals(this.username)));

		// &&(user.city==this.city ||( user.city!=null &&
		// user.city.equals(this.city)));
	}

	// you must have to overrid equals and hashcode both ,otherwise your value
	// object will not able to as key
	// object in hash releted collections
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		// result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + userId;
		return result;

	}
/*	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		result = prime * result + userId;
		return result;

	}
*/

	@Override
	public int compareTo(User user) {
		// if this object is smaller than object return -1
		// if this object is grater than object return +1
		// if this object and user is equale return 0
	//	return (this.userId < user.userId)?-1:(this.userId > user.userId)? 1:0;
		return Comparator.comparingInt(User::getUserId)
						 .thenComparing(User::getUsername)
						 .compare(this,user); 
		//return Integer.compare(user.userId,this.userId); //asending order
	//	return Integer.compare(user.userId,this.userId); // reverse order
	}
	

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", city="
				+ city + "]";
	}
	
	
}
