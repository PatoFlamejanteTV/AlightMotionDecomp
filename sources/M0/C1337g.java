package M0;

import M0.F;
import java.util.Arrays;

/* renamed from: M0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1337g extends F.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f5724a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f5725b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0.g$b */
    /* loaded from: classes3.dex */
    public static final class b extends F.d.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f5726a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f5727b;

        @Override // M0.F.d.b.a
        public F.d.b a() {
            byte[] bArr;
            String str = this.f5726a;
            if (str != null && (bArr = this.f5727b) != null) {
                return new C1337g(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5726a == null) {
                sb.append(" filename");
            }
            if (this.f5727b == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.d.b.a
        public F.d.b.a b(byte[] bArr) {
            if (bArr != null) {
                this.f5727b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // M0.F.d.b.a
        public F.d.b.a c(String str) {
            if (str != null) {
                this.f5726a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    @Override // M0.F.d.b
    public byte[] b() {
        return this.f5725b;
    }

    @Override // M0.F.d.b
    public String c() {
        return this.f5724a;
    }

    public boolean equals(Object obj) {
        byte[] b9;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.d.b)) {
            return false;
        }
        F.d.b bVar = (F.d.b) obj;
        if (this.f5724a.equals(bVar.c())) {
            byte[] bArr = this.f5725b;
            if (bVar instanceof C1337g) {
                b9 = ((C1337g) bVar).f5725b;
            } else {
                b9 = bVar.b();
            }
            if (Arrays.equals(bArr, b9)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5724a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5725b);
    }

    public String toString() {
        return "File{filename=" + this.f5724a + ", contents=" + Arrays.toString(this.f5725b) + "}";
    }

    private C1337g(String str, byte[] bArr) {
        this.f5724a = str;
        this.f5725b = bArr;
    }
}
