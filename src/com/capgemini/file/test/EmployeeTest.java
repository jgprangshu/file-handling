package com.capgemini.file.test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import com.capgemini.file.model.Employee;

public class EmployeeTest {

	@Test
	public void testObjectWriteIntoFileAndReadIntoFileSuccessfully()
			throws IOException, ClassNotFoundException {
		Employee employee = new Employee(121, "Prangshu", 22000);
		Employee employee3 = new Employee(102, "Aayush", 25000);

		FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				fileOutputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("employee.ser");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

		Employee employee2 = (Employee) inputStream.readObject();

		inputStream.close();

		assertTrue(employee.equals(employee2));
		assertFalse(employee.equals(employee3));
	}

}