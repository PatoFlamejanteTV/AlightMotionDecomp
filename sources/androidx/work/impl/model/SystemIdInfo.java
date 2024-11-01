package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.AbstractC3292y;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, primaryKeys = {"work_spec_id", "generation"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class SystemIdInfo {

    @ColumnInfo(defaultValue = MBridgeConstans.ENDCARD_URL_TYPE_PL)
    private final int generation;

    @ColumnInfo(name = "system_id")
    public final int systemId;

    @ColumnInfo(name = "work_spec_id")
    public final String workSpecId;

    public SystemIdInfo(String workSpecId, int i8, int i9) {
        AbstractC3292y.i(workSpecId, "workSpecId");
        this.workSpecId = workSpecId;
        this.generation = i8;
        this.systemId = i9;
    }

    public static /* synthetic */ SystemIdInfo copy$default(SystemIdInfo systemIdInfo, String str, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = systemIdInfo.workSpecId;
        }
        if ((i10 & 2) != 0) {
            i8 = systemIdInfo.generation;
        }
        if ((i10 & 4) != 0) {
            i9 = systemIdInfo.systemId;
        }
        return systemIdInfo.copy(str, i8, i9);
    }

    public final String component1() {
        return this.workSpecId;
    }

    public final int component2() {
        return this.generation;
    }

    public final int component3() {
        return this.systemId;
    }

    public final SystemIdInfo copy(String workSpecId, int i8, int i9) {
        AbstractC3292y.i(workSpecId, "workSpecId");
        return new SystemIdInfo(workSpecId, i8, i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        return AbstractC3292y.d(this.workSpecId, systemIdInfo.workSpecId) && this.generation == systemIdInfo.generation && this.systemId == systemIdInfo.systemId;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public int hashCode() {
        return (((this.workSpecId.hashCode() * 31) + this.generation) * 31) + this.systemId;
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.workSpecId + ", generation=" + this.generation + ", systemId=" + this.systemId + ')';
    }
}
