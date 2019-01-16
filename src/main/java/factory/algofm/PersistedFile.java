package factory.algofm;

public class PersistedFile {

    public static void main(String args[]) {

        Encryptor encryptor256c = new Sha256Encryptor();
        Encryptor encryptor512c = new Sha512Encryptor();


        encryptor256c.writeToDisk("lol", "lol.txt");


    }

}
