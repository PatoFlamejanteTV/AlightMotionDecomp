package r6;

import java.util.concurrent.CancellationException;
import q6.InterfaceC3822g;

/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3931a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC3822g f38787a;

    public C3931a(InterfaceC3822g interfaceC3822g) {
        super("Flow was aborted, no more elements needed");
        this.f38787a = interfaceC3822g;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
