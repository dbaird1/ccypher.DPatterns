
package caesarCipher.store;

public class DecodedStore implements DisplayI {
	public Vector decodedStrings = new Vector();

	public void addToDecodedStrings(String decodedStr){
		decodedStrings.addElement( new String (decodedStr));
	}

    public void writeToFile(String fileName) {
    	PrintWriter outFile = new PrintWriter(fileName, "UTF-8");
		// Traverse entire list then write to file
		for (Enumeration e = decodedStrings.elements(); e.hasMoreElements();)
		{
			String curStr = (String) e.nextElement();
			outFile.println(curStr);
			// System.out.println(curStr);
		}
		outFile.close();
    }
} 


