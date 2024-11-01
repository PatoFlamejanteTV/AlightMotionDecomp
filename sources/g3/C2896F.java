package g3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Currency;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2896F implements z2.f {
    public static final Parcelable.Creator<C2896F> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f31954a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31955b;

    /* renamed from: c, reason: collision with root package name */
    private final long f31956c;

    /* renamed from: d, reason: collision with root package name */
    private final Currency f31957d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31958e;

    /* renamed from: g3.F$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2896F createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C2896F(parcel.readString(), parcel.readString(), parcel.readLong(), (Currency) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2896F[] newArray(int i8) {
            return new C2896F[i8];
        }
    }

    public C2896F(String label, String identifier, long j8, Currency currency, String str) {
        AbstractC3292y.i(label, "label");
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(currency, "currency");
        this.f31954a = label;
        this.f31955b = identifier;
        this.f31956c = j8;
        this.f31957d = currency;
        this.f31958e = str;
    }

    public final long a() {
        return this.f31956c;
    }

    public final Currency b() {
        return this.f31957d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2896F)) {
            return false;
        }
        C2896F c2896f = (C2896F) obj;
        if (AbstractC3292y.d(this.f31954a, c2896f.f31954a) && AbstractC3292y.d(this.f31955b, c2896f.f31955b) && this.f31956c == c2896f.f31956c && AbstractC3292y.d(this.f31957d, c2896f.f31957d) && AbstractC3292y.d(this.f31958e, c2896f.f31958e)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f31958e;
    }

    public final String h() {
        return this.f31954a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.f31954a.hashCode() * 31) + this.f31955b.hashCode()) * 31) + androidx.collection.a.a(this.f31956c)) * 31) + this.f31957d.hashCode()) * 31;
        String str = this.f31958e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ShippingMethod(label=" + this.f31954a + ", identifier=" + this.f31955b + ", amount=" + this.f31956c + ", currency=" + this.f31957d + ", detail=" + this.f31958e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f31954a);
        out.writeString(this.f31955b);
        out.writeLong(this.f31956c);
        out.writeSerializable(this.f31957d);
        out.writeString(this.f31958e);
    }
}
