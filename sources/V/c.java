package V;

import android.util.Base64;

/* loaded from: classes3.dex */
public abstract class c {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
