package P7;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;

/* loaded from: classes5.dex */
public abstract class b {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            sb.append("0123456789ABCDEF".charAt((b9 & 240) >> 4));
            sb.append("0123456789ABCDEF".charAt(b9 & 15));
        }
        return sb.toString();
    }

    public static String b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        messageDigest.update(str.getBytes());
        return a(messageDigest.digest());
    }
}
