package by.javatr.task1.file;
import java.io.File;

public  class ValidationFile   {

	public static Boolean checkFile(File file) {
		return file.exists()  && file.canRead();
	}
}
