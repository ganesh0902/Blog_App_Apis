package com.api.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.sql.ast.tree.expression.Collation;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Emp> emp=new ArrayList<>();
		
		emp.add(new Emp("Ganesh","38383838383",1));
		emp.add(new Emp("shubham","344333333",7));
		emp.add(new Emp("azim","3443333333",2));
		emp.add(new Emp("dileep","383838383",8));
		emp.add(new Emp("manthan","345555543",5));
		emp.add(new Emp("rohit","38383838383",3));
		
		System.out.println(emp);
		
		Collections.sort(emp,new IdComparator());
		
		System.out.println(emp);
			
		
	}
}