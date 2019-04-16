package org.kc.threds;

public class Employee {
  int empid;
  String empName;
  String empCity;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((empCity == null) ? 0 : empCity.hashCode());
	result = prime * result + ((empName == null) ? 0 : empName.hashCode());
	result = prime * result + empid;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	
	if (empCity == null) {
		if (other.empCity != null)
			return false;
	} else if (!empCity.equals(other.empCity))
		return false;
	if (empName == null) {
		if (other.empName != null)
			return false;
	} else if (!empName.equals(other.empName))
		return false;
	if (empid != other.empid)
		return false;
	return true;
	//
}
  
  
}
