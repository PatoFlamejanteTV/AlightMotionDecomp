package r4;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.VisualTransformation;
import c6.InterfaceC2072n;
import java.util.Set;
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

/* loaded from: classes4.dex */
public final class s0 implements w0, m0 {

    /* renamed from: x, reason: collision with root package name */
    public static final int f38602x = 8;

    /* renamed from: a, reason: collision with root package name */
    private final v0 f38603a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38604b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38605c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f38606d;

    /* renamed from: e, reason: collision with root package name */
    private final int f38607e;

    /* renamed from: f, reason: collision with root package name */
    private final int f38608f;

    /* renamed from: g, reason: collision with root package name */
    private final VisualTransformation f38609g;

    /* renamed from: h, reason: collision with root package name */
    private final q6.w f38610h;

    /* renamed from: i, reason: collision with root package name */
    private final String f38611i;

    /* renamed from: j, reason: collision with root package name */
    private final AutofillType f38612j;

    /* renamed from: k, reason: collision with root package name */
    private final q6.w f38613k;

    /* renamed from: l, reason: collision with root package name */
    private final q6.w f38614l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3813L f38615m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3813L f38616n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3813L f38617o;

    /* renamed from: p, reason: collision with root package name */
    private final q6.w f38618p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3813L f38619q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3813L f38620r;

    /* renamed from: s, reason: collision with root package name */
    private final q6.w f38621s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3813L f38622t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3813L f38623u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3813L f38624v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3813L f38625w;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {
        a() {
            super(1);
        }

        public final C a(boolean z8) {
            C error = ((y0) s0.this.f38618p.getValue()).getError();
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

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f38627a = new b();

        b() {
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
    static final class c extends AbstractC3293z implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(y0 it) {
            boolean z8;
            AbstractC3292y.i(it, "it");
            if (!it.a() && (it.a() || !s0.this.u() || !it.b())) {
                z8 = false;
            } else {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3292y.i(it, "it");
            return s0.this.z().h(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f38630a = new e();

        e() {
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

    public s0(v0 textFieldConfig, boolean z8, String str) {
        AutofillType autofillType;
        AbstractC3292y.i(textFieldConfig, "textFieldConfig");
        this.f38603a = textFieldConfig;
        this.f38604b = z8;
        this.f38605c = str;
        this.f38606d = textFieldConfig.c();
        this.f38607e = textFieldConfig.g();
        this.f38608f = textFieldConfig.i();
        VisualTransformation d8 = textFieldConfig.d();
        this.f38609g = d8 == null ? VisualTransformation.Companion.getNone() : d8;
        this.f38610h = AbstractC3815N.a(textFieldConfig.b());
        this.f38611i = textFieldConfig.k();
        if (textFieldConfig instanceof C3922v) {
            autofillType = AutofillType.CreditCardExpirationDate;
        } else if (textFieldConfig instanceof Y) {
            autofillType = AutofillType.PostalCode;
        } else if (textFieldConfig instanceof C3890A) {
            autofillType = AutofillType.EmailAddress;
        } else {
            autofillType = textFieldConfig instanceof J ? AutofillType.PersonFullName : null;
        }
        this.f38612j = autofillType;
        this.f38613k = AbstractC3815N.a(textFieldConfig.e());
        q6.w a9 = AbstractC3815N.a("");
        this.f38614l = a9;
        this.f38615m = AbstractC3823h.b(a9);
        this.f38616n = A4.g.m(a9, new d());
        this.f38617o = AbstractC3823h.b(a9);
        q6.w a10 = AbstractC3815N.a(z0.a.f38774c);
        this.f38618p = a10;
        this.f38619q = AbstractC3823h.b(a10);
        this.f38620r = textFieldConfig.a();
        q6.w a11 = AbstractC3815N.a(Boolean.FALSE);
        this.f38621s = a11;
        this.f38622t = A4.g.d(a10, a11, e.f38630a);
        this.f38623u = A4.g.m(m(), new a());
        this.f38624v = A4.g.m(a10, new c());
        this.f38625w = A4.g.d(t(), y(), b.f38627a);
        String r8 = r();
        if (r8 != null) {
            q(r8);
        }
    }

    @Override // r4.w0
    public InterfaceC3813L a() {
        return this.f38620r;
    }

    @Override // r4.w0
    public InterfaceC3813L c() {
        return this.f38606d;
    }

    @Override // r4.w0
    public VisualTransformation d() {
        return this.f38609g;
    }

    @Override // r4.w0, r4.j0
    public void f(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, Composer composer, int i10) {
        w0.a.a(this, z8, k0Var, modifier, set, g8, i8, i9, composer, i10);
    }

    @Override // r4.w0
    public int g() {
        return this.f38607e;
    }

    @Override // r4.w0
    public InterfaceC3813L getContentDescription() {
        return this.f38617o;
    }

    @Override // r4.m0
    public InterfaceC3813L getError() {
        return this.f38623u;
    }

    @Override // r4.w0
    public void h(boolean z8) {
        this.f38621s.setValue(Boolean.valueOf(z8));
    }

    @Override // r4.w0
    public int i() {
        return this.f38608f;
    }

    @Override // r4.w0
    public InterfaceC3813L j() {
        return this.f38615m;
    }

    @Override // r4.w0
    public y0 k(String displayFormatted) {
        AbstractC3292y.i(displayFormatted, "displayFormatted");
        y0 y0Var = (y0) this.f38618p.getValue();
        this.f38614l.setValue(this.f38603a.j(displayFormatted));
        this.f38618p.setValue(this.f38603a.l((String) this.f38614l.getValue()));
        if (!AbstractC3292y.d(this.f38618p.getValue(), y0Var)) {
            return (y0) this.f38618p.getValue();
        }
        return null;
    }

    @Override // r4.H
    public InterfaceC3813L l() {
        return this.f38625w;
    }

    @Override // r4.w0
    public InterfaceC3813L m() {
        return this.f38622t;
    }

    @Override // r4.w0
    public InterfaceC3813L n() {
        return this.f38619q;
    }

    @Override // r4.w0
    public AutofillType o() {
        return this.f38612j;
    }

    @Override // r4.w0
    public boolean p() {
        return w0.a.b(this);
    }

    @Override // r4.H
    public void q(String rawValue) {
        AbstractC3292y.i(rawValue, "rawValue");
        k(this.f38603a.f(rawValue));
    }

    @Override // r4.w0
    public String r() {
        return this.f38605c;
    }

    @Override // r4.w0
    public void s(x0.a.C0871a c0871a) {
        w0.a.d(this, c0871a);
    }

    @Override // r4.H
    public InterfaceC3813L t() {
        return this.f38624v;
    }

    @Override // r4.w0
    public boolean u() {
        return this.f38604b;
    }

    @Override // r4.w0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public q6.w b() {
        return this.f38610h;
    }

    @Override // r4.w0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public q6.w e() {
        return this.f38613k;
    }

    public InterfaceC3813L y() {
        return this.f38616n;
    }

    public final v0 z() {
        return this.f38603a;
    }

    public /* synthetic */ s0(v0 v0Var, boolean z8, String str, int i8, AbstractC3284p abstractC3284p) {
        this(v0Var, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? null : str);
    }
}
