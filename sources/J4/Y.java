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
public final class Y extends AbstractC3179f0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34068a;
    public static final b Companion = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f34067b = r4.G.f37990d;
    public static final Parcelable.Creator<Y> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34069a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f34070b;

        static {
            a aVar = new a();
            f34069a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.EmailSpec", aVar, 1);
            c1014e0.k("api_path", true);
            f34070b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f34070b;
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
        public Y d(B6.e decoder) {
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
            return new Y(i8, g8, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, Y value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            Y.l(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f34069a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Y createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new Y((r4.G) parcel.readParcelable(Y.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Y[] newArray(int i8) {
            return new Y[i8];
        }
    }

    public /* synthetic */ Y(int i8, r4.G g8, C6.n0 n0Var) {
        super(null);
        if ((i8 & 1) == 0) {
            this.f34068a = r4.G.Companion.n();
        } else {
            this.f34068a = g8;
        }
    }

    public static final /* synthetic */ void l(Y y8, B6.d dVar, A6.f fVar) {
        if (dVar.x(fVar, 0) || !AbstractC3292y.d(y8.h(), r4.G.Companion.n())) {
            dVar.n(fVar, 0, G.a.f38016a, y8.h());
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
        if ((obj instanceof Y) && AbstractC3292y.d(this.f34068a, ((Y) obj).f34068a)) {
            return true;
        }
        return false;
    }

    public r4.G h() {
        return this.f34068a;
    }

    public int hashCode() {
        return this.f34068a.hashCode();
    }

    public final r4.h0 i(Map initialValues) {
        AbstractC3292y.i(initialValues, "initialValues");
        return AbstractC3179f0.f(this, new X(h(), (String) initialValues.get(r4.G.Companion.n()), null, 4, null), null, 2, null);
    }

    public String toString() {
        return "EmailSpec(apiPath=" + this.f34068a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f34068a, i8);
    }

    public /* synthetic */ Y(r4.G g8, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? r4.G.Companion.n() : g8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(r4.G apiPath) {
        super(null);
        AbstractC3292y.i(apiPath, "apiPath");
        this.f34068a = apiPath;
    }
}
