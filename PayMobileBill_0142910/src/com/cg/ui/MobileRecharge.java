package com.cg.ui;

import java.util.Scanner;
import com.cg.bean.RechargeDetails;
import com.cg.collection.MobilePaymentCollection;
import com.cg.exception.MobileBillPaymentException;

public class MobileRecharge {

			//creating object for bean class to access getters and setters
			RechargeDetails rechargeDetails=new RechargeDetails();
			
			//creating object for Mobile Payment collection class to access the collector
			MobilePaymentCollection mpCollection=new MobilePaymentCollection();
			
			//to get user inputs
			Scanner userInput=new Scanner(System.in);

			//method to make recharge
			public void makeRecharge()throws MobileBillPaymentException
			{
				//to get the recharge type
				System.out.println("Enter the recharge type:");
				String rechargeType=userInput.next();
				rechargeDetails.setRechargeType(rechargeType);

				//to get current operator
				System.out.println("Enter the Current Operator:");
				String operator=userInput.next();
				rechargeDetails.setCurrentOperator(operator);

				//to get mobile number
				System.out.println("Enter the mobile number:");
				String mobileNumber=userInput.next();
				rechargeDetails.setMobileNo(mobileNumber);

				//to get amount
				System.out.println("Enter the amount:");
				double amount=userInput.nextDouble();
				rechargeDetails.setAmount(amount);	
				
				//save the bean details in the collection
				mpCollection.addRechargeDetails(rechargeDetails);
				
				System.out.println("Successfully Recharged. Transaction ID: "+rechargeDetails.getTransactionID());
			}
			
			//method to view recharge
			public void viewRecharge()throws MobileBillPaymentException
			{
				System.out.println("Enter the transaction ID to view your recharge details:");
				int transactionId=userInput.nextInt();
				
				//get the details from  collection
				mpCollection.viewRechargeDetails(transactionId);
				
			}
	
	public static void main(String[] args) {
		
		MobileRecharge mobileRecharge=new MobileRecharge();
		
		Scanner input=new Scanner(System.in);
		do{
		System.out.println("********Mobile Recharge Application********\n1.Make a Recharge\n2.View Recharge Details\n3.Exit\nEnter your choice:");
		int userChoice=input.nextInt();
		
		switch (userChoice) {
		case 1:
			try {
				
				mobileRecharge.makeRecharge();
				
			} catch (MobileBillPaymentException e) {
				System.out.println("There is a problem in recharging your mobile with the details yopu have given. Please check the deatils once and try again...");
			}
			break;
			
		case 2:
			
			try {
				
				mobileRecharge.viewRecharge();
				
			} catch (MobileBillPaymentException e) {
				System.out.println("There is problme in viewing your recharge details. Please try again later..");
			}
			
			break;
			
		case 3:
			System.exit(0);
			break;
		}
		
		}while(true);
		
	}

}
