package r4;

import R5.AbstractC1435t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import r4.InterfaceC3924x;

/* renamed from: r4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3911j implements InterfaceC3924x {

    /* renamed from: a, reason: collision with root package name */
    private final List f38478a;

    /* renamed from: b, reason: collision with root package name */
    private final List f38479b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38480c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38481d;

    /* renamed from: e, reason: collision with root package name */
    private final int f38482e;

    /* renamed from: f, reason: collision with root package name */
    private final List f38483f;

    /* renamed from: g, reason: collision with root package name */
    private final List f38484g;

    /* renamed from: r4.j$a */
    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f38485a;

        /* renamed from: b, reason: collision with root package name */
        private final List f38486b;

        public /* synthetic */ a(int i8, List list, AbstractC3284p abstractC3284p) {
            this(i8, list);
        }

        public abstract List a();

        public abstract int b();

        private a(int i8, List list) {
            this.f38485a = i8;
            this.f38486b = list;
        }

        /* renamed from: r4.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0869a extends a {

            /* renamed from: c, reason: collision with root package name */
            private final int f38487c;

            /* renamed from: d, reason: collision with root package name */
            private final List f38488d;

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                */
            public /* synthetic */ C0869a(int r17, java.util.List r18, int r19, kotlin.jvm.internal.AbstractC3284p r20) {
                /*
                    r16 = this;
                    r0 = 2
                    r1 = 1
                    r2 = r19 & 1
                    if (r2 == 0) goto L9
                    int r2 = v2.e.f40445h
                    goto Lb
                L9:
                    r2 = r17
                Lb:
                    r3 = r19 & 2
                    if (r3 == 0) goto Lbb
                    Q5.r r3 = new Q5.r
                    java.lang.String r4 = "AB"
                    java.lang.String r5 = "Alberta"
                    r3.<init>(r4, r5)
                    Q5.r r4 = new Q5.r
                    java.lang.String r5 = "BC"
                    java.lang.String r6 = "British Columbia"
                    r4.<init>(r5, r6)
                    Q5.r r5 = new Q5.r
                    java.lang.String r6 = "MB"
                    java.lang.String r7 = "Manitoba"
                    r5.<init>(r6, r7)
                    Q5.r r6 = new Q5.r
                    java.lang.String r7 = "NB"
                    java.lang.String r8 = "New Brunswick"
                    r6.<init>(r7, r8)
                    Q5.r r7 = new Q5.r
                    java.lang.String r8 = "NL"
                    java.lang.String r9 = "Newfoundland and Labrador"
                    r7.<init>(r8, r9)
                    Q5.r r8 = new Q5.r
                    java.lang.String r9 = "NT"
                    java.lang.String r10 = "Northwest Territories"
                    r8.<init>(r9, r10)
                    Q5.r r9 = new Q5.r
                    java.lang.String r10 = "NS"
                    java.lang.String r11 = "Nova Scotia"
                    r9.<init>(r10, r11)
                    Q5.r r10 = new Q5.r
                    java.lang.String r11 = "NU"
                    java.lang.String r12 = "Nunavut"
                    r10.<init>(r11, r12)
                    Q5.r r11 = new Q5.r
                    java.lang.String r12 = "ON"
                    java.lang.String r13 = "Ontario"
                    r11.<init>(r12, r13)
                    Q5.r r12 = new Q5.r
                    java.lang.String r13 = "PE"
                    java.lang.String r14 = "Prince Edward Island"
                    r12.<init>(r13, r14)
                    Q5.r r13 = new Q5.r
                    java.lang.String r14 = "QC"
                    java.lang.String r15 = "Quebec"
                    r13.<init>(r14, r15)
                    Q5.r r14 = new Q5.r
                    java.lang.String r15 = "SK"
                    java.lang.String r0 = "Saskatchewan"
                    r14.<init>(r15, r0)
                    Q5.r r0 = new Q5.r
                    java.lang.String r15 = "YT"
                    java.lang.String r1 = "Yukon"
                    r0.<init>(r15, r1)
                    r1 = 13
                    Q5.r[] r1 = new Q5.r[r1]
                    r15 = 0
                    r1[r15] = r3
                    r3 = 1
                    r1[r3] = r4
                    r3 = 2
                    r1[r3] = r5
                    r3 = 3
                    r1[r3] = r6
                    r3 = 4
                    r1[r3] = r7
                    r3 = 5
                    r1[r3] = r8
                    r3 = 6
                    r1[r3] = r9
                    r3 = 7
                    r1[r3] = r10
                    r3 = 8
                    r1[r3] = r11
                    r3 = 9
                    r1[r3] = r12
                    r3 = 10
                    r1[r3] = r13
                    r3 = 11
                    r1[r3] = r14
                    r3 = 12
                    r1[r3] = r0
                    java.util.List r0 = R5.AbstractC1435t.p(r1)
                    r1 = r16
                    goto Lbf
                Lbb:
                    r1 = r16
                    r0 = r18
                Lbf:
                    r1.<init>(r2, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: r4.C3911j.a.C0869a.<init>(int, java.util.List, int, kotlin.jvm.internal.p):void");
            }

            @Override // r4.C3911j.a
            public List a() {
                return this.f38488d;
            }

            @Override // r4.C3911j.a
            public int b() {
                return this.f38487c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0869a)) {
                    return false;
                }
                C0869a c0869a = (C0869a) obj;
                if (this.f38487c == c0869a.f38487c && AbstractC3292y.d(this.f38488d, c0869a.f38488d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.f38487c * 31) + this.f38488d.hashCode();
            }

            public String toString() {
                return "Canada(label=" + this.f38487c + ", administrativeAreas=" + this.f38488d + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0869a(int i8, List administrativeAreas) {
                super(i8, administrativeAreas, null);
                AbstractC3292y.i(administrativeAreas, "administrativeAreas");
                this.f38487c = i8;
                this.f38488d = administrativeAreas;
            }
        }

        /* renamed from: r4.j$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: c, reason: collision with root package name */
            private final int f38489c;

            /* renamed from: d, reason: collision with root package name */
            private final List f38490d;

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                */
            public /* synthetic */ b(int r63, java.util.List r64, int r65, kotlin.jvm.internal.AbstractC3284p r66) {
                /*
                    Method dump skipped, instructions count: 932
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: r4.C3911j.a.b.<init>(int, java.util.List, int, kotlin.jvm.internal.p):void");
            }

            @Override // r4.C3911j.a
            public List a() {
                return this.f38490d;
            }

            @Override // r4.C3911j.a
            public int b() {
                return this.f38489c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (this.f38489c == bVar.f38489c && AbstractC3292y.d(this.f38490d, bVar.f38490d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.f38489c * 31) + this.f38490d.hashCode();
            }

            public String toString() {
                return "US(label=" + this.f38489c + ", administrativeAreas=" + this.f38490d + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i8, List administrativeAreas) {
                super(i8, administrativeAreas, null);
                AbstractC3292y.i(administrativeAreas, "administrativeAreas");
                this.f38489c = i8;
                this.f38490d = administrativeAreas;
            }
        }
    }

    public C3911j(a country) {
        AbstractC3292y.i(country, "country");
        List a9 = country.a();
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(a9, 10));
        Iterator it = a9.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Q5.r) it.next()).c());
        }
        this.f38478a = arrayList;
        List a10 = country.a();
        ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(a10, 10));
        Iterator it2 = a10.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) ((Q5.r) it2.next()).d());
        }
        this.f38479b = arrayList2;
        this.f38481d = "administrativeArea";
        this.f38482e = country.b();
        this.f38483f = this.f38478a;
        this.f38484g = arrayList2;
    }

    @Override // r4.InterfaceC3924x
    public int b() {
        return this.f38482e;
    }

    @Override // r4.InterfaceC3924x
    public String f(String rawValue) {
        AbstractC3292y.i(rawValue, "rawValue");
        if (this.f38478a.contains(rawValue)) {
            return (String) this.f38479b.get(this.f38478a.indexOf(rawValue));
        }
        return (String) this.f38479b.get(0);
    }

    @Override // r4.InterfaceC3924x
    public String g(int i8) {
        return (String) this.f38479b.get(i8);
    }

    @Override // r4.InterfaceC3924x
    public boolean h() {
        return InterfaceC3924x.a.a(this);
    }

    @Override // r4.InterfaceC3924x
    public List i() {
        return this.f38484g;
    }

    @Override // r4.InterfaceC3924x
    public List j() {
        return this.f38483f;
    }

    @Override // r4.InterfaceC3924x
    public boolean k() {
        return this.f38480c;
    }
}
