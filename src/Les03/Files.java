package Les03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Files {

	public static void main(String[] args) {
		File file = new File("C:/Users/User/eclipse-workspace/Java advanse/src/Les03");
		Scanner scan = new Scanner(System.in);
		FileInputStream in = null;
		FileOutputStream out = null;
		while (true) {
			System.out.println();
			for (File f : file.listFiles()) {
				if (f.isDirectory()) {
					System.out.println(f.getName());
				}
			}
			for (File f : file.listFiles()) {
				if (f.isFile()) {
					System.out.println(f.getName());
				}
			}
			System.out.println(file + ">");
			String command = scan.nextLine();
			switch (command) {
			case "..":
				file = new File(file.getParent());
				break;
			default:
				file = new File(file.getAbsolutePath() + "/" + command);
			case "copy":
				try {
					in = new FileInputStream(command);
					out = new FileOutputStream(command + "copy");
					int tmp;
					while ((tmp = in.read()) != -1) {
						out.write(tmp);
					}
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (in != null) {
						try {
							in.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					if (out != null) {
						try {
							out.close();							
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("Done");
					}
				}
			}
			case "read" :
				
				file = new File(file.toString());
		}

	}
}
}
