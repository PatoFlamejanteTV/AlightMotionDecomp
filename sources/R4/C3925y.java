package r4;

import R5.AbstractC1435t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import w4.C4156a;

/* renamed from: r4.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3925y implements H, m0, j0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3924x f38707a;

    /* renamed from: b, reason: collision with root package name */
    private final List f38708b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38709c;

    /* renamed from: d, reason: collision with root package name */
    private final q6.w f38710d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f38711e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f38712f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f38713g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f38714h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3813L f38715i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3813L f38716j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3813L f38717k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f38718l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.y$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38720b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f38721c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f38722d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f38723e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f38724f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f38725g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f38726h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f38727i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f38720b = z8;
            this.f38721c = k0Var;
            this.f38722d = modifier;
            this.f38723e = set;
            this.f38724f = g8;
            this.f38725g = i8;
            this.f38726h = i9;
            this.f38727i = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            C3925y.this.f(this.f38720b, this.f38721c, this.f38722d, this.f38723e, this.f38724f, this.f38725g, this.f38726h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38727i | 1));
        }
    }

    /* renamed from: r4.y$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {
        b() {
            super(1);
        }

        public final String a(int i8) {
            return (String) C3925y.this.x().get(i8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* renamed from: r4.y$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f38729a = new c();

        c() {
            super(2);
        }

        public final C4156a a(boolean z8, String str) {
            return new C4156a(str, z8);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    /* renamed from: r4.y$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function1 {
        d() {
            super(1);
        }

        public final String a(int i8) {
            return (String) AbstractC1435t.p0(C3925y.this.f38707a.j(), i8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public C3925y(InterfaceC3924x config, String str) {
        AbstractC3292y.i(config, "config");
        this.f38707a = config;
        this.f38708b = config.i();
        this.f38709c = config.h();
        q6.w a9 = AbstractC3815N.a(0);
        this.f38710d = a9;
        this.f38711e = a9;
        this.f38712f = AbstractC3815N.a(Integer.valueOf(config.b()));
        this.f38713g = A4.g.m(a9, new b());
        this.f38714h = A4.g.m(a9, new d());
        this.f38715i = A4.g.n(null);
        this.f38716j = AbstractC3815N.a(Boolean.TRUE);
        this.f38717k = A4.g.d(t(), y(), c.f38729a);
        this.f38718l = config.k();
        if (str != null) {
            q(str);
        }
    }

    private final void D(int i8) {
        if (i8 < this.f38708b.size()) {
            this.f38710d.setValue(Integer.valueOf(i8));
        }
    }

    public final String A(int i8) {
        return this.f38707a.g(i8);
    }

    public final boolean B() {
        return this.f38718l;
    }

    public final void C(int i8) {
        D(i8);
    }

    public InterfaceC3813L b() {
        return this.f38712f;
    }

    @Override // r4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3292y.i(field, "field");
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-186755585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-186755585, i10, -1, "com.stripe.android.uicore.elements.DropdownFieldController.ComposeUI (DropdownFieldController.kt:78)");
        }
        AbstractC3926z.a(this, z8, null, false, startRestartGroup, ((i10 << 3) & 112) | 8, 12);
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
        return this.f38715i;
    }

    @Override // r4.H
    public InterfaceC3813L l() {
        return this.f38717k;
    }

    @Override // r4.H
    public void q(String rawValue) {
        int i8;
        AbstractC3292y.i(rawValue, "rawValue");
        Integer valueOf = Integer.valueOf(this.f38708b.indexOf(this.f38707a.f(rawValue)));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            i8 = valueOf.intValue();
        } else {
            i8 = 0;
        }
        D(i8);
    }

    @Override // r4.H
    public InterfaceC3813L t() {
        return this.f38716j;
    }

    public final boolean w() {
        return this.f38709c;
    }

    public final List x() {
        return this.f38708b;
    }

    public InterfaceC3813L y() {
        return this.f38714h;
    }

    public final InterfaceC3813L z() {
        return this.f38711e;
    }

    public /* synthetic */ C3925y(InterfaceC3924x interfaceC3924x, String str, int i8, AbstractC3284p abstractC3284p) {
        this(interfaceC3924x, (i8 & 2) != 0 ? null : str);
    }
}
