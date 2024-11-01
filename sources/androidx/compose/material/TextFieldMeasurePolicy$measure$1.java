package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TextFieldMeasurePolicy$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $effectiveLabelBaseline;
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ int $lastBaseline;
    final /* synthetic */ Placeable $leadingPlaceable;
    final /* synthetic */ Placeable $placeholderPlaceable;
    final /* synthetic */ Placeable $textFieldPlaceable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ int $topPadding;
    final /* synthetic */ int $topPaddingValue;
    final /* synthetic */ Placeable $trailingPlaceable;
    final /* synthetic */ int $width;
    final /* synthetic */ TextFieldMeasurePolicy this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMeasurePolicy$measure$1(Placeable placeable, int i8, int i9, int i10, int i11, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, TextFieldMeasurePolicy textFieldMeasurePolicy, int i12, int i13, MeasureScope measureScope) {
        super(1);
        this.$labelPlaceable = placeable;
        this.$topPaddingValue = i8;
        this.$lastBaseline = i9;
        this.$width = i10;
        this.$height = i11;
        this.$textFieldPlaceable = placeable2;
        this.$placeholderPlaceable = placeable3;
        this.$leadingPlaceable = placeable4;
        this.$trailingPlaceable = placeable5;
        this.this$0 = textFieldMeasurePolicy;
        this.$effectiveLabelBaseline = i12;
        this.$topPadding = i13;
        this.$this_measure = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        boolean z8;
        PaddingValues paddingValues;
        boolean z9;
        float f8;
        AbstractC3292y.i(layout, "$this$layout");
        if (this.$labelPlaceable != null) {
            int d8 = m.d(this.$topPaddingValue - this.$lastBaseline, 0);
            int i8 = this.$width;
            int i9 = this.$height;
            Placeable placeable = this.$textFieldPlaceable;
            Placeable placeable2 = this.$labelPlaceable;
            Placeable placeable3 = this.$placeholderPlaceable;
            Placeable placeable4 = this.$leadingPlaceable;
            Placeable placeable5 = this.$trailingPlaceable;
            z9 = this.this$0.singleLine;
            int i10 = this.$topPadding + this.$effectiveLabelBaseline;
            f8 = this.this$0.animationProgress;
            TextFieldKt.placeWithLabel(layout, i8, i9, placeable, placeable2, placeable3, placeable4, placeable5, z9, d8, i10, f8, this.$this_measure.getDensity());
            return;
        }
        int i11 = this.$width;
        int i12 = this.$height;
        Placeable placeable6 = this.$textFieldPlaceable;
        Placeable placeable7 = this.$placeholderPlaceable;
        Placeable placeable8 = this.$leadingPlaceable;
        Placeable placeable9 = this.$trailingPlaceable;
        z8 = this.this$0.singleLine;
        float density = this.$this_measure.getDensity();
        paddingValues = this.this$0.paddingValues;
        TextFieldKt.placeWithoutLabel(layout, i11, i12, placeable6, placeable7, placeable8, placeable9, z8, density, paddingValues);
    }
}
