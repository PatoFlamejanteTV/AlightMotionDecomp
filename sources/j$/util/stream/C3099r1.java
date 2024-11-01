package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.r1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3099r1 extends C3095q1 implements C0 {
    @Override // j$.util.stream.C0, j$.util.stream.D0
    public final J0 a() {
        int i8 = this.f33567b;
        long[] jArr = this.f33566a;
        if (i8 >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f33567b), Integer.valueOf(jArr.length)));
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
    public final /* synthetic */ void accept(int i8) {
        AbstractC3134z0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3096q2, j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        int i8 = this.f33567b;
        long[] jArr = this.f33566a;
        if (i8 >= jArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
        }
        this.f33567b = 1 + i8;
        jArr[i8] = j8;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        i((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3091p2
    public final /* synthetic */ void i(Long l8) {
        AbstractC3134z0.i(this, l8);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void j() {
        int i8 = this.f33567b;
        long[] jArr = this.f33566a;
        if (i8 < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f33567b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        long[] jArr = this.f33566a;
        if (j8 != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j8), Integer.valueOf(jArr.length)));
        }
        this.f33567b = 0;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.C3095q1
    public final String toString() {
        long[] jArr = this.f33566a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f33567b), Arrays.toString(jArr));
    }
}
