package u6;

import n6.I;
import s6.AbstractC3994n;

/* renamed from: u6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4092c extends AbstractC4095f {

    /* renamed from: g, reason: collision with root package name */
    public static final C4092c f40357g = new C4092c();

    private C4092c() {
        super(AbstractC4101l.f40370c, AbstractC4101l.f40371d, AbstractC4101l.f40372e, AbstractC4101l.f40368a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // n6.I
    public I limitedParallelism(int i8) {
        AbstractC3994n.a(i8);
        if (i8 >= AbstractC4101l.f40370c) {
            return this;
        }
        return super.limitedParallelism(i8);
    }

    @Override // n6.I
    public String toString() {
        return "Dispatchers.Default";
    }
}
