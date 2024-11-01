package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.work.Data;
import kotlin.jvm.internal.AbstractC3292y;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class WorkProgress {

    @ColumnInfo(name = "progress")
    private final Data progress;

    @PrimaryKey
    @ColumnInfo(name = "work_spec_id")
    private final String workSpecId;

    public WorkProgress(String workSpecId, Data progress) {
        AbstractC3292y.i(workSpecId, "workSpecId");
        AbstractC3292y.i(progress, "progress");
        this.workSpecId = workSpecId;
        this.progress = progress;
    }

    public final Data getProgress() {
        return this.progress;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
