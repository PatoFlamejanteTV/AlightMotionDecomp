package androidx.work.impl.model;

import R5.AbstractC1435t;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import i6.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"last_enqueue_time"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class WorkSpec {
    public static final Companion Companion = new Companion(null);
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final String TAG;
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER;

    @ColumnInfo(name = "backoff_delay_duration")
    public long backoffDelayDuration;

    @ColumnInfo(name = "backoff_policy")
    public BackoffPolicy backoffPolicy;

    @Embedded
    public Constraints constraints;

    @ColumnInfo(name = "run_in_foreground")
    public boolean expedited;

    @ColumnInfo(name = "flex_duration")
    public long flexDuration;

    @ColumnInfo(defaultValue = MBridgeConstans.ENDCARD_URL_TYPE_PL)
    private final int generation;

    @PrimaryKey
    @ColumnInfo(name = "id")
    public final String id;

    @ColumnInfo(name = "initial_delay")
    public long initialDelay;

    @ColumnInfo(name = "input")
    public Data input;

    @ColumnInfo(name = "input_merger_class_name")
    public String inputMergerClassName;

    @ColumnInfo(name = "interval_duration")
    public long intervalDuration;

    @ColumnInfo(defaultValue = "-1", name = "last_enqueue_time")
    public long lastEnqueueTime;

    @ColumnInfo(name = "minimum_retention_duration")
    public long minimumRetentionDuration;

    @ColumnInfo(defaultValue = "9223372036854775807", name = "next_schedule_time_override")
    private long nextScheduleTimeOverride;

    @ColumnInfo(defaultValue = MBridgeConstans.ENDCARD_URL_TYPE_PL, name = "next_schedule_time_override_generation")
    private int nextScheduleTimeOverrideGeneration;

    @ColumnInfo(name = "out_of_quota_policy")
    public OutOfQuotaPolicy outOfQuotaPolicy;

    @ColumnInfo(name = "output")
    public Data output;

    @ColumnInfo(defaultValue = MBridgeConstans.ENDCARD_URL_TYPE_PL, name = "period_count")
    private int periodCount;

    @ColumnInfo(name = "run_attempt_count")
    public int runAttemptCount;

    @ColumnInfo(name = "schedule_requested_at")
    public long scheduleRequestedAt;

    @ColumnInfo(name = "state")
    public WorkInfo.State state;

    @ColumnInfo(defaultValue = "-256", name = "stop_reason")
    private final int stopReason;

    @ColumnInfo(name = "worker_class_name")
    public String workerClassName;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final long calculateNextRunTime(boolean z8, int i8, BackoffPolicy backoffPolicy, long j8, long j9, int i9, boolean z9, long j10, long j11, long j12, long j13) {
            long j14;
            long scalb;
            AbstractC3292y.i(backoffPolicy, "backoffPolicy");
            if (j13 != Long.MAX_VALUE && z9) {
                if (i9 == 0) {
                    return j13;
                }
                return m.e(j13, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS + j9);
            }
            if (z8) {
                if (backoffPolicy == BackoffPolicy.LINEAR) {
                    scalb = i8 * j8;
                } else {
                    scalb = Math.scalb((float) j8, i8 - 1);
                }
                return j9 + m.h(scalb, WorkRequest.MAX_BACKOFF_MILLIS);
            }
            if (z9) {
                if (i9 == 0) {
                    j14 = j9 + j10;
                } else {
                    j14 = j9 + j12;
                }
                if (j11 != j12 && i9 == 0) {
                    j14 += j12 - j11;
                }
                return j14;
            }
            if (j9 == -1) {
                return Long.MAX_VALUE;
            }
            return j9 + j10;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class IdAndState {

        @ColumnInfo(name = "id")
        public String id;

        @ColumnInfo(name = "state")
        public WorkInfo.State state;

        public IdAndState(String id, WorkInfo.State state) {
            AbstractC3292y.i(id, "id");
            AbstractC3292y.i(state, "state");
            this.id = id;
            this.state = state;
        }

        public static /* synthetic */ IdAndState copy$default(IdAndState idAndState, String str, WorkInfo.State state, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = idAndState.id;
            }
            if ((i8 & 2) != 0) {
                state = idAndState.state;
            }
            return idAndState.copy(str, state);
        }

        public final String component1() {
            return this.id;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final IdAndState copy(String id, WorkInfo.State state) {
            AbstractC3292y.i(id, "id");
            AbstractC3292y.i(state, "state");
            return new IdAndState(id, state);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            return AbstractC3292y.d(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }
    }

    static {
        String tagWithPrefix = Logger.tagWithPrefix("WorkSpec");
        AbstractC3292y.h(tagWithPrefix, "tagWithPrefix(\"WorkSpec\")");
        TAG = tagWithPrefix;
        WORK_INFO_MAPPER = new Function() { // from class: androidx.work.impl.model.b
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                List WORK_INFO_MAPPER$lambda$1;
                WORK_INFO_MAPPER$lambda$1 = WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
                return WORK_INFO_MAPPER$lambda$1;
            }
        };
    }

    public WorkSpec(String id, WorkInfo.State state, String workerClassName, String inputMergerClassName, Data input, Data output, long j8, long j9, long j10, Constraints constraints, @IntRange(from = 0) int i8, BackoffPolicy backoffPolicy, long j11, long j12, long j13, long j14, boolean z8, OutOfQuotaPolicy outOfQuotaPolicy, int i9, int i10, long j15, int i11, int i12) {
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(workerClassName, "workerClassName");
        AbstractC3292y.i(inputMergerClassName, "inputMergerClassName");
        AbstractC3292y.i(input, "input");
        AbstractC3292y.i(output, "output");
        AbstractC3292y.i(constraints, "constraints");
        AbstractC3292y.i(backoffPolicy, "backoffPolicy");
        AbstractC3292y.i(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = id;
        this.state = state;
        this.workerClassName = workerClassName;
        this.inputMergerClassName = inputMergerClassName;
        this.input = input;
        this.output = output;
        this.initialDelay = j8;
        this.intervalDuration = j9;
        this.flexDuration = j10;
        this.constraints = constraints;
        this.runAttemptCount = i8;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j11;
        this.lastEnqueueTime = j12;
        this.minimumRetentionDuration = j13;
        this.scheduleRequestedAt = j14;
        this.expedited = z8;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i9;
        this.generation = i10;
        this.nextScheduleTimeOverride = j15;
        this.nextScheduleTimeOverrideGeneration = i11;
        this.stopReason = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List WORK_INFO_MAPPER$lambda$1(List list) {
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((WorkInfoPojo) it.next()).toWorkInfo());
            }
            return arrayList;
        }
        return null;
    }

    public static /* synthetic */ WorkSpec copy$default(WorkSpec workSpec, String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j8, long j9, long j10, Constraints constraints, int i8, BackoffPolicy backoffPolicy, long j11, long j12, long j13, long j14, boolean z8, OutOfQuotaPolicy outOfQuotaPolicy, int i9, int i10, long j15, int i11, int i12, int i13, Object obj) {
        String str4 = (i13 & 1) != 0 ? workSpec.id : str;
        WorkInfo.State state2 = (i13 & 2) != 0 ? workSpec.state : state;
        String str5 = (i13 & 4) != 0 ? workSpec.workerClassName : str2;
        String str6 = (i13 & 8) != 0 ? workSpec.inputMergerClassName : str3;
        Data data3 = (i13 & 16) != 0 ? workSpec.input : data;
        Data data4 = (i13 & 32) != 0 ? workSpec.output : data2;
        long j16 = (i13 & 64) != 0 ? workSpec.initialDelay : j8;
        long j17 = (i13 & 128) != 0 ? workSpec.intervalDuration : j9;
        long j18 = (i13 & 256) != 0 ? workSpec.flexDuration : j10;
        Constraints constraints2 = (i13 & 512) != 0 ? workSpec.constraints : constraints;
        return workSpec.copy(str4, state2, str5, str6, data3, data4, j16, j17, j18, constraints2, (i13 & 1024) != 0 ? workSpec.runAttemptCount : i8, (i13 & 2048) != 0 ? workSpec.backoffPolicy : backoffPolicy, (i13 & 4096) != 0 ? workSpec.backoffDelayDuration : j11, (i13 & 8192) != 0 ? workSpec.lastEnqueueTime : j12, (i13 & 16384) != 0 ? workSpec.minimumRetentionDuration : j13, (i13 & 32768) != 0 ? workSpec.scheduleRequestedAt : j14, (i13 & 65536) != 0 ? workSpec.expedited : z8, (131072 & i13) != 0 ? workSpec.outOfQuotaPolicy : outOfQuotaPolicy, (i13 & 262144) != 0 ? workSpec.periodCount : i9, (i13 & 524288) != 0 ? workSpec.generation : i10, (i13 & 1048576) != 0 ? workSpec.nextScheduleTimeOverride : j15, (i13 & 2097152) != 0 ? workSpec.nextScheduleTimeOverrideGeneration : i11, (i13 & 4194304) != 0 ? workSpec.stopReason : i12);
    }

    public final long calculateNextRunTime() {
        return Companion.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    public final String component1() {
        return this.id;
    }

    public final Constraints component10() {
        return this.constraints;
    }

    public final int component11() {
        return this.runAttemptCount;
    }

    public final BackoffPolicy component12() {
        return this.backoffPolicy;
    }

    public final long component13() {
        return this.backoffDelayDuration;
    }

    public final long component14() {
        return this.lastEnqueueTime;
    }

    public final long component15() {
        return this.minimumRetentionDuration;
    }

    public final long component16() {
        return this.scheduleRequestedAt;
    }

    public final boolean component17() {
        return this.expedited;
    }

    public final OutOfQuotaPolicy component18() {
        return this.outOfQuotaPolicy;
    }

    public final int component19() {
        return this.periodCount;
    }

    public final WorkInfo.State component2() {
        return this.state;
    }

    public final int component20() {
        return this.generation;
    }

    public final long component21() {
        return this.nextScheduleTimeOverride;
    }

    public final int component22() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    public final int component23() {
        return this.stopReason;
    }

    public final String component3() {
        return this.workerClassName;
    }

    public final String component4() {
        return this.inputMergerClassName;
    }

    public final Data component5() {
        return this.input;
    }

    public final Data component6() {
        return this.output;
    }

    public final long component7() {
        return this.initialDelay;
    }

    public final long component8() {
        return this.intervalDuration;
    }

    public final long component9() {
        return this.flexDuration;
    }

    public final WorkSpec copy(String id, WorkInfo.State state, String workerClassName, String inputMergerClassName, Data input, Data output, long j8, long j9, long j10, Constraints constraints, @IntRange(from = 0) int i8, BackoffPolicy backoffPolicy, long j11, long j12, long j13, long j14, boolean z8, OutOfQuotaPolicy outOfQuotaPolicy, int i9, int i10, long j15, int i11, int i12) {
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(workerClassName, "workerClassName");
        AbstractC3292y.i(inputMergerClassName, "inputMergerClassName");
        AbstractC3292y.i(input, "input");
        AbstractC3292y.i(output, "output");
        AbstractC3292y.i(constraints, "constraints");
        AbstractC3292y.i(backoffPolicy, "backoffPolicy");
        AbstractC3292y.i(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new WorkSpec(id, state, workerClassName, inputMergerClassName, input, output, j8, j9, j10, constraints, i8, backoffPolicy, j11, j12, j13, j14, z8, outOfQuotaPolicy, i9, i10, j15, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        return AbstractC3292y.d(this.id, workSpec.id) && this.state == workSpec.state && AbstractC3292y.d(this.workerClassName, workSpec.workerClassName) && AbstractC3292y.d(this.inputMergerClassName, workSpec.inputMergerClassName) && AbstractC3292y.d(this.input, workSpec.input) && AbstractC3292y.d(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && AbstractC3292y.d(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation && this.nextScheduleTimeOverride == workSpec.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == workSpec.nextScheduleTimeOverrideGeneration && this.stopReason == workSpec.stopReason;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final int getStopReason() {
        return this.stopReason;
    }

    public final boolean hasConstraints() {
        return !AbstractC3292y.d(Constraints.NONE, this.constraints);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31) + this.inputMergerClassName.hashCode()) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + androidx.collection.a.a(this.initialDelay)) * 31) + androidx.collection.a.a(this.intervalDuration)) * 31) + androidx.collection.a.a(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + this.runAttemptCount) * 31) + this.backoffPolicy.hashCode()) * 31) + androidx.collection.a.a(this.backoffDelayDuration)) * 31) + androidx.collection.a.a(this.lastEnqueueTime)) * 31) + androidx.collection.a.a(this.minimumRetentionDuration)) * 31) + androidx.collection.a.a(this.scheduleRequestedAt)) * 31;
        boolean z8 = this.expedited;
        int i8 = z8;
        if (z8 != 0) {
            i8 = 1;
        }
        return ((((((((((((hashCode + i8) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + this.periodCount) * 31) + this.generation) * 31) + androidx.collection.a.a(this.nextScheduleTimeOverride)) * 31) + this.nextScheduleTimeOverrideGeneration) * 31) + this.stopReason;
    }

    public final boolean isBackedOff() {
        if (this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0) {
            return true;
        }
        return false;
    }

    public final boolean isPeriodic() {
        if (this.intervalDuration != 0) {
            return true;
        }
        return false;
    }

    public final void setBackoffDelayDuration(long j8) {
        if (j8 > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value");
        }
        if (j8 < WorkRequest.MIN_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = m.m(j8, WorkRequest.MIN_BACKOFF_MILLIS, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final void setNextScheduleTimeOverride(long j8) {
        this.nextScheduleTimeOverride = j8;
    }

    public final void setNextScheduleTimeOverrideGeneration(int i8) {
        this.nextScheduleTimeOverrideGeneration = i8;
    }

    public final void setPeriodCount(int i8) {
        this.periodCount = i8;
    }

    public final void setPeriodic(long j8) {
        if (j8 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        setPeriodic(m.e(j8, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS), m.e(j8, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS));
    }

    public String toString() {
        return "{WorkSpec: " + this.id + '}';
    }

    public final void setPeriodic(long j8, long j9) {
        if (j8 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = m.e(j8, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        if (j9 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            Logger.get().warning(TAG, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j9 > this.intervalDuration) {
            Logger.get().warning(TAG, "Flex duration greater than interval duration; Changed to " + j8);
        }
        this.flexDuration = m.m(j9, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS, this.intervalDuration);
    }

    /* loaded from: classes3.dex */
    public static final class WorkInfoPojo {

        @ColumnInfo(name = "backoff_delay_duration")
        private long backoffDelayDuration;

        @ColumnInfo(name = "backoff_policy")
        private BackoffPolicy backoffPolicy;

        @Embedded
        private final Constraints constraints;

        @ColumnInfo(name = "flex_duration")
        private final long flexDuration;

        @ColumnInfo(name = "generation")
        private final int generation;

        @ColumnInfo(name = "id")
        private final String id;

        @ColumnInfo(name = "initial_delay")
        private final long initialDelay;

        @ColumnInfo(name = "interval_duration")
        private final long intervalDuration;

        @ColumnInfo(name = "last_enqueue_time")
        private long lastEnqueueTime;

        @ColumnInfo(name = "next_schedule_time_override")
        private final long nextScheduleTimeOverride;

        @ColumnInfo(name = "output")
        private final Data output;

        @ColumnInfo(defaultValue = MBridgeConstans.ENDCARD_URL_TYPE_PL, name = "period_count")
        private int periodCount;

        @Relation(entity = WorkProgress.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        private final List<Data> progress;

        @ColumnInfo(name = "run_attempt_count")
        private final int runAttemptCount;

        @ColumnInfo(name = "state")
        private final WorkInfo.State state;

        @ColumnInfo(name = "stop_reason")
        private final int stopReason;

        @Relation(entity = WorkTag.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        private final List<String> tags;

        public WorkInfoPojo(String id, WorkInfo.State state, Data output, long j8, long j9, long j10, Constraints constraints, int i8, BackoffPolicy backoffPolicy, long j11, long j12, int i9, int i10, long j13, int i11, List<String> tags, List<Data> progress) {
            AbstractC3292y.i(id, "id");
            AbstractC3292y.i(state, "state");
            AbstractC3292y.i(output, "output");
            AbstractC3292y.i(constraints, "constraints");
            AbstractC3292y.i(backoffPolicy, "backoffPolicy");
            AbstractC3292y.i(tags, "tags");
            AbstractC3292y.i(progress, "progress");
            this.id = id;
            this.state = state;
            this.output = output;
            this.initialDelay = j8;
            this.intervalDuration = j9;
            this.flexDuration = j10;
            this.constraints = constraints;
            this.runAttemptCount = i8;
            this.backoffPolicy = backoffPolicy;
            this.backoffDelayDuration = j11;
            this.lastEnqueueTime = j12;
            this.periodCount = i9;
            this.generation = i10;
            this.nextScheduleTimeOverride = j13;
            this.stopReason = i11;
            this.tags = tags;
            this.progress = progress;
        }

        private final long calculateNextRunTimeMillis() {
            if (this.state == WorkInfo.State.ENQUEUED) {
                return WorkSpec.Companion.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
            }
            return Long.MAX_VALUE;
        }

        private final WorkInfo.PeriodicityInfo getPeriodicityOrNull() {
            long j8 = this.intervalDuration;
            if (j8 != 0) {
                return new WorkInfo.PeriodicityInfo(j8, this.flexDuration);
            }
            return null;
        }

        public final String component1() {
            return this.id;
        }

        public final long component10() {
            return this.backoffDelayDuration;
        }

        public final long component11() {
            return this.lastEnqueueTime;
        }

        public final int component12() {
            return this.periodCount;
        }

        public final int component13() {
            return this.generation;
        }

        public final long component14() {
            return this.nextScheduleTimeOverride;
        }

        public final int component15() {
            return this.stopReason;
        }

        public final List<String> component16() {
            return this.tags;
        }

        public final List<Data> component17() {
            return this.progress;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final Data component3() {
            return this.output;
        }

        public final long component4() {
            return this.initialDelay;
        }

        public final long component5() {
            return this.intervalDuration;
        }

        public final long component6() {
            return this.flexDuration;
        }

        public final Constraints component7() {
            return this.constraints;
        }

        public final int component8() {
            return this.runAttemptCount;
        }

        public final BackoffPolicy component9() {
            return this.backoffPolicy;
        }

        public final WorkInfoPojo copy(String id, WorkInfo.State state, Data output, long j8, long j9, long j10, Constraints constraints, int i8, BackoffPolicy backoffPolicy, long j11, long j12, int i9, int i10, long j13, int i11, List<String> tags, List<Data> progress) {
            AbstractC3292y.i(id, "id");
            AbstractC3292y.i(state, "state");
            AbstractC3292y.i(output, "output");
            AbstractC3292y.i(constraints, "constraints");
            AbstractC3292y.i(backoffPolicy, "backoffPolicy");
            AbstractC3292y.i(tags, "tags");
            AbstractC3292y.i(progress, "progress");
            return new WorkInfoPojo(id, state, output, j8, j9, j10, constraints, i8, backoffPolicy, j11, j12, i9, i10, j13, i11, tags, progress);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            return AbstractC3292y.d(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && AbstractC3292y.d(this.output, workInfoPojo.output) && this.initialDelay == workInfoPojo.initialDelay && this.intervalDuration == workInfoPojo.intervalDuration && this.flexDuration == workInfoPojo.flexDuration && AbstractC3292y.d(this.constraints, workInfoPojo.constraints) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.backoffPolicy == workInfoPojo.backoffPolicy && this.backoffDelayDuration == workInfoPojo.backoffDelayDuration && this.lastEnqueueTime == workInfoPojo.lastEnqueueTime && this.periodCount == workInfoPojo.periodCount && this.generation == workInfoPojo.generation && this.nextScheduleTimeOverride == workInfoPojo.nextScheduleTimeOverride && this.stopReason == workInfoPojo.stopReason && AbstractC3292y.d(this.tags, workInfoPojo.tags) && AbstractC3292y.d(this.progress, workInfoPojo.progress);
        }

        public final long getBackoffDelayDuration() {
            return this.backoffDelayDuration;
        }

        public final BackoffPolicy getBackoffPolicy() {
            return this.backoffPolicy;
        }

        public final Constraints getConstraints() {
            return this.constraints;
        }

        public final long getFlexDuration() {
            return this.flexDuration;
        }

        public final int getGeneration() {
            return this.generation;
        }

        public final String getId() {
            return this.id;
        }

        public final long getInitialDelay() {
            return this.initialDelay;
        }

        public final long getIntervalDuration() {
            return this.intervalDuration;
        }

        public final long getLastEnqueueTime() {
            return this.lastEnqueueTime;
        }

        public final long getNextScheduleTimeOverride() {
            return this.nextScheduleTimeOverride;
        }

        public final Data getOutput() {
            return this.output;
        }

        public final int getPeriodCount() {
            return this.periodCount;
        }

        public final List<Data> getProgress() {
            return this.progress;
        }

        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        public final WorkInfo.State getState() {
            return this.state;
        }

        public final int getStopReason() {
            return this.stopReason;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + androidx.collection.a.a(this.initialDelay)) * 31) + androidx.collection.a.a(this.intervalDuration)) * 31) + androidx.collection.a.a(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + this.runAttemptCount) * 31) + this.backoffPolicy.hashCode()) * 31) + androidx.collection.a.a(this.backoffDelayDuration)) * 31) + androidx.collection.a.a(this.lastEnqueueTime)) * 31) + this.periodCount) * 31) + this.generation) * 31) + androidx.collection.a.a(this.nextScheduleTimeOverride)) * 31) + this.stopReason) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        public final boolean isBackedOff() {
            if (this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0) {
                return true;
            }
            return false;
        }

        public final boolean isPeriodic() {
            if (this.intervalDuration != 0) {
                return true;
            }
            return false;
        }

        public final void setBackoffDelayDuration(long j8) {
            this.backoffDelayDuration = j8;
        }

        public final void setBackoffPolicy(BackoffPolicy backoffPolicy) {
            AbstractC3292y.i(backoffPolicy, "<set-?>");
            this.backoffPolicy = backoffPolicy;
        }

        public final void setLastEnqueueTime(long j8) {
            this.lastEnqueueTime = j8;
        }

        public final void setPeriodCount(int i8) {
            this.periodCount = i8;
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", initialDelay=" + this.initialDelay + ", intervalDuration=" + this.intervalDuration + ", flexDuration=" + this.flexDuration + ", constraints=" + this.constraints + ", runAttemptCount=" + this.runAttemptCount + ", backoffPolicy=" + this.backoffPolicy + ", backoffDelayDuration=" + this.backoffDelayDuration + ", lastEnqueueTime=" + this.lastEnqueueTime + ", periodCount=" + this.periodCount + ", generation=" + this.generation + ", nextScheduleTimeOverride=" + this.nextScheduleTimeOverride + ", stopReason=" + this.stopReason + ", tags=" + this.tags + ", progress=" + this.progress + ')';
        }

        public final WorkInfo toWorkInfo() {
            Data data;
            if (!this.progress.isEmpty()) {
                data = this.progress.get(0);
            } else {
                data = Data.EMPTY;
            }
            Data progress = data;
            UUID fromString = UUID.fromString(this.id);
            AbstractC3292y.h(fromString, "fromString(id)");
            WorkInfo.State state = this.state;
            HashSet hashSet = new HashSet(this.tags);
            Data data2 = this.output;
            AbstractC3292y.h(progress, "progress");
            return new WorkInfo(fromString, state, hashSet, data2, progress, this.runAttemptCount, this.generation, this.constraints, this.initialDelay, getPeriodicityOrNull(), calculateNextRunTimeMillis(), this.stopReason);
        }

        public /* synthetic */ WorkInfoPojo(String str, WorkInfo.State state, Data data, long j8, long j9, long j10, Constraints constraints, int i8, BackoffPolicy backoffPolicy, long j11, long j12, int i9, int i10, long j13, int i11, List list, List list2, int i12, AbstractC3284p abstractC3284p) {
            this(str, state, data, (i12 & 8) != 0 ? 0L : j8, (i12 & 16) != 0 ? 0L : j9, (i12 & 32) != 0 ? 0L : j10, constraints, i8, (i12 & 256) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i12 & 512) != 0 ? 30000L : j11, (i12 & 1024) != 0 ? 0L : j12, (i12 & 2048) != 0 ? 0 : i9, i10, j13, i11, list, list2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ WorkSpec(java.lang.String r35, androidx.work.WorkInfo.State r36, java.lang.String r37, java.lang.String r38, androidx.work.Data r39, androidx.work.Data r40, long r41, long r43, long r45, androidx.work.Constraints r47, int r48, androidx.work.BackoffPolicy r49, long r50, long r52, long r54, long r56, boolean r58, androidx.work.OutOfQuotaPolicy r59, int r60, int r61, long r62, int r64, int r65, int r66, kotlin.jvm.internal.AbstractC3284p r67) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpec.<init>(java.lang.String, androidx.work.WorkInfo$State, java.lang.String, java.lang.String, androidx.work.Data, androidx.work.Data, long, long, long, androidx.work.Constraints, int, androidx.work.BackoffPolicy, long, long, long, long, boolean, androidx.work.OutOfQuotaPolicy, int, int, long, int, int, int, kotlin.jvm.internal.p):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String id, String workerClassName_) {
        this(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 8388602, null);
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String newId, WorkSpec other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new Data(other.input), new Data(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new Constraints(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.periodCount, 0, other.nextScheduleTimeOverride, other.nextScheduleTimeOverrideGeneration, other.stopReason, 524288, null);
        AbstractC3292y.i(newId, "newId");
        AbstractC3292y.i(other, "other");
    }
}
