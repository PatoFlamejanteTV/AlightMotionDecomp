package j4;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import g3.EnumC2906e;
import h4.InterfaceC2949a;
import j4.InterfaceC3159B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.C3445b0;
import p2.InterfaceC3560b;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import r4.C3900a0;
import r4.C3902b0;
import r4.C3922v;
import r4.G;

/* renamed from: j4.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3160C implements r4.m0, r4.j0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4.q0 f33731a;

    /* renamed from: b, reason: collision with root package name */
    private final L f33732b;

    /* renamed from: c, reason: collision with root package name */
    private final S f33733c;

    /* renamed from: d, reason: collision with root package name */
    private final r4.q0 f33734d;

    /* renamed from: e, reason: collision with root package name */
    private final List f33735e;

    /* renamed from: f, reason: collision with root package name */
    private final List f33736f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f33737g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.C$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f33739b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r4.k0 f33740c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f33741d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f33742e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ r4.G f33743f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f33744g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f33745h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f33746i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, r4.k0 k0Var, Modifier modifier, Set set, r4.G g8, int i8, int i9, int i10) {
            super(2);
            this.f33739b = z8;
            this.f33740c = k0Var;
            this.f33741d = modifier;
            this.f33742e = set;
            this.f33743f = g8;
            this.f33744g = i8;
            this.f33745h = i9;
            this.f33746i = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            C3160C.this.f(this.f33739b, this.f33740c, this.f33741d, this.f33742e, this.f33743f, this.f33744g, this.f33745h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f33746i | 1));
        }
    }

    /* renamed from: j4.C$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f33747a;

        /* renamed from: j4.C$b$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f33748a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3821f[] interfaceC3821fArr) {
                super(0);
                this.f33748a = interfaceC3821fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new r4.C[this.f33748a.length];
            }
        }

        /* renamed from: j4.C$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0775b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f33749a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f33750b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f33751c;

            public C0775b(U5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f33749a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f33750b;
                    r4.C c8 = (r4.C) AbstractC1435t.o0(AbstractC1435t.j0(AbstractC1428l.V0((Object[]) this.f33751c)));
                    this.f33749a = 1;
                    if (interfaceC3822g.emit(c8, this) == e8) {
                        return e8;
                    }
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                C0775b c0775b = new C0775b(dVar);
                c0775b.f33750b = interfaceC3822g;
                c0775b.f33751c = objArr;
                return c0775b.invokeSuspend(Q5.I.f8786a);
            }
        }

        public b(InterfaceC3821f[] interfaceC3821fArr) {
            this.f33747a = interfaceC3821fArr;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            InterfaceC3821f[] interfaceC3821fArr = this.f33747a;
            Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new a(interfaceC3821fArr), new C0775b(null), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return Q5.I.f8786a;
        }
    }

    /* renamed from: j4.C$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f33752a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f33752a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f33752a;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3813L) it.next()).getValue());
            }
            return (r4.C) AbstractC1435t.o0(AbstractC1435t.j0(arrayList));
        }
    }

    public C3160C(InterfaceC3560b.a cardAccountRangeRepositoryFactory, Map initialValues, boolean z8, InterfaceC2949a cbcEligibility, U5.g uiContext, U5.g workContext) {
        r4.q0 q0Var;
        InterfaceC3159B interfaceC3159B;
        InterfaceC3821f bVar;
        AbstractC3292y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3292y.i(initialValues, "initialValues");
        AbstractC3292y.i(cbcEligibility, "cbcEligibility");
        AbstractC3292y.i(uiContext, "uiContext");
        AbstractC3292y.i(workContext, "workContext");
        if (z8) {
            r4.r0 r0Var = new r4.r0(Integer.valueOf(g4.n.f32366D), KeyboardCapitalization.Companion.m4875getWordsIUNYP9k(), KeyboardType.Companion.m4899getTextPjHm6EE(), null, 8, null);
            G.b bVar2 = r4.G.Companion;
            q0Var = new r4.q0(bVar2.r(), new r4.s0(r0Var, false, (String) initialValues.get(bVar2.r()), 2, null));
        } else {
            q0Var = null;
        }
        this.f33731a = q0Var;
        G.b bVar3 = r4.G.Companion;
        r4.G j8 = bVar3.j();
        C3167J c3167j = new C3167J();
        InterfaceC3560b a9 = cardAccountRangeRepositoryFactory.a();
        String str = (String) initialValues.get(bVar3.j());
        if (cbcEligibility instanceof InterfaceC2949a.b) {
            List a10 = ((InterfaceC2949a.b) cbcEligibility).a();
            String str2 = (String) initialValues.get(bVar3.v());
            interfaceC3159B = new InterfaceC3159B.a(a10, str2 != null ? EnumC2906e.f32115m.b(str2) : null);
        } else {
            if (!(cbcEligibility instanceof InterfaceC2949a.c)) {
                throw new Q5.p();
            }
            interfaceC3159B = InterfaceC3159B.b.f33720a;
        }
        r4.q0 q0Var2 = q0Var;
        L l8 = new L(j8, new T(c3167j, a9, uiContext, workContext, null, str, false, interfaceC3159B, 80, null));
        this.f33732b = l8;
        S s8 = new S(bVar3.g(), new Q(new P(), l8.i().v(), (String) initialValues.get(bVar3.g()), false, 8, null));
        this.f33733c = s8;
        r4.G a11 = bVar3.a("date");
        C3922v c3922v = new C3922v();
        Object obj = initialValues.get(bVar3.h());
        String str3 = (String) initialValues.get(bVar3.i());
        r4.q0 q0Var3 = new r4.q0(a11, new r4.s0(c3922v, false, obj + (str3 != null ? l6.n.V0(str3, 2) : null), 2, null));
        this.f33734d = q0Var3;
        List p8 = AbstractC1435t.p(q0Var3, s8);
        this.f33735e = p8;
        this.f33736f = AbstractC1435t.r(q0Var2, l8, new C3902b0(bVar3.a("row_" + UUID.randomUUID().getLeastSignificantBits()), p8, new C3900a0(p8)));
        List r8 = AbstractC1435t.r(q0Var2, l8, q0Var3, s8);
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(r8, 10));
        Iterator it = r8.iterator();
        while (it.hasNext()) {
            arrayList.add(((r4.o0) it.next()).i());
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((r4.H) it2.next()).getError());
        }
        if (arrayList2.isEmpty()) {
            bVar = A4.g.n((r4.C) AbstractC1435t.o0(AbstractC1435t.j0(AbstractC1435t.m())));
        } else {
            bVar = new b((InterfaceC3821f[]) AbstractC1435t.W0(arrayList2).toArray(new InterfaceC3821f[0]));
        }
        this.f33737g = new A4.e(bVar, new c(arrayList2));
    }

    @Override // r4.j0
    public void f(boolean z8, r4.k0 field, Modifier modifier, Set hiddenIdentifiers, r4.G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3292y.i(field, "field");
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-1407073849);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407073849, i10, -1, "com.stripe.android.ui.core.elements.CardDetailsController.ComposeUI (CardDetailsController.kt:124)");
        }
        AbstractC3163F.a(z8, this, hiddenIdentifiers, g8, startRestartGroup, (i10 & 14) | 576 | (r4.G.f37990d << 9) | ((i10 >> 3) & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // r4.m0
    public InterfaceC3813L getError() {
        return this.f33737g;
    }

    public final S v() {
        return this.f33733c;
    }

    public final r4.q0 w() {
        return this.f33734d;
    }

    public final List x() {
        return this.f33736f;
    }

    public final r4.q0 y() {
        return this.f33731a;
    }

    public final L z() {
        return this.f33732b;
    }

    public /* synthetic */ C3160C(InterfaceC3560b.a aVar, Map map, boolean z8, InterfaceC2949a interfaceC2949a, U5.g gVar, U5.g gVar2, int i8, AbstractC3284p abstractC3284p) {
        this(aVar, map, (i8 & 4) != 0 ? false : z8, (i8 & 8) != 0 ? InterfaceC2949a.c.f32646a : interfaceC2949a, (i8 & 16) != 0 ? C3445b0.c() : gVar, (i8 & 32) != 0 ? C3445b0.b() : gVar2);
    }
}
