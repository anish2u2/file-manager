package file.manager.contracts;

import java.io.Closeable;

/**
 * 
 * @author Anish Singh (anish2u2@gmail.com)
 *
 *         09-Feb-2021
 */
public interface FileReader extends Closeable {
	
	/**
	 * Reads given capacity of data into given @Param readInto and returns the length of bytes reads or else -1.
	 * @param readInto
	 * @return
	 * @throws Exception
	 */
	public int read(byte[] readInto) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public byte read() throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public String readLine() throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public boolean reachedEnd() throws Exception;
	
}
