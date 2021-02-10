package file.manager.contracts;

import java.io.OutputStream;

/**
 * 
 * @author Anish Singh (anish2u2@gmail.com)
 *
 * 09-Feb-2021
 */
public interface FileWriteService {
	
	/**
	 * Returns {@code FileWriter} instance for the given @param fileLoc.
	 * @param fileLoc
	 * @return
	 * @throws Exception
	 */
	public FileWriter getFileWritter(String fileLoc) throws Exception;
	
	/**
	 * Returns {@code FileWriter} for the given @param outputStream
	 * @param outputStream
	 * @return
	 * @throws Exception
	 */
	public FileWriter getFileWritter(OutputStream outputStream) throws Exception;
	
}
