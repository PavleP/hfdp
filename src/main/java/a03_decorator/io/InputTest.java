package a03_decorator.io;

import java.io.*;

public class InputTest {

	public static void main(String[] args) throws IOException {
		int c;

    InputStream in = null;
		try {
			in =
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream(
						    "C:\\Work\\Learn\\HeadFirstDesignPatterns\\src\\main\\java\\a03_decorator\\io\\test.txt")));

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		  in.close();
    }
  }
}
