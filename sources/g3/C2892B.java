package g3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2892B implements z2.f {
    public static final Parcelable.Creator<C2892B> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final a f31945a;

    /* renamed from: g3.B$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0737a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f31946a;

        /* renamed from: g3.B$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0737a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3292y.i(parcel, "parcel");
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return new a(z8);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(boolean z8) {
            this.f31946a = z8;
        }

        public final boolean a() {
            return this.f31946a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f31946a == ((a) obj).f31946a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return androidx.compose.foundation.a.a(this.f31946a);
        }

        public String toString() {
            return "CardBrandChoice(eligible=" + this.f31946a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(this.f31946a ? 1 : 0);
        }
    }

    /* renamed from: g3.B$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2892B createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C2892B(a.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2892B[] newArray(int i8) {
            return new C2892B[i8];
        }
    }

    public C2892B(a cardBrandChoice) {
        AbstractC3292y.i(cardBrandChoice, "cardBrandChoice");
        this.f31945a = cardBrandChoice;
    }

    public final a a() {
        return this.f31945a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2892B) && AbstractC3292y.d(this.f31945a, ((C2892B) obj).f31945a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f31945a.hashCode();
    }

    public String toString() {
        return "MobileCardElementConfig(cardBrandChoice=" + this.f31945a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        this.f31945a.writeToParcel(out, i8);
    }
}
