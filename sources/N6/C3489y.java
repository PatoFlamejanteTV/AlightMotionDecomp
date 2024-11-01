package n6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n6.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3489y extends F0 implements InterfaceC3487x {
    public C3489y(InterfaceC3488x0 interfaceC3488x0) {
        super(true);
        g0(interfaceC3488x0);
    }

    @Override // n6.InterfaceC3487x
    public boolean a(Throwable th) {
        return l0(new C3437C(th, false, 2, null));
    }

    @Override // n6.F0
    public boolean a0() {
        return true;
    }

    @Override // n6.U
    public Object g() {
        return W();
    }

    @Override // n6.U
    public Object h(U5.d dVar) {
        Object I8 = I(dVar);
        V5.b.e();
        return I8;
    }

    @Override // n6.InterfaceC3487x
    public boolean v(Object obj) {
        return l0(obj);
    }
}
