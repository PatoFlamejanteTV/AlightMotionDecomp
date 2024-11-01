package q6;

import c6.InterfaceC2072n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class z extends AbstractC3816a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2072n f37595a;

    public z(InterfaceC2072n interfaceC2072n) {
        this.f37595a = interfaceC2072n;
    }

    @Override // q6.AbstractC3816a
    public Object e(InterfaceC3822g interfaceC3822g, U5.d dVar) {
        Object invoke = this.f37595a.invoke(interfaceC3822g, dVar);
        if (invoke == V5.b.e()) {
            return invoke;
        }
        return Q5.I.f8786a;
    }
}
