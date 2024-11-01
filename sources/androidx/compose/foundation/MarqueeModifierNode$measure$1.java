package androidx.compose.foundation;

import Q5.I;
import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.layout.Placeable;
import e6.AbstractC2829a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class MarqueeModifierNode$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MarqueeModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$measure$1(Placeable placeable, MarqueeModifierNode marqueeModifierNode) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = marqueeModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        Animatable animatable;
        float direction;
        AbstractC3292y.i(layout, "$this$layout");
        Placeable placeable = this.$placeable;
        animatable = this.this$0.offset;
        float f8 = -((Number) animatable.getValue()).floatValue();
        direction = this.this$0.getDirection();
        Placeable.PlacementScope.placeWithLayer$default(layout, placeable, AbstractC2829a.d(f8 * direction), 0, 0.0f, null, 12, null);
    }
}
