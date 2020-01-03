package 대학등록시스템;

import java.util.HashMap;
import java.util.Map;

import org.omg.IOP.TransactionService;

public class Student extends Person{
	private int credits;
	private double gpa;
	private String country;
	private Phone phone;
	private final Transcript transcript = new Transcript();
	
	
	public Student(String name, boolean male, int yob, String country,Phone phone)
	{
		super(name, male, yob,phone);
		this.country = country;
		
	}
	
	public void updateTranscript(Section section,Grade grade)
	{
		transcript.add(section, grade);
	}
	
	public void printTranscript()
	{
		System.out.println(transcript);
	}
	
	private class Transcript{
		Map map = new HashMap();
		void add(Section section, Grade grade)
		{
			map.put(section, grade);
		}
		
		public String toString()
		{
			return map.toString();
		}
	}
}
