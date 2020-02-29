package com.event.management.event.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin

@RestController
@RequestMapping("/event")
public class EventController {
	
	
	@GetMapping
	public String printString1() {
		return "SCRIPT KIDS";
	}
	
	
	@GetMapping
	@RequestMapping("/name")
	public String printString() {
		return "DYNAMIC DUO";
	}
	
	@GetMapping
	@RequestMapping("/details")
	public sample returnDetails()
{
		sample s=new sample();
		s.setName("aggisarmi");
		return s;
	
	}
	
	@GetMapping
	@RequestMapping("/projectdetail")
	public project returnProject()
{
		project p=new project();
//		p.setId("5386");
		p.setName("aggisarmi");
		p.setType("type");
		p.setDate("22.02.2020");
		p.setVenue("guindy");
		return p;
		
	
	}
	

	@GetMapping
	@RequestMapping("details/list")
	public List<project> returnList(){
		List<project> pList = new ArrayList<>();
		project p=new project();
		project pr=new project();
//		p.setId("53");
		p.setName("aggi");
		p.setType("string");
		p.setDate("22.02.2020");
		p.setVenue("guindy");
//		pr.setId("86");
		pr.setName("sarmi");
		pr.setType("char");
		pr.setDate("22.02.2020");
		pr.setVenue("guindy");
		pList.add(p);
		pList.add(pr);		
		return pList;
		
	}
	
	
	@GetMapping
	@RequestMapping("/events/list")
	public List<project> getProjects() throws SQLException {
		List<project> pList = new ArrayList<>();
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","sarmilaparveen");
			Statement statement = connection.createStatement();
			ResultSet results=statement.executeQuery("select * from event");
			while(results.next())
			{
				project p=new project();
				p.setId(results.getInt("id"));
				pList.add(p);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			}
		finally 
		{
				connection.close();
			}
		return pList;
		}
	
	



@PostMapping
public boolean addEvent(@RequestBody Event eventParam)

{
	System.out.println (eventParam.getName());
	return true;
}



}

