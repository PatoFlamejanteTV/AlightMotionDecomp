package w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.paymentsheet.w;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4154a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f40682a;

    /* renamed from: b, reason: collision with root package name */
    private final w.a f40683b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40684c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f40685d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0915a f40681e = new C0915a(null);
    public static final Parcelable.Creator<C4154a> CREATOR = new b();

    /* renamed from: w3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0915a {
        private C0915a() {
        }

        public /* synthetic */ C0915a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: w3.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4154a createFromParcel(Parcel parcel) {
            w.a createFromParcel;
            boolean z8;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = w.a.CREATOR.createFromParcel(parcel);
            }
            w.a aVar = createFromParcel;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                bool = Boolean.valueOf(z8);
            }
            return new C4154a(readString, aVar, readString2, bool);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4154a[] newArray(int i8) {
            return new C4154a[i8];
        }
    }

    public C4154a(String str, w.a aVar, String str2, Boolean bool) {
        this.f40682a = str;
        this.f40683b = aVar;
        this.f40684c = str2;
        this.f40685d = bool;
    }

    public final w.a a() {
        return this.f40683b;
    }

    public final String b() {
        return this.f40682a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4154a)) {
            return false;
        }
        C4154a c4154a = (C4154a) obj;
        if (AbstractC3292y.d(this.f40682a, c4154a.f40682a) && AbstractC3292y.d(this.f40683b, c4154a.f40683b) && AbstractC3292y.d(this.f40684c, c4154a.f40684c) && AbstractC3292y.d(this.f40685d, c4154a.f40685d)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f40684c;
    }

    public final Boolean h() {
        return this.f40685d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f40682a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        w.a aVar = this.f40683b;
        if (aVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aVar.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f40684c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Boolean bool = this.f40685d;
        if (bool != null) {
            i8 = bool.hashCode();
        }
        return i11 + i8;
    }

    public String toString() {
        return "AddressDetails(name=" + this.f40682a + ", address=" + this.f40683b + ", phoneNumber=" + this.f40684c + ", isCheckboxSelected=" + this.f40685d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f40682a);
        w.a aVar = this.f40683b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        out.writeString(this.f40684c);
        Boolean bool = this.f40685d;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ C4154a(String str, w.a aVar, String str2, Boolean bool, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : aVar, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : bool);
    }
}
