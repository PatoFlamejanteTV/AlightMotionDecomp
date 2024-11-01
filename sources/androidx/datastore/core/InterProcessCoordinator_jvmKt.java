package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class InterProcessCoordinator_jvmKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(File file) {
        AbstractC3292y.i(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        AbstractC3292y.h(absolutePath, "file.canonicalFile.absolutePath");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(absolutePath);
    }
}
