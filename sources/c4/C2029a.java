package c4;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.interfaces.ECPublicKey;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2029a implements Parcelable {
    public static final Parcelable.Creator<C2029a> CREATOR = new C0371a();

    /* renamed from: a, reason: collision with root package name */
    private final String f15472a;

    /* renamed from: b, reason: collision with root package name */
    private final ECPublicKey f15473b;

    /* renamed from: c, reason: collision with root package name */
    private final ECPublicKey f15474c;

    /* renamed from: c4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0371a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2029a createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C2029a(parcel.readString(), (ECPublicKey) parcel.readSerializable(), (ECPublicKey) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2029a[] newArray(int i8) {
            return new C2029a[i8];
        }
    }

    public C2029a(String acsUrl, ECPublicKey acsEphemPubKey, ECPublicKey sdkEphemPubKey) {
        AbstractC3292y.i(acsUrl, "acsUrl");
        AbstractC3292y.i(acsEphemPubKey, "acsEphemPubKey");
        AbstractC3292y.i(sdkEphemPubKey, "sdkEphemPubKey");
        this.f15472a = acsUrl;
        this.f15473b = acsEphemPubKey;
        this.f15474c = sdkEphemPubKey;
    }

    public final String a() {
        return this.f15472a;
    }

    public final ECPublicKey b() {
        return this.f15473b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2029a)) {
            return false;
        }
        C2029a c2029a = (C2029a) obj;
        if (AbstractC3292y.d(this.f15472a, c2029a.f15472a) && AbstractC3292y.d(this.f15473b, c2029a.f15473b) && AbstractC3292y.d(this.f15474c, c2029a.f15474c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f15472a.hashCode() * 31) + this.f15473b.hashCode()) * 31) + this.f15474c.hashCode();
    }

    public String toString() {
        return "AcsData(acsUrl=" + this.f15472a + ", acsEphemPubKey=" + this.f15473b + ", sdkEphemPubKey=" + this.f15474c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f15472a);
        out.writeSerializable(this.f15473b);
        out.writeSerializable(this.f15474c);
    }
}
