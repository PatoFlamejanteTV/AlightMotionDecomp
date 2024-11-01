package C6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1035z extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private float[] f1133a;

    /* renamed from: b, reason: collision with root package name */
    private int f1134b;

    public C1035z(float[] bufferWithData) {
        AbstractC3292y.i(bufferWithData, "bufferWithData");
        this.f1133a = bufferWithData;
        this.f1134b = bufferWithData.length;
        b(10);
    }

    @Override // C6.h0
    public void b(int i8) {
        float[] fArr = this.f1133a;
        if (fArr.length < i8) {
            float[] copyOf = Arrays.copyOf(fArr, i6.m.d(i8, fArr.length * 2));
            AbstractC3292y.h(copyOf, "copyOf(...)");
            this.f1133a = copyOf;
        }
    }

    @Override // C6.h0
    public int d() {
        return this.f1134b;
    }

    public final void e(float f8) {
        h0.c(this, 0, 1, null);
        float[] fArr = this.f1133a;
        int d8 = d();
        this.f1134b = d8 + 1;
        fArr[d8] = f8;
    }

    @Override // C6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.f1133a, d());
        AbstractC3292y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
