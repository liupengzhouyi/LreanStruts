package File.Tools;

import java.io.UnsupportedEncodingException;

public class MyUtil {
    public static String tiUTF8String(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        int len = string.length();
        for (int i=0;i<len;i++) {
            char c = string.charAt(i);
            if (c>=0 && c <= 255) {
                stringBuffer.append(c);
            } else {
                byte b[];
                try {
                    b = Character.toString(c).getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    b = null;
                }

                for (int j=0;j<b.length;j++) {
                    int k = b[j];
                    if (k < 0) {
                        k &= 255;
                    }
                    stringBuffer.append("%" + Integer.toHexString(k).toUpperCase());
                }
            }
        }
        return stringBuffer.toString();
    }
}
