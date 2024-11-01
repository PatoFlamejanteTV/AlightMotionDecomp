package com.stripe.android.model;

import R5.AbstractC1435t;
import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class i implements z2.f {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b f25480a;

    /* renamed from: b, reason: collision with root package name */
    private final List f25481b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25482c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25483d;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new i((b) parcel.readParcelable(i.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i[] newArray(int i8) {
            return new i[i8];
        }
    }

    /* loaded from: classes4.dex */
    public interface b extends Parcelable {

        /* loaded from: classes4.dex */
        public static final class a implements b {
            public static final Parcelable.Creator<a> CREATOR = new C0499a();

            /* renamed from: a, reason: collision with root package name */
            private final long f25484a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25485b;

            /* renamed from: c, reason: collision with root package name */
            private final StripeIntent.Usage f25486c;

            /* renamed from: d, reason: collision with root package name */
            private final n.b f25487d;

            /* renamed from: com.stripe.android.model.i$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0499a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new a(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), n.b.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(long j8, String currency, StripeIntent.Usage usage, n.b captureMethod) {
                AbstractC3292y.i(currency, "currency");
                AbstractC3292y.i(captureMethod, "captureMethod");
                this.f25484a = j8;
                this.f25485b = currency;
                this.f25486c = usage;
                this.f25487d = captureMethod;
            }

            @Override // com.stripe.android.model.i.b
            public StripeIntent.Usage G() {
                return this.f25486c;
            }

            @Override // com.stripe.android.model.i.b
            public String L() {
                return this.f25485b;
            }

            public final long a() {
                return this.f25484a;
            }

            public final n.b b() {
                return this.f25487d;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f25484a == aVar.f25484a && AbstractC3292y.d(this.f25485b, aVar.f25485b) && this.f25486c == aVar.f25486c && this.f25487d == aVar.f25487d;
            }

            public int hashCode() {
                int a9 = ((androidx.collection.a.a(this.f25484a) * 31) + this.f25485b.hashCode()) * 31;
                StripeIntent.Usage usage = this.f25486c;
                return ((a9 + (usage == null ? 0 : usage.hashCode())) * 31) + this.f25487d.hashCode();
            }

            @Override // com.stripe.android.model.i.b
            public String o() {
                return "payment";
            }

            public String toString() {
                return "Payment(amount=" + this.f25484a + ", currency=" + this.f25485b + ", setupFutureUsage=" + this.f25486c + ", captureMethod=" + this.f25487d + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeLong(this.f25484a);
                out.writeString(this.f25485b);
                StripeIntent.Usage usage = this.f25486c;
                if (usage == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeString(usage.name());
                }
                out.writeString(this.f25487d.name());
            }
        }

        /* renamed from: com.stripe.android.model.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0500b implements b {
            public static final Parcelable.Creator<C0500b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25488a;

            /* renamed from: b, reason: collision with root package name */
            private final StripeIntent.Usage f25489b;

            /* renamed from: com.stripe.android.model.i$b$b$a */
            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0500b createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new C0500b(parcel.readString(), StripeIntent.Usage.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0500b[] newArray(int i8) {
                    return new C0500b[i8];
                }
            }

            public C0500b(String str, StripeIntent.Usage setupFutureUsage) {
                AbstractC3292y.i(setupFutureUsage, "setupFutureUsage");
                this.f25488a = str;
                this.f25489b = setupFutureUsage;
            }

            @Override // com.stripe.android.model.i.b
            public StripeIntent.Usage G() {
                return this.f25489b;
            }

            @Override // com.stripe.android.model.i.b
            public String L() {
                return this.f25488a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0500b)) {
                    return false;
                }
                C0500b c0500b = (C0500b) obj;
                return AbstractC3292y.d(this.f25488a, c0500b.f25488a) && this.f25489b == c0500b.f25489b;
            }

            public int hashCode() {
                String str = this.f25488a;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.f25489b.hashCode();
            }

            @Override // com.stripe.android.model.i.b
            public String o() {
                return "setup";
            }

            public String toString() {
                return "Setup(currency=" + this.f25488a + ", setupFutureUsage=" + this.f25489b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f25488a);
                out.writeString(this.f25489b.name());
            }
        }

        StripeIntent.Usage G();

        String L();

        String o();
    }

    public i(b mode, List paymentMethodTypes, String str, String str2) {
        AbstractC3292y.i(mode, "mode");
        AbstractC3292y.i(paymentMethodTypes, "paymentMethodTypes");
        this.f25480a = mode;
        this.f25481b = paymentMethodTypes;
        this.f25482c = str;
        this.f25483d = str2;
    }

    public final b a() {
        return this.f25480a;
    }

    public final Map b() {
        b.a aVar;
        Long l8;
        String str;
        b.a aVar2;
        n.b b9;
        int i8 = 0;
        Q5.r a9 = Q5.x.a("deferred_intent[mode]", this.f25480a.o());
        b bVar = this.f25480a;
        String str2 = null;
        if (bVar instanceof b.a) {
            aVar = (b.a) bVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            l8 = Long.valueOf(aVar.a());
        } else {
            l8 = null;
        }
        Q5.r a10 = Q5.x.a("deferred_intent[amount]", l8);
        Q5.r a11 = Q5.x.a("deferred_intent[currency]", this.f25480a.L());
        StripeIntent.Usage G8 = this.f25480a.G();
        if (G8 != null) {
            str = G8.b();
        } else {
            str = null;
        }
        Q5.r a12 = Q5.x.a("deferred_intent[setup_future_usage]", str);
        b bVar2 = this.f25480a;
        if (bVar2 instanceof b.a) {
            aVar2 = (b.a) bVar2;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null && (b9 = aVar2.b()) != null) {
            str2 = b9.b();
        }
        Map k8 = Q.k(a9, a10, a11, a12, Q5.x.a("deferred_intent[capture_method]", str2), Q5.x.a("deferred_intent[payment_method_configuration][id]", this.f25482c), Q5.x.a("deferred_intent[on_behalf_of]", this.f25483d));
        List list = this.f25481b;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1435t.w();
            }
            arrayList.add(Q5.x.a("deferred_intent[payment_method_types][" + i8 + "]", (String) obj));
            i8 = i9;
        }
        return Q.p(k8, arrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC3292y.d(this.f25480a, iVar.f25480a) && AbstractC3292y.d(this.f25481b, iVar.f25481b) && AbstractC3292y.d(this.f25482c, iVar.f25482c) && AbstractC3292y.d(this.f25483d, iVar.f25483d);
    }

    public int hashCode() {
        int hashCode = ((this.f25480a.hashCode() * 31) + this.f25481b.hashCode()) * 31;
        String str = this.f25482c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25483d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DeferredIntentParams(mode=" + this.f25480a + ", paymentMethodTypes=" + this.f25481b + ", paymentMethodConfigurationId=" + this.f25482c + ", onBehalfOf=" + this.f25483d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f25480a, i8);
        out.writeStringList(this.f25481b);
        out.writeString(this.f25482c);
        out.writeString(this.f25483d);
    }
}
