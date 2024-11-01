package c2;

/* loaded from: classes4.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    s f15326a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f15327b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f15328c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f15329d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f15330e;

    /* renamed from: f, reason: collision with root package name */
    private short f15331f;

    /* renamed from: g, reason: collision with root package name */
    private short f15332g;

    /* renamed from: h, reason: collision with root package name */
    private int f15333h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f15334i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(s sVar) {
        this.f15326a = sVar;
    }

    private void b(int i8) {
        if (this.f15334i == null) {
            this.f15334i = new int[2];
        }
        int length = this.f15334i.length;
        int i9 = this.f15333h;
        if (i9 >= length) {
            int[] iArr = new int[Math.max(i9 + 1, length * 2)];
            System.arraycopy(this.f15334i, 0, iArr, 0, length);
            this.f15334i = iArr;
        }
        int[] iArr2 = this.f15334i;
        int i10 = this.f15333h;
        this.f15333h = i10 + 1;
        iArr2[i10] = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(C2012C c2012c, Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() | 4194304;
        }
        if (obj instanceof String) {
            return f(c2012c, C2013D.j((String) obj).d(), 0);
        }
        return c2012c.K("", ((s) obj).f15350d) | 12582912;
    }

    private static int f(C2012C c2012c, String str, int i8) {
        char charAt = str.charAt(i8);
        int i9 = 4194306;
        if (charAt == 'F') {
            return 4194306;
        }
        if (charAt != 'L') {
            if (charAt != 'S') {
                if (charAt != 'V') {
                    if (charAt != 'I') {
                        if (charAt == 'J') {
                            return 4194308;
                        }
                        if (charAt != 'Z') {
                            if (charAt != '[') {
                                switch (charAt) {
                                    case 'B':
                                    case 'C':
                                        break;
                                    case 'D':
                                        return 4194307;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                int i10 = i8 + 1;
                                while (str.charAt(i10) == '[') {
                                    i10++;
                                }
                                char charAt2 = str.charAt(i10);
                                if (charAt2 != 'F') {
                                    if (charAt2 != 'L') {
                                        if (charAt2 != 'S') {
                                            if (charAt2 != 'Z') {
                                                if (charAt2 != 'I') {
                                                    if (charAt2 != 'J') {
                                                        switch (charAt2) {
                                                            case 'B':
                                                                i9 = 4194314;
                                                                break;
                                                            case 'C':
                                                                i9 = 4194315;
                                                                break;
                                                            case 'D':
                                                                i9 = 4194307;
                                                                break;
                                                            default:
                                                                throw new IllegalArgumentException();
                                                        }
                                                    } else {
                                                        i9 = 4194308;
                                                    }
                                                } else {
                                                    i9 = 4194305;
                                                }
                                            } else {
                                                i9 = 4194313;
                                            }
                                        } else {
                                            i9 = 4194316;
                                        }
                                    } else {
                                        i9 = c2012c.I(str.substring(i10 + 1, str.length() - 1)) | 8388608;
                                    }
                                }
                                return ((i10 - i8) << 26) | i9;
                            }
                        }
                    }
                } else {
                    return 0;
                }
            }
            return 4194305;
        }
        return c2012c.I(str.substring(i8 + 1, str.length() - 1)) | 8388608;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(C2012C c2012c, String str) {
        return c2012c.I(str) | 8388608;
    }

    private int h(int i8, int i9) {
        int i10 = (-67108864) & i8;
        int i11 = 62914560 & i8;
        if (i11 == 16777216) {
            int i12 = i10 + this.f15327b[i8 & 1048575];
            if ((i8 & 1048576) != 0 && (i12 == 4194308 || i12 == 4194307)) {
                return 4194304;
            }
            return i12;
        }
        if (i11 == 20971520) {
            int i13 = i10 + this.f15328c[i9 - (i8 & 1048575)];
            if ((i8 & 1048576) != 0 && (i13 == 4194308 || i13 == 4194307)) {
                return 4194304;
            }
            return i13;
        }
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[LOOP:0: B:8:0x000d->B:15:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int i(c2.C2012C r9, int r10) {
        /*
            r8 = this;
            r0 = 4194310(0x400006, float:5.87748E-39)
            if (r10 == r0) goto Lc
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r1 & r10
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 != r2) goto L54
        Lc:
            r1 = 0
        Ld:
            int r2 = r8.f15333h
            if (r1 >= r2) goto L54
            int[] r2 = r8.f15334i
            r2 = r2[r1]
            r3 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r3 = r3 & r2
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2 & r5
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 != r7) goto L2a
            int[] r2 = r8.f15327b
            r2 = r2[r6]
        L28:
            int r2 = r2 + r3
            goto L35
        L2a:
            r7 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r7) goto L35
            int[] r2 = r8.f15328c
            int r4 = r2.length
            int r4 = r4 - r6
            r2 = r2[r4]
            goto L28
        L35:
            if (r10 != r2) goto L51
            r1 = 8388608(0x800000, float:1.1754944E-38)
            if (r10 != r0) goto L45
            java.lang.String r10 = r9.O()
            int r9 = r9.I(r10)
        L43:
            r9 = r9 | r1
            return r9
        L45:
            r10 = r10 & r5
            c2.B r10 = r9.T(r10)
            java.lang.String r10 = r10.f15195e
            int r9 = r9.I(r10)
            goto L43
        L51:
            int r1 = r1 + 1
            goto Ld
        L54:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.p.i(c2.C, int):int");
    }

    private int k(int i8) {
        int[] iArr = this.f15329d;
        if (iArr != null && i8 < iArr.length) {
            int i9 = iArr[i8];
            if (i9 == 0) {
                int i10 = i8 | 16777216;
                iArr[i8] = i10;
                return i10;
            }
            return i9;
        }
        return i8 | 16777216;
    }

    private static boolean l(C2012C c2012c, int i8, int[] iArr, int i9) {
        int min;
        int I8;
        int i10 = iArr[i9];
        if (i10 == i8) {
            return false;
        }
        if ((67108863 & i8) == 4194309) {
            if (i10 == 4194309) {
                return false;
            }
            i8 = 4194309;
        }
        if (i10 == 0) {
            iArr[i9] = i8;
            return true;
        }
        int i11 = i10 & (-67108864);
        int i12 = 4194304;
        if (i11 == 0 && (i10 & 62914560) != 8388608) {
            if (i10 == 4194309) {
                if ((i8 & (-67108864)) == 0 && (i8 & 62914560) != 8388608) {
                    i8 = 4194304;
                }
                i12 = i8;
            }
        } else {
            if (i8 == 4194309) {
                return false;
            }
            if ((i8 & (-4194304)) == ((-4194304) & i10)) {
                if ((i10 & 62914560) == 8388608) {
                    i12 = (i8 & (-67108864)) | 8388608 | c2012c.H(i8 & 1048575, 1048575 & i10);
                } else {
                    min = ((i8 & (-67108864)) - 67108864) | 8388608;
                    I8 = c2012c.I("java/lang/Object");
                    i12 = min | I8;
                }
            } else {
                int i13 = i8 & (-67108864);
                if (i13 != 0 || (i8 & 62914560) == 8388608) {
                    if (i13 != 0 && (i8 & 62914560) != 8388608) {
                        i13 -= 67108864;
                    }
                    if (i11 != 0 && (i10 & 62914560) != 8388608) {
                        i11 -= 67108864;
                    }
                    min = Math.min(i13, i11) | 8388608;
                    I8 = c2012c.I("java/lang/Object");
                    i12 = min | I8;
                }
            }
        }
        if (i12 == i10) {
            return false;
        }
        iArr[i9] = i12;
        return true;
    }

    private int n() {
        short s8 = this.f15332g;
        if (s8 > 0) {
            int[] iArr = this.f15330e;
            short s9 = (short) (s8 - 1);
            this.f15332g = s9;
            return iArr[s9];
        }
        short s10 = (short) (this.f15331f - 1);
        this.f15331f = s10;
        return (-s10) | 20971520;
    }

    private void o(int i8) {
        short s8 = this.f15332g;
        if (s8 >= i8) {
            this.f15332g = (short) (s8 - i8);
        } else {
            this.f15331f = (short) (this.f15331f - (i8 - s8));
            this.f15332g = (short) 0;
        }
    }

    private void p(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            o((C2013D.c(str) >> 2) - 1);
        } else if (charAt != 'J' && charAt != 'D') {
            o(1);
        } else {
            o(2);
        }
    }

    private void q(int i8) {
        if (this.f15330e == null) {
            this.f15330e = new int[10];
        }
        int length = this.f15330e.length;
        short s8 = this.f15332g;
        if (s8 >= length) {
            int[] iArr = new int[Math.max(s8 + 1, length * 2)];
            System.arraycopy(this.f15330e, 0, iArr, 0, length);
            this.f15330e = iArr;
        }
        int[] iArr2 = this.f15330e;
        short s9 = this.f15332g;
        short s10 = (short) (s9 + 1);
        this.f15332g = s10;
        iArr2[s9] = i8;
        short s11 = (short) (this.f15331f + s10);
        s sVar = this.f15326a;
        if (s11 > sVar.f15354h) {
            sVar.f15354h = s11;
        }
    }

    private void r(C2012C c2012c, String str) {
        int i8 = 0;
        if (str.charAt(0) == '(') {
            i8 = C2013D.k(str);
        }
        int f8 = f(c2012c, str, i8);
        if (f8 != 0) {
            q(f8);
            if (f8 == 4194308 || f8 == 4194307) {
                q(4194304);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0084. Please report as an issue. */
    public static void s(C2012C c2012c, int i8, C2018d c2018d) {
        int i9 = ((-67108864) & i8) >> 26;
        if (i9 == 0) {
            int i10 = i8 & 1048575;
            int i11 = i8 & 62914560;
            if (i11 != 4194304) {
                if (i11 != 8388608) {
                    if (i11 == 12582912) {
                        c2018d.g(8).k((int) c2012c.T(i10).f15196f);
                        return;
                    }
                    throw new AssertionError();
                }
                c2018d.g(7).k(c2012c.e(c2012c.T(i10).f15195e).f15191a);
                return;
            }
            c2018d.g(i10);
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i12 = i9 - 1;
            if (i9 <= 0) {
                break;
            }
            sb.append('[');
            i9 = i12;
        }
        if ((i8 & 62914560) == 8388608) {
            sb.append('L');
            sb.append(c2012c.T(i8 & 1048575).f15195e);
            sb.append(';');
        } else {
            int i13 = i8 & 1048575;
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            switch (i13) {
                                case 9:
                                    sb.append('Z');
                                    break;
                                case 10:
                                    sb.append('B');
                                    break;
                                case 11:
                                    sb.append('C');
                                    break;
                                case 12:
                                    sb.append('S');
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                        } else {
                            sb.append('J');
                        }
                    } else {
                        sb.append('D');
                    }
                } else {
                    sb.append('F');
                }
            } else {
                sb.append('I');
            }
        }
        c2018d.g(7).k(c2012c.e(sb.toString()).f15191a);
    }

    private void v(int i8, int i9) {
        if (this.f15329d == null) {
            this.f15329d = new int[10];
        }
        int length = this.f15329d.length;
        if (i8 >= length) {
            int[] iArr = new int[Math.max(i8 + 1, length * 2)];
            System.arraycopy(this.f15329d, 0, iArr, 0, length);
            this.f15329d = iArr;
        }
        this.f15329d[i8] = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(v vVar) {
        int i8;
        int i9;
        int i10;
        int[] iArr = this.f15327b;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            int i14 = 0;
            while (true) {
                int i15 = 2;
                if (i12 >= iArr.length) {
                    break loop0;
                }
                int i16 = iArr[i12];
                if (i16 != 4194308 && i16 != 4194307) {
                    i15 = 1;
                }
                i12 += i15;
                if (i16 == 4194304) {
                    i14++;
                }
            }
            i13 += i14 + 1;
        }
        int[] iArr2 = this.f15328c;
        int i17 = 0;
        int i18 = 0;
        while (i17 < iArr2.length) {
            int i19 = iArr2[i17];
            if (i19 != 4194308 && i19 != 4194307) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            i17 += i10;
            i18++;
        }
        int V8 = vVar.V(this.f15326a.f15350d, i13, i18);
        int i20 = 0;
        while (true) {
            int i21 = i13 - 1;
            if (i13 <= 0) {
                break;
            }
            int i22 = iArr[i20];
            if (i22 != 4194308 && i22 != 4194307) {
                i9 = 1;
            } else {
                i9 = 2;
            }
            i20 += i9;
            vVar.T(V8, i22);
            i13 = i21;
            V8++;
        }
        while (true) {
            int i23 = i18 - 1;
            if (i18 > 0) {
                int i24 = iArr2[i11];
                if (i24 != 4194308 && i24 != 4194307) {
                    i8 = 1;
                } else {
                    i8 = 2;
                }
                i11 += i8;
                vVar.T(V8, i24);
                V8++;
                i18 = i23;
            } else {
                vVar.U();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(p pVar) {
        this.f15327b = pVar.f15327b;
        this.f15328c = pVar.f15328c;
        this.f15331f = (short) 0;
        this.f15329d = pVar.f15329d;
        this.f15330e = pVar.f15330e;
        this.f15332g = pVar.f15332g;
        this.f15333h = pVar.f15333h;
        this.f15334i = pVar.f15334i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0027. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0356  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(int r17, int r18, c2.AbstractC2011B r19, c2.C2012C r20) {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.p.d(int, int, c2.B, c2.C):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int j() {
        return this.f15328c.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(C2012C c2012c, p pVar, int i8) {
        boolean z8;
        int i9;
        int length = this.f15327b.length;
        int length2 = this.f15328c.length;
        boolean z9 = true;
        if (pVar.f15327b == null) {
            pVar.f15327b = new int[length];
            z8 = true;
        } else {
            z8 = false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            int[] iArr = this.f15329d;
            if (iArr != null && i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 == 0) {
                    i9 = this.f15327b[i10];
                } else {
                    i9 = h(i11, length2);
                }
            } else {
                i9 = this.f15327b[i10];
            }
            if (this.f15334i != null) {
                i9 = i(c2012c, i9);
            }
            z8 |= l(c2012c, i9, pVar.f15327b, i10);
        }
        if (i8 > 0) {
            for (int i12 = 0; i12 < length; i12++) {
                z8 |= l(c2012c, this.f15327b[i12], pVar.f15327b, i12);
            }
            if (pVar.f15328c == null) {
                pVar.f15328c = new int[1];
            } else {
                z9 = z8;
            }
            return l(c2012c, i8, pVar.f15328c, 0) | z9;
        }
        int length3 = this.f15328c.length + this.f15331f;
        if (pVar.f15328c == null) {
            pVar.f15328c = new int[this.f15332g + length3];
        } else {
            z9 = z8;
        }
        for (int i13 = 0; i13 < length3; i13++) {
            int i14 = this.f15328c[i13];
            if (this.f15334i != null) {
                i14 = i(c2012c, i14);
            }
            z9 |= l(c2012c, i14, pVar.f15328c, i13);
        }
        for (int i15 = 0; i15 < this.f15332g; i15++) {
            int h8 = h(this.f15330e[i15], length2);
            if (this.f15334i != null) {
                h8 = i(c2012c, h8);
            }
            z9 |= l(c2012c, h8, pVar.f15328c, length3 + i15);
        }
        return z9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(C2012C c2012c, int i8, Object[] objArr, int i9, Object[] objArr2) {
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = i10 + 1;
            this.f15327b[i10] = e(c2012c, objArr[i11]);
            Object obj = objArr[i11];
            if (obj != y.f15442e && obj != y.f15441d) {
                i10 = i12;
            } else {
                i10 += 2;
                this.f15327b[i12] = 4194304;
            }
        }
        while (true) {
            int[] iArr = this.f15327b;
            if (i10 >= iArr.length) {
                break;
            }
            iArr[i10] = 4194304;
            i10++;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i9; i14++) {
            Object obj2 = objArr2[i14];
            if (obj2 == y.f15442e || obj2 == y.f15441d) {
                i13++;
            }
        }
        this.f15328c = new int[i13 + i9];
        int i15 = 0;
        for (int i16 = 0; i16 < i9; i16++) {
            int i17 = i15 + 1;
            this.f15328c[i15] = e(c2012c, objArr2[i16]);
            Object obj3 = objArr2[i16];
            if (obj3 != y.f15442e && obj3 != y.f15441d) {
                i15 = i17;
            } else {
                i15 += 2;
                this.f15328c[i17] = 4194304;
            }
        }
        this.f15332g = (short) 0;
        this.f15333h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(C2012C c2012c, int i8, String str, int i9) {
        int i10;
        int[] iArr = new int[i9];
        this.f15327b = iArr;
        this.f15328c = new int[0];
        if ((i8 & 8) == 0) {
            i10 = 1;
            if ((i8 & 262144) == 0) {
                iArr[0] = c2012c.I(c2012c.O()) | 8388608;
            } else {
                iArr[0] = 4194310;
            }
        } else {
            i10 = 0;
        }
        for (C2013D c2013d : C2013D.b(str)) {
            int f8 = f(c2012c, c2013d.d(), 0);
            int[] iArr2 = this.f15327b;
            int i11 = i10 + 1;
            iArr2[i10] = f8;
            if (f8 != 4194308 && f8 != 4194307) {
                i10 = i11;
            } else {
                i10 += 2;
                iArr2[i11] = 4194304;
            }
        }
        while (i10 < i9) {
            this.f15327b[i10] = 4194304;
            i10++;
        }
    }
}
