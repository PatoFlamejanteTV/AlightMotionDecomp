package G;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f2734a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2735b;

    /* renamed from: c, reason: collision with root package name */
    final CountDownLatch f2736c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    boolean f2737d = false;

    public c(a aVar, long j8) {
        this.f2734a = new WeakReference(aVar);
        this.f2735b = j8;
        start();
    }

    private final void a() {
        a aVar = (a) this.f2734a.get();
        if (aVar != null) {
            aVar.c();
            this.f2737d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (!this.f2736c.await(this.f2735b, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException unused) {
            a();
        }
    }
}
