package P2;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class b implements Parcelable {

    /* renamed from: P2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0156b extends b {

        /* renamed from: a, reason: collision with root package name */
        private final o f8012a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f8011b = o.f25630u;
        public static final Parcelable.Creator<C0156b> CREATOR = new a();

        /* renamed from: P2.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0156b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new C0156b((o) parcel.readParcelable(C0156b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0156b[] newArray(int i8) {
                return new C0156b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0156b(o paymentMethod) {
            super(null);
            AbstractC3292y.i(paymentMethod, "paymentMethod");
            this.f8012a = paymentMethod;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0156b) && AbstractC3292y.d(this.f8012a, ((C0156b) obj).f8012a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f8012a.hashCode();
        }

        public final o r() {
            return this.f8012a;
        }

        public String toString() {
            return "Completed(paymentMethod=" + this.f8012a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f8012a, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f8013a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable error) {
            super(null);
            AbstractC3292y.i(error, "error");
            this.f8013a = error;
        }

        public final Throwable a() {
            return this.f8013a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3292y.d(this.f8013a, ((c) obj).f8013a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f8013a.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.f8013a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeSerializable(this.f8013a);
        }
    }

    public /* synthetic */ b(AbstractC3284p abstractC3284p) {
        this();
    }

    /* loaded from: classes4.dex */
    public static final class a extends b {
        public static final Parcelable.Creator<a> CREATOR = new C0154a();

        /* renamed from: a, reason: collision with root package name */
        private final EnumC0155b f8006a;

        /* renamed from: P2.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0154a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(EnumC0155b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: P2.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0155b {

            /* renamed from: a, reason: collision with root package name */
            public static final EnumC0155b f8007a = new EnumC0155b("BackPressed", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0155b f8008b = new EnumC0155b("LoggedOut", 1);

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ EnumC0155b[] f8009c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ W5.a f8010d;

            static {
                EnumC0155b[] a9 = a();
                f8009c = a9;
                f8010d = W5.b.a(a9);
            }

            private EnumC0155b(String str, int i8) {
            }

            private static final /* synthetic */ EnumC0155b[] a() {
                return new EnumC0155b[]{f8007a, f8008b};
            }

            public static EnumC0155b valueOf(String str) {
                return (EnumC0155b) Enum.valueOf(EnumC0155b.class, str);
            }

            public static EnumC0155b[] values() {
                return (EnumC0155b[]) f8009c.clone();
            }
        }

        public /* synthetic */ a(EnumC0155b enumC0155b, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? EnumC0155b.f8007a : enumC0155b);
        }

        public final EnumC0155b a() {
            return this.f8006a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f8006a == ((a) obj).f8006a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f8006a.hashCode();
        }

        public String toString() {
            return "Canceled(reason=" + this.f8006a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f8006a.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC0155b reason) {
            super(null);
            AbstractC3292y.i(reason, "reason");
            this.f8006a = reason;
        }
    }

    private b() {
    }
}
