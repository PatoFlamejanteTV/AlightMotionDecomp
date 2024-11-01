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
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: j4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3184i extends AbstractC3179f0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34142a;
    public static final b Companion = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f34141b = r4.G.f37990d;
    public static final Parcelable.Creator<C3184i> CREATOR = new c();

    /* renamed from: j4.i$a */
    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34143a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f34144b;

        static {
            a aVar = new a();
            f34143a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.AuBankAccountNumberSpec", aVar, 1);
            c1014e0.k("api_path", true);
            f34144b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f34144b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            return new y6.b[]{G.a.f38016a};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3184i d(B6.e decoder) {
            r4.G g8;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            int i8 = 1;
            C6.n0 n0Var = null;
            if (c8.z()) {
                g8 = (r4.G) c8.p(a9, 0, G.a.f38016a, null);
            } else {
                g8 = null;
                boolean z8 = true;
                int i9 = 0;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 == 0) {
                            g8 = (r4.G) c8.p(a9, 0, G.a.f38016a, g8);
                            i9 = 1;
                        } else {
                            throw new y6.l(y8);
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
            }
            c8.a(a9);
            return new C3184i(i8, g8, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, C3184i value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            C3184i.l(value, c8, a9);
            c8.a(a9);
        }
    }

    /* renamed from: j4.i$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f34143a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: j4.i$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3184i createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C3184i((r4.G) parcel.readParcelable(C3184i.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3184i[] newArray(int i8) {
            return new C3184i[i8];
        }
    }

    public /* synthetic */ C3184i(int i8, r4.G g8, C6.n0 n0Var) {
        super(null);
        if ((i8 & 1) == 0) {
            this.f34142a = r4.G.Companion.a("au_becs_debit[account_number]");
        } else {
            this.f34142a = g8;
        }
    }

    public static final /* synthetic */ void l(C3184i c3184i, B6.d dVar, A6.f fVar) {
        if (dVar.x(fVar, 0) || !AbstractC3292y.d(c3184i.h(), r4.G.Companion.a("au_becs_debit[account_number]"))) {
            dVar.n(fVar, 0, G.a.f38016a, c3184i.h());
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
        if ((obj instanceof C3184i) && AbstractC3292y.d(this.f34142a, ((C3184i) obj).f34142a)) {
            return true;
        }
        return false;
    }

    public r4.G h() {
        return this.f34142a;
    }

    public int hashCode() {
        return this.f34142a.hashCode();
    }

    public final r4.h0 i(Map initialValues) {
        AbstractC3292y.i(initialValues, "initialValues");
        return AbstractC3179f0.f(this, new r4.q0(h(), new r4.s0(new C3182h(), false, (String) initialValues.get(h()), 2, null)), null, 2, null);
    }

    public String toString() {
        return "AuBankAccountNumberSpec(apiPath=" + this.f34142a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f34142a, i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3184i(r4.G apiPath) {
        super(null);
        AbstractC3292y.i(apiPath, "apiPath");
        this.f34142a = apiPath;
    }
}
