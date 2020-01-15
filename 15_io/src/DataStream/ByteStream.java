package DataStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Data.txt"));
			int data;
			while((data=bis.read()) != -1) {
				System.out.print((char)data);
			}
			
			bis.close();
			
		
	}

}
