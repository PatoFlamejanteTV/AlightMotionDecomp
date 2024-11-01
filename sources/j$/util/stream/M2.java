package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Collection;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class M2 extends E2 {

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f33317d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33317d.add(obj);
    }

    @Override // j$.util.stream.AbstractC3076m2, j$.util.stream.InterfaceC3096q2
    public final void j() {
        AbstractC2998d.u(this.f33317d, this.f33256b);
        long size = this.f33317d.size();
        InterfaceC3096q2 interfaceC3096q2 = this.f33538a;
        interfaceC3096q2.k(size);
        if (this.f33257c) {
            Iterator it = this.f33317d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (interfaceC3096q2.m()) {
                    break;
                } else {
                    interfaceC3096q2.accept((InterfaceC3096q2) next);
                }
            }
        } else {
            ArrayList arrayList = this.f33317d;
            Objects.requireNonNull(interfaceC3096q2);
            Collection.EL.a(arrayList, new C3013a(2, interfaceC3096q2));
        }
        interfaceC3096q2.j();
        this.f33317d = null;
    }

    @Override // j$.util.stream.AbstractC3076m2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33317d = j8 >= 0 ? new ArrayList((int) j8) : new ArrayList();
    }
}
