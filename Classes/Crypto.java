package market2.Classes;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

public class Crypto {
    //Funciona bien
     public static String ecnodeMD5(String secretKey, String cadena) {
        String encriptacion = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llavePassword, 24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainTextBytes = cadena.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            encriptacion = new String(base64Bytes);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal");
        }
        return encriptacion;
    }

    
  //Lo que tiene es que te genera claves distintas para el mismo resultado lo que hace imposible la comparacion en la DB
    public static void setCifrado(String key){
    String clave = key;

    byte[] keyData = clave.getBytes();

    SecretKeySpec ks = new SecretKeySpec(keyData,"Blowfish");

    try{
        Cipher cp = Cipher.getInstance("Blowfish");

        cp.init(Cipher.ENCRYPT_MODE,ks);

    secureKey = cp.doFinal(clave.getBytes());

    }catch(Exception e){
        e.printStackTrace();

    }

}    

public static byte[] getCifrado(){
return secureKey;
}


public static byte[] secureKey; //variable privada y estatica
}
