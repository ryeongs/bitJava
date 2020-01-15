package DataStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class ByteStream2 {

	public static void main(String[] args) throws IOException {
		File file= new File("Data.txt");
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Data.txt"));
		
		int size = (int) file.length(); //파일 사이즈
		byte[] ar= new byte[size];

		bis.read(ar,0,size);
		
		System.out.print(new String(ar));
		
		bis.close();
		
	}

}
