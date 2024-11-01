package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2182k4 {

    /* renamed from: d, reason: collision with root package name */
    private static final C2182k4 f16799d = new C2182k4(true);

    /* renamed from: a, reason: collision with root package name */
    final AbstractC2218o5 f16800a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16801b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16802c;

    private C2182k4() {
        this.f16800a = new C2241r5();
    }

    public static int b(InterfaceC2200m4 interfaceC2200m4, Object obj) {
        L5 x8 = interfaceC2200m4.x();
        int w8 = interfaceC2200m4.w();
        if (interfaceC2200m4.z()) {
            List list = (List) obj;
            int size = list.size();
            int i8 = 0;
            if (interfaceC2200m4.y()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int i9 = 0;
                while (i8 < size) {
                    i9 += d(x8, list.get(i8));
                    i8++;
                }
                return AbstractC2092a4.s0(w8) + i9 + AbstractC2092a4.v0(i9);
            }
            int i10 = 0;
            while (i8 < size) {
                i10 += c(x8, w8, list.get(i8));
                i8++;
            }
            return i10;
        }
        return c(x8, w8, obj);
    }

    static int c(L5 l52, int i8, Object obj) {
        int s02 = AbstractC2092a4.s0(i8);
        if (l52 == L5.f16371l) {
            AbstractC2256t4.g((Y4) obj);
            s02 <<= 1;
        }
        return s02 + d(l52, obj);
    }

    private static int d(L5 l52, Object obj) {
        switch (AbstractC2173j4.f16785b[l52.ordinal()]) {
            case 1:
                return AbstractC2092a4.c(((Double) obj).doubleValue());
            case 2:
                return AbstractC2092a4.d(((Float) obj).floatValue());
            case 3:
                return AbstractC2092a4.a0(((Long) obj).longValue());
            case 4:
                return AbstractC2092a4.n0(((Long) obj).longValue());
            case 5:
                return AbstractC2092a4.g0(((Integer) obj).intValue());
            case 6:
                return AbstractC2092a4.S(((Long) obj).longValue());
            case 7:
                return AbstractC2092a4.c0(((Integer) obj).intValue());
            case 8:
                return AbstractC2092a4.h(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC2092a4.B((Y4) obj);
            case 10:
                return AbstractC2092a4.T((Y4) obj);
            case 11:
                if (obj instanceof J3) {
                    return AbstractC2092a4.A((J3) obj);
                }
                return AbstractC2092a4.C((String) obj);
            case 12:
                if (obj instanceof J3) {
                    return AbstractC2092a4.A((J3) obj);
                }
                return AbstractC2092a4.i((byte[]) obj);
            case 13:
                return AbstractC2092a4.v0(((Integer) obj).intValue());
            case 14:
                return AbstractC2092a4.k0(((Integer) obj).intValue());
            case 15:
                return AbstractC2092a4.f0(((Long) obj).longValue());
            case 16:
                return AbstractC2092a4.o0(((Integer) obj).intValue());
            case 17:
                return AbstractC2092a4.j0(((Long) obj).longValue());
            case 18:
                if (obj instanceof InterfaceC2280w4) {
                    return AbstractC2092a4.X(((InterfaceC2280w4) obj).w());
                }
                return AbstractC2092a4.X(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int e(Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    private final void g(InterfaceC2200m4 interfaceC2200m4, Object obj) {
        if (interfaceC2200m4.z()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i8 = 0; i8 < size; i8++) {
                    Object obj2 = list.get(i8);
                    j(interfaceC2200m4, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            j(interfaceC2200m4, obj);
        }
        this.f16800a.put(interfaceC2200m4, obj);
    }

    private final void h(Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:            if ((r6 instanceof com.google.android.gms.internal.measurement.Y4) == false) goto L4;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:            if ((r6 instanceof com.google.android.gms.internal.measurement.InterfaceC2280w4) == false) goto L4;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:            if ((r6 instanceof byte[]) == false) goto L4;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void j(com.google.android.gms.internal.measurement.InterfaceC2200m4 r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.measurement.L5 r0 = r5.x()
            com.google.android.gms.internal.measurement.AbstractC2256t4.e(r6)
            int[] r1 = com.google.android.gms.internal.measurement.AbstractC2173j4.f16784a
            com.google.android.gms.internal.measurement.S5 r0 = r0.a()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L2a;
                case 8: goto L21;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = 0
            goto L44
        L1a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.Y4
            if (r0 != 0) goto L1f
            goto L18
        L1f:
            r0 = 1
            goto L44
        L21:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L1f
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.InterfaceC2280w4
            if (r0 == 0) goto L18
            goto L1f
        L2a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.J3
            if (r0 != 0) goto L1f
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
            goto L1f
        L33:
            boolean r0 = r6 instanceof java.lang.String
            goto L44
        L36:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r0 = r6 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r0 = r6 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r0 = r6 instanceof java.lang.Long
            goto L44
        L42:
            boolean r0 = r6 instanceof java.lang.Integer
        L44:
            if (r0 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r3 = r5.w()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.internal.measurement.L5 r5 = r5.x()
            com.google.android.gms.internal.measurement.S5 r5 = r5.a()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r3
            r4[r1] = r5
            r5 = 2
            r4[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2182k4.j(com.google.android.gms.internal.measurement.m4, java.lang.Object):void");
    }

    private static boolean k(Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        throw null;
    }

    public final int a() {
        int a9 = this.f16800a.a();
        int i8 = 0;
        for (int i9 = 0; i9 < a9; i9++) {
            i8 += e(this.f16800a.g(i9));
        }
        Iterator it = this.f16800a.h().iterator();
        while (it.hasNext()) {
            i8 += e((Map.Entry) it.next());
        }
        return i8;
    }

    public final /* synthetic */ Object clone() {
        C2182k4 c2182k4 = new C2182k4();
        int a9 = this.f16800a.a();
        for (int i8 = 0; i8 < a9; i8++) {
            Map.Entry g8 = this.f16800a.g(i8);
            android.support.v4.media.a.a(g8.getKey());
            c2182k4.g(null, g8.getValue());
        }
        for (Map.Entry entry : this.f16800a.h()) {
            android.support.v4.media.a.a(entry.getKey());
            c2182k4.g(null, entry.getValue());
        }
        c2182k4.f16802c = this.f16802c;
        return c2182k4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2182k4)) {
            return false;
        }
        return this.f16800a.equals(((C2182k4) obj).f16800a);
    }

    public final void f(C2182k4 c2182k4) {
        int a9 = c2182k4.f16800a.a();
        for (int i8 = 0; i8 < a9; i8++) {
            h(c2182k4.f16800a.g(i8));
        }
        Iterator it = c2182k4.f16800a.h().iterator();
        while (it.hasNext()) {
            h((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f16800a.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator i() {
        if (this.f16800a.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.f16802c) {
            return new E4(this.f16800a.l().iterator());
        }
        return this.f16800a.l().iterator();
    }

    public final Iterator l() {
        if (this.f16800a.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.f16802c) {
            return new E4(this.f16800a.entrySet().iterator());
        }
        return this.f16800a.entrySet().iterator();
    }

    public final void m() {
        if (this.f16801b) {
            return;
        }
        int a9 = this.f16800a.a();
        for (int i8 = 0; i8 < a9; i8++) {
            Object value = this.f16800a.g(i8).getValue();
            if (value instanceof AbstractC2240r4) {
                ((AbstractC2240r4) value).D();
            }
        }
        Iterator it = this.f16800a.h().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC2240r4) {
                ((AbstractC2240r4) value2).D();
            }
        }
        this.f16800a.m();
        this.f16801b = true;
    }

    public final boolean n() {
        int a9 = this.f16800a.a();
        for (int i8 = 0; i8 < a9; i8++) {
            if (!k(this.f16800a.g(i8))) {
                return false;
            }
        }
        Iterator it = this.f16800a.h().iterator();
        while (it.hasNext()) {
            if (!k((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private C2182k4(AbstractC2218o5 abstractC2218o5) {
        this.f16800a = abstractC2218o5;
        m();
    }

    private C2182k4(boolean z8) {
        this(new C2241r5());
        m();
    }
}
