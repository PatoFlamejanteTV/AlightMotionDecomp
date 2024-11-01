package androidx.compose.runtime;

import androidx.collection.ObjectIntMap;
import androidx.compose.runtime.snapshots.StateObject;

/* loaded from: classes.dex */
public interface DerivedState<T> extends State<T> {

    /* loaded from: classes.dex */
    public interface Record<T> {
        T getCurrentValue();

        ObjectIntMap<StateObject> getDependencies();
    }

    Record<T> getCurrentRecord();

    SnapshotMutationPolicy<T> getPolicy();
}
