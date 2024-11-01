package L6;

import K6.A;
import K6.r;
import K6.y;
import U6.C1449e;
import U6.C1452h;
import U6.Z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f5410a;

    /* renamed from: c, reason: collision with root package name */
    public static final A f5412c;

    /* renamed from: d, reason: collision with root package name */
    public static final y f5413d;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f5411b = new String[0];

    /* renamed from: e, reason: collision with root package name */
    private static final C1452h f5414e = C1452h.d("efbbbf");

    /* renamed from: f, reason: collision with root package name */
    private static final C1452h f5415f = C1452h.d("feff");

    /* renamed from: g, reason: collision with root package name */
    private static final C1452h f5416g = C1452h.d("fffe");

    /* renamed from: h, reason: collision with root package name */
    private static final C1452h f5417h = C1452h.d("0000ffff");

    /* renamed from: i, reason: collision with root package name */
    private static final C1452h f5418i = C1452h.d("ffff0000");

    /* renamed from: j, reason: collision with root package name */
    public static final Charset f5419j = Charset.forName(C.UTF8_NAME);

    /* renamed from: k, reason: collision with root package name */
    public static final Charset f5420k = Charset.forName("ISO-8859-1");

    /* renamed from: l, reason: collision with root package name */
    private static final Charset f5421l = Charset.forName("UTF-16BE");

    /* renamed from: m, reason: collision with root package name */
    private static final Charset f5422m = Charset.forName("UTF-16LE");

    /* renamed from: n, reason: collision with root package name */
    private static final Charset f5423n = Charset.forName("UTF-32BE");

    /* renamed from: o, reason: collision with root package name */
    private static final Charset f5424o = Charset.forName("UTF-32LE");

    /* renamed from: p, reason: collision with root package name */
    public static final TimeZone f5425p = DesugarTimeZone.getTimeZone("GMT");

    /* renamed from: q, reason: collision with root package name */
    public static final Comparator f5426q = new a();

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f5427r = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* loaded from: classes5.dex */
    final class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* loaded from: classes5.dex */
    final class b implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5428a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5429b;

        b(String str, boolean z8) {
            this.f5428a = str;
            this.f5429b = z8;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f5428a);
            thread.setDaemon(this.f5429b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f5410a = bArr;
        f5412c = A.g(null, bArr);
        f5413d = y.c(null, bArr);
    }

    public static int A(String str, int i8, int i9) {
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10 + 1;
            }
        }
        return i8;
    }

    public static ThreadFactory B(String str, boolean z8) {
        return new b(str, z8);
    }

    public static String C(String str, int i8, int i9) {
        int z8 = z(str, i8, i9);
        return str.substring(z8, A(str, z8, i9));
    }

    public static boolean D(String str) {
        return f5427r.matcher(str).matches();
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static String b(String str) {
        InetAddress j8;
        if (str.contains(":")) {
            if (str.startsWith("[") && str.endsWith("]")) {
                j8 = j(str, 1, str.length() - 1);
            } else {
                j8 = j(str, 0, str.length());
            }
            if (j8 == null) {
                return null;
            }
            byte[] address = j8.getAddress();
            if (address.length == 16) {
                return u(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (g(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void c(long j8, long j9, long j10) {
        if ((j9 | j10) >= 0 && j9 <= j8 && j8 - j9 >= j10) {
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    public static void e(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e8) {
                if (!w(e8)) {
                    throw e8;
                }
            } catch (RuntimeException e9) {
                throw e9;
            } catch (Exception unused) {
            }
        }
    }

    public static String[] f(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }

    private static boolean g(String str) {
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int h(char c8) {
        if (c8 >= '0' && c8 <= '9') {
            return c8 - '0';
        }
        if (c8 >= 'a' && c8 <= 'f') {
            return c8 - 'W';
        }
        if (c8 >= 'A' && c8 <= 'F') {
            return c8 - '7';
        }
        return -1;
    }

    private static boolean i(String str, int i8, int i9, byte[] bArr, int i10) {
        int i11 = i10;
        while (i8 < i9) {
            if (i11 == bArr.length) {
                return false;
            }
            if (i11 != i10) {
                if (str.charAt(i8) != '.') {
                    return false;
                }
                i8++;
            }
            int i12 = i8;
            int i13 = 0;
            while (i12 < i9) {
                char charAt = str.charAt(i12);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                if ((i13 == 0 && i8 != i12) || (i13 = ((i13 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i12++;
            }
            if (i12 - i8 == 0) {
                return false;
            }
            bArr[i11] = (byte) i13;
            i11++;
            i8 = i12;
        }
        if (i11 != i10 + 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:            return null;     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.InetAddress j(java.lang.String r12, int r13, int r14) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L9:
            r7 = 0
            if (r13 >= r14) goto L79
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r13 + 2
            r9 = 2
            if (r8 > r14) goto L27
            java.lang.String r10 = "::"
            boolean r10 = r12.regionMatches(r13, r10, r2, r9)
            if (r10 == 0) goto L27
            if (r5 == r3) goto L1f
            return r7
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r14) goto L25
            goto L79
        L25:
            r6 = r8
            goto L4b
        L27:
            if (r4 == 0) goto L34
            java.lang.String r8 = ":"
            r10 = 1
            boolean r8 = r12.regionMatches(r13, r8, r2, r10)
            if (r8 == 0) goto L36
            int r13 = r13 + 1
        L34:
            r6 = r13
            goto L4b
        L36:
            java.lang.String r8 = "."
            boolean r13 = r12.regionMatches(r13, r8, r2, r10)
            if (r13 == 0) goto L4a
            int r13 = r4 + (-2)
            boolean r12 = i(r12, r6, r14, r1, r13)
            if (r12 != 0) goto L47
            return r7
        L47:
            int r4 = r4 + 2
            goto L79
        L4a:
            return r7
        L4b:
            r13 = r6
            r8 = 0
        L4d:
            if (r13 >= r14) goto L60
            char r10 = r12.charAt(r13)
            int r10 = h(r10)
            if (r10 != r3) goto L5a
            goto L60
        L5a:
            int r8 = r8 << 4
            int r8 = r8 + r10
            int r13 = r13 + 1
            goto L4d
        L60:
            int r10 = r13 - r6
            if (r10 == 0) goto L78
            r11 = 4
            if (r10 <= r11) goto L68
            goto L78
        L68:
            int r7 = r4 + 1
            int r10 = r8 >>> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r1[r4] = r10
            int r4 = r4 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L78:
            return r7
        L79:
            if (r4 == r0) goto L8a
            if (r5 != r3) goto L7e
            return r7
        L7e:
            int r12 = r4 - r5
            int r13 = 16 - r12
            java.lang.System.arraycopy(r1, r5, r1, r13, r12)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L8a:
            java.net.InetAddress r12 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L8f
            return r12
        L8f:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: L6.c.j(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int k(String str, int i8, int i9, char c8) {
        while (i8 < i9) {
            if (str.charAt(i8) == c8) {
                return i8;
            }
            i8++;
        }
        return i9;
    }

    public static int l(String str, int i8, int i9, String str2) {
        while (i8 < i9) {
            if (str2.indexOf(str.charAt(i8)) != -1) {
                return i8;
            }
            i8++;
        }
        return i9;
    }

    public static boolean m(Z z8, int i8, TimeUnit timeUnit) {
        try {
            return y(z8, i8, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static String o(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String p(r rVar, boolean z8) {
        String k8;
        if (rVar.k().contains(":")) {
            k8 = "[" + rVar.k() + "]";
        } else {
            k8 = rVar.k();
        }
        if (z8 || rVar.w() != r.d(rVar.A())) {
            return k8 + ":" + rVar.w();
        }
        return k8;
    }

    public static List q(List list) {
        return DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    public static List r(Object... objArr) {
        return DesugarCollections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static int s(Comparator comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (comparator.compare(strArr[i8], str) == 0) {
                return i8;
            }
        }
        return -1;
    }

    public static int t(String str) {
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (charAt <= 31 || charAt >= 127) {
                return i8;
            }
        }
        return -1;
    }

    private static String u(byte[] bArr) {
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            int i12 = i10;
            while (i12 < 16 && bArr[i12] == 0 && bArr[i12 + 1] == 0) {
                i12 += 2;
            }
            int i13 = i12 - i10;
            if (i13 > i11 && i13 >= 4) {
                i8 = i10;
                i11 = i13;
            }
            i10 = i12 + 2;
        }
        C1449e c1449e = new C1449e();
        while (i9 < bArr.length) {
            if (i9 == i8) {
                c1449e.writeByte(58);
                i9 += i11;
                if (i9 == 16) {
                    c1449e.writeByte(58);
                }
            } else {
                if (i9 > 0) {
                    c1449e.writeByte(58);
                }
                c1449e.writeHexadecimalUnsignedLong(((bArr[i9] & 255) << 8) | (bArr[i9 + 1] & 255));
                i9 += 2;
            }
        }
        return c1449e.readUtf8();
    }

    public static String[] v(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i8]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i8++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean w(AssertionError assertionError) {
        if (assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains("getsockname failed")) {
            return true;
        }
        return false;
    }

    public static boolean x(Comparator comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean y(Z z8, int i8, TimeUnit timeUnit) {
        long j8;
        long nanoTime = System.nanoTime();
        if (z8.timeout().e()) {
            j8 = z8.timeout().c() - nanoTime;
        } else {
            j8 = Long.MAX_VALUE;
        }
        z8.timeout().d(Math.min(j8, timeUnit.toNanos(i8)) + nanoTime);
        try {
            C1449e c1449e = new C1449e();
            while (z8.m(c1449e, 8192L) != -1) {
                c1449e.a();
            }
            if (j8 == Long.MAX_VALUE) {
                z8.timeout().a();
                return true;
            }
            z8.timeout().d(nanoTime + j8);
            return true;
        } catch (InterruptedIOException unused) {
            if (j8 == Long.MAX_VALUE) {
                z8.timeout().a();
                return false;
            }
            z8.timeout().d(nanoTime + j8);
            return false;
        } catch (Throwable th) {
            if (j8 == Long.MAX_VALUE) {
                z8.timeout().a();
            } else {
                z8.timeout().d(nanoTime + j8);
            }
            throw th;
        }
    }

    public static int z(String str, int i8, int i9) {
        while (i8 < i9) {
            char charAt = str.charAt(i8);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i8;
            }
            i8++;
        }
        return i9;
    }
}
