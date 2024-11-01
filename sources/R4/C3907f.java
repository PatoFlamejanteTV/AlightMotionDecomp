package r4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.VisualTransformation;
import c6.InterfaceC2072n;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import r4.w0;
import r4.x0;
import r4.z0;
import w4.C4156a;

/* renamed from: r4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3907f implements w0, H, m0, j0 {

    /* renamed from: a, reason: collision with root package name */
    private final v0 f38370a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f38371b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38372c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f38373d;

    /* renamed from: e, reason: collision with root package name */
    private final int f38374e;

    /* renamed from: f, reason: collision with root package name */
    private final int f38375f;

    /* renamed from: g, reason: collision with root package name */
    private final VisualTransformation f38376g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f38377h;

    /* renamed from: i, reason: collision with root package name */
    private final q6.w f38378i;

    /* renamed from: j, reason: collision with root package name */
    private final String f38379j;

    /* renamed from: k, reason: collision with root package name */
    private final AutofillType f38380k;

    /* renamed from: l, reason: collision with root package name */
    private final q6.w f38381l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3813L f38382m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3813L f38383n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3813L f38384o;

    /* renamed from: p, reason: collision with root package name */
    private final q6.w f38385p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3813L f38386q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3813L f38387r;

    /* renamed from: s, reason: collision with root package name */
    private final q6.w f38388s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3813L f38389t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3813L f38390u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3813L f38391v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3813L f38392w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38394b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f38395c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f38396d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f38397e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f38398f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f38399g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f38400h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f38401i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f38394b = z8;
            this.f38395c = k0Var;
            this.f38396d = modifier;
            this.f38397e = set;
            this.f38398f = g8;
            this.f38399g = i8;
            this.f38400h = i9;
            this.f38401i = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            C3907f.this.f(this.f38394b, this.f38395c, this.f38396d, this.f38397e, this.f38398f, this.f38399g, this.f38400h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38401i | 1));
        }
    }

    /* renamed from: r4.f$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {
        b() {
            super(1);
        }

        public final C a(boolean z8) {
            C error = ((y0) C3907f.this.f38385p.getValue()).getError();
            if (error == null || !z8) {
                return null;
            }
            return error;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: r4.f$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f38403a = new c();

        c() {
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

    /* renamed from: r4.f$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(y0 it) {
            boolean z8;
            AbstractC3292y.i(it, "it");
            if (!it.a() && (it.a() || !C3907f.this.u() || !it.b())) {
                z8 = false;
            } else {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* renamed from: r4.f$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function1 {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3292y.i(it, "it");
            return C3907f.this.f38370a.h(it);
        }
    }

    /* renamed from: r4.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0865f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0865f f38406a = new C0865f();

        C0865f() {
            super(2);
        }

        public final Boolean a(y0 fieldState, boolean z8) {
            AbstractC3292y.i(fieldState, "fieldState");
            return Boolean.valueOf(fieldState.c(z8));
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((y0) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public C3907f(v0 config, Function0 function0, String str) {
        AbstractC3292y.i(config, "config");
        this.f38370a = config;
        this.f38371b = function0;
        this.f38372c = str;
        String r8 = r();
        if (r8 != null) {
            q(r8);
        }
        this.f38373d = config.c();
        this.f38374e = config.g();
        this.f38375f = config.i();
        VisualTransformation d8 = config.d();
        this.f38376g = d8 == null ? VisualTransformation.Companion.getNone() : d8;
        this.f38378i = AbstractC3815N.a(config.b());
        this.f38379j = config.k();
        q6.w a9 = AbstractC3815N.a("");
        this.f38381l = a9;
        this.f38382m = AbstractC3823h.b(a9);
        this.f38383n = A4.g.m(a9, new e());
        this.f38384o = AbstractC3823h.b(a9);
        q6.w a10 = AbstractC3815N.a(z0.a.f38774c);
        this.f38385p = a10;
        this.f38386q = AbstractC3823h.b(a10);
        this.f38387r = config.a();
        q6.w a11 = AbstractC3815N.a(Boolean.FALSE);
        this.f38388s = a11;
        this.f38389t = A4.g.d(a10, a11, C0865f.f38406a);
        this.f38390u = A4.g.m(m(), new b());
        this.f38391v = A4.g.m(a10, new d());
        this.f38392w = A4.g.d(t(), y(), c.f38403a);
    }

    @Override // r4.w0
    public InterfaceC3813L a() {
        return this.f38387r;
    }

    @Override // r4.w0
    public InterfaceC3813L c() {
        return this.f38373d;
    }

    @Override // r4.w0
    public VisualTransformation d() {
        return this.f38376g;
    }

    @Override // r4.w0
    public InterfaceC3813L e() {
        return w0.a.c(this);
    }

    @Override // r4.w0, r4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3292y.i(field, "field");
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-2122817753);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2122817753, i10, -1, "com.stripe.android.uicore.elements.AddressTextFieldController.ComposeUI (AddressTextFieldController.kt:112)");
        }
        AbstractC3909h.a(this, null, startRestartGroup, 8, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // r4.w0
    public int g() {
        return this.f38374e;
    }

    @Override // r4.w0
    public InterfaceC3813L getContentDescription() {
        return this.f38384o;
    }

    @Override // r4.m0
    public InterfaceC3813L getError() {
        return this.f38390u;
    }

    @Override // r4.w0
    public void h(boolean z8) {
        this.f38388s.setValue(Boolean.valueOf(z8));
    }

    @Override // r4.w0
    public int i() {
        return this.f38375f;
    }

    @Override // r4.w0
    public InterfaceC3813L j() {
        return this.f38382m;
    }

    @Override // r4.w0
    public y0 k(String displayFormatted) {
        AbstractC3292y.i(displayFormatted, "displayFormatted");
        y0 y0Var = (y0) this.f38385p.getValue();
        this.f38381l.setValue(this.f38370a.j(displayFormatted));
        this.f38385p.setValue(this.f38370a.l((String) this.f38381l.getValue()));
        if (!AbstractC3292y.d(this.f38385p.getValue(), y0Var)) {
            return (y0) this.f38385p.getValue();
        }
        return null;
    }

    @Override // r4.H
    public InterfaceC3813L l() {
        return this.f38392w;
    }

    @Override // r4.w0
    public InterfaceC3813L m() {
        return this.f38389t;
    }

    @Override // r4.w0
    public InterfaceC3813L n() {
        return this.f38386q;
    }

    @Override // r4.w0
    public AutofillType o() {
        return this.f38380k;
    }

    @Override // r4.w0
    public boolean p() {
        return w0.a.b(this);
    }

    @Override // r4.H
    public void q(String rawValue) {
        AbstractC3292y.i(rawValue, "rawValue");
        k(this.f38370a.f(rawValue));
    }

    @Override // r4.w0
    public String r() {
        return this.f38372c;
    }

    @Override // r4.w0
    public void s(x0.a.C0871a c0871a) {
        w0.a.d(this, c0871a);
    }

    @Override // r4.H
    public InterfaceC3813L t() {
        return this.f38391v;
    }

    @Override // r4.w0
    public boolean u() {
        return this.f38377h;
    }

    @Override // r4.w0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public q6.w b() {
        return this.f38378i;
    }

    public InterfaceC3813L y() {
        return this.f38383n;
    }

    public final void z() {
        Function0 function0 = this.f38371b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public /* synthetic */ C3907f(v0 v0Var, Function0 function0, String str, int i8, AbstractC3284p abstractC3284p) {
        this(v0Var, (i8 & 2) != 0 ? null : function0, (i8 & 4) != 0 ? null : str);
    }
}
