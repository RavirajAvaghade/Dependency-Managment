package com.pack.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishmessageGenerator 
{
   private LocalDate date;
   private LocalTime time;
   private int age;
   
   public WishmessageGenerator()
   {
	   System.out.println("sbeans.WishmessageGenerator()");
	   
   }
  
   public void SetTime(LocalTime time)
   {
	  this.time = time;   
   }
   public void SetAge(int age)
   {
	   this.age = age;
   }
   
   public String GenerateWishMessage(String user)
   {
	 System.out.println("WishmessageGenerator.GenerateWishMessage()");
	 
	 int hour = time.getHour();
	 
	 if(hour<12)
	 {
		 return "Good Morning "+user;
	 }
	 else if (hour<16)
	 {
		 return "Good Afternoon"+user;
	 }
	 else if(hour<20)
	 {
		 return "Good Evening "+user;
	 }
	 else
		 
	return "Good Night"+user;
	   
   }
   public void SetDate(LocalDate now) 
   {
	// TODO Auto-generated method stub
	
   }
   
   
   
}
