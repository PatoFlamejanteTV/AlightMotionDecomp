package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class InvalidationLiveDataContainer {
    private final RoomDatabase database;
    private final Set<LiveData<?>> liveDataSet;

    public InvalidationLiveDataContainer(RoomDatabase database) {
        AbstractC3292y.i(database, "database");
        this.database = database;
        Set<LiveData<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        AbstractC3292y.h(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.liveDataSet = newSetFromMap;
    }

    public final <T> LiveData<T> create(String[] tableNames, boolean z8, Callable<T> computeFunction) {
        AbstractC3292y.i(tableNames, "tableNames");
        AbstractC3292y.i(computeFunction, "computeFunction");
        return new RoomTrackingLiveData(this.database, this, z8, computeFunction, tableNames);
    }

    public final Set<LiveData<?>> getLiveDataSet$room_runtime_release() {
        return this.liveDataSet;
    }

    public final void onActive(LiveData<?> liveData) {
        AbstractC3292y.i(liveData, "liveData");
        this.liveDataSet.add(liveData);
    }

    public final void onInactive(LiveData<?> liveData) {
        AbstractC3292y.i(liveData, "liveData");
        this.liveDataSet.remove(liveData);
    }
}
