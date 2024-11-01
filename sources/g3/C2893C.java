package g3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2893C implements InterfaceC2900J, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f31948a;

    /* renamed from: b, reason: collision with root package name */
    private static final a f31947b = new a(null);
    public static final Parcelable.Creator<C2893C> CREATOR = new b();

    /* renamed from: g3.C$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: g3.C$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2893C createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C2893C(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2893C[] newArray(int i8) {
            return new C2893C[i8];
        }
    }

    public C2893C(String preferred) {
        AbstractC3292y.i(preferred, "preferred");
        this.f31948a = preferred;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2893C) && AbstractC3292y.d(this.f31948a, ((C2893C) obj).f31948a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f31948a.hashCode();
    }

    public String toString() {
        return "Networks(preferred=" + this.f31948a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f31948a);
    }
}
