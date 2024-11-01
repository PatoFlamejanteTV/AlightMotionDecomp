package t;

import java.util.Arrays;
import t.q;

/* loaded from: classes3.dex */
final class g extends q {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f39317a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f39318b;

    /* loaded from: classes3.dex */
    static final class b extends q.a {

        /* renamed from: a, reason: collision with root package name */
        private byte[] f39319a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f39320b;

        @Override // t.q.a
        public q a() {
            return new g(this.f39319a, this.f39320b);
        }

        @Override // t.q.a
        public q.a b(byte[] bArr) {
            this.f39319a = bArr;
            return this;
        }

        @Override // t.q.a
        public q.a c(byte[] bArr) {
            this.f39320b = bArr;
            return this;
        }
    }

    @Override // t.q
    public byte[] b() {
        return this.f39317a;
    }

    @Override // t.q
    public byte[] c() {
        return this.f39318b;
    }

    public boolean equals(Object obj) {
        byte[] b9;
        byte[] c8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        byte[] bArr = this.f39317a;
        boolean z8 = qVar instanceof g;
        if (z8) {
            b9 = ((g) qVar).f39317a;
        } else {
            b9 = qVar.b();
        }
        if (Arrays.equals(bArr, b9)) {
            byte[] bArr2 = this.f39318b;
            if (z8) {
                c8 = ((g) qVar).f39318b;
            } else {
                c8 = qVar.c();
            }
            if (Arrays.equals(bArr2, c8)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f39317a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f39318b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f39317a) + ", encryptedBlob=" + Arrays.toString(this.f39318b) + "}";
    }

    private g(byte[] bArr, byte[] bArr2) {
        this.f39317a = bArr;
        this.f39318b = bArr2;
    }
}
