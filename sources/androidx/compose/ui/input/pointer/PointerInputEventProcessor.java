package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PointerInputEventProcessor {
    public static final int $stable = 8;
    private final HitPathTracker hitPathTracker;
    private boolean isProcessing;
    private final LayoutNode root;
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer = new PointerInputChangeEventProducer();
    private final HitTestResult hitResult = new HitTestResult();

    public PointerInputEventProcessor(LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new HitPathTracker(layoutNode.getCoordinates());
    }

    /* renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m4014processBIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor, PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        return pointerInputEventProcessor.m4015processBIzXfog(pointerInputEvent, positionCalculator, z8);
    }

    public final LayoutNode getRoot() {
        return this.root;
    }

    /* renamed from: process-BIzXfog, reason: not valid java name */
    public final int m4015processBIzXfog(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z8) {
        boolean z9;
        if (this.isProcessing) {
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        boolean z10 = true;
        try {
            this.isProcessing = true;
            InternalPointerEvent produce = this.pointerInputChangeEventProducer.produce(pointerInputEvent, positionCalculator);
            int size = produce.getChanges().size();
            for (int i8 = 0; i8 < size; i8++) {
                PointerInputChange valueAt = produce.getChanges().valueAt(i8);
                if (!valueAt.getPressed() && !valueAt.getPreviousPressed()) {
                }
                z9 = false;
                break;
            }
            z9 = true;
            int size2 = produce.getChanges().size();
            for (int i9 = 0; i9 < size2; i9++) {
                PointerInputChange valueAt2 = produce.getChanges().valueAt(i9);
                if (z9 || PointerEventKt.changedToDownIgnoreConsumed(valueAt2)) {
                    LayoutNode.m4225hitTestM_7yMNQ$ui_release$default(this.root, valueAt2.m3993getPositionF1C5BW0(), this.hitResult, PointerType.m4054equalsimpl0(valueAt2.m3996getTypeT8wyACA(), PointerType.Companion.m4061getTouchT8wyACA()), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.m3921addHitPathKNwqfcY(valueAt2.m3991getIdJ3iCeTQ(), this.hitResult);
                        this.hitResult.clear();
                    }
                }
            }
            this.hitPathTracker.removeDetachedPointerInputFilters();
            boolean dispatchChanges = this.hitPathTracker.dispatchChanges(produce, z8);
            if (!produce.getSuppressMovementConsumption()) {
                int size3 = produce.getChanges().size();
                for (int i10 = 0; i10 < size3; i10++) {
                    PointerInputChange valueAt3 = produce.getChanges().valueAt(i10);
                    if (PointerEventKt.positionChangedIgnoreConsumed(valueAt3) && valueAt3.isConsumed()) {
                        break;
                    }
                }
            }
            z10 = false;
            int ProcessResult = PointerInputEventProcessorKt.ProcessResult(dispatchChanges, z10);
            this.isProcessing = false;
            return ProcessResult;
        } catch (Throwable th) {
            this.isProcessing = false;
            throw th;
        }
    }

    public final void processCancel() {
        if (!this.isProcessing) {
            this.pointerInputChangeEventProducer.clear();
            this.hitPathTracker.processCancel();
        }
    }
}
