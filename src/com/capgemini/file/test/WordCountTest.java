package com.capgemini.file.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.file.model.WordCount;

public class WordCountTest {
	@Test
	public void testTheNumeberofWord() throws IOException {
		WordCount wordCount = new WordCount("C:\\My_Workspaces\\test.txt");
		assertEquals(7, wordCount.wordCount());
	}
}
