import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * 
 */

/**
 * @author yzc
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RandomAccessFile binaryFile;
		try {
			binaryFile = new RandomAccessFile("data/user_data/123.tbl", "rw");
			HexDump.displayBinaryHex(binaryFile, 512);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
