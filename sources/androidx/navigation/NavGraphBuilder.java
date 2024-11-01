package androidx.navigation;

import androidx.annotation.IdRes;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

@NavDestinationDsl
/* loaded from: classes3.dex */
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {
    private final List<NavDestination> destinations;
    private final NavigatorProvider provider;

    @IdRes
    private int startDestinationId;
    private String startDestinationRoute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider provider, @IdRes int i8, @IdRes int i9) {
        super(provider.getNavigator(NavGraphNavigator.class), i8);
        AbstractC3292y.i(provider, "provider");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationId = i9;
    }

    public final void addDestination(NavDestination destination) {
        AbstractC3292y.i(destination, "destination");
        this.destinations.add(destination);
    }

    public final <D extends NavDestination> void destination(NavDestinationBuilder<? extends D> navDestination) {
        AbstractC3292y.i(navDestination, "navDestination");
        this.destinations.add(navDestination.build());
    }

    public final NavigatorProvider getProvider() {
        return this.provider;
    }

    public final void unaryPlus(NavDestination navDestination) {
        AbstractC3292y.i(navDestination, "<this>");
        addDestination(navDestination);
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public NavGraph build() {
        NavGraph navGraph = (NavGraph) super.build();
        navGraph.addDestinations(this.destinations);
        int i8 = this.startDestinationId;
        if (i8 == 0 && this.startDestinationRoute == null) {
            if (getRoute() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.startDestinationRoute;
        if (str != null) {
            AbstractC3292y.f(str);
            navGraph.setStartDestination(str);
        } else {
            navGraph.setStartDestination(i8);
        }
        return navGraph;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider provider, String startDestination, String str) {
        super(provider.getNavigator(NavGraphNavigator.class), str);
        AbstractC3292y.i(provider, "provider");
        AbstractC3292y.i(startDestination, "startDestination");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationRoute = startDestination;
    }
}
