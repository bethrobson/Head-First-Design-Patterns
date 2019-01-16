package factory.algofm;

public class Sha256Encryptor extends Encryptor {
    @Override
    public EncryptionAlgorithm getEncryptionAlgorithm() {
        return new Sha256EncryptionAlgorithm();
    }
}
