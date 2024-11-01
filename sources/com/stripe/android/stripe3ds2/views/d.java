package com.stripe.android.stripe3ds2.views;

import Q5.x;
import Y3.m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import c4.q;
import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.n;
import d4.C2757a;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final d4.b f28336a;

    /* renamed from: b, reason: collision with root package name */
    private final C2757a f28337b;

    /* renamed from: c, reason: collision with root package name */
    private final m f28338c;

    /* renamed from: d, reason: collision with root package name */
    private final c.a f28339d;

    /* renamed from: e, reason: collision with root package name */
    private final c.b f28340e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28341f;

    /* renamed from: g, reason: collision with root package name */
    private final n f28342g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f28335h = new a(null);
    public static final Parcelable.Creator<d> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final d a(Bundle extras) {
            AbstractC3292y.i(extras, "extras");
            Object parcelable = BundleCompat.getParcelable(extras, "extra_args", d.class);
            if (parcelable != null) {
                return (d) parcelable;
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
        public final d createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new d(d4.b.CREATOR.createFromParcel(parcel), C2757a.CREATOR.createFromParcel(parcel), (m) parcel.readParcelable(d.class.getClassLoader()), c.a.CREATOR.createFromParcel(parcel), (c.b) parcel.readSerializable(), parcel.readInt(), n.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    public d(d4.b cresData, C2757a creqData, m uiCustomization, c.a creqExecutorConfig, c.b creqExecutorFactory, int i8, n intentData) {
        AbstractC3292y.i(cresData, "cresData");
        AbstractC3292y.i(creqData, "creqData");
        AbstractC3292y.i(uiCustomization, "uiCustomization");
        AbstractC3292y.i(creqExecutorConfig, "creqExecutorConfig");
        AbstractC3292y.i(creqExecutorFactory, "creqExecutorFactory");
        AbstractC3292y.i(intentData, "intentData");
        this.f28336a = cresData;
        this.f28337b = creqData;
        this.f28338c = uiCustomization;
        this.f28339d = creqExecutorConfig;
        this.f28340e = creqExecutorFactory;
        this.f28341f = i8;
        this.f28342g = intentData;
    }

    public final C2757a a() {
        return this.f28337b;
    }

    public final c.a b() {
        return this.f28339d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC3292y.d(this.f28336a, dVar.f28336a) && AbstractC3292y.d(this.f28337b, dVar.f28337b) && AbstractC3292y.d(this.f28338c, dVar.f28338c) && AbstractC3292y.d(this.f28339d, dVar.f28339d) && AbstractC3292y.d(this.f28340e, dVar.f28340e) && this.f28341f == dVar.f28341f && AbstractC3292y.d(this.f28342g, dVar.f28342g);
    }

    public final c.b f() {
        return this.f28340e;
    }

    public final d4.b h() {
        return this.f28336a;
    }

    public int hashCode() {
        return (((((((((((this.f28336a.hashCode() * 31) + this.f28337b.hashCode()) * 31) + this.f28338c.hashCode()) * 31) + this.f28339d.hashCode()) * 31) + this.f28340e.hashCode()) * 31) + this.f28341f) * 31) + this.f28342g.hashCode();
    }

    public final n i() {
        return this.f28342g;
    }

    public final q l() {
        return this.f28337b.u();
    }

    public final int p() {
        return this.f28341f;
    }

    public final m s() {
        return this.f28338c;
    }

    public String toString() {
        return "ChallengeViewArgs(cresData=" + this.f28336a + ", creqData=" + this.f28337b + ", uiCustomization=" + this.f28338c + ", creqExecutorConfig=" + this.f28339d + ", creqExecutorFactory=" + this.f28340e + ", timeoutMins=" + this.f28341f + ", intentData=" + this.f28342g + ")";
    }

    public final Bundle u() {
        return BundleKt.bundleOf(x.a("extra_args", this));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        this.f28336a.writeToParcel(out, i8);
        this.f28337b.writeToParcel(out, i8);
        out.writeParcelable(this.f28338c, i8);
        this.f28339d.writeToParcel(out, i8);
        out.writeSerializable(this.f28340e);
        out.writeInt(this.f28341f);
        this.f28342g.writeToParcel(out, i8);
    }
}
