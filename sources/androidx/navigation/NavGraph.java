package androidx.navigation;

import Q5.I;
import R5.AbstractC1435t;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDestination;
import d6.InterfaceC2767a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import k6.AbstractC3258j;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes3.dex */
public class NavGraph extends NavDestination implements Iterable<NavDestination>, InterfaceC2767a {
    public static final Companion Companion = new Companion(null);
    private final SparseArrayCompat<NavDestination> nodes;
    private int startDestId;
    private String startDestIdName;
    private String startDestinationRoute;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final NavDestination findStartDestination(NavGraph navGraph) {
            AbstractC3292y.i(navGraph, "<this>");
            return (NavDestination) AbstractC3258j.x(AbstractC3258j.h(navGraph.findNode(navGraph.getStartDestinationId()), NavGraph$Companion$findStartDestination$1.INSTANCE));
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(Navigator<? extends NavGraph> navGraphNavigator) {
        super(navGraphNavigator);
        AbstractC3292y.i(navGraphNavigator, "navGraphNavigator");
        this.nodes = new SparseArrayCompat<>();
    }

    public static final NavDestination findStartDestination(NavGraph navGraph) {
        return Companion.findStartDestination(navGraph);
    }

    private final void setStartDestinationId(int i8) {
        if (i8 != getId()) {
            if (this.startDestinationRoute != null) {
                setStartDestinationRoute(null);
            }
            this.startDestId = i8;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i8 + " cannot use the same id as the graph " + this).toString());
    }

    private final void setStartDestinationRoute(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else if (!AbstractC3292y.d(str, getRoute())) {
            if (!n.T(str)) {
                hashCode = NavDestination.Companion.createRoute(str).hashCode();
            } else {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
        } else {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        }
        this.startDestId = hashCode;
        this.startDestinationRoute = str;
    }

    public final void addAll(NavGraph other) {
        AbstractC3292y.i(other, "other");
        Iterator<NavDestination> it = other.iterator();
        while (it.hasNext()) {
            NavDestination next = it.next();
            it.remove();
            addDestination(next);
        }
    }

    public final void addDestination(NavDestination node) {
        AbstractC3292y.i(node, "node");
        int id = node.getId();
        String route = node.getRoute();
        if (id == 0 && route == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        if (getRoute() != null && !(!AbstractC3292y.d(route, getRoute()))) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (id != getId()) {
            NavDestination navDestination = this.nodes.get(id);
            if (navDestination == node) {
                return;
            }
            if (node.getParent() == null) {
                if (navDestination != null) {
                    navDestination.setParent(null);
                }
                node.setParent(this);
                this.nodes.put(node.getId(), node);
                return;
            }
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        }
        throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
    }

    public final void addDestinations(Collection<? extends NavDestination> nodes) {
        AbstractC3292y.i(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            if (navDestination != null) {
                addDestination(navDestination);
            }
        }
    }

    public final void clear() {
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override // androidx.navigation.NavDestination
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof NavGraph) && super.equals(obj)) {
            NavGraph navGraph = (NavGraph) obj;
            if (this.nodes.size() == navGraph.nodes.size() && getStartDestinationId() == navGraph.getStartDestinationId()) {
                for (NavDestination navDestination : AbstractC3258j.c(SparseArrayKt.valueIterator(this.nodes))) {
                    if (!AbstractC3292y.d(navDestination, navGraph.nodes.get(navDestination.getId()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final NavDestination findNode(@IdRes int i8) {
        return findNode(i8, true);
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getDisplayName() {
        if (getId() != 0) {
            return super.getDisplayName();
        }
        return "the root navigation";
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final SparseArrayCompat<NavDestination> getNodes() {
        return this.nodes;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String getStartDestDisplayName() {
        if (this.startDestIdName == null) {
            String str = this.startDestinationRoute;
            if (str == null) {
                str = String.valueOf(this.startDestId);
            }
            this.startDestIdName = str;
        }
        String str2 = this.startDestIdName;
        AbstractC3292y.f(str2);
        return str2;
    }

    @IdRes
    public final int getStartDestination() {
        return getStartDestinationId();
    }

    @IdRes
    public final int getStartDestinationId() {
        return this.startDestId;
    }

    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    @Override // androidx.navigation.NavDestination
    public int hashCode() {
        int startDestinationId = getStartDestinationId();
        SparseArrayCompat<NavDestination> sparseArrayCompat = this.nodes;
        int size = sparseArrayCompat.size();
        for (int i8 = 0; i8 < size; i8++) {
            startDestinationId = (((startDestinationId * 31) + sparseArrayCompat.keyAt(i8)) * 31) + sparseArrayCompat.valueAt(i8).hashCode();
        }
        return startDestinationId;
    }

    @Override // java.lang.Iterable
    public final Iterator<NavDestination> iterator() {
        return new NavGraph$iterator$1(this);
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDestination.DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        AbstractC3292y.i(navDeepLinkRequest, "navDeepLinkRequest");
        NavDestination.DeepLinkMatch matchDeepLink = super.matchDeepLink(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            NavDestination.DeepLinkMatch matchDeepLink2 = it.next().matchDeepLink(navDeepLinkRequest);
            if (matchDeepLink2 != null) {
                arrayList.add(matchDeepLink2);
            }
        }
        return (NavDestination.DeepLinkMatch) AbstractC1435t.A0(AbstractC1435t.r(matchDeepLink, (NavDestination.DeepLinkMatch) AbstractC1435t.A0(arrayList)));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination.DeepLinkMatch matchDeepLinkExcludingChildren(NavDeepLinkRequest request) {
        AbstractC3292y.i(request, "request");
        return super.matchDeepLink(request);
    }

    @Override // androidx.navigation.NavDestination
    public void onInflate(Context context, AttributeSet attrs) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(attrs, "attrs");
        super.onInflate(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R.styleable.NavGraphNavigator);
        AbstractC3292y.h(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        setStartDestinationId(obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavGraphNavigator_startDestination, 0));
        this.startDestIdName = NavDestination.Companion.getDisplayName(context, this.startDestId);
        I i8 = I.f8786a;
        obtainAttributes.recycle();
    }

    public final void remove(NavDestination node) {
        AbstractC3292y.i(node, "node");
        int indexOfKey = this.nodes.indexOfKey(node.getId());
        if (indexOfKey >= 0) {
            this.nodes.valueAt(indexOfKey).setParent(null);
            this.nodes.removeAt(indexOfKey);
        }
    }

    public final void setStartDestination(int i8) {
        setStartDestinationId(i8);
    }

    @Override // androidx.navigation.NavDestination
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination findNode = findNode(this.startDestinationRoute);
        if (findNode == null) {
            findNode = findNode(getStartDestinationId());
        }
        sb.append(" startDestination=");
        if (findNode == null) {
            String str = this.startDestinationRoute;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.startDestIdName;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.startDestId));
                }
            }
        } else {
            sb.append("{");
            sb.append(findNode.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "sb.toString()");
        return sb2;
    }

    public final NavDestination findNode(String str) {
        if (str == null || n.T(str)) {
            return null;
        }
        return findNode(str, true);
    }

    public final void setStartDestination(String startDestRoute) {
        AbstractC3292y.i(startDestRoute, "startDestRoute");
        setStartDestinationRoute(startDestRoute);
    }

    public final void addDestinations(NavDestination... nodes) {
        AbstractC3292y.i(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            addDestination(navDestination);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findNode(@IdRes int i8, boolean z8) {
        NavDestination navDestination = this.nodes.get(i8);
        if (navDestination != null) {
            return navDestination;
        }
        if (!z8 || getParent() == null) {
            return null;
        }
        NavGraph parent = getParent();
        AbstractC3292y.f(parent);
        return parent.findNode(i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findNode(String route, boolean z8) {
        NavDestination navDestination;
        AbstractC3292y.i(route, "route");
        NavDestination navDestination2 = this.nodes.get(NavDestination.Companion.createRoute(route).hashCode());
        if (navDestination2 == null) {
            Iterator it = AbstractC3258j.c(SparseArrayKt.valueIterator(this.nodes)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    navDestination = 0;
                    break;
                }
                navDestination = it.next();
                if (((NavDestination) navDestination).matchDeepLink(route) != null) {
                    break;
                }
            }
            navDestination2 = navDestination;
        }
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!z8 || getParent() == null) {
            return null;
        }
        NavGraph parent = getParent();
        AbstractC3292y.f(parent);
        return parent.findNode(route);
    }
}
