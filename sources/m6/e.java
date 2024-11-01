package M6;

import U6.AbstractC1456l;
import U6.C1449e;
import U6.X;
import java.io.IOException;

/* loaded from: classes5.dex */
abstract class e extends AbstractC1456l {

    /* renamed from: b, reason: collision with root package name */
    private boolean f6236b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(X x8) {
        super(x8);
    }

    protected abstract void a(IOException iOException);

    @Override // U6.AbstractC1456l, U6.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f6236b) {
            return;
        }
        try {
            super.close();
        } catch (IOException e8) {
            this.f6236b = true;
            a(e8);
        }
    }

    @Override // U6.AbstractC1456l, U6.X
    public void f(C1449e c1449e, long j8) {
        if (this.f6236b) {
            c1449e.skip(j8);
            return;
        }
        try {
            super.f(c1449e, j8);
        } catch (IOException e8) {
            this.f6236b = true;
            a(e8);
        }
    }

    @Override // U6.AbstractC1456l, U6.X, java.io.Flushable
    public void flush() {
        if (this.f6236b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e8) {
            this.f6236b = true;
            a(e8);
        }
    }
}
