package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NavHostKt {
    public static final NavGraph createGraph(NavHost navHost, @IdRes int i8, @IdRes int i9, Function1 builder) {
        AbstractC3292y.i(navHost, "<this>");
        AbstractC3292y.i(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i8, i9);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, int i8, int i9, Function1 builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        AbstractC3292y.i(navHost, "<this>");
        AbstractC3292y.i(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i8, i9);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph createGraph(NavHost navHost, String startDestination, String str, Function1 builder) {
        AbstractC3292y.i(navHost, "<this>");
        AbstractC3292y.i(startDestination, "startDestination");
        AbstractC3292y.i(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, String startDestination, String str, Function1 builder, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        AbstractC3292y.i(navHost, "<this>");
        AbstractC3292y.i(startDestination, "startDestination");
        AbstractC3292y.i(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
