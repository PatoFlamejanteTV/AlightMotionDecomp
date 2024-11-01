package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.SourceTypeModel;
import g3.M;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class h extends g {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Source f25479a;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new h(Source.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h[] newArray(int i8) {
            return new h[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Source source) {
        super(null);
        AbstractC3292y.i(source, "source");
        this.f25479a = source;
    }

    @Override // com.stripe.android.model.g
    public M a() {
        if (this.f25479a.f() instanceof SourceTypeModel.Card) {
            return ((SourceTypeModel.Card) this.f25479a.f()).a();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && AbstractC3292y.d(this.f25479a, ((h) obj).f25479a);
    }

    public int hashCode() {
        return this.f25479a.hashCode();
    }

    public String toString() {
        return "CustomerSource(source=" + this.f25479a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        this.f25479a.writeToParcel(out, i8);
    }
}
