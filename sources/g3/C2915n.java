package g3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2915n implements z2.f {
    public static final Parcelable.Creator<C2915n> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f32177a;

    /* renamed from: g3.n$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2915n createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C2915n(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2915n[] newArray(int i8) {
            return new C2915n[i8];
        }
    }

    public C2915n(String id) {
        AbstractC3292y.i(id, "id");
        this.f32177a = id;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2915n) && AbstractC3292y.d(this.f32177a, ((C2915n) obj).f32177a)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f32177a;
    }

    public int hashCode() {
        return this.f32177a.hashCode();
    }

    public String toString() {
        return "ConsumerPaymentDetailsShare(id=" + this.f32177a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f32177a);
    }
}
