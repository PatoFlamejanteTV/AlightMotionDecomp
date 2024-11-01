package t7;

import i7.AbstractC2981b;

/* renamed from: t7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4066b extends AbstractC2981b {

    /* renamed from: b, reason: collision with root package name */
    private int f40053b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f40054c;

    public C4066b(int i8, byte[] bArr) {
        super(false);
        if (bArr.length == AbstractC4067c.c(i8)) {
            this.f40053b = i8;
            this.f40054c = J7.a.d(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    public byte[] a() {
        return J7.a.d(this.f40054c);
    }

    public int b() {
        return this.f40053b;
    }
}
