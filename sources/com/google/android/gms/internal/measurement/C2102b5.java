package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.b5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2102b5 implements InterfaceC2210n5 {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f16588q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    private static final Unsafe f16589r = E5.p();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f16590a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f16591b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16592c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16593d;

    /* renamed from: e, reason: collision with root package name */
    private final Y4 f16594e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16595f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f16596g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f16597h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f16598i;

    /* renamed from: j, reason: collision with root package name */
    private final int f16599j;

    /* renamed from: k, reason: collision with root package name */
    private final int f16600k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC2129e5 f16601l;

    /* renamed from: m, reason: collision with root package name */
    private final H4 f16602m;

    /* renamed from: n, reason: collision with root package name */
    private final D5 f16603n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC2146g4 f16604o;

    /* renamed from: p, reason: collision with root package name */
    private final Q4 f16605p;

    private C2102b5(int[] iArr, Object[] objArr, int i8, int i9, Y4 y42, boolean z8, int[] iArr2, int i10, int i11, InterfaceC2129e5 interfaceC2129e5, H4 h42, D5 d52, AbstractC2146g4 abstractC2146g4, Q4 q42) {
        this.f16590a = iArr;
        this.f16591b = objArr;
        this.f16592c = i8;
        this.f16593d = i9;
        this.f16596g = y42 instanceof AbstractC2240r4;
        this.f16595f = abstractC2146g4 != null && abstractC2146g4.d(y42);
        this.f16597h = false;
        this.f16598i = iArr2;
        this.f16599j = i10;
        this.f16600k = i11;
        this.f16601l = interfaceC2129e5;
        this.f16602m = h42;
        this.f16603n = d52;
        this.f16604o = abstractC2146g4;
        this.f16594e = y42;
        this.f16605p = q42;
    }

    private static boolean A(Object obj, int i8, InterfaceC2210n5 interfaceC2210n5) {
        return interfaceC2210n5.b(E5.B(obj, i8 & 1048575));
    }

    private static float B(Object obj, long j8) {
        return ((Float) E5.B(obj, j8)).floatValue();
    }

    private final int C(int i8) {
        return this.f16590a[i8 + 2];
    }

    private final void D(Object obj, int i8) {
        int C8 = C(i8);
        long j8 = 1048575 & C8;
        if (j8 == 1048575) {
            return;
        }
        E5.h(obj, j8, (1 << (C8 >>> 20)) | E5.t(obj, j8));
    }

    private final void E(Object obj, int i8, int i9) {
        E5.h(obj, C(i9) & 1048575, i8);
    }

    private final void F(Object obj, Object obj2, int i8) {
        int i9 = this.f16590a[i8];
        if (!K(obj2, i9, i8)) {
            return;
        }
        long G8 = G(i8) & 1048575;
        Unsafe unsafe = f16589r;
        Object object = unsafe.getObject(obj2, G8);
        if (object != null) {
            InterfaceC2210n5 O8 = O(i8);
            if (!K(obj, i9, i8)) {
                if (!T(object)) {
                    unsafe.putObject(obj, G8, object);
                } else {
                    Object w8 = O8.w();
                    O8.e(w8, object);
                    unsafe.putObject(obj, G8, w8);
                }
                E(obj, i9, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, G8);
            if (!T(object2)) {
                Object w9 = O8.w();
                O8.e(w9, object2);
                unsafe.putObject(obj, G8, w9);
                object2 = w9;
            }
            O8.e(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f16590a[i8] + " is present but null: " + String.valueOf(obj2));
    }

    private final int G(int i8) {
        return this.f16590a[i8 + 1];
    }

    private static int H(Object obj, long j8) {
        return ((Integer) E5.B(obj, j8)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C5 I(Object obj) {
        AbstractC2240r4 abstractC2240r4 = (AbstractC2240r4) obj;
        C5 c52 = abstractC2240r4.zzb;
        if (c52 == C5.k()) {
            C5 l8 = C5.l();
            abstractC2240r4.zzb = l8;
            return l8;
        }
        return c52;
    }

    private final boolean J(Object obj, int i8) {
        int C8 = C(i8);
        long j8 = C8 & 1048575;
        if (j8 == 1048575) {
            int G8 = G(i8);
            long j9 = G8 & 1048575;
            switch ((G8 & 267386880) >>> 20) {
                case 0:
                    if (Double.doubleToRawLongBits(E5.a(obj, j9)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(E5.n(obj, j9)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (E5.x(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (E5.x(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (E5.t(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (E5.x(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (E5.t(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return E5.F(obj, j9);
                case 8:
                    Object B8 = E5.B(obj, j9);
                    if (B8 instanceof String) {
                        if (((String) B8).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (B8 instanceof J3) {
                        if (J3.f16332b.equals(B8)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (E5.B(obj, j9) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (J3.f16332b.equals(E5.B(obj, j9))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (E5.t(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (E5.t(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (E5.t(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (E5.x(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (E5.t(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (E5.x(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (E5.B(obj, j9) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((E5.t(obj, j8) & (1 << (C8 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean K(Object obj, int i8, int i9) {
        if (E5.t(obj, C(i9) & 1048575) == i8) {
            return true;
        }
        return false;
    }

    private final boolean L(Object obj, Object obj2, int i8) {
        if (J(obj, i8) == J(obj2, i8)) {
            return true;
        }
        return false;
    }

    private static long M(Object obj, long j8) {
        return ((Long) E5.B(obj, j8)).longValue();
    }

    private final InterfaceC2272v4 N(int i8) {
        return (InterfaceC2272v4) this.f16591b[((i8 / 3) << 1) + 1];
    }

    private final InterfaceC2210n5 O(int i8) {
        int i9 = (i8 / 3) << 1;
        InterfaceC2210n5 interfaceC2210n5 = (InterfaceC2210n5) this.f16591b[i9];
        if (interfaceC2210n5 != null) {
            return interfaceC2210n5;
        }
        InterfaceC2210n5 b9 = C2183k5.a().b((Class) this.f16591b[i9 + 1]);
        this.f16591b[i9] = b9;
        return b9;
    }

    private static boolean P(Object obj, long j8) {
        return ((Boolean) E5.B(obj, j8)).booleanValue();
    }

    private final Object Q(int i8) {
        return this.f16591b[(i8 / 3) << 1];
    }

    private static void R(Object obj) {
        if (T(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean S(int i8) {
        return (i8 & 536870912) != 0;
    }

    private static boolean T(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2240r4) {
            return ((AbstractC2240r4) obj).F();
        }
        return true;
    }

    private static double i(Object obj, long j8) {
        return ((Double) E5.B(obj, j8)).doubleValue();
    }

    private final int j(int i8) {
        if (i8 >= this.f16592c && i8 <= this.f16593d) {
            return k(i8, 0);
        }
        return -1;
    }

    private final int k(int i8, int i9) {
        int length = (this.f16590a.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = this.f16590a[i11];
            if (i8 == i12) {
                return i11;
            }
            if (i8 < i12) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:113:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.C2102b5 m(java.lang.Class r32, com.google.android.gms.internal.measurement.W4 r33, com.google.android.gms.internal.measurement.InterfaceC2129e5 r34, com.google.android.gms.internal.measurement.H4 r35, com.google.android.gms.internal.measurement.D5 r36, com.google.android.gms.internal.measurement.AbstractC2146g4 r37, com.google.android.gms.internal.measurement.Q4 r38) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2102b5.m(java.lang.Class, com.google.android.gms.internal.measurement.W4, com.google.android.gms.internal.measurement.e5, com.google.android.gms.internal.measurement.H4, com.google.android.gms.internal.measurement.D5, com.google.android.gms.internal.measurement.g4, com.google.android.gms.internal.measurement.Q4):com.google.android.gms.internal.measurement.b5");
    }

    private final Object n(int i8, int i9, Map map, InterfaceC2272v4 interfaceC2272v4, Object obj, D5 d52, Object obj2) {
        this.f16605p.a(Q(i8));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!interfaceC2272v4.a(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = d52.i(obj2);
                }
                S3 u8 = J3.u(P4.a(null, entry.getKey(), entry.getValue()));
                try {
                    P4.b(u8.b(), null, entry.getKey(), entry.getValue());
                    d52.c(obj, i9, u8.a());
                    it.remove();
                } catch (IOException e8) {
                    throw new RuntimeException(e8);
                }
            }
        }
        return obj;
    }

    private final Object o(Object obj, int i8) {
        InterfaceC2210n5 O8 = O(i8);
        long G8 = G(i8) & 1048575;
        if (!J(obj, i8)) {
            return O8.w();
        }
        Object object = f16589r.getObject(obj, G8);
        if (T(object)) {
            return object;
        }
        Object w8 = O8.w();
        if (object != null) {
            O8.e(w8, object);
        }
        return w8;
    }

    private final Object p(Object obj, int i8, int i9) {
        InterfaceC2210n5 O8 = O(i9);
        if (!K(obj, i8, i9)) {
            return O8.w();
        }
        Object object = f16589r.getObject(obj, G(i9) & 1048575);
        if (T(object)) {
            return object;
        }
        Object w8 = O8.w();
        if (object != null) {
            O8.e(w8, object);
        }
        return w8;
    }

    private final Object q(Object obj, int i8, Object obj2, D5 d52, Object obj3) {
        int i9 = this.f16590a[i8];
        Object B8 = E5.B(obj, G(i8) & 1048575);
        if (B8 == null) {
            return obj2;
        }
        InterfaceC2272v4 N8 = N(i8);
        if (N8 == null) {
            return obj2;
        }
        return n(i8, i9, this.f16605p.b(B8), N8, obj2, d52, obj3);
    }

    private static Field r(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void s(int i8, Object obj, V5 v52) {
        if (obj instanceof String) {
            v52.s(i8, (String) obj);
        } else {
            v52.j(i8, (J3) obj);
        }
    }

    private static void t(D5 d52, Object obj, V5 v52) {
        d52.g(d52.k(obj), v52);
    }

    private final void u(V5 v52, int i8, Object obj, int i9) {
        if (obj != null) {
            this.f16605p.a(Q(i9));
            v52.g(i8, null, this.f16605p.c(obj));
        }
    }

    private final void v(Object obj, int i8, int i9, Object obj2) {
        f16589r.putObject(obj, G(i9) & 1048575, obj2);
        E(obj, i8, i9);
    }

    private final void x(Object obj, int i8, Object obj2) {
        f16589r.putObject(obj, G(i8) & 1048575, obj2);
        D(obj, i8);
    }

    private final void y(Object obj, Object obj2, int i8) {
        if (!J(obj2, i8)) {
            return;
        }
        long G8 = G(i8) & 1048575;
        Unsafe unsafe = f16589r;
        Object object = unsafe.getObject(obj2, G8);
        if (object != null) {
            InterfaceC2210n5 O8 = O(i8);
            if (!J(obj, i8)) {
                if (!T(object)) {
                    unsafe.putObject(obj, G8, object);
                } else {
                    Object w8 = O8.w();
                    O8.e(w8, object);
                    unsafe.putObject(obj, G8, w8);
                }
                D(obj, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, G8);
            if (!T(object2)) {
                Object w9 = O8.w();
                O8.e(w9, object2);
                unsafe.putObject(obj, G8, w9);
                object2 = w9;
            }
            O8.e(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f16590a[i8] + " is present but null: " + String.valueOf(obj2));
    }

    private final boolean z(Object obj, int i8, int i9, int i10, int i11) {
        if (i9 == 1048575) {
            return J(obj, i8);
        }
        if ((i10 & i11) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x005a. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final int a(Object obj) {
        int i8;
        int i9;
        int i10;
        int e8;
        int z8;
        int p02;
        int B8;
        int s02;
        int v02;
        Unsafe unsafe = f16589r;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.f16590a.length) {
            int G8 = G(i14);
            int i16 = (267386880 & G8) >>> 20;
            int[] iArr = this.f16590a;
            int i17 = iArr[i14];
            int i18 = iArr[i14 + 2];
            int i19 = i18 & i11;
            if (i16 <= 17) {
                if (i19 != i12) {
                    if (i19 == i11) {
                        i13 = 0;
                    } else {
                        i13 = unsafe.getInt(obj, i19);
                    }
                    i12 = i19;
                }
                i8 = i12;
                i9 = i13;
                i10 = 1 << (i18 >>> 20);
            } else {
                i8 = i12;
                i9 = i13;
                i10 = 0;
            }
            long j8 = G8 & i11;
            if (i16 >= EnumC2191l4.f16821K.w()) {
                EnumC2191l4.f16834X.w();
            }
            switch (i16) {
                case 0:
                    if (z(obj, i14, i8, i9, i10)) {
                        e8 = AbstractC2092a4.e(i17, 0.0d);
                        i15 += e8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (z(obj, i14, i8, i9, i10)) {
                        e8 = AbstractC2092a4.f(i17, 0.0f);
                        i15 += e8;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (z(obj, i14, i8, i9, i10)) {
                        e8 = AbstractC2092a4.Y(i17, unsafe.getLong(obj, j8));
                        i15 += e8;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (z(obj, i14, i8, i9, i10)) {
                        e8 = AbstractC2092a4.m0(i17, unsafe.getLong(obj, j8));
                        i15 += e8;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (z(obj, i14, i8, i9, i10)) {
                        e8 = AbstractC2092a4.l0(i17, unsafe.getInt(obj, j8));
                        i15 += e8;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (z(obj, i14, i8, i9, i10)) {
                        e8 = AbstractC2092a4.P(i17, 0L);
                        i15 += e8;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (z(obj, i14, i8, i9, i10)) {
                        e8 = AbstractC2092a4.h0(i17, 0);
                        i15 += e8;
                        break;
                    }
                    break;
                case 7:
                    if (z(obj, i14, i8, i9, i10)) {
                        z8 = AbstractC2092a4.z(i17, true);
                        i15 += z8;
                    }
                    break;
                case 8:
                    if (z(obj, i14, i8, i9, i10)) {
                        Object object = unsafe.getObject(obj, j8);
                        if (object instanceof J3) {
                            z8 = AbstractC2092a4.Q(i17, (J3) object);
                        } else {
                            z8 = AbstractC2092a4.y(i17, (String) object);
                        }
                        i15 += z8;
                    }
                    break;
                case 9:
                    if (z(obj, i14, i8, i9, i10)) {
                        z8 = AbstractC2226p5.a(i17, unsafe.getObject(obj, j8), O(i14));
                        i15 += z8;
                    }
                    break;
                case 10:
                    if (z(obj, i14, i8, i9, i10)) {
                        z8 = AbstractC2092a4.Q(i17, (J3) unsafe.getObject(obj, j8));
                        i15 += z8;
                    }
                    break;
                case 11:
                    if (z(obj, i14, i8, i9, i10)) {
                        z8 = AbstractC2092a4.w0(i17, unsafe.getInt(obj, j8));
                        i15 += z8;
                    }
                    break;
                case 12:
                    if (z(obj, i14, i8, i9, i10)) {
                        z8 = AbstractC2092a4.d0(i17, unsafe.getInt(obj, j8));
                        i15 += z8;
                    }
                    break;
                case 13:
                    if (z(obj, i14, i8, i9, i10)) {
                        p02 = AbstractC2092a4.p0(i17, 0);
                        i15 += p02;
                    }
                    break;
                case 14:
                    if (z(obj, i14, i8, i9, i10)) {
                        z8 = AbstractC2092a4.e0(i17, 0L);
                        i15 += z8;
                    }
                    break;
                case 15:
                    if (z(obj, i14, i8, i9, i10)) {
                        z8 = AbstractC2092a4.t0(i17, unsafe.getInt(obj, j8));
                        i15 += z8;
                    }
                    break;
                case 16:
                    if (z(obj, i14, i8, i9, i10)) {
                        z8 = AbstractC2092a4.i0(i17, unsafe.getLong(obj, j8));
                        i15 += z8;
                    }
                    break;
                case 17:
                    if (z(obj, i14, i8, i9, i10)) {
                        z8 = AbstractC2092a4.x(i17, (Y4) unsafe.getObject(obj, j8), O(i14));
                        i15 += z8;
                    }
                    break;
                case 18:
                    z8 = AbstractC2226p5.A(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z8;
                    break;
                case 19:
                    z8 = AbstractC2226p5.x(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z8;
                    break;
                case 20:
                    z8 = AbstractC2226p5.G(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z8;
                    break;
                case 21:
                    z8 = AbstractC2226p5.S(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z8;
                    break;
                case 22:
                    z8 = AbstractC2226p5.D(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z8;
                    break;
                case 23:
                    z8 = AbstractC2226p5.A(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z8;
                    break;
                case 24:
                    z8 = AbstractC2226p5.x(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z8;
                    break;
                case 25:
                    z8 = AbstractC2226p5.d(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z8;
                    break;
                case 26:
                    z8 = AbstractC2226p5.q(i17, (List) unsafe.getObject(obj, j8));
                    i15 += z8;
                    break;
                case 27:
                    z8 = AbstractC2226p5.r(i17, (List) unsafe.getObject(obj, j8), O(i14));
                    i15 += z8;
                    break;
                case 28:
                    z8 = AbstractC2226p5.b(i17, (List) unsafe.getObject(obj, j8));
                    i15 += z8;
                    break;
                case 29:
                    z8 = AbstractC2226p5.P(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z8;
                    break;
                case 30:
                    z8 = AbstractC2226p5.s(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z8;
                    break;
                case 31:
                    z8 = AbstractC2226p5.x(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z8;
                    break;
                case 32:
                    z8 = AbstractC2226p5.A(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z8;
                    break;
                case 33:
                    z8 = AbstractC2226p5.J(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z8;
                    break;
                case 34:
                    z8 = AbstractC2226p5.M(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z8;
                    break;
                case 35:
                    B8 = AbstractC2226p5.B((List) unsafe.getObject(obj, j8));
                    if (B8 > 0) {
                        s02 = AbstractC2092a4.s0(i17);
                        v02 = AbstractC2092a4.v0(B8);
                        p02 = s02 + v02 + B8;
                        i15 += p02;
                    }
                    break;
                case 36:
                    B8 = AbstractC2226p5.y((List) unsafe.getObject(obj, j8));
                    if (B8 > 0) {
                        s02 = AbstractC2092a4.s0(i17);
                        v02 = AbstractC2092a4.v0(B8);
                        p02 = s02 + v02 + B8;
                        i15 += p02;
                    }
                    break;
                case 37:
                    B8 = AbstractC2226p5.H((List) unsafe.getObject(obj, j8));
                    if (B8 > 0) {
                        s02 = AbstractC2092a4.s0(i17);
                        v02 = AbstractC2092a4.v0(B8);
                        p02 = s02 + v02 + B8;
                        i15 += p02;
                    }
                    break;
                case 38:
                    B8 = AbstractC2226p5.T((List) unsafe.getObject(obj, j8));
                    if (B8 > 0) {
                        s02 = AbstractC2092a4.s0(i17);
                        v02 = AbstractC2092a4.v0(B8);
                        p02 = s02 + v02 + B8;
                        i15 += p02;
                    }
                    break;
                case 39:
                    B8 = AbstractC2226p5.E((List) unsafe.getObject(obj, j8));
                    if (B8 > 0) {
                        s02 = AbstractC2092a4.s0(i17);
                        v02 = AbstractC2092a4.v0(B8);
                        p02 = s02 + v02 + B8;
                        i15 += p02;
                    }
                    break;
                case 40:
                    B8 = AbstractC2226p5.B((List) unsafe.getObject(obj, j8));
                    if (B8 > 0) {
                        s02 = AbstractC2092a4.s0(i17);
                        v02 = AbstractC2092a4.v0(B8);
                        p02 = s02 + v02 + B8;
                        i15 += p02;
                    }
                    break;
                case 41:
                    B8 = AbstractC2226p5.y((List) unsafe.getObject(obj, j8));
                    if (B8 > 0) {
                        s02 = AbstractC2092a4.s0(i17);
                        v02 = AbstractC2092a4.v0(B8);
                        p02 = s02 + v02 + B8;
                        i15 += p02;
                    }
                    break;
                case 42:
                    B8 = AbstractC2226p5.e((List) unsafe.getObject(obj, j8));
                    if (B8 > 0) {
                        s02 = AbstractC2092a4.s0(i17);
                        v02 = AbstractC2092a4.v0(B8);
                        p02 = s02 + v02 + B8;
                        i15 += p02;
                    }
                    break;
                case 43:
                    B8 = AbstractC2226p5.Q((List) unsafe.getObject(obj, j8));
                    if (B8 > 0) {
                        s02 = AbstractC2092a4.s0(i17);
                        v02 = AbstractC2092a4.v0(B8);
                        p02 = s02 + v02 + B8;
                        i15 += p02;
                    }
                    break;
                case 44:
                    B8 = AbstractC2226p5.t((List) unsafe.getObject(obj, j8));
                    if (B8 > 0) {
                        s02 = AbstractC2092a4.s0(i17);
                        v02 = AbstractC2092a4.v0(B8);
                        p02 = s02 + v02 + B8;
                        i15 += p02;
                    }
                    break;
                case 45:
                    B8 = AbstractC2226p5.y((List) unsafe.getObject(obj, j8));
                    if (B8 > 0) {
                        s02 = AbstractC2092a4.s0(i17);
                        v02 = AbstractC2092a4.v0(B8);
                        p02 = s02 + v02 + B8;
                        i15 += p02;
                    }
                    break;
                case 46:
                    B8 = AbstractC2226p5.B((List) unsafe.getObject(obj, j8));
                    if (B8 > 0) {
                        s02 = AbstractC2092a4.s0(i17);
                        v02 = AbstractC2092a4.v0(B8);
                        p02 = s02 + v02 + B8;
                        i15 += p02;
                    }
                    break;
                case 47:
                    B8 = AbstractC2226p5.K((List) unsafe.getObject(obj, j8));
                    if (B8 > 0) {
                        s02 = AbstractC2092a4.s0(i17);
                        v02 = AbstractC2092a4.v0(B8);
                        p02 = s02 + v02 + B8;
                        i15 += p02;
                    }
                    break;
                case 48:
                    B8 = AbstractC2226p5.N((List) unsafe.getObject(obj, j8));
                    if (B8 > 0) {
                        s02 = AbstractC2092a4.s0(i17);
                        v02 = AbstractC2092a4.v0(B8);
                        p02 = s02 + v02 + B8;
                        i15 += p02;
                    }
                    break;
                case 49:
                    z8 = AbstractC2226p5.c(i17, (List) unsafe.getObject(obj, j8), O(i14));
                    i15 += z8;
                    break;
                case 50:
                    z8 = this.f16605p.h(i17, unsafe.getObject(obj, j8), Q(i14));
                    i15 += z8;
                    break;
                case 51:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2092a4.e(i17, 0.0d);
                        i15 += z8;
                    }
                    break;
                case 52:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2092a4.f(i17, 0.0f);
                        i15 += z8;
                    }
                    break;
                case 53:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2092a4.Y(i17, M(obj, j8));
                        i15 += z8;
                    }
                    break;
                case 54:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2092a4.m0(i17, M(obj, j8));
                        i15 += z8;
                    }
                    break;
                case 55:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2092a4.l0(i17, H(obj, j8));
                        i15 += z8;
                    }
                    break;
                case 56:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2092a4.P(i17, 0L);
                        i15 += z8;
                    }
                    break;
                case 57:
                    if (K(obj, i17, i14)) {
                        p02 = AbstractC2092a4.h0(i17, 0);
                        i15 += p02;
                    }
                    break;
                case 58:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2092a4.z(i17, true);
                        i15 += z8;
                    }
                    break;
                case 59:
                    if (K(obj, i17, i14)) {
                        Object object2 = unsafe.getObject(obj, j8);
                        if (object2 instanceof J3) {
                            z8 = AbstractC2092a4.Q(i17, (J3) object2);
                        } else {
                            z8 = AbstractC2092a4.y(i17, (String) object2);
                        }
                        i15 += z8;
                    }
                    break;
                case 60:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2226p5.a(i17, unsafe.getObject(obj, j8), O(i14));
                        i15 += z8;
                    }
                    break;
                case 61:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2092a4.Q(i17, (J3) unsafe.getObject(obj, j8));
                        i15 += z8;
                    }
                    break;
                case 62:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2092a4.w0(i17, H(obj, j8));
                        i15 += z8;
                    }
                    break;
                case 63:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2092a4.d0(i17, H(obj, j8));
                        i15 += z8;
                    }
                    break;
                case 64:
                    if (K(obj, i17, i14)) {
                        p02 = AbstractC2092a4.p0(i17, 0);
                        i15 += p02;
                    }
                    break;
                case 65:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2092a4.e0(i17, 0L);
                        i15 += z8;
                    }
                    break;
                case 66:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2092a4.t0(i17, H(obj, j8));
                        i15 += z8;
                    }
                    break;
                case 67:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2092a4.i0(i17, M(obj, j8));
                        i15 += z8;
                    }
                    break;
                case 68:
                    if (K(obj, i17, i14)) {
                        z8 = AbstractC2092a4.x(i17, (Y4) unsafe.getObject(obj, j8), O(i14));
                        i15 += z8;
                    }
                    break;
            }
            i14 += 3;
            i12 = i8;
            i13 = i9;
            i11 = 1048575;
        }
        int i20 = 0;
        D5 d52 = this.f16603n;
        int a9 = i15 + d52.a(d52.k(obj));
        if (this.f16595f) {
            C2182k4 b9 = this.f16604o.b(obj);
            int a10 = b9.f16800a.a();
            for (int i21 = 0; i21 < a10; i21++) {
                Map.Entry g8 = b9.f16800a.g(i21);
                android.support.v4.media.a.a(g8.getKey());
                i20 += C2182k4.b(null, g8.getValue());
            }
            for (Map.Entry entry : b9.f16800a.h()) {
                android.support.v4.media.a.a(entry.getKey());
                i20 += C2182k4.b(null, entry.getValue());
            }
            return a9 + i20;
        }
        return a9;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final boolean b(Object obj) {
        int i8;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.f16599j) {
            int i13 = this.f16598i[i12];
            int i14 = this.f16590a[i13];
            int G8 = G(i13);
            int i15 = this.f16590a[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = f16589r.getInt(obj, i16);
                }
                i9 = i11;
                i8 = i16;
            } else {
                i8 = i10;
                i9 = i11;
            }
            if ((268435456 & G8) != 0 && !z(obj, i13, i8, i9, i17)) {
                return false;
            }
            int i18 = (267386880 & G8) >>> 20;
            if (i18 != 9 && i18 != 17) {
                if (i18 != 27) {
                    if (i18 != 60 && i18 != 68) {
                        if (i18 != 49) {
                            if (i18 == 50 && !this.f16605p.c(E5.B(obj, G8 & 1048575)).isEmpty()) {
                                this.f16605p.a(Q(i13));
                                throw null;
                            }
                        }
                    } else if (K(obj, i14, i13) && !A(obj, G8, O(i13))) {
                        return false;
                    }
                }
                List list = (List) E5.B(obj, G8 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC2210n5 O8 = O(i13);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!O8.b(list.get(i19))) {
                            return false;
                        }
                    }
                }
            } else if (z(obj, i13, i8, i9, i17) && !A(obj, G8, O(i13))) {
                return false;
            }
            i12++;
            i10 = i8;
            i11 = i9;
        }
        if (this.f16595f && !this.f16604o.b(obj).n()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final void c(Object obj) {
        if (!T(obj)) {
            return;
        }
        if (obj instanceof AbstractC2240r4) {
            AbstractC2240r4 abstractC2240r4 = (AbstractC2240r4) obj;
            abstractC2240r4.h(Integer.MAX_VALUE);
            abstractC2240r4.zza = 0;
            abstractC2240r4.E();
        }
        int length = this.f16590a.length;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int G8 = G(i8);
            long j8 = 1048575 & G8;
            int i9 = (G8 & 267386880) >>> 20;
            if (i9 != 9) {
                if (i9 != 60 && i9 != 68) {
                    switch (i9) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f16602m.a(obj, j8);
                            break;
                        case 50:
                            Unsafe unsafe = f16589r;
                            Object object = unsafe.getObject(obj, j8);
                            if (object != null) {
                                unsafe.putObject(obj, j8, this.f16605p.g(object));
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (K(obj, this.f16590a[i8], i8)) {
                    O(i8).c(f16589r.getObject(obj, j8));
                }
            }
            if (J(obj, i8)) {
                O(i8).c(f16589r.getObject(obj, j8));
            }
        }
        this.f16603n.l(obj);
        if (this.f16595f) {
            this.f16604o.f(obj);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final int d(Object obj) {
        int i8;
        int b9;
        int length = this.f16590a.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int G8 = G(i10);
            int i11 = this.f16590a[i10];
            long j8 = 1048575 & G8;
            int i12 = 37;
            switch ((G8 & 267386880) >>> 20) {
                case 0:
                    i8 = i9 * 53;
                    b9 = AbstractC2256t4.b(Double.doubleToLongBits(E5.a(obj, j8)));
                    i9 = i8 + b9;
                    break;
                case 1:
                    i8 = i9 * 53;
                    b9 = Float.floatToIntBits(E5.n(obj, j8));
                    i9 = i8 + b9;
                    break;
                case 2:
                    i8 = i9 * 53;
                    b9 = AbstractC2256t4.b(E5.x(obj, j8));
                    i9 = i8 + b9;
                    break;
                case 3:
                    i8 = i9 * 53;
                    b9 = AbstractC2256t4.b(E5.x(obj, j8));
                    i9 = i8 + b9;
                    break;
                case 4:
                    i8 = i9 * 53;
                    b9 = E5.t(obj, j8);
                    i9 = i8 + b9;
                    break;
                case 5:
                    i8 = i9 * 53;
                    b9 = AbstractC2256t4.b(E5.x(obj, j8));
                    i9 = i8 + b9;
                    break;
                case 6:
                    i8 = i9 * 53;
                    b9 = E5.t(obj, j8);
                    i9 = i8 + b9;
                    break;
                case 7:
                    i8 = i9 * 53;
                    b9 = AbstractC2256t4.c(E5.F(obj, j8));
                    i9 = i8 + b9;
                    break;
                case 8:
                    i8 = i9 * 53;
                    b9 = ((String) E5.B(obj, j8)).hashCode();
                    i9 = i8 + b9;
                    break;
                case 9:
                    Object B8 = E5.B(obj, j8);
                    if (B8 != null) {
                        i12 = B8.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 10:
                    i8 = i9 * 53;
                    b9 = E5.B(obj, j8).hashCode();
                    i9 = i8 + b9;
                    break;
                case 11:
                    i8 = i9 * 53;
                    b9 = E5.t(obj, j8);
                    i9 = i8 + b9;
                    break;
                case 12:
                    i8 = i9 * 53;
                    b9 = E5.t(obj, j8);
                    i9 = i8 + b9;
                    break;
                case 13:
                    i8 = i9 * 53;
                    b9 = E5.t(obj, j8);
                    i9 = i8 + b9;
                    break;
                case 14:
                    i8 = i9 * 53;
                    b9 = AbstractC2256t4.b(E5.x(obj, j8));
                    i9 = i8 + b9;
                    break;
                case 15:
                    i8 = i9 * 53;
                    b9 = E5.t(obj, j8);
                    i9 = i8 + b9;
                    break;
                case 16:
                    i8 = i9 * 53;
                    b9 = AbstractC2256t4.b(E5.x(obj, j8));
                    i9 = i8 + b9;
                    break;
                case 17:
                    Object B9 = E5.B(obj, j8);
                    if (B9 != null) {
                        i12 = B9.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i8 = i9 * 53;
                    b9 = E5.B(obj, j8).hashCode();
                    i9 = i8 + b9;
                    break;
                case 50:
                    i8 = i9 * 53;
                    b9 = E5.B(obj, j8).hashCode();
                    i9 = i8 + b9;
                    break;
                case 51:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = AbstractC2256t4.b(Double.doubleToLongBits(i(obj, j8)));
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = Float.floatToIntBits(B(obj, j8));
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = AbstractC2256t4.b(M(obj, j8));
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = AbstractC2256t4.b(M(obj, j8));
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = H(obj, j8);
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = AbstractC2256t4.b(M(obj, j8));
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = H(obj, j8);
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = AbstractC2256t4.c(P(obj, j8));
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = ((String) E5.B(obj, j8)).hashCode();
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = E5.B(obj, j8).hashCode();
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = E5.B(obj, j8).hashCode();
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = H(obj, j8);
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = H(obj, j8);
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = H(obj, j8);
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = AbstractC2256t4.b(M(obj, j8));
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = H(obj, j8);
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = AbstractC2256t4.b(M(obj, j8));
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (K(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b9 = E5.B(obj, j8).hashCode();
                        i9 = i8 + b9;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i9 * 53) + this.f16603n.k(obj).hashCode();
        if (this.f16595f) {
            return (hashCode * 53) + this.f16604o.b(obj).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final void e(Object obj, Object obj2) {
        R(obj);
        obj2.getClass();
        for (int i8 = 0; i8 < this.f16590a.length; i8 += 3) {
            int G8 = G(i8);
            long j8 = 1048575 & G8;
            int i9 = this.f16590a[i8];
            switch ((G8 & 267386880) >>> 20) {
                case 0:
                    if (J(obj2, i8)) {
                        E5.f(obj, j8, E5.a(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (J(obj2, i8)) {
                        E5.g(obj, j8, E5.n(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (J(obj2, i8)) {
                        E5.i(obj, j8, E5.x(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (J(obj2, i8)) {
                        E5.i(obj, j8, E5.x(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (J(obj2, i8)) {
                        E5.h(obj, j8, E5.t(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (J(obj2, i8)) {
                        E5.i(obj, j8, E5.x(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (J(obj2, i8)) {
                        E5.h(obj, j8, E5.t(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (J(obj2, i8)) {
                        E5.v(obj, j8, E5.F(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (J(obj2, i8)) {
                        E5.j(obj, j8, E5.B(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    y(obj, obj2, i8);
                    break;
                case 10:
                    if (J(obj2, i8)) {
                        E5.j(obj, j8, E5.B(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (J(obj2, i8)) {
                        E5.h(obj, j8, E5.t(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (J(obj2, i8)) {
                        E5.h(obj, j8, E5.t(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (J(obj2, i8)) {
                        E5.h(obj, j8, E5.t(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (J(obj2, i8)) {
                        E5.i(obj, j8, E5.x(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (J(obj2, i8)) {
                        E5.h(obj, j8, E5.t(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (J(obj2, i8)) {
                        E5.i(obj, j8, E5.x(obj2, j8));
                        D(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    y(obj, obj2, i8);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f16602m.b(obj, obj2, j8);
                    break;
                case 50:
                    AbstractC2226p5.m(this.f16605p, obj, obj2, j8);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (K(obj2, i9, i8)) {
                        E5.j(obj, j8, E5.B(obj2, j8));
                        E(obj, i9, i8);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    F(obj, obj2, i8);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (K(obj2, i9, i8)) {
                        E5.j(obj, j8, E5.B(obj2, j8));
                        E(obj, i9, i8);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    F(obj, obj2, i8);
                    break;
            }
        }
        AbstractC2226p5.n(this.f16603n, obj, obj2);
        if (this.f16595f) {
            AbstractC2226p5.l(this.f16604o, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0b8f  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r24, com.google.android.gms.internal.measurement.V5 r25) {
        /*
            Method dump skipped, instructions count: 3270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2102b5.f(java.lang.Object, com.google.android.gms.internal.measurement.V5):void");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final void g(Object obj, byte[] bArr, int i8, int i9, I3 i32) {
        l(obj, bArr, i8, i9, 0, i32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:            if (com.google.android.gms.internal.measurement.AbstractC2226p5.p(com.google.android.gms.internal.measurement.E5.B(r10, r6), com.google.android.gms.internal.measurement.E5.B(r11, r6)) != false) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:            if (com.google.android.gms.internal.measurement.E5.x(r10, r6) == com.google.android.gms.internal.measurement.E5.x(r11, r6)) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:            if (com.google.android.gms.internal.measurement.E5.t(r10, r6) == com.google.android.gms.internal.measurement.E5.t(r11, r6)) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:            if (com.google.android.gms.internal.measurement.E5.x(r10, r6) == com.google.android.gms.internal.measurement.E5.x(r11, r6)) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:            if (com.google.android.gms.internal.measurement.E5.t(r10, r6) == com.google.android.gms.internal.measurement.E5.t(r11, r6)) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:            if (com.google.android.gms.internal.measurement.E5.t(r10, r6) == com.google.android.gms.internal.measurement.E5.t(r11, r6)) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:            if (com.google.android.gms.internal.measurement.E5.t(r10, r6) == com.google.android.gms.internal.measurement.E5.t(r11, r6)) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:            if (com.google.android.gms.internal.measurement.AbstractC2226p5.p(com.google.android.gms.internal.measurement.E5.B(r10, r6), com.google.android.gms.internal.measurement.E5.B(r11, r6)) != false) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:            if (com.google.android.gms.internal.measurement.AbstractC2226p5.p(com.google.android.gms.internal.measurement.E5.B(r10, r6), com.google.android.gms.internal.measurement.E5.B(r11, r6)) != false) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:            if (com.google.android.gms.internal.measurement.AbstractC2226p5.p(com.google.android.gms.internal.measurement.E5.B(r10, r6), com.google.android.gms.internal.measurement.E5.B(r11, r6)) != false) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:            if (com.google.android.gms.internal.measurement.E5.F(r10, r6) == com.google.android.gms.internal.measurement.E5.F(r11, r6)) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:            if (com.google.android.gms.internal.measurement.E5.t(r10, r6) == com.google.android.gms.internal.measurement.E5.t(r11, r6)) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0150, code lost:            if (com.google.android.gms.internal.measurement.E5.x(r10, r6) == com.google.android.gms.internal.measurement.E5.x(r11, r6)) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:            if (com.google.android.gms.internal.measurement.E5.t(r10, r6) == com.google.android.gms.internal.measurement.E5.t(r11, r6)) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:            if (com.google.android.gms.internal.measurement.E5.x(r10, r6) == com.google.android.gms.internal.measurement.E5.x(r11, r6)) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:            if (com.google.android.gms.internal.measurement.E5.x(r10, r6) == com.google.android.gms.internal.measurement.E5.x(r11, r6)) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:            if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.E5.n(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.E5.n(r11, r6))) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:            if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.E5.a(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.E5.a(r11, r6))) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:            if (com.google.android.gms.internal.measurement.AbstractC2226p5.p(com.google.android.gms.internal.measurement.E5.B(r10, r6), com.google.android.gms.internal.measurement.E5.B(r11, r6)) != false) goto L105;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0017. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2102b5.h(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0bf9, code lost:            if (r1 == r9) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0bfb, code lost:            r12.putInt(r15, r1, r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0bff, code lost:            r8 = r30.f16599j;        r3 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0c06, code lost:            if (r8 >= r30.f16600k) goto L588;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0c08, code lost:            r3 = (com.google.android.gms.internal.measurement.C5) q(r31, r30.f16598i[r8], r3, r30.f16603n, r31);        r8 = r8 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0c1e, code lost:            if (r3 == null) goto L481;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0c20, code lost:            r30.f16603n.h(r15, r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0c25, code lost:            if (r13 != 0) goto L486;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0c27, code lost:            if (r7 != r11) goto L484;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0c2e, code lost:            throw com.google.android.gms.internal.measurement.A4.e();     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0c33, code lost:            return r7;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0c2f, code lost:            if (r7 > r11) goto L489;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0c31, code lost:            if (r10 != r13) goto L489;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0c38, code lost:            throw com.google.android.gms.internal.measurement.A4.e();     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0423. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:380:0x092f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:482:0x00ad. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x08ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x089e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0bd4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.measurement.I3 r36) {
        /*
            Method dump skipped, instructions count: 3278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2102b5.l(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.I3):int");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final Object w() {
        return this.f16601l.a(this.f16594e);
    }
}
