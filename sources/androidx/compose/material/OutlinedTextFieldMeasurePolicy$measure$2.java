package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy$measure$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $borderPlaceable;
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ Placeable $leadingPlaceable;
    final /* synthetic */ Placeable $placeholderPlaceable;
    final /* synthetic */ Placeable $textFieldPlaceable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ Placeable $trailingPlaceable;
    final /* synthetic */ int $width;
    final /* synthetic */ OutlinedTextFieldMeasurePolicy this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldMeasurePolicy$measure$2(int i8, int i9, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, MeasureScope measureScope) {
        super(1);
        this.$height = i8;
        this.$width = i9;
        this.$leadingPlaceable = placeable;
        this.$trailingPlaceable = placeable2;
        this.$textFieldPlaceable = placeable3;
        this.$labelPlaceable = placeable4;
        this.$placeholderPlaceable = placeable5;
        this.$borderPlaceable = placeable6;
        this.this$0 = outlinedTextFieldMeasurePolicy;
        this.$this_measure = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        float f8;
        boolean z8;
        PaddingValues paddingValues;
        AbstractC3292y.i(layout, "$this$layout");
        int i8 = this.$height;
        int i9 = this.$width;
        Placeable placeable = this.$leadingPlaceable;
        Placeable placeable2 = this.$trailingPlaceable;
        Placeable placeable3 = this.$textFieldPlaceable;
        Placeable placeable4 = this.$labelPlaceable;
        Placeable placeable5 = this.$placeholderPlaceable;
        Placeable placeable6 = this.$borderPlaceable;
        f8 = this.this$0.animationProgress;
        z8 = this.this$0.singleLine;
        float density = this.$this_measure.getDensity();
        LayoutDirection layoutDirection = this.$this_measure.getLayoutDirection();
        paddingValues = this.this$0.paddingValues;
        OutlinedTextFieldKt.place(layout, i8, i9, placeable, placeable2, placeable3, placeable4, placeable5, placeable6, f8, z8, density, layoutDirection, paddingValues);
    }
}
