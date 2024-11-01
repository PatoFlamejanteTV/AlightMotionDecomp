package androidx.compose.ui.input.pointer;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import c6.InterfaceC2073o;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class PointerInputTestUtilKt {
    public static final PointerInputChange down(long j8, long j9, float f8, float f9) {
        return new PointerInputChange(PointerId.m3973constructorimpl(j8), j9, OffsetKt.Offset(f8, f9), true, 1.0f, j9, OffsetKt.Offset(f8, f9), false, false, 0, 0L, 1536, (AbstractC3284p) null);
    }

    public static /* synthetic */ PointerInputChange down$default(long j8, long j9, float f8, float f9, int i8, Object obj) {
        float f10;
        float f11;
        if ((i8 & 2) != 0) {
            j9 = 0;
        }
        long j10 = j9;
        if ((i8 & 4) != 0) {
            f10 = 0.0f;
        } else {
            f10 = f8;
        }
        if ((i8 & 8) != 0) {
            f11 = 0.0f;
        } else {
            f11 = f9;
        }
        return down(j8, j10, f10, f11);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m4033invokeOverAllPassesH0pRuoY(InterfaceC2073o interfaceC2073o, PointerEvent pointerEvent, long j8) {
        m4037invokeOverPasseshUlJWOE(interfaceC2073o, pointerEvent, (List<? extends PointerEventPass>) AbstractC1435t.p(PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final), j8);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m4034invokeOverAllPassesH0pRuoY$default(InterfaceC2073o interfaceC2073o, PointerEvent pointerEvent, long j8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m4033invokeOverAllPassesH0pRuoY(interfaceC2073o, pointerEvent, j8);
    }

    /* renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m4035invokeOverPasshUlJWOE(InterfaceC2073o interfaceC2073o, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j8) {
        m4037invokeOverPasseshUlJWOE(interfaceC2073o, pointerEvent, (List<? extends PointerEventPass>) AbstractC1435t.e(pointerEventPass), j8);
    }

    /* renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m4036invokeOverPasshUlJWOE$default(InterfaceC2073o interfaceC2073o, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            j8 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m4035invokeOverPasshUlJWOE(interfaceC2073o, pointerEvent, pointerEventPass, j8);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m4038invokeOverPasseshUlJWOE(InterfaceC2073o interfaceC2073o, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j8) {
        m4037invokeOverPasseshUlJWOE(interfaceC2073o, pointerEvent, (List<? extends PointerEventPass>) AbstractC1428l.V0(pointerEventPassArr), j8);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m4040invokeOverPasseshUlJWOE$default(InterfaceC2073o interfaceC2073o, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            j8 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m4038invokeOverPasseshUlJWOE(interfaceC2073o, pointerEvent, pointerEventPassArr, j8);
    }

    public static final PointerInputChange moveBy(PointerInputChange pointerInputChange, long j8, float f8, float f9) {
        long m3991getIdJ3iCeTQ = pointerInputChange.m3991getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(m3991getIdJ3iCeTQ, pointerInputChange.getUptimeMillis() + j8, OffsetKt.Offset(Offset.m2712getXimpl(pointerInputChange.m3993getPositionF1C5BW0()) + f8, Offset.m2713getYimpl(pointerInputChange.m3993getPositionF1C5BW0()) + f9), true, 1.0f, uptimeMillis, pointerInputChange.m3993getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (AbstractC3284p) null);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange pointerInputChange, long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 4) != 0) {
            f9 = 0.0f;
        }
        return moveBy(pointerInputChange, j8, f8, f9);
    }

    public static final PointerInputChange moveTo(PointerInputChange pointerInputChange, long j8, float f8, float f9) {
        long m3991getIdJ3iCeTQ = pointerInputChange.m3991getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(m3991getIdJ3iCeTQ, j8, OffsetKt.Offset(f8, f9), true, 1.0f, uptimeMillis, pointerInputChange.m3993getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (AbstractC3284p) null);
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange pointerInputChange, long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 4) != 0) {
            f9 = 0.0f;
        }
        return moveTo(pointerInputChange, j8, f8, f9);
    }

    public static final PointerInputChange up(PointerInputChange pointerInputChange, long j8) {
        long m3991getIdJ3iCeTQ = pointerInputChange.m3991getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(m3991getIdJ3iCeTQ, j8, pointerInputChange.m3993getPositionF1C5BW0(), false, 1.0f, uptimeMillis, pointerInputChange.m3993getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (AbstractC3284p) null);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m4037invokeOverPasseshUlJWOE(InterfaceC2073o interfaceC2073o, PointerEvent pointerEvent, List<? extends PointerEventPass> list, long j8) {
        if (!pointerEvent.getChanges().isEmpty()) {
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    interfaceC2073o.invoke(pointerEvent, list.get(i8), IntSize.m5313boximpl(j8));
                }
                return;
            }
            throw new IllegalArgumentException("invokeOverPasses called with no passes".toString());
        }
        throw new IllegalArgumentException("invokeOverPasses called with no changes".toString());
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m4039invokeOverPasseshUlJWOE$default(InterfaceC2073o interfaceC2073o, PointerEvent pointerEvent, List list, long j8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            j8 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m4037invokeOverPasseshUlJWOE(interfaceC2073o, pointerEvent, (List<? extends PointerEventPass>) list, j8);
    }
}
