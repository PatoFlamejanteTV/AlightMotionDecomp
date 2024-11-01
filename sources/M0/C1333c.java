package M0;

import M0.F;
import java.util.List;

/* renamed from: M0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1333c extends F.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f5691a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5692b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5693c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5694d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5695e;

    /* renamed from: f, reason: collision with root package name */
    private final long f5696f;

    /* renamed from: g, reason: collision with root package name */
    private final long f5697g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5698h;

    /* renamed from: i, reason: collision with root package name */
    private final List f5699i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends F.a.b {

        /* renamed from: a, reason: collision with root package name */
        private int f5700a;

        /* renamed from: b, reason: collision with root package name */
        private String f5701b;

        /* renamed from: c, reason: collision with root package name */
        private int f5702c;

        /* renamed from: d, reason: collision with root package name */
        private int f5703d;

        /* renamed from: e, reason: collision with root package name */
        private long f5704e;

        /* renamed from: f, reason: collision with root package name */
        private long f5705f;

        /* renamed from: g, reason: collision with root package name */
        private long f5706g;

        /* renamed from: h, reason: collision with root package name */
        private String f5707h;

        /* renamed from: i, reason: collision with root package name */
        private List f5708i;

        /* renamed from: j, reason: collision with root package name */
        private byte f5709j;

        @Override // M0.F.a.b
        public F.a a() {
            String str;
            if (this.f5709j == 63 && (str = this.f5701b) != null) {
                return new C1333c(this.f5700a, str, this.f5702c, this.f5703d, this.f5704e, this.f5705f, this.f5706g, this.f5707h, this.f5708i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f5709j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f5701b == null) {
                sb.append(" processName");
            }
            if ((this.f5709j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.f5709j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.f5709j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.f5709j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.f5709j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.a.b
        public F.a.b b(List list) {
            this.f5708i = list;
            return this;
        }

        @Override // M0.F.a.b
        public F.a.b c(int i8) {
            this.f5703d = i8;
            this.f5709j = (byte) (this.f5709j | 4);
            return this;
        }

        @Override // M0.F.a.b
        public F.a.b d(int i8) {
            this.f5700a = i8;
            this.f5709j = (byte) (this.f5709j | 1);
            return this;
        }

        @Override // M0.F.a.b
        public F.a.b e(String str) {
            if (str != null) {
                this.f5701b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // M0.F.a.b
        public F.a.b f(long j8) {
            this.f5704e = j8;
            this.f5709j = (byte) (this.f5709j | 8);
            return this;
        }

        @Override // M0.F.a.b
        public F.a.b g(int i8) {
            this.f5702c = i8;
            this.f5709j = (byte) (this.f5709j | 2);
            return this;
        }

        @Override // M0.F.a.b
        public F.a.b h(long j8) {
            this.f5705f = j8;
            this.f5709j = (byte) (this.f5709j | 16);
            return this;
        }

        @Override // M0.F.a.b
        public F.a.b i(long j8) {
            this.f5706g = j8;
            this.f5709j = (byte) (this.f5709j | 32);
            return this;
        }

        @Override // M0.F.a.b
        public F.a.b j(String str) {
            this.f5707h = str;
            return this;
        }
    }

    @Override // M0.F.a
    public List b() {
        return this.f5699i;
    }

    @Override // M0.F.a
    public int c() {
        return this.f5694d;
    }

    @Override // M0.F.a
    public int d() {
        return this.f5691a;
    }

    @Override // M0.F.a
    public String e() {
        return this.f5692b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a)) {
            return false;
        }
        F.a aVar = (F.a) obj;
        if (this.f5691a == aVar.d() && this.f5692b.equals(aVar.e()) && this.f5693c == aVar.g() && this.f5694d == aVar.c() && this.f5695e == aVar.f() && this.f5696f == aVar.h() && this.f5697g == aVar.i() && ((str = this.f5698h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            List list = this.f5699i;
            if (list == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (list.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // M0.F.a
    public long f() {
        return this.f5695e;
    }

    @Override // M0.F.a
    public int g() {
        return this.f5693c;
    }

    @Override // M0.F.a
    public long h() {
        return this.f5696f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f5691a ^ 1000003) * 1000003) ^ this.f5692b.hashCode()) * 1000003) ^ this.f5693c) * 1000003) ^ this.f5694d) * 1000003;
        long j8 = this.f5695e;
        int i8 = (hashCode2 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f5696f;
        int i9 = (i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f5697g;
        int i10 = (i9 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str = this.f5698h;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        List list = this.f5699i;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 ^ i11;
    }

    @Override // M0.F.a
    public long i() {
        return this.f5697g;
    }

    @Override // M0.F.a
    public String j() {
        return this.f5698h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f5691a + ", processName=" + this.f5692b + ", reasonCode=" + this.f5693c + ", importance=" + this.f5694d + ", pss=" + this.f5695e + ", rss=" + this.f5696f + ", timestamp=" + this.f5697g + ", traceFile=" + this.f5698h + ", buildIdMappingForArch=" + this.f5699i + "}";
    }

    private C1333c(int i8, String str, int i9, int i10, long j8, long j9, long j10, String str2, List list) {
        this.f5691a = i8;
        this.f5692b = str;
        this.f5693c = i9;
        this.f5694d = i10;
        this.f5695e = j8;
        this.f5696f = j9;
        this.f5697g = j10;
        this.f5698h = str2;
        this.f5699i = list;
    }
}
