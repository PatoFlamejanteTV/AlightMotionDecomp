package androidx.work;

import R5.a0;
import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.DurationApi26Impl;
import j$.time.Duration;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public abstract class WorkRequest {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;

    @SuppressLint({"MinMaxConstant"})
    public static final long MAX_BACKOFF_MILLIS = 18000000;

    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_BACKOFF_MILLIS = 10000;
    private final UUID id;
    private final Set<String> tags;
    private final WorkSpec workSpec;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public WorkRequest(UUID id, WorkSpec workSpec, Set<String> tags) {
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(workSpec, "workSpec");
        AbstractC3292y.i(tags, "tags");
        this.id = id;
        this.workSpec = workSpec;
        this.tags = tags;
    }

    public UUID getId() {
        return this.id;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String getStringId() {
        String uuid = getId().toString();
        AbstractC3292y.h(uuid, "id.toString()");
        return uuid;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Set<String> getTags() {
        return this.tags;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    /* loaded from: classes3.dex */
    public static abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {
        private boolean backoffCriteriaSet;
        private UUID id;
        private final Set<String> tags;
        private WorkSpec workSpec;
        private final Class<? extends ListenableWorker> workerClass;

        public Builder(Class<? extends ListenableWorker> workerClass) {
            AbstractC3292y.i(workerClass, "workerClass");
            this.workerClass = workerClass;
            UUID randomUUID = UUID.randomUUID();
            AbstractC3292y.h(randomUUID, "randomUUID()");
            this.id = randomUUID;
            String uuid = this.id.toString();
            AbstractC3292y.h(uuid, "id.toString()");
            String name = workerClass.getName();
            AbstractC3292y.h(name, "workerClass.name");
            this.workSpec = new WorkSpec(uuid, name);
            String name2 = workerClass.getName();
            AbstractC3292y.h(name2, "workerClass.name");
            this.tags = a0.g(name2);
        }

        public final B addTag(String tag) {
            AbstractC3292y.i(tag, "tag");
            this.tags.add(tag);
            return getThisObject$work_runtime_release();
        }

        public final W build() {
            boolean z8;
            W buildInternal$work_runtime_release = buildInternal$work_runtime_release();
            Constraints constraints = this.workSpec.constraints;
            int i8 = Build.VERSION.SDK_INT;
            if ((i8 < 24 || !constraints.hasContentUriTriggers()) && !constraints.requiresBatteryNotLow() && !constraints.requiresCharging() && (i8 < 23 || !constraints.requiresDeviceIdle())) {
                z8 = false;
            } else {
                z8 = true;
            }
            WorkSpec workSpec = this.workSpec;
            if (workSpec.expedited) {
                if (!z8) {
                    if (workSpec.initialDelay > 0) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
            }
            UUID randomUUID = UUID.randomUUID();
            AbstractC3292y.h(randomUUID, "randomUUID()");
            setId(randomUUID);
            return buildInternal$work_runtime_release;
        }

        public abstract W buildInternal$work_runtime_release();

        public final boolean getBackoffCriteriaSet$work_runtime_release() {
            return this.backoffCriteriaSet;
        }

        public final UUID getId$work_runtime_release() {
            return this.id;
        }

        public final Set<String> getTags$work_runtime_release() {
            return this.tags;
        }

        public abstract B getThisObject$work_runtime_release();

        public final WorkSpec getWorkSpec$work_runtime_release() {
            return this.workSpec;
        }

        public final Class<? extends ListenableWorker> getWorkerClass$work_runtime_release() {
            return this.workerClass;
        }

        public final B keepResultsForAtLeast(long j8, TimeUnit timeUnit) {
            AbstractC3292y.i(timeUnit, "timeUnit");
            this.workSpec.minimumRetentionDuration = timeUnit.toMillis(j8);
            return getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(BackoffPolicy backoffPolicy, long j8, TimeUnit timeUnit) {
            AbstractC3292y.i(backoffPolicy, "backoffPolicy");
            AbstractC3292y.i(timeUnit, "timeUnit");
            this.backoffCriteriaSet = true;
            WorkSpec workSpec = this.workSpec;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.setBackoffDelayDuration(timeUnit.toMillis(j8));
            return getThisObject$work_runtime_release();
        }

        public final void setBackoffCriteriaSet$work_runtime_release(boolean z8) {
            this.backoffCriteriaSet = z8;
        }

        public final B setConstraints(Constraints constraints) {
            AbstractC3292y.i(constraints, "constraints");
            this.workSpec.constraints = constraints;
            return getThisObject$work_runtime_release();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B setExpedited(OutOfQuotaPolicy policy) {
            AbstractC3292y.i(policy, "policy");
            WorkSpec workSpec = this.workSpec;
            workSpec.expedited = true;
            workSpec.outOfQuotaPolicy = policy;
            return getThisObject$work_runtime_release();
        }

        public final B setId(UUID id) {
            AbstractC3292y.i(id, "id");
            this.id = id;
            String uuid = id.toString();
            AbstractC3292y.h(uuid, "id.toString()");
            this.workSpec = new WorkSpec(uuid, this.workSpec);
            return getThisObject$work_runtime_release();
        }

        public final void setId$work_runtime_release(UUID uuid) {
            AbstractC3292y.i(uuid, "<set-?>");
            this.id = uuid;
        }

        public B setInitialDelay(long j8, TimeUnit timeUnit) {
            AbstractC3292y.i(timeUnit, "timeUnit");
            this.workSpec.initialDelay = timeUnit.toMillis(j8);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setInitialRunAttemptCount(int i8) {
            this.workSpec.runAttemptCount = i8;
            return getThisObject$work_runtime_release();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setInitialState(WorkInfo.State state) {
            AbstractC3292y.i(state, "state");
            this.workSpec.state = state;
            return getThisObject$work_runtime_release();
        }

        public final B setInputData(Data inputData) {
            AbstractC3292y.i(inputData, "inputData");
            this.workSpec.input = inputData;
            return getThisObject$work_runtime_release();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setLastEnqueueTime(long j8, TimeUnit timeUnit) {
            AbstractC3292y.i(timeUnit, "timeUnit");
            this.workSpec.lastEnqueueTime = timeUnit.toMillis(j8);
            return getThisObject$work_runtime_release();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setScheduleRequestedAt(long j8, TimeUnit timeUnit) {
            AbstractC3292y.i(timeUnit, "timeUnit");
            this.workSpec.scheduleRequestedAt = timeUnit.toMillis(j8);
            return getThisObject$work_runtime_release();
        }

        public final void setWorkSpec$work_runtime_release(WorkSpec workSpec) {
            AbstractC3292y.i(workSpec, "<set-?>");
            this.workSpec = workSpec;
        }

        @RequiresApi(26)
        public final B keepResultsForAtLeast(Duration duration) {
            AbstractC3292y.i(duration, "duration");
            this.workSpec.minimumRetentionDuration = DurationApi26Impl.toMillisCompat(duration);
            return getThisObject$work_runtime_release();
        }

        @RequiresApi(26)
        public final B setBackoffCriteria(BackoffPolicy backoffPolicy, Duration duration) {
            AbstractC3292y.i(backoffPolicy, "backoffPolicy");
            AbstractC3292y.i(duration, "duration");
            this.backoffCriteriaSet = true;
            WorkSpec workSpec = this.workSpec;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.setBackoffDelayDuration(DurationApi26Impl.toMillisCompat(duration));
            return getThisObject$work_runtime_release();
        }

        @RequiresApi(26)
        public B setInitialDelay(Duration duration) {
            AbstractC3292y.i(duration, "duration");
            this.workSpec.initialDelay = DurationApi26Impl.toMillisCompat(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }
    }
}
