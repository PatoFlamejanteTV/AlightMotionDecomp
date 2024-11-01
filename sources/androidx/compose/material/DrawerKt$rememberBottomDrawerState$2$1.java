package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DrawerKt$rememberBottomDrawerState$2$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Function1 $confirmStateChange;
    final /* synthetic */ Density $density;
    final /* synthetic */ BottomDrawerValue $initialValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$rememberBottomDrawerState$2$1(BottomDrawerValue bottomDrawerValue, Density density, Function1 function1) {
        super(0);
        this.$initialValue = bottomDrawerValue;
        this.$density = density;
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BottomDrawerState invoke() {
        return DrawerKt.BottomDrawerState(this.$initialValue, this.$density, this.$confirmStateChange);
    }
}
