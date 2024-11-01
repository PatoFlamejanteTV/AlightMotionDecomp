package androidx.work;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.work.WorkRequest;
import androidx.work.impl.utils.DurationApi26Impl;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class PeriodicWorkRequest extends WorkRequest {
    public static final Companion Companion = new Companion(null);

    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_PERIODIC_FLEX_MILLIS = 300000;

    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000;

    /* loaded from: classes3.dex */
    public static final class Builder extends WorkRequest.Builder<Builder, PeriodicWorkRequest> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> workerClass, long j8, TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            AbstractC3292y.i(workerClass, "workerClass");
            AbstractC3292y.i(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            getWorkSpec$work_runtime_release().setPeriodic(repeatIntervalTimeUnit.toMillis(j8));
        }

        public final Builder clearNextScheduleTimeOverride() {
            getWorkSpec$work_runtime_release().setNextScheduleTimeOverride(Long.MAX_VALUE);
            getWorkSpec$work_runtime_release().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public Builder getThisObject$work_runtime_release() {
            return this;
        }

        public final Builder setNextScheduleTimeOverride(long j8) {
            if (j8 != Long.MAX_VALUE) {
                getWorkSpec$work_runtime_release().setNextScheduleTimeOverride(j8);
                getWorkSpec$work_runtime_release().setNextScheduleTimeOverrideGeneration(1);
                return this;
            }
            throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time".toString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public PeriodicWorkRequest buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet$work_runtime_release() && Build.VERSION.SDK_INT >= 23 && getWorkSpec$work_runtime_release().constraints.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            if (!getWorkSpec$work_runtime_release().expedited) {
                return new PeriodicWorkRequest(this);
            }
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @RequiresApi(26)
        public Builder(Class<? extends ListenableWorker> workerClass, Duration repeatInterval) {
            super(workerClass);
            AbstractC3292y.i(workerClass, "workerClass");
            AbstractC3292y.i(repeatInterval, "repeatInterval");
            getWorkSpec$work_runtime_release().setPeriodic(DurationApi26Impl.toMillisCompat(repeatInterval));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> workerClass, long j8, TimeUnit repeatIntervalTimeUnit, long j9, TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            AbstractC3292y.i(workerClass, "workerClass");
            AbstractC3292y.i(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            AbstractC3292y.i(flexIntervalTimeUnit, "flexIntervalTimeUnit");
            getWorkSpec$work_runtime_release().setPeriodic(repeatIntervalTimeUnit.toMillis(j8), flexIntervalTimeUnit.toMillis(j9));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @RequiresApi(26)
        public Builder(Class<? extends ListenableWorker> workerClass, Duration repeatInterval, Duration flexInterval) {
            super(workerClass);
            AbstractC3292y.i(workerClass, "workerClass");
            AbstractC3292y.i(repeatInterval, "repeatInterval");
            AbstractC3292y.i(flexInterval, "flexInterval");
            getWorkSpec$work_runtime_release().setPeriodic(DurationApi26Impl.toMillisCompat(repeatInterval), DurationApi26Impl.toMillisCompat(flexInterval));
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicWorkRequest(Builder builder) {
        super(builder.getId$work_runtime_release(), builder.getWorkSpec$work_runtime_release(), builder.getTags$work_runtime_release());
        AbstractC3292y.i(builder, "builder");
    }
}
