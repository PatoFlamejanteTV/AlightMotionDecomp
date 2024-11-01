package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class BatchingListUpdateCallback implements ListUpdateCallback {
    private static final int TYPE_ADD = 1;
    private static final int TYPE_CHANGE = 3;
    private static final int TYPE_NONE = 0;
    private static final int TYPE_REMOVE = 2;
    final ListUpdateCallback mWrapped;
    int mLastEventType = 0;
    int mLastEventPosition = -1;
    int mLastEventCount = -1;
    Object mLastEventPayload = null;

    public BatchingListUpdateCallback(@NonNull ListUpdateCallback listUpdateCallback) {
        this.mWrapped = listUpdateCallback;
    }

    public void dispatchLastEvent() {
        int i8 = this.mLastEventType;
        if (i8 == 0) {
            return;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    this.mWrapped.onChanged(this.mLastEventPosition, this.mLastEventCount, this.mLastEventPayload);
                }
            } else {
                this.mWrapped.onRemoved(this.mLastEventPosition, this.mLastEventCount);
            }
        } else {
            this.mWrapped.onInserted(this.mLastEventPosition, this.mLastEventCount);
        }
        this.mLastEventPayload = null;
        this.mLastEventType = 0;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i8, int i9, Object obj) {
        int i10;
        if (this.mLastEventType == 3) {
            int i11 = this.mLastEventPosition;
            int i12 = this.mLastEventCount;
            if (i8 <= i11 + i12 && (i10 = i8 + i9) >= i11 && this.mLastEventPayload == obj) {
                this.mLastEventPosition = Math.min(i8, i11);
                this.mLastEventCount = Math.max(i12 + i11, i10) - this.mLastEventPosition;
                return;
            }
        }
        dispatchLastEvent();
        this.mLastEventPosition = i8;
        this.mLastEventCount = i9;
        this.mLastEventPayload = obj;
        this.mLastEventType = 3;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i8, int i9) {
        int i10;
        if (this.mLastEventType == 1 && i8 >= (i10 = this.mLastEventPosition)) {
            int i11 = this.mLastEventCount;
            if (i8 <= i10 + i11) {
                this.mLastEventCount = i11 + i9;
                this.mLastEventPosition = Math.min(i8, i10);
                return;
            }
        }
        dispatchLastEvent();
        this.mLastEventPosition = i8;
        this.mLastEventCount = i9;
        this.mLastEventType = 1;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i8, int i9) {
        dispatchLastEvent();
        this.mWrapped.onMoved(i8, i9);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i8, int i9) {
        int i10;
        if (this.mLastEventType == 2 && (i10 = this.mLastEventPosition) >= i8 && i10 <= i8 + i9) {
            this.mLastEventCount += i9;
            this.mLastEventPosition = i8;
        } else {
            dispatchLastEvent();
            this.mLastEventPosition = i8;
            this.mLastEventCount = i9;
            this.mLastEventType = 2;
        }
    }
}
