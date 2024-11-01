package com.stripe.android.view;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: com.stripe.android.view.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2669p0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final n2.u f29145a;

    /* renamed from: b, reason: collision with root package name */
    private final n2.v f29146b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29147c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f29148d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f29143e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f29144f = 8;
    public static final Parcelable.Creator<C2669p0> CREATOR = new b();

    /* renamed from: com.stripe.android.view.p0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final C2669p0 a(Intent intent) {
            AbstractC3292y.i(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
            if (parcelableExtra != null) {
                return (C2669p0) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.p0$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2669p0 createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C2669p0(n2.u.CREATOR.createFromParcel(parcel), n2.v.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2669p0[] newArray(int i8) {
            return new C2669p0[i8];
        }
    }

    public C2669p0(n2.u paymentSessionConfig, n2.v paymentSessionData, boolean z8, Integer num) {
        AbstractC3292y.i(paymentSessionConfig, "paymentSessionConfig");
        AbstractC3292y.i(paymentSessionData, "paymentSessionData");
        this.f29145a = paymentSessionConfig;
        this.f29146b = paymentSessionData;
        this.f29147c = z8;
        this.f29148d = num;
    }

    public final n2.u a() {
        return this.f29145a;
    }

    public final n2.v b() {
        return this.f29146b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2669p0)) {
            return false;
        }
        C2669p0 c2669p0 = (C2669p0) obj;
        return AbstractC3292y.d(this.f29145a, c2669p0.f29145a) && AbstractC3292y.d(this.f29146b, c2669p0.f29146b) && this.f29147c == c2669p0.f29147c && AbstractC3292y.d(this.f29148d, c2669p0.f29148d);
    }

    public final Integer f() {
        return this.f29148d;
    }

    public int hashCode() {
        int hashCode = ((((this.f29145a.hashCode() * 31) + this.f29146b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f29147c)) * 31;
        Integer num = this.f29148d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "Args(paymentSessionConfig=" + this.f29145a + ", paymentSessionData=" + this.f29146b + ", isPaymentSessionActive=" + this.f29147c + ", windowFlags=" + this.f29148d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        int intValue;
        AbstractC3292y.i(out, "out");
        this.f29145a.writeToParcel(out, i8);
        this.f29146b.writeToParcel(out, i8);
        out.writeInt(this.f29147c ? 1 : 0);
        Integer num = this.f29148d;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }
}
