package file.manager.contracts;

/**
 * This interface defined methods for factory creation of File.
 * 
 * @author Anish Singh (anish2u2@gmail.com)
 *
 *         09-Feb-2021
 */
public interface FileFactory{

	/**
	 * Returns {@code FileService} implementor class.
	 * 
	 * @return
	 */
	public FileService getFileService();

}
