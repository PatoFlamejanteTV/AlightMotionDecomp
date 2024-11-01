package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BringIntoViewRequesterNode$bringIntoView$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Rect $rect;
    final /* synthetic */ BringIntoViewRequesterNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterNode$bringIntoView$2(Rect rect, BringIntoViewRequesterNode bringIntoViewRequesterNode) {
        super(0);
        this.$rect = rect;
        this.this$0 = bringIntoViewRequesterNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Rect invoke() {
        Rect rect = this.$rect;
        if (rect != null) {
            return rect;
        }
        LayoutCoordinates layoutCoordinates = this.this$0.getLayoutCoordinates();
        if (layoutCoordinates != null) {
            return SizeKt.m2802toRectuvyYCjk(IntSizeKt.m5331toSizeozmzZPI(layoutCoordinates.mo4115getSizeYbymL2g()));
        }
        return null;
    }
}
