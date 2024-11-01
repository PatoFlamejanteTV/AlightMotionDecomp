package C6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1019i extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f1066a;

    /* renamed from: b, reason: collision with root package name */
    private int f1067b;

    public C1019i(byte[] bufferWithData) {
        AbstractC3292y.i(bufferWithData, "bufferWithData");
        this.f1066a = bufferWithData;
        this.f1067b = bufferWithData.length;
        b(10);
    }

    @Override // C6.h0
    public void b(int i8) {
        byte[] bArr = this.f1066a;
        if (bArr.length < i8) {
            byte[] copyOf = Arrays.copyOf(bArr, i6.m.d(i8, bArr.length * 2));
            AbstractC3292y.h(copyOf, "copyOf(...)");
            this.f1066a = copyOf;
        }
    }

    @Override // C6.h0
    public int d() {
        return this.f1067b;
    }

    public final void e(byte b9) {
        h0.c(this, 0, 1, null);
        byte[] bArr = this.f1066a;
        int d8 = d();
        this.f1067b = d8 + 1;
        bArr[d8] = b9;
    }

    @Override // C6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.f1066a, d());
        AbstractC3292y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
