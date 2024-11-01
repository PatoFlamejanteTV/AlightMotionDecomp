package com.stripe.android.model;

import R5.AbstractC1435t;
import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import g3.InterfaceC2900J;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class t implements InterfaceC2900J, Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f25899b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final o.p f25900a;

    /* loaded from: classes4.dex */
    public static final class a extends t {

        /* renamed from: c, reason: collision with root package name */
        private final Integer f25903c;

        /* renamed from: d, reason: collision with root package name */
        private final Integer f25904d;

        /* renamed from: e, reason: collision with root package name */
        private final c f25905e;

        /* renamed from: f, reason: collision with root package name */
        private final o.e f25906f;

        /* renamed from: g, reason: collision with root package name */
        private final Set f25907g;

        /* renamed from: h, reason: collision with root package name */
        private final o.b f25908h;

        /* renamed from: i, reason: collision with root package name */
        private static final C0524a f25901i = new C0524a(null);

        /* renamed from: j, reason: collision with root package name */
        public static final int f25902j = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0524a {
            private C0524a() {
            }

            public /* synthetic */ C0524a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                c createFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
                o.e createFromParcel2 = parcel.readInt() == 0 ? null : o.e.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new a(valueOf, valueOf2, createFromParcel, createFromParcel2, linkedHashSet, parcel.readInt() != 0 ? o.b.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements InterfaceC2900J, Parcelable {

            /* renamed from: a, reason: collision with root package name */
            private final String f25910a;

            /* renamed from: b, reason: collision with root package name */
            private static final C0525a f25909b = new C0525a(null);
            public static final Parcelable.Creator<c> CREATOR = new b();

            /* renamed from: com.stripe.android.model.t$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            private static final class C0525a {
                private C0525a() {
                }

                public /* synthetic */ C0525a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new c(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            public c(String str) {
                this.f25910a = str;
            }

            @Override // g3.InterfaceC2900J
            public Map B() {
                String str = this.f25910a;
                if (str != null) {
                    return Q.e(Q5.x.a("preferred", str));
                }
                return Q.h();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if ((obj instanceof c) && AbstractC3292y.d(((c) obj).f25910a, this.f25910a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Objects.hash(this.f25910a);
            }

            public String toString() {
                return "PaymentMethodCreateParams.Card.Networks(preferred=" + this.f25910a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f25910a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, Integer num2, c cVar, o.e eVar, Set productUsageTokens, o.b bVar) {
            super(o.p.f25755i, null);
            AbstractC3292y.i(productUsageTokens, "productUsageTokens");
            this.f25903c = num;
            this.f25904d = num2;
            this.f25905e = cVar;
            this.f25906f = eVar;
            this.f25907g = productUsageTokens;
            this.f25908h = bVar;
        }

        @Override // com.stripe.android.model.t
        public Map a() {
            Map map;
            Q5.r rVar;
            Q5.r a9 = Q5.x.a("exp_month", this.f25903c);
            Q5.r a10 = Q5.x.a("exp_year", this.f25904d);
            c cVar = this.f25905e;
            if (cVar != null) {
                map = cVar.B();
            } else {
                map = null;
            }
            List<Q5.r> p8 = AbstractC1435t.p(a9, a10, Q5.x.a("networks", map));
            ArrayList arrayList = new ArrayList();
            for (Q5.r rVar2 : p8) {
                Object d8 = rVar2.d();
                if (d8 != null) {
                    rVar = Q5.x.a(rVar2.c(), d8);
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    arrayList.add(rVar);
                }
            }
            return Q.u(arrayList);
        }

        @Override // com.stripe.android.model.t
        public o.b b() {
            return this.f25908h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (AbstractC3292y.d(aVar.f25903c, this.f25903c) && AbstractC3292y.d(aVar.f25904d, this.f25904d) && AbstractC3292y.d(aVar.f25905e, this.f25905e) && AbstractC3292y.d(aVar.f(), f())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.stripe.android.model.t
        public o.e f() {
            return this.f25906f;
        }

        @Override // com.stripe.android.model.t
        public Set h() {
            return this.f25907g;
        }

        public int hashCode() {
            return Objects.hash(this.f25903c, this.f25904d, this.f25905e, f());
        }

        public String toString() {
            return "PaymentMethodCreateParams.Card.(expiryMonth=" + this.f25903c + ", expiryYear=" + this.f25904d + ", networks=" + this.f25905e + ", billingDetails=" + f() + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            Integer num = this.f25903c;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f25904d;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            c cVar = this.f25905e;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            o.e eVar = this.f25906f;
            if (eVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                eVar.writeToParcel(out, i8);
            }
            Set set = this.f25907g;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
            }
            o.b bVar = this.f25908h;
            if (bVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                bVar.writeToParcel(out, i8);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public static /* synthetic */ t b(b bVar, Integer num, Integer num2, a.c cVar, o.e eVar, o.b bVar2, Set set, int i8, Object obj) {
            Integer num3;
            Integer num4;
            a.c cVar2;
            o.e eVar2;
            o.b bVar3;
            if ((i8 & 1) != 0) {
                num3 = null;
            } else {
                num3 = num;
            }
            if ((i8 & 2) != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if ((i8 & 4) != 0) {
                cVar2 = null;
            } else {
                cVar2 = cVar;
            }
            if ((i8 & 8) != 0) {
                eVar2 = null;
            } else {
                eVar2 = eVar;
            }
            if ((i8 & 16) != 0) {
                bVar3 = null;
            } else {
                bVar3 = bVar2;
            }
            return bVar.a(num3, num4, cVar2, eVar2, bVar3, set);
        }

        public final t a(Integer num, Integer num2, a.c cVar, o.e eVar, o.b bVar, Set productUsageTokens) {
            AbstractC3292y.i(productUsageTokens, "productUsageTokens");
            return new a(num, num2, cVar, eVar, productUsageTokens, bVar);
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ t(o.p pVar, AbstractC3284p abstractC3284p) {
        this(pVar);
    }

    @Override // g3.InterfaceC2900J
    public Map B() {
        Map map;
        Map e8 = Q.e(Q5.x.a(this.f25900a.f25773a, a()));
        o.e f8 = f();
        Map map2 = null;
        if (f8 != null) {
            map = Q.e(Q5.x.a("billing_details", f8.B()));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        o.b b9 = b();
        if (b9 != null) {
            map2 = Q.e(Q5.x.a("allow_redisplay", b9.f()));
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        return Q.q(Q.q(map, map2), e8);
    }

    public abstract Map a();

    public abstract o.b b();

    public abstract o.e f();

    public abstract Set h();

    public final o.p i() {
        return this.f25900a;
    }

    private t(o.p pVar) {
        this.f25900a = pVar;
    }
}
