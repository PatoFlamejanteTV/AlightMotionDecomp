package U6;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes5.dex */
public interface X extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void f(C1449e c1449e, long j8);

    void flush();

    a0 timeout();
}
