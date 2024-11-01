package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class StartStopToken {
    private final WorkGenerationalId id;

    public StartStopToken(WorkGenerationalId id) {
        AbstractC3292y.i(id, "id");
        this.id = id;
    }

    public final WorkGenerationalId getId() {
        return this.id;
    }
}
