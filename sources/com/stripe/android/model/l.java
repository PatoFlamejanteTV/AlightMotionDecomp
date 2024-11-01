package com.stripe.android.model;

import R5.AbstractC1435t;
import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import g3.InterfaceC2900J;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class l implements InterfaceC2900J, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f25535a;

    /* renamed from: b, reason: collision with root package name */
    private final o.p f25536b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f25537c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25538d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25539e;

    /* renamed from: f, reason: collision with root package name */
    private static final a f25534f = new a(null);
    public static final Parcelable.Creator<l> CREATOR = new b();

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new l(parcel.readString(), o.p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l[] newArray(int i8) {
            return new l[i8];
        }
    }

    public l(String customerId, o.p paymentMethodType, Integer num, String str, String str2) {
        AbstractC3292y.i(customerId, "customerId");
        AbstractC3292y.i(paymentMethodType, "paymentMethodType");
        this.f25535a = customerId;
        this.f25536b = paymentMethodType;
        this.f25537c = num;
        this.f25538d = str;
        this.f25539e = str2;
    }

    @Override // g3.InterfaceC2900J
    public Map B() {
        Map map;
        List<Q5.r> p8 = AbstractC1435t.p(Q5.x.a("customer", this.f25535a), Q5.x.a("type", this.f25536b.f25773a), Q5.x.a("limit", this.f25537c), Q5.x.a("ending_before", this.f25538d), Q5.x.a("starting_after", this.f25539e));
        Map h8 = Q.h();
        for (Q5.r rVar : p8) {
            String str = (String) rVar.a();
            Object b9 = rVar.b();
            if (b9 != null) {
                map = Q.e(Q5.x.a(str, b9));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            h8 = Q.q(h8, map);
        }
        return h8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC3292y.d(this.f25535a, lVar.f25535a) && this.f25536b == lVar.f25536b && AbstractC3292y.d(this.f25537c, lVar.f25537c) && AbstractC3292y.d(this.f25538d, lVar.f25538d) && AbstractC3292y.d(this.f25539e, lVar.f25539e);
    }

    public int hashCode() {
        int hashCode = ((this.f25535a.hashCode() * 31) + this.f25536b.hashCode()) * 31;
        Integer num = this.f25537c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f25538d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25539e;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ListPaymentMethodsParams(customerId=" + this.f25535a + ", paymentMethodType=" + this.f25536b + ", limit=" + this.f25537c + ", endingBefore=" + this.f25538d + ", startingAfter=" + this.f25539e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        int intValue;
        AbstractC3292y.i(out, "out");
        out.writeString(this.f25535a);
        this.f25536b.writeToParcel(out, i8);
        Integer num = this.f25537c;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.f25538d);
        out.writeString(this.f25539e);
    }

    public /* synthetic */ l(String str, o.p pVar, Integer num, String str2, String str3, int i8, AbstractC3284p abstractC3284p) {
        this(str, pVar, (i8 & 4) != 0 ? null : num, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3);
    }
}
