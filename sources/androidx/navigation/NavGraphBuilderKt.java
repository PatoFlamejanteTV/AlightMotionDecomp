package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NavGraphBuilderKt {
    public static final NavGraph navigation(NavigatorProvider navigatorProvider, @IdRes int i8, @IdRes int i9, Function1 builder) {
        AbstractC3292y.i(navigatorProvider, "<this>");
        AbstractC3292y.i(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i8, i9);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, int i8, int i9, Function1 builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        AbstractC3292y.i(navigatorProvider, "<this>");
        AbstractC3292y.i(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i8, i9);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, String startDestination, String str, Function1 builder) {
        AbstractC3292y.i(navigatorProvider, "<this>");
        AbstractC3292y.i(startDestination, "startDestination");
        AbstractC3292y.i(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, String startDestination, String str, Function1 builder, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        AbstractC3292y.i(navigatorProvider, "<this>");
        AbstractC3292y.i(startDestination, "startDestination");
        AbstractC3292y.i(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder, @IdRes int i8, @IdRes int i9, Function1 builder) {
        AbstractC3292y.i(navGraphBuilder, "<this>");
        AbstractC3292y.i(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), i8, i9);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder, String startDestination, String route, Function1 builder) {
        AbstractC3292y.i(navGraphBuilder, "<this>");
        AbstractC3292y.i(startDestination, "startDestination");
        AbstractC3292y.i(route, "route");
        AbstractC3292y.i(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), startDestination, route);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }
}
