package androidx.compose.ui.input.pointer;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MotionEventAdapter {
    public static final int $stable = 8;
    private long nextId;
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();
    private final SparseBooleanArray canHover = new SparseBooleanArray();
    private final List<PointerInputEventData> pointers = new ArrayList();
    private int previousToolType = -1;
    private int previousSource = -1;

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                    SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                    long j8 = this.nextId;
                    this.nextId = 1 + j8;
                    sparseLongArray.put(pointerId, j8);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j9 = this.nextId;
            this.nextId = 1 + j9;
            sparseLongArray2.put(pointerId2, j9);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.canHover.put(pointerId2, true);
            }
        }
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType != this.previousToolType || source != this.previousSource) {
            this.previousToolType = toolType;
            this.previousSource = source;
            this.canHover.clear();
            this.motionEventToComposePointerIdMap.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.compose.ui.input.pointer.PointerInputEventData createPointerInputEventData(androidx.compose.ui.input.pointer.PositionCalculator r32, android.view.MotionEvent r33, int r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.MotionEventAdapter.createPointerInputEventData(androidx.compose.ui.input.pointer.PositionCalculator, android.view.MotionEvent, int, boolean):androidx.compose.ui.input.pointer.PointerInputEventData");
    }

    /* renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m3923getComposePointerId_I2yYro(int i8) {
        long j8;
        int indexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(i8);
        if (indexOfKey >= 0) {
            j8 = this.motionEventToComposePointerIdMap.valueAt(indexOfKey);
        } else {
            j8 = this.nextId;
            this.nextId = 1 + j8;
            this.motionEventToComposePointerIdMap.put(i8, j8);
        }
        return PointerId.m3973constructorimpl(j8);
    }

    @VisibleForTesting
    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i8) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i9 = 0; i9 < pointerCount; i9++) {
            if (motionEvent.getPointerId(i9) == i8) {
                return true;
            }
        }
        return false;
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.canHover.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.canHover.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int keyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!hasPointerId(motionEvent, keyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.canHover.delete(keyAt);
                }
            }
        }
    }

    public final PointerInputEvent convertToPointerInputEvent$ui_release(MotionEvent motionEvent, PositionCalculator positionCalculator) {
        boolean z8;
        boolean z9;
        int i8;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.motionEventToComposePointerIdMap.clear();
            this.canHover.clear();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        if (actionMasked != 10 && actionMasked != 7 && actionMasked != 9) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (actionMasked == 8) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8) {
            this.canHover.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            if (actionMasked != 6) {
                i8 = -1;
            } else {
                i8 = motionEvent.getActionIndex();
            }
        } else {
            i8 = 0;
        }
        this.pointers.clear();
        int pointerCount = motionEvent.getPointerCount();
        for (int i9 = 0; i9 < pointerCount; i9++) {
            List<PointerInputEventData> list = this.pointers;
            if (!z8 && i9 != i8 && (!z9 || motionEvent.getButtonState() != 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            list.add(createPointerInputEventData(positionCalculator, motionEvent, i9, z10));
        }
        removeStaleIds(motionEvent);
        return new PointerInputEvent(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    public final void endStream(int i8) {
        this.canHover.delete(i8);
        this.motionEventToComposePointerIdMap.delete(i8);
    }

    public final SparseLongArray getMotionEventToComposePointerIdMap$ui_release() {
        return this.motionEventToComposePointerIdMap;
    }
}
