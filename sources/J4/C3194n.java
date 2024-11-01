package j4;

import C6.C;
import C6.C1014e0;
import R5.AbstractC1435t;
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
/* renamed from: j4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3194n extends AbstractC3179f0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34201a;

    /* renamed from: b, reason: collision with root package name */
    private final r4.G f34202b;

    /* renamed from: c, reason: collision with root package name */
    private final r4.G f34203c;
    private static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f34200d = r4.G.f37990d;
    public static final Parcelable.Creator<C3194n> CREATOR = new c();

    /* renamed from: j4.n$a */
    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34204a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f34205b;

        static {
            a aVar = new a();
            f34204a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.BacsDebitBankAccountSpec", aVar, 3);
            c1014e0.k("sortCodeIdentifier", true);
            c1014e0.k("accountNumberIdentifier", true);
            c1014e0.k("apiPath", true);
            f34205b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f34205b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            G.a aVar = G.a.f38016a;
            return new y6.b[]{aVar, aVar, aVar};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3194n d(B6.e decoder) {
            int i8;
            r4.G g8;
            r4.G g9;
            r4.G g10;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            r4.G g11 = null;
            if (c8.z()) {
                G.a aVar = G.a.f38016a;
                r4.G g12 = (r4.G) c8.p(a9, 0, aVar, null);
                r4.G g13 = (r4.G) c8.p(a9, 1, aVar, null);
                g10 = (r4.G) c8.p(a9, 2, aVar, null);
                g9 = g13;
                g8 = g12;
                i8 = 7;
            } else {
                r4.G g14 = null;
                r4.G g15 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 != 1) {
                                if (y8 == 2) {
                                    g15 = (r4.G) c8.p(a9, 2, G.a.f38016a, g15);
                                    i9 |= 4;
                                } else {
                                    throw new y6.l(y8);
                                }
                            } else {
                                g14 = (r4.G) c8.p(a9, 1, G.a.f38016a, g14);
                                i9 |= 2;
                            }
                        } else {
                            g11 = (r4.G) c8.p(a9, 0, G.a.f38016a, g11);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                g8 = g11;
                g9 = g14;
                g10 = g15;
            }
            c8.a(a9);
            return new C3194n(i8, g8, g9, g10, null);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, C3194n value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            C3194n.l(value, c8, a9);
            c8.a(a9);
        }
    }

    /* renamed from: j4.n$b */
    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f34204a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: j4.n$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3194n createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            parcel.readInt();
            return new C3194n();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3194n[] newArray(int i8) {
            return new C3194n[i8];
        }
    }

    public /* synthetic */ C3194n(int i8, r4.G g8, r4.G g9, r4.G g10, C6.n0 n0Var) {
        super(null);
        this.f34201a = (i8 & 1) == 0 ? r4.G.Companion.a("bacs_debit[sort_code]") : g8;
        if ((i8 & 2) == 0) {
            this.f34202b = r4.G.Companion.a("bacs_debit[account_number]");
        } else {
            this.f34202b = g9;
        }
        if ((i8 & 4) == 0) {
            this.f34203c = new r4.G();
        } else {
            this.f34203c = g10;
        }
    }

    public static final /* synthetic */ void l(C3194n c3194n, B6.d dVar, A6.f fVar) {
        if (dVar.x(fVar, 0) || !AbstractC3292y.d(c3194n.f34201a, r4.G.Companion.a("bacs_debit[sort_code]"))) {
            dVar.n(fVar, 0, G.a.f38016a, c3194n.f34201a);
        }
        if (dVar.x(fVar, 1) || !AbstractC3292y.d(c3194n.f34202b, r4.G.Companion.a("bacs_debit[account_number]"))) {
            dVar.n(fVar, 1, G.a.f38016a, c3194n.f34202b);
        }
        if (dVar.x(fVar, 2) || !AbstractC3292y.d(c3194n.h(), new r4.G())) {
            dVar.n(fVar, 2, G.a.f38016a, c3194n.h());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public r4.G h() {
        return this.f34203c;
    }

    public final r4.h0 i(Map initialValues) {
        AbstractC3292y.i(initialValues, "initialValues");
        return a(AbstractC1435t.p(new r4.q0(this.f34201a, new r4.s0(new C3198p(), false, (String) initialValues.get(this.f34201a), 2, null)), new r4.q0(this.f34202b, new r4.s0(new C3192m(), false, (String) initialValues.get(this.f34202b), 2, null))), Integer.valueOf(g4.n.f32400f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeInt(1);
    }

    public C3194n() {
        super(null);
        G.b bVar = r4.G.Companion;
        this.f34201a = bVar.a("bacs_debit[sort_code]");
        this.f34202b = bVar.a("bacs_debit[account_number]");
        this.f34203c = new r4.G();
    }
}
