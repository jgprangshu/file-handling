package com.capgemini.file.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class FileExsistTest {
	
	@Test
	public void testFileExsistOrNot() {
		File file = new File("C:\\Program Files\\Java\\send.docx");
		File file2 = new File("C:\\Program Files\\Java\\send1.docx");

		
		assertTrue(file.exists());
		assertFalse(file2.exists());
		
		
	}

}
