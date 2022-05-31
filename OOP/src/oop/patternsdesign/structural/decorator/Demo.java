package oop.patternsdesign.structural.decorator;

import oop.patternsdesign.structural.decorator.core.FileDataSource;
import oop.patternsdesign.structural.decorator.decorator.CompressionDecorator;
import oop.patternsdesign.structural.decorator.decorator.EncryptionDecorator;
import oop.patternsdesign.structural.decorator.lcdinterface.DataSource;

public class Demo {

	public static void main(String[] args) {
		String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
		DataSource plain = new FileDataSource(".\\outputDemoPlain.txt");
		plain.writeData(salaryRecords);
		
		DataSource encrypted = new EncryptionDecorator(new FileDataSource(".\\outputDemoEncrypted.txt"));
		encrypted.writeData(salaryRecords);
		
		DataSource compress = new CompressionDecorator(new FileDataSource(".\\outputDemoCompress.txt"));
		compress.writeData(salaryRecords);
		

		DataSource full = new CompressionDecorator(new EncryptionDecorator(new FileDataSource(".\\outputDemoFull.txt")));
		full.writeData(salaryRecords);
		System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- plain --------------");
        System.out.println(plain.readData());
        System.out.println("- decrypted --------------");
        System.out.println(encrypted.readData());
        System.out.println("- Decompress --------------");
        System.out.println(compress.readData());
        System.out.println("- Decompress and decrypted --------------");
        System.out.println(full.readData());

	}

}
