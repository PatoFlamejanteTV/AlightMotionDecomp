package com.stripe.android.view;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: com.stripe.android.view.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2644d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC2676u f28903a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28904b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28905c;

    /* renamed from: d, reason: collision with root package name */
    private final o.p f28906d;

    /* renamed from: e, reason: collision with root package name */
    private final n2.r f28907e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28908f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f28909g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f28902h = new b(null);
    public static final Parcelable.Creator<C2644d> CREATOR = new c();

    /* renamed from: com.stripe.android.view.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f28911b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f28912c;

        /* renamed from: e, reason: collision with root package name */
        private n2.r f28914e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f28915f;

        /* renamed from: g, reason: collision with root package name */
        private int f28916g;

        /* renamed from: a, reason: collision with root package name */
        private EnumC2676u f28910a = EnumC2676u.f29215b;

        /* renamed from: d, reason: collision with root package name */
        private o.p f28913d = o.p.f25755i;

        public final C2644d a() {
            EnumC2676u enumC2676u = this.f28910a;
            boolean z8 = this.f28911b;
            boolean z9 = this.f28912c;
            o.p pVar = this.f28913d;
            if (pVar == null) {
                pVar = o.p.f25755i;
            }
            return new C2644d(enumC2676u, z8, z9, pVar, this.f28914e, this.f28916g, this.f28915f);
        }

        public final a b(int i8) {
            this.f28916g = i8;
            return this;
        }

        public final a c(EnumC2676u billingAddressFields) {
            AbstractC3292y.i(billingAddressFields, "billingAddressFields");
            this.f28910a = billingAddressFields;
            return this;
        }

        public final /* synthetic */ a d(boolean z8) {
            this.f28912c = z8;
            return this;
        }

        public final /* synthetic */ a e(n2.r rVar) {
            this.f28914e = rVar;
            return this;
        }

        public final a f(o.p paymentMethodType) {
            AbstractC3292y.i(paymentMethodType, "paymentMethodType");
            this.f28913d = paymentMethodType;
            return this;
        }

        public final a g(boolean z8) {
            this.f28911b = z8;
            return this;
        }

        public final a h(Integer num) {
            this.f28915f = num;
            return this;
        }
    }

    /* renamed from: com.stripe.android.view.d$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final /* synthetic */ C2644d a(Intent intent) {
            AbstractC3292y.i(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
            if (parcelableExtra != null) {
                return (C2644d) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.d$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2644d createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C2644d(EnumC2676u.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, o.p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : n2.r.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2644d[] newArray(int i8) {
            return new C2644d[i8];
        }
    }

    public C2644d(EnumC2676u billingAddressFields, boolean z8, boolean z9, o.p paymentMethodType, n2.r rVar, int i8, Integer num) {
        AbstractC3292y.i(billingAddressFields, "billingAddressFields");
        AbstractC3292y.i(paymentMethodType, "paymentMethodType");
        this.f28903a = billingAddressFields;
        this.f28904b = z8;
        this.f28905c = z9;
        this.f28906d = paymentMethodType;
        this.f28907e = rVar;
        this.f28908f = i8;
        this.f28909g = num;
    }

    public final int a() {
        return this.f28908f;
    }

    public final EnumC2676u b() {
        return this.f28903a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2644d)) {
            return false;
        }
        C2644d c2644d = (C2644d) obj;
        return this.f28903a == c2644d.f28903a && this.f28904b == c2644d.f28904b && this.f28905c == c2644d.f28905c && this.f28906d == c2644d.f28906d && AbstractC3292y.d(this.f28907e, c2644d.f28907e) && this.f28908f == c2644d.f28908f && AbstractC3292y.d(this.f28909g, c2644d.f28909g);
    }

    public final n2.r f() {
        return this.f28907e;
    }

    public final o.p h() {
        return this.f28906d;
    }

    public int hashCode() {
        int hashCode = ((((((this.f28903a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f28904b)) * 31) + androidx.compose.foundation.a.a(this.f28905c)) * 31) + this.f28906d.hashCode()) * 31;
        n2.r rVar = this.f28907e;
        int hashCode2 = (((hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31) + this.f28908f) * 31;
        Integer num = this.f28909g;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final boolean i() {
        return this.f28904b;
    }

    public final Integer l() {
        return this.f28909g;
    }

    public final boolean p() {
        return this.f28905c;
    }

    public String toString() {
        return "Args(billingAddressFields=" + this.f28903a + ", shouldAttachToCustomer=" + this.f28904b + ", isPaymentSessionActive=" + this.f28905c + ", paymentMethodType=" + this.f28906d + ", paymentConfiguration=" + this.f28907e + ", addPaymentMethodFooterLayoutId=" + this.f28908f + ", windowFlags=" + this.f28909g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f28903a.name());
        out.writeInt(this.f28904b ? 1 : 0);
        out.writeInt(this.f28905c ? 1 : 0);
        this.f28906d.writeToParcel(out, i8);
        n2.r rVar = this.f28907e;
        if (rVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rVar.writeToParcel(out, i8);
        }
        out.writeInt(this.f28908f);
        Integer num = this.f28909g;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
    }
}
