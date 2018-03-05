package com.capgemini.exception;

public class ItemException extends Exception{

	
	public ItemException(int id)
	{
		System.out.println("ID entered is Invalid");
		return  ;

	}

	public ItemException(double price)
	{
		System.out.println("Price entered is Invalid");
		return;
	}
	
	
	public ItemException(String name)
	{
		System.out.println("Item Name entered is Invalid");
		return;
	}
}
