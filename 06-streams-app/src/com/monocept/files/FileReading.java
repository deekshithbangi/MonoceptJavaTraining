package com.monocept.files;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReading {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader(
					"/home/deekshithbangi/workspace/monoceptTraining/06-streams-app/src/com/monocept/files/demo.txt");
			BufferedReader br = new BufferedReader(file);

			String line;
			// Read line by line
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			// Close the readers
			br.close();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
