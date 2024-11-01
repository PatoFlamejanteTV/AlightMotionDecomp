package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class InternalPointerEvent {
    public static final int $stable = 8;
    private final LongSparseArray<PointerInputChange> changes;
    private final PointerInputEvent pointerInputEvent;
    private boolean suppressMovementConsumption;

    public InternalPointerEvent(LongSparseArray<PointerInputChange> longSparseArray, PointerInputEvent pointerInputEvent) {
        this.changes = longSparseArray;
        this.pointerInputEvent = pointerInputEvent;
    }

    public final LongSparseArray<PointerInputChange> getChanges() {
        return this.changes;
    }

    public final MotionEvent getMotionEvent() {
        return this.pointerInputEvent.getMotionEvent();
    }

    public final PointerInputEvent getPointerInputEvent() {
        return this.pointerInputEvent;
    }

    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    /* renamed from: issuesEnterExitEvent-0FcD4WY, reason: not valid java name */
    public final boolean m3922issuesEnterExitEvent0FcD4WY(long j8) {
        PointerInputEventData pointerInputEventData;
        List<PointerInputEventData> pointers = this.pointerInputEvent.getPointers();
        int size = pointers.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                pointerInputEventData = pointers.get(i8);
                if (PointerId.m3975equalsimpl0(pointerInputEventData.m4008getIdJ3iCeTQ(), j8)) {
                    break;
                }
                i8++;
            } else {
                pointerInputEventData = null;
                break;
            }
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 == null) {
            return false;
        }
        return pointerInputEventData2.getIssuesEnterExit();
    }

    public final void setSuppressMovementConsumption(boolean z8) {
        this.suppressMovementConsumption = z8;
    }
}
