package d3;

import D3.f;
import Q5.p;
import Q5.x;
import R5.AbstractC1435t;
import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import b3.C1969a;
import c3.C2027g;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.j;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.model.u;
import com.stripe.android.paymentsheet.w;
import d3.InterfaceC2755g;
import d3.InterfaceC2756h;
import e3.C2791D;
import g4.C2918b;
import h4.InterfaceC2949a;
import j4.C3171b0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import t3.C4005a;
import w3.C4154a;

/* renamed from: d3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2752d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final StripeIntent f31309a;

    /* renamed from: b, reason: collision with root package name */
    private final w.d f31310b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31311c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f31312d;

    /* renamed from: e, reason: collision with root package name */
    private final List f31313e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2949a f31314f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31315g;

    /* renamed from: h, reason: collision with root package name */
    private final w.c f31316h;

    /* renamed from: i, reason: collision with root package name */
    private final C4154a f31317i;

    /* renamed from: j, reason: collision with root package name */
    private final List f31318j;

    /* renamed from: k, reason: collision with root package name */
    private final List f31319k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f31320l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f31321m;

    /* renamed from: n, reason: collision with root package name */
    private final f3.b f31322n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC2755g f31323o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f31324p;

    /* renamed from: q, reason: collision with root package name */
    public static final a f31307q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f31308r = 8;
    public static final Parcelable.Creator<C2752d> CREATOR = new b();

    /* renamed from: d3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final C2752d a(j elementsSession, F2.c configuration, List sharedDataSpecs, boolean z8, t3.d isFinancialConnectionsAvailable) {
            boolean z9;
            AbstractC3292y.i(elementsSession, "elementsSession");
            AbstractC3292y.i(configuration, "configuration");
            AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
            AbstractC3292y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            StripeIntent w8 = elementsSession.w();
            w.d f8 = configuration.f();
            List s8 = configuration.s();
            InterfaceC2949a.C0756a c0756a = InterfaceC2949a.f32643l0;
            j.a a9 = elementsSession.a();
            if (a9 != null) {
                z9 = a9.a();
            } else {
                z9 = false;
            }
            InterfaceC2949a a10 = c0756a.a(z9, configuration.u());
            String p8 = configuration.p();
            w.c h8 = configuration.h();
            boolean invoke = isFinancialConnectionsAvailable.invoke();
            return new C2752d(w8, f8, true, false, s8, a10, p8, h8, null, sharedDataSpecs, AbstractC1435t.m(), true, z8, null, InterfaceC2755g.c.f31333a, invoke);
        }

        public final C2752d b(j elementsSession, w.g configuration, List sharedDataSpecs, List externalPaymentMethodSpecs, boolean z8, f3.b bVar) {
            boolean z9;
            boolean z10;
            AbstractC3292y.i(elementsSession, "elementsSession");
            AbstractC3292y.i(configuration, "configuration");
            AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
            AbstractC3292y.i(externalPaymentMethodSpecs, "externalPaymentMethodSpecs");
            StripeIntent w8 = elementsSession.w();
            w.d i8 = configuration.i();
            boolean a9 = configuration.a();
            boolean b9 = configuration.b();
            List x8 = configuration.x();
            InterfaceC2949a.C0756a c0756a = InterfaceC2949a.f32643l0;
            j.a a10 = elementsSession.a();
            if (a10 != null) {
                z9 = a10.a();
            } else {
                z9 = false;
            }
            InterfaceC2949a a11 = c0756a.a(z9, configuration.y());
            String v8 = configuration.v();
            w.c p8 = configuration.p();
            C4154a q8 = configuration.q();
            if (configuration.l() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new C2752d(w8, i8, a9, b9, x8, a11, v8, p8, q8, sharedDataSpecs, externalPaymentMethodSpecs, z10, z8, bVar, AbstractC2753e.a(elementsSession), false, 32768, null);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: d3.d$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2752d createFromParcel(Parcel parcel) {
            boolean z8;
            boolean z9;
            w.c createFromParcel;
            C4154a createFromParcel2;
            boolean z10;
            boolean z11;
            f3.b createFromParcel3;
            boolean z12;
            AbstractC3292y.i(parcel, "parcel");
            StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(C2752d.class.getClassLoader());
            w.d createFromParcel4 = w.d.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            InterfaceC2949a interfaceC2949a = (InterfaceC2949a) parcel.readParcelable(C2752d.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = w.c.CREATOR.createFromParcel(parcel);
            }
            w.c cVar = createFromParcel;
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = C4154a.CREATOR.createFromParcel(parcel);
            }
            C4154a c4154a = createFromParcel2;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(C2752d.class.getClassLoader()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                arrayList2.add(parcel.readParcelable(C2752d.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() == 0) {
                createFromParcel3 = null;
            } else {
                createFromParcel3 = f3.b.CREATOR.createFromParcel(parcel);
            }
            f3.b bVar = createFromParcel3;
            InterfaceC2755g interfaceC2755g = (InterfaceC2755g) parcel.readParcelable(C2752d.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            return new C2752d(stripeIntent, createFromParcel4, z8, z9, createStringArrayList, interfaceC2949a, readString, cVar, c4154a, arrayList, arrayList2, z10, z11, bVar, interfaceC2755g, z12);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2752d[] newArray(int i8) {
            return new C2752d[i8];
        }
    }

    /* renamed from: d3.d$c */
    /* loaded from: classes4.dex */
    public static final class c implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f31325a;

        public c(Map map) {
            this.f31325a = map;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return T5.a.a((Integer) this.f31325a.get((String) obj), (Integer) this.f31325a.get((String) obj2));
        }
    }

    public C2752d(StripeIntent stripeIntent, w.d billingDetailsCollectionConfiguration, boolean z8, boolean z9, List paymentMethodOrder, InterfaceC2949a cbcEligibility, String merchantName, w.c cVar, C4154a c4154a, List sharedDataSpecs, List externalPaymentMethodSpecs, boolean z10, boolean z11, f3.b bVar, InterfaceC2755g paymentMethodSaveConsentBehavior, boolean z12) {
        AbstractC3292y.i(stripeIntent, "stripeIntent");
        AbstractC3292y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC3292y.i(paymentMethodOrder, "paymentMethodOrder");
        AbstractC3292y.i(cbcEligibility, "cbcEligibility");
        AbstractC3292y.i(merchantName, "merchantName");
        AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
        AbstractC3292y.i(externalPaymentMethodSpecs, "externalPaymentMethodSpecs");
        AbstractC3292y.i(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        this.f31309a = stripeIntent;
        this.f31310b = billingDetailsCollectionConfiguration;
        this.f31311c = z8;
        this.f31312d = z9;
        this.f31313e = paymentMethodOrder;
        this.f31314f = cbcEligibility;
        this.f31315g = merchantName;
        this.f31316h = cVar;
        this.f31317i = c4154a;
        this.f31318j = sharedDataSpecs;
        this.f31319k = externalPaymentMethodSpecs;
        this.f31320l = z10;
        this.f31321m = z11;
        this.f31322n = bVar;
        this.f31323o = paymentMethodSaveConsentBehavior;
        this.f31324p = z12;
    }

    private final InterfaceC2756h.d X(String str) {
        Object obj;
        Iterator it = this.f31319k.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3292y.d(((C3171b0) obj).getType(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C3171b0 c3171b0 = (C3171b0) obj;
        if (c3171b0 == null) {
            return null;
        }
        return new C2791D(c3171b0);
    }

    private final o.b b(f.a aVar) {
        InterfaceC2755g interfaceC2755g = this.f31323o;
        if (interfaceC2755g instanceof InterfaceC2755g.c) {
            return o.b.f25657b;
        }
        if (interfaceC2755g instanceof InterfaceC2755g.a) {
            return o.b.f25657b;
        }
        if (interfaceC2755g instanceof InterfaceC2755g.b) {
            if (aVar == f.a.f1246b) {
                return o.b.f25659d;
            }
            return o.b.f25657b;
        }
        throw new p();
    }

    private final Map b0(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list2, 10));
        int i8 = 0;
        for (Object obj : list2) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1435t.w();
            }
            arrayList.add(x.a((String) obj, Integer.valueOf(i8)));
            i8 = i9;
        }
        return Q.u(arrayList);
    }

    private final List c0() {
        List Z02 = AbstractC1435t.Z0(AbstractC1435t.G0(this.f31309a.e(), i()));
        ArrayList arrayList = new ArrayList();
        for (String str : this.f31313e) {
            if (Z02.contains(str)) {
                arrayList.add(str);
                Z02.remove(str);
            }
        }
        arrayList.addAll(Z02);
        return arrayList;
    }

    private final o.b f(f.a aVar) {
        InterfaceC2755g interfaceC2755g = this.f31323o;
        if (interfaceC2755g instanceof InterfaceC2755g.c) {
            return o.b.f25657b;
        }
        if (interfaceC2755g instanceof InterfaceC2755g.a) {
            o.b a9 = ((InterfaceC2755g.a) interfaceC2755g).a();
            if (a9 == null) {
                return o.b.f25658c;
            }
            return a9;
        }
        if (interfaceC2755g instanceof InterfaceC2755g.b) {
            if (aVar == f.a.f1246b) {
                return o.b.f25659d;
            }
            return o.b.f25658c;
        }
        throw new p();
    }

    private final List f0() {
        List e8 = this.f31309a.e();
        ArrayList arrayList = new ArrayList();
        Iterator it = e8.iterator();
        while (it.hasNext()) {
            InterfaceC2750b interfaceC2750b = (InterfaceC2750b) C2754f.f31326a.b().get((String) it.next());
            if (interfaceC2750b != null) {
                arrayList.add(interfaceC2750b);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (AbstractC2751c.a((InterfaceC2750b) obj, this)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            InterfaceC2750b interfaceC2750b2 = (InterfaceC2750b) obj2;
            if (!this.f31309a.c() || !this.f31309a.F().contains(interfaceC2750b2.getType().f25773a)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            InterfaceC2750b interfaceC2750b3 = (InterfaceC2750b) obj3;
            if (interfaceC2750b3.b().g(interfaceC2750b3, this.f31318j)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    private final List i() {
        List list = this.f31319k;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3171b0) it.next()).getType());
        }
        return arrayList;
    }

    public final f3.b I() {
        return this.f31322n;
    }

    public final String Q() {
        return this.f31315g;
    }

    public final InterfaceC2755g U() {
        return this.f31323o;
    }

    public final StripeIntent W() {
        return this.f31309a;
    }

    public final boolean Y() {
        StripeIntent stripeIntent = this.f31309a;
        if (stripeIntent instanceof n) {
            if (((n) stripeIntent).G() != null) {
                return true;
            }
            return false;
        }
        if (stripeIntent instanceof u) {
            return true;
        }
        throw new p();
    }

    public final boolean Z(String code) {
        AbstractC3292y.i(code, "code");
        return i().contains(code);
    }

    public final o.b a(f.a customerRequestedSave) {
        AbstractC3292y.i(customerRequestedSave, "customerRequestedSave");
        if (Y()) {
            return f(customerRequestedSave);
        }
        return b(customerRequestedSave);
    }

    public final boolean a0() {
        return this.f31321m;
    }

    public final boolean d0(String paymentMethodCode) {
        AbstractC3292y.i(paymentMethodCode, "paymentMethodCode");
        InterfaceC2750b interfaceC2750b = (InterfaceC2750b) C2754f.f31326a.b().get(paymentMethodCode);
        if (interfaceC2750b != null) {
            return interfaceC2750b.c(this);
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List e0() {
        List h02 = h0();
        ArrayList arrayList = new ArrayList();
        Iterator it = h02.iterator();
        while (it.hasNext()) {
            C2027g g02 = g0((String) it.next());
            if (g02 != null) {
                arrayList.add(g02);
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2752d)) {
            return false;
        }
        C2752d c2752d = (C2752d) obj;
        if (AbstractC3292y.d(this.f31309a, c2752d.f31309a) && AbstractC3292y.d(this.f31310b, c2752d.f31310b) && this.f31311c == c2752d.f31311c && this.f31312d == c2752d.f31312d && AbstractC3292y.d(this.f31313e, c2752d.f31313e) && AbstractC3292y.d(this.f31314f, c2752d.f31314f) && AbstractC3292y.d(this.f31315g, c2752d.f31315g) && AbstractC3292y.d(this.f31316h, c2752d.f31316h) && AbstractC3292y.d(this.f31317i, c2752d.f31317i) && AbstractC3292y.d(this.f31318j, c2752d.f31318j) && AbstractC3292y.d(this.f31319k, c2752d.f31319k) && this.f31320l == c2752d.f31320l && this.f31321m == c2752d.f31321m && AbstractC3292y.d(this.f31322n, c2752d.f31322n) && AbstractC3292y.d(this.f31323o, c2752d.f31323o) && this.f31324p == c2752d.f31324p) {
            return true;
        }
        return false;
    }

    public final C2027g g0(String code) {
        Object obj;
        AbstractC3292y.i(code, "code");
        if (Z(code)) {
            InterfaceC2756h.d X8 = X(code);
            if (X8 == null) {
                return null;
            }
            return X8.i();
        }
        Iterator it = f0().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3292y.d(((InterfaceC2750b) obj).getType().f25773a, code)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC2750b interfaceC2750b = (InterfaceC2750b) obj;
        if (interfaceC2750b == null) {
            return null;
        }
        return interfaceC2750b.b().j(interfaceC2750b, this.f31318j);
    }

    public final C2918b h() {
        if (this.f31309a instanceof n) {
            Long f8 = ((n) this.f31309a).f();
            if (f8 != null) {
                long longValue = f8.longValue();
                String L8 = ((n) this.f31309a).L();
                if (L8 != null) {
                    return new C2918b(longValue, L8);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        return null;
    }

    public final List h0() {
        List f02 = f0();
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(f02, 10));
        Iterator it = f02.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC2750b) it.next()).getType().f25773a);
        }
        List G02 = AbstractC1435t.G0(arrayList, i());
        if (!this.f31313e.isEmpty()) {
            return AbstractC1435t.P0(G02, new c(b0(c0())));
        }
        return G02;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((((((((this.f31309a.hashCode() * 31) + this.f31310b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f31311c)) * 31) + androidx.compose.foundation.a.a(this.f31312d)) * 31) + this.f31313e.hashCode()) * 31) + this.f31314f.hashCode()) * 31) + this.f31315g.hashCode()) * 31;
        w.c cVar = this.f31316h;
        int i8 = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        C4154a c4154a = this.f31317i;
        if (c4154a == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c4154a.hashCode();
        }
        int hashCode4 = (((((((((i9 + hashCode2) * 31) + this.f31318j.hashCode()) * 31) + this.f31319k.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f31320l)) * 31) + androidx.compose.foundation.a.a(this.f31321m)) * 31;
        f3.b bVar = this.f31322n;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return ((((hashCode4 + i8) * 31) + this.f31323o.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f31324p);
    }

    public final List i0() {
        List f02 = f0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f02) {
            if (((InterfaceC2750b) obj).d()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC2750b) it.next()).getType());
        }
        return arrayList2;
    }

    public final List l(String code, InterfaceC2756h.a.InterfaceC0717a uiDefinitionFactoryArgumentsFactory) {
        Object obj;
        AbstractC3292y.i(code, "code");
        AbstractC3292y.i(uiDefinitionFactoryArgumentsFactory, "uiDefinitionFactoryArgumentsFactory");
        if (Z(code)) {
            InterfaceC2756h.d X8 = X(code);
            if (X8 == null) {
                return null;
            }
            return X8.f(this, uiDefinitionFactoryArgumentsFactory.a(this, false));
        }
        Iterator it = f0().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3292y.d(((InterfaceC2750b) obj).getType().f25773a, code)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC2750b interfaceC2750b = (InterfaceC2750b) obj;
        if (interfaceC2750b == null) {
            return null;
        }
        return interfaceC2750b.b().d(interfaceC2750b, this, this.f31318j, uiDefinitionFactoryArgumentsFactory.a(this, interfaceC2750b.c(this)));
    }

    public final C1969a p(String code, boolean z8) {
        Object obj;
        AbstractC3292y.i(code, "code");
        if (Z(code)) {
            InterfaceC2756h.d X8 = X(code);
            if (X8 == null) {
                return null;
            }
            return X8.c(z8);
        }
        Iterator it = f0().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3292y.d(((InterfaceC2750b) obj).getType().f25773a, code)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC2750b interfaceC2750b = (InterfaceC2750b) obj;
        if (interfaceC2750b == null) {
            return null;
        }
        return interfaceC2750b.b().e(interfaceC2750b, this, this.f31318j, z8);
    }

    public final C4154a q() {
        return this.f31317i;
    }

    public final boolean s() {
        return this.f31311c;
    }

    public String toString() {
        return "PaymentMethodMetadata(stripeIntent=" + this.f31309a + ", billingDetailsCollectionConfiguration=" + this.f31310b + ", allowsDelayedPaymentMethods=" + this.f31311c + ", allowsPaymentMethodsRequiringShippingAddress=" + this.f31312d + ", paymentMethodOrder=" + this.f31313e + ", cbcEligibility=" + this.f31314f + ", merchantName=" + this.f31315g + ", defaultBillingDetails=" + this.f31316h + ", shippingDetails=" + this.f31317i + ", sharedDataSpecs=" + this.f31318j + ", externalPaymentMethodSpecs=" + this.f31319k + ", hasCustomerConfiguration=" + this.f31320l + ", isGooglePayReady=" + this.f31321m + ", linkInlineConfiguration=" + this.f31322n + ", paymentMethodSaveConsentBehavior=" + this.f31323o + ", financialConnectionsAvailable=" + this.f31324p + ")";
    }

    public final boolean u() {
        return this.f31312d;
    }

    public final w.d v() {
        return this.f31310b;
    }

    public final InterfaceC2949a w() {
        return this.f31314f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f31309a, i8);
        this.f31310b.writeToParcel(out, i8);
        out.writeInt(this.f31311c ? 1 : 0);
        out.writeInt(this.f31312d ? 1 : 0);
        out.writeStringList(this.f31313e);
        out.writeParcelable(this.f31314f, i8);
        out.writeString(this.f31315g);
        w.c cVar = this.f31316h;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        C4154a c4154a = this.f31317i;
        if (c4154a == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c4154a.writeToParcel(out, i8);
        }
        List list = this.f31318j;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        List list2 = this.f31319k;
        out.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            out.writeParcelable((Parcelable) it2.next(), i8);
        }
        out.writeInt(this.f31320l ? 1 : 0);
        out.writeInt(this.f31321m ? 1 : 0);
        f3.b bVar = this.f31322n;
        if (bVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar.writeToParcel(out, i8);
        }
        out.writeParcelable(this.f31323o, i8);
        out.writeInt(this.f31324p ? 1 : 0);
    }

    public final w.c x() {
        return this.f31316h;
    }

    public final boolean y() {
        return this.f31324p;
    }

    public final boolean z() {
        return this.f31320l;
    }

    public /* synthetic */ C2752d(StripeIntent stripeIntent, w.d dVar, boolean z8, boolean z9, List list, InterfaceC2949a interfaceC2949a, String str, w.c cVar, C4154a c4154a, List list2, List list3, boolean z10, boolean z11, f3.b bVar, InterfaceC2755g interfaceC2755g, boolean z12, int i8, AbstractC3284p abstractC3284p) {
        this(stripeIntent, dVar, z8, z9, list, interfaceC2949a, str, cVar, c4154a, list2, list3, z10, z11, bVar, interfaceC2755g, (i8 & 32768) != 0 ? C4005a.f39466a.invoke() : z12);
    }
}
