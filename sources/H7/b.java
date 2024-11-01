package H7;

import java.security.spec.KeySpec;

/* loaded from: classes5.dex */
public class b implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private short[][] f3315a;

    /* renamed from: b, reason: collision with root package name */
    private short[][] f3316b;

    /* renamed from: c, reason: collision with root package name */
    private short[] f3317c;

    /* renamed from: d, reason: collision with root package name */
    private int f3318d;

    public b(int i8, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f3318d = i8;
        this.f3315a = sArr;
        this.f3316b = sArr2;
        this.f3317c = sArr3;
    }

    public short[][] a() {
        return this.f3315a;
    }

    public short[] b() {
        return this.f3317c;
    }

    public short[][] c() {
        return this.f3316b;
    }

    public int d() {
        return this.f3318d;
    }
}
