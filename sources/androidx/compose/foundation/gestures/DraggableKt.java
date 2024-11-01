package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.unit.Velocity;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import p6.v;

/* loaded from: classes.dex */
public final class DraggableKt {
    public static final DraggableState DraggableState(Function1 onDelta) {
        AbstractC3292y.i(onDelta, "onDelta");
        return new DefaultDraggableState(onDelta);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02dd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ca  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0225 -> B:16:0x0234). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x028e -> B:13:0x0293). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x02df -> B:16:0x0234). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, kotlin.jvm.functions.Function1 r21, kotlin.jvm.functions.Function0 r22, androidx.compose.ui.input.pointer.util.VelocityTracker r23, androidx.compose.foundation.gestures.Orientation r24, U5.d r25) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.ui.input.pointer.util.VelocityTracker, androidx.compose.foundation.gestures.Orientation, U5.d):java.lang.Object");
    }

    /* renamed from: awaitDrag-Su4bsnU */
    public static final Object m399awaitDragSu4bsnU(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, long j8, VelocityTracker velocityTracker, v vVar, boolean z8, Orientation orientation, U5.d dVar) {
        long j9;
        vVar.x(new DragEvent.DragStarted(Offset.m2716minusMKHz9U(pointerInputChange.m3993getPositionF1C5BW0(), OffsetKt.Offset(Offset.m2712getXimpl(j8) * Math.signum(Offset.m2712getXimpl(pointerInputChange.m3993getPositionF1C5BW0())), Offset.m2713getYimpl(j8) * Math.signum(Offset.m2713getYimpl(pointerInputChange.m3993getPositionF1C5BW0())))), null));
        if (z8) {
            j9 = Offset.m2719timestuRUvjQ(j8, -1.0f);
        } else {
            j9 = j8;
        }
        vVar.x(new DragEvent.DragDelta(j9, null));
        return m400onDragOrUpAxegvzg(awaitPointerEventScope, orientation, pointerInputChange.m3991getIdJ3iCeTQ(), new DraggableKt$awaitDrag$2(velocityTracker, vVar, z8), dVar);
    }

    public static final Modifier draggable(Modifier modifier, DraggableState state, Orientation orientation, boolean z8, MutableInteractionSource mutableInteractionSource, boolean z9, InterfaceC2073o onDragStarted, InterfaceC2073o onDragStopped, boolean z10) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(orientation, "orientation");
        AbstractC3292y.i(onDragStarted, "onDragStarted");
        AbstractC3292y.i(onDragStopped, "onDragStopped");
        return modifier.then(new DraggableElement(state, DraggableKt$draggable$3.INSTANCE, orientation, z8, mutableInteractionSource, new DraggableKt$draggable$4(z9), onDragStarted, new DraggableKt$draggable$5(onDragStopped, orientation, null), z10));
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z8, MutableInteractionSource mutableInteractionSource, boolean z9, InterfaceC2073o interfaceC2073o, InterfaceC2073o interfaceC2073o2, boolean z10, int i8, Object obj) {
        boolean z11;
        MutableInteractionSource mutableInteractionSource2;
        boolean z12;
        InterfaceC2073o interfaceC2073o3;
        InterfaceC2073o interfaceC2073o4;
        boolean z13;
        if ((i8 & 4) != 0) {
            z11 = true;
        } else {
            z11 = z8;
        }
        if ((i8 & 8) != 0) {
            mutableInteractionSource2 = null;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if ((i8 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z9;
        }
        if ((i8 & 32) != 0) {
            interfaceC2073o3 = new DraggableKt$draggable$1(null);
        } else {
            interfaceC2073o3 = interfaceC2073o;
        }
        if ((i8 & 64) != 0) {
            interfaceC2073o4 = new DraggableKt$draggable$2(null);
        } else {
            interfaceC2073o4 = interfaceC2073o2;
        }
        if ((i8 & 128) != 0) {
            z13 = false;
        } else {
            z13 = z10;
        }
        return draggable(modifier, draggableState, orientation, z11, mutableInteractionSource2, z12, interfaceC2073o3, interfaceC2073o4, z13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:            if ((!r16) != false) goto L133;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0090 -> B:10:0x0097). Please report as a decompilation issue!!! */
    /* renamed from: onDragOrUp-Axegvzg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m400onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, androidx.compose.foundation.gestures.Orientation r19, long r20, kotlin.jvm.functions.Function1 r22, U5.d r23) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m400onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.Orientation, long, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    @Composable
    public static final DraggableState rememberDraggableState(Function1 onDelta, Composer composer, int i8) {
        AbstractC3292y.i(onDelta, "onDelta");
        composer.startReplaceableGroup(-183245213);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i8, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:139)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onDelta, composer, i8 & 14);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = DraggableState(new DraggableKt$rememberDraggableState$1$1(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggableState;
    }

    /* renamed from: toFloat-3MmeM6k */
    public static final float m401toFloat3MmeM6k(long j8, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return Offset.m2713getYimpl(j8);
        }
        return Offset.m2712getXimpl(j8);
    }

    /* renamed from: toFloat-sF-c-tU */
    public static final float m402toFloatsFctU(long j8, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return Velocity.m5387getYimpl(j8);
        }
        return Velocity.m5386getXimpl(j8);
    }
}
