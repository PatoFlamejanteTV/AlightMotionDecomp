package i7;

import d7.InterfaceC2773b;

/* renamed from: i7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2982c implements InterfaceC2773b {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f32794a;

    public C2982c(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.f32794a;
    }

    public C2982c(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9];
        this.f32794a = bArr2;
        System.arraycopy(bArr, i8, bArr2, 0, i9);
    }
}
