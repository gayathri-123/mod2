package com.cg.collection;

import java.util.ArrayList;
import java.util.List;

import com.cg.bean.RechargeDetails;

public class MobilePaymentCollection {

	static List<RechargeDetails> list=new ArrayList<RechargeDetails>();
	
	public void addRechargeDetails(RechargeDetails refrence)
	{
		list.add(refrence);
	}
	
	public void viewRechargeDetails(int id) {
		for(Object object: list)
		{
			RechargeDetails obj=(RechargeDetails)object;
			if(obj.getTransactionID()==id)
			{
				System.out.println(object);
			}
		}
	
}
}
