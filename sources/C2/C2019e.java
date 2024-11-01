package c2;

/* renamed from: c2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2019e {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f15243a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15244b;

    /* renamed from: c, reason: collision with root package name */
    final byte[] f15245c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f15246d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f15247e;

    /* renamed from: f, reason: collision with root package name */
    private final i[] f15248f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f15249g;

    /* renamed from: h, reason: collision with root package name */
    private final int f15250h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0052. Please report as an issue. */
    public C2019e(byte[] bArr, int i8, boolean z8) {
        i[] iVarArr;
        this.f15245c = bArr;
        this.f15243a = bArr;
        if (z8) {
            int i9 = i8 + 6;
            if (C(i9) > 61) {
                throw new IllegalArgumentException("Unsupported class file major version " + ((int) C(i9)));
            }
        }
        int I8 = I(i8 + 8);
        this.f15246d = new int[I8];
        this.f15247e = new String[I8];
        int i10 = i8 + 10;
        int i11 = 0;
        boolean z9 = false;
        boolean z10 = false;
        int i12 = 1;
        while (i12 < I8) {
            int i13 = i12 + 1;
            int i14 = i10 + 1;
            this.f15246d[i12] = i14;
            int i15 = 3;
            switch (bArr[i10]) {
                case 1:
                    i15 = 3 + I(i14);
                    if (i15 > i11) {
                        i12 = i13;
                        i11 = i15;
                        i10 += i15;
                    }
                    i12 = i13;
                    i10 += i15;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i12 = i13;
                    i15 = 5;
                    i10 += i15;
                case 5:
                case 6:
                    i12 += 2;
                    i15 = 9;
                    i10 += i15;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i12 = i13;
                    i10 += i15;
                case 15:
                    i15 = 4;
                    i12 = i13;
                    i10 += i15;
                case 17:
                    i12 = i13;
                    z9 = true;
                    z10 = true;
                    i15 = 5;
                    i10 += i15;
                case 18:
                    i12 = i13;
                    z10 = true;
                    i15 = 5;
                    i10 += i15;
            }
        }
        this.f15250h = i11;
        this.f15244b = i10;
        if (z9) {
            iVarArr = new i[I8];
        } else {
            iVarArr = null;
        }
        this.f15248f = iVarArr;
        this.f15249g = z10 ? k(i11) : null;
    }

    private void A(u uVar, k kVar, int i8, boolean z8) {
        int i9 = i8 + 1;
        int i10 = this.f15245c[i8] & 255;
        uVar.a(i10, z8);
        char[] cArr = kVar.f15293c;
        for (int i11 = 0; i11 < i10; i11++) {
            int I8 = I(i9);
            i9 += 2;
            while (true) {
                int i12 = I8 - 1;
                if (I8 > 0) {
                    i9 = r(uVar.y(i11, H(i9, cArr), z8), i9 + 2, true, cArr);
                    I8 = i12;
                }
            }
        }
    }

    private int B(g gVar, k kVar, int i8) {
        int i9;
        k kVar2 = kVar;
        char[] cArr = kVar2.f15293c;
        String H8 = H(i8, cArr);
        String H9 = H(i8 + 2, cArr);
        int I8 = I(i8 + 4);
        int i10 = i8 + 6;
        int i11 = 0;
        C2017c c2017c = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        String str = null;
        while (true) {
            int i15 = I8 - 1;
            if (I8 <= 0) {
                break;
            }
            String H10 = H(i10, cArr);
            int t8 = t(i10 + 2);
            int i16 = i10 + 6;
            if ("Signature".equals(H10)) {
                str = H(i16, cArr);
                i9 = i16;
            } else if ("RuntimeVisibleAnnotations".equals(H10)) {
                i14 = i16;
                i9 = i14;
            } else if ("RuntimeVisibleTypeAnnotations".equals(H10)) {
                i12 = i16;
                i9 = i12;
            } else if ("RuntimeInvisibleAnnotations".equals(H10)) {
                i13 = i16;
                i9 = i13;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(H10)) {
                i11 = i16;
                i9 = i11;
            } else {
                i9 = i16;
                C2017c c2017c2 = c2017c;
                c2017c = j(kVar2.f15291a, H10, i9, t8, cArr, -1, null);
                c2017c.f15238c = c2017c2;
                i14 = i14;
                i13 = i13;
                i12 = i12;
                i11 = i11;
            }
            i10 = i9 + t8;
            kVar2 = kVar;
            I8 = i15;
        }
        int i17 = i11;
        C2017c c2017c3 = c2017c;
        int i18 = i12;
        int i19 = i13;
        int i20 = i14;
        z m8 = gVar.m(H8, H9, str);
        if (m8 == null) {
            return i10;
        }
        if (i20 != 0) {
            int I9 = I(i20);
            int i21 = i20 + 2;
            while (true) {
                int i22 = I9 - 1;
                if (I9 <= 0) {
                    break;
                }
                i21 = r(m8.a(H(i21, cArr), true), i21 + 2, true, cArr);
                I9 = i22;
            }
        }
        if (i19 != 0) {
            int I10 = I(i19);
            int i23 = i19 + 2;
            while (true) {
                int i24 = I10 - 1;
                if (I10 <= 0) {
                    break;
                }
                i23 = r(m8.a(H(i23, cArr), false), i23 + 2, true, cArr);
                I10 = i24;
            }
        }
        if (i18 != 0) {
            int I11 = I(i18);
            int i25 = i18 + 2;
            while (true) {
                int i26 = I11 - 1;
                if (I11 <= 0) {
                    break;
                }
                int F8 = F(kVar, i25);
                i25 = r(m8.d(kVar.f15298h, kVar.f15299i, H(F8, cArr), true), F8 + 2, true, cArr);
                I11 = i26;
            }
        }
        if (i17 != 0) {
            int I12 = I(i17);
            int i27 = i17 + 2;
            while (true) {
                int i28 = I12 - 1;
                if (I12 <= 0) {
                    break;
                }
                int F9 = F(kVar, i27);
                i27 = r(m8.d(kVar.f15298h, kVar.f15299i, H(F9, cArr), false), F9 + 2, true, cArr);
                I12 = i28;
            }
        }
        C2017c c2017c4 = c2017c3;
        while (c2017c4 != null) {
            C2017c c2017c5 = c2017c4.f15238c;
            c2017c4.f15238c = null;
            m8.b(c2017c4);
            c2017c4 = c2017c5;
        }
        m8.c();
        return i10;
    }

    private int D(int i8, boolean z8, boolean z9, k kVar) {
        int i9;
        int i10;
        int i11;
        char[] cArr = kVar.f15293c;
        s[] sVarArr = kVar.f15297g;
        if (z8) {
            i9 = i8 + 1;
            i10 = this.f15245c[i8] & 255;
        } else {
            kVar.f15303m = -1;
            i9 = i8;
            i10 = 255;
        }
        kVar.f15306p = 0;
        if (i10 < 64) {
            kVar.f15304n = 3;
            kVar.f15308r = 0;
        } else if (i10 < 128) {
            i10 -= 64;
            i9 = L(i9, kVar.f15309s, 0, cArr, sVarArr);
            kVar.f15304n = 4;
            kVar.f15308r = 1;
        } else if (i10 >= 247) {
            int I8 = I(i9);
            int i12 = i9 + 2;
            if (i10 == 247) {
                i9 = L(i12, kVar.f15309s, 0, cArr, sVarArr);
                kVar.f15304n = 4;
                kVar.f15308r = 1;
            } else {
                if (i10 >= 248 && i10 < 251) {
                    kVar.f15304n = 2;
                    int i13 = 251 - i10;
                    kVar.f15306p = i13;
                    kVar.f15305o -= i13;
                    kVar.f15308r = 0;
                } else if (i10 == 251) {
                    kVar.f15304n = 3;
                    kVar.f15308r = 0;
                } else if (i10 < 255) {
                    if (z9) {
                        i11 = kVar.f15305o;
                    } else {
                        i11 = 0;
                    }
                    int i14 = i10 - 251;
                    int i15 = i11;
                    i9 = i12;
                    int i16 = i14;
                    while (i16 > 0) {
                        i9 = L(i9, kVar.f15307q, i15, cArr, sVarArr);
                        i16--;
                        i15++;
                    }
                    kVar.f15304n = 1;
                    kVar.f15306p = i14;
                    kVar.f15305o += i14;
                    kVar.f15308r = 0;
                } else {
                    int I9 = I(i12);
                    int i17 = i9 + 4;
                    kVar.f15304n = 0;
                    kVar.f15306p = I9;
                    kVar.f15305o = I9;
                    for (int i18 = 0; i18 < I9; i18++) {
                        i17 = L(i17, kVar.f15307q, i18, cArr, sVarArr);
                    }
                    int I10 = I(i17);
                    i9 = i17 + 2;
                    kVar.f15308r = I10;
                    for (int i19 = 0; i19 < I10; i19++) {
                        i9 = L(i9, kVar.f15309s, i19, cArr, sVarArr);
                    }
                }
                i9 = i12;
            }
            i10 = I8;
        } else {
            throw new IllegalArgumentException();
        }
        int i20 = kVar.f15303m + i10 + 1;
        kVar.f15303m = i20;
        d(i20, sVarArr);
        return i9;
    }

    private String E(int i8, char[] cArr) {
        return H(this.f15246d[I(i8)], cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int F(c2.k r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.t(r11)
            int r1 = r0 >>> 24
            r2 = 1
            if (r1 == 0) goto L70
            if (r1 == r2) goto L70
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            switch(r1) {
                case 16: goto L6d;
                case 17: goto L6d;
                case 18: goto L6d;
                case 19: goto L6a;
                case 20: goto L6a;
                case 21: goto L6a;
                case 22: goto L70;
                case 23: goto L6d;
                default: goto L10;
            }
        L10:
            switch(r1) {
                case 64: goto L24;
                case 65: goto L24;
                case 66: goto L6d;
                case 67: goto L20;
                case 68: goto L20;
                case 69: goto L20;
                case 70: goto L20;
                case 71: goto L19;
                case 72: goto L19;
                case 73: goto L19;
                case 74: goto L19;
                case 75: goto L19;
                default: goto L13;
            }
        L13:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        L19:
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            int r11 = r11 + 4
            goto L75
        L20:
            r0 = r0 & r3
        L21:
            int r11 = r11 + 3
            goto L75
        L24:
            r0 = r0 & r3
            int r1 = r11 + 1
            int r1 = r9.I(r1)
            int r11 = r11 + 3
            c2.s[] r3 = new c2.s[r1]
            r10.f15300j = r3
            c2.s[] r3 = new c2.s[r1]
            r10.f15301k = r3
            int[] r3 = new int[r1]
            r10.f15302l = r3
            r3 = 0
        L3a:
            if (r3 >= r1) goto L75
            int r4 = r9.I(r11)
            int r5 = r11 + 2
            int r5 = r9.I(r5)
            int r6 = r11 + 4
            int r6 = r9.I(r6)
            int r11 = r11 + 6
            c2.s[] r7 = r10.f15300j
            c2.s[] r8 = r10.f15297g
            c2.s r8 = r9.d(r4, r8)
            r7[r3] = r8
            c2.s[] r7 = r10.f15301k
            int r4 = r4 + r5
            c2.s[] r5 = r10.f15297g
            c2.s r4 = r9.d(r4, r5)
            r7[r3] = r4
            int[] r4 = r10.f15302l
            r4[r3] = r6
            int r3 = r3 + 1
            goto L3a
        L6a:
            r0 = r0 & r3
            int r11 = r11 + r2
            goto L75
        L6d:
            r0 = r0 & (-256(0xffffffffffffff00, float:NaN))
            goto L21
        L70:
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r11 = r11 + 2
        L75:
            r10.f15298h = r0
            int r0 = r9.l(r11)
            if (r0 != 0) goto L7f
            r1 = 0
            goto L86
        L7f:
            c2.E r1 = new c2.E
            byte[] r3 = r9.f15245c
            r1.<init>(r3, r11)
        L86:
            r10.f15299i = r1
            int r11 = r11 + r2
            int r0 = r0 * 2
            int r11 = r11 + r0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.C2019e.F(c2.k, int):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] G(c2.u r11, c2.k r12, int r13, boolean r14) {
        /*
            r10 = this;
            char[] r0 = r12.f15293c
            int r1 = r10.I(r13)
            int[] r2 = new int[r1]
            int r13 = r13 + 2
            r3 = 0
        Lb:
            if (r3 >= r1) goto L84
            r2[r3] = r13
            int r4 = r10.t(r13)
            int r5 = r4 >>> 24
            r6 = 23
            if (r5 == r6) goto L4d
            switch(r5) {
                case 16: goto L4d;
                case 17: goto L4d;
                case 18: goto L4d;
                default: goto L1c;
            }
        L1c:
            switch(r5) {
                case 64: goto L28;
                case 65: goto L28;
                case 66: goto L4d;
                case 67: goto L4d;
                case 68: goto L4d;
                case 69: goto L4d;
                case 70: goto L4d;
                case 71: goto L25;
                case 72: goto L25;
                case 73: goto L25;
                case 74: goto L25;
                case 75: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        L25:
            int r13 = r13 + 4
            goto L4f
        L28:
            int r6 = r13 + 1
            int r6 = r10.I(r6)
            int r13 = r13 + 3
        L30:
            int r7 = r6 + (-1)
            if (r6 <= 0) goto L4f
            int r6 = r10.I(r13)
            int r8 = r13 + 2
            int r8 = r10.I(r8)
            int r13 = r13 + 6
            c2.s[] r9 = r12.f15297g
            r10.d(r6, r9)
            int r6 = r6 + r8
            c2.s[] r8 = r12.f15297g
            r10.d(r6, r8)
            r6 = r7
            goto L30
        L4d:
            int r13 = r13 + 3
        L4f:
            int r6 = r10.l(r13)
            r7 = 66
            r8 = 0
            r9 = 1
            if (r5 != r7) goto L78
            if (r6 != 0) goto L5c
            goto L63
        L5c:
            c2.E r8 = new c2.E
            byte[] r5 = r10.f15245c
            r8.<init>(r5, r13)
        L63:
            int r6 = r6 * 2
            int r6 = r6 + r9
            int r13 = r13 + r6
            java.lang.String r5 = r10.H(r13, r0)
            int r13 = r13 + 2
            r4 = r4 & (-256(0xffffffffffffff00, float:NaN))
            c2.a r4 = r11.A(r4, r8, r5, r14)
            int r13 = r10.r(r4, r13, r9, r0)
            goto L81
        L78:
            int r6 = r6 * 2
            int r6 = r6 + 3
            int r13 = r13 + r6
            int r13 = r10.r(r8, r13, r9, r0)
        L81:
            int r3 = r3 + 1
            goto Lb
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.C2019e.G(c2.u, c2.k, int, boolean):int[]");
    }

    private String J(int i8, int i9, char[] cArr) {
        int i10;
        int i11 = i9 + i8;
        byte[] bArr = this.f15245c;
        int i12 = 0;
        while (i8 < i11) {
            int i13 = i8 + 1;
            byte b9 = bArr[i8];
            if ((b9 & 128) == 0) {
                cArr[i12] = (char) (b9 & Byte.MAX_VALUE);
                i12++;
                i8 = i13;
            } else {
                if ((b9 & 224) == 192) {
                    i10 = i12 + 1;
                    i8 += 2;
                    cArr[i12] = (char) (((b9 & 31) << 6) + (bArr[i13] & 63));
                } else {
                    i10 = i12 + 1;
                    int i14 = i8 + 2;
                    i8 += 3;
                    cArr[i12] = (char) (((b9 & 15) << 12) + ((bArr[i13] & 63) << 6) + (bArr[i14] & 63));
                }
                i12 = i10;
            }
        }
        return new String(cArr, 0, i12);
    }

    private int L(int i8, Object[] objArr, int i9, char[] cArr, s[] sVarArr) {
        int i10 = i8 + 1;
        switch (this.f15245c[i8] & 255) {
            case 0:
                objArr[i9] = y.f15438a;
                return i10;
            case 1:
                objArr[i9] = y.f15439b;
                return i10;
            case 2:
                objArr[i9] = y.f15440c;
                return i10;
            case 3:
                objArr[i9] = y.f15441d;
                return i10;
            case 4:
                objArr[i9] = y.f15442e;
                return i10;
            case 5:
                objArr[i9] = y.f15443f;
                return i10;
            case 6:
                objArr[i9] = y.f15444g;
                return i10;
            case 7:
                objArr[i9] = m(i10, cArr);
                break;
            case 8:
                objArr[i9] = d(I(i10), sVarArr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i8 + 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:            if (r0.charAt(r5) == 'L') goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006c, code lost:            r5 = r5 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:            if (r0.charAt(r5) == ';') goto L62;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:            r5 = r5 + 1;        r1[r4] = r0.substring(r2, r5);        r2 = r5;        r4 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0051, code lost:            r11.f15305o = r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0053, code lost:            return;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(c2.k r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.f15296f
            java.lang.Object[] r1 = r11.f15307q
            int r2 = r11.f15294d
            r2 = r2 & 8
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L29
            java.lang.String r2 = "<init>"
            java.lang.String r5 = r11.f15295e
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L1c
            java.lang.Integer r2 = c2.y.f15444g
            r1[r4] = r2
        L1a:
            r4 = 1
            goto L29
        L1c:
            int r2 = r10.f15244b
            int r2 = r2 + 2
            char[] r5 = r11.f15293c
            java.lang.String r2 = r10.m(r2, r5)
            r1[r4] = r2
            goto L1a
        L29:
            r2 = 1
        L2a:
            int r5 = r2 + 1
            char r6 = r0.charAt(r2)
            r7 = 70
            if (r6 == r7) goto La6
            r7 = 59
            r8 = 76
            if (r6 == r8) goto L8f
            r9 = 83
            if (r6 == r9) goto L88
            r9 = 73
            if (r6 == r9) goto L88
            r9 = 74
            if (r6 == r9) goto L81
            r9 = 90
            if (r6 == r9) goto L88
            r9 = 91
            if (r6 == r9) goto L5d
            switch(r6) {
                case 66: goto L88;
                case 67: goto L88;
                case 68: goto L54;
                default: goto L51;
            }
        L51:
            r11.f15305o = r4
            return
        L54:
            int r2 = r4 + 1
            java.lang.Integer r6 = c2.y.f15441d
            r1[r4] = r6
        L5a:
            r4 = r2
            r2 = r5
            goto L2a
        L5d:
            char r6 = r0.charAt(r5)
            if (r6 != r9) goto L66
            int r5 = r5 + 1
            goto L5d
        L66:
            char r6 = r0.charAt(r5)
            if (r6 != r8) goto L75
        L6c:
            int r5 = r5 + 1
            char r6 = r0.charAt(r5)
            if (r6 == r7) goto L75
            goto L6c
        L75:
            int r6 = r4 + 1
            int r5 = r5 + r3
            java.lang.String r2 = r0.substring(r2, r5)
            r1[r4] = r2
            r2 = r5
            r4 = r6
            goto L2a
        L81:
            int r2 = r4 + 1
            java.lang.Integer r6 = c2.y.f15442e
            r1[r4] = r6
            goto L5a
        L88:
            int r2 = r4 + 1
            java.lang.Integer r6 = c2.y.f15439b
            r1[r4] = r6
            goto L5a
        L8f:
            r2 = r5
        L90:
            char r6 = r0.charAt(r2)
            if (r6 == r7) goto L99
            int r2 = r2 + 1
            goto L90
        L99:
            int r6 = r4 + 1
            int r7 = r2 + 1
            java.lang.String r2 = r0.substring(r5, r2)
            r1[r4] = r2
            r4 = r6
            r2 = r7
            goto L2a
        La6:
            int r2 = r4 + 1
            java.lang.Integer r6 = c2.y.f15440c
            r1[r4] = r6
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.C2019e.b(c2.k):void");
    }

    private void c(int i8, s[] sVarArr) {
        if (sVarArr[i8] == null) {
            s u8 = u(i8, sVarArr);
            u8.f15347a = (short) (u8.f15347a | 1);
        }
    }

    private s d(int i8, s[] sVarArr) {
        s u8 = u(i8, sVarArr);
        u8.f15347a = (short) (u8.f15347a & (-2));
        return u8;
    }

    private int i(int[] iArr, int i8) {
        if (iArr != null && i8 < iArr.length && l(iArr[i8]) >= 67) {
            return I(iArr[i8] + 1);
        }
        return -1;
    }

    private C2017c j(C2017c[] c2017cArr, String str, int i8, int i9, char[] cArr, int i10, s[] sVarArr) {
        for (C2017c c2017c : c2017cArr) {
            if (c2017c.f15236a.equals(str)) {
                return c2017c.i(this, i8, i9, cArr, i10, sVarArr);
            }
        }
        return new C2017c(str).i(this, i8, i9, null, -1, null);
    }

    private int[] k(int i8) {
        char[] cArr = new char[i8];
        int e8 = e();
        for (int I8 = I(e8 - 2); I8 > 0; I8--) {
            String H8 = H(e8, cArr);
            int t8 = t(e8 + 2);
            int i9 = e8 + 6;
            if ("BootstrapMethods".equals(H8)) {
                int I9 = I(i9);
                int[] iArr = new int[I9];
                int i10 = e8 + 8;
                for (int i11 = 0; i11 < I9; i11++) {
                    iArr[i11] = i10;
                    i10 += (I(i10 + 2) * 2) + 4;
                }
                return iArr;
            }
            e8 = i9 + t8;
        }
        throw new IllegalArgumentException();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private void n(c2.u r43, c2.k r44, int r45) {
        /*
            Method dump skipped, instructions count: 3482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.C2019e.n(c2.u, c2.k, int):void");
    }

    private i p(int i8, char[] cArr) {
        i iVar = this.f15248f[i8];
        if (iVar != null) {
            return iVar;
        }
        int[] iArr = this.f15246d;
        int i9 = iArr[i8];
        int i10 = iArr[I(i9 + 2)];
        String H8 = H(i10, cArr);
        String H9 = H(i10 + 2, cArr);
        int i11 = this.f15249g[I(i9)];
        q qVar = (q) o(I(i11), cArr);
        int I8 = I(i11 + 2);
        Object[] objArr = new Object[I8];
        int i12 = i11 + 4;
        for (int i13 = 0; i13 < I8; i13++) {
            objArr[i13] = o(I(i12), cArr);
            i12 += 2;
        }
        i[] iVarArr = this.f15248f;
        i iVar2 = new i(H8, H9, qVar, objArr);
        iVarArr[i8] = iVar2;
        return iVar2;
    }

    private int q(AbstractC2015a abstractC2015a, int i8, String str, char[] cArr) {
        Object obj;
        boolean z8;
        int i9 = 0;
        if (abstractC2015a == null) {
            int i10 = this.f15245c[i8] & 255;
            if (i10 != 64) {
                if (i10 != 91) {
                    if (i10 != 101) {
                        return i8 + 3;
                    }
                    return i8 + 5;
                }
                return r(null, i8 + 1, false, cArr);
            }
            return r(null, i8 + 3, true, cArr);
        }
        int i11 = i8 + 1;
        int i12 = this.f15245c[i8] & 255;
        if (i12 != 64) {
            if (i12 != 70) {
                if (i12 != 83) {
                    if (i12 != 99) {
                        if (i12 != 101) {
                            if (i12 != 115) {
                                if (i12 != 73 && i12 != 74) {
                                    if (i12 != 90) {
                                        if (i12 != 91) {
                                            switch (i12) {
                                                case 66:
                                                    abstractC2015a.a(str, Byte.valueOf((byte) t(this.f15246d[I(i11)])));
                                                    break;
                                                case 67:
                                                    abstractC2015a.a(str, Character.valueOf((char) t(this.f15246d[I(i11)])));
                                                    break;
                                                case 68:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException();
                                            }
                                        } else {
                                            int I8 = I(i11);
                                            int i13 = i8 + 3;
                                            if (I8 == 0) {
                                                return r(abstractC2015a.c(str), i8 + 1, false, cArr);
                                            }
                                            int i14 = this.f15245c[i13] & 255;
                                            if (i14 != 70) {
                                                if (i14 != 83) {
                                                    if (i14 != 90) {
                                                        if (i14 != 73) {
                                                            if (i14 != 74) {
                                                                switch (i14) {
                                                                    case 66:
                                                                        byte[] bArr = new byte[I8];
                                                                        while (i9 < I8) {
                                                                            bArr[i9] = (byte) t(this.f15246d[I(i13 + 1)]);
                                                                            i13 += 3;
                                                                            i9++;
                                                                        }
                                                                        abstractC2015a.a(str, bArr);
                                                                        break;
                                                                    case 67:
                                                                        char[] cArr2 = new char[I8];
                                                                        while (i9 < I8) {
                                                                            cArr2[i9] = (char) t(this.f15246d[I(i13 + 1)]);
                                                                            i13 += 3;
                                                                            i9++;
                                                                        }
                                                                        abstractC2015a.a(str, cArr2);
                                                                        break;
                                                                    case 68:
                                                                        double[] dArr = new double[I8];
                                                                        while (i9 < I8) {
                                                                            dArr[i9] = Double.longBitsToDouble(v(this.f15246d[I(i13 + 1)]));
                                                                            i13 += 3;
                                                                            i9++;
                                                                        }
                                                                        abstractC2015a.a(str, dArr);
                                                                        break;
                                                                    default:
                                                                        return r(abstractC2015a.c(str), i8 + 1, false, cArr);
                                                                }
                                                            } else {
                                                                long[] jArr = new long[I8];
                                                                while (i9 < I8) {
                                                                    jArr[i9] = v(this.f15246d[I(i13 + 1)]);
                                                                    i13 += 3;
                                                                    i9++;
                                                                }
                                                                abstractC2015a.a(str, jArr);
                                                            }
                                                        } else {
                                                            int[] iArr = new int[I8];
                                                            while (i9 < I8) {
                                                                iArr[i9] = t(this.f15246d[I(i13 + 1)]);
                                                                i13 += 3;
                                                                i9++;
                                                            }
                                                            abstractC2015a.a(str, iArr);
                                                        }
                                                    } else {
                                                        boolean[] zArr = new boolean[I8];
                                                        for (int i15 = 0; i15 < I8; i15++) {
                                                            if (t(this.f15246d[I(i13 + 1)]) != 0) {
                                                                z8 = true;
                                                            } else {
                                                                z8 = false;
                                                            }
                                                            zArr[i15] = z8;
                                                            i13 += 3;
                                                        }
                                                        abstractC2015a.a(str, zArr);
                                                    }
                                                } else {
                                                    short[] sArr = new short[I8];
                                                    while (i9 < I8) {
                                                        sArr[i9] = (short) t(this.f15246d[I(i13 + 1)]);
                                                        i13 += 3;
                                                        i9++;
                                                    }
                                                    abstractC2015a.a(str, sArr);
                                                }
                                            } else {
                                                float[] fArr = new float[I8];
                                                while (i9 < I8) {
                                                    fArr[i9] = Float.intBitsToFloat(t(this.f15246d[I(i13 + 1)]));
                                                    i13 += 3;
                                                    i9++;
                                                }
                                                abstractC2015a.a(str, fArr);
                                            }
                                            return i13;
                                        }
                                    } else {
                                        if (t(this.f15246d[I(i11)]) == 0) {
                                            obj = Boolean.FALSE;
                                        } else {
                                            obj = Boolean.TRUE;
                                        }
                                        abstractC2015a.a(str, obj);
                                    }
                                }
                            } else {
                                abstractC2015a.a(str, H(i11, cArr));
                            }
                        } else {
                            abstractC2015a.e(str, H(i11, cArr), H(i8 + 3, cArr));
                            return i8 + 5;
                        }
                    } else {
                        abstractC2015a.a(str, C2013D.n(H(i11, cArr)));
                    }
                } else {
                    abstractC2015a.a(str, Short.valueOf((short) t(this.f15246d[I(i11)])));
                }
                return i8 + 3;
            }
            abstractC2015a.a(str, o(I(i11), cArr));
            return i8 + 3;
        }
        return r(abstractC2015a.b(str, H(i11, cArr)), i8 + 3, true, cArr);
    }

    private int r(AbstractC2015a abstractC2015a, int i8, boolean z8, char[] cArr) {
        int I8 = I(i8);
        int i9 = i8 + 2;
        if (!z8) {
            while (true) {
                int i10 = I8 - 1;
                if (I8 <= 0) {
                    break;
                }
                i9 = q(abstractC2015a, i9, null, cArr);
                I8 = i10;
            }
        } else {
            while (true) {
                int i11 = I8 - 1;
                if (I8 <= 0) {
                    break;
                }
                i9 = q(abstractC2015a, i9 + 2, H(i9, cArr), cArr);
                I8 = i11;
            }
        }
        if (abstractC2015a != null) {
            abstractC2015a.d();
        }
        return i9;
    }

    private int s(g gVar, k kVar, int i8) {
        int i9;
        int i10;
        k kVar2 = kVar;
        char[] cArr = kVar2.f15293c;
        int I8 = I(i8);
        String H8 = H(i8 + 2, cArr);
        String H9 = H(i8 + 4, cArr);
        int I9 = I(i8 + 6);
        int i11 = i8 + 8;
        int i12 = I8;
        C2017c c2017c = null;
        String str = null;
        Object obj = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = I9 - 1;
            if (I9 <= 0) {
                break;
            }
            String H10 = H(i11, cArr);
            int t8 = t(i11 + 2);
            int i18 = i11 + 6;
            if ("ConstantValue".equals(H10)) {
                int I10 = I(i18);
                if (I10 == 0) {
                    obj = null;
                } else {
                    obj = o(I10, cArr);
                }
            } else if ("Signature".equals(H10)) {
                str = H(i18, cArr);
            } else {
                if ("Deprecated".equals(H10)) {
                    i10 = 131072 | i12;
                } else if ("Synthetic".equals(H10)) {
                    i10 = i12 | 4096;
                } else {
                    if ("RuntimeVisibleAnnotations".equals(H10)) {
                        i16 = i18;
                        i9 = i16;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(H10)) {
                        i14 = i18;
                        i9 = i14;
                    } else if ("RuntimeInvisibleAnnotations".equals(H10)) {
                        i15 = i18;
                        i9 = i15;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(H10)) {
                        i13 = i18;
                        i9 = i13;
                    } else {
                        i9 = i18;
                        C2017c c2017c2 = c2017c;
                        c2017c = j(kVar2.f15291a, H10, i9, t8, cArr, -1, null);
                        c2017c.f15238c = c2017c2;
                        i15 = i15;
                        i16 = i16;
                        i13 = i13;
                        i14 = i14;
                    }
                    i11 = i9 + t8;
                    kVar2 = kVar;
                    I9 = i17;
                }
                i12 = i10;
            }
            i9 = i18;
            i11 = i9 + t8;
            kVar2 = kVar;
            I9 = i17;
        }
        C2017c c2017c3 = c2017c;
        int i19 = i13;
        int i20 = i14;
        int i21 = i15;
        int i22 = i16;
        n e8 = gVar.e(i12, H8, H9, str, obj);
        if (e8 == null) {
            return i11;
        }
        if (i22 != 0) {
            int I11 = I(i22);
            int i23 = i22 + 2;
            while (true) {
                int i24 = I11 - 1;
                if (I11 <= 0) {
                    break;
                }
                i23 = r(e8.a(H(i23, cArr), true), i23 + 2, true, cArr);
                I11 = i24;
            }
        }
        if (i21 != 0) {
            int I12 = I(i21);
            int i25 = i21 + 2;
            while (true) {
                int i26 = I12 - 1;
                if (I12 <= 0) {
                    break;
                }
                i25 = r(e8.a(H(i25, cArr), false), i25 + 2, true, cArr);
                I12 = i26;
            }
        }
        if (i20 != 0) {
            int I13 = I(i20);
            int i27 = i20 + 2;
            while (true) {
                int i28 = I13 - 1;
                if (I13 <= 0) {
                    break;
                }
                int F8 = F(kVar, i27);
                i27 = r(e8.d(kVar.f15298h, kVar.f15299i, H(F8, cArr), true), F8 + 2, true, cArr);
                I13 = i28;
            }
        }
        if (i19 != 0) {
            int I14 = I(i19);
            int i29 = i19 + 2;
            while (true) {
                int i30 = I14 - 1;
                if (I14 <= 0) {
                    break;
                }
                int F9 = F(kVar, i29);
                i29 = r(e8.d(kVar.f15298h, kVar.f15299i, H(F9, cArr), false), F9 + 2, true, cArr);
                I14 = i30;
            }
        }
        while (true) {
            C2017c c2017c4 = c2017c3;
            if (c2017c4 != null) {
                c2017c3 = c2017c4.f15238c;
                c2017c4.f15238c = null;
                e8.b(c2017c4);
            } else {
                e8.c();
                return i11;
            }
        }
    }

    private int w(g gVar, k kVar, int i8) {
        String K8;
        boolean z8;
        int i9;
        int i10;
        char[] cArr = kVar.f15293c;
        kVar.f15294d = I(i8);
        kVar.f15295e = H(i8 + 2, cArr);
        int i11 = i8 + 4;
        kVar.f15296f = H(i11, cArr);
        int I8 = I(i8 + 6);
        int i12 = i8 + 8;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        C2017c c2017c = null;
        boolean z9 = false;
        int i19 = 0;
        String[] strArr = null;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (true) {
            int i24 = I8 - 1;
            if (I8 <= 0) {
                break;
            }
            String H8 = H(i12, cArr);
            int t8 = t(i12 + 2);
            int i25 = i18;
            int i26 = i12 + 6;
            int i27 = i13;
            if ("Code".equals(H8)) {
                if ((kVar.f15292b & 1) == 0) {
                    i23 = i26;
                    i13 = i27;
                    i18 = i25;
                    i10 = i23;
                    i12 = i10 + t8;
                    I8 = i24;
                } else {
                    i9 = i14;
                    i13 = i27;
                    i14 = i9;
                }
            } else {
                if ("Exceptions".equals(H8)) {
                    int I9 = I(i26);
                    String[] strArr2 = new String[I9];
                    int i28 = i12 + 8;
                    int i29 = i14;
                    for (int i30 = 0; i30 < I9; i30++) {
                        strArr2[i30] = m(i28, cArr);
                        i28 += 2;
                    }
                    strArr = strArr2;
                    i19 = i26;
                    i13 = i27;
                    i14 = i29;
                    i18 = i25;
                    i10 = i19;
                } else {
                    i9 = i14;
                    if ("Signature".equals(H8)) {
                        i10 = i26;
                        i13 = i27;
                        i14 = i9;
                        i18 = I(i26);
                    } else if ("Deprecated".equals(H8)) {
                        kVar.f15294d |= 131072;
                        i13 = i27;
                        i14 = i9;
                    } else if ("RuntimeVisibleAnnotations".equals(H8)) {
                        i15 = i26;
                        i13 = i27;
                        i14 = i9;
                        i18 = i25;
                        i10 = i15;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(H8)) {
                        i13 = i26;
                        i14 = i9;
                        i18 = i25;
                        i10 = i13;
                    } else if ("AnnotationDefault".equals(H8)) {
                        i16 = i26;
                        i13 = i27;
                        i14 = i9;
                        i18 = i25;
                        i10 = i16;
                    } else if ("Synthetic".equals(H8)) {
                        kVar.f15294d |= 4096;
                        i13 = i27;
                        i14 = i9;
                        z9 = true;
                    } else if ("RuntimeInvisibleAnnotations".equals(H8)) {
                        i14 = i26;
                        i13 = i27;
                        i18 = i25;
                        i10 = i14;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(H8)) {
                        i20 = i26;
                        i13 = i27;
                        i14 = i9;
                        i18 = i25;
                        i10 = i20;
                    } else if ("RuntimeVisibleParameterAnnotations".equals(H8)) {
                        i21 = i26;
                        i13 = i27;
                        i14 = i9;
                        i18 = i25;
                        i10 = i21;
                    } else if ("RuntimeInvisibleParameterAnnotations".equals(H8)) {
                        i22 = i26;
                        i13 = i27;
                        i14 = i9;
                        i18 = i25;
                        i10 = i22;
                    } else if ("MethodParameters".equals(H8)) {
                        i17 = i26;
                        i13 = i27;
                        i14 = i9;
                        i18 = i25;
                        i10 = i17;
                    } else {
                        i10 = i26;
                        C2017c j8 = j(kVar.f15291a, H8, i26, t8, cArr, -1, null);
                        j8.f15238c = c2017c;
                        c2017c = j8;
                        i18 = i25;
                        i13 = i27;
                        i14 = i9;
                        i15 = i15;
                        i16 = i16;
                        i17 = i17;
                    }
                }
                i12 = i10 + t8;
                I8 = i24;
            }
            i10 = i26;
            i18 = i25;
            i12 = i10 + t8;
            I8 = i24;
        }
        int i31 = i13;
        int i32 = i14;
        int i33 = i15;
        int i34 = i16;
        int i35 = i17;
        int i36 = i18;
        int i37 = kVar.f15294d;
        String str = kVar.f15295e;
        String str2 = kVar.f15296f;
        if (i36 == 0) {
            K8 = null;
        } else {
            K8 = K(i36, cArr);
        }
        u g8 = gVar.g(i37, str, str2, K8, strArr);
        if (g8 == null) {
            return i12;
        }
        if (g8 instanceof v) {
            v vVar = (v) g8;
            if ((kVar.f15294d & 131072) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (vVar.G(this, z9, z8, I(i11), i36, i19)) {
                vVar.S(i8, i12 - i8);
                return i12;
            }
        }
        if (i35 != 0 && (kVar.f15292b & 2) == 0) {
            int l8 = l(i35);
            int i38 = i35 + 1;
            while (true) {
                int i39 = l8 - 1;
                if (l8 <= 0) {
                    break;
                }
                g8.x(H(i38, cArr), I(i38 + 2));
                i38 += 4;
                l8 = i39;
            }
        }
        if (i34 != 0) {
            AbstractC2015a c8 = g8.c();
            q(c8, i34, null, cArr);
            if (c8 != null) {
                c8.d();
            }
        }
        if (i33 != 0) {
            int I10 = I(i33);
            int i40 = i33 + 2;
            while (true) {
                int i41 = I10 - 1;
                if (I10 <= 0) {
                    break;
                }
                i40 = r(g8.b(H(i40, cArr), true), i40 + 2, true, cArr);
                I10 = i41;
            }
        }
        if (i32 != 0) {
            int I11 = I(i32);
            int i42 = i32 + 2;
            while (true) {
                int i43 = I11 - 1;
                if (I11 <= 0) {
                    break;
                }
                i42 = r(g8.b(H(i42, cArr), false), i42 + 2, true, cArr);
                I11 = i43;
            }
        }
        if (i31 != 0) {
            int I12 = I(i31);
            int i44 = i31 + 2;
            while (true) {
                int i45 = I12 - 1;
                if (I12 <= 0) {
                    break;
                }
                int F8 = F(kVar, i44);
                i44 = r(g8.C(kVar.f15298h, kVar.f15299i, H(F8, cArr), true), F8 + 2, true, cArr);
                I12 = i45;
            }
        }
        int i46 = i20;
        if (i46 != 0) {
            int I13 = I(i46);
            int i47 = i46 + 2;
            while (true) {
                int i48 = I13 - 1;
                if (I13 <= 0) {
                    break;
                }
                int F9 = F(kVar, i47);
                i47 = r(g8.C(kVar.f15298h, kVar.f15299i, H(F9, cArr), false), F9 + 2, true, cArr);
                I13 = i48;
            }
        }
        int i49 = i21;
        if (i49 != 0) {
            A(g8, kVar, i49, true);
        }
        int i50 = i22;
        if (i50 != 0) {
            A(g8, kVar, i50, false);
        }
        while (c2017c != null) {
            C2017c c2017c2 = c2017c.f15238c;
            c2017c.f15238c = null;
            g8.d(c2017c);
            c2017c = c2017c2;
        }
        int i51 = i23;
        if (i51 != 0) {
            g8.e();
            n(g8, kVar, i51);
        }
        g8.f();
        return i12;
    }

    private void y(g gVar, k kVar, int i8, int i9, String str) {
        String[] strArr;
        char[] cArr = kVar.f15293c;
        int i10 = i8 + 6;
        w h8 = gVar.h(x(i8, cArr), I(i8 + 2), H(i8 + 4, cArr));
        if (h8 == null) {
            return;
        }
        if (str != null) {
            h8.c(str);
        }
        if (i9 != 0) {
            int I8 = I(i9);
            int i11 = i9 + 2;
            while (true) {
                int i12 = I8 - 1;
                if (I8 <= 0) {
                    break;
                }
                h8.e(z(i11, cArr));
                i11 += 2;
                I8 = i12;
            }
        }
        int I9 = I(i10);
        int i13 = i8 + 8;
        while (true) {
            int i14 = I9 - 1;
            if (I9 <= 0) {
                break;
            }
            String x8 = x(i13, cArr);
            int I10 = I(i13 + 2);
            String H8 = H(i13 + 4, cArr);
            i13 += 6;
            h8.g(x8, I10, H8);
            I9 = i14;
        }
        int I11 = I(i13);
        int i15 = i13 + 2;
        while (true) {
            int i16 = I11 - 1;
            String[] strArr2 = null;
            if (I11 <= 0) {
                break;
            }
            String z8 = z(i15, cArr);
            int I12 = I(i15 + 2);
            int I13 = I(i15 + 4);
            i15 += 6;
            if (I13 != 0) {
                strArr2 = new String[I13];
                for (int i17 = 0; i17 < I13; i17++) {
                    strArr2[i17] = x(i15, cArr);
                    i15 += 2;
                }
            }
            h8.b(z8, I12, strArr2);
            I11 = i16;
        }
        int I14 = I(i15);
        int i18 = i15 + 2;
        while (true) {
            int i19 = I14 - 1;
            if (I14 <= 0) {
                break;
            }
            String z9 = z(i18, cArr);
            int I15 = I(i18 + 2);
            int I16 = I(i18 + 4);
            i18 += 6;
            if (I16 != 0) {
                strArr = new String[I16];
                for (int i20 = 0; i20 < I16; i20++) {
                    strArr[i20] = x(i18, cArr);
                    i18 += 2;
                }
            } else {
                strArr = null;
            }
            h8.d(z9, I15, strArr);
            I14 = i19;
        }
        int I17 = I(i18);
        int i21 = i18 + 2;
        while (true) {
            int i22 = I17 - 1;
            if (I17 <= 0) {
                break;
            }
            h8.h(m(i21, cArr));
            i21 += 2;
            I17 = i22;
        }
        int I18 = I(i21);
        int i23 = i21 + 2;
        while (true) {
            int i24 = I18 - 1;
            if (I18 > 0) {
                String m8 = m(i23, cArr);
                int I19 = I(i23 + 2);
                i23 += 4;
                String[] strArr3 = new String[I19];
                for (int i25 = 0; i25 < I19; i25++) {
                    strArr3[i25] = m(i23, cArr);
                    i23 += 2;
                }
                h8.f(m8, strArr3);
                I18 = i24;
            } else {
                h8.a();
                return;
            }
        }
    }

    public short C(int i8) {
        byte[] bArr = this.f15245c;
        return (short) ((bArr[i8 + 1] & 255) | ((bArr[i8] & 255) << 8));
    }

    public String H(int i8, char[] cArr) {
        int I8 = I(i8);
        if (i8 != 0 && I8 != 0) {
            return K(I8, cArr);
        }
        return null;
    }

    public int I(int i8) {
        byte[] bArr = this.f15245c;
        return (bArr[i8 + 1] & 255) | ((bArr[i8] & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String K(int i8, char[] cArr) {
        String[] strArr = this.f15247e;
        String str = strArr[i8];
        if (str != null) {
            return str;
        }
        int i9 = this.f15246d[i8];
        String J8 = J(i9 + 2, I(i9), cArr);
        strArr[i8] = J8;
        return J8;
    }

    public void a(g gVar, C2017c[] c2017cArr, int i8) {
        String H8;
        String H9;
        int i9;
        int i10;
        int i11;
        String[] strArr;
        k kVar = new k();
        kVar.f15291a = c2017cArr;
        kVar.f15292b = i8;
        char[] cArr = new char[this.f15250h];
        kVar.f15293c = cArr;
        int i12 = this.f15244b;
        int I8 = I(i12);
        String m8 = m(i12 + 2, cArr);
        String m9 = m(i12 + 4, cArr);
        int I9 = I(i12 + 6);
        String[] strArr2 = new String[I9];
        int i13 = i12 + 8;
        for (int i14 = 0; i14 < I9; i14++) {
            strArr2[i14] = m(i13, cArr);
            i13 += 2;
        }
        int e8 = e();
        int i15 = I8;
        int I10 = I(e8 - 2);
        String str = null;
        String str2 = null;
        int i16 = 0;
        String str3 = null;
        int i17 = 0;
        String str4 = null;
        String str5 = null;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        C2017c c2017c = null;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (I10 > 0) {
            String H10 = H(e8, cArr);
            int t8 = t(e8 + 2);
            int i27 = e8 + 6;
            String str6 = str;
            if ("SourceFile".equals(H10)) {
                i9 = i27;
                str2 = H(i27, cArr);
            } else if ("InnerClasses".equals(H10)) {
                i25 = i27;
                i9 = i25;
            } else if ("EnclosingMethod".equals(H10)) {
                i18 = i27;
                i9 = i18;
            } else if ("NestHost".equals(H10)) {
                i9 = i27;
                str5 = m(i27, cArr);
            } else if ("NestMembers".equals(H10)) {
                i23 = i27;
                i9 = i23;
            } else if ("PermittedSubclasses".equals(H10)) {
                i24 = i27;
                i9 = i24;
            } else {
                if ("Signature".equals(H10)) {
                    str3 = H(i27, cArr);
                } else if ("RuntimeVisibleAnnotations".equals(H10)) {
                    i19 = i27;
                    i9 = i19;
                } else if ("RuntimeVisibleTypeAnnotations".equals(H10)) {
                    i21 = i27;
                    i9 = i21;
                } else if ("Deprecated".equals(H10)) {
                    i15 |= 131072;
                } else if ("Synthetic".equals(H10)) {
                    i15 |= 4096;
                } else if ("SourceDebugExtension".equals(H10)) {
                    if (t8 <= this.f15245c.length - i27) {
                        str = J(i27, t8, new char[t8]);
                        i9 = i27;
                        i10 = i13;
                        i11 = t8;
                        strArr = strArr2;
                        e8 = i9 + i11;
                        I10--;
                        strArr2 = strArr;
                        i13 = i10;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if ("RuntimeInvisibleAnnotations".equals(H10)) {
                    i20 = i27;
                    i9 = i20;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(H10)) {
                    i22 = i27;
                    i9 = i22;
                } else if ("Record".equals(H10)) {
                    i15 |= 65536;
                    i26 = i27;
                    i9 = i26;
                } else if ("Module".equals(H10)) {
                    i16 = i27;
                    i9 = i16;
                } else if ("ModuleMainClass".equals(H10)) {
                    str4 = m(i27, cArr);
                } else if ("ModulePackages".equals(H10)) {
                    i17 = i27;
                    i9 = i17;
                } else {
                    if (!"BootstrapMethods".equals(H10)) {
                        i9 = i27;
                        i10 = i13;
                        i11 = t8;
                        strArr = strArr2;
                        C2017c j8 = j(c2017cArr, H10, i9, t8, cArr, -1, null);
                        j8.f15238c = c2017c;
                        c2017c = j8;
                        i15 = i15;
                        str = str6;
                        str2 = str2;
                    } else {
                        i9 = i27;
                        i10 = i13;
                        i11 = t8;
                        strArr = strArr2;
                        str = str6;
                    }
                    e8 = i9 + i11;
                    I10--;
                    strArr2 = strArr;
                    i13 = i10;
                }
                i9 = i27;
            }
            i10 = i13;
            i11 = t8;
            strArr = strArr2;
            str = str6;
            e8 = i9 + i11;
            I10--;
            strArr2 = strArr;
            i13 = i10;
        }
        String str7 = str;
        String str8 = str2;
        int i28 = i13;
        String[] strArr3 = strArr2;
        C2017c c2017c2 = c2017c;
        gVar.a(t(this.f15246d[1] - 7), i15, m8, str3, m9, strArr3);
        if ((i8 & 2) == 0 && (str8 != null || str7 != null)) {
            gVar.n(str8, str7);
        }
        if (i16 != 0) {
            y(gVar, kVar, i16, i17, str4);
        }
        String str9 = str5;
        if (str9 != null) {
            gVar.i(str9);
        }
        int i29 = i18;
        if (i29 != 0) {
            String m10 = m(i29, cArr);
            int I11 = I(i29 + 2);
            if (I11 == 0) {
                H8 = null;
            } else {
                H8 = H(this.f15246d[I11], cArr);
            }
            if (I11 == 0) {
                H9 = null;
            } else {
                H9 = H(this.f15246d[I11] + 2, cArr);
            }
            gVar.k(m10, H8, H9);
        }
        int i30 = i19;
        if (i30 != 0) {
            int I12 = I(i30);
            int i31 = i30 + 2;
            while (true) {
                int i32 = I12 - 1;
                if (I12 <= 0) {
                    break;
                }
                i31 = r(gVar.b(H(i31, cArr), true), i31 + 2, true, cArr);
                I12 = i32;
            }
        }
        int i33 = i20;
        if (i33 != 0) {
            int I13 = I(i33);
            int i34 = i33 + 2;
            while (true) {
                int i35 = I13 - 1;
                if (I13 <= 0) {
                    break;
                }
                i34 = r(gVar.b(H(i34, cArr), false), i34 + 2, true, cArr);
                I13 = i35;
            }
        }
        int i36 = i21;
        if (i36 != 0) {
            int I14 = I(i36);
            int i37 = i36 + 2;
            while (true) {
                int i38 = I14 - 1;
                if (I14 <= 0) {
                    break;
                }
                int F8 = F(kVar, i37);
                i37 = r(gVar.o(kVar.f15298h, kVar.f15299i, H(F8, cArr), true), F8 + 2, true, cArr);
                I14 = i38;
            }
        }
        int i39 = i22;
        if (i39 != 0) {
            int I15 = I(i39);
            int i40 = i39 + 2;
            while (true) {
                int i41 = I15 - 1;
                if (I15 <= 0) {
                    break;
                }
                int F9 = F(kVar, i40);
                i40 = r(gVar.o(kVar.f15298h, kVar.f15299i, H(F9, cArr), false), F9 + 2, true, cArr);
                I15 = i41;
            }
        }
        while (c2017c2 != null) {
            C2017c c2017c3 = c2017c2.f15238c;
            c2017c2.f15238c = null;
            gVar.c(c2017c2);
            c2017c2 = c2017c3;
        }
        int i42 = i23;
        if (i42 != 0) {
            int I16 = I(i42);
            int i43 = i42 + 2;
            while (true) {
                int i44 = I16 - 1;
                if (I16 <= 0) {
                    break;
                }
                gVar.j(m(i43, cArr));
                i43 += 2;
                I16 = i44;
            }
        }
        int i45 = i24;
        if (i45 != 0) {
            int I17 = I(i45);
            int i46 = i45 + 2;
            while (true) {
                int i47 = I17 - 1;
                if (I17 <= 0) {
                    break;
                }
                gVar.l(m(i46, cArr));
                i46 += 2;
                I17 = i47;
            }
        }
        int i48 = i25;
        if (i48 != 0) {
            int I18 = I(i48);
            int i49 = i48 + 2;
            while (true) {
                int i50 = I18 - 1;
                if (I18 <= 0) {
                    break;
                }
                gVar.f(m(i49, cArr), m(i49 + 2, cArr), H(i49 + 4, cArr), I(i49 + 6));
                i49 += 8;
                I18 = i50;
            }
        }
        int i51 = i26;
        if (i51 != 0) {
            int I19 = I(i51);
            int i52 = i51 + 2;
            while (true) {
                int i53 = I19 - 1;
                if (I19 <= 0) {
                    break;
                }
                i52 = B(gVar, kVar, i52);
                I19 = i53;
            }
        }
        int I20 = I(i28);
        int i54 = i28 + 2;
        while (true) {
            int i55 = I20 - 1;
            if (I20 <= 0) {
                break;
            }
            i54 = s(gVar, kVar, i54);
            I20 = i55;
        }
        int I21 = I(i54);
        int i56 = i54 + 2;
        while (true) {
            int i57 = I21 - 1;
            if (I21 > 0) {
                i56 = w(gVar, kVar, i56);
                I21 = i57;
            } else {
                gVar.d();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e() {
        int i8 = this.f15244b;
        int I8 = i8 + 8 + (I(i8 + 6) * 2);
        int I9 = I(I8);
        int i9 = I8 + 2;
        while (true) {
            int i10 = I9 - 1;
            if (I9 <= 0) {
                break;
            }
            int I10 = I(i9 + 6);
            i9 += 8;
            while (true) {
                int i11 = I10 - 1;
                if (I10 > 0) {
                    i9 += t(i9 + 2) + 6;
                    I10 = i11;
                }
            }
            I9 = i10;
        }
        int I11 = I(i9);
        int i12 = i9 + 2;
        while (true) {
            int i13 = I11 - 1;
            if (I11 > 0) {
                int I12 = I(i12 + 6);
                i12 += 8;
                while (true) {
                    int i14 = I12 - 1;
                    if (I12 > 0) {
                        i12 += t(i12 + 2) + 6;
                        I12 = i14;
                    }
                }
                I11 = i13;
            } else {
                return i12 + 2;
            }
        }
    }

    public int f(int i8) {
        return this.f15246d[i8];
    }

    public int g() {
        return this.f15246d.length;
    }

    public int h() {
        return this.f15250h;
    }

    public int l(int i8) {
        return this.f15245c[i8] & 255;
    }

    public String m(int i8, char[] cArr) {
        return E(i8, cArr);
    }

    public Object o(int i8, char[] cArr) {
        boolean z8;
        int i9 = this.f15246d[i8];
        byte b9 = this.f15245c[i9 - 1];
        switch (b9) {
            case 3:
                return Integer.valueOf(t(i9));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(t(i9)));
            case 5:
                return Long.valueOf(v(i9));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(v(i9)));
            case 7:
                return C2013D.j(H(i9, cArr));
            case 8:
                return H(i9, cArr);
            default:
                switch (b9) {
                    case 15:
                        int l8 = l(i9);
                        int i10 = this.f15246d[I(i9 + 1)];
                        int i11 = this.f15246d[I(i10 + 2)];
                        String m8 = m(i10, cArr);
                        String H8 = H(i11, cArr);
                        String H9 = H(i11 + 2, cArr);
                        if (this.f15245c[i10 - 1] == 11) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        return new q(l8, m8, H8, H9, z8);
                    case 16:
                        return C2013D.i(H(i9, cArr));
                    case 17:
                        return p(i8, cArr);
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public int t(int i8) {
        byte[] bArr = this.f15245c;
        return (bArr[i8 + 3] & 255) | ((bArr[i8] & 255) << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
    }

    protected s u(int i8, s[] sVarArr) {
        if (sVarArr[i8] == null) {
            sVarArr[i8] = new s();
        }
        return sVarArr[i8];
    }

    public long v(int i8) {
        return (t(i8) << 32) | (t(i8 + 4) & 4294967295L);
    }

    public String x(int i8, char[] cArr) {
        return E(i8, cArr);
    }

    public String z(int i8, char[] cArr) {
        return E(i8, cArr);
    }
}
