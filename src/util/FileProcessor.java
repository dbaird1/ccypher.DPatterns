import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * FileProcessor --- responsible for reading from a specified file.
 * @author    Daniel D'Alessandro
 */
public class FileProcessor{
	private File inputFile;
	private Scanner fileScanner;
	
	/**
	* Constructs a File Processor and validate the input file.
	* @return None.
	*/
	FileProcessor(String fileName){
		if(validateFileName(fileName)){
			this.inputFile = new File(fileName);
			try {
	        	this.fileScanner = new Scanner(inputFile);
	        } catch (FileNotFoundException ex) {
				//ERROR, print meaningful error message
				System.err.println("ERROR: Filename ("+fileName+") could not be found.");
				//ERROR, print the stacktrace to stderr
				ex.printStackTrace();
				System.exit(1);
		    }
		}
	}

	/**
	* Validates the user-provided file name.
	* @return boolean Returns true if the file exists.
	*/
	public static boolean validateFileName(String fileName) {
		boolean valid = false;
		File tempFile = new File(fileName);
		try {
			tempFile.getCanonicalPath();
			valid = true;
		} catch (IOException e) {
			//ERROR, print meaningful error message
			System.err.println("ERROR: Filename ("+fileName+") could not be opened.");
			//ERROR, print the stacktrace to stderr
			e.printStackTrace();
			System.exit(1);
			valid = false;
		}
		return valid;
	}

	/**
	* Gets the next line of the file.
	* @return String Returns the next line of the file.
	*/
	public String readLineFromFile(){
        if(fileScanner.hasNext()) {
            //Return next line
		    return fileScanner.nextLine();
		}else{
			return null;
		}
	}

	/**
	* A default toString method.
	* @return String Returns an empty string.
	*/
	public String toString(){
		return "";
	}
}