package c4;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.KeyPair;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f15525a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyPair f15526b;

    /* renamed from: c, reason: collision with root package name */
    private final e f15527c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15528d;

    /* renamed from: e, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.n f15529e;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new m(parcel.readString(), (KeyPair) parcel.readSerializable(), e.CREATOR.createFromParcel(parcel), parcel.readInt(), com.stripe.android.stripe3ds2.transaction.n.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m[] newArray(int i8) {
            return new m[i8];
        }
    }

    public m(String sdkReferenceNumber, KeyPair sdkKeyPair, e challengeParameters, int i8, com.stripe.android.stripe3ds2.transaction.n intentData) {
        AbstractC3292y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3292y.i(sdkKeyPair, "sdkKeyPair");
        AbstractC3292y.i(challengeParameters, "challengeParameters");
        AbstractC3292y.i(intentData, "intentData");
        this.f15525a = sdkReferenceNumber;
        this.f15526b = sdkKeyPair;
        this.f15527c = challengeParameters;
        this.f15528d = i8;
        this.f15529e = intentData;
    }

    public final e a() {
        return this.f15527c;
    }

    public final com.stripe.android.stripe3ds2.transaction.n b() {
        return this.f15529e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (AbstractC3292y.d(this.f15525a, mVar.f15525a) && AbstractC3292y.d(this.f15526b, mVar.f15526b) && AbstractC3292y.d(this.f15527c, mVar.f15527c) && this.f15528d == mVar.f15528d && AbstractC3292y.d(this.f15529e, mVar.f15529e)) {
            return true;
        }
        return false;
    }

    public final KeyPair f() {
        return this.f15526b;
    }

    public final String h() {
        return this.f15525a;
    }

    public int hashCode() {
        return (((((((this.f15525a.hashCode() * 31) + this.f15526b.hashCode()) * 31) + this.f15527c.hashCode()) * 31) + this.f15528d) * 31) + this.f15529e.hashCode();
    }

    public final int i() {
        return this.f15528d;
    }

    public String toString() {
        return "InitChallengeArgs(sdkReferenceNumber=" + this.f15525a + ", sdkKeyPair=" + this.f15526b + ", challengeParameters=" + this.f15527c + ", timeoutMins=" + this.f15528d + ", intentData=" + this.f15529e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f15525a);
        out.writeSerializable(this.f15526b);
        this.f15527c.writeToParcel(out, i8);
        out.writeInt(this.f15528d);
        this.f15529e.writeToParcel(out, i8);
    }
}
