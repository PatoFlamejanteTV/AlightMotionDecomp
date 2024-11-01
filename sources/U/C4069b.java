package u;

import java.util.Arrays;
import java.util.Map;
import u.i;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4069b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f40077a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f40078b;

    /* renamed from: c, reason: collision with root package name */
    private final h f40079c;

    /* renamed from: d, reason: collision with root package name */
    private final long f40080d;

    /* renamed from: e, reason: collision with root package name */
    private final long f40081e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f40082f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f40083g;

    /* renamed from: h, reason: collision with root package name */
    private final String f40084h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f40085i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f40086j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0896b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        private String f40087a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f40088b;

        /* renamed from: c, reason: collision with root package name */
        private h f40089c;

        /* renamed from: d, reason: collision with root package name */
        private Long f40090d;

        /* renamed from: e, reason: collision with root package name */
        private Long f40091e;

        /* renamed from: f, reason: collision with root package name */
        private Map f40092f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f40093g;

        /* renamed from: h, reason: collision with root package name */
        private String f40094h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f40095i;

        /* renamed from: j, reason: collision with root package name */
        private byte[] f40096j;

        @Override // u.i.a
        public i d() {
            String str = "";
            if (this.f40087a == null) {
                str = " transportName";
            }
            if (this.f40089c == null) {
                str = str + " encodedPayload";
            }
            if (this.f40090d == null) {
                str = str + " eventMillis";
            }
            if (this.f40091e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f40092f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C4069b(this.f40087a, this.f40088b, this.f40089c, this.f40090d.longValue(), this.f40091e.longValue(), this.f40092f, this.f40093g, this.f40094h, this.f40095i, this.f40096j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u.i.a
        protected Map e() {
            Map map = this.f40092f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u.i.a
        public i.a f(Map map) {
            if (map != null) {
                this.f40092f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // u.i.a
        public i.a g(Integer num) {
            this.f40088b = num;
            return this;
        }

        @Override // u.i.a
        public i.a h(h hVar) {
            if (hVar != null) {
                this.f40089c = hVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // u.i.a
        public i.a i(long j8) {
            this.f40090d = Long.valueOf(j8);
            return this;
        }

        @Override // u.i.a
        public i.a j(byte[] bArr) {
            this.f40095i = bArr;
            return this;
        }

        @Override // u.i.a
        public i.a k(byte[] bArr) {
            this.f40096j = bArr;
            return this;
        }

        @Override // u.i.a
        public i.a l(Integer num) {
            this.f40093g = num;
            return this;
        }

        @Override // u.i.a
        public i.a m(String str) {
            this.f40094h = str;
            return this;
        }

        @Override // u.i.a
        public i.a n(String str) {
            if (str != null) {
                this.f40087a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // u.i.a
        public i.a o(long j8) {
            this.f40091e = Long.valueOf(j8);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u.i
    public Map c() {
        return this.f40082f;
    }

    @Override // u.i
    public Integer d() {
        return this.f40078b;
    }

    @Override // u.i
    public h e() {
        return this.f40079c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        byte[] g8;
        byte[] h8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f40077a.equals(iVar.n()) && ((num = this.f40078b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f40079c.equals(iVar.e()) && this.f40080d == iVar.f() && this.f40081e == iVar.o() && this.f40082f.equals(iVar.c()) && ((num2 = this.f40083g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.f40084h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
            byte[] bArr = this.f40085i;
            boolean z8 = iVar instanceof C4069b;
            if (z8) {
                g8 = ((C4069b) iVar).f40085i;
            } else {
                g8 = iVar.g();
            }
            if (Arrays.equals(bArr, g8)) {
                byte[] bArr2 = this.f40086j;
                if (z8) {
                    h8 = ((C4069b) iVar).f40086j;
                } else {
                    h8 = iVar.h();
                }
                if (Arrays.equals(bArr2, h8)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // u.i
    public long f() {
        return this.f40080d;
    }

    @Override // u.i
    public byte[] g() {
        return this.f40085i;
    }

    @Override // u.i
    public byte[] h() {
        return this.f40086j;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f40077a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f40078b;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode4 = (((hashCode3 ^ hashCode) * 1000003) ^ this.f40079c.hashCode()) * 1000003;
        long j8 = this.f40080d;
        int i9 = (hashCode4 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f40081e;
        int hashCode5 = (((i9 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f40082f.hashCode()) * 1000003;
        Integer num2 = this.f40083g;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i10 = (hashCode5 ^ hashCode2) * 1000003;
        String str = this.f40084h;
        if (str != null) {
            i8 = str.hashCode();
        }
        return ((((i10 ^ i8) * 1000003) ^ Arrays.hashCode(this.f40085i)) * 1000003) ^ Arrays.hashCode(this.f40086j);
    }

    @Override // u.i
    public Integer l() {
        return this.f40083g;
    }

    @Override // u.i
    public String m() {
        return this.f40084h;
    }

    @Override // u.i
    public String n() {
        return this.f40077a;
    }

    @Override // u.i
    public long o() {
        return this.f40081e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f40077a + ", code=" + this.f40078b + ", encodedPayload=" + this.f40079c + ", eventMillis=" + this.f40080d + ", uptimeMillis=" + this.f40081e + ", autoMetadata=" + this.f40082f + ", productId=" + this.f40083g + ", pseudonymousId=" + this.f40084h + ", experimentIdsClear=" + Arrays.toString(this.f40085i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f40086j) + "}";
    }

    private C4069b(String str, Integer num, h hVar, long j8, long j9, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f40077a = str;
        this.f40078b = num;
        this.f40079c = hVar;
        this.f40080d = j8;
        this.f40081e = j9;
        this.f40082f = map;
        this.f40083g = num2;
        this.f40084h = str2;
        this.f40085i = bArr;
        this.f40086j = bArr2;
    }
}
