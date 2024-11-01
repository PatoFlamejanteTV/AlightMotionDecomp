package androidx.compose.ui.layout;

import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public FixedSizeIntrinsicsPlaceable(int i8, int i9) {
        m4144setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i8, i9));
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo4109placeAtf8xVGno(long j8, float f8, Function1 function1) {
    }
}
