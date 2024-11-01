package okhttp3.internal.publicsuffix;

import L6.c;
import S6.f;
import U6.C1459o;
import U6.InterfaceC1451g;
import U6.L;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f36062e = {42};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f36063f = new String[0];

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f36064g = {"*"};

    /* renamed from: h, reason: collision with root package name */
    private static final PublicSuffixDatabase f36065h = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f36066a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final CountDownLatch f36067b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    private byte[] f36068c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f36069d;

    private static String a(byte[] bArr, byte[][] bArr2, int i8) {
        int i9;
        boolean z8;
        int i10;
        int i11;
        int length = bArr.length;
        int i12 = 0;
        while (i12 < length) {
            int i13 = (i12 + length) / 2;
            while (i13 > -1 && bArr[i13] != 10) {
                i13--;
            }
            int i14 = i13 + 1;
            int i15 = 1;
            while (true) {
                i9 = i14 + i15;
                if (bArr[i9] == 10) {
                    break;
                }
                i15++;
            }
            int i16 = i9 - i14;
            int i17 = i8;
            boolean z9 = false;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                if (z9) {
                    i10 = 46;
                    z8 = false;
                } else {
                    z8 = z9;
                    i10 = bArr2[i17][i18] & 255;
                }
                i11 = i10 - (bArr[i14 + i19] & 255);
                if (i11 == 0) {
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length == i18) {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        z9 = true;
                        i18 = -1;
                    } else {
                        z9 = z8;
                    }
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                if (i11 <= 0) {
                    int i20 = i16 - i19;
                    int length2 = bArr2[i17].length - i18;
                    while (true) {
                        i17++;
                        if (i17 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i17].length;
                    }
                    if (length2 >= i20) {
                        if (length2 <= i20) {
                            return new String(bArr, i14, i16, c.f5419j);
                        }
                    }
                }
                i12 = i9 + 1;
            }
            length = i13;
        }
        return null;
    }

    private String[] b(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        int i8 = 0;
        if (!this.f36066a.get() && this.f36066a.compareAndSet(false, true)) {
            f();
        } else {
            try {
                this.f36067b.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            if (this.f36068c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length];
        for (int i9 = 0; i9 < strArr.length; i9++) {
            bArr[i9] = strArr[i9].getBytes(c.f5419j);
        }
        int i10 = 0;
        while (true) {
            str = null;
            if (i10 < length) {
                str2 = a(this.f36068c, bArr, i10);
                if (str2 != null) {
                    break;
                }
                i10++;
            } else {
                str2 = null;
                break;
            }
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i11 = 0; i11 < bArr2.length - 1; i11++) {
                bArr2[i11] = f36062e;
                str3 = a(this.f36068c, bArr2, i11);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i8 >= length - 1) {
                    break;
                }
                String a9 = a(this.f36069d, bArr, i8);
                if (a9 != null) {
                    str = a9;
                    break;
                }
                i8++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        }
        if (str2 == null && str3 == null) {
            return f36064g;
        }
        if (str2 != null) {
            strArr2 = str2.split("\\.");
        } else {
            strArr2 = f36063f;
        }
        if (str3 != null) {
            strArr3 = str3.split("\\.");
        } else {
            strArr3 = f36063f;
        }
        if (strArr2.length <= strArr3.length) {
            return strArr3;
        }
        return strArr2;
    }

    public static PublicSuffixDatabase c() {
        return f36065h;
    }

    private void e() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(com.mbridge.msdk.thrid.okhttp.internal.publicsuffix.PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        InterfaceC1451g d8 = L.d(new C1459o(L.l(resourceAsStream)));
        try {
            byte[] bArr = new byte[d8.readInt()];
            d8.readFully(bArr);
            byte[] bArr2 = new byte[d8.readInt()];
            d8.readFully(bArr2);
            synchronized (this) {
                this.f36068c = bArr;
                this.f36069d = bArr2;
            }
            this.f36067b.countDown();
        } finally {
            c.d(d8);
        }
    }

    private void f() {
        boolean z8 = false;
        while (true) {
            try {
                try {
                    e();
                    break;
                } catch (InterruptedIOException unused) {
                    z8 = true;
                } catch (IOException e8) {
                    f.i().p(5, "Failed to read public suffix list", e8);
                    if (z8) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    public String d(String str) {
        int length;
        int length2;
        if (str != null) {
            String[] split = IDN.toUnicode(str).split("\\.");
            String[] b9 = b(split);
            if (split.length == b9.length && b9[0].charAt(0) != '!') {
                return null;
            }
            if (b9[0].charAt(0) == '!') {
                length = split.length;
                length2 = b9.length;
            } else {
                length = split.length;
                length2 = b9.length + 1;
            }
            StringBuilder sb = new StringBuilder();
            String[] split2 = str.split("\\.");
            for (int i8 = length - length2; i8 < split2.length; i8++) {
                sb.append(split2[i8]);
                sb.append('.');
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new NullPointerException("domain == null");
    }
}
