package com.adobe.cam.data.extract;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileUtil {

	public static void saveData(String fileName, String data) {
		try {
		      // Creates a FileWriter
		      FileWriter file;
				file = new FileWriter(fileName);

		      // Creates a BufferedWriter
		      BufferedWriter output = new BufferedWriter(file);

		      // Writes the string to the file
		      output.write(data);

		      // Closes the writer
		      output.close();	    
	}catch (IOException e) {
    	e.printStackTrace();
    }
	}

	public static void createZipFile(String filePath) {
		try {
			File file = new File(filePath);
			String zipFileName = file.getName().concat(".zip");

			FileOutputStream fos = new FileOutputStream(zipFileName);
			ZipOutputStream zos = new ZipOutputStream(fos);

			zos.putNextEntry(new ZipEntry(file.getName()));

			byte[] bytes = Files.readAllBytes(Paths.get(filePath));
			zos.write(bytes, 0, bytes.length);
			zos.closeEntry();
			zos.close();

		} catch (FileNotFoundException ex) {
			System.err.format("The file %s does not exist", filePath);
		} catch (IOException ex) {
			System.err.println("I/O error: " + ex);
		}
	}

}
