package k6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: k6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3249a implements InterfaceC3255g {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f34510a;

    public C3249a(InterfaceC3255g sequence) {
        AbstractC3292y.i(sequence, "sequence");
        this.f34510a = new AtomicReference(sequence);
    }

    @Override // k6.InterfaceC3255g
    public Iterator iterator() {
        InterfaceC3255g interfaceC3255g = (InterfaceC3255g) this.f34510a.getAndSet(null);
        if (interfaceC3255g != null) {
            return interfaceC3255g.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
