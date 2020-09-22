package com.proxy;


public class InternetMain 
{ 
	public static void main (String[] args) 
	{ 
		Internet internet = new ProxyInternet(); 
		try
		{ 
			internet.connectTo("yash.org"); 
			internet.connectTo("ABC.com"); 
		} 
		catch (Exception e) 
		{ 
			System.out.println(e.getMessage()); 
		} 
	} 
} 

