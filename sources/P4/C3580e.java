package p4;

import C6.AbstractC1012d0;
import C6.C;
import C6.C1013e;
import C6.C1014e0;
import C6.C1018h;
import C6.n0;
import C6.r0;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import y6.l;

@StabilityInferred(parameters = 0)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: p4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3580e {
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f36269d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final y6.b[] f36270e = {null, new C1013e(r0.f1092a), EnumC3582g.Companion.serializer()};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36271a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f36272b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC3582g f36273c;

    /* renamed from: p4.e$a */
    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36274a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f36275b;

        static {
            a aVar = new a();
            f36274a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.uicore.address.FieldSchema", aVar, 3);
            c1014e0.k("isNumeric", true);
            c1014e0.k("examples", true);
            c1014e0.k("nameType", false);
            f36275b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f36275b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            y6.b[] bVarArr = C3580e.f36270e;
            return new y6.b[]{C1018h.f1064a, bVarArr[1], bVarArr[2]};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3580e d(B6.e decoder) {
            boolean z8;
            int i8;
            ArrayList arrayList;
            EnumC3582g enumC3582g;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = C3580e.f36270e;
            if (c8.z()) {
                boolean m8 = c8.m(a9, 0);
                ArrayList arrayList2 = (ArrayList) c8.p(a9, 1, bVarArr[1], null);
                enumC3582g = (EnumC3582g) c8.p(a9, 2, bVarArr[2], null);
                z8 = m8;
                arrayList = arrayList2;
                i8 = 7;
            } else {
                ArrayList arrayList3 = null;
                EnumC3582g enumC3582g2 = null;
                boolean z9 = false;
                int i9 = 0;
                boolean z10 = true;
                while (z10) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 != 1) {
                                if (y8 == 2) {
                                    enumC3582g2 = (EnumC3582g) c8.p(a9, 2, bVarArr[2], enumC3582g2);
                                    i9 |= 4;
                                } else {
                                    throw new l(y8);
                                }
                            } else {
                                arrayList3 = (ArrayList) c8.p(a9, 1, bVarArr[1], arrayList3);
                                i9 |= 2;
                            }
                        } else {
                            z9 = c8.m(a9, 0);
                            i9 |= 1;
                        }
                    } else {
                        z10 = false;
                    }
                }
                z8 = z9;
                i8 = i9;
                arrayList = arrayList3;
                enumC3582g = enumC3582g2;
            }
            c8.a(a9);
            return new C3580e(i8, z8, arrayList, enumC3582g, (n0) null);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, C3580e value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            C3580e.d(value, c8, a9);
            c8.a(a9);
        }
    }

    /* renamed from: p4.e$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f36274a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ C3580e(int i8, boolean z8, ArrayList arrayList, EnumC3582g enumC3582g, n0 n0Var) {
        if (4 != (i8 & 4)) {
            AbstractC1012d0.a(i8, 4, a.f36274a.a());
        }
        this.f36271a = (i8 & 1) == 0 ? false : z8;
        if ((i8 & 2) == 0) {
            this.f36272b = new ArrayList();
        } else {
            this.f36272b = arrayList;
        }
        this.f36273c = enumC3582g;
    }

    public static final /* synthetic */ void d(C3580e c3580e, B6.d dVar, A6.f fVar) {
        y6.b[] bVarArr = f36270e;
        if (dVar.x(fVar, 0) || c3580e.f36271a) {
            dVar.o(fVar, 0, c3580e.f36271a);
        }
        if (dVar.x(fVar, 1) || !AbstractC3292y.d(c3580e.f36272b, new ArrayList())) {
            dVar.n(fVar, 1, bVarArr[1], c3580e.f36272b);
        }
        dVar.n(fVar, 2, bVarArr[2], c3580e.f36273c);
    }

    public final EnumC3582g b() {
        return this.f36273c;
    }

    public final boolean c() {
        return this.f36271a;
    }

    public C3580e(boolean z8, ArrayList examples, EnumC3582g nameType) {
        AbstractC3292y.i(examples, "examples");
        AbstractC3292y.i(nameType, "nameType");
        this.f36271a = z8;
        this.f36272b = examples;
        this.f36273c = nameType;
    }

    public /* synthetic */ C3580e(boolean z8, ArrayList arrayList, EnumC3582g enumC3582g, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? new ArrayList() : arrayList, enumC3582g);
    }
}
