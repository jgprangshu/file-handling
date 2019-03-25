package com.capgemini.file.model;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.capgemini.file.model.BankAccount;
import com.capgemini.file.model.DebitCard;

public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		DebitCard debitcard = new DebitCard(1111222233334444L, 234 ,11,2023);
		BankAccount account = new BankAccount(101,"John Doe", "SAVING" , 34000 ,debitcard);
		
		//Serialization process
		FileOutputStream fileOutputStream = new FileOutputStream("account.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(account);
		objectOutputStream.close();
		
		FileInputStream fileInputStream = new FileInputStream("account.ser");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		
		
		BankAccount account2 = (BankAccount)inputStream.readObject();
		inputStream.close();
		System.out.println(account2);
		
	}

}
