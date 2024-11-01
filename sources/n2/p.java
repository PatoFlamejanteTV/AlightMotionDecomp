package n2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    private static p f35396d;

    /* renamed from: a, reason: collision with root package name */
    private final c f35398a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f35394b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f35395c = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final p f35397e = new a().b(new c.a().a()).a();

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private c f35399a;

        public final p a() {
            c cVar = this.f35399a;
            if (cVar != null) {
                return new p(cVar, null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public final a b(c stripe3ds2Config) {
            AbstractC3292y.i(stripe3ds2Config, "stripe3ds2Config");
            this.f35399a = stripe3ds2Config;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final p a() {
            p pVar = p.f35396d;
            if (pVar == null) {
                return p.f35397e;
            }
            return pVar;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final int f35402a;

        /* renamed from: b, reason: collision with root package name */
        private final d f35403b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f35400c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f35401d = 8;
        public static final Parcelable.Creator<c> CREATOR = new C0808c();

        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private int f35404a = 5;

            /* renamed from: b, reason: collision with root package name */
            private d f35405b = new d.a().a();

            public final c a() {
                return new c(this.f35404a, this.f35405b);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* renamed from: n2.p$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0808c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readInt(), d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(int i8, d uiCustomization) {
            AbstractC3292y.i(uiCustomization, "uiCustomization");
            this.f35402a = i8;
            this.f35403b = uiCustomization;
            a(i8);
        }

        private final void a(int i8) {
            if (i8 >= 5 && i8 <= 99) {
            } else {
                throw new IllegalArgumentException("Timeout value must be between 5 and 99, inclusive".toString());
            }
        }

        public final int b() {
            return this.f35402a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f35402a == cVar.f35402a && AbstractC3292y.d(this.f35403b, cVar.f35403b)) {
                return true;
            }
            return false;
        }

        public final d f() {
            return this.f35403b;
        }

        public int hashCode() {
            return (this.f35402a * 31) + this.f35403b.hashCode();
        }

        public String toString() {
            return "Stripe3ds2Config(timeout=" + this.f35402a + ", uiCustomization=" + this.f35403b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(this.f35402a);
            this.f35403b.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final Y3.m f35406a;

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d((Y3.m) parcel.readParcelable(d.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(Y3.m uiCustomization) {
            AbstractC3292y.i(uiCustomization, "uiCustomization");
            this.f35406a = uiCustomization;
        }

        public final Y3.m a() {
            return this.f35406a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && AbstractC3292y.d(this.f35406a, ((d) obj).f35406a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f35406a.hashCode();
        }

        public String toString() {
            return "Stripe3ds2UiCustomization(uiCustomization=" + this.f35406a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f35406a, i8);
        }

        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final C0809a f35407b = new C0809a(null);

            /* renamed from: c, reason: collision with root package name */
            public static final int f35408c = 8;

            /* renamed from: a, reason: collision with root package name */
            private final Y3.m f35409a;

            /* renamed from: n2.p$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0809a {
                private C0809a() {
                }

                public /* synthetic */ C0809a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            private a(Y3.m mVar) {
                this.f35409a = mVar;
            }

            public final d a() {
                return new d(this.f35409a);
            }

            public a() {
                this(new Y3.m());
            }
        }
    }

    public /* synthetic */ p(c cVar, AbstractC3284p abstractC3284p) {
        this(cVar);
    }

    public final c c() {
        return this.f35398a;
    }

    private p(c cVar) {
        this.f35398a = cVar;
    }
}
