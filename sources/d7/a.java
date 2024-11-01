package D7;

import W6.Y;
import b7.C1992b;
import c7.C2081a;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import p7.InterfaceC3593e;
import p7.f;
import u7.C4104a;
import v7.AbstractC4137a;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private short[][] f1514a;

    /* renamed from: b, reason: collision with root package name */
    private short[] f1515b;

    /* renamed from: c, reason: collision with root package name */
    private short[][] f1516c;

    /* renamed from: d, reason: collision with root package name */
    private short[] f1517d;

    /* renamed from: e, reason: collision with root package name */
    private C4104a[] f1518e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f1519f;

    public a(H7.a aVar) {
        this(aVar.c(), aVar.a(), aVar.d(), aVar.b(), aVar.f(), aVar.e());
    }

    public short[] a() {
        return this.f1515b;
    }

    public short[] b() {
        return this.f1517d;
    }

    public short[][] c() {
        return this.f1514a;
    }

    public short[][] d() {
        return this.f1516c;
    }

    public C4104a[] e() {
        return this.f1518e;
    }

    public boolean equals(Object obj) {
        boolean z8;
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC4137a.j(this.f1514a, aVar.c()) && AbstractC4137a.j(this.f1516c, aVar.d()) && AbstractC4137a.i(this.f1515b, aVar.a()) && AbstractC4137a.i(this.f1517d, aVar.b()) && Arrays.equals(this.f1519f, aVar.f())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f1518e.length != aVar.e().length) {
            return false;
        }
        for (int length = this.f1518e.length - 1; length >= 0; length--) {
            z8 &= this.f1518e[length].equals(aVar.e()[length]);
        }
        return z8;
    }

    public int[] f() {
        return this.f1519f;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new C1992b(new C2081a(InterfaceC3593e.f36481a, Y.f10820a), new f(this.f1514a, this.f1515b, this.f1516c, this.f1517d, this.f1519f, this.f1518e)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        int length = (((((((((this.f1518e.length * 37) + J7.a.p(this.f1514a)) * 37) + J7.a.o(this.f1515b)) * 37) + J7.a.p(this.f1516c)) * 37) + J7.a.o(this.f1517d)) * 37) + J7.a.n(this.f1519f);
        for (int length2 = this.f1518e.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.f1518e[length2].hashCode();
        }
        return length;
    }

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C4104a[] c4104aArr) {
        this.f1514a = sArr;
        this.f1515b = sArr2;
        this.f1516c = sArr3;
        this.f1517d = sArr4;
        this.f1519f = iArr;
        this.f1518e = c4104aArr;
    }
}
