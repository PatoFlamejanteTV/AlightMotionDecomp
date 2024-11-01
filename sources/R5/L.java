package R5;

import d6.InterfaceC2767a;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class L implements Iterable, InterfaceC2767a {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f9303a;

    public L(Function0 iteratorFactory) {
        AbstractC3292y.i(iteratorFactory, "iteratorFactory");
        this.f9303a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new M((Iterator) this.f9303a.invoke());
    }
}
