package androidx.compose.ui.input.pointer.util;

import androidx.collection.a;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DataPointAtTime {
    public static final int $stable = 8;
    private float dataPoint;
    private long time;

    public DataPointAtTime(long j8, float f8) {
        this.time = j8;
        this.dataPoint = f8;
    }

    public static /* synthetic */ DataPointAtTime copy$default(DataPointAtTime dataPointAtTime, long j8, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = dataPointAtTime.time;
        }
        if ((i8 & 2) != 0) {
            f8 = dataPointAtTime.dataPoint;
        }
        return dataPointAtTime.copy(j8, f8);
    }

    public final long component1() {
        return this.time;
    }

    public final float component2() {
        return this.dataPoint;
    }

    public final DataPointAtTime copy(long j8, float f8) {
        return new DataPointAtTime(j8, f8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPointAtTime)) {
            return false;
        }
        DataPointAtTime dataPointAtTime = (DataPointAtTime) obj;
        return this.time == dataPointAtTime.time && Float.compare(this.dataPoint, dataPointAtTime.dataPoint) == 0;
    }

    public final float getDataPoint() {
        return this.dataPoint;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (a.a(this.time) * 31) + Float.floatToIntBits(this.dataPoint);
    }

    public final void setDataPoint(float f8) {
        this.dataPoint = f8;
    }

    public final void setTime(long j8) {
        this.time = j8;
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.time + ", dataPoint=" + this.dataPoint + ')';
    }
}
