package N;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class L extends N {

    /* renamed from: f, reason: collision with root package name */
    private final Callable f6342f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ L(Callable callable, K k8) {
        super();
        this.f6342f = callable;
    }

    @Override // N.N
    final String a() {
        try {
            return (String) this.f6342f.call();
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }
}
