package t;

import java.util.Arrays;
import t.t;

/* loaded from: classes3.dex */
final class j extends t {

    /* renamed from: a, reason: collision with root package name */
    private final long f39325a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f39326b;

    /* renamed from: c, reason: collision with root package name */
    private final p f39327c;

    /* renamed from: d, reason: collision with root package name */
    private final long f39328d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f39329e;

    /* renamed from: f, reason: collision with root package name */
    private final String f39330f;

    /* renamed from: g, reason: collision with root package name */
    private final long f39331g;

    /* renamed from: h, reason: collision with root package name */
    private final w f39332h;

    /* renamed from: i, reason: collision with root package name */
    private final q f39333i;

    /* loaded from: classes3.dex */
    static final class b extends t.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f39334a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f39335b;

        /* renamed from: c, reason: collision with root package name */
        private p f39336c;

        /* renamed from: d, reason: collision with root package name */
        private Long f39337d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f39338e;

        /* renamed from: f, reason: collision with root package name */
        private String f39339f;

        /* renamed from: g, reason: collision with root package name */
        private Long f39340g;

        /* renamed from: h, reason: collision with root package name */
        private w f39341h;

        /* renamed from: i, reason: collision with root package name */
        private q f39342i;

        @Override // t.t.a
        public t a() {
            String str = "";
            if (this.f39334a == null) {
                str = " eventTimeMs";
            }
            if (this.f39337d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f39340g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f39334a.longValue(), this.f39335b, this.f39336c, this.f39337d.longValue(), this.f39338e, this.f39339f, this.f39340g.longValue(), this.f39341h, this.f39342i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // t.t.a
        public t.a b(p pVar) {
            this.f39336c = pVar;
            return this;
        }

        @Override // t.t.a
        public t.a c(Integer num) {
            this.f39335b = num;
            return this;
        }

        @Override // t.t.a
        public t.a d(long j8) {
            this.f39334a = Long.valueOf(j8);
            return this;
        }

        @Override // t.t.a
        public t.a e(long j8) {
            this.f39337d = Long.valueOf(j8);
            return this;
        }

        @Override // t.t.a
        public t.a f(q qVar) {
            this.f39342i = qVar;
            return this;
        }

        @Override // t.t.a
        public t.a g(w wVar) {
            this.f39341h = wVar;
            return this;
        }

        @Override // t.t.a
        t.a h(byte[] bArr) {
            this.f39338e = bArr;
            return this;
        }

        @Override // t.t.a
        t.a i(String str) {
            this.f39339f = str;
            return this;
        }

        @Override // t.t.a
        public t.a j(long j8) {
            this.f39340g = Long.valueOf(j8);
            return this;
        }
    }

    @Override // t.t
    public p b() {
        return this.f39327c;
    }

    @Override // t.t
    public Integer c() {
        return this.f39326b;
    }

    @Override // t.t
    public long d() {
        return this.f39325a;
    }

    @Override // t.t
    public long e() {
        return this.f39328d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        byte[] h8;
        String str;
        w wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f39325a == tVar.d() && ((num = this.f39326b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f39327c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f39328d == tVar.e()) {
            byte[] bArr = this.f39329e;
            if (tVar instanceof j) {
                h8 = ((j) tVar).f39329e;
            } else {
                h8 = tVar.h();
            }
            if (Arrays.equals(bArr, h8) && ((str = this.f39330f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f39331g == tVar.j() && ((wVar = this.f39332h) != null ? wVar.equals(tVar.g()) : tVar.g() == null)) {
                q qVar = this.f39333i;
                if (qVar == null) {
                    if (tVar.f() == null) {
                        return true;
                    }
                } else if (qVar.equals(tVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t.t
    public q f() {
        return this.f39333i;
    }

    @Override // t.t
    public w g() {
        return this.f39332h;
    }

    @Override // t.t
    public byte[] h() {
        return this.f39329e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j8 = this.f39325a;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f39326b;
        int i9 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (i8 ^ hashCode) * 1000003;
        p pVar = this.f39327c;
        if (pVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = pVar.hashCode();
        }
        long j9 = this.f39328d;
        int hashCode5 = (((((i10 ^ hashCode2) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f39329e)) * 1000003;
        String str = this.f39330f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        long j10 = this.f39331g;
        int i11 = (((hashCode5 ^ hashCode3) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        w wVar = this.f39332h;
        if (wVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = wVar.hashCode();
        }
        int i12 = (i11 ^ hashCode4) * 1000003;
        q qVar = this.f39333i;
        if (qVar != null) {
            i9 = qVar.hashCode();
        }
        return i12 ^ i9;
    }

    @Override // t.t
    public String i() {
        return this.f39330f;
    }

    @Override // t.t
    public long j() {
        return this.f39331g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f39325a + ", eventCode=" + this.f39326b + ", complianceData=" + this.f39327c + ", eventUptimeMs=" + this.f39328d + ", sourceExtension=" + Arrays.toString(this.f39329e) + ", sourceExtensionJsonProto3=" + this.f39330f + ", timezoneOffsetSeconds=" + this.f39331g + ", networkConnectionInfo=" + this.f39332h + ", experimentIds=" + this.f39333i + "}";
    }

    private j(long j8, Integer num, p pVar, long j9, byte[] bArr, String str, long j10, w wVar, q qVar) {
        this.f39325a = j8;
        this.f39326b = num;
        this.f39327c = pVar;
        this.f39328d = j9;
        this.f39329e = bArr;
        this.f39330f = str;
        this.f39331g = j10;
        this.f39332h = wVar;
        this.f39333i = qVar;
    }
}
