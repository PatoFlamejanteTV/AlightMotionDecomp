package f3;

import P2.d;
import Y2.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final k f31858a;

    /* renamed from: b, reason: collision with root package name */
    private final d f31859b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f31857c = d.f8014i;
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new b(k.valueOf(parcel.readString()), (d) parcel.readParcelable(b.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i8) {
            return new b[i8];
        }
    }

    public b(k signupMode, d linkConfiguration) {
        AbstractC3292y.i(signupMode, "signupMode");
        AbstractC3292y.i(linkConfiguration, "linkConfiguration");
        this.f31858a = signupMode;
        this.f31859b = linkConfiguration;
    }

    public final d a() {
        return this.f31859b;
    }

    public final k b() {
        return this.f31858a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f31858a == bVar.f31858a && AbstractC3292y.d(this.f31859b, bVar.f31859b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f31858a.hashCode() * 31) + this.f31859b.hashCode();
    }

    public String toString() {
        return "LinkInlineConfiguration(signupMode=" + this.f31858a + ", linkConfiguration=" + this.f31859b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f31858a.name());
        out.writeParcelable(this.f31859b, i8);
    }
}
