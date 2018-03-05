package com.cg.ui;

import com.capgemini.bean.*;

import java.util.Scanner;

import com.capgemini.bean.ItemSchema;
import com.capgemini.exception.ItemException;
import com.capgemini.collection.ItemCollectionHelper;
import com.capgemini.validator.ItemDataValidator;


public class ItemUI {
	static Scanner cin=new Scanner(System.in);
	static ItemCollectionHelper collectionHelper=null;


	public static void main(String[] args) throws ItemException{
		
       int choice=0;
	collectionhelper=new BookcollectionHelper();

  while(true)
{
	System.out.println("Enter your choice");
	System.out.println("1----Add Details");
	System.out.println("2----Count Records");
	System.out.println("3---- Display Records");
	System.out.println("4---- find duplicate");
	System.out.println("5---- remove Records");
	System.out.println("6----Exit");
	
	choice=cin.nextInt();
	switch(choice)
	{
	case 1:{
		System.out.println("Add Details");
		kk();
		break;}
	
	case 2:{System.out.println("Count Records");
		Collector.count_records();
		break;}
	
	case 3:{
		{System.out.println("Display Records");
		//display_records();
		Collector.display_rec();
		break;}
		}
	
	case 4:{System.out.println("Find duplicate");
		System.out.println("Enter ID to Find Specific Record by ID");
		int get_id=cin.nextInt();
		Collector.duplication(get_id);
		break;}
	
	case 5:{System.out.println("Remove Records");
		System.out.println("Enter ID to Remove Specific Record by ID");
		int get_id=cin.nextInt();
		Collector.remove_by_id(get_id);
		break;}
	
	case 6:{System.exit(0);
		break;}
	
	default:{System.out.println("Enter proper option");
		break;}
	}
}
	}
	public static void kk() throws ItemException{
		System.out.println("Enter Number of Items to be Added");
		//System.out.println("Add Details")
		int Num_Items;
		Num_Items=cin.nextInt();
	//	abc:
		while(Num_Items!=0)
		{
			
			System.out.println("Enter Item ID");
			int item_id=cin.nextInt();
			try {
			if(!Validator.validate_id(item_id)) 
			{
				System.exit(0);
			}
			System.out.println("Enter Item Name");
			String item_name=cin.next();
			if(!Validator.validate_name(item_name))
			{
				System.exit(0);
			}
			System.out.println("Enter Item Price");
			double item_price=cin.nextDouble();
			if(!Validator.validate_price(item_price))
			{
				System.exit(0);
			}
			
			Random randomGenerator = new Random();
			int txn_id = randomGenerator.nextInt(9999);
			//int id=Integer.parseInt(item_id);
			ItemSchema sch=new ItemSchema(item_id,item_name,item_price,txn_id);
			Collector.adddetails(sch);
			}
			catch(ItemException e)
			{
				
				
			}
			Num_Items--;
		}	
		
	}
	
}