package K6;

import U6.C1449e;
import U6.InterfaceC1451g;
import java.io.Closeable;

/* loaded from: classes5.dex */
public abstract class A implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a extends A {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f4817a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1451g f4818b;

        a(t tVar, long j8, InterfaceC1451g interfaceC1451g) {
            this.f4817a = j8;
            this.f4818b = interfaceC1451g;
        }

        @Override // K6.A
        public long a() {
            return this.f4817a;
        }

        @Override // K6.A
        public InterfaceC1451g h() {
            return this.f4818b;
        }
    }

    public static A b(t tVar, long j8, InterfaceC1451g interfaceC1451g) {
        if (interfaceC1451g != null) {
            return new a(tVar, j8, interfaceC1451g);
        }
        throw new NullPointerException("source == null");
    }

    public static A g(t tVar, byte[] bArr) {
        return b(tVar, bArr.length, new C1449e().write(bArr));
    }

    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        L6.c.d(h());
    }

    public abstract InterfaceC1451g h();
}
