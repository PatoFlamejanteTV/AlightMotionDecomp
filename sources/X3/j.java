package X3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f11184a;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new j(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j[] newArray(int i8) {
            return new j[i8];
        }
    }

    public j(String value) {
        AbstractC3292y.i(value, "value");
        this.f11184a = value;
    }

    public final String a() {
        return this.f11184a;
    }

    public final boolean b() {
        if (this.f11184a.length() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && AbstractC3292y.d(this.f11184a, ((j) obj).f11184a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f11184a.hashCode();
    }

    public String toString() {
        return "HardwareId(value=" + this.f11184a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f11184a);
    }
}
