package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class PointerInputFilter {
    public static final int $stable = 8;
    private boolean isAttached;
    private LayoutCoordinates layoutCoordinates;

    public static /* synthetic */ void getShareWithSiblings$annotations() {
    }

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    public final LayoutCoordinates getLayoutCoordinates$ui_release() {
        return this.layoutCoordinates;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m4016getSizeYbymL2g() {
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        if (layoutCoordinates != null) {
            return layoutCoordinates.mo4115getSizeYbymL2g();
        }
        return IntSize.Companion.m5326getZeroYbymL2g();
    }

    public final boolean isAttached$ui_release() {
        return this.isAttached;
    }

    public abstract void onCancel();

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public abstract void mo4017onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j8);

    public final void setAttached$ui_release(boolean z8) {
        this.isAttached = z8;
    }

    public final void setLayoutCoordinates$ui_release(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }
}
