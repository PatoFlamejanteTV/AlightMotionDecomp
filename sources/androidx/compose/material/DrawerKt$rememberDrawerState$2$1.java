package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DrawerKt$rememberDrawerState$2$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Function1 $confirmStateChange;
    final /* synthetic */ DrawerValue $initialValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$rememberDrawerState$2$1(DrawerValue drawerValue, Function1 function1) {
        super(0);
        this.$initialValue = drawerValue;
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DrawerState invoke() {
        return new DrawerState(this.$initialValue, this.$confirmStateChange);
    }
}
