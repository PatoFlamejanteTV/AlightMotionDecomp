package androidx.work.impl.model;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class WorkGenerationalId {
    private final int generation;
    private final String workSpecId;

    public WorkGenerationalId(String workSpecId, int i8) {
        AbstractC3292y.i(workSpecId, "workSpecId");
        this.workSpecId = workSpecId;
        this.generation = i8;
    }

    public static /* synthetic */ WorkGenerationalId copy$default(WorkGenerationalId workGenerationalId, String str, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = workGenerationalId.workSpecId;
        }
        if ((i9 & 2) != 0) {
            i8 = workGenerationalId.generation;
        }
        return workGenerationalId.copy(str, i8);
    }

    public final String component1() {
        return this.workSpecId;
    }

    public final int component2() {
        return this.generation;
    }

    public final WorkGenerationalId copy(String workSpecId, int i8) {
        AbstractC3292y.i(workSpecId, "workSpecId");
        return new WorkGenerationalId(workSpecId, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkGenerationalId)) {
            return false;
        }
        WorkGenerationalId workGenerationalId = (WorkGenerationalId) obj;
        return AbstractC3292y.d(this.workSpecId, workGenerationalId.workSpecId) && this.generation == workGenerationalId.generation;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }

    public int hashCode() {
        return (this.workSpecId.hashCode() * 31) + this.generation;
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.workSpecId + ", generation=" + this.generation + ')';
    }
}
