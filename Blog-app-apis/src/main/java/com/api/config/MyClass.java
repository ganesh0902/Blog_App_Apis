package com.api.config;

public class MyClass {

	public static void main(String[] args) {
				
		String name="Ganesh Shubham Manthan ";
		
		String[] names = name.split(" ");
		
		String reverse[]=new String[3];
												
		int length = names.length;
						
		for(int i=0;i<length;i++)
		{			
			String name1 = names[i];
						
			for(int j=name1.length()-1;j>=0;j--)
			{				
				System.out.print(name1.charAt(j));
				
				reverse[i]+=name1.charAt(j);
			}						
			System.out.println();
		}					
		
	}
}