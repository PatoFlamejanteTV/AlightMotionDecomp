package p2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3559a implements z2.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f36103a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0821a f36102b = new C0821a(null);
    public static final Parcelable.Creator<C3559a> CREATOR = new b();

    /* renamed from: p2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0821a {
        private C0821a() {
        }

        public final C3559a a(String cardNumber) {
            AbstractC3292y.i(cardNumber, "cardNumber");
            String U02 = l6.n.U0(cardNumber, 6);
            if (U02.length() != 6) {
                U02 = null;
            }
            if (U02 == null) {
                return null;
            }
            return new C3559a(U02);
        }

        public /* synthetic */ C0821a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: p2.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3559a createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C3559a(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3559a[] newArray(int i8) {
            return new C3559a[i8];
        }
    }

    public C3559a(String value) {
        AbstractC3292y.i(value, "value");
        this.f36103a = value;
    }

    public final String a() {
        return this.f36103a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3559a) && AbstractC3292y.d(this.f36103a, ((C3559a) obj).f36103a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f36103a.hashCode();
    }

    public String toString() {
        return this.f36103a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f36103a);
    }
}
