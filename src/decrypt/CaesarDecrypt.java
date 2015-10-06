package caesarCipher.decrypt;

public class CaesarDecrypt implements CaesarCipherI {
    public String decrypt(String cipherString, int cipherShift)
    {
        cipherString = cipherString.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherString.length(); i++)
        {
            int charPos = ALPHABET.indexOf(cipherString.charAt(i));
            int keyVal = (charPos - cipherShift) % CaesarCipherI.ALPHABET_NUMBERS;
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText += replaceVal;
        }
        return plainText;
    }
}