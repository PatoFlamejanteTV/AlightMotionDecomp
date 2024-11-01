package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3102s implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3096q2 f33575a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        this.f33575a.accept(d8);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }
}
