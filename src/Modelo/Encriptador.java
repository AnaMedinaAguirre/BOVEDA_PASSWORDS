package Modelo;

import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Encriptador {    
    
    
    
    public static String encriptar(String texto, String clave) {
        
        try {
            byte[] clavePrueba;
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            SecretKeySpec secretKey = new SecretKeySpec(clave.getBytes(), "AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] textoEncriptado = cipher.doFinal(texto.getBytes());
            return Base64.getEncoder().encodeToString(textoEncriptado);
            //return Base64.getDecoder().decode("mnP6f0jSIx3RLOHjUZ+DxQ==");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static String generarClaveAleatoria() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] clave = new byte[16];
        secureRandom.nextBytes(clave);
        return Base64.getEncoder().encodeToString(clave);
    }

 
/*
// Método para normalizar la longitud de la clave
private static String normalizarClave(String clave) {
    StringBuilder claveNormalizada = new StringBuilder(16);
    claveNormalizada.append(clave);

    // Asegurar que la clave tenga una longitud de 16 caracteres
    while (claveNormalizada.length() < 16) {
        claveNormalizada.append(' ');
    }

    return claveNormalizada.substring(0, 16);
}
*/
}