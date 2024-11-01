package j4;

import C6.C;
import C6.C1014e0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import r4.G;

@StabilityInferred(parameters = 0)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class w0 extends AbstractC3179f0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34312a;

    /* renamed from: b, reason: collision with root package name */
    private final P0 f34313b;

    /* renamed from: c, reason: collision with root package name */
    private final L0 f34314c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f34310d = r4.G.f37990d;
    public static final Parcelable.Creator<w0> CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final y6.b[] f34311e = {null, P0.Companion.serializer()};

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34315a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f34316b;

        static {
            a aVar = new a();
            f34315a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.NameSpec", aVar, 2);
            c1014e0.k("api_path", true);
            c1014e0.k("translation_id", true);
            f34316b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f34316b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            return new y6.b[]{G.a.f38016a, w0.f34311e[1]};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public w0 d(B6.e decoder) {
            P0 p02;
            r4.G g8;
            int i8;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = w0.f34311e;
            C6.n0 n0Var = null;
            if (c8.z()) {
                g8 = (r4.G) c8.p(a9, 0, G.a.f38016a, null);
                p02 = (P0) c8.p(a9, 1, bVarArr[1], null);
                i8 = 3;
            } else {
                P0 p03 = null;
                r4.G g9 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 == 1) {
                                p03 = (P0) c8.p(a9, 1, bVarArr[1], p03);
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
                p02 = p03;
                g8 = g9;
                i8 = i9;
            }
            c8.a(a9);
            return new w0(i8, g8, p02, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, w0 value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            w0.p(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f34315a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w0 createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new w0((r4.G) parcel.readParcelable(w0.class.getClassLoader()), P0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w0[] newArray(int i8) {
            return new w0[i8];
        }
    }

    public /* synthetic */ w0(int i8, r4.G g8, P0 p02, C6.n0 n0Var) {
        super(null);
        this.f34312a = (i8 & 1) == 0 ? r4.G.Companion.r() : g8;
        if ((i8 & 2) == 0) {
            this.f34313b = P0.f33927g;
        } else {
            this.f34313b = p02;
        }
        this.f34314c = new L0(i(), this.f34313b.c(), EnumC3210z.f34331d, EnumC3195n0.f34207b, false, 16, (AbstractC3284p) null);
    }

    public static final /* synthetic */ void p(w0 w0Var, B6.d dVar, A6.f fVar) {
        y6.b[] bVarArr = f34311e;
        if (dVar.x(fVar, 0) || !AbstractC3292y.d(w0Var.i(), r4.G.Companion.r())) {
            dVar.n(fVar, 0, G.a.f38016a, w0Var.i());
        }
        if (dVar.x(fVar, 1) || w0Var.f34313b != P0.f33927g) {
            dVar.n(fVar, 1, bVarArr[1], w0Var.f34313b);
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
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (AbstractC3292y.d(this.f34312a, w0Var.f34312a) && this.f34313b == w0Var.f34313b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f34312a.hashCode() * 31) + this.f34313b.hashCode();
    }

    public r4.G i() {
        return this.f34312a;
    }

    public final r4.h0 l(Map initialValues) {
        AbstractC3292y.i(initialValues, "initialValues");
        return this.f34314c.l(initialValues);
    }

    public String toString() {
        return "NameSpec(apiPath=" + this.f34312a + ", labelTranslationId=" + this.f34313b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f34312a, i8);
        out.writeString(this.f34313b.name());
    }

    public /* synthetic */ w0(r4.G g8, P0 p02, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? r4.G.Companion.r() : g8, (i8 & 2) != 0 ? P0.f33927g : p02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(r4.G apiPath, P0 labelTranslationId) {
        super(null);
        AbstractC3292y.i(apiPath, "apiPath");
        AbstractC3292y.i(labelTranslationId, "labelTranslationId");
        this.f34312a = apiPath;
        this.f34313b = labelTranslationId;
        this.f34314c = new L0(i(), labelTranslationId.c(), EnumC3210z.f34331d, EnumC3195n0.f34207b, false, 16, (AbstractC3284p) null);
    }
}
