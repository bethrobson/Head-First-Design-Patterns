package factory.algofm;

import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Encryptor {

    // here is your factory method
    public abstract EncryptionAlgorithm getEncryptionAlgorithm();

    // here is your superclass method that uses the factory method
    public void writeToDisk(String plaintext, String filename){
        // factory method
        EncryptionAlgorithm encryptionAlgorithm = getEncryptionAlgorithm();
        // Here are steps that won't change for any of your implementations
        String cyphertext = encryptionAlgorithm.encrypt(plaintext);

        try {
            FileOutputStream outputStream = new FileOutputStream(filename);
            outputStream.write(cyphertext.getBytes());
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
