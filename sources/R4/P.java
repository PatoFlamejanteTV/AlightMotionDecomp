package r4;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface P extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a implements P {
        public static final Parcelable.Creator<a> CREATOR;

        /* renamed from: a, reason: collision with root package name */
        public static final a f38104a = new a("Params", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f38105b = new a("Options", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f38106c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ W5.a f38107d;

        /* renamed from: r4.P$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0845a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return a.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        static {
            a[] a9 = a();
            f38106c = a9;
            f38107d = W5.b.a(a9);
            CREATOR = new C0845a();
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f38104a, f38105b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f38106c.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b implements P {
        public static final Parcelable.Creator<b> CREATOR;

        /* renamed from: a, reason: collision with root package name */
        public static final b f38108a = new b("Extras", 0);

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ b[] f38109b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ W5.a f38110c;

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
            f38109b = a9;
            f38110c = W5.b.a(a9);
            CREATOR = new a();
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f38108a};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f38109b.clone();
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
}
