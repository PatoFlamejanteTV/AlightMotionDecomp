package C6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class C0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private short[] f998a;

    /* renamed from: b, reason: collision with root package name */
    private int f999b;

    public /* synthetic */ C0(short[] sArr, AbstractC3284p abstractC3284p) {
        this(sArr);
    }

    @Override // C6.h0
    public /* bridge */ /* synthetic */ Object a() {
        return Q5.G.c(f());
    }

    @Override // C6.h0
    public void b(int i8) {
        if (Q5.G.q(this.f998a) < i8) {
            short[] sArr = this.f998a;
            short[] copyOf = Arrays.copyOf(sArr, i6.m.d(i8, Q5.G.q(sArr) * 2));
            AbstractC3292y.h(copyOf, "copyOf(...)");
            this.f998a = Q5.G.g(copyOf);
        }
    }

    @Override // C6.h0
    public int d() {
        return this.f999b;
    }

    public final void e(short s8) {
        h0.c(this, 0, 1, null);
        short[] sArr = this.f998a;
        int d8 = d();
        this.f999b = d8 + 1;
        Q5.G.u(sArr, d8, s8);
    }

    public short[] f() {
        short[] copyOf = Arrays.copyOf(this.f998a, d());
        AbstractC3292y.h(copyOf, "copyOf(...)");
        return Q5.G.g(copyOf);
    }

    private C0(short[] bufferWithData) {
        AbstractC3292y.i(bufferWithData, "bufferWithData");
        this.f998a = bufferWithData;
        this.f999b = Q5.G.q(bufferWithData);
        b(10);
    }
}
