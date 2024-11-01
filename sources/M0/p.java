package M0;

import M0.F;
import java.util.List;

/* loaded from: classes3.dex */
final class p extends F.e.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5831a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5832b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5833c;

    /* renamed from: d, reason: collision with root package name */
    private final F.e.d.a.b.c f5834d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5835e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.b.c.AbstractC0098a {

        /* renamed from: a, reason: collision with root package name */
        private String f5836a;

        /* renamed from: b, reason: collision with root package name */
        private String f5837b;

        /* renamed from: c, reason: collision with root package name */
        private List f5838c;

        /* renamed from: d, reason: collision with root package name */
        private F.e.d.a.b.c f5839d;

        /* renamed from: e, reason: collision with root package name */
        private int f5840e;

        /* renamed from: f, reason: collision with root package name */
        private byte f5841f;

        @Override // M0.F.e.d.a.b.c.AbstractC0098a
        public F.e.d.a.b.c a() {
            String str;
            List list;
            if (this.f5841f == 1 && (str = this.f5836a) != null && (list = this.f5838c) != null) {
                return new p(str, this.f5837b, list, this.f5839d, this.f5840e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5836a == null) {
                sb.append(" type");
            }
            if (this.f5838c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f5841f) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.d.a.b.c.AbstractC0098a
        public F.e.d.a.b.c.AbstractC0098a b(F.e.d.a.b.c cVar) {
            this.f5839d = cVar;
            return this;
        }

        @Override // M0.F.e.d.a.b.c.AbstractC0098a
        public F.e.d.a.b.c.AbstractC0098a c(List list) {
            if (list != null) {
                this.f5838c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // M0.F.e.d.a.b.c.AbstractC0098a
        public F.e.d.a.b.c.AbstractC0098a d(int i8) {
            this.f5840e = i8;
            this.f5841f = (byte) (this.f5841f | 1);
            return this;
        }

        @Override // M0.F.e.d.a.b.c.AbstractC0098a
        public F.e.d.a.b.c.AbstractC0098a e(String str) {
            this.f5837b = str;
            return this;
        }

        @Override // M0.F.e.d.a.b.c.AbstractC0098a
        public F.e.d.a.b.c.AbstractC0098a f(String str) {
            if (str != null) {
                this.f5836a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    @Override // M0.F.e.d.a.b.c
    public F.e.d.a.b.c b() {
        return this.f5834d;
    }

    @Override // M0.F.e.d.a.b.c
    public List c() {
        return this.f5833c;
    }

    @Override // M0.F.e.d.a.b.c
    public int d() {
        return this.f5835e;
    }

    @Override // M0.F.e.d.a.b.c
    public String e() {
        return this.f5832b;
    }

    public boolean equals(Object obj) {
        String str;
        F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.c)) {
            return false;
        }
        F.e.d.a.b.c cVar2 = (F.e.d.a.b.c) obj;
        if (this.f5831a.equals(cVar2.f()) && ((str = this.f5832b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f5833c.equals(cVar2.c()) && ((cVar = this.f5834d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f5835e == cVar2.d()) {
            return true;
        }
        return false;
    }

    @Override // M0.F.e.d.a.b.c
    public String f() {
        return this.f5831a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f5831a.hashCode() ^ 1000003) * 1000003;
        String str = this.f5832b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f5833c.hashCode()) * 1000003;
        F.e.d.a.b.c cVar = this.f5834d;
        if (cVar != null) {
            i8 = cVar.hashCode();
        }
        return ((hashCode3 ^ i8) * 1000003) ^ this.f5835e;
    }

    public String toString() {
        return "Exception{type=" + this.f5831a + ", reason=" + this.f5832b + ", frames=" + this.f5833c + ", causedBy=" + this.f5834d + ", overflowCount=" + this.f5835e + "}";
    }

    private p(String str, String str2, List list, F.e.d.a.b.c cVar, int i8) {
        this.f5831a = str;
        this.f5832b = str2;
        this.f5833c = list;
        this.f5834d = cVar;
        this.f5835e = i8;
    }
}
