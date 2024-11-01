package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavController$executePopOperations$5 extends AbstractC3293z implements Function1 {
    public static final NavController$executePopOperations$5 INSTANCE = new NavController$executePopOperations$5();

    NavController$executePopOperations$5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final NavDestination invoke(NavDestination destination) {
        AbstractC3292y.i(destination, "destination");
        NavGraph parent = destination.getParent();
        if (parent == null || parent.getStartDestinationId() != destination.getId()) {
            return null;
        }
        return destination.getParent();
    }
}
