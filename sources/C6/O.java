package C6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class O extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f1016a;

    /* renamed from: b, reason: collision with root package name */
    private int f1017b;

    public O(long[] bufferWithData) {
        AbstractC3292y.i(bufferWithData, "bufferWithData");
        this.f1016a = bufferWithData;
        this.f1017b = bufferWithData.length;
        b(10);
    }

    @Override // C6.h0
    public void b(int i8) {
        long[] jArr = this.f1016a;
        if (jArr.length < i8) {
            long[] copyOf = Arrays.copyOf(jArr, i6.m.d(i8, jArr.length * 2));
            AbstractC3292y.h(copyOf, "copyOf(...)");
            this.f1016a = copyOf;
        }
    }

    @Override // C6.h0
    public int d() {
        return this.f1017b;
    }

    public final void e(long j8) {
        h0.c(this, 0, 1, null);
        long[] jArr = this.f1016a;
        int d8 = d();
        this.f1017b = d8 + 1;
        jArr[d8] = j8;
    }

    @Override // C6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] copyOf = Arrays.copyOf(this.f1016a, d());
        AbstractC3292y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
