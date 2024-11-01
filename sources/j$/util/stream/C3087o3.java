package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.o3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3087o3 implements InterfaceC3081n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f33553b;

    public /* synthetic */ C3087o3(DoubleConsumer doubleConsumer, int i8) {
        this.f33552a = i8;
        this.f33553b = doubleConsumer;
    }

    private final /* synthetic */ void b(long j8) {
    }

    private final /* synthetic */ void c(long j8) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC3081n2, j$.util.stream.InterfaceC3096q2
    public final void accept(double d8) {
        switch (this.f33552a) {
            case 0:
                ((T2) this.f33553b).accept(d8);
                return;
            default:
                this.f33553b.accept(d8);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void accept(int i8) {
        switch (this.f33552a) {
            case 0:
                AbstractC3134z0.k();
                throw null;
            default:
                AbstractC3134z0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC3096q2, j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        switch (this.f33552a) {
            case 0:
                AbstractC3134z0.l();
                throw null;
            default:
                AbstractC3134z0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        switch (this.f33552a) {
            case 0:
                o((Double) obj);
                return;
            default:
                o((Double) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f33552a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f33552a) {
            case 0:
                return j$.com.android.tools.r8.a.c(this, doubleConsumer);
            default:
                return j$.com.android.tools.r8.a.c(this, doubleConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void j() {
        int i8 = this.f33552a;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void k(long j8) {
        int i8 = this.f33552a;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ boolean m() {
        switch (this.f33552a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC3081n2
    public final /* synthetic */ void o(Double d8) {
        switch (this.f33552a) {
            case 0:
                AbstractC3134z0.e(this, d8);
                return;
            default:
                AbstractC3134z0.e(this, d8);
                return;
        }
    }
}
