package i7;

import d7.InterfaceC2773b;

/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2980a implements InterfaceC2773b {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f32789a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f32790b;

    /* renamed from: c, reason: collision with root package name */
    private C2982c f32791c;

    /* renamed from: d, reason: collision with root package name */
    private int f32792d;

    public C2980a(C2982c c2982c, int i8, byte[] bArr, byte[] bArr2) {
        this.f32791c = c2982c;
        this.f32790b = J7.a.d(bArr);
        this.f32792d = i8;
        this.f32789a = J7.a.d(bArr2);
    }

    public byte[] a() {
        return J7.a.d(this.f32789a);
    }

    public C2982c b() {
        return this.f32791c;
    }

    public int c() {
        return this.f32792d;
    }

    public byte[] d() {
        return J7.a.d(this.f32790b);
    }
}
