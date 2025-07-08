package com.monocept.files;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriting {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader(
					"/home/deekshithbangi/workspace/monoceptTraining/06-streams-app/src/com/monocept/files/demo.txt");
			FileWriter fileWriter = new FileWriter(
					"/home/deekshithbangi/workspace/monoceptTraining/06-streams-app/src/com/monocept/files/copy.txt");

			int characterCount = 0;
			int wordCount = 0;
			int lineCount = 0;
			int ch;
			while ((ch = fileReader.read()) != -1) {
				char currentChar = (char) ch;
				if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z')) {
					characterCount++;
				} else if ((currentChar == ' ') || (currentChar == '\n')) {
					wordCount++;
				}

				if (currentChar == '\n') {
					lineCount++;
				}
				System.out.println((char) currentChar);
				fileWriter.write(currentChar);
			}

			System.out.println("Character Count = " + characterCount);
			System.out.println("Word Count = " + wordCount);
			System.out.println("Line Count = " + lineCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//Stream -> a sequence of bytes which is attached to i/p or o/p devices 
//
//1.InputStream
//2.OutputStream
//3.Reader
//4.Writer
//
//1. FileInputStream / FileOutputStream  ->
//
//=> java code to calculate number of characters, words and lines in a file
