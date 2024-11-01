package com.stripe.android.view;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class w0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final com.stripe.android.model.o f29238a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29239b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f29236c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f29237d = 8;
    public static final Parcelable.Creator<w0> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
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
        public final w0 createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new w0(parcel.readInt() == 0 ? null : com.stripe.android.model.o.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w0[] newArray(int i8) {
            return new w0[i8];
        }
    }

    public w0(com.stripe.android.model.o oVar, boolean z8) {
        this.f29238a = oVar;
        this.f29239b = z8;
    }

    public Bundle a() {
        return BundleKt.bundleOf(Q5.x.a("extra_activity_result", this));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return AbstractC3292y.d(this.f29238a, w0Var.f29238a) && this.f29239b == w0Var.f29239b;
    }

    public int hashCode() {
        com.stripe.android.model.o oVar = this.f29238a;
        return ((oVar == null ? 0 : oVar.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f29239b);
    }

    public String toString() {
        return "Result(paymentMethod=" + this.f29238a + ", useGooglePay=" + this.f29239b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        com.stripe.android.model.o oVar = this.f29238a;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeInt(this.f29239b ? 1 : 0);
    }

    public /* synthetic */ w0(com.stripe.android.model.o oVar, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : oVar, (i8 & 2) != 0 ? false : z8);
    }
}
