package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;

/* loaded from: classes.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ PointerInteropFilter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    private final void dispatchToView(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (changes.get(i8).isConsumed()) {
                if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                    LayoutCoordinates layoutCoordinates$ui_release = getLayoutCoordinates$ui_release();
                    if (layoutCoordinates$ui_release != null) {
                        PointerInteropUtils_androidKt.m4041toCancelMotionEventScoped4ec7I(pointerEvent, layoutCoordinates$ui_release.mo4117localToRootMKHz9U(Offset.Companion.m2728getZeroF1C5BW0()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(this.this$0));
                    } else {
                        throw new IllegalStateException("layoutCoordinates not set".toString());
                    }
                }
                this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
                return;
            }
        }
        LayoutCoordinates layoutCoordinates$ui_release2 = getLayoutCoordinates$ui_release();
        if (layoutCoordinates$ui_release2 != null) {
            PointerInteropUtils_androidKt.m4042toMotionEventScoped4ec7I(pointerEvent, layoutCoordinates$ui_release2.mo4117localToRootMKHz9U(Offset.Companion.m2728getZeroF1C5BW0()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(this, this.this$0));
            if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                int size2 = changes.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    changes.get(i9).consume();
                }
                InternalPointerEvent internalPointerEvent$ui_release = pointerEvent.getInternalPointerEvent$ui_release();
                if (internalPointerEvent$ui_release != null) {
                    internalPointerEvent$ui_release.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept$ui_release());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set".toString());
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui_release(false);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public boolean getShareWithSiblings() {
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(SystemClock.uptimeMillis(), new PointerInteropFilter$pointerInputFilter$1$onCancel$1(this.this$0));
            reset();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4017onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent r5, androidx.compose.ui.input.pointer.PointerEventPass r6, long r7) {
        /*
            r4 = this;
            java.util.List r7 = r5.getChanges()
            androidx.compose.ui.input.pointer.PointerInteropFilter r8 = r4.this$0
            boolean r8 = r8.getDisallowIntercept$ui_release()
            r0 = 0
            if (r8 != 0) goto L2c
            int r8 = r7.size()
            r1 = 0
        L12:
            if (r1 >= r8) goto L2a
            java.lang.Object r2 = r7.get(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2
            boolean r3 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r2)
            if (r3 != 0) goto L2c
            boolean r2 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r2)
            if (r2 == 0) goto L27
            goto L2c
        L27:
            int r1 = r1 + 1
            goto L12
        L2a:
            r8 = 0
            goto L2d
        L2c:
            r8 = 1
        L2d:
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r1 = r4.state
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r2 = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.NotDispatching
            if (r1 == r2) goto L45
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            if (r6 != r1) goto L3c
            if (r8 == 0) goto L3c
            r4.dispatchToView(r5)
        L3c:
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            if (r6 != r1) goto L45
            if (r8 != 0) goto L45
            r4.dispatchToView(r5)
        L45:
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            if (r6 != r5) goto L62
            int r5 = r7.size()
        L4d:
            if (r0 >= r5) goto L5f
            java.lang.Object r6 = r7.get(r0)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r6)
            if (r6 != 0) goto L5c
            goto L62
        L5c:
            int r0 = r0 + 1
            goto L4d
        L5f:
            r4.reset()
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1.mo4017onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent, androidx.compose.ui.input.pointer.PointerEventPass, long):void");
    }
}
