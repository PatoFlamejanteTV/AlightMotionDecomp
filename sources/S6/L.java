package s6;

import U5.g;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class L implements g.c {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f39179a;

    public L(ThreadLocal threadLocal) {
        this.f39179a = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof L) && AbstractC3292y.d(this.f39179a, ((L) obj).f39179a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f39179a.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f39179a + ')';
    }
}
