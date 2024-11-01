package g3;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.AbstractC3292y;
import p2.AbstractC3564f;

/* renamed from: g3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2904c implements z2.f {
    public static final Parcelable.Creator<C2904c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f32091a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32092b;

    /* renamed from: g3.c$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2904c createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C2904c(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2904c[] newArray(int i8) {
            return new C2904c[i8];
        }
    }

    public C2904c(String low, String high) {
        AbstractC3292y.i(low, "low");
        AbstractC3292y.i(high, "high");
        this.f32091a = low;
        this.f32092b = high;
    }

    public final boolean a(AbstractC3564f.b cardNumber) {
        boolean z8;
        boolean z9;
        AbstractC3292y.i(cardNumber, "cardNumber");
        String g8 = cardNumber.g();
        BigDecimal f8 = l6.n.f(g8);
        if (f8 == null) {
            return false;
        }
        if (g8.length() >= this.f32091a.length() ? new BigDecimal(l6.n.U0(g8, this.f32091a.length())).compareTo(new BigDecimal(this.f32091a)) >= 0 : f8.compareTo(new BigDecimal(l6.n.U0(this.f32091a, g8.length()))) >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (g8.length() >= this.f32092b.length() ? new BigDecimal(l6.n.U0(g8, this.f32092b.length())).compareTo(new BigDecimal(this.f32092b)) <= 0 : f8.compareTo(new BigDecimal(l6.n.U0(this.f32092b, g8.length()))) <= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z8 || !z9) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2904c)) {
            return false;
        }
        C2904c c2904c = (C2904c) obj;
        if (AbstractC3292y.d(this.f32091a, c2904c.f32091a) && AbstractC3292y.d(this.f32092b, c2904c.f32092b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f32091a.hashCode() * 31) + this.f32092b.hashCode();
    }

    public String toString() {
        return "BinRange(low=" + this.f32091a + ", high=" + this.f32092b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f32091a);
        out.writeString(this.f32092b);
    }
}
