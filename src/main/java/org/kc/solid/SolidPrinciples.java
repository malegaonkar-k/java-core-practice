package org.kc.solid;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SolidPrinciples {

	public static void main(String[] args) {

		// both u1 and u2 user object are same as bussiness rule but if we only overrid equals and not override
		//hashcode() then it will not be considered as same object as the hashcode of two object is difference
		// contract says contract between equals() and hashCode() is:
		// 1) If two objects are equal, then they must have the same hash code.
		// 2) If two objects have the same hash code, they may or may not be equal.
		// so it should override hashcode too.


		User u1 = new User(1, "keshav");
		User u2 = new User(1, "keshav");
		Set<User> userSet=new HashSet();
		userSet.add(u1);
		userSet.add(u2);
		System.out.println("userSet :"+userSet);
		System.out.println(u1+" "+u2);
		userSet.add(null);		
		
		if(userSet.contains(null)){
			System.out.println("contains user null");
		}
		if(userSet.contains(new User(1,"keshav"))){
			System.out.println("contains user 1, keshav");
		}
		Map<User, String> userStore = new HashMap();
		userStore.put(u1,"UserOne");
		userStore.put(u2,"UserTwo");
		System.out.println(userStore);
		System.out.println(userStore.get(u1));
		System.out.println(userStore.get(u2));
		
	}

}
