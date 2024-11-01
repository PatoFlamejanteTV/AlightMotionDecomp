package r4;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* renamed from: r4.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3900a0 implements m0, j0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f38258a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f38259b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.a0$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38261b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f38262c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f38263d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f38264e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f38265f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f38266g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f38267h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f38268i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f38261b = z8;
            this.f38262c = k0Var;
            this.f38263d = modifier;
            this.f38264e = set;
            this.f38265f = g8;
            this.f38266g = i8;
            this.f38267h = i9;
            this.f38268i = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            C3900a0.this.f(this.f38261b, this.f38262c, this.f38263d, this.f38264e, this.f38265f, this.f38266g, this.f38267h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38268i | 1));
        }
    }

    /* renamed from: r4.a0$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f38269a;

        /* renamed from: r4.a0$b$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f38270a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3821f[] interfaceC3821fArr) {
                super(0);
                this.f38270a = interfaceC3821fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new C[this.f38270a.length];
            }
        }

        /* renamed from: r4.a0$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0853b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f38271a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f38272b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f38273c;

            public C0853b(U5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f38271a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f38272b;
                    C c8 = (C) AbstractC1435t.o0(AbstractC1435t.j0(AbstractC1428l.V0((Object[]) this.f38273c)));
                    this.f38271a = 1;
                    if (interfaceC3822g.emit(c8, this) == e8) {
                        return e8;
                    }
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                C0853b c0853b = new C0853b(dVar);
                c0853b.f38272b = interfaceC3822g;
                c0853b.f38273c = objArr;
                return c0853b.invokeSuspend(Q5.I.f8786a);
            }
        }

        public b(InterfaceC3821f[] interfaceC3821fArr) {
            this.f38269a = interfaceC3821fArr;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            InterfaceC3821f[] interfaceC3821fArr = this.f38269a;
            Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new a(interfaceC3821fArr), new C0853b(null), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return Q5.I.f8786a;
        }
    }

    /* renamed from: r4.a0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f38274a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f38274a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f38274a;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3813L) it.next()).getValue());
            }
            return (C) AbstractC1435t.o0(AbstractC1435t.j0(arrayList));
        }
    }

    public C3900a0(List fields) {
        InterfaceC3821f bVar;
        AbstractC3292y.i(fields, "fields");
        this.f38258a = fields;
        List list = fields;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((o0) it.next()).f().getError());
        }
        if (arrayList.isEmpty()) {
            bVar = A4.g.n((C) AbstractC1435t.o0(AbstractC1435t.j0(AbstractC1435t.m())));
        } else {
            bVar = new b((InterfaceC3821f[]) AbstractC1435t.W0(arrayList).toArray(new InterfaceC3821f[0]));
        }
        this.f38259b = new A4.e(bVar, new c(arrayList));
    }

    @Override // r4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3292y.i(field, "field");
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-55811811);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-55811811, i10, -1, "com.stripe.android.uicore.elements.RowController.ComposeUI (RowController.kt:28)");
        }
        AbstractC3904c0.a(z8, this, hiddenIdentifiers, g8, startRestartGroup, (i10 & 14) | 576 | ((i10 >> 3) & 7168));
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
        return this.f38259b;
    }

    public final List v() {
        return this.f38258a;
    }
}
