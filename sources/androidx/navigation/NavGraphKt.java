package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NavGraphKt {
    public static final boolean contains(NavGraph navGraph, @IdRes int i8) {
        AbstractC3292y.i(navGraph, "<this>");
        return navGraph.findNode(i8) != null;
    }

    public static final NavDestination get(NavGraph navGraph, @IdRes int i8) {
        AbstractC3292y.i(navGraph, "<this>");
        NavDestination findNode = navGraph.findNode(i8);
        if (findNode != null) {
            return findNode;
        }
        throw new IllegalArgumentException("No destination for " + i8 + " was found in " + navGraph);
    }

    public static final void minusAssign(NavGraph navGraph, NavDestination node) {
        AbstractC3292y.i(navGraph, "<this>");
        AbstractC3292y.i(node, "node");
        navGraph.remove(node);
    }

    public static final void plusAssign(NavGraph navGraph, NavDestination node) {
        AbstractC3292y.i(navGraph, "<this>");
        AbstractC3292y.i(node, "node");
        navGraph.addDestination(node);
    }

    public static final boolean contains(NavGraph navGraph, String route) {
        AbstractC3292y.i(navGraph, "<this>");
        AbstractC3292y.i(route, "route");
        return navGraph.findNode(route) != null;
    }

    public static final NavDestination get(NavGraph navGraph, String route) {
        AbstractC3292y.i(navGraph, "<this>");
        AbstractC3292y.i(route, "route");
        NavDestination findNode = navGraph.findNode(route);
        if (findNode != null) {
            return findNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }

    public static final void plusAssign(NavGraph navGraph, NavGraph other) {
        AbstractC3292y.i(navGraph, "<this>");
        AbstractC3292y.i(other, "other");
        navGraph.addAll(other);
    }
}
