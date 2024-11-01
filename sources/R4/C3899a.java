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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3899a implements m0, j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f38239c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3813L f38240a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f38241b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0848a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38243b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f38244c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f38245d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f38246e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f38247f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f38248g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f38249h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f38250i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0848a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f38243b = z8;
            this.f38244c = k0Var;
            this.f38245d = modifier;
            this.f38246e = set;
            this.f38247f = g8;
            this.f38248g = i8;
            this.f38249h = i9;
            this.f38250i = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            C3899a.this.f(this.f38243b, this.f38244c, this.f38245d, this.f38246e, this.f38247f, this.f38248g, this.f38249h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38250i | 1));
        }
    }

    /* renamed from: r4.a$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f38251a = new b();

        /* renamed from: r4.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0849a implements InterfaceC3821f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f38252a;

            /* renamed from: r4.a$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0850a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3821f[] f38253a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0850a(InterfaceC3821f[] interfaceC3821fArr) {
                    super(0);
                    this.f38253a = interfaceC3821fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new C[this.f38253a.length];
                }
            }

            /* renamed from: r4.a$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0851b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

                /* renamed from: a, reason: collision with root package name */
                int f38254a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f38255b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f38256c;

                public C0851b(U5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f38254a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            Q5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Q5.t.b(obj);
                        InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f38255b;
                        C c8 = (C) AbstractC1435t.o0(AbstractC1435t.j0(AbstractC1428l.V0((Object[]) this.f38256c)));
                        this.f38254a = 1;
                        if (interfaceC3822g.emit(c8, this) == e8) {
                            return e8;
                        }
                    }
                    return Q5.I.f8786a;
                }

                @Override // c6.InterfaceC2073o
                public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                    C0851b c0851b = new C0851b(dVar);
                    c0851b.f38255b = interfaceC3822g;
                    c0851b.f38256c = objArr;
                    return c0851b.invokeSuspend(Q5.I.f8786a);
                }
            }

            public C0849a(InterfaceC3821f[] interfaceC3821fArr) {
                this.f38252a = interfaceC3821fArr;
            }

            @Override // q6.InterfaceC3821f
            public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
                InterfaceC3821f[] interfaceC3821fArr = this.f38252a;
                Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new C0850a(interfaceC3821fArr), new C0851b(null), dVar);
                if (a9 == V5.b.e()) {
                    return a9;
                }
                return Q5.I.f8786a;
            }
        }

        /* renamed from: r4.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0852b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f38257a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0852b(List list) {
                super(0);
                this.f38257a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f38257a;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3813L) it.next()).getValue());
                }
                return (C) AbstractC1435t.o0(AbstractC1435t.j0(arrayList));
            }
        }

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3813L invoke(List sectionFieldElements) {
            InterfaceC3821f c0849a;
            AbstractC3292y.i(sectionFieldElements, "sectionFieldElements");
            List list = sectionFieldElements;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((k0) it.next()).f().getError());
            }
            if (arrayList.isEmpty()) {
                c0849a = A4.g.n((C) AbstractC1435t.o0(AbstractC1435t.j0(AbstractC1435t.m())));
            } else {
                c0849a = new C0849a((InterfaceC3821f[]) AbstractC1435t.W0(arrayList).toArray(new InterfaceC3821f[0]));
            }
            return new A4.e(c0849a, new C0852b(arrayList));
        }
    }

    public C3899a(InterfaceC3813L fieldsFlowable) {
        AbstractC3292y.i(fieldsFlowable, "fieldsFlowable");
        this.f38240a = fieldsFlowable;
        this.f38241b = A4.g.l(fieldsFlowable, b.f38251a);
    }

    @Override // r4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3292y.i(field, "field");
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(791653481);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(791653481, i10, -1, "com.stripe.android.uicore.elements.AddressController.ComposeUI (AddressController.kt:40)");
        }
        AbstractC3905d.a(z8, this, hiddenIdentifiers, g8, startRestartGroup, (i10 & 14) | 576 | ((i10 >> 3) & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0848a(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // r4.m0
    public InterfaceC3813L getError() {
        return this.f38241b;
    }

    public final InterfaceC3813L v() {
        return this.f38240a;
    }
}
