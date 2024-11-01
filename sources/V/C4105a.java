package v;

import java.util.Arrays;
import v.AbstractC4110f;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4105a extends AbstractC4110f {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable f40389a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f40390b;

    /* renamed from: v.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC4110f.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable f40391a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f40392b;

        @Override // v.AbstractC4110f.a
        public AbstractC4110f a() {
            String str = "";
            if (this.f40391a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C4105a(this.f40391a, this.f40392b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // v.AbstractC4110f.a
        public AbstractC4110f.a b(Iterable iterable) {
            if (iterable != null) {
                this.f40391a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // v.AbstractC4110f.a
        public AbstractC4110f.a c(byte[] bArr) {
            this.f40392b = bArr;
            return this;
        }
    }

    @Override // v.AbstractC4110f
    public Iterable b() {
        return this.f40389a;
    }

    @Override // v.AbstractC4110f
    public byte[] c() {
        return this.f40390b;
    }

    public boolean equals(Object obj) {
        byte[] c8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4110f)) {
            return false;
        }
        AbstractC4110f abstractC4110f = (AbstractC4110f) obj;
        if (this.f40389a.equals(abstractC4110f.b())) {
            byte[] bArr = this.f40390b;
            if (abstractC4110f instanceof C4105a) {
                c8 = ((C4105a) abstractC4110f).f40390b;
            } else {
                c8 = abstractC4110f.c();
            }
            if (Arrays.equals(bArr, c8)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f40389a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f40390b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f40389a + ", extras=" + Arrays.toString(this.f40390b) + "}";
    }

    private C4105a(Iterable iterable, byte[] bArr) {
        this.f40389a = iterable;
        this.f40390b = bArr;
    }
}
