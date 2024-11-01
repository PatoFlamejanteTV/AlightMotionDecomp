package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class DrawerState$Companion$Saver$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $confirmStateChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerState$Companion$Saver$2(Function1 function1) {
        super(1);
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DrawerState invoke(DrawerValue it) {
        AbstractC3292y.i(it, "it");
        return new DrawerState(it, this.$confirmStateChange);
    }
}
