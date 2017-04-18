package main.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Produces;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import main.model.Employee;


@RestController
@RequestMapping("/Employee")
public class RestEmployeController {

	public final static List<Employee> list;
	static{
		list = new ArrayList<Employee>(); 
				list.add(new Employee(1,"Roger"));
				list.add(new Employee(2, "Nadal"));
		
	}
	
	@RequestMapping(value={"/getAllEmployees","/getEmployees"},
			method=RequestMethod.GET,
			produces={MediaType.APPLICATION_JSON_VALUE})
			//should be perfect no unnesscessary media type declaration then issue
	@ResponseBody
	public static List getEmployeeList()
	{
		//return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
		return list;
		
	}
	
	@RequestMapping(value={"/getListEmployees"},method=RequestMethod.GET)
	
	@ResponseBody
	@Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON,javax.ws.rs.core.MediaType.APPLICATION_XML})
	public static  List<Employee> getAllEmployeeList()
	{
		return list;
	}
}
