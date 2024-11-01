package U6;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b f10185d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f10186e = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f10187a;

    /* renamed from: b, reason: collision with root package name */
    private long f10188b;

    /* renamed from: c, reason: collision with root package name */
    private long f10189c;

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public a0 a() {
        this.f10187a = false;
        return this;
    }

    public a0 b() {
        this.f10189c = 0L;
        return this;
    }

    public long c() {
        if (this.f10187a) {
            return this.f10188b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public a0 d(long j8) {
        this.f10187a = true;
        this.f10188b = j8;
        return this;
    }

    public boolean e() {
        return this.f10187a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f10187a && this.f10188b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public a0 g(long j8, TimeUnit unit) {
        AbstractC3292y.i(unit, "unit");
        if (j8 >= 0) {
            this.f10189c = unit.toNanos(j8);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j8).toString());
    }

    public long h() {
        return this.f10189c;
    }

    /* loaded from: classes5.dex */
    public static final class a extends a0 {
        a() {
        }

        @Override // U6.a0
        public a0 g(long j8, TimeUnit unit) {
            AbstractC3292y.i(unit, "unit");
            return this;
        }

        @Override // U6.a0
        public void f() {
        }

        @Override // U6.a0
        public a0 d(long j8) {
            return this;
        }
    }
}
