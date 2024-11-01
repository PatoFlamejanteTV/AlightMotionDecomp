package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.workers.CombineContinuationsWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import z0.InterfaceFutureC4260d;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class WorkContinuationImpl extends WorkContinuation {
    private static final String TAG = Logger.tagWithPrefix("WorkContinuationImpl");
    private final List<String> mAllIds;
    private boolean mEnqueued;
    private final ExistingWorkPolicy mExistingWorkPolicy;
    private final List<String> mIds;
    private final String mName;
    private Operation mOperation;
    private final List<WorkContinuationImpl> mParents;
    private final List<? extends WorkRequest> mWork;
    private final WorkManagerImpl mWorkManagerImpl;

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl, @NonNull List<? extends WorkRequest> list) {
        this(workManagerImpl, null, ExistingWorkPolicy.KEEP, list, null);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Set<String> prerequisitesFor(@NonNull WorkContinuationImpl workContinuationImpl) {
        HashSet hashSet = new HashSet();
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        if (parents != null && !parents.isEmpty()) {
            Iterator<WorkContinuationImpl> it = parents.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().getIds());
            }
        }
        return hashSet;
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    protected WorkContinuation combineInternal(@NonNull List<WorkContinuation> list) {
        OneTimeWorkRequest build = new OneTimeWorkRequest.Builder(CombineContinuationsWorker.class).setInputMerger(ArrayCreatingInputMerger.class).build();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<WorkContinuation> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((WorkContinuationImpl) it.next());
        }
        return new WorkContinuationImpl(this.mWorkManagerImpl, null, ExistingWorkPolicy.KEEP, Collections.singletonList(build), arrayList);
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    public Operation enqueue() {
        if (!this.mEnqueued) {
            EnqueueRunnable enqueueRunnable = new EnqueueRunnable(this);
            this.mWorkManagerImpl.getWorkTaskExecutor().executeOnTaskThread(enqueueRunnable);
            this.mOperation = enqueueRunnable.getOperation();
        } else {
            Logger.get().warning(TAG, "Already enqueued work ids (" + TextUtils.join(", ", this.mIds) + ")");
        }
        return this.mOperation;
    }

    @NonNull
    public List<String> getAllIds() {
        return this.mAllIds;
    }

    @NonNull
    public ExistingWorkPolicy getExistingWorkPolicy() {
        return this.mExistingWorkPolicy;
    }

    @NonNull
    public List<String> getIds() {
        return this.mIds;
    }

    @Nullable
    public String getName() {
        return this.mName;
    }

    @Nullable
    public List<WorkContinuationImpl> getParents() {
        return this.mParents;
    }

    @NonNull
    public List<? extends WorkRequest> getWork() {
        return this.mWork;
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    public InterfaceFutureC4260d getWorkInfos() {
        StatusRunnable<List<WorkInfo>> forStringIds = StatusRunnable.forStringIds(this.mWorkManagerImpl, this.mAllIds);
        this.mWorkManagerImpl.getWorkTaskExecutor().executeOnTaskThread(forStringIds);
        return forStringIds.getFuture();
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    public LiveData<List<WorkInfo>> getWorkInfosLiveData() {
        return this.mWorkManagerImpl.getWorkInfosById(this.mAllIds);
    }

    @NonNull
    public WorkManagerImpl getWorkManagerImpl() {
        return this.mWorkManagerImpl;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean hasCycles() {
        return hasCycles(this, new HashSet());
    }

    public boolean isEnqueued() {
        return this.mEnqueued;
    }

    public void markEnqueued() {
        this.mEnqueued = true;
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    public WorkContinuation then(@NonNull List<OneTimeWorkRequest> list) {
        if (list.isEmpty()) {
            return this;
        }
        return new WorkContinuationImpl(this.mWorkManagerImpl, this.mName, ExistingWorkPolicy.KEEP, list, Collections.singletonList(this));
    }

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl, @Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends WorkRequest> list) {
        this(workManagerImpl, str, existingWorkPolicy, list, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static boolean hasCycles(@NonNull WorkContinuationImpl workContinuationImpl, @NonNull Set<String> set) {
        set.addAll(workContinuationImpl.getIds());
        Set<String> prerequisitesFor = prerequisitesFor(workContinuationImpl);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (prerequisitesFor.contains(it.next())) {
                return true;
            }
        }
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        if (parents != null && !parents.isEmpty()) {
            Iterator<WorkContinuationImpl> it2 = parents.iterator();
            while (it2.hasNext()) {
                if (hasCycles(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(workContinuationImpl.getIds());
        return false;
    }

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl, @Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends WorkRequest> list, @Nullable List<WorkContinuationImpl> list2) {
        this.mWorkManagerImpl = workManagerImpl;
        this.mName = str;
        this.mExistingWorkPolicy = existingWorkPolicy;
        this.mWork = list;
        this.mParents = list2;
        this.mIds = new ArrayList(list.size());
        this.mAllIds = new ArrayList();
        if (list2 != null) {
            Iterator<WorkContinuationImpl> it = list2.iterator();
            while (it.hasNext()) {
                this.mAllIds.addAll(it.next().mAllIds);
            }
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (existingWorkPolicy == ExistingWorkPolicy.REPLACE && list.get(i8).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String stringId = list.get(i8).getStringId();
            this.mIds.add(stringId);
            this.mAllIds.add(stringId);
        }
    }
}
