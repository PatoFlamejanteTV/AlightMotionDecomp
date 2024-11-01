package j4;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.VisualTransformation;
import c6.InterfaceC2072n;
import g3.EnumC2906e;
import g4.AbstractC2917a;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3394E;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import r4.w0;
import r4.x0;
import w4.C4156a;

/* loaded from: classes4.dex */
public final class Q implements r4.w0, r4.m0 {

    /* renamed from: x, reason: collision with root package name */
    public static final int f33933x = 8;

    /* renamed from: a, reason: collision with root package name */
    private final P f33934a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33935b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33936c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33937d;

    /* renamed from: e, reason: collision with root package name */
    private final int f33938e;

    /* renamed from: f, reason: collision with root package name */
    private final VisualTransformation f33939f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f33940g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f33941h;

    /* renamed from: i, reason: collision with root package name */
    private final String f33942i;

    /* renamed from: j, reason: collision with root package name */
    private final AutofillType f33943j;

    /* renamed from: k, reason: collision with root package name */
    private final q6.w f33944k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3813L f33945l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3813L f33946m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3813L f33947n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3813L f33948o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3813L f33949p;

    /* renamed from: q, reason: collision with root package name */
    private final q6.w f33950q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3813L f33951r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3813L f33952s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3813L f33953t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3813L f33954u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3813L f33955v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3813L f33956w;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {
        a() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r4.y0 invoke(EnumC2906e brand, String fieldValue) {
            AbstractC3292y.i(brand, "brand");
            AbstractC3292y.i(fieldValue, "fieldValue");
            return Q.this.f33934a.c(brand, fieldValue, brand.m());
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33958a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(EnumC2906e cardBrand) {
            int i8;
            AbstractC3292y.i(cardBrand, "cardBrand");
            if (cardBrand == EnumC2906e.f32119q) {
                i8 = AbstractC3394E.f35223b0;
            } else {
                i8 = AbstractC3394E.f35229e0;
            }
            return Integer.valueOf(i8);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f33959a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3292y.i(it, "it");
            return AbstractC2917a.a(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f33960a = new d();

        d() {
            super(2);
        }

        public final r4.C a(boolean z8, r4.y0 fieldState) {
            AbstractC3292y.i(fieldState, "fieldState");
            r4.C error = fieldState.getError();
            if (error == null || !z8) {
                return null;
            }
            return error;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (r4.y0) obj2);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f33961a = new e();

        e() {
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
    static final class f extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f33962a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(r4.y0 it) {
            AbstractC3292y.i(it, "it");
            return Boolean.valueOf(it.a());
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3292y.i(it, "it");
            return Q.this.f33934a.b(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f33964a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x0.c invoke(EnumC2906e it) {
            AbstractC3292y.i(it, "it");
            return new x0.c(it.g(), null, false, null, 10, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f33965a = new i();

        i() {
            super(2);
        }

        public final Boolean a(r4.y0 fieldState, boolean z8) {
            AbstractC3292y.i(fieldState, "fieldState");
            return Boolean.valueOf(fieldState.c(z8));
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((r4.y0) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public Q(P cvcTextFieldConfig, InterfaceC3813L cardBrandFlow, String str, boolean z8) {
        AbstractC3292y.i(cvcTextFieldConfig, "cvcTextFieldConfig");
        AbstractC3292y.i(cardBrandFlow, "cardBrandFlow");
        this.f33934a = cvcTextFieldConfig;
        this.f33935b = str;
        this.f33936c = z8;
        this.f33937d = cvcTextFieldConfig.e();
        this.f33938e = cvcTextFieldConfig.g();
        this.f33939f = cvcTextFieldConfig.h();
        InterfaceC3813L m8 = A4.g.m(cardBrandFlow, b.f33958a);
        this.f33940g = m8;
        this.f33941h = m8;
        this.f33942i = cvcTextFieldConfig.f();
        this.f33943j = AutofillType.CreditCardSecurityCode;
        q6.w a9 = AbstractC3815N.a("");
        this.f33944k = a9;
        this.f33945l = AbstractC3823h.b(a9);
        this.f33946m = A4.g.m(a9, new g());
        this.f33947n = A4.g.m(a9, c.f33959a);
        InterfaceC3813L d8 = A4.g.d(cardBrandFlow, a9, new a());
        this.f33948o = d8;
        this.f33949p = d8;
        Boolean bool = Boolean.FALSE;
        q6.w a10 = AbstractC3815N.a(bool);
        this.f33950q = a10;
        this.f33951r = A4.g.d(d8, a10, i.f33965a);
        this.f33952s = A4.g.d(m(), d8, d.f33960a);
        this.f33953t = A4.g.m(d8, f.f33962a);
        this.f33954u = A4.g.d(t(), w(), e.f33961a);
        this.f33955v = A4.g.m(cardBrandFlow, h.f33964a);
        this.f33956w = A4.g.n(bool);
        String r8 = r();
        q(r8 != null ? r8 : "");
    }

    @Override // r4.w0
    public InterfaceC3813L a() {
        return this.f33956w;
    }

    @Override // r4.w0
    public InterfaceC3813L b() {
        return this.f33941h;
    }

    @Override // r4.w0
    public InterfaceC3813L c() {
        return this.f33955v;
    }

    @Override // r4.w0
    public VisualTransformation d() {
        return this.f33939f;
    }

    @Override // r4.w0
    public InterfaceC3813L e() {
        return w0.a.c(this);
    }

    @Override // r4.w0, r4.j0
    public void f(boolean z8, r4.k0 k0Var, Modifier modifier, Set set, r4.G g8, int i8, int i9, Composer composer, int i10) {
        w0.a.a(this, z8, k0Var, modifier, set, g8, i8, i9, composer, i10);
    }

    @Override // r4.w0
    public int g() {
        return this.f33937d;
    }

    @Override // r4.w0
    public InterfaceC3813L getContentDescription() {
        return this.f33947n;
    }

    @Override // r4.m0
    public InterfaceC3813L getError() {
        return this.f33952s;
    }

    @Override // r4.w0
    public void h(boolean z8) {
        this.f33950q.setValue(Boolean.valueOf(z8));
    }

    @Override // r4.w0
    public int i() {
        return this.f33938e;
    }

    @Override // r4.w0
    public InterfaceC3813L j() {
        return this.f33945l;
    }

    @Override // r4.w0
    public r4.y0 k(String displayFormatted) {
        AbstractC3292y.i(displayFormatted, "displayFormatted");
        this.f33944k.setValue(this.f33934a.d(displayFormatted));
        return null;
    }

    @Override // r4.H
    public InterfaceC3813L l() {
        return this.f33954u;
    }

    @Override // r4.w0
    public InterfaceC3813L m() {
        return this.f33951r;
    }

    @Override // r4.w0
    public InterfaceC3813L n() {
        return this.f33949p;
    }

    @Override // r4.w0
    public AutofillType o() {
        return this.f33943j;
    }

    @Override // r4.w0
    public boolean p() {
        return w0.a.b(this);
    }

    @Override // r4.H
    public void q(String rawValue) {
        AbstractC3292y.i(rawValue, "rawValue");
        k(this.f33934a.a(rawValue));
    }

    @Override // r4.w0
    public String r() {
        return this.f33935b;
    }

    @Override // r4.w0
    public void s(x0.a.C0871a c0871a) {
        w0.a.d(this, c0871a);
    }

    @Override // r4.H
    public InterfaceC3813L t() {
        return this.f33953t;
    }

    @Override // r4.w0
    public boolean u() {
        return this.f33936c;
    }

    public InterfaceC3813L w() {
        return this.f33946m;
    }

    public /* synthetic */ Q(P p8, InterfaceC3813L interfaceC3813L, String str, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? new P() : p8, interfaceC3813L, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? false : z8);
    }
}
