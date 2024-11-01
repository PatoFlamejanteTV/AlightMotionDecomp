package g3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class x implements z2.f {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f32274a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32275b;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new x(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x[] newArray(int i8) {
            return new x[i8];
        }
    }

    public x(String str, String str2) {
        this.f32274a = str;
        this.f32275b = str2;
    }

    public final String d() {
        return this.f32274a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (AbstractC3292y.d(this.f32274a, xVar.f32274a) && AbstractC3292y.d(this.f32275b, xVar.f32275b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f32274a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f32275b;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "FinancialConnectionsSession(clientSecret=" + this.f32274a + ", id=" + this.f32275b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f32274a);
        out.writeString(this.f32275b);
    }
}
