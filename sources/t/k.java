package t;

import java.util.List;
import t.u;

/* loaded from: classes3.dex */
final class k extends u {

    /* renamed from: a, reason: collision with root package name */
    private final long f39343a;

    /* renamed from: b, reason: collision with root package name */
    private final long f39344b;

    /* renamed from: c, reason: collision with root package name */
    private final o f39345c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f39346d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39347e;

    /* renamed from: f, reason: collision with root package name */
    private final List f39348f;

    /* renamed from: g, reason: collision with root package name */
    private final x f39349g;

    /* loaded from: classes3.dex */
    static final class b extends u.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f39350a;

        /* renamed from: b, reason: collision with root package name */
        private Long f39351b;

        /* renamed from: c, reason: collision with root package name */
        private o f39352c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f39353d;

        /* renamed from: e, reason: collision with root package name */
        private String f39354e;

        /* renamed from: f, reason: collision with root package name */
        private List f39355f;

        /* renamed from: g, reason: collision with root package name */
        private x f39356g;

        @Override // t.u.a
        public u a() {
            String str = "";
            if (this.f39350a == null) {
                str = " requestTimeMs";
            }
            if (this.f39351b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f39350a.longValue(), this.f39351b.longValue(), this.f39352c, this.f39353d, this.f39354e, this.f39355f, this.f39356g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // t.u.a
        public u.a b(o oVar) {
            this.f39352c = oVar;
            return this;
        }

        @Override // t.u.a
        public u.a c(List list) {
            this.f39355f = list;
            return this;
        }

        @Override // t.u.a
        u.a d(Integer num) {
            this.f39353d = num;
            return this;
        }

        @Override // t.u.a
        u.a e(String str) {
            this.f39354e = str;
            return this;
        }

        @Override // t.u.a
        public u.a f(x xVar) {
            this.f39356g = xVar;
            return this;
        }

        @Override // t.u.a
        public u.a g(long j8) {
            this.f39350a = Long.valueOf(j8);
            return this;
        }

        @Override // t.u.a
        public u.a h(long j8) {
            this.f39351b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // t.u
    public o b() {
        return this.f39345c;
    }

    @Override // t.u
    public List c() {
        return this.f39348f;
    }

    @Override // t.u
    public Integer d() {
        return this.f39346d;
    }

    @Override // t.u
    public String e() {
        return this.f39347e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f39343a == uVar.g() && this.f39344b == uVar.h() && ((oVar = this.f39345c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f39346d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f39347e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f39348f) != null ? list.equals(uVar.c()) : uVar.c() == null)) {
            x xVar = this.f39349g;
            if (xVar == null) {
                if (uVar.f() == null) {
                    return true;
                }
            } else if (xVar.equals(uVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // t.u
    public x f() {
        return this.f39349g;
    }

    @Override // t.u
    public long g() {
        return this.f39343a;
    }

    @Override // t.u
    public long h() {
        return this.f39344b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j8 = this.f39343a;
        long j9 = this.f39344b;
        int i8 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        o oVar = this.f39345c;
        int i9 = 0;
        if (oVar == null) {
            hashCode = 0;
        } else {
            hashCode = oVar.hashCode();
        }
        int i10 = (i8 ^ hashCode) * 1000003;
        Integer num = this.f39346d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str = this.f39347e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        List list = this.f39348f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        x xVar = this.f39349g;
        if (xVar != null) {
            i9 = xVar.hashCode();
        }
        return i13 ^ i9;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f39343a + ", requestUptimeMs=" + this.f39344b + ", clientInfo=" + this.f39345c + ", logSource=" + this.f39346d + ", logSourceName=" + this.f39347e + ", logEvents=" + this.f39348f + ", qosTier=" + this.f39349g + "}";
    }

    private k(long j8, long j9, o oVar, Integer num, String str, List list, x xVar) {
        this.f39343a = j8;
        this.f39344b = j9;
        this.f39345c = oVar;
        this.f39346d = num;
        this.f39347e = str;
        this.f39348f = list;
        this.f39349g = xVar;
    }
}
