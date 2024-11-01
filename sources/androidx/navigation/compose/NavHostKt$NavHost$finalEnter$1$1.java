package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavigator;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$finalEnter$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ Function1 $enterTransition;
    final /* synthetic */ Function1 $popEnterTransition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$finalEnter$1$1(ComposeNavigator composeNavigator, Function1 function1, Function1 function12) {
        super(1);
        this.$composeNavigator = composeNavigator;
        this.$popEnterTransition = function1;
        this.$enterTransition = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        EnterTransition createEnterTransition;
        EnterTransition createPopEnterTransition;
        NavDestination destination = animatedContentTransitionScope.getTargetState().getDestination();
        AbstractC3292y.g(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
        EnterTransition enterTransition = null;
        if (this.$composeNavigator.isPop$navigation_compose_release().getValue().booleanValue()) {
            Iterator it = NavDestination.Companion.getHierarchy(destination2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                createPopEnterTransition = NavHostKt.createPopEnterTransition((NavDestination) it.next(), animatedContentTransitionScope);
                if (createPopEnterTransition != null) {
                    enterTransition = createPopEnterTransition;
                    break;
                }
            }
            return enterTransition == null ? (EnterTransition) this.$popEnterTransition.invoke(animatedContentTransitionScope) : enterTransition;
        }
        Iterator it2 = NavDestination.Companion.getHierarchy(destination2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            createEnterTransition = NavHostKt.createEnterTransition((NavDestination) it2.next(), animatedContentTransitionScope);
            if (createEnterTransition != null) {
                enterTransition = createEnterTransition;
                break;
            }
        }
        return enterTransition == null ? (EnterTransition) this.$enterTransition.invoke(animatedContentTransitionScope) : enterTransition;
    }
}
