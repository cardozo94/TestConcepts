package oop.patternsdesign.structural.decorator.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

import oop.patternsdesign.structural.decorator.lcdinterface.DataSource;

public class FileDataSource implements DataSource {
	
	private String name;
	
	public FileDataSource(String name) {
		this.name = name;
	}

	@Override
	public void writeData(String data) {
		File file = new File(name);
		if(!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		try(OutputStream fos = new FileOutputStream(file)){
			fos.write(data.getBytes(), 0, data.length());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	public String readData() {
		char[] buffer = null;
		File file = new File(name);
		try(FileReader reader = new FileReader(file)){
			buffer = new char[(int) file.length()];
			reader.read(buffer);
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return new String(buffer);
	}

}
