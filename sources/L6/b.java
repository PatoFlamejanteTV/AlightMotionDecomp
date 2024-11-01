package L6;

/* loaded from: classes5.dex */
public abstract class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected final String f5409a;

    public b(String str, Object... objArr) {
        this.f5409a = c.o(str, objArr);
    }

    protected abstract void e();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f5409a);
        try {
            e();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
