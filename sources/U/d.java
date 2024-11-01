package u;

import java.util.Arrays;
import u.p;

/* loaded from: classes3.dex */
final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    private final String f40107a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f40108b;

    /* renamed from: c, reason: collision with root package name */
    private final s.f f40109c;

    /* loaded from: classes3.dex */
    static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        private String f40110a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f40111b;

        /* renamed from: c, reason: collision with root package name */
        private s.f f40112c;

        @Override // u.p.a
        public p a() {
            String str = "";
            if (this.f40110a == null) {
                str = " backendName";
            }
            if (this.f40112c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f40110a, this.f40111b, this.f40112c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u.p.a
        public p.a b(String str) {
            if (str != null) {
                this.f40110a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // u.p.a
        public p.a c(byte[] bArr) {
            this.f40111b = bArr;
            return this;
        }

        @Override // u.p.a
        public p.a d(s.f fVar) {
            if (fVar != null) {
                this.f40112c = fVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    @Override // u.p
    public String b() {
        return this.f40107a;
    }

    @Override // u.p
    public byte[] c() {
        return this.f40108b;
    }

    @Override // u.p
    public s.f d() {
        return this.f40109c;
    }

    public boolean equals(Object obj) {
        byte[] c8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f40107a.equals(pVar.b())) {
            byte[] bArr = this.f40108b;
            if (pVar instanceof d) {
                c8 = ((d) pVar).f40108b;
            } else {
                c8 = pVar.c();
            }
            if (Arrays.equals(bArr, c8) && this.f40109c.equals(pVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f40107a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f40108b)) * 1000003) ^ this.f40109c.hashCode();
    }

    private d(String str, byte[] bArr, s.f fVar) {
        this.f40107a = str;
        this.f40108b = bArr;
        this.f40109c = fVar;
    }
}
