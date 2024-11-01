package androidx.navigation.compose;

import androidx.core.app.NotificationCompat;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import kotlin.jvm.functions.Function1;

@Navigator.Name(NotificationCompat.CATEGORY_NAVIGATION)
/* loaded from: classes3.dex */
public final class ComposeNavGraphNavigator extends NavGraphNavigator {

    /* loaded from: classes3.dex */
    public static final class ComposeNavGraph extends NavGraph {
        private Function1 enterTransition;
        private Function1 exitTransition;
        private Function1 popEnterTransition;
        private Function1 popExitTransition;

        public ComposeNavGraph(Navigator<? extends NavGraph> navigator) {
            super(navigator);
        }

        public final Function1 getEnterTransition$navigation_compose_release() {
            return this.enterTransition;
        }

        public final Function1 getExitTransition$navigation_compose_release() {
            return this.exitTransition;
        }

        public final Function1 getPopEnterTransition$navigation_compose_release() {
            return this.popEnterTransition;
        }

        public final Function1 getPopExitTransition$navigation_compose_release() {
            return this.popExitTransition;
        }

        public final void setEnterTransition$navigation_compose_release(Function1 function1) {
            this.enterTransition = function1;
        }

        public final void setExitTransition$navigation_compose_release(Function1 function1) {
            this.exitTransition = function1;
        }

        public final void setPopEnterTransition$navigation_compose_release(Function1 function1) {
            this.popEnterTransition = function1;
        }

        public final void setPopExitTransition$navigation_compose_release(Function1 function1) {
            this.popExitTransition = function1;
        }
    }

    public ComposeNavGraphNavigator(NavigatorProvider navigatorProvider) {
        super(navigatorProvider);
    }

    @Override // androidx.navigation.NavGraphNavigator, androidx.navigation.Navigator
    public NavGraph createDestination() {
        return new ComposeNavGraph(this);
    }
}
