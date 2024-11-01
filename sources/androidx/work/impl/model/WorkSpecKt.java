package androidx.work.impl.model;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class WorkSpecKt {
    private static final long NOT_ENQUEUED = -1;

    public static final WorkGenerationalId generationalId(WorkSpec workSpec) {
        AbstractC3292y.i(workSpec, "<this>");
        return new WorkGenerationalId(workSpec.id, workSpec.getGeneration());
    }
}
