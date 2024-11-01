package q0;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class O implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ N f36629a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f36630b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(N n8, Callable callable) {
        this.f36629a = n8;
        this.f36630b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f36629a.r(this.f36630b.call());
        } catch (Exception e8) {
            this.f36629a.q(e8);
        } catch (Throwable th) {
            this.f36629a.q(new RuntimeException(th));
        }
    }
}
