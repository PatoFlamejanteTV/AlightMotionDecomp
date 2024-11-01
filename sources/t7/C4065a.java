package t7;

import i7.AbstractC2981b;

/* renamed from: t7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4065a extends AbstractC2981b {

    /* renamed from: b, reason: collision with root package name */
    private int f40051b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f40052c;

    public C4065a(int i8, byte[] bArr) {
        super(true);
        if (bArr.length == AbstractC4067c.b(i8)) {
            this.f40051b = i8;
            this.f40052c = J7.a.d(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    public byte[] a() {
        return J7.a.d(this.f40052c);
    }

    public int b() {
        return this.f40051b;
    }
}
