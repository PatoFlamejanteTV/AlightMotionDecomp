package o2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: o2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3523e extends Parcelable {

    /* renamed from: o2.e$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3523e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35922a = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0818a();

        /* renamed from: o2.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0818a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return a.f35922a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        private a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 642243785;
        }

        public String toString() {
            return "Observer";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: o2.e$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3523e {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f35923a;

        /* renamed from: o2.e$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String id) {
            AbstractC3292y.i(id, "id");
            this.f35923a = id;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3292y.d(this.f35923a, ((b) obj).f35923a)) {
                return true;
            }
            return false;
        }

        public final String getId() {
            return this.f35923a;
        }

        public int hashCode() {
            return this.f35923a.hashCode();
        }

        public String toString() {
            return "Owner(id=" + this.f35923a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f35923a);
        }
    }
}
