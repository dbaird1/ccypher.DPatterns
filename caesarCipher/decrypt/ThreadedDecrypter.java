package caesarCipher.decrypt;

public class ThreadedDecrypter implements Runnable  {

	private FileProcessor file;
	// While the end of file has not been reached:
	// Invoke a method in the FileProcessor to read one line
	// Decrypt the string using the instance of CeaserCipher
	// Write it to DecodedStore
    public void run() {
    	String lineVal = file.readLineFromFile();
    	while(lineVal != null){
    		
    	}
    }
    

}