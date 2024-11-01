package androidx.room;

import android.annotation.SuppressLint;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC3292y;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
public final class RoomTrackingLiveData<T> extends LiveData<T> {
    private final Callable<T> computeFunction;
    private final AtomicBoolean computing;
    private final InvalidationLiveDataContainer container;
    private final RoomDatabase database;
    private final boolean inTransaction;
    private final AtomicBoolean invalid;
    private final Runnable invalidationRunnable;
    private final InvalidationTracker.Observer observer;
    private final Runnable refreshRunnable;
    private final AtomicBoolean registeredObserver;

    public RoomTrackingLiveData(RoomDatabase database, InvalidationLiveDataContainer container, boolean z8, Callable<T> computeFunction, final String[] tableNames) {
        AbstractC3292y.i(database, "database");
        AbstractC3292y.i(container, "container");
        AbstractC3292y.i(computeFunction, "computeFunction");
        AbstractC3292y.i(tableNames, "tableNames");
        this.database = database;
        this.container = container;
        this.inTransaction = z8;
        this.computeFunction = computeFunction;
        this.observer = new InvalidationTracker.Observer(tableNames) { // from class: androidx.room.RoomTrackingLiveData$observer$1
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(Set<String> tables) {
                AbstractC3292y.i(tables, "tables");
                ArchTaskExecutor.getInstance().executeOnMainThread(this.getInvalidationRunnable());
            }
        };
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: androidx.room.x
            @Override // java.lang.Runnable
            public final void run() {
                RoomTrackingLiveData.refreshRunnable$lambda$0(RoomTrackingLiveData.this);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: androidx.room.y
            @Override // java.lang.Runnable
            public final void run() {
                RoomTrackingLiveData.invalidationRunnable$lambda$1(RoomTrackingLiveData.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(RoomTrackingLiveData this$0) {
        AbstractC3292y.i(this$0, "this$0");
        boolean hasActiveObservers = this$0.hasActiveObservers();
        if (this$0.invalid.compareAndSet(false, true) && hasActiveObservers) {
            this$0.getQueryExecutor().execute(this$0.refreshRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshRunnable$lambda$0(RoomTrackingLiveData this$0) {
        boolean z8;
        AbstractC3292y.i(this$0, "this$0");
        if (this$0.registeredObserver.compareAndSet(false, true)) {
            this$0.database.getInvalidationTracker().addWeakObserver(this$0.observer);
        }
        do {
            if (this$0.computing.compareAndSet(false, true)) {
                T t8 = null;
                z8 = false;
                while (this$0.invalid.compareAndSet(true, false)) {
                    try {
                        try {
                            t8 = this$0.computeFunction.call();
                            z8 = true;
                        } catch (Exception e8) {
                            throw new RuntimeException("Exception while computing database live data.", e8);
                        }
                    } finally {
                        this$0.computing.set(false);
                    }
                }
                if (z8) {
                    this$0.postValue(t8);
                }
            } else {
                z8 = false;
            }
            if (!z8) {
                return;
            }
        } while (this$0.invalid.get());
    }

    public final Callable<T> getComputeFunction() {
        return this.computeFunction;
    }

    public final AtomicBoolean getComputing() {
        return this.computing;
    }

    public final RoomDatabase getDatabase() {
        return this.database;
    }

    public final boolean getInTransaction() {
        return this.inTransaction;
    }

    public final AtomicBoolean getInvalid() {
        return this.invalid;
    }

    public final Runnable getInvalidationRunnable() {
        return this.invalidationRunnable;
    }

    public final InvalidationTracker.Observer getObserver() {
        return this.observer;
    }

    public final Executor getQueryExecutor() {
        if (this.inTransaction) {
            return this.database.getTransactionExecutor();
        }
        return this.database.getQueryExecutor();
    }

    public final Runnable getRefreshRunnable() {
        return this.refreshRunnable;
    }

    public final AtomicBoolean getRegisteredObserver() {
        return this.registeredObserver;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        InvalidationLiveDataContainer invalidationLiveDataContainer = this.container;
        AbstractC3292y.g(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        invalidationLiveDataContainer.onActive(this);
        getQueryExecutor().execute(this.refreshRunnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        InvalidationLiveDataContainer invalidationLiveDataContainer = this.container;
        AbstractC3292y.g(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        invalidationLiveDataContainer.onInactive(this);
    }
}
