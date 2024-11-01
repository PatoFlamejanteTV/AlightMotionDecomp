package D7;

import W6.Y;
import c7.C2081a;
import java.security.PublicKey;
import p7.InterfaceC3593e;
import p7.g;
import v7.AbstractC4137a;

/* loaded from: classes5.dex */
public class b implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private short[][] f1520a;

    /* renamed from: b, reason: collision with root package name */
    private short[][] f1521b;

    /* renamed from: c, reason: collision with root package name */
    private short[] f1522c;

    /* renamed from: d, reason: collision with root package name */
    private int f1523d;

    public b(int i8, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f1523d = i8;
        this.f1520a = sArr;
        this.f1521b = sArr2;
        this.f1522c = sArr3;
    }

    public short[][] a() {
        return this.f1520a;
    }

    public short[] b() {
        return J7.a.e(this.f1522c);
    }

    public short[][] c() {
        short[][] sArr = new short[this.f1521b.length];
        int i8 = 0;
        while (true) {
            short[][] sArr2 = this.f1521b;
            if (i8 != sArr2.length) {
                sArr[i8] = J7.a.e(sArr2[i8]);
                i8++;
            } else {
                return sArr;
            }
        }
    }

    public int d() {
        return this.f1523d;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1523d != bVar.d() || !AbstractC4137a.j(this.f1520a, bVar.a()) || !AbstractC4137a.j(this.f1521b, bVar.c()) || !AbstractC4137a.i(this.f1522c, bVar.b())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return F7.a.a(new C2081a(InterfaceC3593e.f36481a, Y.f10820a), new g(this.f1523d, this.f1520a, this.f1521b, this.f1522c));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.f1523d * 37) + J7.a.p(this.f1520a)) * 37) + J7.a.p(this.f1521b)) * 37) + J7.a.o(this.f1522c);
    }

    public b(H7.b bVar) {
        this(bVar.d(), bVar.a(), bVar.c(), bVar.b());
    }
}
