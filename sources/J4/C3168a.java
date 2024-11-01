package j4;

import C6.C;
import C6.C1014e0;
import C6.C1018h;
import R5.AbstractC1435t;
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
import r4.AbstractC3910i;
import r4.C3901b;
import r4.C3920t;
import r4.C3921u;
import r4.C3925y;
import r4.G;

@StabilityInferred(parameters = 0)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3168a extends AbstractC3179f0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34077a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f34078b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f34079c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34080d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC3910i f34081e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f34082f;
    public static final b Companion = new b(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f34075g = 8;
    public static final Parcelable.Creator<C3168a> CREATOR = new c();

    /* renamed from: h, reason: collision with root package name */
    private static final y6.b[] f34076h = {null, new C6.M(C6.r0.f1092a), new C6.M(U.Companion.serializer()), null};

    /* renamed from: j4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0780a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final C0780a f34083a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f34084b;

        static {
            C0780a c0780a = new C0780a();
            f34083a = c0780a;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.AddressSpec", c0780a, 4);
            c1014e0.k("api_path", true);
            c1014e0.k("allowed_country_codes", true);
            c1014e0.k("display_fields", true);
            c1014e0.k("show_label", true);
            f34084b = c1014e0;
        }

        private C0780a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f34084b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            y6.b[] bVarArr = C3168a.f34076h;
            return new y6.b[]{G.a.f38016a, bVarArr[1], bVarArr[2], C1018h.f1064a};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3168a d(B6.e decoder) {
            boolean z8;
            int i8;
            r4.G g8;
            Set set;
            Set set2;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = C3168a.f34076h;
            if (c8.z()) {
                r4.G g9 = (r4.G) c8.p(a9, 0, G.a.f38016a, null);
                Set set3 = (Set) c8.p(a9, 1, bVarArr[1], null);
                set2 = (Set) c8.p(a9, 2, bVarArr[2], null);
                g8 = g9;
                z8 = c8.m(a9, 3);
                set = set3;
                i8 = 15;
            } else {
                r4.G g10 = null;
                Set set4 = null;
                Set set5 = null;
                boolean z9 = false;
                int i9 = 0;
                boolean z10 = true;
                while (z10) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 != 1) {
                                if (y8 != 2) {
                                    if (y8 == 3) {
                                        z9 = c8.m(a9, 3);
                                        i9 |= 8;
                                    } else {
                                        throw new y6.l(y8);
                                    }
                                } else {
                                    set5 = (Set) c8.p(a9, 2, bVarArr[2], set5);
                                    i9 |= 4;
                                }
                            } else {
                                set4 = (Set) c8.p(a9, 1, bVarArr[1], set4);
                                i9 |= 2;
                            }
                        } else {
                            g10 = (r4.G) c8.p(a9, 0, G.a.f38016a, g10);
                            i9 |= 1;
                        }
                    } else {
                        z10 = false;
                    }
                }
                z8 = z9;
                i8 = i9;
                g8 = g10;
                set = set4;
                set2 = set5;
            }
            c8.a(a9);
            return new C3168a(i8, g8, set, set2, z8, (C6.n0) null);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, C3168a value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            C3168a.u(value, c8, a9);
            c8.a(a9);
        }
    }

    /* renamed from: j4.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return C0780a.f34083a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: j4.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3168a createFromParcel(Parcel parcel) {
            boolean z8;
            boolean z9;
            AbstractC3292y.i(parcel, "parcel");
            r4.G g8 = (r4.G) parcel.readParcelable(C3168a.class.getClassLoader());
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                linkedHashSet.add(parcel.readString());
            }
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                linkedHashSet2.add(U.valueOf(parcel.readString()));
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC3910i abstractC3910i = (AbstractC3910i) parcel.readParcelable(C3168a.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            return new C3168a(g8, linkedHashSet, linkedHashSet2, z8, abstractC3910i, z9);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3168a[] newArray(int i8) {
            return new C3168a[i8];
        }
    }

    public /* synthetic */ C3168a(int i8, r4.G g8, Set set, Set set2, boolean z8, C6.n0 n0Var) {
        super(null);
        this.f34077a = (i8 & 1) == 0 ? r4.G.Companion.a("billing_details[address]") : g8;
        if ((i8 & 2) == 0) {
            this.f34078b = z2.d.f41472a.h();
        } else {
            this.f34078b = set;
        }
        if ((i8 & 4) == 0) {
            this.f34079c = R5.a0.f();
        } else {
            this.f34079c = set2;
        }
        if ((i8 & 8) == 0) {
            this.f34080d = true;
        } else {
            this.f34080d = z8;
        }
        this.f34081e = new AbstractC3910i.a(null, 1, null);
        this.f34082f = false;
    }

    public static /* synthetic */ C3168a l(C3168a c3168a, r4.G g8, Set set, Set set2, boolean z8, AbstractC3910i abstractC3910i, boolean z9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            g8 = c3168a.f34077a;
        }
        if ((i8 & 2) != 0) {
            set = c3168a.f34078b;
        }
        Set set3 = set;
        if ((i8 & 4) != 0) {
            set2 = c3168a.f34079c;
        }
        Set set4 = set2;
        if ((i8 & 8) != 0) {
            z8 = c3168a.f34080d;
        }
        boolean z10 = z8;
        if ((i8 & 16) != 0) {
            abstractC3910i = c3168a.f34081e;
        }
        AbstractC3910i abstractC3910i2 = abstractC3910i;
        if ((i8 & 32) != 0) {
            z9 = c3168a.f34082f;
        }
        return c3168a.i(g8, set3, set4, z10, abstractC3910i2, z9);
    }

    public static final /* synthetic */ void u(C3168a c3168a, B6.d dVar, A6.f fVar) {
        y6.b[] bVarArr = f34076h;
        if (dVar.x(fVar, 0) || !AbstractC3292y.d(c3168a.p(), r4.G.Companion.a("billing_details[address]"))) {
            dVar.n(fVar, 0, G.a.f38016a, c3168a.p());
        }
        if (dVar.x(fVar, 1) || !AbstractC3292y.d(c3168a.f34078b, z2.d.f41472a.h())) {
            dVar.n(fVar, 1, bVarArr[1], c3168a.f34078b);
        }
        if (dVar.x(fVar, 2) || !AbstractC3292y.d(c3168a.f34079c, R5.a0.f())) {
            dVar.n(fVar, 2, bVarArr[2], c3168a.f34079c);
        }
        if (dVar.x(fVar, 3) || !c3168a.f34080d) {
            dVar.o(fVar, 3, c3168a.f34080d);
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
        if (!(obj instanceof C3168a)) {
            return false;
        }
        C3168a c3168a = (C3168a) obj;
        if (AbstractC3292y.d(this.f34077a, c3168a.f34077a) && AbstractC3292y.d(this.f34078b, c3168a.f34078b) && AbstractC3292y.d(this.f34079c, c3168a.f34079c) && this.f34080d == c3168a.f34080d && AbstractC3292y.d(this.f34081e, c3168a.f34081e) && this.f34082f == c3168a.f34082f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f34077a.hashCode() * 31) + this.f34078b.hashCode()) * 31) + this.f34079c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f34080d)) * 31) + this.f34081e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f34082f);
    }

    public final C3168a i(r4.G apiPath, Set allowedCountryCodes, Set displayFields, boolean z8, AbstractC3910i type, boolean z9) {
        AbstractC3292y.i(apiPath, "apiPath");
        AbstractC3292y.i(allowedCountryCodes, "allowedCountryCodes");
        AbstractC3292y.i(displayFields, "displayFields");
        AbstractC3292y.i(type, "type");
        return new C3168a(apiPath, allowedCountryCodes, displayFields, z8, type, z9);
    }

    public r4.G p() {
        return this.f34077a;
    }

    public final r4.h0 s(Map initialValues, Map map) {
        Integer num;
        r4.e0 e0Var;
        Boolean L02;
        AbstractC3292y.i(initialValues, "initialValues");
        if (this.f34080d) {
            num = Integer.valueOf(g4.n.f32408j);
        } else {
            num = null;
        }
        if (this.f34079c.size() == 1 && AbstractC1435t.l0(this.f34079c) == U.f34047b) {
            r4.h0 b9 = b(new C3921u(r4.G.Companion.a("billing_details[address][country]"), new C3925y(new C3920t(this.f34078b, null, false, false, null, null, 62, null), (String) initialValues.get(p()))), num);
            if (this.f34082f) {
                return null;
            }
            return b9;
        }
        if (map != null) {
            G.b bVar = r4.G.Companion;
            String str = (String) map.get(bVar.w());
            if (str != null && (L02 = l6.n.L0(str)) != null) {
                e0Var = new r4.e0(bVar.w(), new r4.d0(L02.booleanValue()));
                return a(AbstractC1435t.r(new C3901b(p(), initialValues, this.f34081e, this.f34078b, null, e0Var, map, null, this.f34082f, 144, null), e0Var), num);
            }
        }
        e0Var = null;
        return a(AbstractC1435t.r(new C3901b(p(), initialValues, this.f34081e, this.f34078b, null, e0Var, map, null, this.f34082f, 144, null), e0Var), num);
    }

    public String toString() {
        return "AddressSpec(apiPath=" + this.f34077a + ", allowedCountryCodes=" + this.f34078b + ", displayFields=" + this.f34079c + ", showLabel=" + this.f34080d + ", type=" + this.f34081e + ", hideCountry=" + this.f34082f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f34077a, i8);
        Set set = this.f34078b;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
        Set set2 = this.f34079c;
        out.writeInt(set2.size());
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            out.writeString(((U) it2.next()).name());
        }
        out.writeInt(this.f34080d ? 1 : 0);
        out.writeParcelable(this.f34081e, i8);
        out.writeInt(this.f34082f ? 1 : 0);
    }

    public /* synthetic */ C3168a(r4.G g8, Set set, Set set2, boolean z8, AbstractC3910i abstractC3910i, boolean z9, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? r4.G.Companion.a("billing_details[address]") : g8, (i8 & 2) != 0 ? z2.d.f41472a.h() : set, (i8 & 4) != 0 ? R5.a0.f() : set2, (i8 & 8) != 0 ? true : z8, (i8 & 16) != 0 ? new AbstractC3910i.a(null, 1, null) : abstractC3910i, (i8 & 32) != 0 ? false : z9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3168a(r4.G apiPath, Set allowedCountryCodes, Set displayFields, boolean z8, AbstractC3910i type, boolean z9) {
        super(null);
        AbstractC3292y.i(apiPath, "apiPath");
        AbstractC3292y.i(allowedCountryCodes, "allowedCountryCodes");
        AbstractC3292y.i(displayFields, "displayFields");
        AbstractC3292y.i(type, "type");
        this.f34077a = apiPath;
        this.f34078b = allowedCountryCodes;
        this.f34079c = displayFields;
        this.f34080d = z8;
        this.f34081e = type;
        this.f34082f = z9;
    }
}
