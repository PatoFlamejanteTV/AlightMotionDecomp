package C6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1015f extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean[] f1060a;

    /* renamed from: b, reason: collision with root package name */
    private int f1061b;

    public C1015f(boolean[] bufferWithData) {
        AbstractC3292y.i(bufferWithData, "bufferWithData");
        this.f1060a = bufferWithData;
        this.f1061b = bufferWithData.length;
        b(10);
    }

    @Override // C6.h0
    public void b(int i8) {
        boolean[] zArr = this.f1060a;
        if (zArr.length < i8) {
            boolean[] copyOf = Arrays.copyOf(zArr, i6.m.d(i8, zArr.length * 2));
            AbstractC3292y.h(copyOf, "copyOf(...)");
            this.f1060a = copyOf;
        }
    }

    @Override // C6.h0
    public int d() {
        return this.f1061b;
    }

    public final void e(boolean z8) {
        h0.c(this, 0, 1, null);
        boolean[] zArr = this.f1060a;
        int d8 = d();
        this.f1061b = d8 + 1;
        zArr[d8] = z8;
    }

    @Override // C6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.f1060a, d());
        AbstractC3292y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
