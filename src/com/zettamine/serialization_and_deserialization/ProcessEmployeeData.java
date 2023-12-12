package com.zettamine.serialization_and_deserialization;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProcessEmployeeData {

	public static void main(String[] args) {
		
		Map<Employee,Set<Certification>> empMap = new HashMap<>();
		Set<Certification> certRegEmp1, certRegEmp2, certRegEmp3,certConEmp1,certConEmp2,certConEmp3;
		certRegEmp3 = new HashSet<>();
		
		Employee regEmp1 = new RegularEmployee(201,"Hari",20,"PF19282");//Regular EMployee 1
	
		certRegEmp1 = new HashSet<>();
		
		Employee regEmp2 = new RegularEmployee(203,"Ravi",10,"PF10012");//Regular EMployee 2
		certRegEmp2 = new HashSet<>();
		certRegEmp2.add(new Certification(1133,"CCNA",5));
		certRegEmp2.add(new Certification(7765,"Java NPTEL",7));
		
		Employee regEmp3 = new RegularEmployee(206,"Somesh",20,"PF19254");//Regular EMployee 3
		certRegEmp3 = new HashSet<>();
		certRegEmp3.add(new Certification(4455,"Python",4));
		
		Employee conEmp1 = new ContractEmployee(250,"Nagendra",10,29101);//Contract Employee 1
		certConEmp1 = new HashSet<>();
		
		Employee conEmp2 = new ContractEmployee(256,"Jagadeesh",20,38501);//Contract Employee 2
		certConEmp2 = new HashSet<>();
		certConEmp2.add(new Certification(4531, "AI NPTEL", 9));
		certConEmp2.add(new Certification(3241, "Power BI", 12));
		
		Employee conEmp3 = new ContractEmployee(271, "Tharun", 20,38281); //Contract Employee 3
		certConEmp3 = new HashSet<>();
		certConEmp3.add(new Certification(9944, "Machine Learning", 2));
		
		
		empMap.put(regEmp1, certRegEmp1);// Adding Regular Employees 
		empMap.put(regEmp2, certRegEmp2);
		empMap.put(regEmp3, certRegEmp3);
		
		empMap.put(conEmp1, certConEmp1); //Adding Contract Employees
		empMap.put(conEmp2, certConEmp2);
		empMap.put(conEmp3, certConEmp3);
		System.out.println(regEmp1.toString());
		
		for(Employee emp:empMap.keySet()) {
			System.out.println(emp+" "+empMap.get(emp));
		}
	
		SerializeEmployee.serialize(empMap); //Serialize Map Object
		
		Map<Employee,Set<Certification>> desEmpMap = DeserializeEmployee.deserialize();  //Deserialize Map Object
		System.out.println("------------------");
		
		System.out.println("Deserialization data :");
		
		for(Employee emp:desEmpMap.keySet()) {
			System.out.println(emp+" ");
			System.out.println("Certifications : " + (desEmpMap.get(emp)).size() );
			for(Certification cert:desEmpMap.get(emp))
				System.out.println(cert);
			System.out.println();
		}
		
	
	}

}
