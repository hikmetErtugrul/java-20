package tryCatch;

import java.nio.file.FileSystemNotFoundException;

public class myError {
public static void main(String[] args) {
	try {
		hataliFonk();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static void hataliFonk() throws Exception {
	System.out.println("hatalý fonk");
}
}
