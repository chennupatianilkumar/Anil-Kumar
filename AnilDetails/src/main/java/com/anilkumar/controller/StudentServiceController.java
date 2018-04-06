package com.anilkumar.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.anilkumar.model.Student;

@RestController
public class StudentServiceController {
	
	
	@RequestMapping (value = "/student", method = RequestMethod.GET, produces = {"application/json","application/xml"})
	public Student firstPage() {
		Student st = new Student();
		st.setId("514");
		st.setGrade("A");
		st.setDepartment("BTECH IN CSE Department1");
		st.setName("Anil Kumar");
		st.setMobilenumber("9849033309");
		
		return st;
	}

}
