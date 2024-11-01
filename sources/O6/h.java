package O6;

import K6.A;
import U6.InterfaceC1451g;

/* loaded from: classes5.dex */
public final class h extends A {

    /* renamed from: a, reason: collision with root package name */
    private final String f7898a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7899b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1451g f7900c;

    public h(String str, long j8, InterfaceC1451g interfaceC1451g) {
        this.f7898a = str;
        this.f7899b = j8;
        this.f7900c = interfaceC1451g;
    }

    @Override // K6.A
    public long a() {
        return this.f7899b;
    }

    @Override // K6.A
    public InterfaceC1451g h() {
        return this.f7900c;
    }
}
