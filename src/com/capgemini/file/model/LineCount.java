package com.capgemini.file.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
	private String path;
	FileReader fileReader;
	BufferedReader bufferedReader;

	public LineCount() {
		super();
	}

	public LineCount(String path) throws FileNotFoundException {
		this.path = path;
		FileReader fileReader = new FileReader(path);
		bufferedReader = new BufferedReader(fileReader);
	}

	public int lineCount() throws IOException {
		int count = 0;
		while (this.bufferedReader.readLine() != null) {
			count = count + 1;
		}
		
		System.out.println(count);
		bufferedReader.close();
		fileReader.close();
		return count;
	}

}
