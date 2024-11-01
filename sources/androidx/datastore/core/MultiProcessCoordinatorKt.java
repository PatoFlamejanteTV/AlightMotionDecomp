package androidx.datastore.core;

import U5.g;
import java.io.File;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class MultiProcessCoordinatorKt {
    public static final InterProcessCoordinator createMultiProcessCoordinator(g context, File file) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(file, "file");
        return new MultiProcessCoordinator(context, file);
    }
}
