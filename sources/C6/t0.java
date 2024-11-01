package C6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class t0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f1105a;

    /* renamed from: b, reason: collision with root package name */
    private int f1106b;

    public /* synthetic */ t0(byte[] bArr, AbstractC3284p abstractC3284p) {
        this(bArr);
    }

    @Override // C6.h0
    public /* bridge */ /* synthetic */ Object a() {
        return Q5.z.c(f());
    }

    @Override // C6.h0
    public void b(int i8) {
        if (Q5.z.q(this.f1105a) < i8) {
            byte[] bArr = this.f1105a;
            byte[] copyOf = Arrays.copyOf(bArr, i6.m.d(i8, Q5.z.q(bArr) * 2));
            AbstractC3292y.h(copyOf, "copyOf(...)");
            this.f1105a = Q5.z.g(copyOf);
        }
    }

    @Override // C6.h0
    public int d() {
        return this.f1106b;
    }

    public final void e(byte b9) {
        h0.c(this, 0, 1, null);
        byte[] bArr = this.f1105a;
        int d8 = d();
        this.f1106b = d8 + 1;
        Q5.z.u(bArr, d8, b9);
    }

    public byte[] f() {
        byte[] copyOf = Arrays.copyOf(this.f1105a, d());
        AbstractC3292y.h(copyOf, "copyOf(...)");
        return Q5.z.g(copyOf);
    }

    private t0(byte[] bufferWithData) {
        AbstractC3292y.i(bufferWithData, "bufferWithData");
        this.f1105a = bufferWithData;
        this.f1106b = Q5.z.q(bufferWithData);
        b(10);
    }
}
