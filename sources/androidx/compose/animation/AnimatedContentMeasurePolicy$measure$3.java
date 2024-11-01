package androidx.compose.animation;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AnimatedContentMeasurePolicy$measure$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ Placeable[] $placeables;
    final /* synthetic */ AnimatedContentMeasurePolicy this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentMeasurePolicy$measure$3(Placeable[] placeableArr, AnimatedContentMeasurePolicy animatedContentMeasurePolicy, int i8, int i9) {
        super(1);
        this.$placeables = placeableArr;
        this.this$0 = animatedContentMeasurePolicy;
        this.$maxWidth = i8;
        this.$maxHeight = i9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        Placeable[] placeableArr = this.$placeables;
        AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this.this$0;
        int i8 = this.$maxWidth;
        int i9 = this.$maxHeight;
        for (Placeable placeable : placeableArr) {
            if (placeable != null) {
                long mo2585alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment$animation_release().mo2585alignKFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(i8, i9), LayoutDirection.Ltr);
                Placeable.PlacementScope.place$default(layout, placeable, IntOffset.m5279getXimpl(mo2585alignKFBX0sM), IntOffset.m5280getYimpl(mo2585alignKFBX0sM), 0.0f, 4, null);
            }
        }
    }
}
