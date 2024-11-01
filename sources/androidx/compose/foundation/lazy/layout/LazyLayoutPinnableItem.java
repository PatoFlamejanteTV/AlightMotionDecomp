package androidx.compose.foundation.lazy.layout;

import Q5.I;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.PinnableContainer;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class LazyLayoutPinnableItem implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {
    private final MutableState _parentPinnableContainer$delegate;
    private final MutableIntState index$delegate;
    private final Object key;
    private final MutableState parentHandle$delegate;
    private final LazyLayoutPinnedItemList pinnedItemList;
    private final MutableIntState pinsCount$delegate;

    public LazyLayoutPinnableItem(Object obj, LazyLayoutPinnedItemList pinnedItemList) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        AbstractC3292y.i(pinnedItemList, "pinnedItemList");
        this.key = obj;
        this.pinnedItemList = pinnedItemList;
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.pinsCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.parentHandle$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._parentPinnableContainer$delegate = mutableStateOf$default2;
    }

    private final PinnableContainer.PinnedHandle getParentHandle() {
        return (PinnableContainer.PinnedHandle) this.parentHandle$delegate.getValue();
    }

    private final int getPinsCount() {
        return this.pinsCount$delegate.getIntValue();
    }

    private final PinnableContainer get_parentPinnableContainer() {
        return (PinnableContainer) this._parentPinnableContainer$delegate.getValue();
    }

    private final void setParentHandle(PinnableContainer.PinnedHandle pinnedHandle) {
        this.parentHandle$delegate.setValue(pinnedHandle);
    }

    private final void setPinsCount(int i8) {
        this.pinsCount$delegate.setIntValue(i8);
    }

    private final void set_parentPinnableContainer(PinnableContainer pinnableContainer) {
        this._parentPinnableContainer$delegate.setValue(pinnableContainer);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public int getIndex() {
        return this.index$delegate.getIntValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public Object getKey() {
        return this.key;
    }

    public final PinnableContainer getParentPinnableContainer() {
        return get_parentPinnableContainer();
    }

    public final void onDisposed() {
        int pinsCount = getPinsCount();
        for (int i8 = 0; i8 < pinsCount; i8++) {
            release();
        }
    }

    @Override // androidx.compose.ui.layout.PinnableContainer
    public PinnableContainer.PinnedHandle pin() {
        PinnableContainer.PinnedHandle pinnedHandle;
        if (getPinsCount() == 0) {
            this.pinnedItemList.pin$foundation_release(this);
            PinnableContainer parentPinnableContainer = getParentPinnableContainer();
            if (parentPinnableContainer != null) {
                pinnedHandle = parentPinnableContainer.pin();
            } else {
                pinnedHandle = null;
            }
            setParentHandle(pinnedHandle);
        }
        setPinsCount(getPinsCount() + 1);
        return this;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer.PinnedHandle
    public void release() {
        if (getPinsCount() > 0) {
            setPinsCount(getPinsCount() - 1);
            if (getPinsCount() == 0) {
                this.pinnedItemList.release$foundation_release(this);
                PinnableContainer.PinnedHandle parentHandle = getParentHandle();
                if (parentHandle != null) {
                    parentHandle.release();
                }
                setParentHandle(null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Release should only be called once".toString());
    }

    public void setIndex(int i8) {
        this.index$delegate.setIntValue(i8);
    }

    public final void setParentPinnableContainer(PinnableContainer pinnableContainer) {
        PinnableContainer.PinnedHandle pinnedHandle;
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                if (pinnableContainer != get_parentPinnableContainer()) {
                    set_parentPinnableContainer(pinnableContainer);
                    if (getPinsCount() > 0) {
                        PinnableContainer.PinnedHandle parentHandle = getParentHandle();
                        if (parentHandle != null) {
                            parentHandle.release();
                        }
                        if (pinnableContainer != null) {
                            pinnedHandle = pinnableContainer.pin();
                        } else {
                            pinnedHandle = null;
                        }
                        setParentHandle(pinnedHandle);
                    }
                }
                I i8 = I.f8786a;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            } catch (Throwable th) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                throw th;
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }
}
