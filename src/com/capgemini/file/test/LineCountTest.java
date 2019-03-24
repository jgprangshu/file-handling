package com.capgemini.file.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.file.model.LineCount;

public class LineCountTest {
	@Test
	public void testTheNumeberofLines() throws IOException {
		LineCount lineCount = new LineCount("C:\\My_Workspaces\\test.txt");
		assertEquals(6, lineCount.lineCount());
	}

}
