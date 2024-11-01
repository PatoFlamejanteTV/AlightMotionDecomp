package s6;

/* renamed from: s6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3989i extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final transient U5.g f39194a;

    public C3989i(U5.g gVar) {
        this.f39194a = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f39194a.toString();
    }
}
