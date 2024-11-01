package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@NavDestinationDsl
/* loaded from: classes3.dex */
public class NavDestinationBuilder<D extends NavDestination> {
    private Map<Integer, NavAction> actions;
    private Map<String, NavArgument> arguments;
    private List<NavDeepLink> deepLinks;
    private final int id;
    private CharSequence label;
    private final Navigator<? extends D> navigator;
    private final String route;

    public NavDestinationBuilder(Navigator<? extends D> navigator, @IdRes int i8, String str) {
        AbstractC3292y.i(navigator, "navigator");
        this.navigator = navigator;
        this.id = i8;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    public final void action(int i8, Function1 actionBuilder) {
        AbstractC3292y.i(actionBuilder, "actionBuilder");
        Map<Integer, NavAction> map = this.actions;
        Integer valueOf = Integer.valueOf(i8);
        NavActionBuilder navActionBuilder = new NavActionBuilder();
        actionBuilder.invoke(navActionBuilder);
        map.put(valueOf, navActionBuilder.build$navigation_common_release());
    }

    public final void argument(String name, Function1 argumentBuilder) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(argumentBuilder, "argumentBuilder");
        Map<String, NavArgument> map = this.arguments;
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        argumentBuilder.invoke(navArgumentBuilder);
        map.put(name, navArgumentBuilder.build());
    }

    public D build() {
        D createDestination = this.navigator.createDestination();
        createDestination.setLabel(this.label);
        for (Map.Entry<String, NavArgument> entry : this.arguments.entrySet()) {
            createDestination.addArgument(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.deepLinks.iterator();
        while (it.hasNext()) {
            createDestination.addDeepLink((NavDeepLink) it.next());
        }
        for (Map.Entry<Integer, NavAction> entry2 : this.actions.entrySet()) {
            createDestination.putAction(entry2.getKey().intValue(), entry2.getValue());
        }
        String str = this.route;
        if (str != null) {
            createDestination.setRoute(str);
        }
        int i8 = this.id;
        if (i8 != -1) {
            createDestination.setId(i8);
        }
        return createDestination;
    }

    public final void deepLink(String uriPattern) {
        AbstractC3292y.i(uriPattern, "uriPattern");
        this.deepLinks.add(new NavDeepLink(uriPattern));
    }

    public final int getId() {
        return this.id;
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    protected final Navigator<? extends D> getNavigator() {
        return this.navigator;
    }

    public final String getRoute() {
        return this.route;
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void deepLink(Function1 navDeepLink) {
        AbstractC3292y.i(navDeepLink, "navDeepLink");
        List<NavDeepLink> list = this.deepLinks;
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        navDeepLink.invoke(navDeepLinkDslBuilder);
        list.add(navDeepLinkDslBuilder.build$navigation_common_release());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator<? extends D> navigator, @IdRes int i8) {
        this(navigator, i8, null);
        AbstractC3292y.i(navigator, "navigator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator<? extends D> navigator, String str) {
        this(navigator, -1, str);
        AbstractC3292y.i(navigator, "navigator");
    }
}
