package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ExitTransition;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavigator;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$finalExit$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ Function1 $exitTransition;
    final /* synthetic */ Function1 $popExitTransition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$finalExit$1$1(ComposeNavigator composeNavigator, Function1 function1, Function1 function12) {
        super(1);
        this.$composeNavigator = composeNavigator;
        this.$popExitTransition = function1;
        this.$exitTransition = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        ExitTransition createExitTransition;
        ExitTransition createPopExitTransition;
        NavDestination destination = animatedContentTransitionScope.getInitialState().getDestination();
        AbstractC3292y.g(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
        ExitTransition exitTransition = null;
        if (this.$composeNavigator.isPop$navigation_compose_release().getValue().booleanValue()) {
            Iterator it = NavDestination.Companion.getHierarchy(destination2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                createPopExitTransition = NavHostKt.createPopExitTransition((NavDestination) it.next(), animatedContentTransitionScope);
                if (createPopExitTransition != null) {
                    exitTransition = createPopExitTransition;
                    break;
                }
            }
            return exitTransition == null ? (ExitTransition) this.$popExitTransition.invoke(animatedContentTransitionScope) : exitTransition;
        }
        Iterator it2 = NavDestination.Companion.getHierarchy(destination2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            createExitTransition = NavHostKt.createExitTransition((NavDestination) it2.next(), animatedContentTransitionScope);
            if (createExitTransition != null) {
                exitTransition = createExitTransition;
                break;
            }
        }
        return exitTransition == null ? (ExitTransition) this.$exitTransition.invoke(animatedContentTransitionScope) : exitTransition;
    }
}
