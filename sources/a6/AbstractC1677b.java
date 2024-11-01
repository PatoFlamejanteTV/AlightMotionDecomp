package a6;

import Q5.AbstractC1410e;
import java.io.Closeable;

/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1677b {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC1410e.a(th, th2);
            }
        }
    }
}
