package c0;

import android.util.Base64;
import java.security.SecureRandom;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2005b {

    /* renamed from: a, reason: collision with root package name */
    private static final SecureRandom f15180a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f15180a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
