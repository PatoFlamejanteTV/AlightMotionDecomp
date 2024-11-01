package M0;

import M0.F;
import java.util.List;

/* loaded from: classes3.dex */
final class h extends F.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f5728a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5729b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5730c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5731d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f5732e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5733f;

    /* renamed from: g, reason: collision with root package name */
    private final F.e.a f5734g;

    /* renamed from: h, reason: collision with root package name */
    private final F.e.f f5735h;

    /* renamed from: i, reason: collision with root package name */
    private final F.e.AbstractC0108e f5736i;

    /* renamed from: j, reason: collision with root package name */
    private final F.e.c f5737j;

    /* renamed from: k, reason: collision with root package name */
    private final List f5738k;

    /* renamed from: l, reason: collision with root package name */
    private final int f5739l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.b {

        /* renamed from: a, reason: collision with root package name */
        private String f5740a;

        /* renamed from: b, reason: collision with root package name */
        private String f5741b;

        /* renamed from: c, reason: collision with root package name */
        private String f5742c;

        /* renamed from: d, reason: collision with root package name */
        private long f5743d;

        /* renamed from: e, reason: collision with root package name */
        private Long f5744e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f5745f;

        /* renamed from: g, reason: collision with root package name */
        private F.e.a f5746g;

        /* renamed from: h, reason: collision with root package name */
        private F.e.f f5747h;

        /* renamed from: i, reason: collision with root package name */
        private F.e.AbstractC0108e f5748i;

        /* renamed from: j, reason: collision with root package name */
        private F.e.c f5749j;

        /* renamed from: k, reason: collision with root package name */
        private List f5750k;

        /* renamed from: l, reason: collision with root package name */
        private int f5751l;

        /* renamed from: m, reason: collision with root package name */
        private byte f5752m;

        @Override // M0.F.e.b
        public F.e a() {
            String str;
            String str2;
            F.e.a aVar;
            if (this.f5752m == 7 && (str = this.f5740a) != null && (str2 = this.f5741b) != null && (aVar = this.f5746g) != null) {
                return new h(str, str2, this.f5742c, this.f5743d, this.f5744e, this.f5745f, aVar, this.f5747h, this.f5748i, this.f5749j, this.f5750k, this.f5751l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5740a == null) {
                sb.append(" generator");
            }
            if (this.f5741b == null) {
                sb.append(" identifier");
            }
            if ((this.f5752m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f5752m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f5746g == null) {
                sb.append(" app");
            }
            if ((this.f5752m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.b
        public F.e.b b(F.e.a aVar) {
            if (aVar != null) {
                this.f5746g = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // M0.F.e.b
        public F.e.b c(String str) {
            this.f5742c = str;
            return this;
        }

        @Override // M0.F.e.b
        public F.e.b d(boolean z8) {
            this.f5745f = z8;
            this.f5752m = (byte) (this.f5752m | 2);
            return this;
        }

        @Override // M0.F.e.b
        public F.e.b e(F.e.c cVar) {
            this.f5749j = cVar;
            return this;
        }

        @Override // M0.F.e.b
        public F.e.b f(Long l8) {
            this.f5744e = l8;
            return this;
        }

        @Override // M0.F.e.b
        public F.e.b g(List list) {
            this.f5750k = list;
            return this;
        }

        @Override // M0.F.e.b
        public F.e.b h(String str) {
            if (str != null) {
                this.f5740a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // M0.F.e.b
        public F.e.b i(int i8) {
            this.f5751l = i8;
            this.f5752m = (byte) (this.f5752m | 4);
            return this;
        }

        @Override // M0.F.e.b
        public F.e.b j(String str) {
            if (str != null) {
                this.f5741b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // M0.F.e.b
        public F.e.b l(F.e.AbstractC0108e abstractC0108e) {
            this.f5748i = abstractC0108e;
            return this;
        }

        @Override // M0.F.e.b
        public F.e.b m(long j8) {
            this.f5743d = j8;
            this.f5752m = (byte) (this.f5752m | 1);
            return this;
        }

        @Override // M0.F.e.b
        public F.e.b n(F.e.f fVar) {
            this.f5747h = fVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(F.e eVar) {
            this.f5740a = eVar.g();
            this.f5741b = eVar.i();
            this.f5742c = eVar.c();
            this.f5743d = eVar.l();
            this.f5744e = eVar.e();
            this.f5745f = eVar.n();
            this.f5746g = eVar.b();
            this.f5747h = eVar.m();
            this.f5748i = eVar.k();
            this.f5749j = eVar.d();
            this.f5750k = eVar.f();
            this.f5751l = eVar.h();
            this.f5752m = (byte) 7;
        }
    }

    @Override // M0.F.e
    public F.e.a b() {
        return this.f5734g;
    }

    @Override // M0.F.e
    public String c() {
        return this.f5730c;
    }

    @Override // M0.F.e
    public F.e.c d() {
        return this.f5737j;
    }

    @Override // M0.F.e
    public Long e() {
        return this.f5732e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l8;
        F.e.f fVar;
        F.e.AbstractC0108e abstractC0108e;
        F.e.c cVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e)) {
            return false;
        }
        F.e eVar = (F.e) obj;
        if (this.f5728a.equals(eVar.g()) && this.f5729b.equals(eVar.i()) && ((str = this.f5730c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f5731d == eVar.l() && ((l8 = this.f5732e) != null ? l8.equals(eVar.e()) : eVar.e() == null) && this.f5733f == eVar.n() && this.f5734g.equals(eVar.b()) && ((fVar = this.f5735h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0108e = this.f5736i) != null ? abstractC0108e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f5737j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.f5738k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.f5739l == eVar.h()) {
            return true;
        }
        return false;
    }

    @Override // M0.F.e
    public List f() {
        return this.f5738k;
    }

    @Override // M0.F.e
    public String g() {
        return this.f5728a;
    }

    @Override // M0.F.e
    public int h() {
        return this.f5739l;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i8;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f5728a.hashCode() ^ 1000003) * 1000003) ^ this.f5729b.hashCode()) * 1000003;
        String str = this.f5730c;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j8 = this.f5731d;
        int i10 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        Long l8 = this.f5732e;
        if (l8 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l8.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        if (this.f5733f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int hashCode7 = (((i11 ^ i8) * 1000003) ^ this.f5734g.hashCode()) * 1000003;
        F.e.f fVar = this.f5735h;
        if (fVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fVar.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode3) * 1000003;
        F.e.AbstractC0108e abstractC0108e = this.f5736i;
        if (abstractC0108e == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = abstractC0108e.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        F.e.c cVar = this.f5737j;
        if (cVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = cVar.hashCode();
        }
        int i14 = (i13 ^ hashCode5) * 1000003;
        List list = this.f5738k;
        if (list != null) {
            i9 = list.hashCode();
        }
        return ((i14 ^ i9) * 1000003) ^ this.f5739l;
    }

    @Override // M0.F.e
    public String i() {
        return this.f5729b;
    }

    @Override // M0.F.e
    public F.e.AbstractC0108e k() {
        return this.f5736i;
    }

    @Override // M0.F.e
    public long l() {
        return this.f5731d;
    }

    @Override // M0.F.e
    public F.e.f m() {
        return this.f5735h;
    }

    @Override // M0.F.e
    public boolean n() {
        return this.f5733f;
    }

    @Override // M0.F.e
    public F.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f5728a + ", identifier=" + this.f5729b + ", appQualitySessionId=" + this.f5730c + ", startedAt=" + this.f5731d + ", endedAt=" + this.f5732e + ", crashed=" + this.f5733f + ", app=" + this.f5734g + ", user=" + this.f5735h + ", os=" + this.f5736i + ", device=" + this.f5737j + ", events=" + this.f5738k + ", generatorType=" + this.f5739l + "}";
    }

    private h(String str, String str2, String str3, long j8, Long l8, boolean z8, F.e.a aVar, F.e.f fVar, F.e.AbstractC0108e abstractC0108e, F.e.c cVar, List list, int i8) {
        this.f5728a = str;
        this.f5729b = str2;
        this.f5730c = str3;
        this.f5731d = j8;
        this.f5732e = l8;
        this.f5733f = z8;
        this.f5734g = aVar;
        this.f5735h = fVar;
        this.f5736i = abstractC0108e;
        this.f5737j = cVar;
        this.f5738k = list;
        this.f5739l = i8;
    }
}
