package androidx.compose.material3;

import Q5.I;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.util.MathHelpersKt;
import i6.InterfaceC2977e;
import i6.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SliderKt$sliderSemantics$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ float $coerced;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ Function0 $onValueChangeFinished;
    final /* synthetic */ int $steps;
    final /* synthetic */ InterfaceC2977e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.SliderKt$sliderSemantics$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ float $coerced;
        final /* synthetic */ Function1 $onValueChange;
        final /* synthetic */ Function0 $onValueChangeFinished;
        final /* synthetic */ int $steps;
        final /* synthetic */ InterfaceC2977e $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC2977e interfaceC2977e, int i8, float f8, Function1 function1, Function0 function0) {
            super(1);
            this.$valueRange = interfaceC2977e;
            this.$steps = i8;
            this.$coerced = f8;
            this.$onValueChange = function1;
            this.$onValueChangeFinished = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }

        public final Boolean invoke(float f8) {
            int i8;
            float j8 = m.j(f8, ((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue());
            int i9 = this.$steps;
            boolean z8 = false;
            if (i9 > 0 && (i8 = i9 + 1) >= 0) {
                float f9 = j8;
                float f10 = f9;
                int i10 = 0;
                while (true) {
                    float lerp = MathHelpersKt.lerp(((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue(), i10 / (this.$steps + 1));
                    float f11 = lerp - j8;
                    if (Math.abs(f11) <= f9) {
                        f9 = Math.abs(f11);
                        f10 = lerp;
                    }
                    if (i10 == i8) {
                        break;
                    }
                    i10++;
                }
                j8 = f10;
            }
            if (j8 != this.$coerced) {
                this.$onValueChange.invoke(Float.valueOf(j8));
                Function0 function0 = this.$onValueChangeFinished;
                if (function0 != null) {
                    function0.invoke();
                }
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderSemantics$1(boolean z8, InterfaceC2977e interfaceC2977e, int i8, float f8, Function1 function1, Function0 function0) {
        super(1);
        this.$enabled = z8;
        this.$valueRange = interfaceC2977e;
        this.$steps = i8;
        this.$coerced = f8;
        this.$onValueChange = function1;
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        if (!this.$enabled) {
            SemanticsPropertiesKt.disabled(semantics);
        }
        SemanticsPropertiesKt.setProgress$default(semantics, null, new AnonymousClass1(this.$valueRange, this.$steps, this.$coerced, this.$onValueChange, this.$onValueChangeFinished), 1, null);
    }
}
