package l3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3322a extends Parcelable {

    /* renamed from: l3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0793a implements Parcelable, InterfaceC3322a {
        public static final Parcelable.Creator<C0793a> CREATOR = new C0794a();

        /* renamed from: a, reason: collision with root package name */
        private final String f34660a;

        /* renamed from: l3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0794a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0793a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new C0793a(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0793a[] newArray(int i8) {
                return new C0793a[i8];
            }
        }

        public C0793a(String str) {
            this.f34660a = str;
        }

        public final String a() {
            return this.f34660a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0793a) && AbstractC3292y.d(this.f34660a, ((C0793a) obj).f34660a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f34660a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "InstantDebits(email=" + this.f34660a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f34660a);
        }
    }

    /* renamed from: l3.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable, InterfaceC3322a {
        public static final Parcelable.Creator<b> CREATOR = new C0795a();

        /* renamed from: a, reason: collision with root package name */
        private final String f34661a;

        /* renamed from: b, reason: collision with root package name */
        private final String f34662b;

        /* renamed from: l3.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0795a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String name, String str) {
            AbstractC3292y.i(name, "name");
            this.f34661a = name;
            this.f34662b = str;
        }

        public final String a() {
            return this.f34662b;
        }

        public final String b() {
            return this.f34661a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3292y.d(this.f34661a, bVar.f34661a) && AbstractC3292y.d(this.f34662b, bVar.f34662b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f34661a.hashCode() * 31;
            String str = this.f34662b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "USBankAccount(name=" + this.f34661a + ", email=" + this.f34662b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f34661a);
            out.writeString(this.f34662b);
        }
    }
}
