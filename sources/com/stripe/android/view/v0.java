package com.stripe.android.view;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class v0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f29225a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29226b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29227c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29228d;

    /* renamed from: e, reason: collision with root package name */
    private final List f29229e;

    /* renamed from: f, reason: collision with root package name */
    private final n2.r f29230f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f29231g;

    /* renamed from: h, reason: collision with root package name */
    private final EnumC2676u f29232h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f29233i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f29234j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f29235k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f29223l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f29224m = 8;
    public static final Parcelable.Creator<v0> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ v0 a(Intent intent) {
            AbstractC3292y.i(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
            if (parcelableExtra != null) {
                return (v0) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            boolean z8 = parcel.readInt() != 0;
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i8 = 0; i8 != readInt3; i8++) {
                arrayList.add(o.p.CREATOR.createFromParcel(parcel));
            }
            return new v0(readString, readInt, readInt2, z8, arrayList, parcel.readInt() == 0 ? null : n2.r.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, EnumC2676u.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0[] newArray(int i8) {
            return new v0[i8];
        }
    }

    public v0(String str, int i8, int i9, boolean z8, List paymentMethodTypes, n2.r rVar, Integer num, EnumC2676u billingAddressFields, boolean z9, boolean z10, boolean z11) {
        AbstractC3292y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3292y.i(billingAddressFields, "billingAddressFields");
        this.f29225a = str;
        this.f29226b = i8;
        this.f29227c = i9;
        this.f29228d = z8;
        this.f29229e = paymentMethodTypes;
        this.f29230f = rVar;
        this.f29231g = num;
        this.f29232h = billingAddressFields;
        this.f29233i = z9;
        this.f29234j = z10;
        this.f29235k = z11;
    }

    public final int a() {
        return this.f29227c;
    }

    public final EnumC2676u b() {
        return this.f29232h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return AbstractC3292y.d(this.f29225a, v0Var.f29225a) && this.f29226b == v0Var.f29226b && this.f29227c == v0Var.f29227c && this.f29228d == v0Var.f29228d && AbstractC3292y.d(this.f29229e, v0Var.f29229e) && AbstractC3292y.d(this.f29230f, v0Var.f29230f) && AbstractC3292y.d(this.f29231g, v0Var.f29231g) && this.f29232h == v0Var.f29232h && this.f29233i == v0Var.f29233i && this.f29234j == v0Var.f29234j && this.f29235k == v0Var.f29235k;
    }

    public final boolean f() {
        return this.f29235k;
    }

    public final String h() {
        return this.f29225a;
    }

    public int hashCode() {
        String str = this.f29225a;
        int hashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.f29226b) * 31) + this.f29227c) * 31) + androidx.compose.foundation.a.a(this.f29228d)) * 31) + this.f29229e.hashCode()) * 31;
        n2.r rVar = this.f29230f;
        int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Integer num = this.f29231g;
        return ((((((((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.f29232h.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f29233i)) * 31) + androidx.compose.foundation.a.a(this.f29234j)) * 31) + androidx.compose.foundation.a.a(this.f29235k);
    }

    public final n2.r i() {
        return this.f29230f;
    }

    public final List l() {
        return this.f29229e;
    }

    public final int p() {
        return this.f29226b;
    }

    public final boolean s() {
        return this.f29233i;
    }

    public String toString() {
        return "Args(initialPaymentMethodId=" + this.f29225a + ", paymentMethodsFooterLayoutId=" + this.f29226b + ", addPaymentMethodFooterLayoutId=" + this.f29227c + ", isPaymentSessionActive=" + this.f29228d + ", paymentMethodTypes=" + this.f29229e + ", paymentConfiguration=" + this.f29230f + ", windowFlags=" + this.f29231g + ", billingAddressFields=" + this.f29232h + ", shouldShowGooglePay=" + this.f29233i + ", useGooglePay=" + this.f29234j + ", canDeletePaymentMethods=" + this.f29235k + ")";
    }

    public final boolean u() {
        return this.f29234j;
    }

    public final Integer v() {
        return this.f29231g;
    }

    public final boolean w() {
        return this.f29228d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f29225a);
        out.writeInt(this.f29226b);
        out.writeInt(this.f29227c);
        out.writeInt(this.f29228d ? 1 : 0);
        List list = this.f29229e;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((o.p) it.next()).writeToParcel(out, i8);
        }
        n2.r rVar = this.f29230f;
        if (rVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rVar.writeToParcel(out, i8);
        }
        Integer num = this.f29231g;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f29232h.name());
        out.writeInt(this.f29233i ? 1 : 0);
        out.writeInt(this.f29234j ? 1 : 0);
        out.writeInt(this.f29235k ? 1 : 0);
    }
}
