package D2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes4.dex */
public final class a implements b {
    public static final Parcelable.Creator<a> CREATOR = new C0021a();

    /* renamed from: a, reason: collision with root package name */
    private final String f1231a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1232b;

    /* renamed from: D2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0021a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new a(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(String original, String replacement) {
        AbstractC3292y.i(original, "original");
        AbstractC3292y.i(replacement, "replacement");
        this.f1231a = original;
        this.f1232b = replacement;
    }

    @Override // D2.b
    public String O(String value) {
        AbstractC3292y.i(value, "value");
        return n.z(value, this.f1231a, this.f1232b, false, 4, null);
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
        if (AbstractC3292y.d(this.f1231a, aVar.f1231a) && AbstractC3292y.d(this.f1232b, aVar.f1232b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f1231a.hashCode() * 31) + this.f1232b.hashCode();
    }

    public String toString() {
        return "Replace(original=" + this.f1231a + ", replacement=" + this.f1232b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f1231a);
        out.writeString(this.f1232b);
    }
}
