package C6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class o0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private short[] f1084a;

    /* renamed from: b, reason: collision with root package name */
    private int f1085b;

    public o0(short[] bufferWithData) {
        AbstractC3292y.i(bufferWithData, "bufferWithData");
        this.f1084a = bufferWithData;
        this.f1085b = bufferWithData.length;
        b(10);
    }

    @Override // C6.h0
    public void b(int i8) {
        short[] sArr = this.f1084a;
        if (sArr.length < i8) {
            short[] copyOf = Arrays.copyOf(sArr, i6.m.d(i8, sArr.length * 2));
            AbstractC3292y.h(copyOf, "copyOf(...)");
            this.f1084a = copyOf;
        }
    }

    @Override // C6.h0
    public int d() {
        return this.f1085b;
    }

    public final void e(short s8) {
        h0.c(this, 0, 1, null);
        short[] sArr = this.f1084a;
        int d8 = d();
        this.f1085b = d8 + 1;
        sArr[d8] = s8;
    }

    @Override // C6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] copyOf = Arrays.copyOf(this.f1084a, d());
        AbstractC3292y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
