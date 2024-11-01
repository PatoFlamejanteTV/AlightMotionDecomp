package V;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class j {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
