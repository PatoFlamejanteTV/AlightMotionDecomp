package r4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3533g;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import w4.C4156a;

/* loaded from: classes4.dex */
public final class d0 implements H, j0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f38343i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3813L f38344a = A4.g.n(Integer.valueOf(AbstractC3533g.f35980x));

    /* renamed from: b, reason: collision with root package name */
    private final q6.w f38345b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3813L f38346c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f38347d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f38348e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f38349f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f38350g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f38351h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38353b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f38354c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f38355d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f38356e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f38357f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f38358g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f38359h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f38360i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f38353b = z8;
            this.f38354c = k0Var;
            this.f38355d = modifier;
            this.f38356e = set;
            this.f38357f = g8;
            this.f38358g = i8;
            this.f38359h = i9;
            this.f38360i = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            d0.this.f(this.f38353b, this.f38354c, this.f38355d, this.f38356e, this.f38357f, this.f38358g, this.f38359h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38360i | 1));
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f38361a = new b();

        b() {
            super(1);
        }

        public final String a(boolean z8) {
            return String.valueOf(z8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f38362a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4156a invoke(String str) {
            return new C4156a(str, true);
        }
    }

    public d0(boolean z8) {
        q6.w a9 = AbstractC3815N.a(Boolean.valueOf(z8));
        this.f38345b = a9;
        InterfaceC3813L b9 = AbstractC3823h.b(a9);
        this.f38346c = b9;
        this.f38347d = A4.g.m(b9, b.f38361a);
        this.f38348e = j();
        this.f38349f = A4.g.n(null);
        this.f38350g = A4.g.n(Boolean.TRUE);
        this.f38351h = A4.g.m(v(), c.f38362a);
    }

    public InterfaceC3813L b() {
        return this.f38344a;
    }

    @Override // r4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3292y.i(field, "field");
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(1284799623);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1284799623, i10, -1, "com.stripe.android.uicore.elements.SameAsShippingController.ComposeUI (SameAsShippingController.kt:49)");
        }
        f0.a(this, startRestartGroup, 8);
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
        return this.f38349f;
    }

    public InterfaceC3813L j() {
        return this.f38347d;
    }

    @Override // r4.H
    public InterfaceC3813L l() {
        return this.f38351h;
    }

    @Override // r4.H
    public void q(String rawValue) {
        boolean z8;
        AbstractC3292y.i(rawValue, "rawValue");
        Boolean L02 = l6.n.L0(rawValue);
        if (L02 != null) {
            z8 = L02.booleanValue();
        } else {
            z8 = true;
        }
        x(z8);
    }

    public InterfaceC3813L v() {
        return this.f38348e;
    }

    public final InterfaceC3813L w() {
        return this.f38346c;
    }

    public final void x(boolean z8) {
        this.f38345b.setValue(Boolean.valueOf(z8));
    }
}
