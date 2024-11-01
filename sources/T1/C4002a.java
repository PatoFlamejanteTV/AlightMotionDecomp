package t1;

import com.google.gson.internal.e;
import j$.util.Objects;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4002a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Reader f39428a;

    /* renamed from: i, reason: collision with root package name */
    private long f39436i;

    /* renamed from: j, reason: collision with root package name */
    private int f39437j;

    /* renamed from: k, reason: collision with root package name */
    private String f39438k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f39439l;

    /* renamed from: n, reason: collision with root package name */
    private String[] f39441n;

    /* renamed from: o, reason: collision with root package name */
    private int[] f39442o;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39429b = false;

    /* renamed from: c, reason: collision with root package name */
    private final char[] f39430c = new char[1024];

    /* renamed from: d, reason: collision with root package name */
    private int f39431d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f39432e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f39433f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f39434g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f39435h = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f39440m = 1;

    /* renamed from: t1.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0888a extends e {
        C0888a() {
        }

        @Override // com.google.gson.internal.e
        public void a(C4002a c4002a) {
            int i8 = c4002a.f39435h;
            if (i8 == 0) {
                i8 = c4002a.i();
            }
            if (i8 == 13) {
                c4002a.f39435h = 9;
                return;
            }
            if (i8 == 12) {
                c4002a.f39435h = 8;
                return;
            }
            if (i8 == 14) {
                c4002a.f39435h = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + c4002a.N() + c4002a.z());
        }
    }

    static {
        e.f18979a = new C0888a();
    }

    public C4002a(Reader reader) {
        int[] iArr = new int[32];
        this.f39439l = iArr;
        iArr[0] = 6;
        this.f39441n = new String[32];
        this.f39442o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f39428a = reader;
    }

    private int I(boolean z8) {
        char[] cArr = this.f39430c;
        int i8 = this.f39431d;
        int i9 = this.f39432e;
        while (true) {
            if (i8 == i9) {
                this.f39431d = i8;
                if (!p(1)) {
                    if (!z8) {
                        return -1;
                    }
                    throw new EOFException("End of input" + z());
                }
                i8 = this.f39431d;
                i9 = this.f39432e;
            }
            int i10 = i8 + 1;
            char c8 = cArr[i8];
            if (c8 == '\n') {
                this.f39433f++;
                this.f39434g = i10;
            } else if (c8 != ' ' && c8 != '\r' && c8 != '\t') {
                if (c8 == '/') {
                    this.f39431d = i10;
                    if (i10 == i9) {
                        this.f39431d = i8;
                        boolean p8 = p(2);
                        this.f39431d++;
                        if (!p8) {
                            return c8;
                        }
                    }
                    g();
                    int i11 = this.f39431d;
                    char c9 = cArr[i11];
                    if (c9 != '*') {
                        if (c9 != '/') {
                            return c8;
                        }
                        this.f39431d = i11 + 1;
                        V();
                        i8 = this.f39431d;
                        i9 = this.f39432e;
                    } else {
                        this.f39431d = i11 + 1;
                        if (U("*/")) {
                            i8 = this.f39431d + 2;
                            i9 = this.f39432e;
                        } else {
                            throw Y("Unterminated comment");
                        }
                    }
                } else if (c8 == '#') {
                    this.f39431d = i10;
                    g();
                    V();
                    i8 = this.f39431d;
                    i9 = this.f39432e;
                } else {
                    this.f39431d = i10;
                    return c8;
                }
            }
            i8 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:            if (r1 != null) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:            r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:            r1.append(r0, r3, r2 - r3);        r9.f39431d = r2;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String K(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.f39430c
            r1 = 0
        L3:
            int r2 = r9.f39431d
            int r3 = r9.f39432e
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5a
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f39431d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4d
            r9.f39431d = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L3e
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L3e:
            r1.append(r0, r3, r2)
            char r2 = r9.R()
            r1.append(r2)
            int r2 = r9.f39431d
            int r3 = r9.f39432e
            goto L7
        L4d:
            r5 = 10
            if (r2 != r5) goto L58
            int r2 = r9.f39433f
            int r2 = r2 + r6
            r9.f39433f = r2
            r9.f39434g = r7
        L58:
            r2 = r7
            goto L9
        L5a:
            if (r1 != 0) goto L6a
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6a:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f39431d = r2
            boolean r2 = r9.p(r6)
            if (r2 == 0) goto L78
            goto L3
        L78:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.Y(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.C4002a.K(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:            g();     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String M() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f39431d
            int r4 = r3 + r2
            int r5 = r6.f39432e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f39430c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.g()
            goto L5c
        L4e:
            char[] r3 = r6.f39430c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.p(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f39430c
            int r4 = r6.f39431d
            r0.append(r3, r4, r2)
            int r3 = r6.f39431d
            int r3 = r3 + r2
            r6.f39431d = r3
            r2 = 1
            boolean r2 = r6.p(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f39430c
            int r3 = r6.f39431d
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f39430c
            int r3 = r6.f39431d
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f39431d
            int r2 = r2 + r1
            r6.f39431d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.C4002a.M():java.lang.String");
    }

    private int O() {
        String str;
        String str2;
        int i8;
        char c8 = this.f39430c[this.f39431d];
        if (c8 != 't' && c8 != 'T') {
            if (c8 != 'f' && c8 != 'F') {
                if (c8 != 'n' && c8 != 'N') {
                    return 0;
                }
                str = "null";
                str2 = "NULL";
                i8 = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i8 = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i8 = 5;
        }
        int length = str.length();
        for (int i9 = 1; i9 < length; i9++) {
            if (this.f39431d + i9 >= this.f39432e && !p(i9 + 1)) {
                return 0;
            }
            char c9 = this.f39430c[this.f39431d + i9];
            if (c9 != str.charAt(i9) && c9 != str2.charAt(i9)) {
                return 0;
            }
        }
        if ((this.f39431d + length < this.f39432e || p(length + 1)) && v(this.f39430c[this.f39431d + length])) {
            return 0;
        }
        this.f39431d += length;
        this.f39435h = i8;
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0095, code lost:            if (r9 != 2) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0097, code lost:            if (r10 == false) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:            if (r11 != Long.MIN_VALUE) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009f, code lost:            if (r13 == false) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:            if (r11 != 0) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:            if (r13 != false) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:            if (r13 == false) goto L65;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:            r11 = -r11;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:            r18.f39436i = r11;        r18.f39431d += r8;        r18.f39435h = 15;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:            return 15;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:            if (r9 == 2) goto L76;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:            if (r9 == 4) goto L76;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:            if (r9 != 7) goto L74;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:            return 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:            r18.f39437j = r8;        r18.f39435h = 16;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:            return 16;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0093, code lost:            if (v(r14) != false) goto L78;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cb, code lost:            return 0;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int P() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.C4002a.P():int");
    }

    private void Q(int i8) {
        int i9 = this.f39440m;
        int[] iArr = this.f39439l;
        if (i9 == iArr.length) {
            int i10 = i9 * 2;
            this.f39439l = Arrays.copyOf(iArr, i10);
            this.f39442o = Arrays.copyOf(this.f39442o, i10);
            this.f39441n = (String[]) Arrays.copyOf(this.f39441n, i10);
        }
        int[] iArr2 = this.f39439l;
        int i11 = this.f39440m;
        this.f39440m = i11 + 1;
        iArr2[i11] = i8;
    }

    private char R() {
        int i8;
        if (this.f39431d == this.f39432e && !p(1)) {
            throw Y("Unterminated escape sequence");
        }
        char[] cArr = this.f39430c;
        int i9 = this.f39431d;
        int i10 = i9 + 1;
        this.f39431d = i10;
        char c8 = cArr[i9];
        if (c8 != '\n') {
            if (c8 != '\"' && c8 != '\'' && c8 != '/' && c8 != '\\') {
                if (c8 != 'b') {
                    if (c8 != 'f') {
                        if (c8 == 'n') {
                            return '\n';
                        }
                        if (c8 != 'r') {
                            if (c8 != 't') {
                                if (c8 == 'u') {
                                    if (i9 + 5 > this.f39432e && !p(4)) {
                                        throw Y("Unterminated escape sequence");
                                    }
                                    int i11 = this.f39431d;
                                    int i12 = i11 + 4;
                                    char c9 = 0;
                                    while (i11 < i12) {
                                        char c10 = this.f39430c[i11];
                                        char c11 = (char) (c9 << 4);
                                        if (c10 >= '0' && c10 <= '9') {
                                            i8 = c10 - '0';
                                        } else if (c10 >= 'a' && c10 <= 'f') {
                                            i8 = c10 - 'W';
                                        } else if (c10 >= 'A' && c10 <= 'F') {
                                            i8 = c10 - '7';
                                        } else {
                                            throw new NumberFormatException("\\u" + new String(this.f39430c, this.f39431d, 4));
                                        }
                                        c9 = (char) (c11 + i8);
                                        i11++;
                                    }
                                    this.f39431d += 4;
                                    return c9;
                                }
                                throw Y("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.f39433f++;
            this.f39434g = i10;
        }
        return c8;
    }

    private void T(char c8) {
        char[] cArr = this.f39430c;
        do {
            int i8 = this.f39431d;
            int i9 = this.f39432e;
            while (i8 < i9) {
                int i10 = i8 + 1;
                char c9 = cArr[i8];
                if (c9 == c8) {
                    this.f39431d = i10;
                    return;
                }
                if (c9 == '\\') {
                    this.f39431d = i10;
                    R();
                    i8 = this.f39431d;
                    i9 = this.f39432e;
                } else {
                    if (c9 == '\n') {
                        this.f39433f++;
                        this.f39434g = i10;
                    }
                    i8 = i10;
                }
            }
            this.f39431d = i8;
        } while (p(1));
        throw Y("Unterminated string");
    }

    private boolean U(String str) {
        int length = str.length();
        while (true) {
            if (this.f39431d + length > this.f39432e && !p(length)) {
                return false;
            }
            char[] cArr = this.f39430c;
            int i8 = this.f39431d;
            if (cArr[i8] == '\n') {
                this.f39433f++;
                this.f39434g = i8 + 1;
            } else {
                for (int i9 = 0; i9 < length; i9++) {
                    if (this.f39430c[this.f39431d + i9] != str.charAt(i9)) {
                        break;
                    }
                }
                return true;
            }
            this.f39431d++;
        }
    }

    private void V() {
        char c8;
        do {
            if (this.f39431d < this.f39432e || p(1)) {
                char[] cArr = this.f39430c;
                int i8 = this.f39431d;
                int i9 = i8 + 1;
                this.f39431d = i9;
                c8 = cArr[i8];
                if (c8 == '\n') {
                    this.f39433f++;
                    this.f39434g = i9;
                    return;
                }
            } else {
                return;
            }
        } while (c8 != '\r');
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    private void W() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f39431d
            int r2 = r1 + r0
            int r3 = r4.f39432e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f39430c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.g()
        L4b:
            int r1 = r4.f39431d
            int r1 = r1 + r0
            r4.f39431d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f39431d = r1
            r0 = 1
            boolean r0 = r4.p(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.C4002a.W():void");
    }

    private IOException Y(String str) {
        throw new d(str + z());
    }

    private void g() {
        if (this.f39429b) {
        } else {
            throw Y("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void h() {
        I(true);
        int i8 = this.f39431d;
        this.f39431d = i8 - 1;
        if (i8 + 4 > this.f39432e && !p(5)) {
            return;
        }
        int i9 = this.f39431d;
        char[] cArr = this.f39430c;
        if (cArr[i9] == ')' && cArr[i9 + 1] == ']' && cArr[i9 + 2] == '}' && cArr[i9 + 3] == '\'' && cArr[i9 + 4] == '\n') {
            this.f39431d = i9 + 5;
        }
    }

    private boolean p(int i8) {
        int i9;
        int i10;
        char[] cArr = this.f39430c;
        int i11 = this.f39434g;
        int i12 = this.f39431d;
        this.f39434g = i11 - i12;
        int i13 = this.f39432e;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.f39432e = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.f39432e = 0;
        }
        this.f39431d = 0;
        do {
            Reader reader = this.f39428a;
            int i15 = this.f39432e;
            int read = reader.read(cArr, i15, cArr.length - i15);
            if (read == -1) {
                return false;
            }
            i9 = this.f39432e + read;
            this.f39432e = i9;
            if (this.f39433f == 0 && (i10 = this.f39434g) == 0 && i9 > 0 && cArr[0] == 65279) {
                this.f39431d++;
                this.f39434g = i10 + 1;
                i8++;
            }
        } while (i9 < i8);
        return true;
    }

    private String q(boolean z8) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i8 = 0;
        while (true) {
            int i9 = this.f39440m;
            if (i8 < i9) {
                int i10 = this.f39439l[i8];
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3 || i10 == 4 || i10 == 5) {
                        sb.append('.');
                        String str = this.f39441n[i8];
                        if (str != null) {
                            sb.append(str);
                        }
                    }
                } else {
                    int i11 = this.f39442o[i8];
                    if (z8 && i11 > 0 && i8 == i9 - 1) {
                        i11--;
                    }
                    sb.append('[');
                    sb.append(i11);
                    sb.append(']');
                }
                i8++;
            } else {
                return sb.toString();
            }
        }
    }

    private boolean v(char c8) {
        if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
            if (c8 != '#') {
                if (c8 != ',') {
                    if (c8 != '/' && c8 != '=') {
                        if (c8 != '{' && c8 != '}' && c8 != ':') {
                            if (c8 != ';') {
                                switch (c8) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            g();
            return false;
        }
        return false;
    }

    public boolean B() {
        int i8 = this.f39435h;
        if (i8 == 0) {
            i8 = i();
        }
        if (i8 == 5) {
            this.f39435h = 0;
            int[] iArr = this.f39442o;
            int i9 = this.f39440m - 1;
            iArr[i9] = iArr[i9] + 1;
            return true;
        }
        if (i8 == 6) {
            this.f39435h = 0;
            int[] iArr2 = this.f39442o;
            int i10 = this.f39440m - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + N() + z());
    }

    public double E() {
        char c8;
        int i8 = this.f39435h;
        if (i8 == 0) {
            i8 = i();
        }
        if (i8 == 15) {
            this.f39435h = 0;
            int[] iArr = this.f39442o;
            int i9 = this.f39440m - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.f39436i;
        }
        if (i8 == 16) {
            this.f39438k = new String(this.f39430c, this.f39431d, this.f39437j);
            this.f39431d += this.f39437j;
        } else if (i8 != 8 && i8 != 9) {
            if (i8 == 10) {
                this.f39438k = M();
            } else if (i8 != 11) {
                throw new IllegalStateException("Expected a double but was " + N() + z());
            }
        } else {
            if (i8 == 8) {
                c8 = '\'';
            } else {
                c8 = '\"';
            }
            this.f39438k = K(c8);
        }
        this.f39435h = 11;
        double parseDouble = Double.parseDouble(this.f39438k);
        if (!this.f39429b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + z());
        }
        this.f39438k = null;
        this.f39435h = 0;
        int[] iArr2 = this.f39442o;
        int i10 = this.f39440m - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return parseDouble;
    }

    public int F() {
        char c8;
        int i8 = this.f39435h;
        if (i8 == 0) {
            i8 = i();
        }
        if (i8 == 15) {
            long j8 = this.f39436i;
            int i9 = (int) j8;
            if (j8 == i9) {
                this.f39435h = 0;
                int[] iArr = this.f39442o;
                int i10 = this.f39440m - 1;
                iArr[i10] = iArr[i10] + 1;
                return i9;
            }
            throw new NumberFormatException("Expected an int but was " + this.f39436i + z());
        }
        if (i8 == 16) {
            this.f39438k = new String(this.f39430c, this.f39431d, this.f39437j);
            this.f39431d += this.f39437j;
        } else {
            if (i8 != 8 && i8 != 9 && i8 != 10) {
                throw new IllegalStateException("Expected an int but was " + N() + z());
            }
            if (i8 == 10) {
                this.f39438k = M();
            } else {
                if (i8 == 8) {
                    c8 = '\'';
                } else {
                    c8 = '\"';
                }
                this.f39438k = K(c8);
            }
            try {
                int parseInt = Integer.parseInt(this.f39438k);
                this.f39435h = 0;
                int[] iArr2 = this.f39442o;
                int i11 = this.f39440m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f39435h = 11;
        double parseDouble = Double.parseDouble(this.f39438k);
        int i12 = (int) parseDouble;
        if (i12 == parseDouble) {
            this.f39438k = null;
            this.f39435h = 0;
            int[] iArr3 = this.f39442o;
            int i13 = this.f39440m - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return i12;
        }
        throw new NumberFormatException("Expected an int but was " + this.f39438k + z());
    }

    public long G() {
        char c8;
        int i8 = this.f39435h;
        if (i8 == 0) {
            i8 = i();
        }
        if (i8 == 15) {
            this.f39435h = 0;
            int[] iArr = this.f39442o;
            int i9 = this.f39440m - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.f39436i;
        }
        if (i8 == 16) {
            this.f39438k = new String(this.f39430c, this.f39431d, this.f39437j);
            this.f39431d += this.f39437j;
        } else {
            if (i8 != 8 && i8 != 9 && i8 != 10) {
                throw new IllegalStateException("Expected a long but was " + N() + z());
            }
            if (i8 == 10) {
                this.f39438k = M();
            } else {
                if (i8 == 8) {
                    c8 = '\'';
                } else {
                    c8 = '\"';
                }
                this.f39438k = K(c8);
            }
            try {
                long parseLong = Long.parseLong(this.f39438k);
                this.f39435h = 0;
                int[] iArr2 = this.f39442o;
                int i10 = this.f39440m - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f39435h = 11;
        double parseDouble = Double.parseDouble(this.f39438k);
        long j8 = (long) parseDouble;
        if (j8 == parseDouble) {
            this.f39438k = null;
            this.f39435h = 0;
            int[] iArr3 = this.f39442o;
            int i11 = this.f39440m - 1;
            iArr3[i11] = iArr3[i11] + 1;
            return j8;
        }
        throw new NumberFormatException("Expected a long but was " + this.f39438k + z());
    }

    public String H() {
        String K8;
        int i8 = this.f39435h;
        if (i8 == 0) {
            i8 = i();
        }
        if (i8 == 14) {
            K8 = M();
        } else if (i8 == 12) {
            K8 = K('\'');
        } else if (i8 == 13) {
            K8 = K('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + N() + z());
        }
        this.f39435h = 0;
        this.f39441n[this.f39440m - 1] = K8;
        return K8;
    }

    public void J() {
        int i8 = this.f39435h;
        if (i8 == 0) {
            i8 = i();
        }
        if (i8 == 7) {
            this.f39435h = 0;
            int[] iArr = this.f39442o;
            int i9 = this.f39440m - 1;
            iArr[i9] = iArr[i9] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + N() + z());
    }

    public String L() {
        String str;
        int i8 = this.f39435h;
        if (i8 == 0) {
            i8 = i();
        }
        if (i8 == 10) {
            str = M();
        } else if (i8 == 8) {
            str = K('\'');
        } else if (i8 == 9) {
            str = K('\"');
        } else if (i8 == 11) {
            str = this.f39438k;
            this.f39438k = null;
        } else if (i8 == 15) {
            str = Long.toString(this.f39436i);
        } else if (i8 == 16) {
            str = new String(this.f39430c, this.f39431d, this.f39437j);
            this.f39431d += this.f39437j;
        } else {
            throw new IllegalStateException("Expected a string but was " + N() + z());
        }
        this.f39435h = 0;
        int[] iArr = this.f39442o;
        int i9 = this.f39440m - 1;
        iArr[i9] = iArr[i9] + 1;
        return str;
    }

    public EnumC4003b N() {
        int i8 = this.f39435h;
        if (i8 == 0) {
            i8 = i();
        }
        switch (i8) {
            case 1:
                return EnumC4003b.BEGIN_OBJECT;
            case 2:
                return EnumC4003b.END_OBJECT;
            case 3:
                return EnumC4003b.BEGIN_ARRAY;
            case 4:
                return EnumC4003b.END_ARRAY;
            case 5:
            case 6:
                return EnumC4003b.BOOLEAN;
            case 7:
                return EnumC4003b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC4003b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC4003b.NAME;
            case 15:
            case 16:
                return EnumC4003b.NUMBER;
            case 17:
                return EnumC4003b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void S(boolean z8) {
        this.f39429b = z8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    public void X() {
        int i8 = 0;
        do {
            int i9 = this.f39435h;
            if (i9 == 0) {
                i9 = i();
            }
            switch (i9) {
                case 1:
                    Q(3);
                    i8++;
                    this.f39435h = 0;
                    break;
                case 2:
                    if (i8 == 0) {
                        this.f39441n[this.f39440m - 1] = null;
                    }
                    this.f39440m--;
                    i8--;
                    this.f39435h = 0;
                    break;
                case 3:
                    Q(1);
                    i8++;
                    this.f39435h = 0;
                    break;
                case 4:
                    this.f39440m--;
                    i8--;
                    this.f39435h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f39435h = 0;
                    break;
                case 8:
                    T('\'');
                    this.f39435h = 0;
                    break;
                case 9:
                    T('\"');
                    this.f39435h = 0;
                    break;
                case 10:
                    W();
                    this.f39435h = 0;
                    break;
                case 12:
                    T('\'');
                    if (i8 == 0) {
                        this.f39441n[this.f39440m - 1] = "<skipped>";
                    }
                    this.f39435h = 0;
                    break;
                case 13:
                    T('\"');
                    if (i8 == 0) {
                        this.f39441n[this.f39440m - 1] = "<skipped>";
                    }
                    this.f39435h = 0;
                    break;
                case 14:
                    W();
                    if (i8 == 0) {
                        this.f39441n[this.f39440m - 1] = "<skipped>";
                    }
                    this.f39435h = 0;
                    break;
                case 16:
                    this.f39431d += this.f39437j;
                    this.f39435h = 0;
                    break;
                case 17:
                    return;
            }
        } while (i8 > 0);
        int[] iArr = this.f39442o;
        int i10 = this.f39440m - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public void a() {
        int i8 = this.f39435h;
        if (i8 == 0) {
            i8 = i();
        }
        if (i8 == 3) {
            Q(1);
            this.f39442o[this.f39440m - 1] = 0;
            this.f39435h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + N() + z());
        }
    }

    public void b() {
        int i8 = this.f39435h;
        if (i8 == 0) {
            i8 = i();
        }
        if (i8 == 1) {
            Q(3);
            this.f39435h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + N() + z());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39435h = 0;
        this.f39439l[0] = 8;
        this.f39440m = 1;
        this.f39428a.close();
    }

    public String getPath() {
        return q(false);
    }

    int i() {
        int I8;
        int[] iArr = this.f39439l;
        int i8 = this.f39440m;
        int i9 = iArr[i8 - 1];
        if (i9 == 1) {
            iArr[i8 - 1] = 2;
        } else if (i9 == 2) {
            int I9 = I(true);
            if (I9 != 44) {
                if (I9 != 59) {
                    if (I9 == 93) {
                        this.f39435h = 4;
                        return 4;
                    }
                    throw Y("Unterminated array");
                }
                g();
            }
        } else if (i9 != 3 && i9 != 5) {
            if (i9 == 4) {
                iArr[i8 - 1] = 5;
                int I10 = I(true);
                if (I10 != 58) {
                    if (I10 == 61) {
                        g();
                        if (this.f39431d < this.f39432e || p(1)) {
                            char[] cArr = this.f39430c;
                            int i10 = this.f39431d;
                            if (cArr[i10] == '>') {
                                this.f39431d = i10 + 1;
                            }
                        }
                    } else {
                        throw Y("Expected ':'");
                    }
                }
            } else if (i9 == 6) {
                if (this.f39429b) {
                    h();
                }
                this.f39439l[this.f39440m - 1] = 7;
            } else if (i9 == 7) {
                if (I(false) == -1) {
                    this.f39435h = 17;
                    return 17;
                }
                g();
                this.f39431d--;
            } else if (i9 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i8 - 1] = 4;
            if (i9 == 5 && (I8 = I(true)) != 44) {
                if (I8 != 59) {
                    if (I8 == 125) {
                        this.f39435h = 2;
                        return 2;
                    }
                    throw Y("Unterminated object");
                }
                g();
            }
            int I11 = I(true);
            if (I11 != 34) {
                if (I11 != 39) {
                    if (I11 != 125) {
                        g();
                        this.f39431d--;
                        if (v((char) I11)) {
                            this.f39435h = 14;
                            return 14;
                        }
                        throw Y("Expected name");
                    }
                    if (i9 != 5) {
                        this.f39435h = 2;
                        return 2;
                    }
                    throw Y("Expected name");
                }
                g();
                this.f39435h = 12;
                return 12;
            }
            this.f39435h = 13;
            return 13;
        }
        int I12 = I(true);
        if (I12 != 34) {
            if (I12 != 39) {
                if (I12 != 44 && I12 != 59) {
                    if (I12 != 91) {
                        if (I12 != 93) {
                            if (I12 != 123) {
                                this.f39431d--;
                                int O8 = O();
                                if (O8 != 0) {
                                    return O8;
                                }
                                int P8 = P();
                                if (P8 != 0) {
                                    return P8;
                                }
                                if (v(this.f39430c[this.f39431d])) {
                                    g();
                                    this.f39435h = 10;
                                    return 10;
                                }
                                throw Y("Expected value");
                            }
                            this.f39435h = 1;
                            return 1;
                        }
                        if (i9 == 1) {
                            this.f39435h = 4;
                            return 4;
                        }
                    } else {
                        this.f39435h = 3;
                        return 3;
                    }
                }
                if (i9 != 1 && i9 != 2) {
                    throw Y("Unexpected value");
                }
                g();
                this.f39431d--;
                this.f39435h = 7;
                return 7;
            }
            g();
            this.f39435h = 8;
            return 8;
        }
        this.f39435h = 9;
        return 9;
    }

    public void j() {
        int i8 = this.f39435h;
        if (i8 == 0) {
            i8 = i();
        }
        if (i8 == 4) {
            int i9 = this.f39440m;
            this.f39440m = i9 - 1;
            int[] iArr = this.f39442o;
            int i10 = i9 - 2;
            iArr[i10] = iArr[i10] + 1;
            this.f39435h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + N() + z());
    }

    public void k() {
        int i8 = this.f39435h;
        if (i8 == 0) {
            i8 = i();
        }
        if (i8 == 2) {
            int i9 = this.f39440m;
            int i10 = i9 - 1;
            this.f39440m = i10;
            this.f39441n[i10] = null;
            int[] iArr = this.f39442o;
            int i11 = i9 - 2;
            iArr[i11] = iArr[i11] + 1;
            this.f39435h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + N() + z());
    }

    public String r() {
        return q(true);
    }

    public boolean t() {
        int i8 = this.f39435h;
        if (i8 == 0) {
            i8 = i();
        }
        if (i8 != 2 && i8 != 4 && i8 != 17) {
            return true;
        }
        return false;
    }

    public String toString() {
        return getClass().getSimpleName() + z();
    }

    public final boolean u() {
        return this.f39429b;
    }

    String z() {
        return " at line " + (this.f39433f + 1) + " column " + ((this.f39431d - this.f39434g) + 1) + " path " + getPath();
    }
}
