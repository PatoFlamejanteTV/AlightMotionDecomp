package M0;

import M0.F;

/* loaded from: classes3.dex */
final class t extends F.e.d.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5867a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5868b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5869c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5870d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.c.AbstractC0105a {

        /* renamed from: a, reason: collision with root package name */
        private String f5871a;

        /* renamed from: b, reason: collision with root package name */
        private int f5872b;

        /* renamed from: c, reason: collision with root package name */
        private int f5873c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f5874d;

        /* renamed from: e, reason: collision with root package name */
        private byte f5875e;

        @Override // M0.F.e.d.a.c.AbstractC0105a
        public F.e.d.a.c a() {
            String str;
            if (this.f5875e == 7 && (str = this.f5871a) != null) {
                return new t(str, this.f5872b, this.f5873c, this.f5874d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5871a == null) {
                sb.append(" processName");
            }
            if ((this.f5875e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f5875e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f5875e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.d.a.c.AbstractC0105a
        public F.e.d.a.c.AbstractC0105a b(boolean z8) {
            this.f5874d = z8;
            this.f5875e = (byte) (this.f5875e | 4);
            return this;
        }

        @Override // M0.F.e.d.a.c.AbstractC0105a
        public F.e.d.a.c.AbstractC0105a c(int i8) {
            this.f5873c = i8;
            this.f5875e = (byte) (this.f5875e | 2);
            return this;
        }

        @Override // M0.F.e.d.a.c.AbstractC0105a
        public F.e.d.a.c.AbstractC0105a d(int i8) {
            this.f5872b = i8;
            this.f5875e = (byte) (this.f5875e | 1);
            return this;
        }

        @Override // M0.F.e.d.a.c.AbstractC0105a
        public F.e.d.a.c.AbstractC0105a e(String str) {
            if (str != null) {
                this.f5871a = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }
    }

    @Override // M0.F.e.d.a.c
    public int b() {
        return this.f5869c;
    }

    @Override // M0.F.e.d.a.c
    public int c() {
        return this.f5868b;
    }

    @Override // M0.F.e.d.a.c
    public String d() {
        return this.f5867a;
    }

    @Override // M0.F.e.d.a.c
    public boolean e() {
        return this.f5870d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.c)) {
            return false;
        }
        F.e.d.a.c cVar = (F.e.d.a.c) obj;
        if (this.f5867a.equals(cVar.d()) && this.f5868b == cVar.c() && this.f5869c == cVar.b() && this.f5870d == cVar.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((((this.f5867a.hashCode() ^ 1000003) * 1000003) ^ this.f5868b) * 1000003) ^ this.f5869c) * 1000003;
        if (this.f5870d) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return hashCode ^ i8;
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f5867a + ", pid=" + this.f5868b + ", importance=" + this.f5869c + ", defaultProcess=" + this.f5870d + "}";
    }

    private t(String str, int i8, int i9, boolean z8) {
        this.f5867a = str;
        this.f5868b = i8;
        this.f5869c = i9;
        this.f5870d = z8;
    }
}
