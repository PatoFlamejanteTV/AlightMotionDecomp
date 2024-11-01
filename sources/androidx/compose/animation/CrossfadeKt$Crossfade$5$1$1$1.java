package androidx.compose.animation;

import Q5.I;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CrossfadeKt$Crossfade$5$1$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ State<Float> $alpha$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1$1$1(State<Float> state) {
        super(1);
        this.$alpha$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return I.f8786a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayer) {
        float invoke$lambda$1;
        AbstractC3292y.i(graphicsLayer, "$this$graphicsLayer");
        invoke$lambda$1 = CrossfadeKt$Crossfade$5$1.invoke$lambda$1(this.$alpha$delegate);
        graphicsLayer.setAlpha(invoke$lambda$1);
    }
}
