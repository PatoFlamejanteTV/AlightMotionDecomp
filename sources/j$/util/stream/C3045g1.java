package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3045g1 extends O0 implements D0 {
    @Override // j$.util.stream.D0
    public final L0 a() {
        int i8 = this.f33331b;
        Object[] objArr = this.f33330a;
        if (i8 >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f33331b), Integer.valueOf(objArr.length)));
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
    public final /* synthetic */ void accept(long j8) {
        AbstractC3134z0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        int i8 = this.f33331b;
        Object[] objArr = this.f33330a;
        if (i8 >= objArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
        }
        this.f33331b = 1 + i8;
        objArr[i8] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void j() {
        int i8 = this.f33331b;
        Object[] objArr = this.f33330a;
        if (i8 < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f33331b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        Object[] objArr = this.f33330a;
        if (j8 != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j8), Integer.valueOf(objArr.length)));
        }
        this.f33331b = 0;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.O0
    public final String toString() {
        Object[] objArr = this.f33330a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f33331b), Arrays.toString(objArr));
    }
}
