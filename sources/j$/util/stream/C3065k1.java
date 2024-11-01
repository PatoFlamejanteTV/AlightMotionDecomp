package j$.util.stream;

import j$.util.AbstractC2998d;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3065k1 extends AbstractC3080n1 implements j$.util.W {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2998d.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2998d.f(this, consumer);
    }
}
