package com.capgemini.file.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import com.capgemini.file.model.SubString;

public class SubStringTest {

	@Test
	public void testSubstringContainInFileTrue() throws IOException {
		SubString findSubstring = new SubString();
		FileReader fileReader = new FileReader("C:\\My_Workspaces\\test.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		assertTrue(findSubstring.checkSubstringPresentOrNot(bufferedReader, "Have a nice"));
		assertEquals(3, findSubstring.getCountLine());
		bufferedReader.close();
		fileReader.close();
	}

	@Test
	public void testSubstringContainInFileFalse() throws IOException {
		SubString substring = new SubString();
		FileReader fileReader = new FileReader("C:\\My_Workspaces\\test.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		assertFalse(substring.checkSubstringPresentOrNot(bufferedReader, "Good night"));
		assertEquals(3, substring.getCountLine());
		bufferedReader.close();
		fileReader.close();
	}

}
