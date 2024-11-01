package f3;

import A4.g;
import P2.d;
import P2.e;
import Q5.I;
import R5.AbstractC1435t;
import Y2.f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import c6.InterfaceC2072n;
import j4.A0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;
import r4.G;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2848a extends A0 {

    /* renamed from: d, reason: collision with root package name */
    private final b f31851d;

    /* renamed from: e, reason: collision with root package name */
    private final e f31852e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f31853f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0733a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31855b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f31856c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0733a(boolean z8, int i8) {
            super(2);
            this.f31855b = z8;
            this.f31856c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            C2848a.this.f(this.f31855b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f31856c | 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2848a(b configuration, e linkConfigurationCoordinator, Function1 onLinkInlineSignupStateChanged) {
        super(G.Companion.a("link_form"), true);
        AbstractC3292y.i(configuration, "configuration");
        AbstractC3292y.i(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        AbstractC3292y.i(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
        this.f31851d = configuration;
        this.f31852e = linkConfigurationCoordinator;
        this.f31853f = onLinkInlineSignupStateChanged;
    }

    @Override // r4.D
    public InterfaceC3813L d() {
        return g.n(AbstractC1435t.m());
    }

    @Override // j4.A0
    public void f(boolean z8, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-736893023);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-736893023, i8, -1, "com.stripe.android.lpmfoundations.paymentmethod.link.LinkFormElement.ComposeUI (LinkFormElement.kt:25)");
        }
        f.a(this.f31852e, this.f31851d.a(), this.f31851d.b(), z8, this.f31853f, startRestartGroup, (d.f8014i << 3) | 8 | ((i8 << 9) & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0733a(z8, i8));
        }
    }
}
