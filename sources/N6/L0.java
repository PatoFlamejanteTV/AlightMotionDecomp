package n6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class L0 extends U5.a implements InterfaceC3488x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final L0 f35665a = new L0();

    private L0() {
        super(InterfaceC3488x0.f35757n0);
    }

    @Override // n6.InterfaceC3488x0
    public InterfaceC3481u B(InterfaceC3485w interfaceC3485w) {
        return M0.f35666a;
    }

    @Override // n6.InterfaceC3488x0
    public boolean b() {
        return false;
    }

    @Override // n6.InterfaceC3488x0
    public InterfaceC3488x0 getParent() {
        return null;
    }

    @Override // n6.InterfaceC3488x0
    public boolean isActive() {
        return true;
    }

    @Override // n6.InterfaceC3488x0
    public boolean isCancelled() {
        return false;
    }

    @Override // n6.InterfaceC3488x0
    public Object k(U5.d dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // n6.InterfaceC3488x0
    public InterfaceC3449d0 p(boolean z8, boolean z9, Function1 function1) {
        return M0.f35666a;
    }

    @Override // n6.InterfaceC3488x0
    public CancellationException q() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // n6.InterfaceC3488x0
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // n6.InterfaceC3488x0
    public InterfaceC3449d0 u(Function1 function1) {
        return M0.f35666a;
    }

    @Override // n6.InterfaceC3488x0
    public void cancel(CancellationException cancellationException) {
    }
}
