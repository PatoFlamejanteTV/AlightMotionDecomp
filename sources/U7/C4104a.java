package u7;

import v7.AbstractC4137a;

/* renamed from: u7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4104a {

    /* renamed from: a, reason: collision with root package name */
    private int f40382a;

    /* renamed from: b, reason: collision with root package name */
    private int f40383b;

    /* renamed from: c, reason: collision with root package name */
    private int f40384c;

    /* renamed from: d, reason: collision with root package name */
    private short[][][] f40385d;

    /* renamed from: e, reason: collision with root package name */
    private short[][][] f40386e;

    /* renamed from: f, reason: collision with root package name */
    private short[][] f40387f;

    /* renamed from: g, reason: collision with root package name */
    private short[] f40388g;

    public C4104a(byte b9, byte b10, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i8 = b9 & 255;
        this.f40382a = i8;
        int i9 = b10 & 255;
        this.f40383b = i9;
        this.f40384c = i9 - i8;
        this.f40385d = sArr;
        this.f40386e = sArr2;
        this.f40387f = sArr3;
        this.f40388g = sArr4;
    }

    public short[][][] a() {
        return this.f40385d;
    }

    public short[][][] b() {
        return this.f40386e;
    }

    public short[] c() {
        return this.f40388g;
    }

    public short[][] d() {
        return this.f40387f;
    }

    public int e() {
        return this.f40384c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C4104a)) {
            return false;
        }
        C4104a c4104a = (C4104a) obj;
        if (this.f40382a != c4104a.f() || this.f40383b != c4104a.g() || this.f40384c != c4104a.e() || !AbstractC4137a.k(this.f40385d, c4104a.a()) || !AbstractC4137a.k(this.f40386e, c4104a.b()) || !AbstractC4137a.j(this.f40387f, c4104a.d()) || !AbstractC4137a.i(this.f40388g, c4104a.c())) {
            return false;
        }
        return true;
    }

    public int f() {
        return this.f40382a;
    }

    public int g() {
        return this.f40383b;
    }

    public int hashCode() {
        return (((((((((((this.f40382a * 37) + this.f40383b) * 37) + this.f40384c) * 37) + J7.a.q(this.f40385d)) * 37) + J7.a.q(this.f40386e)) * 37) + J7.a.p(this.f40387f)) * 37) + J7.a.o(this.f40388g);
    }
}
