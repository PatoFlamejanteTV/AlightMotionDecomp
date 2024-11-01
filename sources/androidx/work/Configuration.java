package androidx.work;

import android.os.Build;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import androidx.work.impl.DefaultRunnableScheduler;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class Configuration {
    public static final Companion Companion = new Companion(null);
    public static final int MIN_SCHEDULER_LIMIT = 20;
    private final Clock clock;
    private final int contentUriTriggerWorkersLimit;
    private final String defaultProcessName;
    private final Executor executor;
    private final Consumer<Throwable> initializationExceptionHandler;
    private final InputMergerFactory inputMergerFactory;
    private final boolean isUsingDefaultTaskExecutor;
    private final int maxJobSchedulerId;
    private final int maxSchedulerLimit;
    private final int minJobSchedulerId;
    private final int minimumLoggingLevel;
    private final RunnableScheduler runnableScheduler;
    private final Consumer<Throwable> schedulingExceptionHandler;
    private final Executor taskExecutor;
    private final WorkerFactory workerFactory;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public interface Provider {
        Configuration getWorkManagerConfiguration();
    }

    public Configuration(Builder builder) {
        int maxSchedulerLimit$work_runtime_release;
        AbstractC3292y.i(builder, "builder");
        Executor executor$work_runtime_release = builder.getExecutor$work_runtime_release();
        this.executor = executor$work_runtime_release == null ? ConfigurationKt.createDefaultExecutor(false) : executor$work_runtime_release;
        this.isUsingDefaultTaskExecutor = builder.getTaskExecutor$work_runtime_release() == null;
        Executor taskExecutor$work_runtime_release = builder.getTaskExecutor$work_runtime_release();
        this.taskExecutor = taskExecutor$work_runtime_release == null ? ConfigurationKt.createDefaultExecutor(true) : taskExecutor$work_runtime_release;
        Clock clock$work_runtime_release = builder.getClock$work_runtime_release();
        this.clock = clock$work_runtime_release == null ? new SystemClock() : clock$work_runtime_release;
        WorkerFactory workerFactory$work_runtime_release = builder.getWorkerFactory$work_runtime_release();
        if (workerFactory$work_runtime_release == null) {
            workerFactory$work_runtime_release = WorkerFactory.getDefaultWorkerFactory();
            AbstractC3292y.h(workerFactory$work_runtime_release, "getDefaultWorkerFactory()");
        }
        this.workerFactory = workerFactory$work_runtime_release;
        InputMergerFactory inputMergerFactory$work_runtime_release = builder.getInputMergerFactory$work_runtime_release();
        this.inputMergerFactory = inputMergerFactory$work_runtime_release == null ? NoOpInputMergerFactory.INSTANCE : inputMergerFactory$work_runtime_release;
        RunnableScheduler runnableScheduler$work_runtime_release = builder.getRunnableScheduler$work_runtime_release();
        this.runnableScheduler = runnableScheduler$work_runtime_release == null ? new DefaultRunnableScheduler() : runnableScheduler$work_runtime_release;
        this.minimumLoggingLevel = builder.getLoggingLevel$work_runtime_release();
        this.minJobSchedulerId = builder.getMinJobSchedulerId$work_runtime_release();
        this.maxJobSchedulerId = builder.getMaxJobSchedulerId$work_runtime_release();
        if (Build.VERSION.SDK_INT == 23) {
            maxSchedulerLimit$work_runtime_release = builder.getMaxSchedulerLimit$work_runtime_release() / 2;
        } else {
            maxSchedulerLimit$work_runtime_release = builder.getMaxSchedulerLimit$work_runtime_release();
        }
        this.maxSchedulerLimit = maxSchedulerLimit$work_runtime_release;
        this.initializationExceptionHandler = builder.getInitializationExceptionHandler$work_runtime_release();
        this.schedulingExceptionHandler = builder.getSchedulingExceptionHandler$work_runtime_release();
        this.defaultProcessName = builder.getDefaultProcessName$work_runtime_release();
        this.contentUriTriggerWorkersLimit = builder.getContentUriTriggerWorkersLimit$work_runtime_release();
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final int getContentUriTriggerWorkersLimit() {
        return this.contentUriTriggerWorkersLimit;
    }

    public final String getDefaultProcessName() {
        return this.defaultProcessName;
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    public final Consumer<Throwable> getInitializationExceptionHandler() {
        return this.initializationExceptionHandler;
    }

    public final InputMergerFactory getInputMergerFactory() {
        return this.inputMergerFactory;
    }

    public final int getMaxJobSchedulerId() {
        return this.maxJobSchedulerId;
    }

    @IntRange(from = 20, to = 50)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMaxSchedulerLimit() {
        return this.maxSchedulerLimit;
    }

    public final int getMinJobSchedulerId() {
        return this.minJobSchedulerId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMinimumLoggingLevel() {
        return this.minimumLoggingLevel;
    }

    public final RunnableScheduler getRunnableScheduler() {
        return this.runnableScheduler;
    }

    public final Consumer<Throwable> getSchedulingExceptionHandler() {
        return this.schedulingExceptionHandler;
    }

    public final Executor getTaskExecutor() {
        return this.taskExecutor;
    }

    public final WorkerFactory getWorkerFactory() {
        return this.workerFactory;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isUsingDefaultTaskExecutor() {
        return this.isUsingDefaultTaskExecutor;
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
        private Clock clock;
        private int contentUriTriggerWorkersLimit;
        private String defaultProcessName;
        private Executor executor;
        private Consumer<Throwable> initializationExceptionHandler;
        private InputMergerFactory inputMergerFactory;
        private int loggingLevel;
        private int maxJobSchedulerId;
        private int maxSchedulerLimit;
        private int minJobSchedulerId;
        private RunnableScheduler runnableScheduler;
        private Consumer<Throwable> schedulingExceptionHandler;
        private Executor taskExecutor;
        private WorkerFactory workerFactory;

        public Builder() {
            this.loggingLevel = 4;
            this.maxJobSchedulerId = Integer.MAX_VALUE;
            this.maxSchedulerLimit = 20;
            this.contentUriTriggerWorkersLimit = ConfigurationKt.getDEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT();
        }

        public final Configuration build() {
            return new Configuration(this);
        }

        public final Clock getClock$work_runtime_release() {
            return this.clock;
        }

        public final int getContentUriTriggerWorkersLimit$work_runtime_release() {
            return this.contentUriTriggerWorkersLimit;
        }

        public final String getDefaultProcessName$work_runtime_release() {
            return this.defaultProcessName;
        }

        public final Executor getExecutor$work_runtime_release() {
            return this.executor;
        }

        public final Consumer<Throwable> getInitializationExceptionHandler$work_runtime_release() {
            return this.initializationExceptionHandler;
        }

        public final InputMergerFactory getInputMergerFactory$work_runtime_release() {
            return this.inputMergerFactory;
        }

        public final int getLoggingLevel$work_runtime_release() {
            return this.loggingLevel;
        }

        public final int getMaxJobSchedulerId$work_runtime_release() {
            return this.maxJobSchedulerId;
        }

        public final int getMaxSchedulerLimit$work_runtime_release() {
            return this.maxSchedulerLimit;
        }

        public final int getMinJobSchedulerId$work_runtime_release() {
            return this.minJobSchedulerId;
        }

        public final RunnableScheduler getRunnableScheduler$work_runtime_release() {
            return this.runnableScheduler;
        }

        public final Consumer<Throwable> getSchedulingExceptionHandler$work_runtime_release() {
            return this.schedulingExceptionHandler;
        }

        public final Executor getTaskExecutor$work_runtime_release() {
            return this.taskExecutor;
        }

        public final WorkerFactory getWorkerFactory$work_runtime_release() {
            return this.workerFactory;
        }

        public final Builder setClock(Clock clock) {
            AbstractC3292y.i(clock, "clock");
            this.clock = clock;
            return this;
        }

        public final void setClock$work_runtime_release(Clock clock) {
            this.clock = clock;
        }

        public final Builder setContentUriTriggerWorkersLimit(int i8) {
            this.contentUriTriggerWorkersLimit = Math.max(i8, 0);
            return this;
        }

        public final void setContentUriTriggerWorkersLimit$work_runtime_release(int i8) {
            this.contentUriTriggerWorkersLimit = i8;
        }

        public final Builder setDefaultProcessName(String processName) {
            AbstractC3292y.i(processName, "processName");
            this.defaultProcessName = processName;
            return this;
        }

        public final void setDefaultProcessName$work_runtime_release(String str) {
            this.defaultProcessName = str;
        }

        public final Builder setExecutor(Executor executor) {
            AbstractC3292y.i(executor, "executor");
            this.executor = executor;
            return this;
        }

        public final void setExecutor$work_runtime_release(Executor executor) {
            this.executor = executor;
        }

        public final Builder setInitializationExceptionHandler(Consumer<Throwable> exceptionHandler) {
            AbstractC3292y.i(exceptionHandler, "exceptionHandler");
            this.initializationExceptionHandler = exceptionHandler;
            return this;
        }

        public final void setInitializationExceptionHandler$work_runtime_release(Consumer<Throwable> consumer) {
            this.initializationExceptionHandler = consumer;
        }

        public final Builder setInputMergerFactory(InputMergerFactory inputMergerFactory) {
            AbstractC3292y.i(inputMergerFactory, "inputMergerFactory");
            this.inputMergerFactory = inputMergerFactory;
            return this;
        }

        public final void setInputMergerFactory$work_runtime_release(InputMergerFactory inputMergerFactory) {
            this.inputMergerFactory = inputMergerFactory;
        }

        public final Builder setJobSchedulerJobIdRange(int i8, int i9) {
            if (i9 - i8 >= 1000) {
                this.minJobSchedulerId = i8;
                this.maxJobSchedulerId = i9;
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.".toString());
        }

        public final void setLoggingLevel$work_runtime_release(int i8) {
            this.loggingLevel = i8;
        }

        public final void setMaxJobSchedulerId$work_runtime_release(int i8) {
            this.maxJobSchedulerId = i8;
        }

        public final Builder setMaxSchedulerLimit(int i8) {
            if (i8 >= 20) {
                this.maxSchedulerLimit = Math.min(i8, 50);
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.".toString());
        }

        public final void setMaxSchedulerLimit$work_runtime_release(int i8) {
            this.maxSchedulerLimit = i8;
        }

        public final void setMinJobSchedulerId$work_runtime_release(int i8) {
            this.minJobSchedulerId = i8;
        }

        public final Builder setMinimumLoggingLevel(int i8) {
            this.loggingLevel = i8;
            return this;
        }

        public final Builder setRunnableScheduler(RunnableScheduler runnableScheduler) {
            AbstractC3292y.i(runnableScheduler, "runnableScheduler");
            this.runnableScheduler = runnableScheduler;
            return this;
        }

        public final void setRunnableScheduler$work_runtime_release(RunnableScheduler runnableScheduler) {
            this.runnableScheduler = runnableScheduler;
        }

        public final Builder setSchedulingExceptionHandler(Consumer<Throwable> schedulingExceptionHandler) {
            AbstractC3292y.i(schedulingExceptionHandler, "schedulingExceptionHandler");
            this.schedulingExceptionHandler = schedulingExceptionHandler;
            return this;
        }

        public final void setSchedulingExceptionHandler$work_runtime_release(Consumer<Throwable> consumer) {
            this.schedulingExceptionHandler = consumer;
        }

        public final Builder setTaskExecutor(Executor taskExecutor) {
            AbstractC3292y.i(taskExecutor, "taskExecutor");
            this.taskExecutor = taskExecutor;
            return this;
        }

        public final void setTaskExecutor$work_runtime_release(Executor executor) {
            this.taskExecutor = executor;
        }

        public final Builder setWorkerFactory(WorkerFactory workerFactory) {
            AbstractC3292y.i(workerFactory, "workerFactory");
            this.workerFactory = workerFactory;
            return this;
        }

        public final void setWorkerFactory$work_runtime_release(WorkerFactory workerFactory) {
            this.workerFactory = workerFactory;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder(Configuration configuration) {
            AbstractC3292y.i(configuration, "configuration");
            this.loggingLevel = 4;
            this.maxJobSchedulerId = Integer.MAX_VALUE;
            this.maxSchedulerLimit = 20;
            this.contentUriTriggerWorkersLimit = ConfigurationKt.getDEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT();
            this.executor = configuration.getExecutor();
            this.workerFactory = configuration.getWorkerFactory();
            this.inputMergerFactory = configuration.getInputMergerFactory();
            this.taskExecutor = configuration.getTaskExecutor();
            this.clock = configuration.getClock();
            this.loggingLevel = configuration.getMinimumLoggingLevel();
            this.minJobSchedulerId = configuration.getMinJobSchedulerId();
            this.maxJobSchedulerId = configuration.getMaxJobSchedulerId();
            this.maxSchedulerLimit = configuration.getMaxSchedulerLimit();
            this.runnableScheduler = configuration.getRunnableScheduler();
            this.initializationExceptionHandler = configuration.getInitializationExceptionHandler();
            this.schedulingExceptionHandler = configuration.getSchedulingExceptionHandler();
            this.defaultProcessName = configuration.getDefaultProcessName();
        }
    }
}
