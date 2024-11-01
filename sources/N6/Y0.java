package n6;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class Y0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC3488x0 f35686a;

    public Y0(String str, InterfaceC3488x0 interfaceC3488x0) {
        super(str);
        this.f35686a = interfaceC3488x0;
    }

    public Y0(String str) {
        this(str, null);
    }
}
