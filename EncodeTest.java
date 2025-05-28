import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodeTest {
    public static void main(String[] args) {
        String s = "hello";
        byte[] bytes = s.getBytes();
        Encoder encoder = Base64.getEncoder();
        String encoded = encoder.encodeToString(bytes);
        System.out.println("Encoded String: " + encoded);

        Decoder decoder = Base64.getDecoder();
        byte[] decoded = decoder.decode(encoded);
        System.out.println("Decoded String:" + new String(decoded));

        String url = "www.google.com/abcdef";
        String encodedUrl = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println(encodedUrl);
        String decodedURL = new String(Base64.getUrlDecoder().decode(encodedUrl));
        System.out.println(decodedURL);
    }
}
