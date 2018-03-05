package com.capgemini.collection;
import java.util.*;

import com.capgemini.bin.*;
	public class Collector{
		static List<ItemSchema> list = new ArrayList<ItemSchema>();
		static int count=0;
	static{
			
			ItemSchema obj1=new ItemSchema(15,"Park Avenue Soap",24.00,9878);
			list.add(obj1);
			ItemSchema obj2=new ItemSchema(16,"Dove Soap",99.00,987);
			list.add(obj2);
			ItemSchema obj3=new ItemSchema(17,"Pears Soap",60.00,98);
			list.add(obj3);
		}
		
		public static void adddetails(ItemSchema obj)
		{
			list.add(obj);
		}  

		public static void display_rec()
		{
			for(Object object: list)
				System.out.println(object);
		}  
		
		public static void remove_by_id(int id)
		{
			Iterator<ItemSchema> itr=list.iterator();
			while(itr.hasNext())
			{
				ItemSchema obj=(ItemSchema)itr.next();
				if(obj.itemID==id)
				{
					itr.remove();
				}
			}
			/*for(Object object: list)
			{
				ItemSchema obj=(ItemSchema)object;
				if(obj.itemID==id)
				{
					list.remove(obj);
					System.out.println("Removed");
				}
			}*/
			}
			
			public static void count_records()
			{
				for(Object object: list)
				{
					count++;    
				}
				System.out.println(count);
				count=0;
			}
			
			public static void duplication(int id) {
				for(Object object: list)
				{
					ItemSchema obj=(ItemSchema)object;
					if(obj.itemID==id)
					{
						System.out.println(object);
					}
				}
			}
	}
	
	

