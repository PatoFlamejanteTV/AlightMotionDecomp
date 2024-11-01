package androidx.compose.ui.window;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final long offset;

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j8, AbstractC3284p abstractC3284p) {
        this(alignment, j8);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo987calculatePositionllwVHH4(IntRect intRect, long j8, LayoutDirection layoutDirection, long j9) {
        int i8;
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.Companion;
        long mo2585alignKFBX0sM = alignment.mo2585alignKFBX0sM(companion.m5326getZeroYbymL2g(), intRect.m5305getSizeYbymL2g(), layoutDirection);
        long mo2585alignKFBX0sM2 = this.alignment.mo2585alignKFBX0sM(companion.m5326getZeroYbymL2g(), j9, layoutDirection);
        long IntOffset = IntOffsetKt.IntOffset(-IntOffset.m5279getXimpl(mo2585alignKFBX0sM2), -IntOffset.m5280getYimpl(mo2585alignKFBX0sM2));
        int m5279getXimpl = IntOffset.m5279getXimpl(this.offset);
        if (layoutDirection == LayoutDirection.Ltr) {
            i8 = 1;
        } else {
            i8 = -1;
        }
        long IntOffset2 = IntOffsetKt.IntOffset(m5279getXimpl * i8, IntOffset.m5280getYimpl(this.offset));
        long m5307getTopLeftnOccac = intRect.m5307getTopLeftnOccac();
        long IntOffset3 = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(m5307getTopLeftnOccac) + IntOffset.m5279getXimpl(mo2585alignKFBX0sM), IntOffset.m5280getYimpl(m5307getTopLeftnOccac) + IntOffset.m5280getYimpl(mo2585alignKFBX0sM));
        long IntOffset4 = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(IntOffset3) + IntOffset.m5279getXimpl(IntOffset), IntOffset.m5280getYimpl(IntOffset3) + IntOffset.m5280getYimpl(IntOffset));
        return IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(IntOffset4) + IntOffset.m5279getXimpl(IntOffset2), IntOffset.m5280getYimpl(IntOffset4) + IntOffset.m5280getYimpl(IntOffset2));
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    public final long m5407getOffsetnOccac() {
        return this.offset;
    }

    private AlignmentOffsetPositionProvider(Alignment alignment, long j8) {
        this.alignment = alignment;
        this.offset = j8;
    }
}
