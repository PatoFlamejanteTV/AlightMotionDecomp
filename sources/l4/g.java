package l4;

import C6.AbstractC1012d0;
import C6.C;
import C6.C1013e;
import C6.C1014e0;
import C6.n0;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l4.b;
import y6.l;
import z6.AbstractC4273a;

@StabilityInferred(parameters = 0)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class g {
    public static final b Companion = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f34697b = 8;

    /* renamed from: c, reason: collision with root package name */
    private static final y6.b[] f34698c = {new C1013e(b.a.f34685a)};

    /* renamed from: a, reason: collision with root package name */
    private final List f34699a;

    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34700a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f34701b;

        static {
            a aVar = new a();
            f34700a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.autocomplete.model.Place", aVar, 1);
            c1014e0.k("address_components", false);
            f34701b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f34701b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            return new y6.b[]{AbstractC4273a.p(g.f34698c[0])};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public g d(B6.e decoder) {
            List list;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = g.f34698c;
            int i8 = 1;
            n0 n0Var = null;
            if (c8.z()) {
                list = (List) c8.t(a9, 0, bVarArr[0], null);
            } else {
                List list2 = null;
                boolean z8 = true;
                int i9 = 0;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 == 0) {
                            list2 = (List) c8.t(a9, 0, bVarArr[0], list2);
                            i9 = 1;
                        } else {
                            throw new l(y8);
                        }
                    } else {
                        z8 = false;
                    }
                }
                list = list2;
                i8 = i9;
            }
            c8.a(a9);
            return new g(i8, list, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, g value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            g.c(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f34700a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f34702b = new c("ADMINISTRATIVE_AREA_LEVEL_1", 0, "administrative_area_level_1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f34703c = new c("ADMINISTRATIVE_AREA_LEVEL_2", 1, "administrative_area_level_2");

        /* renamed from: d, reason: collision with root package name */
        public static final c f34704d = new c("ADMINISTRATIVE_AREA_LEVEL_3", 2, "administrative_area_level_3");

        /* renamed from: e, reason: collision with root package name */
        public static final c f34705e = new c("ADMINISTRATIVE_AREA_LEVEL_4", 3, "administrative_area_level_4");

        /* renamed from: f, reason: collision with root package name */
        public static final c f34706f = new c("COUNTRY", 4, "country");

        /* renamed from: g, reason: collision with root package name */
        public static final c f34707g = new c("LOCALITY", 5, "locality");

        /* renamed from: h, reason: collision with root package name */
        public static final c f34708h = new c("NEIGHBORHOOD", 6, "neighborhood");

        /* renamed from: i, reason: collision with root package name */
        public static final c f34709i = new c("POSTAL_TOWN", 7, "postal_town");

        /* renamed from: j, reason: collision with root package name */
        public static final c f34710j = new c("POSTAL_CODE", 8, "postal_code");

        /* renamed from: k, reason: collision with root package name */
        public static final c f34711k = new c("PREMISE", 9, "premise");

        /* renamed from: l, reason: collision with root package name */
        public static final c f34712l = new c("ROUTE", 10, "route");

        /* renamed from: m, reason: collision with root package name */
        public static final c f34713m = new c("STREET_NUMBER", 11, "street_number");

        /* renamed from: n, reason: collision with root package name */
        public static final c f34714n = new c("SUBLOCALITY", 12, "sublocality");

        /* renamed from: o, reason: collision with root package name */
        public static final c f34715o = new c("SUBLOCALITY_LEVEL_1", 13, "sublocality_level_1");

        /* renamed from: p, reason: collision with root package name */
        public static final c f34716p = new c("SUBLOCALITY_LEVEL_2", 14, "sublocality_level_2");

        /* renamed from: q, reason: collision with root package name */
        public static final c f34717q = new c("SUBLOCALITY_LEVEL_3", 15, "sublocality_level_3");

        /* renamed from: r, reason: collision with root package name */
        public static final c f34718r = new c("SUBLOCALITY_LEVEL_4", 16, "sublocality_level_4");

        /* renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ c[] f34719s;

        /* renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ W5.a f34720t;

        /* renamed from: a, reason: collision with root package name */
        private final String f34721a;

        static {
            c[] a9 = a();
            f34719s = a9;
            f34720t = W5.b.a(a9);
        }

        private c(String str, int i8, String str2) {
            this.f34721a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f34702b, f34703c, f34704d, f34705e, f34706f, f34707g, f34708h, f34709i, f34710j, f34711k, f34712l, f34713m, f34714n, f34715o, f34716p, f34717q, f34718r};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f34719s.clone();
        }

        public final String b() {
            return this.f34721a;
        }
    }

    public /* synthetic */ g(int i8, List list, n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC1012d0.a(i8, 1, a.f34700a.a());
        }
        this.f34699a = list;
    }

    public static final /* synthetic */ void c(g gVar, B6.d dVar, A6.f fVar) {
        dVar.D(fVar, 0, f34698c[0], gVar.f34699a);
    }

    public final List b() {
        return this.f34699a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && AbstractC3292y.d(this.f34699a, ((g) obj).f34699a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        List list = this.f34699a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "Place(addressComponents=" + this.f34699a + ")";
    }

    public g(List list) {
        this.f34699a = list;
    }
}
