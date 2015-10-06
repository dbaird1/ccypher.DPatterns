package caesarCipher.decrypt;


public interface CaesarCipherI {
	public final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	public int ALPHABET_NUMBERS = 26;
    // method name to take a string, cecrypt it, and return it
	public String decrypt(String cipherString, int cipherShift);

}