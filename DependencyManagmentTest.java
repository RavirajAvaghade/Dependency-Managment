package com.pack.Main;

import java.time.LocalDate;
import java.time.LocalTime;

import com.pack.sbeans.WishmessageGenerator;

public class DependencyManagmentTest 
{
    public static void main(String[]args)
    {
    	WishmessageGenerator w = new WishmessageGenerator();
    	w.SetDate(LocalDate.now());
    	w.SetTime(LocalTime.now());
    	w.SetAge(22);
    	
    	 String result = w.GenerateWishMessage("raviraj");
    	 System.out.println(result);
    	
    	System.out.println();
    	
    }
}
