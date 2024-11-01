package J0;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f3871a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f3872b = new AtomicInteger();

    public void a() {
        this.f3872b.getAndIncrement();
    }

    public void b() {
        this.f3871a.getAndIncrement();
    }

    public void c() {
        this.f3872b.set(0);
    }
}
