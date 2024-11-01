package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3055i1 extends C3050h1 implements B0 {
    @Override // j$.util.stream.B0, j$.util.stream.D0
    public final H0 a() {
        int i8 = this.f33515b;
        int[] iArr = this.f33514a;
        if (i8 >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f33515b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.D0
    public final /* bridge */ /* synthetic */ L0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void accept(double d8) {
        AbstractC3134z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void accept(int i8) {
        int i9 = this.f33515b;
        int[] iArr = this.f33514a;
        if (i9 >= iArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
        }
        this.f33515b = 1 + i9;
        iArr[i9] = i8;
    }

    @Override // j$.util.stream.InterfaceC3096q2, j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC3134z0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void j() {
        int i8 = this.f33515b;
        int[] iArr = this.f33514a;
        if (i8 < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f33515b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        int[] iArr = this.f33514a;
        if (j8 != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j8), Integer.valueOf(iArr.length)));
        }
        this.f33515b = 0;
    }

    @Override // j$.util.stream.InterfaceC3086o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3134z0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.C3050h1
    public final String toString() {
        int[] iArr = this.f33514a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f33515b), Arrays.toString(iArr));
    }
}
