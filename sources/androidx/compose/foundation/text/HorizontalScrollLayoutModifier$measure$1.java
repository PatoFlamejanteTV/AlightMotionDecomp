package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.LayoutDirection;
import e6.AbstractC2829a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class HorizontalScrollLayoutModifier$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ int $width;
    final /* synthetic */ HorizontalScrollLayoutModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalScrollLayoutModifier$measure$1(MeasureScope measureScope, HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, Placeable placeable, int i8) {
        super(1);
        this.$this_measure = measureScope;
        this.this$0 = horizontalScrollLayoutModifier;
        this.$placeable = placeable;
        this.$width = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        Rect cursorRectInScroller;
        AbstractC3292y.i(layout, "$this$layout");
        MeasureScope measureScope = this.$this_measure;
        int cursorOffset = this.this$0.getCursorOffset();
        TransformedText transformedText = this.this$0.getTransformedText();
        TextLayoutResultProxy textLayoutResultProxy = (TextLayoutResultProxy) this.this$0.getTextLayoutResultProvider().invoke();
        cursorRectInScroller = TextFieldScrollKt.getCursorRectInScroller(measureScope, cursorOffset, transformedText, textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, this.$this_measure.getLayoutDirection() == LayoutDirection.Rtl, this.$placeable.getWidth());
        this.this$0.getScrollerPosition().update(Orientation.Horizontal, cursorRectInScroller, this.$width, this.$placeable.getWidth());
        Placeable.PlacementScope.placeRelative$default(layout, this.$placeable, AbstractC2829a.d(-this.this$0.getScrollerPosition().getOffset()), 0, 0.0f, 4, null);
    }
}
