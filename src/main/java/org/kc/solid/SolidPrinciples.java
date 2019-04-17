package org.kc.solid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SolidPrinciples {

	public static void main(String[] args) {

		// both u1 and u2 user object are same as bussiness rule but if we only
		// overrid equals and not override
		// hashcode() then it will not be considered as same object as the
		// hashcode of two object is difference
		// contract says contract between equals() and hashCode() is:
		// 1) If two objects are equal, then they must have the same hash code.
		// 2) If two objects have the same hash code, they may or may not be
		// equal.
		// so it should override hashcode too.

		User u1 = new User(1, "keshav");
		User u2 = new User(1, "keshav");
		Set<User> userSet = new HashSet();
		userSet.add(u1);
		userSet.add(u2);
		System.out.println("userSet :" + userSet);
		System.out.println(u1 + " " + u2);
		userSet.add(null);

		if (userSet.contains(null)) {
			System.out.println("contains user null");
		}
		if (userSet.contains(new User(1, "keshav"))) {
			System.out.println("contains user 1, keshav");
		}

		Map<User, String> userStore = new HashMap();
		userStore.put(null, "string");
		userStore.put(null, "string");
		userStore.put(u1, "UserOne");
		userStore.put(u2, "UserTwo");
		System.out.println(userStore);
		System.out.println(userStore.get(u1));
		System.out.println(userStore.get(u2));

		User u3 = new User(3, "abc");
		User u6 = new User(6, "abc");
		User u5 = new User(5, "abc");
		User u4 = new User(4, "abc");
/*		Set<User> userSetSorted = new TreeSet();
		userSetSorted.add(u5);
		userSetSorted.add(u6);
		userSetSorted.add(u3);
		userSetSorted.add(u4);
		userSetSorted.forEach(user -> {
			System.out.println(user.getUserId());
		});
			System.out.println(userSetSorted);
*/
		// ArrayList
		System.out.println("ArrayList");
		List<User> userList = new ArrayList();
		
		// userList.add(null);//null is acceptable but while fetching null
		// pointer exception
		userList.add(new User(13, "13"));
		userList.add(new User(14, "14"));
		userList.add(new User(14, "14"));
		userList.add(new User(12, "12"));
		// userList.add(null);//null is acceptable but while fetching null
		// pointer exception
		System.out.println(userList.size());
		// userList.add(new User(null,null));// constructor for null,null is
		// undefined
		userList.forEach(user -> System.out.println(user.getUserId()));
		// Output : insertion order preserved
		// not sorted
		// duplicate allowed

		
		System.out.println("LinkedList");
		List<User> userLinkedList = new LinkedList();
		userLinkedList.add(new User(15,"15"));
		userLinkedList.add(new User(18,"18"));
		userLinkedList.add(new User(16,"16"));
		userLinkedList.add(new User(16,"16"));
		userLinkedList.add(new User(17,"17"));
		userLinkedList.forEach(user-> System.out.println(user.getUserId()));
		//output: insertiton order preserved
		//not sorted
		//duplicate  allowed
		
		
		System.out.println("HashSet userSet1");
		Set<User> userSet1=new HashSet();
		userSet1.add(new User(19,"19"));
		userSet1.add(new User(20,"20"));
		userSet1.add(new User(18,"18"));
		boolean isAdd = userSet1.add(new User(18,"18"));
		System.out.println(isAdd);
		userSet1.forEach(s-> System.out.println(s.getUserId()));
		
		System.out.println("hashset order");
		Set<User> uset=new HashSet();
		uset.add(new User(22,"22"));
		uset.add(new User(21,"21"));
		uset.add(new User(24,"24"));
		uset.add(new User(25,"25"));
		uset.add(new User(28,"28"));
		uset.add(new User(26,"26"));
		uset.add(new User(27,"27"));
		System.out.println(uset.size());
		uset.add(new User(23,"23"));
		System.out.println(uset);
		uset.forEach(u->System.out.println(u.getUserId()));
		
		Set<String> nameSet=new HashSet();
		nameSet.add("Abc");
		nameSet.add("Bbc");
		nameSet.add("Dbc");		
		nameSet.add("Cbc");
		System.out.println(nameSet);
		nameSet.forEach(name->System.out.println(name.toString()));
		//output : duplicate not allowed/onley distict element
		// set.add(E) return boolean if added true, else flase
		//
		
		System.out.println("LinkedHashSet");
		System.out.println("TreeSet");
		
		
		
		User u7 = new User(3, "abc");
		User u8 = new User(6, "abc");
		User u9 = new User(5, "abc");

		User u10 = new User(4, "abc");
		User u11 = new User(4, "abc");
		User u12 = new User(4, "abc");

	

	}

}
