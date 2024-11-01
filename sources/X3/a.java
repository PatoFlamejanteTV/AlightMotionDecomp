package X3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0235a();

    /* renamed from: a, reason: collision with root package name */
    private final String f11002a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11003b;

    /* renamed from: X3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0235a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new a(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(String sdkAppId, int i8) {
        AbstractC3292y.i(sdkAppId, "sdkAppId");
        this.f11002a = sdkAppId;
        this.f11003b = i8;
    }

    public final String a() {
        return this.f11002a;
    }

    public final int b() {
        return this.f11003b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3292y.d(this.f11002a, aVar.f11002a) && this.f11003b == aVar.f11003b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f11002a.hashCode() * 31) + this.f11003b;
    }

    public String toString() {
        return "AppInfo(sdkAppId=" + this.f11002a + ", version=" + this.f11003b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f11002a);
        out.writeInt(this.f11003b);
    }
}
