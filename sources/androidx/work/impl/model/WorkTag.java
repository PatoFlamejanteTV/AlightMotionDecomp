package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import kotlin.jvm.internal.AbstractC3292y;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {"tag", "work_spec_id"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class WorkTag {

    @ColumnInfo(name = "tag")
    private final String tag;

    @ColumnInfo(name = "work_spec_id")
    private final String workSpecId;

    public WorkTag(String tag, String workSpecId) {
        AbstractC3292y.i(tag, "tag");
        AbstractC3292y.i(workSpecId, "workSpecId");
        this.tag = tag;
        this.workSpecId = workSpecId;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
