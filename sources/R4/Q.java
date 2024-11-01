package r4;

import R5.AbstractC1435t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.VisualTransformation;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3533g;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import w4.C4156a;
import z2.C4266a;

/* loaded from: classes4.dex */
public final class Q implements H, j0 {

    /* renamed from: r */
    public static final a f38111r = new a(null);

    /* renamed from: s */
    public static final int f38112s = 8;

    /* renamed from: a */
    private final String f38113a;

    /* renamed from: b */
    private final boolean f38114b;

    /* renamed from: c */
    private final boolean f38115c;

    /* renamed from: d */
    private final InterfaceC3813L f38116d;

    /* renamed from: e */
    private final q6.w f38117e;

    /* renamed from: f */
    private final InterfaceC3813L f38118f;

    /* renamed from: g */
    private final q6.w f38119g;

    /* renamed from: h */
    private final C3920t f38120h;

    /* renamed from: i */
    private final C3925y f38121i;

    /* renamed from: j */
    private final InterfaceC3813L f38122j;

    /* renamed from: k */
    private final InterfaceC3813L f38123k;

    /* renamed from: l */
    private final InterfaceC3813L f38124l;

    /* renamed from: m */
    private final InterfaceC3813L f38125m;

    /* renamed from: n */
    private final InterfaceC3813L f38126n;

    /* renamed from: o */
    private final InterfaceC3813L f38127o;

    /* renamed from: p */
    private final InterfaceC3813L f38128p;

    /* renamed from: q */
    private final InterfaceC3813L f38129q;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ Q b(a aVar, String str, String str2, Set set, boolean z8, boolean z9, int i8, Object obj) {
            boolean z10;
            boolean z11;
            if ((i8 & 1) != 0) {
                str = "";
            }
            if ((i8 & 2) != 0) {
                str2 = null;
            }
            String str3 = str2;
            if ((i8 & 4) != 0) {
                set = R5.a0.f();
            }
            Set set2 = set;
            if ((i8 & 8) != 0) {
                z10 = false;
            } else {
                z10 = z8;
            }
            if ((i8 & 16) != 0) {
                z11 = false;
            } else {
                z11 = z9;
            }
            return aVar.a(str, str3, set2, z10, z11);
        }

        public final Q a(String initialValue, String str, Set overrideCountryCodes, boolean z8, boolean z9) {
            AbstractC3292y.i(initialValue, "initialValue");
            AbstractC3292y.i(overrideCountryCodes, "overrideCountryCodes");
            U u8 = null;
            boolean B8 = l6.n.B(initialValue, "+", false, 2, null);
            if (str == null && B8) {
                u8 = U.f38189a.d(initialValue);
            } else if (str != null) {
                u8 = U.f38189a.c(str);
            }
            if (u8 != null) {
                String e8 = u8.e();
                return new Q(l6.n.k0(u8.g(l6.n.k0(initialValue, e8)), e8), u8.c(), overrideCountryCodes, z8, z9, null);
            }
            return new Q(initialValue, str, overrideCountryCodes, z8, z9, null);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b */
        final /* synthetic */ boolean f38131b;

        /* renamed from: c */
        final /* synthetic */ k0 f38132c;

        /* renamed from: d */
        final /* synthetic */ Modifier f38133d;

        /* renamed from: e */
        final /* synthetic */ Set f38134e;

        /* renamed from: f */
        final /* synthetic */ G f38135f;

        /* renamed from: g */
        final /* synthetic */ int f38136g;

        /* renamed from: h */
        final /* synthetic */ int f38137h;

        /* renamed from: i */
        final /* synthetic */ int f38138i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f38131b = z8;
            this.f38132c = k0Var;
            this.f38133d = modifier;
            this.f38134e = set;
            this.f38135f = g8;
            this.f38136g = i8;
            this.f38137h = i9;
            this.f38138i = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            Q.this.f(this.f38131b, this.f38132c, this.f38133d, this.f38134e, this.f38135f, this.f38136g, this.f38137h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38138i | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function1 {

        /* renamed from: a */
        public static final c f38139a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(C4266a country) {
            String str;
            AbstractC3292y.i(country, "country");
            String a9 = C3920t.f38631k.a(country.b().b());
            String g8 = U.f38189a.g(country.b().b());
            if (g8 != null) {
                str = "  " + g8 + "  ";
            } else {
                str = null;
            }
            return AbstractC1435t.w0(AbstractC1435t.r(a9, str), "", null, null, 0, null, null, 62, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function1 {

        /* renamed from: a */
        public static final d f38140a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(C4266a country) {
            AbstractC3292y.i(country, "country");
            return AbstractC1435t.w0(AbstractC1435t.r(C3920t.f38631k.a(country.b().b()), country.f(), U.f38189a.g(country.b().b())), " ", null, null, 0, null, null, 62, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a */
        public static final e f38141a = new e();

        e() {
            super(3);
        }

        public final C a(String value, boolean z8, boolean z9) {
            AbstractC3292y.i(value, "value");
            if (!(!l6.n.T(value)) || z8 || z9) {
                return null;
            }
            return new C(AbstractC3533g.f35954G, null, 2, null);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((String) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a */
        public static final f f38142a = new f();

        f() {
            super(2);
        }

        public final C4156a a(String fieldValue, boolean z8) {
            AbstractC3292y.i(fieldValue, "fieldValue");
            return new C4156a(fieldValue, z8);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((String) obj, ((Boolean) obj2).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements InterfaceC2072n {
        g() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a */
        public final Boolean invoke(String value, Integer num) {
            int i8;
            AbstractC3292y.i(value, "value");
            int length = value.length();
            boolean z8 = false;
            if (num != null) {
                i8 = num.intValue();
            } else {
                i8 = 0;
            }
            if (length >= i8 || Q.this.f38115c) {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements Function1 {
        h() {
            super(1);
        }

        public final U a(int i8) {
            return U.f38189a.c(((C4266a) Q.this.f38120h.a().get(i8)).b().b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements Function1 {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Integer invoke(int i8) {
            return U.f38189a.f(((C4266a) Q.this.f38120h.a().get(i8)).b().b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function1 {

        /* renamed from: a */
        public static final j f38146a = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(U it) {
            AbstractC3292y.i(it, "it");
            return it.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a */
        public static final k f38147a = new k();

        k() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a */
        public final String invoke(String value, U formatter) {
            AbstractC3292y.i(value, "value");
            AbstractC3292y.i(formatter, "formatter");
            return formatter.g(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements Function1 {

        /* renamed from: a */
        public static final l f38148a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final VisualTransformation invoke(U it) {
            AbstractC3292y.i(it, "it");
            return it.f();
        }
    }

    public /* synthetic */ Q(String str, String str2, Set set, boolean z8, boolean z9, AbstractC3284p abstractC3284p) {
        this(str, str2, set, z8, z9);
    }

    public final String A() {
        return this.f38113a;
    }

    public final String B() {
        return l6.n.k0((String) this.f38117e.getValue(), ((U) this.f38122j.getValue()).e());
    }

    public final InterfaceC3813L C() {
        return this.f38128p;
    }

    public final InterfaceC3813L D() {
        return this.f38129q;
    }

    public final void E(String displayFormatted) {
        AbstractC3292y.i(displayFormatted, "displayFormatted");
        this.f38117e.setValue(((U) this.f38122j.getValue()).h(displayFormatted));
    }

    public InterfaceC3813L b() {
        return this.f38116d;
    }

    @Override // r4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        int m4845getDoneeUduSuo;
        AbstractC3292y.i(field, "field");
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-1468906333);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1468906333, i10, -1, "com.stripe.android.uicore.elements.PhoneNumberController.ComposeUI (PhoneNumberController.kt:180)");
        }
        if (!AbstractC3292y.d(g8, field.a())) {
            m4845getDoneeUduSuo = ImeAction.Companion.m4847getNexteUduSuo();
        } else {
            m4845getDoneeUduSuo = ImeAction.Companion.m4845getDoneeUduSuo();
        }
        T.b(z8, this, null, null, false, false, null, null, m4845getDoneeUduSuo, startRestartGroup, (i10 & 14) | 64, 252);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // r4.m0
    public InterfaceC3813L getError() {
        return this.f38127o;
    }

    public final void h(boolean z8) {
        this.f38119g.setValue(Boolean.valueOf(z8));
    }

    public InterfaceC3813L j() {
        return this.f38118f;
    }

    @Override // r4.H
    public InterfaceC3813L l() {
        return this.f38126n;
    }

    @Override // r4.H
    public void q(String rawValue) {
        AbstractC3292y.i(rawValue, "rawValue");
        E(rawValue);
    }

    @Override // r4.H
    public InterfaceC3813L t() {
        return this.f38125m;
    }

    public boolean u() {
        return this.f38114b;
    }

    public final String x() {
        return ((U) this.f38122j.getValue()).c();
    }

    public final C3925y y() {
        return this.f38121i;
    }

    public final String z(String phoneNumber) {
        AbstractC3292y.i(phoneNumber, "phoneNumber");
        return ((U) this.f38122j.getValue()).g(phoneNumber);
    }

    private Q(String str, String str2, Set set, boolean z8, boolean z9) {
        this.f38113a = str;
        this.f38114b = z8;
        this.f38115c = z9;
        this.f38116d = A4.g.n(Integer.valueOf(v2.e.f40443f));
        q6.w a9 = AbstractC3815N.a(str);
        this.f38117e = a9;
        this.f38118f = AbstractC3823h.b(a9);
        q6.w a10 = AbstractC3815N.a(Boolean.FALSE);
        this.f38119g = a10;
        C3920t c3920t = new C3920t(set, null, true, false, c.f38139a, d.f38140a, 10, null);
        this.f38120h = c3920t;
        C3925y c3925y = new C3925y(c3920t, str2);
        this.f38121i = c3925y;
        InterfaceC3813L m8 = A4.g.m(c3925y.z(), new h());
        this.f38122j = m8;
        InterfaceC3813L m9 = A4.g.m(c3925y.z(), new i());
        this.f38123k = m9;
        this.f38124l = A4.g.d(j(), m8, k.f38147a);
        this.f38125m = A4.g.d(j(), m9, new g());
        this.f38126n = A4.g.d(j(), t(), f.f38142a);
        this.f38127o = A4.g.e(j(), t(), a10, e.f38141a);
        this.f38128p = A4.g.m(m8, j.f38146a);
        this.f38129q = A4.g.m(m8, l.f38148a);
    }
}
