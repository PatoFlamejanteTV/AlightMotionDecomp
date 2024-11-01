package C6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1023m extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private char[] f1076a;

    /* renamed from: b, reason: collision with root package name */
    private int f1077b;

    public C1023m(char[] bufferWithData) {
        AbstractC3292y.i(bufferWithData, "bufferWithData");
        this.f1076a = bufferWithData;
        this.f1077b = bufferWithData.length;
        b(10);
    }

    @Override // C6.h0
    public void b(int i8) {
        char[] cArr = this.f1076a;
        if (cArr.length < i8) {
            char[] copyOf = Arrays.copyOf(cArr, i6.m.d(i8, cArr.length * 2));
            AbstractC3292y.h(copyOf, "copyOf(...)");
            this.f1076a = copyOf;
        }
    }

    @Override // C6.h0
    public int d() {
        return this.f1077b;
    }

    public final void e(char c8) {
        h0.c(this, 0, 1, null);
        char[] cArr = this.f1076a;
        int d8 = d();
        this.f1077b = d8 + 1;
        cArr[d8] = c8;
    }

    @Override // C6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] copyOf = Arrays.copyOf(this.f1076a, d());
        AbstractC3292y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
