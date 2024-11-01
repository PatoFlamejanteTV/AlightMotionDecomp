package X2;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class b implements Parcelable {

    /* loaded from: classes4.dex */
    public static final class a extends b {
        public static final Parcelable.Creator<a> CREATOR = new C0230a();

        /* renamed from: a, reason: collision with root package name */
        private final int f10959a;

        /* renamed from: X2.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0230a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(int i8) {
            super(null);
            this.f10959a = i8;
        }

        @Override // X2.b
        public String a(Resources resources) {
            AbstractC3292y.i(resources, "resources");
            String string = resources.getString(this.f10959a);
            AbstractC3292y.h(string, "getString(...)");
            return string;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f10959a == ((a) obj).f10959a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f10959a;
        }

        public String toString() {
            return "FromResources(stringResId=" + this.f10959a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(this.f10959a);
        }
    }

    /* renamed from: X2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0231b extends b {
        public static final Parcelable.Creator<C0231b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f10960a;

        /* renamed from: X2.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0231b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new C0231b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0231b[] newArray(int i8) {
                return new C0231b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0231b(String errorMessage) {
            super(null);
            AbstractC3292y.i(errorMessage, "errorMessage");
            this.f10960a = errorMessage;
        }

        @Override // X2.b
        public String a(Resources resources) {
            AbstractC3292y.i(resources, "resources");
            return this.f10960a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0231b) && AbstractC3292y.d(this.f10960a, ((C0231b) obj).f10960a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f10960a.hashCode();
        }

        public String toString() {
            return "Raw(errorMessage=" + this.f10960a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f10960a);
        }
    }

    private b() {
    }

    public abstract String a(Resources resources);

    public /* synthetic */ b(AbstractC3284p abstractC3284p) {
        this();
    }
}
