package n2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: n2.H, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3397H extends K {
    public static final Parcelable.Creator<C3397H> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.model.u f35283b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35284c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35285d;

    /* renamed from: n2.H$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3397H createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C3397H(com.stripe.android.model.u.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3397H[] newArray(int i8) {
            return new C3397H[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3397H(com.stripe.android.model.u intent, int i8, String str) {
        super(i8);
        AbstractC3292y.i(intent, "intent");
        this.f35283b = intent;
        this.f35284c = i8;
        this.f35285d = str;
    }

    @Override // n2.K
    public String b() {
        return this.f35285d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3397H)) {
            return false;
        }
        C3397H c3397h = (C3397H) obj;
        if (AbstractC3292y.d(this.f35283b, c3397h.f35283b) && this.f35284c == c3397h.f35284c && AbstractC3292y.d(this.f35285d, c3397h.f35285d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f35283b.hashCode() * 31) + this.f35284c) * 31;
        String str = this.f35285d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // n2.K
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.u f() {
        return this.f35283b;
    }

    public String toString() {
        return "SetupIntentResult(intent=" + this.f35283b + ", outcomeFromFlow=" + this.f35284c + ", failureMessage=" + this.f35285d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        this.f35283b.writeToParcel(out, i8);
        out.writeInt(this.f35284c);
        out.writeString(this.f35285d);
    }
}
