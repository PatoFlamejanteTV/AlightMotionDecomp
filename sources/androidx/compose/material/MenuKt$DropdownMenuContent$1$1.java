package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MenuKt$DropdownMenuContent$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ State<Float> $alpha$delegate;
    final /* synthetic */ State<Float> $scale$delegate;
    final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$1$1(MutableState<TransformOrigin> mutableState, State<Float> state, State<Float> state2) {
        super(1);
        this.$transformOriginState = mutableState;
        this.$scale$delegate = state;
        this.$alpha$delegate = state2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return I.f8786a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayer) {
        float DropdownMenuContent$lambda$1;
        float DropdownMenuContent$lambda$12;
        float DropdownMenuContent$lambda$3;
        AbstractC3292y.i(graphicsLayer, "$this$graphicsLayer");
        DropdownMenuContent$lambda$1 = MenuKt.DropdownMenuContent$lambda$1(this.$scale$delegate);
        graphicsLayer.setScaleX(DropdownMenuContent$lambda$1);
        DropdownMenuContent$lambda$12 = MenuKt.DropdownMenuContent$lambda$1(this.$scale$delegate);
        graphicsLayer.setScaleY(DropdownMenuContent$lambda$12);
        DropdownMenuContent$lambda$3 = MenuKt.DropdownMenuContent$lambda$3(this.$alpha$delegate);
        graphicsLayer.setAlpha(DropdownMenuContent$lambda$3);
        graphicsLayer.mo3121setTransformOrigin__ExYCQ(this.$transformOriginState.getValue().m3315unboximpl());
    }
}
