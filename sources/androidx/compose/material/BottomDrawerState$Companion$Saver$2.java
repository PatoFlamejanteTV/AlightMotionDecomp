package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomDrawerState$Companion$Saver$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $confirmStateChange;
    final /* synthetic */ Density $density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomDrawerState$Companion$Saver$2(Density density, Function1 function1) {
        super(1);
        this.$density = density;
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BottomDrawerState invoke(BottomDrawerValue it) {
        AbstractC3292y.i(it, "it");
        return DrawerKt.BottomDrawerState(it, this.$density, this.$confirmStateChange);
    }
}
