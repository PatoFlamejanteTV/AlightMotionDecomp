package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2073o;
import i6.InterfaceC2977e;
import i6.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ Function0 $onValueChangeFinished;
    final /* synthetic */ State<Function1> $onValueChangeState;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ int $steps;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ InterfaceC2977e $value;
    final /* synthetic */ InterfaceC2977e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2(Function0 function0, int i8, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z8, InterfaceC2977e interfaceC2977e, InterfaceC2977e interfaceC2977e2, int i9, State<? extends Function1> state, float[] fArr, SliderColors sliderColors) {
        super(3);
        this.$onValueChangeFinished = function0;
        this.$$dirty = i8;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$enabled = z8;
        this.$valueRange = interfaceC2977e;
        this.$value = interfaceC2977e2;
        this.$steps = i9;
        this.$onValueChangeState = state;
        this.$tickFractions = fArr;
        this.$colors = sliderColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(InterfaceC2977e interfaceC2977e, P p8, P p9, float f8) {
        float scale;
        scale = SliderKt.scale(((Number) interfaceC2977e.getStart()).floatValue(), ((Number) interfaceC2977e.getEndInclusive()).floatValue(), f8, p8.f34570a, p9.f34570a);
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2977e invoke$scaleToUserValue(P p8, P p9, InterfaceC2977e interfaceC2977e, InterfaceC2977e interfaceC2977e2) {
        InterfaceC2977e scale;
        scale = SliderKt.scale(p8.f34570a, p9.f34570a, interfaceC2977e2, ((Number) interfaceC2977e.getStart()).floatValue(), ((Number) interfaceC2977e.getEndInclusive()).floatValue());
        return scale;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
        int i9;
        Modifier rangeSliderPressDragModifier;
        float calcFraction;
        float calcFraction2;
        Modifier sliderSemantics;
        Modifier sliderSemantics2;
        AbstractC3292y.i(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i8 & 14) == 0) {
            i9 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-990606702, i8, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:412)");
        }
        boolean z8 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        float m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(BoxWithConstraints.mo515getConstraintsmsEJaDk());
        P p8 = new P();
        P p9 = new P();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float f8 = 2;
        p8.f34570a = m5123getMaxWidthimpl - (density.mo425toPx0680j_4(SliderKt.getThumbWidth()) / f8);
        p9.f34570a = density.mo425toPx0680j_4(SliderKt.getThumbWidth()) / f8;
        I i10 = I.f8786a;
        InterfaceC2977e interfaceC2977e = this.$value;
        InterfaceC2977e interfaceC2977e2 = this.$valueRange;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(interfaceC2977e2, p9, p8, ((Number) interfaceC2977e.getStart()).floatValue())), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        InterfaceC2977e interfaceC2977e3 = this.$value;
        InterfaceC2977e interfaceC2977e4 = this.$valueRange;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(interfaceC2977e4, p9, p8, ((Number) interfaceC2977e3.getEndInclusive()).floatValue())), null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Function0 function0 = this.$onValueChangeFinished;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(function0);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new SliderKt$RangeSlider$2$gestureEndAction$1$1(function0);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(rememberedValue3, composer, 0);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new SliderKt$RangeSlider$2$onDrag$1(mutableState, mutableState2, this.$value, p9, this.$tickFractions, p8, this.$onValueChangeState, this.$valueRange), composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        rangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(companion2, this.$startInteractionSource, this.$endInteractionSource, mutableState, mutableState2, this.$enabled, z8, m5123getMaxWidthimpl, this.$valueRange, rememberUpdatedState, rememberUpdatedState2);
        float j8 = m.j(((Number) this.$value.getStart()).floatValue(), ((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$value.getEndInclusive()).floatValue());
        float j9 = m.j(((Number) this.$value.getEndInclusive()).floatValue(), ((Number) this.$value.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue());
        calcFraction = SliderKt.calcFraction(((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue(), j8);
        calcFraction2 = SliderKt.calcFraction(((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue(), j9);
        int floor = (int) Math.floor(this.$steps * calcFraction2);
        int floor2 = (int) Math.floor(this.$steps * (1.0f - calcFraction));
        boolean z9 = this.$enabled;
        Object obj = this.$onValueChangeState;
        Object valueOf = Float.valueOf(j9);
        State<Function1> state = this.$onValueChangeState;
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(obj) | composer.changed(valueOf);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed2 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new SliderKt$RangeSlider$2$startThumbSemantics$1$1(state, j9);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        sliderSemantics = SliderKt.sliderSemantics(companion2, j8, z9, (Function1) rememberedValue4, this.$onValueChangeFinished, m.b(((Number) this.$valueRange.getStart()).floatValue(), j9), floor);
        boolean z10 = this.$enabled;
        Object obj2 = this.$onValueChangeState;
        Object valueOf2 = Float.valueOf(j8);
        State<Function1> state2 = this.$onValueChangeState;
        composer.startReplaceableGroup(511388516);
        boolean changed3 = composer.changed(obj2) | composer.changed(valueOf2);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed3 || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new SliderKt$RangeSlider$2$endThumbSemantics$1$1(state2, j8);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        sliderSemantics2 = SliderKt.sliderSemantics(companion2, j9, z10, (Function1) rememberedValue5, this.$onValueChangeFinished, m.b(j8, ((Number) this.$valueRange.getEndInclusive()).floatValue()), floor2);
        boolean z11 = this.$enabled;
        float[] fArr = this.$tickFractions;
        SliderColors sliderColors = this.$colors;
        float f9 = p8.f34570a - p9.f34570a;
        MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
        MutableInteractionSource mutableInteractionSource2 = this.$endInteractionSource;
        int i11 = this.$$dirty;
        SliderKt.RangeSliderImpl(z11, calcFraction, calcFraction2, fArr, sliderColors, f9, mutableInteractionSource, mutableInteractionSource2, rangeSliderPressDragModifier, sliderSemantics, sliderSemantics2, composer, ((i11 >> 9) & 14) | 14159872 | ((i11 >> 9) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
