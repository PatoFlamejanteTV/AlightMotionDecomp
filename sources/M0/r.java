package M0;

import M0.F;
import java.util.List;

/* loaded from: classes3.dex */
final class r extends F.e.d.a.b.AbstractC0101e {

    /* renamed from: a, reason: collision with root package name */
    private final String f5849a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5850b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5851c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.b.AbstractC0101e.AbstractC0102a {

        /* renamed from: a, reason: collision with root package name */
        private String f5852a;

        /* renamed from: b, reason: collision with root package name */
        private int f5853b;

        /* renamed from: c, reason: collision with root package name */
        private List f5854c;

        /* renamed from: d, reason: collision with root package name */
        private byte f5855d;

        @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0102a
        public F.e.d.a.b.AbstractC0101e a() {
            String str;
            List list;
            if (this.f5855d == 1 && (str = this.f5852a) != null && (list = this.f5854c) != null) {
                return new r(str, this.f5853b, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5852a == null) {
                sb.append(" name");
            }
            if ((1 & this.f5855d) == 0) {
                sb.append(" importance");
            }
            if (this.f5854c == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0102a
        public F.e.d.a.b.AbstractC0101e.AbstractC0102a b(List list) {
            if (list != null) {
                this.f5854c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0102a
        public F.e.d.a.b.AbstractC0101e.AbstractC0102a c(int i8) {
            this.f5853b = i8;
            this.f5855d = (byte) (this.f5855d | 1);
            return this;
        }

        @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0102a
        public F.e.d.a.b.AbstractC0101e.AbstractC0102a d(String str) {
            if (str != null) {
                this.f5852a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // M0.F.e.d.a.b.AbstractC0101e
    public List b() {
        return this.f5851c;
    }

    @Override // M0.F.e.d.a.b.AbstractC0101e
    public int c() {
        return this.f5850b;
    }

    @Override // M0.F.e.d.a.b.AbstractC0101e
    public String d() {
        return this.f5849a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0101e)) {
            return false;
        }
        F.e.d.a.b.AbstractC0101e abstractC0101e = (F.e.d.a.b.AbstractC0101e) obj;
        if (this.f5849a.equals(abstractC0101e.d()) && this.f5850b == abstractC0101e.c() && this.f5851c.equals(abstractC0101e.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f5849a.hashCode() ^ 1000003) * 1000003) ^ this.f5850b) * 1000003) ^ this.f5851c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f5849a + ", importance=" + this.f5850b + ", frames=" + this.f5851c + "}";
    }

    private r(String str, int i8, List list) {
        this.f5849a = str;
        this.f5850b = i8;
        this.f5851c = list;
    }
}
