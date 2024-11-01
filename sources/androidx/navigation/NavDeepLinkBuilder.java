package androidx.navigation;

import R5.AbstractC1435t;
import R5.C1427k;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.IdRes;
import androidx.annotation.NavigationRes;
import androidx.core.app.TaskStackBuilder;
import androidx.navigation.Navigator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NavDeepLinkBuilder {
    private final Context context;
    private final List<DeepLinkDestination> destinations;
    private Bundle globalArgs;
    private NavGraph graph;
    private final Intent intent;

    /* loaded from: classes3.dex */
    public static final class DeepLinkDestination {
        private final Bundle arguments;
        private final int destinationId;

        public DeepLinkDestination(int i8, Bundle bundle) {
            this.destinationId = i8;
            this.arguments = bundle;
        }

        public final Bundle getArguments() {
            return this.arguments;
        }

        public final int getDestinationId() {
            return this.destinationId;
        }
    }

    /* loaded from: classes3.dex */
    private static final class PermissiveNavigatorProvider extends NavigatorProvider {
        private final Navigator<NavDestination> mDestNavigator = new Navigator<NavDestination>() { // from class: androidx.navigation.NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1
            @Override // androidx.navigation.Navigator
            public NavDestination createDestination() {
                return new NavDestination("permissive");
            }

            @Override // androidx.navigation.Navigator
            public NavDestination navigate(NavDestination destination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
                AbstractC3292y.i(destination, "destination");
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.navigation.Navigator
            public boolean popBackStack() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        };

        public PermissiveNavigatorProvider() {
            addNavigator(new NavGraphNavigator(this));
        }

        @Override // androidx.navigation.NavigatorProvider
        public <T extends Navigator<? extends NavDestination>> T getNavigator(String name) {
            AbstractC3292y.i(name, "name");
            try {
                return (T) super.getNavigator(name);
            } catch (IllegalStateException unused) {
                Navigator<NavDestination> navigator = this.mDestNavigator;
                AbstractC3292y.g(navigator, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return navigator;
            }
        }
    }

    public NavDeepLinkBuilder(Context context) {
        Intent launchIntentForPackage;
        AbstractC3292y.i(context, "context");
        this.context = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.intent = launchIntentForPackage;
        this.destinations = new ArrayList();
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i8, Bundle bundle, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(i8, bundle);
    }

    private final void fillInIntent() {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        NavDestination navDestination = null;
        for (DeepLinkDestination deepLinkDestination : this.destinations) {
            int destinationId = deepLinkDestination.getDestinationId();
            Bundle arguments = deepLinkDestination.getArguments();
            NavDestination findDestination = findDestination(destinationId);
            if (findDestination != null) {
                for (int i8 : findDestination.buildDeepLinkIds(navDestination)) {
                    arrayList.add(Integer.valueOf(i8));
                    arrayList2.add(arguments);
                }
                navDestination = findDestination;
            } else {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.Companion.getDisplayName(this.context, destinationId) + " cannot be found in the navigation graph " + this.graph);
            }
        }
        this.intent.putExtra(NavController.KEY_DEEP_LINK_IDS, AbstractC1435t.V0(arrayList));
        this.intent.putParcelableArrayListExtra(NavController.KEY_DEEP_LINK_ARGS, arrayList2);
    }

    private final NavDestination findDestination(@IdRes int i8) {
        C1427k c1427k = new C1427k();
        NavGraph navGraph = this.graph;
        AbstractC3292y.f(navGraph);
        c1427k.add(navGraph);
        while (!c1427k.isEmpty()) {
            NavDestination navDestination = (NavDestination) c1427k.y();
            if (navDestination.getId() == i8) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination).iterator();
                while (it.hasNext()) {
                    c1427k.add(it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i8, Bundle bundle, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(i8, bundle);
    }

    private final void verifyAllDestinations() {
        Iterator<DeepLinkDestination> it = this.destinations.iterator();
        while (it.hasNext()) {
            int destinationId = it.next().getDestinationId();
            if (findDestination(destinationId) == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.Companion.getDisplayName(this.context, destinationId) + " cannot be found in the navigation graph " + this.graph);
            }
        }
    }

    public final NavDeepLinkBuilder addDestination(@IdRes int i8) {
        return addDestination$default(this, i8, (Bundle) null, 2, (Object) null);
    }

    public final PendingIntent createPendingIntent() {
        int i8;
        int i9;
        int i10;
        Bundle bundle = this.globalArgs;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            i8 = 0;
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                int i11 = i8 * 31;
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                i8 = i11 + i10;
            }
        } else {
            i8 = 0;
        }
        for (DeepLinkDestination deepLinkDestination : this.destinations) {
            i8 = (i8 * 31) + deepLinkDestination.getDestinationId();
            Bundle arguments = deepLinkDestination.getArguments();
            if (arguments != null) {
                Iterator<String> it2 = arguments.keySet().iterator();
                while (it2.hasNext()) {
                    Object obj2 = arguments.get(it2.next());
                    int i12 = i8 * 31;
                    if (obj2 != null) {
                        i9 = obj2.hashCode();
                    } else {
                        i9 = 0;
                    }
                    i8 = i12 + i9;
                }
            }
        }
        PendingIntent pendingIntent = createTaskStackBuilder().getPendingIntent(i8, 201326592);
        AbstractC3292y.f(pendingIntent);
        return pendingIntent;
    }

    public final TaskStackBuilder createTaskStackBuilder() {
        if (this.graph != null) {
            if (!this.destinations.isEmpty()) {
                fillInIntent();
                TaskStackBuilder addNextIntentWithParentStack = TaskStackBuilder.create(this.context).addNextIntentWithParentStack(new Intent(this.intent));
                AbstractC3292y.h(addNextIntentWithParentStack, "create(context)\n        …rentStack(Intent(intent))");
                int intentCount = addNextIntentWithParentStack.getIntentCount();
                for (int i8 = 0; i8 < intentCount; i8++) {
                    Intent editIntentAt = addNextIntentWithParentStack.editIntentAt(i8);
                    if (editIntentAt != null) {
                        editIntentAt.putExtra(NavController.KEY_DEEP_LINK_INTENT, this.intent);
                    }
                }
                return addNextIntentWithParentStack;
            }
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
        throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
    }

    public final NavDeepLinkBuilder setArguments(Bundle bundle) {
        this.globalArgs = bundle;
        this.intent.putExtra(NavController.KEY_DEEP_LINK_EXTRAS, bundle);
        return this;
    }

    public final NavDeepLinkBuilder setComponentName(Class<? extends Activity> activityClass) {
        AbstractC3292y.i(activityClass, "activityClass");
        return setComponentName(new ComponentName(this.context, activityClass));
    }

    public final NavDeepLinkBuilder setDestination(@IdRes int i8) {
        return setDestination$default(this, i8, (Bundle) null, 2, (Object) null);
    }

    public final NavDeepLinkBuilder setGraph(@NavigationRes int i8) {
        return setGraph(new NavInflater(this.context, new PermissiveNavigatorProvider()).inflate(i8));
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(str, bundle);
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(str, bundle);
    }

    public final NavDeepLinkBuilder addDestination(String route) {
        AbstractC3292y.i(route, "route");
        return addDestination$default(this, route, (Bundle) null, 2, (Object) null);
    }

    public final NavDeepLinkBuilder setComponentName(ComponentName componentName) {
        AbstractC3292y.i(componentName, "componentName");
        this.intent.setComponent(componentName);
        return this;
    }

    public final NavDeepLinkBuilder setDestination(String destRoute) {
        AbstractC3292y.i(destRoute, "destRoute");
        return setDestination$default(this, destRoute, (Bundle) null, 2, (Object) null);
    }

    public final NavDeepLinkBuilder setGraph(NavGraph navGraph) {
        AbstractC3292y.i(navGraph, "navGraph");
        this.graph = navGraph;
        verifyAllDestinations();
        return this;
    }

    public final NavDeepLinkBuilder addDestination(@IdRes int i8, Bundle bundle) {
        this.destinations.add(new DeepLinkDestination(i8, bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public final NavDeepLinkBuilder setDestination(@IdRes int i8, Bundle bundle) {
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(i8, bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public final NavDeepLinkBuilder addDestination(String route, Bundle bundle) {
        AbstractC3292y.i(route, "route");
        this.destinations.add(new DeepLinkDestination(NavDestination.Companion.createRoute(route).hashCode(), bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public final NavDeepLinkBuilder setDestination(String destRoute, Bundle bundle) {
        AbstractC3292y.i(destRoute, "destRoute");
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(NavDestination.Companion.createRoute(destRoute).hashCode(), bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDeepLinkBuilder(NavController navController) {
        this(navController.getContext());
        AbstractC3292y.i(navController, "navController");
        this.graph = navController.getGraph();
    }
}
