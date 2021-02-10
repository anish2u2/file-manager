package file.manager.contracts;

import java.io.InputStream;

/**
 * 
 * @author Anish Singh (anish2u2@gmail.com)
 *
 *         09-Feb-2021
 */
public interface FileReadService {

	/**
	 * Returns {@code FileReader} instance for the given @Param fileLoc.
	 * 
	 * @param fileLoc
	 * @return
	 */
	public FileReader getReader(String fileLoc);

	/**
	 * Returns {@code FileReader} instance for the given @Param fileInputStream.
	 * 
	 * @param fileInputStream
	 * @return
	 */
	public FileReader getReader(InputStream fileInputStream);
}
