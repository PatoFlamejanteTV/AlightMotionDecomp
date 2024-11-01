package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class WorkInfo {
    public static final Companion Companion = new Companion(null);
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final int STOP_REASON_NOT_STOPPED = -256;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_UNKNOWN = -512;
    public static final int STOP_REASON_USER = 13;
    private final Constraints constraints;
    private final int generation;
    private final UUID id;
    private final long initialDelayMillis;
    private final long nextScheduleTimeMillis;
    private final Data outputData;
    private final PeriodicityInfo periodicityInfo;
    private final Data progress;
    private final int runAttemptCount;
    private final State state;
    private final int stopReason;
    private final Set<String> tags;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class PeriodicityInfo {
        private final long flexIntervalMillis;
        private final long repeatIntervalMillis;

        public PeriodicityInfo(long j8, long j9) {
            this.repeatIntervalMillis = j8;
            this.flexIntervalMillis = j9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !AbstractC3292y.d(PeriodicityInfo.class, obj.getClass())) {
                return false;
            }
            PeriodicityInfo periodicityInfo = (PeriodicityInfo) obj;
            if (periodicityInfo.repeatIntervalMillis == this.repeatIntervalMillis && periodicityInfo.flexIntervalMillis == this.flexIntervalMillis) {
                return true;
            }
            return false;
        }

        public final long getFlexIntervalMillis() {
            return this.flexIntervalMillis;
        }

        public final long getRepeatIntervalMillis() {
            return this.repeatIntervalMillis;
        }

        public int hashCode() {
            return (androidx.collection.a.a(this.repeatIntervalMillis) * 31) + androidx.collection.a.a(this.flexIntervalMillis);
        }

        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.repeatIntervalMillis + ", flexIntervalMillis=" + this.flexIntervalMillis + '}';
        }
    }

    /* loaded from: classes3.dex */
    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            if (this != SUCCEEDED && this != FAILED && this != CANCELLED) {
                return false;
            }
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags) {
        this(id, state, tags, null, null, 0, 0, null, 0L, null, 0L, 0, 4088, null);
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(tags, "tags");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC3292y.d(WorkInfo.class, obj.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.runAttemptCount != workInfo.runAttemptCount || this.generation != workInfo.generation || !AbstractC3292y.d(this.id, workInfo.id) || this.state != workInfo.state || !AbstractC3292y.d(this.outputData, workInfo.outputData) || !AbstractC3292y.d(this.constraints, workInfo.constraints) || this.initialDelayMillis != workInfo.initialDelayMillis || !AbstractC3292y.d(this.periodicityInfo, workInfo.periodicityInfo) || this.nextScheduleTimeMillis != workInfo.nextScheduleTimeMillis || this.stopReason != workInfo.stopReason || !AbstractC3292y.d(this.tags, workInfo.tags)) {
            return false;
        }
        return AbstractC3292y.d(this.progress, workInfo.progress);
    }

    public final Constraints getConstraints() {
        return this.constraints;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final UUID getId() {
        return this.id;
    }

    public final long getInitialDelayMillis() {
        return this.initialDelayMillis;
    }

    public final long getNextScheduleTimeMillis() {
        return this.nextScheduleTimeMillis;
    }

    public final Data getOutputData() {
        return this.outputData;
    }

    public final PeriodicityInfo getPeriodicityInfo() {
        return this.periodicityInfo;
    }

    public final Data getProgress() {
        return this.progress;
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    public final State getState() {
        return this.state;
    }

    @RequiresApi(31)
    public final int getStopReason() {
        return this.stopReason;
    }

    public final Set<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int i8;
        int hashCode = ((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.outputData.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode()) * 31) + this.runAttemptCount) * 31) + this.generation) * 31) + this.constraints.hashCode()) * 31) + androidx.collection.a.a(this.initialDelayMillis)) * 31;
        PeriodicityInfo periodicityInfo = this.periodicityInfo;
        if (periodicityInfo != null) {
            i8 = periodicityInfo.hashCode();
        } else {
            i8 = 0;
        }
        return ((((hashCode + i8) * 31) + androidx.collection.a.a(this.nextScheduleTimeMillis)) * 31) + this.stopReason;
    }

    public String toString() {
        return "WorkInfo{id='" + this.id + "', state=" + this.state + ", outputData=" + this.outputData + ", tags=" + this.tags + ", progress=" + this.progress + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", constraints=" + this.constraints + ", initialDelayMillis=" + this.initialDelayMillis + ", periodicityInfo=" + this.periodicityInfo + ", nextScheduleTimeMillis=" + this.nextScheduleTimeMillis + "}, stopReason=" + this.stopReason;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData) {
        this(id, state, tags, outputData, null, 0, 0, null, 0L, null, 0L, 0, 4080, null);
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(tags, "tags");
        AbstractC3292y.i(outputData, "outputData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress) {
        this(id, state, tags, outputData, progress, 0, 0, null, 0L, null, 0L, 0, 4064, null);
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(tags, "tags");
        AbstractC3292y.i(outputData, "outputData");
        AbstractC3292y.i(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i8) {
        this(id, state, tags, outputData, progress, i8, 0, null, 0L, null, 0L, 0, 4032, null);
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(tags, "tags");
        AbstractC3292y.i(outputData, "outputData");
        AbstractC3292y.i(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i8, int i9) {
        this(id, state, tags, outputData, progress, i8, i9, null, 0L, null, 0L, 0, 3968, null);
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(tags, "tags");
        AbstractC3292y.i(outputData, "outputData");
        AbstractC3292y.i(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i8, int i9, Constraints constraints) {
        this(id, state, tags, outputData, progress, i8, i9, constraints, 0L, null, 0L, 0, 3840, null);
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(tags, "tags");
        AbstractC3292y.i(outputData, "outputData");
        AbstractC3292y.i(progress, "progress");
        AbstractC3292y.i(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i8, int i9, Constraints constraints, long j8) {
        this(id, state, tags, outputData, progress, i8, i9, constraints, j8, null, 0L, 0, 3584, null);
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(tags, "tags");
        AbstractC3292y.i(outputData, "outputData");
        AbstractC3292y.i(progress, "progress");
        AbstractC3292y.i(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i8, int i9, Constraints constraints, long j8, PeriodicityInfo periodicityInfo) {
        this(id, state, tags, outputData, progress, i8, i9, constraints, j8, periodicityInfo, 0L, 0, 3072, null);
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(tags, "tags");
        AbstractC3292y.i(outputData, "outputData");
        AbstractC3292y.i(progress, "progress");
        AbstractC3292y.i(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i8, int i9, Constraints constraints, long j8, PeriodicityInfo periodicityInfo, long j9) {
        this(id, state, tags, outputData, progress, i8, i9, constraints, j8, periodicityInfo, j9, 0, 2048, null);
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(tags, "tags");
        AbstractC3292y.i(outputData, "outputData");
        AbstractC3292y.i(progress, "progress");
        AbstractC3292y.i(constraints, "constraints");
    }

    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i8, int i9, Constraints constraints, long j8, PeriodicityInfo periodicityInfo, long j9, int i10) {
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(tags, "tags");
        AbstractC3292y.i(outputData, "outputData");
        AbstractC3292y.i(progress, "progress");
        AbstractC3292y.i(constraints, "constraints");
        this.id = id;
        this.state = state;
        this.tags = tags;
        this.outputData = outputData;
        this.progress = progress;
        this.runAttemptCount = i8;
        this.generation = i9;
        this.constraints = constraints;
        this.initialDelayMillis = j8;
        this.periodicityInfo = periodicityInfo;
        this.nextScheduleTimeMillis = j9;
        this.stopReason = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ WorkInfo(java.util.UUID r19, androidx.work.WorkInfo.State r20, java.util.Set r21, androidx.work.Data r22, androidx.work.Data r23, int r24, int r25, androidx.work.Constraints r26, long r27, androidx.work.WorkInfo.PeriodicityInfo r29, long r30, int r32, int r33, kotlin.jvm.internal.AbstractC3284p r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 8
            java.lang.String r2 = "EMPTY"
            if (r1 == 0) goto Lf
            androidx.work.Data r1 = androidx.work.Data.EMPTY
            kotlin.jvm.internal.AbstractC3292y.h(r1, r2)
            r7 = r1
            goto L11
        Lf:
            r7 = r22
        L11:
            r1 = r0 & 16
            if (r1 == 0) goto L1c
            androidx.work.Data r1 = androidx.work.Data.EMPTY
            kotlin.jvm.internal.AbstractC3292y.h(r1, r2)
            r8 = r1
            goto L1e
        L1c:
            r8 = r23
        L1e:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L25
            r9 = 0
            goto L27
        L25:
            r9 = r24
        L27:
            r1 = r0 & 64
            if (r1 == 0) goto L2d
            r10 = 0
            goto L2f
        L2d:
            r10 = r25
        L2f:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L37
            androidx.work.Constraints r1 = androidx.work.Constraints.NONE
            r11 = r1
            goto L39
        L37:
            r11 = r26
        L39:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L41
            r1 = 0
            r12 = r1
            goto L43
        L41:
            r12 = r27
        L43:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L4a
            r1 = 0
            r14 = r1
            goto L4c
        L4a:
            r14 = r29
        L4c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L57
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = r1
            goto L59
        L57:
            r15 = r30
        L59:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L62
            r0 = -256(0xffffffffffffff00, float:NaN)
            r17 = -256(0xffffffffffffff00, float:NaN)
            goto L64
        L62:
            r17 = r32
        L64:
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.WorkInfo.<init>(java.util.UUID, androidx.work.WorkInfo$State, java.util.Set, androidx.work.Data, androidx.work.Data, int, int, androidx.work.Constraints, long, androidx.work.WorkInfo$PeriodicityInfo, long, int, int, kotlin.jvm.internal.p):void");
    }
}
