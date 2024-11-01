package p4;

import C6.AbstractC1012d0;
import C6.C;
import C6.C1014e0;
import C6.C1018h;
import C6.n0;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import p4.C3580e;
import y6.l;
import z6.AbstractC4273a;

@StabilityInferred(parameters = 0)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: p4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3579d {
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f36262d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final y6.b[] f36263e = {EnumC3581f.Companion.serializer(), null, null};

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3581f f36264a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36265b;

    /* renamed from: c, reason: collision with root package name */
    private final C3580e f36266c;

    /* renamed from: p4.d$a */
    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36267a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f36268b;

        static {
            a aVar = new a();
            f36267a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.uicore.address.CountryAddressSchema", aVar, 3);
            c1014e0.k("type", false);
            c1014e0.k("required", false);
            c1014e0.k("schema", true);
            f36268b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f36268b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            return new y6.b[]{AbstractC4273a.p(C3579d.f36263e[0]), C1018h.f1064a, AbstractC4273a.p(C3580e.a.f36274a)};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3579d d(B6.e decoder) {
            boolean z8;
            int i8;
            EnumC3581f enumC3581f;
            C3580e c3580e;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = C3579d.f36263e;
            if (c8.z()) {
                enumC3581f = (EnumC3581f) c8.t(a9, 0, bVarArr[0], null);
                z8 = c8.m(a9, 1);
                c3580e = (C3580e) c8.t(a9, 2, C3580e.a.f36274a, null);
                i8 = 7;
            } else {
                EnumC3581f enumC3581f2 = null;
                C3580e c3580e2 = null;
                boolean z9 = false;
                int i9 = 0;
                boolean z10 = true;
                while (z10) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 != 1) {
                                if (y8 == 2) {
                                    c3580e2 = (C3580e) c8.t(a9, 2, C3580e.a.f36274a, c3580e2);
                                    i9 |= 4;
                                } else {
                                    throw new l(y8);
                                }
                            } else {
                                z9 = c8.m(a9, 1);
                                i9 |= 2;
                            }
                        } else {
                            enumC3581f2 = (EnumC3581f) c8.t(a9, 0, bVarArr[0], enumC3581f2);
                            i9 |= 1;
                        }
                    } else {
                        z10 = false;
                    }
                }
                z8 = z9;
                i8 = i9;
                enumC3581f = enumC3581f2;
                c3580e = c3580e2;
            }
            c8.a(a9);
            return new C3579d(i8, enumC3581f, z8, c3580e, null);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, C3579d value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            C3579d.e(value, c8, a9);
            c8.a(a9);
        }
    }

    /* renamed from: p4.d$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f36267a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ C3579d(int i8, EnumC3581f enumC3581f, boolean z8, C3580e c3580e, n0 n0Var) {
        if (3 != (i8 & 3)) {
            AbstractC1012d0.a(i8, 3, a.f36267a.a());
        }
        this.f36264a = enumC3581f;
        this.f36265b = z8;
        if ((i8 & 4) == 0) {
            this.f36266c = null;
        } else {
            this.f36266c = c3580e;
        }
    }

    public static final /* synthetic */ void e(C3579d c3579d, B6.d dVar, A6.f fVar) {
        dVar.D(fVar, 0, f36263e[0], c3579d.f36264a);
        dVar.o(fVar, 1, c3579d.f36265b);
        if (dVar.x(fVar, 2) || c3579d.f36266c != null) {
            dVar.D(fVar, 2, C3580e.a.f36274a, c3579d.f36266c);
        }
    }

    public final boolean b() {
        return this.f36265b;
    }

    public final C3580e c() {
        return this.f36266c;
    }

    public final EnumC3581f d() {
        return this.f36264a;
    }

    public C3579d(EnumC3581f enumC3581f, boolean z8, C3580e c3580e) {
        this.f36264a = enumC3581f;
        this.f36265b = z8;
        this.f36266c = c3580e;
    }
}
