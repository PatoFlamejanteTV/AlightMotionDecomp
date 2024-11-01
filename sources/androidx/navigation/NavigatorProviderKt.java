package androidx.navigation;

import b6.AbstractC1989a;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NavigatorProviderKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, String name) {
        AbstractC3292y.i(navigatorProvider, "<this>");
        AbstractC3292y.i(name, "name");
        return (T) navigatorProvider.getNavigator(name);
    }

    public static final void plusAssign(NavigatorProvider navigatorProvider, Navigator<? extends NavDestination> navigator) {
        AbstractC3292y.i(navigatorProvider, "<this>");
        AbstractC3292y.i(navigator, "navigator");
        navigatorProvider.addNavigator(navigator);
    }

    public static final Navigator<? extends NavDestination> set(NavigatorProvider navigatorProvider, String name, Navigator<? extends NavDestination> navigator) {
        AbstractC3292y.i(navigatorProvider, "<this>");
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(navigator, "navigator");
        return navigatorProvider.addNavigator(name, navigator);
    }

    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, InterfaceC3214c clazz) {
        AbstractC3292y.i(navigatorProvider, "<this>");
        AbstractC3292y.i(clazz, "clazz");
        return (T) navigatorProvider.getNavigator(AbstractC1989a.a(clazz));
    }
}
