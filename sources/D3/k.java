package D3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes4.dex */
public final class k extends D3.a {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f1318a;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new k(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k[] newArray(int i8) {
            return new k[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String value) {
        super(null);
        AbstractC3292y.i(value, "value");
        this.f1318a = value;
    }

    @Override // D3.a
    public String a() {
        return this.f1318a;
    }

    public void b() {
        if (!n.T(a())) {
        } else {
            throw new IllegalArgumentException("The SetupIntent client_secret cannot be an empty string.");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && AbstractC3292y.d(this.f1318a, ((k) obj).f1318a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1318a.hashCode();
    }

    public String toString() {
        return "SetupIntentClientSecret(value=" + this.f1318a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f1318a);
    }
}
