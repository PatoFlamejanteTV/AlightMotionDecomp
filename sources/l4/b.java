package l4;

import C6.AbstractC1012d0;
import C6.C;
import C6.C1013e;
import C6.C1014e0;
import C6.n0;
import C6.r0;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import y6.l;
import z6.AbstractC4273a;

@StabilityInferred(parameters = 0)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class b {
    public static final C0796b Companion = new C0796b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f34680d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final y6.b[] f34681e = {null, null, new C1013e(r0.f1092a)};

    /* renamed from: a, reason: collision with root package name */
    private final String f34682a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34683b;

    /* renamed from: c, reason: collision with root package name */
    private final List f34684c;

    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34685a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f34686b;

        static {
            a aVar = new a();
            f34685a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.autocomplete.model.AddressComponent", aVar, 3);
            c1014e0.k("short_name", false);
            c1014e0.k("long_name", false);
            c1014e0.k("types", false);
            f34686b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f34686b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            y6.b[] bVarArr = b.f34681e;
            r0 r0Var = r0.f1092a;
            return new y6.b[]{AbstractC4273a.p(r0Var), r0Var, bVarArr[2]};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b d(B6.e decoder) {
            int i8;
            String str;
            String str2;
            List list;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = b.f34681e;
            String str3 = null;
            if (c8.z()) {
                String str4 = (String) c8.t(a9, 0, r0.f1092a, null);
                String o8 = c8.o(a9, 1);
                list = (List) c8.p(a9, 2, bVarArr[2], null);
                str = str4;
                str2 = o8;
                i8 = 7;
            } else {
                String str5 = null;
                List list2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 != 1) {
                                if (y8 == 2) {
                                    list2 = (List) c8.p(a9, 2, bVarArr[2], list2);
                                    i9 |= 4;
                                } else {
                                    throw new l(y8);
                                }
                            } else {
                                str5 = c8.o(a9, 1);
                                i9 |= 2;
                            }
                        } else {
                            str3 = (String) c8.t(a9, 0, r0.f1092a, str3);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                str = str3;
                str2 = str5;
                list = list2;
            }
            c8.a(a9);
            return new b(i8, str, str2, list, null);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, b value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            b.e(value, c8, a9);
            c8.a(a9);
        }
    }

    /* renamed from: l4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0796b {
        private C0796b() {
        }

        public final y6.b serializer() {
            return a.f34685a;
        }

        public /* synthetic */ C0796b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ b(int i8, String str, String str2, List list, n0 n0Var) {
        if (7 != (i8 & 7)) {
            AbstractC1012d0.a(i8, 7, a.f34685a.a());
        }
        this.f34682a = str;
        this.f34683b = str2;
        this.f34684c = list;
    }

    public static final /* synthetic */ void e(b bVar, B6.d dVar, A6.f fVar) {
        y6.b[] bVarArr = f34681e;
        dVar.D(fVar, 0, r0.f1092a, bVar.f34682a);
        dVar.q(fVar, 1, bVar.f34683b);
        dVar.n(fVar, 2, bVarArr[2], bVar.f34684c);
    }

    public final String b() {
        return this.f34683b;
    }

    public final String c() {
        return this.f34682a;
    }

    public final List d() {
        return this.f34684c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3292y.d(this.f34682a, bVar.f34682a) && AbstractC3292y.d(this.f34683b, bVar.f34683b) && AbstractC3292y.d(this.f34684c, bVar.f34684c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f34682a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((hashCode * 31) + this.f34683b.hashCode()) * 31) + this.f34684c.hashCode();
    }

    public String toString() {
        return "AddressComponent(shortName=" + this.f34682a + ", longName=" + this.f34683b + ", types=" + this.f34684c + ")";
    }

    public b(String str, String longName, List types) {
        AbstractC3292y.i(longName, "longName");
        AbstractC3292y.i(types, "types");
        this.f34682a = str;
        this.f34683b = longName;
        this.f34684c = types;
    }
}
