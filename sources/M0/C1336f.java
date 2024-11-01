package M0;

import M0.F;
import java.util.List;

/* renamed from: M0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1336f extends F.d {

    /* renamed from: a, reason: collision with root package name */
    private final List f5720a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5721b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0.f$b */
    /* loaded from: classes3.dex */
    public static final class b extends F.d.a {

        /* renamed from: a, reason: collision with root package name */
        private List f5722a;

        /* renamed from: b, reason: collision with root package name */
        private String f5723b;

        @Override // M0.F.d.a
        public F.d a() {
            List list = this.f5722a;
            if (list != null) {
                return new C1336f(list, this.f5723b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // M0.F.d.a
        public F.d.a b(List list) {
            if (list != null) {
                this.f5722a = list;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override // M0.F.d.a
        public F.d.a c(String str) {
            this.f5723b = str;
            return this;
        }
    }

    @Override // M0.F.d
    public List b() {
        return this.f5720a;
    }

    @Override // M0.F.d
    public String c() {
        return this.f5721b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.d)) {
            return false;
        }
        F.d dVar = (F.d) obj;
        if (this.f5720a.equals(dVar.b())) {
            String str = this.f5721b;
            if (str == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f5720a.hashCode() ^ 1000003) * 1000003;
        String str = this.f5721b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f5720a + ", orgId=" + this.f5721b + "}";
    }

    private C1336f(List list, String str) {
        this.f5720a = list;
        this.f5721b = str;
    }
}
