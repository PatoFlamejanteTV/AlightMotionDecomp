package g3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2895E implements z2.f, InterfaceC2900J {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.model.a f31951a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31952b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31953c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f31950d = new a(null);
    public static final Parcelable.Creator<C2895E> CREATOR = new b();

    /* renamed from: g3.E$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: g3.E$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2895E createFromParcel(Parcel parcel) {
            com.stripe.android.model.a createFromParcel;
            AbstractC3292y.i(parcel, "parcel");
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
            }
            return new C2895E(createFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2895E[] newArray(int i8) {
            return new C2895E[i8];
        }
    }

    public C2895E(com.stripe.android.model.a aVar, String str, String str2) {
        this.f31951a = aVar;
        this.f31952b = str;
        this.f31953c = str2;
    }

    public final com.stripe.android.model.a a() {
        return this.f31951a;
    }

    public final String b() {
        return this.f31952b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2895E)) {
            return false;
        }
        C2895E c2895e = (C2895E) obj;
        if (AbstractC3292y.d(this.f31951a, c2895e.f31951a) && AbstractC3292y.d(this.f31952b, c2895e.f31952b) && AbstractC3292y.d(this.f31953c, c2895e.f31953c)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f31953c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        com.stripe.android.model.a aVar = this.f31951a;
        int i8 = 0;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int i9 = hashCode * 31;
        String str = this.f31952b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f31953c;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return "ShippingInformation(address=" + this.f31951a + ", name=" + this.f31952b + ", phone=" + this.f31953c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        com.stripe.android.model.a aVar = this.f31951a;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        out.writeString(this.f31952b);
        out.writeString(this.f31953c);
    }
}
