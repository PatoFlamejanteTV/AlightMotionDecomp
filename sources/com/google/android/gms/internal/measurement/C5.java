package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class C5 {

    /* renamed from: f, reason: collision with root package name */
    private static final C5 f16260f = new C5(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f16261a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f16262b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f16263c;

    /* renamed from: d, reason: collision with root package name */
    private int f16264d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16265e;

    private C5() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C5 c(C5 c52, C5 c53) {
        int i8 = c52.f16261a + c53.f16261a;
        int[] copyOf = Arrays.copyOf(c52.f16262b, i8);
        System.arraycopy(c53.f16262b, 0, copyOf, c52.f16261a, c53.f16261a);
        Object[] copyOf2 = Arrays.copyOf(c52.f16263c, i8);
        System.arraycopy(c53.f16263c, 0, copyOf2, c52.f16261a, c53.f16261a);
        return new C5(i8, copyOf, copyOf2, true);
    }

    private final void d(int i8) {
        int[] iArr = this.f16262b;
        if (i8 > iArr.length) {
            int i9 = this.f16261a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f16262b = Arrays.copyOf(iArr, i8);
            this.f16263c = Arrays.copyOf(this.f16263c, i8);
        }
    }

    private static void f(int i8, Object obj, V5 v52) {
        int i9 = i8 >>> 3;
        int i10 = i8 & 7;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 5) {
                            v52.h(i9, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(A4.a());
                    }
                    if (v52.w() == 1) {
                        v52.f(i9);
                        ((C5) obj).j(v52);
                        v52.a(i9);
                        return;
                    } else {
                        v52.a(i9);
                        ((C5) obj).j(v52);
                        v52.f(i9);
                        return;
                    }
                }
                v52.j(i9, (J3) obj);
                return;
            }
            v52.x(i9, ((Long) obj).longValue());
            return;
        }
        v52.e(i9, ((Long) obj).longValue());
    }

    public static C5 k() {
        return f16260f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C5 l() {
        return new C5();
    }

    private final void n() {
        if (this.f16265e) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        int m02;
        int i8 = this.f16264d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f16261a; i10++) {
            int i11 = this.f16262b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                m02 = AbstractC2092a4.h0(i12, ((Integer) this.f16263c[i10]).intValue());
                            } else {
                                throw new IllegalStateException(A4.a());
                            }
                        } else {
                            m02 = (AbstractC2092a4.s0(i12) << 1) + ((C5) this.f16263c[i10]).a();
                        }
                    } else {
                        m02 = AbstractC2092a4.Q(i12, (J3) this.f16263c[i10]);
                    }
                } else {
                    m02 = AbstractC2092a4.P(i12, ((Long) this.f16263c[i10]).longValue());
                }
            } else {
                m02 = AbstractC2092a4.m0(i12, ((Long) this.f16263c[i10]).longValue());
            }
            i9 += m02;
        }
        this.f16264d = i9;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C5 b(C5 c52) {
        if (c52.equals(f16260f)) {
            return this;
        }
        n();
        int i8 = this.f16261a + c52.f16261a;
        d(i8);
        System.arraycopy(c52.f16262b, 0, this.f16262b, this.f16261a, c52.f16261a);
        System.arraycopy(c52.f16263c, 0, this.f16263c, this.f16261a, c52.f16261a);
        this.f16261a = i8;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i8, Object obj) {
        n();
        d(this.f16261a + 1);
        int[] iArr = this.f16262b;
        int i9 = this.f16261a;
        iArr[i9] = i8;
        this.f16263c[i9] = obj;
        this.f16261a = i9 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5)) {
            return false;
        }
        C5 c52 = (C5) obj;
        int i8 = this.f16261a;
        if (i8 == c52.f16261a) {
            int[] iArr = this.f16262b;
            int[] iArr2 = c52.f16262b;
            int i9 = 0;
            while (true) {
                if (i9 < i8) {
                    if (iArr[i9] != iArr2[i9]) {
                        break;
                    }
                    i9++;
                } else {
                    Object[] objArr = this.f16263c;
                    Object[] objArr2 = c52.f16263c;
                    int i10 = this.f16261a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (objArr[i11].equals(objArr2[i11])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(V5 v52) {
        if (v52.w() == 2) {
            for (int i8 = this.f16261a - 1; i8 >= 0; i8--) {
                v52.o(this.f16262b[i8] >>> 3, this.f16263c[i8]);
            }
            return;
        }
        for (int i9 = 0; i9 < this.f16261a; i9++) {
            v52.o(this.f16262b[i9] >>> 3, this.f16263c[i9]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f16261a; i9++) {
            Z4.d(sb, i8, String.valueOf(this.f16262b[i9] >>> 3), this.f16263c[i9]);
        }
    }

    public final int hashCode() {
        int i8 = this.f16261a;
        int i9 = (i8 + 527) * 31;
        int[] iArr = this.f16262b;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i8; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i9 + i11) * 31;
        Object[] objArr = this.f16263c;
        int i14 = this.f16261a;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return i13 + i10;
    }

    public final int i() {
        int i8 = this.f16264d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f16261a; i10++) {
            i9 += AbstractC2092a4.Z(this.f16262b[i10] >>> 3, (J3) this.f16263c[i10]);
        }
        this.f16264d = i9;
        return i9;
    }

    public final void j(V5 v52) {
        if (this.f16261a == 0) {
            return;
        }
        if (v52.w() == 1) {
            for (int i8 = 0; i8 < this.f16261a; i8++) {
                f(this.f16262b[i8], this.f16263c[i8], v52);
            }
            return;
        }
        for (int i9 = this.f16261a - 1; i9 >= 0; i9--) {
            f(this.f16262b[i9], this.f16263c[i9], v52);
        }
    }

    public final void m() {
        if (this.f16265e) {
            this.f16265e = false;
        }
    }

    private C5(int i8, int[] iArr, Object[] objArr, boolean z8) {
        this.f16264d = -1;
        this.f16261a = i8;
        this.f16262b = iArr;
        this.f16263c = objArr;
        this.f16265e = z8;
    }
}
