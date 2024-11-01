package C6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class F extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private int[] f1005a;

    /* renamed from: b, reason: collision with root package name */
    private int f1006b;

    public F(int[] bufferWithData) {
        AbstractC3292y.i(bufferWithData, "bufferWithData");
        this.f1005a = bufferWithData;
        this.f1006b = bufferWithData.length;
        b(10);
    }

    @Override // C6.h0
    public void b(int i8) {
        int[] iArr = this.f1005a;
        if (iArr.length < i8) {
            int[] copyOf = Arrays.copyOf(iArr, i6.m.d(i8, iArr.length * 2));
            AbstractC3292y.h(copyOf, "copyOf(...)");
            this.f1005a = copyOf;
        }
    }

    @Override // C6.h0
    public int d() {
        return this.f1006b;
    }

    public final void e(int i8) {
        h0.c(this, 0, 1, null);
        int[] iArr = this.f1005a;
        int d8 = d();
        this.f1006b = d8 + 1;
        iArr[d8] = i8;
    }

    @Override // C6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.f1005a, d());
        AbstractC3292y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
