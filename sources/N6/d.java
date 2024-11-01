package N6;

import K6.B;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Set f6830a = new LinkedHashSet();

    public synchronized void a(B b9) {
        this.f6830a.remove(b9);
    }

    public synchronized void b(B b9) {
        this.f6830a.add(b9);
    }

    public synchronized boolean c(B b9) {
        return this.f6830a.contains(b9);
    }
}
