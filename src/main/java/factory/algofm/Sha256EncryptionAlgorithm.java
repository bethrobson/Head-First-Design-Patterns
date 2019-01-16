package factory.algofm;

import org.apache.commons.codec.digest.DigestUtils;

public class Sha256EncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String plaintext) {
        return DigestUtils.sha256Hex(plaintext);
    }
}
