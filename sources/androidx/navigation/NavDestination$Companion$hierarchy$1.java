package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavDestination$Companion$hierarchy$1 extends AbstractC3293z implements Function1 {
    public static final NavDestination$Companion$hierarchy$1 INSTANCE = new NavDestination$Companion$hierarchy$1();

    NavDestination$Companion$hierarchy$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final NavDestination invoke(NavDestination it) {
        AbstractC3292y.i(it, "it");
        return it.getParent();
    }
}
