package androidx.compose.animation;

import Q5.I;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createModifier$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ State<Float> $alpha$delegate;
    final /* synthetic */ State<Float> $scale$delegate;
    final /* synthetic */ State<TransformOrigin> $transformOrigin$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$1$1(State<Float> state, State<Float> state2, State<TransformOrigin> state3) {
        super(1);
        this.$alpha$delegate = state;
        this.$scale$delegate = state2;
        this.$transformOrigin$delegate = state3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return I.f8786a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayer) {
        float createModifier$lambda$8;
        float createModifier$lambda$11;
        float createModifier$lambda$112;
        long createModifier$lambda$13;
        AbstractC3292y.i(graphicsLayer, "$this$graphicsLayer");
        createModifier$lambda$8 = EnterExitTransitionKt.createModifier$lambda$8(this.$alpha$delegate);
        graphicsLayer.setAlpha(createModifier$lambda$8);
        createModifier$lambda$11 = EnterExitTransitionKt.createModifier$lambda$11(this.$scale$delegate);
        graphicsLayer.setScaleX(createModifier$lambda$11);
        createModifier$lambda$112 = EnterExitTransitionKt.createModifier$lambda$11(this.$scale$delegate);
        graphicsLayer.setScaleY(createModifier$lambda$112);
        createModifier$lambda$13 = EnterExitTransitionKt.createModifier$lambda$13(this.$transformOrigin$delegate);
        graphicsLayer.mo3121setTransformOrigin__ExYCQ(createModifier$lambda$13);
    }
}
