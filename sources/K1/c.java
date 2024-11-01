package K1;

import K1.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f4566a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f4567b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f4568c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private b f4569d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f4566a = linkedBlockingQueue;
        this.f4567b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void b() {
        b bVar = (b) this.f4568c.poll();
        this.f4569d = bVar;
        if (bVar != null) {
            bVar.c(this.f4567b);
        }
    }

    @Override // K1.b.a
    public void a(b bVar) {
        this.f4569d = null;
        b();
    }

    public void c(b bVar) {
        bVar.a(this);
        this.f4568c.add(bVar);
        if (this.f4569d == null) {
            b();
        }
    }
}
