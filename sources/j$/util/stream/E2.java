package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class E2 extends AbstractC3076m2 {

    /* renamed from: b, reason: collision with root package name */
    protected final Comparator f33256b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f33257c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E2(InterfaceC3096q2 interfaceC3096q2, Comparator comparator) {
        super(interfaceC3096q2);
        this.f33256b = comparator;
    }

    @Override // j$.util.stream.AbstractC3076m2, j$.util.stream.InterfaceC3096q2
    public final boolean m() {
        this.f33257c = true;
        return false;
    }
}
