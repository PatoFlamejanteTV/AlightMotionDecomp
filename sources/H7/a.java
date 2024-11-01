package H7;

import java.security.spec.KeySpec;
import u7.C4104a;

/* loaded from: classes5.dex */
public class a implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private short[][] f3309a;

    /* renamed from: b, reason: collision with root package name */
    private short[] f3310b;

    /* renamed from: c, reason: collision with root package name */
    private short[][] f3311c;

    /* renamed from: d, reason: collision with root package name */
    private short[] f3312d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f3313e;

    /* renamed from: f, reason: collision with root package name */
    private C4104a[] f3314f;

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C4104a[] c4104aArr) {
        this.f3309a = sArr;
        this.f3310b = sArr2;
        this.f3311c = sArr3;
        this.f3312d = sArr4;
        this.f3313e = iArr;
        this.f3314f = c4104aArr;
    }

    public short[] a() {
        return this.f3310b;
    }

    public short[] b() {
        return this.f3312d;
    }

    public short[][] c() {
        return this.f3309a;
    }

    public short[][] d() {
        return this.f3311c;
    }

    public C4104a[] e() {
        return this.f3314f;
    }

    public int[] f() {
        return this.f3313e;
    }
}
