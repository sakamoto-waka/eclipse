package practice;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;


public class Chapter15_2 {
	public static void main(String [] args) {
		FileSystem fs = FileSystems.getDefault();
		Path inputPath = fs.getPath("resources/input.txt");
		Path outputPath = fs.getPath("resources/output.txt");
	}
}
