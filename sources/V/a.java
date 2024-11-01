package V;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public abstract class a {
    public static byte[] a(Context context, String str) {
        MessageDigest b9;
        PackageInfo e8 = X.e.a(context).e(str, 64);
        Signature[] signatureArr = e8.signatures;
        if (signatureArr != null && signatureArr.length == 1 && (b9 = b("SHA1")) != null) {
            return b9.digest(e8.signatures[0].toByteArray());
        }
        return null;
    }

    public static MessageDigest b(String str) {
        MessageDigest messageDigest;
        for (int i8 = 0; i8 < 2; i8++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
