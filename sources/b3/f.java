package B3;

import Q5.I;
import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import com.stripe.android.paymentsheet.w;
import j4.AbstractC3179f0;
import j4.C3168a;
import j4.G0;
import j4.N;
import j4.P0;
import j4.Y;
import j4.u0;
import j4.w0;
import j4.y0;
import j4.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import l6.n;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import r4.C3901b;
import r4.C3921u;
import r4.C3925y;
import r4.G;
import r4.Q;
import r4.S;
import r4.h0;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f605a = new f();

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f606a;

        static {
            int[] iArr = new int[z0.d.values().length];
            try {
                iArr[z0.d.f34347f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z0.d.f34343b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z0.d.f34344c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[z0.d.f34345d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[z0.d.f34346e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[z0.d.f34348g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f606a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class b implements InterfaceC3822g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S f607a;

        b(S s8) {
            this.f607a = s8;
        }

        @Override // q6.InterfaceC3822g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, U5.d dVar) {
            String str2;
            S s8;
            Q i8;
            C3925y y8;
            Q i9;
            S s9 = this.f607a;
            if (s9 != null && (i9 = s9.i()) != null) {
                str2 = i9.B();
            } else {
                str2 = null;
            }
            if ((str2 == null || n.T(str2)) && (s8 = this.f607a) != null && (i8 = s8.i()) != null && (y8 = i8.y()) != null) {
                y8.q(str);
            }
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f608a = new c();

        c() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(AbstractC3179f0 abstractC3179f0, AbstractC3179f0 abstractC3179f02) {
            int i8;
            if (!(abstractC3179f0 instanceof u0) && !(abstractC3179f0 instanceof N)) {
                if (!(abstractC3179f02 instanceof u0) && !(abstractC3179f02 instanceof N)) {
                    i8 = 0;
                } else {
                    i8 = -1;
                }
            } else {
                i8 = 1;
            }
            return Integer.valueOf(i8);
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(InterfaceC2072n tmp0, Object obj, Object obj2) {
        AbstractC3292y.i(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    public final Object b(List list, U5.d dVar) {
        C3925y i8;
        InterfaceC3813L y8;
        InterfaceC3821f v8;
        C3921u c3921u;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof h0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1435t.C(arrayList2, ((h0) it.next()).g());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof S) {
                arrayList3.add(obj2);
            }
        }
        S s8 = (S) AbstractC1435t.o0(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof h0) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            AbstractC1435t.C(arrayList5, ((h0) it2.next()).g());
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : arrayList5) {
            if (obj4 instanceof C3921u) {
                arrayList6.add(obj4);
            }
        }
        C3921u c3921u2 = (C3921u) AbstractC1435t.o0(arrayList6);
        if (c3921u2 == null) {
            ArrayList arrayList7 = new ArrayList();
            for (Object obj5 : list2) {
                if (obj5 instanceof h0) {
                    arrayList7.add(obj5);
                }
            }
            ArrayList arrayList8 = new ArrayList();
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                AbstractC1435t.C(arrayList8, ((h0) it3.next()).g());
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj6 : arrayList8) {
                if (obj6 instanceof C3901b) {
                    arrayList9.add(obj6);
                }
            }
            C3901b c3901b = (C3901b) AbstractC1435t.o0(arrayList9);
            if (c3901b != null) {
                c3921u = c3901b.t();
            } else {
                c3921u = null;
            }
            c3921u2 = c3921u;
        }
        if (c3921u2 != null && (i8 = c3921u2.i()) != null && (y8 = i8.y()) != null && (v8 = AbstractC3823h.v(y8)) != null) {
            Object collect = v8.collect(new b(s8), dVar);
            if (collect == V5.b.e()) {
                return collect;
            }
            return I.f8786a;
        }
        return I.f8786a;
    }

    public final void c(List placeholderFields, AbstractC3179f0 spec) {
        AbstractC3292y.i(placeholderFields, "placeholderFields");
        AbstractC3292y.i(spec, "spec");
        if (spec instanceof w0) {
            placeholderFields.remove(z0.d.f34343b);
            return;
        }
        if (spec instanceof Y) {
            placeholderFields.remove(z0.d.f34344c);
            return;
        }
        if (spec instanceof y0) {
            placeholderFields.remove(z0.d.f34345d);
            return;
        }
        if (spec instanceof C3168a) {
            placeholderFields.remove(z0.d.f34346e);
            return;
        }
        if (spec instanceof G0) {
            placeholderFields.remove(z0.d.f34348g);
            return;
        }
        if (spec instanceof z0) {
            z0 z0Var = (z0) spec;
            if (a.f606a[z0Var.l().ordinal()] == 1) {
                placeholderFields.remove(z0.d.f34346e);
            } else {
                placeholderFields.remove(z0Var.l());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC3179f0 d(z0.d field, List placeholderOverrideList, boolean z8, w.d configuration) {
        C3168a c3168a;
        AbstractC3292y.i(field, "field");
        AbstractC3292y.i(placeholderOverrideList, "placeholderOverrideList");
        AbstractC3292y.i(configuration, "configuration");
        int i8 = 1;
        int i9 = 3;
        G g8 = null;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        switch (a.f606a[field.ordinal()]) {
            case 1:
                C3168a c3168a2 = new C3168a(null, null, null, false, null, true, 31, null);
                c3168a = c3168a2;
                if (configuration.a() != w.d.a.f27913c) {
                    if (!placeholderOverrideList.contains(c3168a2.p())) {
                        return null;
                    }
                    c3168a = c3168a2;
                    if (configuration.a() == w.d.a.f27912b) {
                        return null;
                    }
                }
                break;
            case 2:
                w0 w0Var = new w0((G) (z11 ? 1 : 0), (P0) (z10 ? 1 : 0), i9, (AbstractC3284p) (z9 ? 1 : 0));
                c3168a = w0Var;
                if (configuration.s() != w.d.b.f27918c) {
                    if (!placeholderOverrideList.contains(w0Var.i())) {
                        return null;
                    }
                    c3168a = w0Var;
                    if (configuration.s() == w.d.b.f27917b) {
                        return null;
                    }
                }
                break;
            case 3:
                Y y8 = new Y((G) (z13 ? 1 : 0), i8, (AbstractC3284p) (z12 ? 1 : 0));
                c3168a = y8;
                if (configuration.p() != w.d.b.f27918c) {
                    if (!placeholderOverrideList.contains(y8.h())) {
                        return null;
                    }
                    c3168a = y8;
                    if (configuration.p() == w.d.b.f27917b) {
                        return null;
                    }
                }
                break;
            case 4:
                y0 y0Var = new y0((G) (z15 ? 1 : 0), i8, (AbstractC3284p) (z14 ? 1 : 0));
                c3168a = y0Var;
                if (configuration.u() != w.d.b.f27918c) {
                    if (!placeholderOverrideList.contains(y0Var.h())) {
                        return null;
                    }
                    c3168a = y0Var;
                    if (configuration.u() == w.d.b.f27917b) {
                        return null;
                    }
                }
                break;
            case 5:
                C3168a c3168a3 = new C3168a(null, null, null, false, null, false, 63, null);
                c3168a = c3168a3;
                if (configuration.a() != w.d.a.f27913c) {
                    if (!placeholderOverrideList.contains(c3168a3.p())) {
                        return null;
                    }
                    c3168a = c3168a3;
                    if (configuration.a() == w.d.a.f27912b) {
                        return null;
                    }
                }
                break;
            case 6:
                G0 g02 = new G0(g8, 0, i9, (AbstractC3284p) (z16 ? 1 : 0));
                if (!z8) {
                    return null;
                }
                return g02;
            default:
                return null;
        }
        return c3168a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:            if (r10.p() == com.stripe.android.paymentsheet.w.d.b.f27917b) goto L9;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:            if (r10.u() == com.stripe.android.paymentsheet.w.d.b.f27917b) goto L9;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:            if (r10.a() == com.stripe.android.paymentsheet.w.d.a.f27912b) goto L9;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0051, code lost:            if (r10.s() == com.stripe.android.paymentsheet.w.d.b.f27917b) goto L9;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0053, code lost:            r2 = null;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List f(java.util.List r7, java.util.List r8, boolean r9, com.stripe.android.paymentsheet.w.d r10) {
        /*
            r6 = this;
            java.lang.String r0 = "specs"
            kotlin.jvm.internal.AbstractC3292y.i(r7, r0)
            java.lang.String r0 = "placeholderOverrideList"
            kotlin.jvm.internal.AbstractC3292y.i(r8, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.AbstractC3292y.i(r10, r0)
            r0 = 4
            j4.z0$d[] r0 = new j4.z0.d[r0]
            j4.z0$d r1 = j4.z0.d.f34343b
            r2 = 0
            r0[r2] = r1
            j4.z0$d r1 = j4.z0.d.f34344c
            r2 = 1
            r0[r2] = r1
            j4.z0$d r1 = j4.z0.d.f34345d
            r2 = 2
            r0[r2] = r1
            j4.z0$d r1 = j4.z0.d.f34346e
            r2 = 3
            r0[r2] = r1
            java.util.List r0 = R5.AbstractC1435t.s(r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L35:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L90
            java.lang.Object r2 = r7.next()
            j4.f0 r2 = (j4.AbstractC3179f0) r2
            B3.f r3 = B3.f.f605a
            r3.c(r0, r2)
            boolean r4 = r2 instanceof j4.w0
            r5 = 0
            if (r4 == 0) goto L55
            com.stripe.android.paymentsheet.w$d$b r3 = r10.s()
            com.stripe.android.paymentsheet.w$d$b r4 = com.stripe.android.paymentsheet.w.d.b.f27917b
            if (r3 != r4) goto L8a
        L53:
            r2 = r5
            goto L8a
        L55:
            boolean r4 = r2 instanceof j4.Y
            if (r4 == 0) goto L62
            com.stripe.android.paymentsheet.w$d$b r3 = r10.p()
            com.stripe.android.paymentsheet.w$d$b r4 = com.stripe.android.paymentsheet.w.d.b.f27917b
            if (r3 != r4) goto L8a
            goto L53
        L62:
            boolean r4 = r2 instanceof j4.y0
            if (r4 == 0) goto L6f
            com.stripe.android.paymentsheet.w$d$b r3 = r10.u()
            com.stripe.android.paymentsheet.w$d$b r4 = com.stripe.android.paymentsheet.w.d.b.f27917b
            if (r3 != r4) goto L8a
            goto L53
        L6f:
            boolean r4 = r2 instanceof j4.C3168a
            if (r4 == 0) goto L7c
            com.stripe.android.paymentsheet.w$d$a r3 = r10.a()
            com.stripe.android.paymentsheet.w$d$a r4 = com.stripe.android.paymentsheet.w.d.a.f27912b
            if (r3 != r4) goto L8a
            goto L53
        L7c:
            boolean r4 = r2 instanceof j4.z0
            if (r4 == 0) goto L8a
            j4.z0 r2 = (j4.z0) r2
            j4.z0$d r2 = r2.l()
            j4.f0 r2 = r3.d(r2, r8, r9, r10)
        L8a:
            if (r2 == 0) goto L35
            r1.add(r2)
            goto L35
        L90:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L9b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r0.next()
            j4.z0$d r2 = (j4.z0.d) r2
            B3.f r3 = B3.f.f605a
            j4.f0 r2 = r3.d(r2, r8, r9, r10)
            if (r2 == 0) goto L9b
            r7.add(r2)
            goto L9b
        Lb3:
            java.util.List r7 = R5.AbstractC1435t.G0(r1, r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            B3.f$c r8 = B3.f.c.f608a
            B3.e r9 = new B3.e
            r9.<init>()
            java.util.List r7 = R5.AbstractC1435t.P0(r7, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.f.f(java.util.List, java.util.List, boolean, com.stripe.android.paymentsheet.w$d):java.util.List");
    }
}
