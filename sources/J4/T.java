package j4;

import R5.AbstractC1435t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.VisualTransformation;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import g3.C2902a;
import g3.EnumC2906e;
import g4.AbstractC2917a;
import j4.InterfaceC3159B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import m4.AbstractC3371b;
import m4.InterfaceC3370a;
import n2.AbstractC3394E;
import p2.AbstractC3564f;
import p2.C3561c;
import p2.C3569k;
import p2.InterfaceC3560b;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import r4.A0;
import r4.x0;
import w4.C4156a;

/* loaded from: classes4.dex */
public final class T extends K {

    /* renamed from: G, reason: collision with root package name */
    private static final a f33984G = new a(null);

    /* renamed from: H, reason: collision with root package name */
    public static final int f33985H = 8;

    /* renamed from: A, reason: collision with root package name */
    private final q6.w f33986A;

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC3813L f33987B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC3813L f33988C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC3813L f33989D;

    /* renamed from: E, reason: collision with root package name */
    private final InterfaceC3813L f33990E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC3813L f33991F;

    /* renamed from: b, reason: collision with root package name */
    private final C3167J f33992b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33993c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33994d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3159B f33995e;

    /* renamed from: f, reason: collision with root package name */
    private final int f33996f;

    /* renamed from: g, reason: collision with root package name */
    private final int f33997g;

    /* renamed from: h, reason: collision with root package name */
    private final VisualTransformation f33998h;

    /* renamed from: i, reason: collision with root package name */
    private final String f33999i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3813L f34000j;

    /* renamed from: k, reason: collision with root package name */
    private final q6.w f34001k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3813L f34002l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3813L f34003m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3813L f34004n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f34005o;

    /* renamed from: p, reason: collision with root package name */
    private final q6.w f34006p;

    /* renamed from: q, reason: collision with root package name */
    private final List f34007q;

    /* renamed from: r, reason: collision with root package name */
    private final q6.w f34008r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3813L f34009s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3813L f34010t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3813L f34011u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f34012v;

    /* renamed from: w, reason: collision with root package name */
    private final C3561c f34013w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC3813L f34014x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC3813L f34015y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC3813L f34016z;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f34017a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3370a f34019c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f34020a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f34021b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3370a f34022c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC3370a interfaceC3370a, U5.d dVar) {
                super(2, dVar);
                this.f34022c = interfaceC3370a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                a aVar = new a(this.f34022c, dVar);
                aVar.f34021b = obj;
                return aVar;
            }

            @Override // c6.InterfaceC2072n
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(r4.y0 y0Var, U5.d dVar) {
                return ((a) create(y0Var, dVar)).invokeSuspend(Q5.I.f8786a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f34020a == 0) {
                    Q5.t.b(obj);
                    if (((r4.y0) this.f34021b) instanceof A0.a) {
                        this.f34022c.a();
                    }
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3370a interfaceC3370a, U5.d dVar) {
            super(2, dVar);
            this.f34019c = interfaceC3370a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f34019c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f34017a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InterfaceC3821f q8 = AbstractC3823h.q(T.this.n(), 1);
                a aVar = new a(this.f34019c, null);
                this.f34017a = 1;
                if (AbstractC3823h.j(q8, aVar, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f34024b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r4.k0 f34025c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f34026d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f34027e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ r4.G f34028f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f34029g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f34030h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f34031i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, r4.k0 k0Var, Modifier modifier, Set set, r4.G g8, int i8, int i9, int i10) {
            super(2);
            this.f34024b = z8;
            this.f34025c = k0Var;
            this.f34026d = modifier;
            this.f34027e = set;
            this.f34028f = g8;
            this.f34029g = i8;
            this.f34030h = i9;
            this.f34031i = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            T.this.f(this.f34024b, this.f34025c, this.f34026d, this.f34027e, this.f34028f, this.f34029g, this.f34030h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f34031i | 1));
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements InterfaceC2072n {
        d() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r4.y0 invoke(EnumC2906e brand, String fieldValue) {
            int n8;
            AbstractC3292y.i(brand, "brand");
            AbstractC3292y.i(fieldValue, "fieldValue");
            C3167J c3167j = T.this.f33992b;
            C2902a d8 = T.this.D().d();
            if (d8 != null) {
                n8 = d8.f();
            } else {
                n8 = brand.n(fieldValue);
            }
            return c3167j.c(brand, fieldValue, n8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements C3561c.a {
        e() {
        }

        @Override // p2.C3561c.a
        public void a(List accountRanges) {
            AbstractC3292y.i(accountRanges, "accountRanges");
            C2902a c2902a = (C2902a) AbstractC1435t.o0(accountRanges);
            if (c2902a != null) {
                int f8 = c2902a.f();
                VisualTransformation d8 = T.this.d();
                AbstractC3292y.g(d8, "null cannot be cast to non-null type com.stripe.android.ui.core.elements.CardNumberVisualTransformation");
                ((M) d8).a(Integer.valueOf(f8));
            }
            List list = accountRanges;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2902a) it.next()).b());
            }
            T.this.f34006p.setValue(AbstractC1435t.e0(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(T.this.f34005o);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f34035a = new g();

        g() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC2906e invoke(List choices, EnumC2906e selected) {
            AbstractC3292y.i(choices, "choices");
            AbstractC3292y.i(selected, "selected");
            EnumC2906e enumC2906e = (EnumC2906e) AbstractC1435t.M0(choices);
            if (enumC2906e != null) {
                return enumC2906e;
            }
            return selected;
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f34036a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3292y.i(it, "it");
            return AbstractC2917a.a(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f34037a = new i();

        i() {
            super(2);
        }

        public final r4.C a(boolean z8, r4.y0 fieldState) {
            AbstractC3292y.i(fieldState, "fieldState");
            r4.C error = fieldState.getError();
            if (error == null || !z8) {
                return null;
            }
            return error;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (r4.y0) obj2);
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f34038a = new j();

        j() {
            super(2);
        }

        public final C4156a a(boolean z8, String value) {
            AbstractC3292y.i(value, "value");
            return new C4156a(value, z8);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3293z implements Function1 {
        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC2906e invoke(String it) {
            EnumC2906e b9;
            AbstractC3292y.i(it, "it");
            C2902a d8 = T.this.D().d();
            if (d8 == null || (b9 = d8.b()) == null) {
                EnumC2906e enumC2906e = (EnumC2906e) AbstractC1435t.o0(EnumC2906e.f32115m.c(it));
                if (enumC2906e == null) {
                    return EnumC2906e.f32125w;
                }
                return enumC2906e;
            }
            return b9;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f34040a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(r4.y0 it) {
            AbstractC3292y.i(it, "it");
            return Boolean.valueOf(it.a());
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends AbstractC3293z implements Function1 {
        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3292y.i(it, "it");
            return T.this.f33992b.b(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class n extends AbstractC3293z implements InterfaceC2072n {
        n() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC2906e invoke(EnumC2906e enumC2906e, List choices) {
            Object obj;
            AbstractC3292y.i(choices, "choices");
            EnumC2906e enumC2906e2 = EnumC2906e.f32125w;
            if (enumC2906e != enumC2906e2) {
                if (AbstractC1435t.d0(choices, enumC2906e)) {
                    if (enumC2906e == null) {
                        return enumC2906e2;
                    }
                    return enumC2906e;
                }
                Iterator it = T.this.f34007q.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (choices.contains((EnumC2906e) obj)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                EnumC2906e enumC2906e3 = (EnumC2906e) obj;
                if (enumC2906e3 == null) {
                    return EnumC2906e.f32125w;
                }
                return enumC2906e3;
            }
            return enumC2906e;
        }
    }

    /* loaded from: classes4.dex */
    static final class o extends AbstractC3293z implements InterfaceC2073o {

        /* loaded from: classes4.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34044a;

            static {
                int[] iArr = new int[EnumC2906e.values().length];
                try {
                    iArr[EnumC2906e.f32125w.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f34044a = iArr;
            }
        }

        o() {
            super(3);
        }

        @Override // c6.InterfaceC2073o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r4.x0 invoke(String number, List brands, EnumC2906e chosen) {
            x0.a.C0871a c0871a;
            AbstractC3292y.i(number, "number");
            AbstractC3292y.i(brands, "brands");
            AbstractC3292y.i(chosen, "chosen");
            if (T.this.f34005o && number.length() > 0) {
                EnumC2906e enumC2906e = EnumC2906e.f32125w;
                x0.a.C0871a c0871a2 = new x0.a.C0871a(enumC2906e.f(), C2.d.a(AbstractC3394E.f35216W), enumC2906e.k());
                boolean z8 = false;
                if (brands.size() == 1) {
                    EnumC2906e enumC2906e2 = (EnumC2906e) brands.get(0);
                    c0871a = new x0.a.C0871a(enumC2906e2.f(), C2.d.b(enumC2906e2.h()), enumC2906e2.k());
                } else if (a.f34044a[chosen.ordinal()] == 1) {
                    c0871a = null;
                } else {
                    c0871a = new x0.a.C0871a(chosen.f(), C2.d.b(chosen.h()), chosen.k());
                }
                List<EnumC2906e> list = brands;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                for (EnumC2906e enumC2906e3 : list) {
                    arrayList.add(new x0.a.C0871a(enumC2906e3.f(), C2.d.b(enumC2906e3.h()), enumC2906e3.k()));
                }
                C2.c a9 = C2.d.a(AbstractC3394E.f35217X);
                if (c0871a != null) {
                    c0871a2 = c0871a;
                }
                if (brands.size() < 2) {
                    z8 = true;
                }
                return new x0.a(a9, z8, c0871a2, arrayList);
            }
            if (T.this.D().d() != null) {
                C2902a d8 = T.this.D().d();
                AbstractC3292y.f(d8);
                return new x0.c(d8.b().k(), null, false, null, 10, null);
            }
            List c8 = EnumC2906e.f32115m.c(number);
            ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(c8, 10));
            Iterator it = c8.iterator();
            while (it.hasNext()) {
                arrayList2.add(new x0.c(((EnumC2906e) it.next()).k(), null, false, null, 10, null));
            }
            List Q02 = AbstractC1435t.Q0(arrayList2, 3);
            ArrayList arrayList3 = new ArrayList(AbstractC1435t.x(c8, 10));
            Iterator it2 = c8.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new x0.c(((EnumC2906e) it2.next()).k(), null, false, null, 10, null));
            }
            return new x0.b(Q02, AbstractC1435t.f0(arrayList3, 3));
        }
    }

    /* loaded from: classes4.dex */
    static final class p extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final p f34045a = new p();

        p() {
            super(2);
        }

        public final Boolean a(r4.y0 fieldState, boolean z8) {
            AbstractC3292y.i(fieldState, "fieldState");
            return Boolean.valueOf(fieldState.c(z8));
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((r4.y0) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public /* synthetic */ T(C3167J c3167j, InterfaceC3560b interfaceC3560b, U5.g gVar, U5.g gVar2, p2.p pVar, String str, boolean z8, InterfaceC3159B interfaceC3159B, int i8, AbstractC3284p abstractC3284p) {
        this(c3167j, interfaceC3560b, gVar, gVar2, (i8 & 16) != 0 ? new C3569k() : pVar, str, (i8 & 64) != 0 ? false : z8, (i8 & 128) != 0 ? InterfaceC3159B.b.f33720a : interfaceC3159B);
    }

    public final C3561c D() {
        return this.f34013w;
    }

    public InterfaceC3813L E() {
        return this.f34003m;
    }

    @Override // r4.w0
    public InterfaceC3813L a() {
        return this.f33987B;
    }

    @Override // r4.w0
    public InterfaceC3813L b() {
        return this.f34000j;
    }

    @Override // r4.w0
    public InterfaceC3813L c() {
        return this.f34014x;
    }

    @Override // r4.w0
    public VisualTransformation d() {
        return this.f33998h;
    }

    @Override // j4.K, r4.w0, r4.j0
    public void f(boolean z8, r4.k0 field, Modifier modifier, Set hiddenIdentifiers, r4.G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3292y.i(field, "field");
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(722479676);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(722479676, i10, -1, "com.stripe.android.ui.core.elements.DefaultCardNumberController.ComposeUI (CardNumberController.kt:314)");
        }
        EffectsKt.LaunchedEffect(Q5.I.f8786a, new b((InterfaceC3370a) startRestartGroup.consume(AbstractC3371b.a()), null), startRestartGroup, 70);
        super.f(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, startRestartGroup, (i10 & 14) | 16781376 | (i10 & 896) | (r4.G.f37990d << 12) | (57344 & i10) | (458752 & i10) | (3670016 & i10));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // r4.w0
    public int g() {
        return this.f33996f;
    }

    @Override // r4.w0
    public InterfaceC3813L getContentDescription() {
        return this.f34004n;
    }

    @Override // r4.m0
    public InterfaceC3813L getError() {
        return this.f33989D;
    }

    @Override // r4.w0
    public void h(boolean z8) {
        this.f33986A.setValue(Boolean.valueOf(z8));
    }

    @Override // r4.w0
    public int i() {
        return this.f33997g;
    }

    @Override // r4.w0
    public InterfaceC3813L j() {
        return this.f34002l;
    }

    @Override // r4.w0
    public r4.y0 k(String displayFormatted) {
        AbstractC3292y.i(displayFormatted, "displayFormatted");
        this.f34001k.setValue(this.f33992b.d(displayFormatted));
        this.f34013w.h(new AbstractC3564f.b(displayFormatted));
        return null;
    }

    @Override // r4.H
    public InterfaceC3813L l() {
        return this.f33991F;
    }

    @Override // r4.w0
    public InterfaceC3813L m() {
        return this.f33988C;
    }

    @Override // r4.w0
    public InterfaceC3813L n() {
        return this.f34016z;
    }

    @Override // r4.H
    public void q(String rawValue) {
        AbstractC3292y.i(rawValue, "rawValue");
        k(this.f33992b.a(rawValue));
    }

    @Override // r4.w0
    public String r() {
        return this.f33993c;
    }

    @Override // r4.w0
    public void s(x0.a.C0871a item) {
        AbstractC3292y.i(item, "item");
        this.f34008r.setValue(EnumC2906e.f32115m.b(item.a()));
    }

    @Override // r4.H
    public InterfaceC3813L t() {
        return this.f33990E;
    }

    @Override // r4.w0
    public boolean u() {
        return this.f33994d;
    }

    @Override // j4.K
    public InterfaceC3813L v() {
        return this.f34011u;
    }

    @Override // j4.K
    public boolean w() {
        return this.f34012v;
    }

    @Override // j4.K
    public InterfaceC3813L x() {
        return this.f34009s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C3167J cardTextFieldConfig, InterfaceC3560b cardAccountRangeRepository, U5.g uiContext, U5.g workContext, p2.p staticCardAccountRanges, String str, boolean z8, InterfaceC3159B cardBrandChoiceConfig) {
        super(null);
        List m8;
        AbstractC3292y.i(cardTextFieldConfig, "cardTextFieldConfig");
        AbstractC3292y.i(cardAccountRangeRepository, "cardAccountRangeRepository");
        AbstractC3292y.i(uiContext, "uiContext");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(staticCardAccountRanges, "staticCardAccountRanges");
        AbstractC3292y.i(cardBrandChoiceConfig, "cardBrandChoiceConfig");
        EnumC2906e enumC2906e = null;
        this.f33992b = cardTextFieldConfig;
        this.f33993c = str;
        this.f33994d = z8;
        this.f33995e = cardBrandChoiceConfig;
        this.f33996f = cardTextFieldConfig.e();
        this.f33997g = cardTextFieldConfig.g();
        this.f33998h = cardTextFieldConfig.i();
        this.f33999i = cardTextFieldConfig.f();
        this.f34000j = A4.g.n(Integer.valueOf(cardTextFieldConfig.h()));
        q6.w a9 = AbstractC3815N.a("");
        this.f34001k = a9;
        this.f34002l = AbstractC3823h.b(a9);
        this.f34003m = A4.g.m(a9, new m());
        this.f34004n = A4.g.m(a9, h.f34036a);
        boolean z9 = cardBrandChoiceConfig instanceof InterfaceC3159B.a;
        this.f34005o = z9;
        q6.w a10 = AbstractC3815N.a(AbstractC1435t.m());
        this.f34006p = a10;
        if (cardBrandChoiceConfig instanceof InterfaceC3159B.a) {
            m8 = ((InterfaceC3159B.a) cardBrandChoiceConfig).b();
        } else {
            if (!(cardBrandChoiceConfig instanceof InterfaceC3159B.b)) {
                throw new Q5.p();
            }
            m8 = AbstractC1435t.m();
        }
        this.f34007q = m8;
        if (cardBrandChoiceConfig instanceof InterfaceC3159B.a) {
            enumC2906e = ((InterfaceC3159B.a) cardBrandChoiceConfig).a();
        } else if (!(cardBrandChoiceConfig instanceof InterfaceC3159B.b)) {
            throw new Q5.p();
        }
        q6.w a11 = AbstractC3815N.a(enumC2906e);
        this.f34008r = a11;
        this.f34009s = A4.g.d(a11, a10, new n());
        InterfaceC3813L m9 = A4.g.m(a9, new k());
        this.f34010t = m9;
        this.f34011u = z9 ? A4.g.d(a10, x(), g.f34035a) : m9;
        this.f34012v = true;
        C3561c c3561c = new C3561c(cardAccountRangeRepository, uiContext, workContext, staticCardAccountRanges, new e(), new f());
        this.f34013w = c3561c;
        this.f34014x = A4.g.e(a9, a10, x(), new o());
        InterfaceC3813L d8 = A4.g.d(m9, a9, new d());
        this.f34015y = d8;
        this.f34016z = d8;
        q6.w a12 = AbstractC3815N.a(Boolean.FALSE);
        this.f33986A = a12;
        this.f33987B = c3561c.g();
        this.f33988C = A4.g.d(d8, a12, p.f34045a);
        this.f33989D = A4.g.d(m(), d8, i.f34037a);
        this.f33990E = A4.g.m(d8, l.f34040a);
        this.f33991F = A4.g.d(t(), E(), j.f34038a);
        String r8 = r();
        q(r8 != null ? r8 : "");
    }
}
