package H0;

import G0.g;
import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class c implements b, a {

    /* renamed from: a, reason: collision with root package name */
    private final e f3171a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3172b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f3173c;

    /* renamed from: e, reason: collision with root package name */
    private CountDownLatch f3175e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f3174d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f3176f = false;

    public c(e eVar, int i8, TimeUnit timeUnit) {
        this.f3171a = eVar;
        this.f3172b = i8;
        this.f3173c = timeUnit;
    }

    @Override // H0.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f3174d) {
            try {
                g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f3175e = new CountDownLatch(1);
                this.f3176f = false;
                this.f3171a.a(str, bundle);
                g.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f3175e.await(this.f3172b, this.f3173c)) {
                        this.f3176f = true;
                        g.f().i("App exception callback received from Analytics listener.");
                    } else {
                        g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f3175e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H0.b
    public void j(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f3175e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
