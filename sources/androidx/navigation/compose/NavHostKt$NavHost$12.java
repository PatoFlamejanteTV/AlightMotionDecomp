package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$12 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ Function1 $finalEnter;
    final /* synthetic */ Function1 $finalExit;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;
    final /* synthetic */ Map<String, Float> $zIndices;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$12(Map<String, Float> map, ComposeNavigator composeNavigator, Function1 function1, Function1 function12, State<? extends List<NavBackStackEntry>> state) {
        super(1);
        this.$zIndices = map;
        this.$composeNavigator = composeNavigator;
        this.$finalEnter = function1;
        this.$finalExit = function12;
        this.$visibleEntries$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ContentTransform invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        List NavHost$lambda$6;
        float f8;
        NavHost$lambda$6 = NavHostKt.NavHost$lambda$6(this.$visibleEntries$delegate);
        if (NavHost$lambda$6.contains(animatedContentTransitionScope.getInitialState())) {
            Float f9 = this.$zIndices.get(animatedContentTransitionScope.getInitialState().getId());
            if (f9 != null) {
                f8 = f9.floatValue();
            } else {
                this.$zIndices.put(animatedContentTransitionScope.getInitialState().getId(), Float.valueOf(0.0f));
                f8 = 0.0f;
            }
            if (!AbstractC3292y.d(animatedContentTransitionScope.getTargetState().getId(), animatedContentTransitionScope.getInitialState().getId())) {
                f8 = this.$composeNavigator.isPop$navigation_compose_release().getValue().booleanValue() ? f8 - 1.0f : f8 + 1.0f;
            }
            float f10 = f8;
            this.$zIndices.put(animatedContentTransitionScope.getTargetState().getId(), Float.valueOf(f10));
            return new ContentTransform((EnterTransition) this.$finalEnter.invoke(animatedContentTransitionScope), (ExitTransition) this.$finalExit.invoke(animatedContentTransitionScope), f10, null, 8, null);
        }
        return AnimatedContentKt.togetherWith(EnterTransition.Companion.getNone(), ExitTransition.Companion.getNone());
    }
}
