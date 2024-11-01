package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.navigation.Navigator;
import kotlin.jvm.internal.AbstractC3292y;

@Navigator.Name("NoOp")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class NoOpNavigator extends Navigator<NavDestination> {
    @Override // androidx.navigation.Navigator
    public NavDestination createDestination() {
        return new NavDestination(this);
    }

    @Override // androidx.navigation.Navigator
    public NavDestination navigate(NavDestination destination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC3292y.i(destination, "destination");
        return destination;
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
        return true;
    }
}
