package C6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class w0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private int[] f1123a;

    /* renamed from: b, reason: collision with root package name */
    private int f1124b;

    public /* synthetic */ w0(int[] iArr, AbstractC3284p abstractC3284p) {
        this(iArr);
    }

    @Override // C6.h0
    public /* bridge */ /* synthetic */ Object a() {
        return Q5.B.c(f());
    }

    @Override // C6.h0
    public void b(int i8) {
        if (Q5.B.q(this.f1123a) < i8) {
            int[] iArr = this.f1123a;
            int[] copyOf = Arrays.copyOf(iArr, i6.m.d(i8, Q5.B.q(iArr) * 2));
            AbstractC3292y.h(copyOf, "copyOf(...)");
            this.f1123a = Q5.B.g(copyOf);
        }
    }

    @Override // C6.h0
    public int d() {
        return this.f1124b;
    }

    public final void e(int i8) {
        h0.c(this, 0, 1, null);
        int[] iArr = this.f1123a;
        int d8 = d();
        this.f1124b = d8 + 1;
        Q5.B.u(iArr, d8, i8);
    }

    public int[] f() {
        int[] copyOf = Arrays.copyOf(this.f1123a, d());
        AbstractC3292y.h(copyOf, "copyOf(...)");
        return Q5.B.g(copyOf);
    }

    private w0(int[] bufferWithData) {
        AbstractC3292y.i(bufferWithData, "bufferWithData");
        this.f1123a = bufferWithData;
        this.f1124b = Q5.B.q(bufferWithData);
        b(10);
    }
}
