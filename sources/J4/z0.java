package j4;

import C6.AbstractC1034y;
import C6.C;
import C6.C1014e0;
import Q5.InterfaceC1416k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import r4.G;

@StabilityInferred(parameters = 0)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class z0 extends AbstractC3179f0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34338a;

    /* renamed from: b, reason: collision with root package name */
    private final d f34339b;
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f34336c = r4.G.f37990d;
    public static final Parcelable.Creator<z0> CREATOR = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final y6.b[] f34337d = {null, d.Companion.serializer()};

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34340a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f34341b;

        static {
            a aVar = new a();
            f34340a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.PlaceholderSpec", aVar, 2);
            c1014e0.k("api_path", true);
            c1014e0.k("for", true);
            f34341b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f34341b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            return new y6.b[]{G.a.f38016a, z0.f34337d[1]};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public z0 d(B6.e decoder) {
            d dVar;
            r4.G g8;
            int i8;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = z0.f34337d;
            C6.n0 n0Var = null;
            if (c8.z()) {
                g8 = (r4.G) c8.p(a9, 0, G.a.f38016a, null);
                dVar = (d) c8.p(a9, 1, bVarArr[1], null);
                i8 = 3;
            } else {
                d dVar2 = null;
                r4.G g9 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 == 1) {
                                dVar2 = (d) c8.p(a9, 1, bVarArr[1], dVar2);
                                i9 |= 2;
                            } else {
                                throw new y6.l(y8);
                            }
                        } else {
                            g9 = (r4.G) c8.p(a9, 0, G.a.f38016a, g9);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                dVar = dVar2;
                g8 = g9;
                i8 = i9;
            }
            c8.a(a9);
            return new z0(i8, g8, dVar, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, z0 value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            z0.p(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f34340a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new z0((r4.G) parcel.readParcelable(z0.class.getClassLoader()), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final z0[] newArray(int i8) {
            return new z0[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @y6.g
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public static final class d {
        public static final b Companion;

        /* renamed from: a, reason: collision with root package name */
        private static final InterfaceC1416k f34342a;

        /* renamed from: b, reason: collision with root package name */
        public static final d f34343b = new d("Name", 0);

        /* renamed from: c, reason: collision with root package name */
        public static final d f34344c = new d("Email", 1);

        /* renamed from: d, reason: collision with root package name */
        public static final d f34345d = new d("Phone", 2);

        /* renamed from: e, reason: collision with root package name */
        public static final d f34346e = new d("BillingAddress", 3);

        /* renamed from: f, reason: collision with root package name */
        public static final d f34347f = new d("BillingAddressWithoutCountry", 4);

        /* renamed from: g, reason: collision with root package name */
        public static final d f34348g = new d("SepaMandate", 5);

        /* renamed from: h, reason: collision with root package name */
        public static final d f34349h = new d("Unknown", 6);

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ d[] f34350i;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ W5.a f34351j;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f34352a = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final y6.b invoke() {
                return AbstractC1034y.a("com.stripe.android.ui.core.elements.PlaceholderSpec.PlaceholderField", d.values(), new String[]{"name", NotificationCompat.CATEGORY_EMAIL, HintConstants.AUTOFILL_HINT_PHONE, "billing_address", "billing_address_without_country", "sepa_mandate", EnvironmentCompat.MEDIA_UNKNOWN}, new Annotation[][]{null, null, null, null, null, null, null}, null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            private final /* synthetic */ y6.b a() {
                return (y6.b) d.f34342a.getValue();
            }

            public final y6.b serializer() {
                return a();
            }

            public /* synthetic */ b(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            d[] a9 = a();
            f34350i = a9;
            f34351j = W5.b.a(a9);
            Companion = new b(null);
            f34342a = Q5.l.a(Q5.o.f8804b, a.f34352a);
        }

        private d(String str, int i8) {
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f34343b, f34344c, f34345d, f34346e, f34347f, f34348g, f34349h};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f34350i.clone();
        }
    }

    public /* synthetic */ z0(int i8, r4.G g8, d dVar, C6.n0 n0Var) {
        super(null);
        this.f34338a = (i8 & 1) == 0 ? r4.G.Companion.a("placeholder") : g8;
        if ((i8 & 2) == 0) {
            this.f34339b = d.f34349h;
        } else {
            this.f34339b = dVar;
        }
    }

    public static final /* synthetic */ void p(z0 z0Var, B6.d dVar, A6.f fVar) {
        y6.b[] bVarArr = f34337d;
        if (dVar.x(fVar, 0) || !AbstractC3292y.d(z0Var.i(), r4.G.Companion.a("placeholder"))) {
            dVar.n(fVar, 0, G.a.f38016a, z0Var.i());
        }
        if (dVar.x(fVar, 1) || z0Var.f34339b != d.f34349h) {
            dVar.n(fVar, 1, bVarArr[1], z0Var.f34339b);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (AbstractC3292y.d(this.f34338a, z0Var.f34338a) && this.f34339b == z0Var.f34339b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f34338a.hashCode() * 31) + this.f34339b.hashCode();
    }

    public r4.G i() {
        return this.f34338a;
    }

    public final d l() {
        return this.f34339b;
    }

    public String toString() {
        return "PlaceholderSpec(apiPath=" + this.f34338a + ", field=" + this.f34339b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f34338a, i8);
        out.writeString(this.f34339b.name());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(r4.G apiPath, d field) {
        super(null);
        AbstractC3292y.i(apiPath, "apiPath");
        AbstractC3292y.i(field, "field");
        this.f34338a = apiPath;
        this.f34339b = field;
    }
}
