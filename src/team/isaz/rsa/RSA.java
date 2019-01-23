package team.isaz.rsa;

import java.security.*;
import java.math.BigInteger;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class RSA {
    
    public static String doString(byte[] bytes) {
        String s = "";
        for (byte b : bytes) {
            s += ((char) b);
        }
        return s;
    }


}
