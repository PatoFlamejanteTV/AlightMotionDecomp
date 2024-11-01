package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.f;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import p6.g;

/* loaded from: classes.dex */
public final class DraggableNode extends DelegatingNode implements PointerInputModifierNode {
    private final Function1 _canDrag;
    private final Function0 _startDragImmediately;
    private Function1 canDrag;
    private final p6.d channel;
    private DragInteraction.Start dragInteraction;
    private boolean enabled;
    private MutableInteractionSource interactionSource;
    private InterfaceC2073o onDragStarted;
    private InterfaceC2073o onDragStopped;
    private Orientation orientation;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private boolean reverseDirection;
    private Function0 startDragImmediately;
    private DraggableState state;
    private final VelocityTracker velocityTracker;

    public DraggableNode(DraggableState state, Function1 canDrag, Orientation orientation, boolean z8, MutableInteractionSource mutableInteractionSource, Function0 startDragImmediately, InterfaceC2073o onDragStarted, InterfaceC2073o onDragStopped, boolean z9) {
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(canDrag, "canDrag");
        AbstractC3292y.i(orientation, "orientation");
        AbstractC3292y.i(startDragImmediately, "startDragImmediately");
        AbstractC3292y.i(onDragStarted, "onDragStarted");
        AbstractC3292y.i(onDragStopped, "onDragStopped");
        this.state = state;
        this.canDrag = canDrag;
        this.orientation = orientation;
        this.enabled = z8;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = startDragImmediately;
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.reverseDirection = z9;
        this._canDrag = new DraggableNode$_canDrag$1(this);
        this._startDragImmediately = new DraggableNode$_startDragImmediately$1(this);
        this.velocityTracker = new VelocityTracker();
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new DraggableNode$pointerInputNode$1(this, null)));
        this.channel = g.b(Integer.MAX_VALUE, null, null, 6, null);
    }

    private final void disposeInteractionSource() {
        DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragCancel(n6.M r9, U5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.DraggableNode$processDragCancel$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.DraggableNode$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DraggableNode$processDragCancel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DraggableNode$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DraggableNode$processDragCancel$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r10)
            goto L7c
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.L$1
            n6.M r9 = (n6.M) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DraggableNode r2 = (androidx.compose.foundation.gestures.DraggableNode) r2
            Q5.t.b(r10)
            goto L5f
        L41:
            Q5.t.b(r10)
            androidx.compose.foundation.interaction.DragInteraction$Start r10 = r8.dragInteraction
            if (r10 == 0) goto L62
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r8.interactionSource
            if (r2 == 0) goto L5e
            androidx.compose.foundation.interaction.DragInteraction$Cancel r6 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r6.<init>(r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r2.emit(r6, r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            r2 = r8
        L5f:
            r2.dragInteraction = r5
            goto L63
        L62:
            r2 = r8
        L63:
            c6.o r10 = r2.onDragStopped
            androidx.compose.ui.unit.Velocity$Companion r2 = androidx.compose.ui.unit.Velocity.Companion
            long r6 = r2.m5397getZero9UxMQ8M()
            androidx.compose.ui.unit.Velocity r2 = androidx.compose.ui.unit.Velocity.m5377boximpl(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r10.invoke(r9, r2, r0)
            if (r9 != r1) goto L7c
            return r1
        L7c:
            Q5.I r9 = Q5.I.f8786a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableNode.processDragCancel(n6.M, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragStart(n6.M r8, androidx.compose.foundation.gestures.DragEvent.DragStarted r9, U5.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.DraggableNode$processDragStart$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.DraggableNode$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DraggableNode$processDragStart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DraggableNode$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DraggableNode$processDragStart$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5d
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            Q5.t.b(r10)
            goto Lbb
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.L$3
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = (androidx.compose.foundation.interaction.DragInteraction.Start) r8
            java.lang.Object r9 = r0.L$2
            androidx.compose.foundation.gestures.DragEvent$DragStarted r9 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r9
            java.lang.Object r2 = r0.L$1
            n6.M r2 = (n6.M) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.gestures.DraggableNode r4 = (androidx.compose.foundation.gestures.DraggableNode) r4
            Q5.t.b(r10)
            goto L9a
        L4c:
            java.lang.Object r8 = r0.L$2
            r9 = r8
            androidx.compose.foundation.gestures.DragEvent$DragStarted r9 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r9
            java.lang.Object r8 = r0.L$1
            n6.M r8 = (n6.M) r8
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DraggableNode r2 = (androidx.compose.foundation.gestures.DraggableNode) r2
            Q5.t.b(r10)
            goto L7d
        L5d:
            Q5.t.b(r10)
            androidx.compose.foundation.interaction.DragInteraction$Start r10 = r7.dragInteraction
            if (r10 == 0) goto L7c
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r7.interactionSource
            if (r2 == 0) goto L7c
            androidx.compose.foundation.interaction.DragInteraction$Cancel r6 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r6.<init>(r10)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r5
            java.lang.Object r10 = r2.emit(r6, r0)
            if (r10 != r1) goto L7c
            return r1
        L7c:
            r2 = r7
        L7d:
            androidx.compose.foundation.interaction.DragInteraction$Start r10 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r10.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = r2.interactionSource
            if (r5 == 0) goto L9d
            r0.L$0 = r2
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.label = r4
            java.lang.Object r4 = r5.emit(r10, r0)
            if (r4 != r1) goto L97
            return r1
        L97:
            r4 = r2
            r2 = r8
            r8 = r10
        L9a:
            r10 = r8
            r8 = r2
            r2 = r4
        L9d:
            r2.dragInteraction = r10
            c6.o r10 = r2.onDragStarted
            long r4 = r9.m357getStartPointF1C5BW0()
            androidx.compose.ui.geometry.Offset r9 = androidx.compose.ui.geometry.Offset.m2701boximpl(r4)
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r3
            java.lang.Object r8 = r10.invoke(r8, r9, r0)
            if (r8 != r1) goto Lbb
            return r1
        Lbb:
            Q5.I r8 = Q5.I.f8786a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableNode.processDragStart(n6.M, androidx.compose.foundation.gestures.DragEvent$DragStarted, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragStop(n6.M r9, androidx.compose.foundation.gestures.DragEvent.DragStopped r10, U5.d r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.DraggableNode$processDragStop$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.gestures.DraggableNode$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DraggableNode$processDragStop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DraggableNode$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DraggableNode$processDragStop$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r11)
            goto L83
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.L$2
            r10 = r9
            androidx.compose.foundation.gestures.DragEvent$DragStopped r10 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) r10
            java.lang.Object r9 = r0.L$1
            n6.M r9 = (n6.M) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DraggableNode r2 = (androidx.compose.foundation.gestures.DraggableNode) r2
            Q5.t.b(r11)
            goto L66
        L46:
            Q5.t.b(r11)
            androidx.compose.foundation.interaction.DragInteraction$Start r11 = r8.dragInteraction
            if (r11 == 0) goto L69
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r8.interactionSource
            if (r2 == 0) goto L65
            androidx.compose.foundation.interaction.DragInteraction$Stop r6 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r6.<init>(r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r11 = r2.emit(r6, r0)
            if (r11 != r1) goto L65
            return r1
        L65:
            r2 = r8
        L66:
            r2.dragInteraction = r5
            goto L6a
        L69:
            r2 = r8
        L6a:
            c6.o r11 = r2.onDragStopped
            long r6 = r10.m358getVelocity9UxMQ8M()
            androidx.compose.ui.unit.Velocity r10 = androidx.compose.ui.unit.Velocity.m5377boximpl(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r9 = r11.invoke(r9, r10, r0)
            if (r9 != r1) goto L83
            return r1
        L83:
            Q5.I r9 = Q5.I.f8786a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableNode.processDragStop(n6.M, androidx.compose.foundation.gestures.DragEvent$DragStopped, U5.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return f.a(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        f.b(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInteractionSource();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo242onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long j8) {
        AbstractC3292y.i(pointerEvent, "pointerEvent");
        AbstractC3292y.i(pass, "pass");
        this.pointerInputNode.mo242onPointerEventH0pRuoY(pointerEvent, pass, j8);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        f.c(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return f.d(this);
    }

    public final void update(DraggableState state, Function1 canDrag, Orientation orientation, boolean z8, MutableInteractionSource mutableInteractionSource, Function0 startDragImmediately, InterfaceC2073o onDragStarted, InterfaceC2073o onDragStopped, boolean z9) {
        boolean z10;
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(canDrag, "canDrag");
        AbstractC3292y.i(orientation, "orientation");
        AbstractC3292y.i(startDragImmediately, "startDragImmediately");
        AbstractC3292y.i(onDragStarted, "onDragStarted");
        AbstractC3292y.i(onDragStopped, "onDragStopped");
        boolean z11 = true;
        if (!AbstractC3292y.d(this.state, state)) {
            this.state = state;
            z10 = true;
        } else {
            z10 = false;
        }
        this.canDrag = canDrag;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z10 = true;
        }
        if (this.enabled != z8) {
            this.enabled = z8;
            if (!z8) {
                disposeInteractionSource();
            }
            z10 = true;
        }
        if (!AbstractC3292y.d(this.interactionSource, mutableInteractionSource)) {
            disposeInteractionSource();
            this.interactionSource = mutableInteractionSource;
        }
        this.startDragImmediately = startDragImmediately;
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        if (this.reverseDirection != z9) {
            this.reverseDirection = z9;
        } else {
            z11 = z10;
        }
        if (z11) {
            this.pointerInputNode.resetPointerInputHandler();
        }
    }
}
