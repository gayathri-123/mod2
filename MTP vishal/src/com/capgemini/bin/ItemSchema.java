package com.capgemini.bin;



public class ItemSchema {
public int itemID;
public String itemName;
public double itemPrice;
public int transactionID;


public ItemSchema(int iID,String iName,double iPrice,int tID)
{
	
	 this.itemID=iID;
	 this.itemName=iName;
	 this.itemPrice=iPrice;
	 this.transactionID=tID;
}


public String toString() {
	return "itemID=" + itemID + ", itemName=" + itemName
			+ ", itemPrice=" + itemPrice + ", transactionID=" + transactionID;
}



/* public static void main(String args[]) {
	ItemSchema object = new ItemSchema(123,"Cinthol",35.0,2345);
	System.out.println(object);  */

}
