package androidx.datastore.core.okio;

import U6.Q;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.InterProcessCoordinatorKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class OkioStorageKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(Q path) {
        AbstractC3292y.i(path, "path");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(path.h().toString());
    }
}
