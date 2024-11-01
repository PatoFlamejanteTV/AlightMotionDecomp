package w3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b f40687a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40688b;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new d(b.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR;

        /* renamed from: a, reason: collision with root package name */
        public static final b f40689a = new b("HIDDEN", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f40690b = new b("OPTIONAL", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f40691c = new b("REQUIRED", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f40692d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ W5.a f40693e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return b.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        static {
            b[] a9 = a();
            f40692d = a9;
            f40693e = W5.b.a(a9);
            CREATOR = new a();
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f40689a, f40690b, f40691c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f40692d.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(name());
        }
    }

    public d(b phone, String str) {
        AbstractC3292y.i(phone, "phone");
        this.f40687a = phone;
        this.f40688b = str;
    }

    public final String a() {
        return this.f40688b;
    }

    public final b b() {
        return this.f40687a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f40687a == dVar.f40687a && AbstractC3292y.d(this.f40688b, dVar.f40688b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f40687a.hashCode() * 31;
        String str = this.f40688b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AdditionalFieldsConfiguration(phone=" + this.f40687a + ", checkboxLabel=" + this.f40688b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        this.f40687a.writeToParcel(out, i8);
        out.writeString(this.f40688b);
    }
}
