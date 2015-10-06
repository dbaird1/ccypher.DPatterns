
package caesarCipher.driver;

public class Driver{
	public static String usageString;
	public static String INPUT_FILENAME;
	public static String OUTPUT_FILENAME;
	public static int CIPHER_SHIFT;
	public static int NUM_THREADS;
	public static int DEBUG_VALUE;


	public static void main(String args[]) {
		// System.out.println("\n The args[0] is: " + args[0]);
		// System.out.println("\n The args[1] is: " + args[1]);
		// System.out.println("\n The args[2] is: " + args[2]);
		// System.out.println("\n The args[3] is: " + args[3]);
		// System.out.println("\n The args[4] is: " + args[4]);

		//TODO: Validate correct number of arguments ... args.length doesn't seem to work correctly
		INPUT_FILENAME = args[0];//input file name
		OUTPUT_FILENAME = args[1];//output file name
		if(!INPUT_FILENAME.contains(".txt")){
			System.err.println("ERROR: Invalid input-file specified: "+INPUT_FILENAME);
			System.exit(1);
		}
		if(!OUTPUT_FILENAME.contains(".txt")){
			System.err.println("ERROR: Invalid output-file specified: "+OUTPUT_FILENAME);
			System.exit(1);			
		}
		try{
			CIPHER_SHIFT = Integer.parseInt((args[2]));//# of pos each char has been moved by the cipher algorithm
			NUM_THREADS = Integer.parseInt((args[3]));//The number of threads to be used
			DEBUG_VALUE = Integer.parseInt((args[4]));//Controls what is printed on stdout
		}catch(NumberFormatException n){
			System.err.println("ERROR: Problem converting input to integer");
			System.exit(1);
		}
		if(NUM_THREADS <= 1 || NUM_THREADS >= 5){
			System.err.println("ERROR: Invalid NUM_THREADS specified: "+NUM_THREADS);
			System.exit(1);
		}
		if(DEBUG_VALUE <= 0 || DEBUG_VALUE >= 4){
			System.err.println("ERROR: Invalid DEBUG_VALUE specified: "+DEBUG_VALUE);
			System.exit(1);
		}
		//Create a File Processor
		FileProcessor file = new FileProcessor(INPUT_FILENAME);
		CreateWorkers workers = new CreateWorkers();
		workers.startWorkers(NUM_THREADS);
		DecodedStore store = new DecodedStore();
		store.writeToFile(OUTPUT_FILENAME);
	} // end main(...)

} // end public class Driver

