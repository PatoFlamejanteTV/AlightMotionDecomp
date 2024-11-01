package androidx.compose.material;

import U5.d;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.S;

/* loaded from: classes.dex */
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    static {
        float m5155constructorimpl = Dp.m5155constructorimpl((float) 0.125d);
        mouseSlop = m5155constructorimpl;
        float m5155constructorimpl2 = Dp.m5155constructorimpl(18);
        defaultTouchSlop = m5155constructorimpl2;
        mouseToTouchSlopRatio = m5155constructorimpl / m5155constructorimpl2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x011b -> B:14:0x0126). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x015c -> B:11:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x017f -> B:14:0x0126). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1191awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, c6.InterfaceC2072n r24, U5.d r25) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DragGestureDetectorCopyKt.m1191awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, c6.n, U5.d):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m1192awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j8, int i8, InterfaceC2072n interfaceC2072n, Function1 function1, d dVar) {
        float f8;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (m1193isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j8)) {
            return null;
        }
        float m1194pointerSlopE8SPZFQ = m1194pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i8);
        S s8 = new S();
        s8.f34572a = j8;
        float f9 = 0.0f;
        while (true) {
            AbstractC3290w.c(0);
            Object t8 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope, null, dVar, 1, null);
            AbstractC3290w.c(1);
            PointerEvent pointerEvent = (PointerEvent) t8;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    pointerInputChange = changes.get(i9);
                    f8 = f9;
                    if (Boolean.valueOf(PointerId.m3975equalsimpl0(pointerInputChange.m3991getIdJ3iCeTQ(), s8.f34572a)).booleanValue()) {
                        break;
                    }
                    i9++;
                    f9 = f8;
                } else {
                    f8 = f9;
                    pointerInputChange = null;
                    break;
                }
            }
            AbstractC3292y.f(pointerInputChange);
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size2) {
                        pointerInputChange2 = changes2.get(i10);
                        if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                            break;
                        }
                        i10++;
                    } else {
                        pointerInputChange2 = null;
                        break;
                    }
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                s8.f34572a = pointerInputChange4.m3991getIdJ3iCeTQ();
            } else {
                float floatValue = f8 + (((Number) function1.invoke(Offset.m2701boximpl(pointerInputChange3.m3993getPositionF1C5BW0()))).floatValue() - ((Number) function1.invoke(Offset.m2701boximpl(pointerInputChange3.m3994getPreviousPositionF1C5BW0()))).floatValue());
                if (Math.abs(floatValue) < m1194pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    AbstractC3290w.c(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, dVar);
                    AbstractC3290w.c(1);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f8 = floatValue;
                } else {
                    interfaceC2072n.invoke(pointerInputChange3, Float.valueOf(floatValue - (Math.signum(floatValue) * m1194pointerSlopE8SPZFQ)));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    f8 = 0.0f;
                    f9 = f8;
                }
            }
            f9 = f8;
        }
    }

    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m1193isPointerUpDmW0f2w(PointerEvent pointerEvent, long j8) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                pointerInputChange = changes.get(i8);
                if (PointerId.m3975equalsimpl0(pointerInputChange.m3991getIdJ3iCeTQ(), j8)) {
                    break;
                }
                i8++;
            } else {
                pointerInputChange = null;
                break;
            }
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z8 = true;
        }
        return true ^ z8;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m1194pointerSlopE8SPZFQ(ViewConfiguration pointerSlop, int i8) {
        AbstractC3292y.i(pointerSlop, "$this$pointerSlop");
        if (PointerType.m4054equalsimpl0(i8, PointerType.Companion.m4059getMouseT8wyACA())) {
            return pointerSlop.getTouchSlop() * mouseToTouchSlopRatio;
        }
        return pointerSlop.getTouchSlop();
    }
}
