package Doc_download;

import java.util.regex.*;

public class Module2 {
	public String name(String s)
	{
		boolean a=Pattern.matches("[a-zA-Z]+", s);
		if(a==true)
				return "success";
		else
				return "name is required";
	}
	
	public String rollno(String r)
	{
		boolean a=Pattern.matches("[0-9]{6}", r);
		if(r=="")
			return "roll number is required";
		else if(a==true)
			return "success";
		else
			return "invalid roll number";
	}
	
	public String year(String y)
	{
		if(y=="")
			return "year is required";
		
		Integer i=Integer.valueOf(y); 
		if(i>=2016 && i<=2019)
			return "success";
		else
			return "2016-2019 documents only available";
	}
	
	public String dob(String d)
	{
		boolean a=Pattern.matches("[0-3]{1}[0-9]{1}[-][0-1]{1}[0-9]{1}[-][0-9]{4}", d);
		if(d=="")
			return "DOB is required";
		else if(a==true)
			return "success";
		else
			return "invalid DOB";
	}
	
	public String type(String t)
	{
		if(t.equals("REGULAR"))
			return "success";
		else
			return "select certificate type";
	}
	
	public String flag(String f)
	{
		if(f.equals("X") || f.equals("XI") || f.equals("XII"))
			return "success";
		else
			return "select flag";
	}
	
	public String month(String m)
	{
			String mon[]= {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
			for(int i=0;i<mon.length;i++)
			{
				if(mon[i].equals(m))
					return "success";
				
			}
			if(m=="")
				return "month is required";
			else
				return "invalid month";
	}
	

}
