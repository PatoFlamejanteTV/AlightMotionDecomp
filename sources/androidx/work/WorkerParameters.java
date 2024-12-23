package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class WorkerParameters {

    @NonNull
    private Executor mBackgroundExecutor;

    @NonNull
    private ForegroundUpdater mForegroundUpdater;
    private int mGeneration;

    @NonNull
    private UUID mId;

    @NonNull
    private Data mInputData;

    @NonNull
    private ProgressUpdater mProgressUpdater;
    private int mRunAttemptCount;

    @NonNull
    private RuntimeExtras mRuntimeExtras;

    @NonNull
    private Set<String> mTags;

    @NonNull
    private TaskExecutor mWorkTaskExecutor;

    @NonNull
    private WorkerFactory mWorkerFactory;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static class RuntimeExtras {

        @Nullable
        @RequiresApi(28)
        public Network network;

        @NonNull
        public List<String> triggeredContentAuthorities = Collections.emptyList();

        @NonNull
        public List<Uri> triggeredContentUris = Collections.emptyList();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerParameters(@NonNull UUID uuid, @NonNull Data data, @NonNull Collection<String> collection, @NonNull RuntimeExtras runtimeExtras, @IntRange(from = 0) int i8, @IntRange(from = 0) int i9, @NonNull Executor executor, @NonNull TaskExecutor taskExecutor, @NonNull WorkerFactory workerFactory, @NonNull ProgressUpdater progressUpdater, @NonNull ForegroundUpdater foregroundUpdater) {
        this.mId = uuid;
        this.mInputData = data;
        this.mTags = new HashSet(collection);
        this.mRuntimeExtras = runtimeExtras;
        this.mRunAttemptCount = i8;
        this.mGeneration = i9;
        this.mBackgroundExecutor = executor;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkerFactory = workerFactory;
        this.mProgressUpdater = progressUpdater;
        this.mForegroundUpdater = foregroundUpdater;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.mBackgroundExecutor;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ForegroundUpdater getForegroundUpdater() {
        return this.mForegroundUpdater;
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public int getGeneration() {
        return this.mGeneration;
    }

    @NonNull
    public UUID getId() {
        return this.mId;
    }

    @NonNull
    public Data getInputData() {
        return this.mInputData;
    }

    @Nullable
    @RequiresApi(28)
    public Network getNetwork() {
        return this.mRuntimeExtras.network;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ProgressUpdater getProgressUpdater() {
        return this.mProgressUpdater;
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public int getRunAttemptCount() {
        return this.mRunAttemptCount;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public RuntimeExtras getRuntimeExtras() {
        return this.mRuntimeExtras;
    }

    @NonNull
    public Set<String> getTags() {
        return this.mTags;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public TaskExecutor getTaskExecutor() {
        return this.mWorkTaskExecutor;
    }

    @NonNull
    @RequiresApi(24)
    public List<String> getTriggeredContentAuthorities() {
        return this.mRuntimeExtras.triggeredContentAuthorities;
    }

    @NonNull
    @RequiresApi(24)
    public List<Uri> getTriggeredContentUris() {
        return this.mRuntimeExtras.triggeredContentUris;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerFactory getWorkerFactory() {
        return this.mWorkerFactory;
    }
}
