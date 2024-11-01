package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ActivityNavigatorDestinationBuilderKt {
    public static final void activity(NavGraphBuilder navGraphBuilder, @IdRes int i8, Function1 builder) {
        AbstractC3292y.i(navGraphBuilder, "<this>");
        AbstractC3292y.i(builder, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), i8);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static final void activity(NavGraphBuilder navGraphBuilder, String route, Function1 builder) {
        AbstractC3292y.i(navGraphBuilder, "<this>");
        AbstractC3292y.i(route, "route");
        AbstractC3292y.i(builder, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), route);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }
}
