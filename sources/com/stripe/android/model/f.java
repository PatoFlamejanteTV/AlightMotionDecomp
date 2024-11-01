package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.C2905d;
import g3.M;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class f extends g {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final C2905d f25478a;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new f((C2905d) parcel.readParcelable(f.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f[] newArray(int i8) {
            return new f[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C2905d card) {
        super(null);
        AbstractC3292y.i(card, "card");
        this.f25478a = card;
    }

    @Override // com.stripe.android.model.g
    public M a() {
        return this.f25478a.a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && AbstractC3292y.d(this.f25478a, ((f) obj).f25478a);
    }

    public int hashCode() {
        return this.f25478a.hashCode();
    }

    public String toString() {
        return "CustomerCard(card=" + this.f25478a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f25478a, i8);
    }
}
