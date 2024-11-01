package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3007m implements Iterator, InterfaceC3143z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33203a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f33204b;

    public C3007m(C3008n c3008n) {
        this.f33204b = c3008n.f33209a.iterator();
    }

    public C3007m(C3137t c3137t) {
        this.f33204b = c3137t.f33209a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC3143z
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f33203a) {
            case 0:
                AbstractC2998d.r(this.f33204b, consumer);
                return;
            default:
                AbstractC2998d.r(this.f33204b, new C3011q(consumer));
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f33203a) {
            case 0:
                return this.f33204b.hasNext();
            default:
                return this.f33204b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f33203a) {
            case 0:
                return this.f33204b.next();
            default:
                return new r((Map.Entry) this.f33204b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f33203a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
