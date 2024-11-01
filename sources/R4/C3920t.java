package r4;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import z2.C4266a;

/* renamed from: r4.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3920t implements InterfaceC3924x {

    /* renamed from: k, reason: collision with root package name */
    public static final c f38631k = new c(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f38632l = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Set f38633a;

    /* renamed from: b, reason: collision with root package name */
    private final Locale f38634b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38635c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38636d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f38637e;

    /* renamed from: f, reason: collision with root package name */
    private final String f38638f;

    /* renamed from: g, reason: collision with root package name */
    private final int f38639g;

    /* renamed from: h, reason: collision with root package name */
    private final List f38640h;

    /* renamed from: i, reason: collision with root package name */
    private final List f38641i;

    /* renamed from: j, reason: collision with root package name */
    private final List f38642j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.t$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38643a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4266a country) {
            AbstractC3292y.i(country, "country");
            return country.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.t$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f38644a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4266a country) {
            AbstractC3292y.i(country, "country");
            return C3920t.f38631k.a(country.b().b()) + " " + country.f();
        }
    }

    /* renamed from: r4.t$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public final String a(String countryCode) {
            AbstractC3292y.i(countryCode, "countryCode");
            if (countryCode.length() != 2) {
                return "🌐";
            }
            int codePointAt = Character.codePointAt(countryCode, 0) - (-127397);
            int codePointAt2 = Character.codePointAt(countryCode, 1) - (-127397);
            char[] chars = Character.toChars(codePointAt);
            AbstractC3292y.h(chars, "toChars(...)");
            char[] chars2 = Character.toChars(codePointAt2);
            AbstractC3292y.h(chars2, "toChars(...)");
            return new String(AbstractC1428l.y(chars, chars2));
        }

        public /* synthetic */ c(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C3920t(Set onlyShowCountryCodes, Locale locale, boolean z8, boolean z9, Function1 collapsedLabelMapper, Function1 expandedLabelMapper) {
        AbstractC3292y.i(onlyShowCountryCodes, "onlyShowCountryCodes");
        AbstractC3292y.i(locale, "locale");
        AbstractC3292y.i(collapsedLabelMapper, "collapsedLabelMapper");
        AbstractC3292y.i(expandedLabelMapper, "expandedLabelMapper");
        this.f38633a = onlyShowCountryCodes;
        this.f38634b = locale;
        this.f38635c = z8;
        this.f38636d = z9;
        this.f38637e = collapsedLabelMapper;
        this.f38638f = "country";
        this.f38639g = v2.e.f40440c;
        List f8 = z2.d.f41472a.f(locale);
        ArrayList arrayList = new ArrayList();
        for (Object obj : f8) {
            C4266a c4266a = (C4266a) obj;
            if (this.f38633a.isEmpty() || this.f38633a.contains(c4266a.b().b())) {
                arrayList.add(obj);
            }
        }
        this.f38640h = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(AbstractC1435t.x(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C4266a) it.next()).b().b());
        }
        this.f38641i = arrayList3;
        List list = this.f38640h;
        ArrayList arrayList4 = new ArrayList(AbstractC1435t.x(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(expandedLabelMapper.invoke(it2.next()));
        }
        this.f38642j = arrayList4;
    }

    public final List a() {
        return this.f38640h;
    }

    @Override // r4.InterfaceC3924x
    public int b() {
        return this.f38639g;
    }

    @Override // r4.InterfaceC3924x
    public String f(String rawValue) {
        AbstractC3292y.i(rawValue, "rawValue");
        z2.d dVar = z2.d.f41472a;
        z2.b a9 = z2.b.Companion.a(rawValue);
        Locale locale = Locale.getDefault();
        AbstractC3292y.h(locale, "getDefault(...)");
        C4266a d8 = dVar.d(a9, locale);
        if (d8 != null) {
            Integer valueOf = Integer.valueOf(this.f38640h.indexOf(d8));
            String str = null;
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                str = (String) i().get(valueOf.intValue());
            }
            if (str != null) {
                return str;
            }
        }
        String str2 = (String) AbstractC1435t.o0(i());
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // r4.InterfaceC3924x
    public String g(int i8) {
        String str;
        C4266a c4266a = (C4266a) AbstractC1435t.p0(this.f38640h, i8);
        if (c4266a == null || (str = (String) this.f38637e.invoke(c4266a)) == null) {
            return "";
        }
        return str;
    }

    @Override // r4.InterfaceC3924x
    public boolean h() {
        return this.f38636d;
    }

    @Override // r4.InterfaceC3924x
    public List i() {
        return this.f38642j;
    }

    @Override // r4.InterfaceC3924x
    public List j() {
        return this.f38641i;
    }

    @Override // r4.InterfaceC3924x
    public boolean k() {
        return this.f38635c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C3920t(java.util.Set r5, java.util.Locale r6, boolean r7, boolean r8, kotlin.jvm.functions.Function1 r9, kotlin.jvm.functions.Function1 r10, int r11, kotlin.jvm.internal.AbstractC3284p r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L8
            java.util.Set r5 = R5.a0.f()
        L8:
            r12 = r11 & 2
            if (r12 == 0) goto L15
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r12 = "getDefault(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r6, r12)
        L15:
            r12 = r6
            r6 = r11 & 4
            r0 = 0
            if (r6 == 0) goto L1d
            r1 = 0
            goto L1e
        L1d:
            r1 = r7
        L1e:
            r6 = r11 & 8
            if (r6 == 0) goto L23
            goto L24
        L23:
            r0 = r8
        L24:
            r6 = r11 & 16
            if (r6 == 0) goto L2a
            r4.t$a r9 = r4.C3920t.a.f38643a
        L2a:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L31
            r4.t$b r10 = r4.C3920t.b.f38644a
        L31:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r0
            r11 = r2
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.C3920t.<init>(java.util.Set, java.util.Locale, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.p):void");
    }
}
