package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.t4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2256t4 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f17010a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f17011b;

    static {
        Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.ASCII_NAME);
        f17010a = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f17011b = bArr;
        ByteBuffer.wrap(bArr);
        V3.c(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    public static int b(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static int c(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        int a9 = a(length, bArr, 0, length);
        if (a9 == 0) {
            return 1;
        }
        return a9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(Y4 y42) {
        return false;
    }
}
