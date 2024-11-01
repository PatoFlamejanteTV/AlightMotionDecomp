package n2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class t extends K {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.model.n f35420b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35421c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35422d;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new t(com.stripe.android.model.n.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t[] newArray(int i8) {
            return new t[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.stripe.android.model.n intent, int i8, String str) {
        super(i8);
        AbstractC3292y.i(intent, "intent");
        this.f35420b = intent;
        this.f35421c = i8;
        this.f35422d = str;
    }

    @Override // n2.K
    public String b() {
        return this.f35422d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (AbstractC3292y.d(this.f35420b, tVar.f35420b) && this.f35421c == tVar.f35421c && AbstractC3292y.d(this.f35422d, tVar.f35422d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f35420b.hashCode() * 31) + this.f35421c) * 31;
        String str = this.f35422d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // n2.K
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.n f() {
        return this.f35420b;
    }

    public String toString() {
        return "PaymentIntentResult(intent=" + this.f35420b + ", outcomeFromFlow=" + this.f35421c + ", failureMessage=" + this.f35422d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        this.f35420b.writeToParcel(out, i8);
        out.writeInt(this.f35421c);
        out.writeString(this.f35422d);
    }
}
