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
import q6.InterfaceC3813L;

/* renamed from: r4.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3914m implements m0, j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f38514f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final b f38515a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38516b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38517c;

    /* renamed from: d, reason: collision with root package name */
    private final q6.w f38518d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f38519e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.m$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38521b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f38522c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f38523d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f38524e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f38525f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f38526g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f38527h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f38528i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f38521b = z8;
            this.f38522c = k0Var;
            this.f38523d = modifier;
            this.f38524e = set;
            this.f38525f = g8;
            this.f38526g = i8;
            this.f38527h = i9;
            this.f38528i = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            C3914m.this.f(this.f38521b, this.f38522c, this.f38523d, this.f38524e, this.f38525f, this.f38526g, this.f38527h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38528i | 1));
        }
    }

    /* renamed from: r4.m$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f38529a;

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f38530b;

        public b(int i8, Object... args) {
            AbstractC3292y.i(args, "args");
            this.f38529a = i8;
            this.f38530b = args;
        }

        public final Object[] a() {
            return this.f38530b;
        }

        public final int b() {
            return this.f38529a;
        }
    }

    /* renamed from: r4.m$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function1 {
        c() {
            super(1);
        }

        public final C a(boolean z8) {
            if (z8 || !C3914m.this.f38517c) {
                return null;
            }
            return new C(AbstractC3533g.f35951D, null, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    public C3914m(b bVar, String debugTag, boolean z8) {
        AbstractC3292y.i(debugTag, "debugTag");
        this.f38515a = bVar;
        this.f38516b = debugTag;
        q6.w a9 = AbstractC3815N.a(Boolean.valueOf(z8));
        this.f38518d = a9;
        this.f38519e = A4.g.m(a9, new c());
    }

    @Override // r4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3292y.i(field, "field");
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(579664739);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(579664739, i10, -1, "com.stripe.android.uicore.elements.CheckboxFieldController.ComposeUI (CheckboxFieldController.kt:55)");
        }
        AbstractC3916o.a(modifier, this, z8, startRestartGroup, ((i10 >> 6) & 14) | 64 | ((i10 << 6) & 896), 0);
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
        return this.f38519e;
    }

    public final String w() {
        return this.f38516b;
    }

    public final b x() {
        return this.f38515a;
    }

    public final InterfaceC3813L y() {
        return this.f38518d;
    }

    public final void z(boolean z8) {
        if (!this.f38517c) {
            this.f38517c = true;
        }
        this.f38518d.setValue(Boolean.valueOf(z8));
    }
}
