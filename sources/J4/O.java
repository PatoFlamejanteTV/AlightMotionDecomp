package j4;

import C6.C;
import C6.C1014e0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import r4.C3920t;
import r4.C3921u;
import r4.C3925y;
import r4.G;

@StabilityInferred(parameters = 0)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class O extends AbstractC3179f0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f33908a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f33909b;
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f33906c = 8;
    public static final Parcelable.Creator<O> CREATOR = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final y6.b[] f33907d = {null, new C6.M(C6.r0.f1092a)};

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33910a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f33911b;

        static {
            a aVar = new a();
            f33910a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.CountrySpec", aVar, 2);
            c1014e0.k("api_path", true);
            c1014e0.k("allowed_country_codes", true);
            f33911b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f33911b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            return new y6.b[]{G.a.f38016a, O.f33907d[1]};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public O d(B6.e decoder) {
            Set set;
            r4.G g8;
            int i8;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = O.f33907d;
            C6.n0 n0Var = null;
            if (c8.z()) {
                g8 = (r4.G) c8.p(a9, 0, G.a.f38016a, null);
                set = (Set) c8.p(a9, 1, bVarArr[1], null);
                i8 = 3;
            } else {
                Set set2 = null;
                r4.G g9 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 == 1) {
                                set2 = (Set) c8.p(a9, 1, bVarArr[1], set2);
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
                set = set2;
                g8 = g9;
                i8 = i9;
            }
            c8.a(a9);
            return new O(i8, g8, set, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, O value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            O.p(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f33910a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            r4.G g8 = (r4.G) parcel.readParcelable(O.class.getClassLoader());
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                linkedHashSet.add(parcel.readString());
            }
            return new O(g8, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final O[] newArray(int i8) {
            return new O[i8];
        }
    }

    public /* synthetic */ O(int i8, r4.G g8, Set set, C6.n0 n0Var) {
        super(null);
        this.f33908a = (i8 & 1) == 0 ? r4.G.Companion.l() : g8;
        if ((i8 & 2) == 0) {
            this.f33909b = z2.d.f41472a.h();
        } else {
            this.f33909b = set;
        }
    }

    public static final /* synthetic */ void p(O o8, B6.d dVar, A6.f fVar) {
        y6.b[] bVarArr = f33907d;
        if (dVar.x(fVar, 0) || !AbstractC3292y.d(o8.i(), r4.G.Companion.l())) {
            dVar.n(fVar, 0, G.a.f38016a, o8.i());
        }
        if (dVar.x(fVar, 1) || !AbstractC3292y.d(o8.f33909b, z2.d.f41472a.h())) {
            dVar.n(fVar, 1, bVarArr[1], o8.f33909b);
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
        if (!(obj instanceof O)) {
            return false;
        }
        O o8 = (O) obj;
        if (AbstractC3292y.d(this.f33908a, o8.f33908a) && AbstractC3292y.d(this.f33909b, o8.f33909b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f33908a.hashCode() * 31) + this.f33909b.hashCode();
    }

    public r4.G i() {
        return this.f33908a;
    }

    public final r4.h0 l(Map initialValues) {
        AbstractC3292y.i(initialValues, "initialValues");
        return AbstractC3179f0.f(this, new C3921u(i(), new C3925y(new C3920t(this.f33909b, null, false, false, null, null, 62, null), (String) initialValues.get(i()))), null, 2, null);
    }

    public String toString() {
        return "CountrySpec(apiPath=" + this.f33908a + ", allowedCountryCodes=" + this.f33909b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f33908a, i8);
        Set set = this.f33909b;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(r4.G apiPath, Set allowedCountryCodes) {
        super(null);
        AbstractC3292y.i(apiPath, "apiPath");
        AbstractC3292y.i(allowedCountryCodes, "allowedCountryCodes");
        this.f33908a = apiPath;
        this.f33909b = allowedCountryCodes;
    }
}
