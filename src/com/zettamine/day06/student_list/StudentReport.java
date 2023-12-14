package com.zettamine.day06.student_list;

import java.util.HashMap;
import java.util.List;


public class StudentReport {
	static HashMap<String,Integer> getReport(List<Student> studentList){
		HashMap<String,Integer> stuDetails = new HashMap<>();
		
		for (Student stu : studentList) {
			if(!stuDetails.containsKey(stu.getLocation()))
				stuDetails.put(stu.getLocation(), 1);
			else {
				int count = stuDetails.get(stu.getLocation());
				stuDetails.put(stu.getLocation(), count+1);
			}
		}
		return  stuDetails;
	}

}
