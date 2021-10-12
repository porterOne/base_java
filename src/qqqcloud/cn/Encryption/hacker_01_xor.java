package qqqcloud.cn.Encryption;


import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class hacker_01_xor {
    // 加密的密钥，构造一定长度的字节数组
    private final static byte[] KEY_BYTES = "Vp6flFpGW86g7hi6MhD3Zl2eThJTjPnIjXE4".getBytes();
    private final static int KEY_LENGTH = KEY_BYTES.length;

    public static void main(String[] args) throws UnsupportedEncodingException {
        // 原始数据
        String str="我叫洪凯";
        // base64编码
        Base64.Encoder encoder= Base64.getEncoder();
        String base64encode = encoder.encodeToString(str.getBytes("UTF-8"));
        System.out.println("base64编码："+base64encode);

        // base64解码
        Base64.Decoder decoder=Base64.getDecoder();
        byte[] base64decode = decoder.decode(base64encode);
        System.out.println("base64解码："+new String(base64decode));


        System.out.println("加密前数据："+base64encode);
        byte[] EncryptionStr=xorEncode(base64encode.getBytes());
        System.out.println("xor加密后的数据为");
        System.out.println(new String(EncryptionStr));
        byte[] XORStr = xorDecode(EncryptionStr);
        System.out.println("xor解密后的数据");
        System.out.println(new String(XORStr));



    }

    /**
     * 异或运算加密
     *
     * @param input 要加密的内容
     * @return 加密后的数据
     */
    public static byte[] xorEncode(byte[] input) {
        int keyIndex = 0;
        int length = input.length;
        for (int i = 0; i < length; i++) {
            input[i] = (byte) (input[i] ^ KEY_BYTES[(keyIndex++ % KEY_LENGTH)]);
        }
        return input;
    }

    /**
     * 异或运算解密
     *
     * @param input 要解密的内容
     * @return 解密后的数据
     */
    public static byte[] xorDecode(byte[] input) {
        int keyIndex = 0;
        int length = input.length;
        for (int i = 0; i < length; i++) {
            input[i] = (byte) (input[i] ^ KEY_BYTES[(keyIndex++ % KEY_LENGTH)]);
        }
        return input;
    }
}
