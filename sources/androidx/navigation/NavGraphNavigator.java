package androidx.navigation;

import R5.AbstractC1435t;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;

@Navigator.Name(NotificationCompat.CATEGORY_NAVIGATION)
/* loaded from: classes3.dex */
public class NavGraphNavigator extends Navigator<NavGraph> {
    private final NavigatorProvider navigatorProvider;

    public NavGraphNavigator(NavigatorProvider navigatorProvider) {
        AbstractC3292y.i(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    public final InterfaceC3813L getBackStack() {
        return getState().getBackStack();
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC3292y.i(entries, "entries");
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            navigate(it.next(), navOptions, extras);
        }
    }

    @Override // androidx.navigation.Navigator
    public NavGraph createDestination() {
        return new NavGraph(this);
    }

    private final void navigate(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.Extras extras) {
        NavDestination findNode;
        NavDestination destination = navBackStackEntry.getDestination();
        AbstractC3292y.g(destination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        NavGraph navGraph = (NavGraph) destination;
        Bundle arguments = navBackStackEntry.getArguments();
        int startDestinationId = navGraph.getStartDestinationId();
        String startDestinationRoute = navGraph.getStartDestinationRoute();
        if (startDestinationId == 0 && startDestinationRoute == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph.getDisplayName()).toString());
        }
        if (startDestinationRoute != null) {
            findNode = navGraph.findNode(startDestinationRoute, false);
        } else {
            findNode = navGraph.findNode(startDestinationId, false);
        }
        if (findNode != null) {
            this.navigatorProvider.getNavigator(findNode.getNavigatorName()).navigate(AbstractC1435t.e(getState().createBackStackEntry(findNode, findNode.addInDefaultArgs(arguments))), navOptions, extras);
            return;
        }
        throw new IllegalArgumentException("navigation destination " + navGraph.getStartDestDisplayName() + " is not a direct child of this NavGraph");
    }
}
