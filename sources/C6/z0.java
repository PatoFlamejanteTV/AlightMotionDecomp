package C6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class z0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f1135a;

    /* renamed from: b, reason: collision with root package name */
    private int f1136b;

    public /* synthetic */ z0(long[] jArr, AbstractC3284p abstractC3284p) {
        this(jArr);
    }

    @Override // C6.h0
    public /* bridge */ /* synthetic */ Object a() {
        return Q5.D.c(f());
    }

    @Override // C6.h0
    public void b(int i8) {
        if (Q5.D.q(this.f1135a) < i8) {
            long[] jArr = this.f1135a;
            long[] copyOf = Arrays.copyOf(jArr, i6.m.d(i8, Q5.D.q(jArr) * 2));
            AbstractC3292y.h(copyOf, "copyOf(...)");
            this.f1135a = Q5.D.g(copyOf);
        }
    }

    @Override // C6.h0
    public int d() {
        return this.f1136b;
    }

    public final void e(long j8) {
        h0.c(this, 0, 1, null);
        long[] jArr = this.f1135a;
        int d8 = d();
        this.f1136b = d8 + 1;
        Q5.D.u(jArr, d8, j8);
    }

    public long[] f() {
        long[] copyOf = Arrays.copyOf(this.f1135a, d());
        AbstractC3292y.h(copyOf, "copyOf(...)");
        return Q5.D.g(copyOf);
    }

    private z0(long[] bufferWithData) {
        AbstractC3292y.i(bufferWithData, "bufferWithData");
        this.f1135a = bufferWithData;
        this.f1136b = Q5.D.q(bufferWithData);
        b(10);
    }
}
