package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DrawerState$anchoredDraggableState$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ DrawerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerState$anchoredDraggableState$1(DrawerState drawerState) {
        super(1);
        this.this$0 = drawerState;
    }

    public final Float invoke(float f8) {
        Density requireDensity;
        float f9;
        requireDensity = this.this$0.requireDensity();
        f9 = DrawerKt.DrawerPositionalThreshold;
        return Float.valueOf(requireDensity.mo425toPx0680j_4(f9));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
