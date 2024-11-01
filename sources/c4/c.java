package c4;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f15475a;

    /* renamed from: b, reason: collision with root package name */
    private final q f15476b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15477c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15478d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15479e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15480f;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new c(parcel.readString(), q.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i8) {
            return new c[i8];
        }
    }

    public c(String deviceData, q sdkTransactionId, String sdkAppId, String sdkReferenceNumber, String sdkEphemeralPublicKey, String messageVersion) {
        AbstractC3292y.i(deviceData, "deviceData");
        AbstractC3292y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3292y.i(sdkAppId, "sdkAppId");
        AbstractC3292y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3292y.i(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        AbstractC3292y.i(messageVersion, "messageVersion");
        this.f15475a = deviceData;
        this.f15476b = sdkTransactionId;
        this.f15477c = sdkAppId;
        this.f15478d = sdkReferenceNumber;
        this.f15479e = sdkEphemeralPublicKey;
        this.f15480f = messageVersion;
    }

    public final String a() {
        return this.f15475a;
    }

    public final String b() {
        return this.f15480f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3292y.d(this.f15475a, cVar.f15475a) && AbstractC3292y.d(this.f15476b, cVar.f15476b) && AbstractC3292y.d(this.f15477c, cVar.f15477c) && AbstractC3292y.d(this.f15478d, cVar.f15478d) && AbstractC3292y.d(this.f15479e, cVar.f15479e) && AbstractC3292y.d(this.f15480f, cVar.f15480f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f15477c;
    }

    public final String h() {
        return this.f15479e;
    }

    public int hashCode() {
        return (((((((((this.f15475a.hashCode() * 31) + this.f15476b.hashCode()) * 31) + this.f15477c.hashCode()) * 31) + this.f15478d.hashCode()) * 31) + this.f15479e.hashCode()) * 31) + this.f15480f.hashCode();
    }

    public final String i() {
        return this.f15478d;
    }

    public final q l() {
        return this.f15476b;
    }

    public String toString() {
        return "AuthenticationRequestParameters(deviceData=" + this.f15475a + ", sdkTransactionId=" + this.f15476b + ", sdkAppId=" + this.f15477c + ", sdkReferenceNumber=" + this.f15478d + ", sdkEphemeralPublicKey=" + this.f15479e + ", messageVersion=" + this.f15480f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f15475a);
        this.f15476b.writeToParcel(out, i8);
        out.writeString(this.f15477c);
        out.writeString(this.f15478d);
        out.writeString(this.f15479e);
        out.writeString(this.f15480f);
    }
}
