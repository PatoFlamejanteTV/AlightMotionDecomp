package u;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
abstract class j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        return new n(Executors.newSingleThreadExecutor());
    }
}
