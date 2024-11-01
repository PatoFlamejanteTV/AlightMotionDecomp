package r4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import o4.AbstractC3533g;
import q6.AbstractC3815N;
import r4.v0;

/* loaded from: classes4.dex */
public final class Y implements v0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f38218a;

    /* renamed from: b, reason: collision with root package name */
    private final q6.w f38219b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38220c;

    /* renamed from: d, reason: collision with root package name */
    private final a f38221d;

    /* renamed from: e, reason: collision with root package name */
    private final int f38222e;

    /* renamed from: f, reason: collision with root package name */
    private final int f38223f;

    /* renamed from: g, reason: collision with root package name */
    private final String f38224g;

    /* renamed from: h, reason: collision with root package name */
    private final VisualTransformation f38225h;

    /* renamed from: i, reason: collision with root package name */
    private final q6.w f38226i;

    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: d, reason: collision with root package name */
        public static final b f38227d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f38228e = 8;

        /* renamed from: a, reason: collision with root package name */
        private final int f38229a;

        /* renamed from: b, reason: collision with root package name */
        private final int f38230b;

        /* renamed from: c, reason: collision with root package name */
        private final l6.j f38231c;

        /* renamed from: r4.Y$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0847a extends a {

            /* renamed from: f, reason: collision with root package name */
            public static final C0847a f38232f = new C0847a();

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private C0847a() {
                /*
                    r3 = this;
                    l6.j r0 = new l6.j
                    java.lang.String r1 = "[a-zA-Z]\\d[a-zA-Z][\\s-]?\\d[a-zA-Z]\\d"
                    r0.<init>(r1)
                    r1 = 0
                    r2 = 6
                    r3.<init>(r2, r2, r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: r4.Y.a.C0847a.<init>():void");
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final a a(String country) {
                AbstractC3292y.i(country, "country");
                int hashCode = country.hashCode();
                if (hashCode != 2142) {
                    if (hashCode != 2267) {
                        if (hashCode == 2718 && country.equals("US")) {
                            return e.f38235f;
                        }
                    } else if (country.equals("GB")) {
                        return c.f38233f;
                    }
                } else if (country.equals("CA")) {
                    return C0847a.f38232f;
                }
                return d.f38234f;
            }

            public /* synthetic */ b(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {

            /* renamed from: f, reason: collision with root package name */
            public static final c f38233f = new c();

            private c() {
                super(5, 7, new l6.j("^[A-Za-z][A-Za-z0-9]*(?: [A-Za-z0-9]*)?$"), null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a {

            /* renamed from: f, reason: collision with root package name */
            public static final d f38234f = new d();

            private d() {
                super(1, Integer.MAX_VALUE, new l6.j(".*"), null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends a {

            /* renamed from: f, reason: collision with root package name */
            public static final e f38235f = new e();

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private e() {
                /*
                    r3 = this;
                    l6.j r0 = new l6.j
                    java.lang.String r1 = "\\d+"
                    r0.<init>(r1)
                    r1 = 0
                    r2 = 5
                    r3.<init>(r2, r2, r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: r4.Y.a.e.<init>():void");
            }
        }

        public /* synthetic */ a(int i8, int i9, l6.j jVar, AbstractC3284p abstractC3284p) {
            this(i8, i9, jVar);
        }

        public final int a() {
            return this.f38230b;
        }

        public final int b() {
            return this.f38229a;
        }

        public final l6.j c() {
            return this.f38231c;
        }

        private a(int i8, int i9, l6.j jVar) {
            this.f38229a = i8;
            this.f38230b = i9;
            this.f38231c = jVar;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements y0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38237b;

        b(String str) {
            this.f38237b = str;
        }

        @Override // r4.y0
        public boolean a() {
            if (Y.this.f38221d instanceof a.d) {
                if (l6.n.T(this.f38237b)) {
                    return false;
                }
            } else {
                int b9 = Y.this.f38221d.b();
                int a9 = Y.this.f38221d.a();
                int length = this.f38237b.length();
                if (b9 > length || length > a9) {
                    return false;
                }
                if (!Y.this.f38221d.c().e(this.f38237b)) {
                    return false;
                }
            }
            return true;
        }

        @Override // r4.y0
        public boolean b() {
            return l6.n.T(this.f38237b);
        }

        @Override // r4.y0
        public boolean c(boolean z8) {
            if (getError() != null && !z8) {
                return true;
            }
            return false;
        }

        @Override // r4.y0
        public boolean d() {
            if (this.f38237b.length() >= Y.this.f38221d.a()) {
                return true;
            }
            return false;
        }

        @Override // r4.y0
        public C getError() {
            C c8;
            if ((!l6.n.T(this.f38237b)) && !a() && AbstractC3292y.d(Y.this.f38220c, "US")) {
                c8 = new C(AbstractC3533g.f35978v, null, 2, null);
            } else {
                if (!(!l6.n.T(this.f38237b)) || a()) {
                    return null;
                }
                c8 = new C(AbstractC3533g.f35979w, null, 2, null);
            }
            return c8;
        }
    }

    public Y(int i8, q6.w trailingIcon, String country) {
        int m4872getCharactersIUNYP9k;
        int m4899getTextPjHm6EE;
        AbstractC3292y.i(trailingIcon, "trailingIcon");
        AbstractC3292y.i(country, "country");
        this.f38218a = i8;
        this.f38219b = trailingIcon;
        this.f38220c = country;
        a a9 = a.f38227d.a(country);
        this.f38221d = a9;
        a.e eVar = a.e.f38235f;
        if (AbstractC3292y.d(a9, eVar)) {
            m4872getCharactersIUNYP9k = KeyboardCapitalization.Companion.m4873getNoneIUNYP9k();
        } else {
            if (!(AbstractC3292y.d(a9, a.C0847a.f38232f) ? true : AbstractC3292y.d(a9, a.c.f38233f) ? true : AbstractC3292y.d(a9, a.d.f38234f))) {
                throw new Q5.p();
            }
            m4872getCharactersIUNYP9k = KeyboardCapitalization.Companion.m4872getCharactersIUNYP9k();
        }
        this.f38222e = m4872getCharactersIUNYP9k;
        if (AbstractC3292y.d(a9, eVar)) {
            m4899getTextPjHm6EE = KeyboardType.Companion.m4896getNumberPasswordPjHm6EE();
        } else {
            if (!(AbstractC3292y.d(a9, a.C0847a.f38232f) ? true : AbstractC3292y.d(a9, a.c.f38233f) ? true : AbstractC3292y.d(a9, a.d.f38234f))) {
                throw new Q5.p();
            }
            m4899getTextPjHm6EE = KeyboardType.Companion.m4899getTextPjHm6EE();
        }
        this.f38223f = m4899getTextPjHm6EE;
        this.f38224g = "postal_code_text";
        this.f38225h = new Z(a9);
        this.f38226i = AbstractC3815N.a(Boolean.FALSE);
    }

    @Override // r4.v0
    public Integer b() {
        return Integer.valueOf(this.f38218a);
    }

    @Override // r4.v0
    public VisualTransformation d() {
        return this.f38225h;
    }

    @Override // r4.v0
    public String e() {
        return v0.a.a(this);
    }

    @Override // r4.v0
    public String f(String rawValue) {
        AbstractC3292y.i(rawValue, "rawValue");
        return new l6.j("\\s+").f(rawValue, "");
    }

    @Override // r4.v0
    public int g() {
        return this.f38222e;
    }

    @Override // r4.v0
    public String h(String displayName) {
        AbstractC3292y.i(displayName, "displayName");
        return displayName;
    }

    @Override // r4.v0
    public int i() {
        return this.f38223f;
    }

    @Override // r4.v0
    public String j(String userTyped) {
        boolean d8;
        AbstractC3292y.i(userTyped, "userTyped");
        a aVar = this.f38221d;
        int i8 = 0;
        if (AbstractC3292y.d(aVar, a.e.f38235f)) {
            StringBuilder sb = new StringBuilder();
            int length = userTyped.length();
            while (i8 < length) {
                char charAt = userTyped.charAt(i8);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
                i8++;
            }
            userTyped = sb.toString();
            AbstractC3292y.h(userTyped, "toString(...)");
        } else {
            if (AbstractC3292y.d(aVar, a.C0847a.f38232f)) {
                d8 = true;
            } else {
                d8 = AbstractC3292y.d(aVar, a.c.f38233f);
            }
            if (d8) {
                StringBuilder sb2 = new StringBuilder();
                int length2 = userTyped.length();
                while (i8 < length2) {
                    char charAt2 = userTyped.charAt(i8);
                    if (Character.isLetterOrDigit(charAt2)) {
                        sb2.append(charAt2);
                    }
                    i8++;
                }
                String sb3 = sb2.toString();
                AbstractC3292y.h(sb3, "toString(...)");
                userTyped = sb3.toUpperCase(Locale.ROOT);
                AbstractC3292y.h(userTyped, "toUpperCase(...)");
            } else if (!AbstractC3292y.d(aVar, a.d.f38234f)) {
                throw new Q5.p();
            }
        }
        return l6.n.U0(userTyped, this.f38221d.a());
    }

    @Override // r4.v0
    public String k() {
        return this.f38224g;
    }

    @Override // r4.v0
    public y0 l(String input) {
        AbstractC3292y.i(input, "input");
        return new b(input);
    }

    @Override // r4.v0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public q6.w a() {
        return this.f38226i;
    }

    @Override // r4.v0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public q6.w c() {
        return this.f38219b;
    }

    public /* synthetic */ Y(int i8, q6.w wVar, String str, int i9, AbstractC3284p abstractC3284p) {
        this(i8, (i9 & 2) != 0 ? AbstractC3815N.a(null) : wVar, str);
    }
}
