package androidx.navigation.compose;

import R5.AbstractC1435t;
import android.annotation.SuppressLint;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class NavHostKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final /* synthetic */ void NavHost(NavHostController navHostController, String str, Modifier modifier, String str2, Function1 function1, Composer composer, int i8, int i9) {
        Composer startRestartGroup = composer.startRestartGroup(141827520);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        String str3 = (i9 & 8) != 0 ? null : str2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(141827520, i8, -1, "androidx.navigation.compose.NavHost (NavHost.kt:80)");
        }
        startRestartGroup.startReplaceableGroup(1618982084);
        boolean changed = startRestartGroup.changed(str3) | startRestartGroup.changed(str) | startRestartGroup.changed(function1);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.getNavigatorProvider(), str, str3);
            function1.invoke(navGraphBuilder);
            rememberedValue = navGraphBuilder.build();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        NavHost(navHostController, (NavGraph) rememberedValue, modifier2, null, null, null, null, null, startRestartGroup, (i8 & 896) | 72, 248);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavHostKt$NavHost$2(navHostController, str, modifier2, str3, function1, i8, i9));
    }

    private static final List<NavBackStackEntry> NavHost$lambda$3(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$4(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$6(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    public static final /* synthetic */ List access$NavHost$lambda$6(State state) {
        return NavHost$lambda$6(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition createEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1 enterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1 enterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getEnterTransition$navigation_compose_release();
            if (enterTransition$navigation_compose_release2 == null) {
                return null;
            }
            return (EnterTransition) enterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (enterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return (EnterTransition) enterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition createExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1 exitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1 exitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getExitTransition$navigation_compose_release();
            if (exitTransition$navigation_compose_release2 == null) {
                return null;
            }
            return (ExitTransition) exitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (exitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return (ExitTransition) exitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition createPopEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1 popEnterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1 popEnterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopEnterTransition$navigation_compose_release();
            if (popEnterTransition$navigation_compose_release2 == null) {
                return null;
            }
            return (EnterTransition) popEnterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popEnterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return (EnterTransition) popEnterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition createPopExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1 popExitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1 popExitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopExitTransition$navigation_compose_release();
            if (popExitTransition$navigation_compose_release2 == null) {
                return null;
            }
            return (ExitTransition) popExitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popExitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return (ExitTransition) popExitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void NavHost(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Composer composer, int i8, int i9) {
        Function1 function16;
        int i10;
        Function1 function17;
        Composer startRestartGroup = composer.startRestartGroup(410432995);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i9 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        String str3 = (i9 & 16) != 0 ? null : str2;
        Function1 function18 = (i9 & 32) != 0 ? NavHostKt$NavHost$3.INSTANCE : function1;
        Function1 function19 = (i9 & 64) != 0 ? NavHostKt$NavHost$4.INSTANCE : function12;
        if ((i9 & 128) != 0) {
            i10 = i8 & (-29360129);
            function16 = function18;
        } else {
            function16 = function13;
            i10 = i8;
        }
        if ((i9 & 256) != 0) {
            i10 &= -234881025;
            function17 = function19;
        } else {
            function17 = function14;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(410432995, i10, -1, "androidx.navigation.compose.NavHost (NavHost.kt:126)");
        }
        startRestartGroup.startReplaceableGroup(1618982084);
        boolean changed = startRestartGroup.changed(str3) | startRestartGroup.changed(str) | startRestartGroup.changed(function15);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.getNavigatorProvider(), str, str3);
            function15.invoke(navGraphBuilder);
            rememberedValue = navGraphBuilder.build();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i11 = (i10 & 896) | 72 | (i10 & 7168);
        int i12 = i10 >> 3;
        NavHost(navHostController, (NavGraph) rememberedValue, modifier2, center, function18, function19, function16, function17, startRestartGroup, i11 | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (i12 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavHostKt$NavHost$6(navHostController, str, modifier2, center, str3, function18, function19, function16, function17, function15, i8, i9));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final /* synthetic */ void NavHost(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Composer composer, int i8, int i9) {
        Composer startRestartGroup = composer.startRestartGroup(-957014592);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-957014592, i8, -1, "androidx.navigation.compose.NavHost (NavHost.kt:163)");
        }
        NavHost(navHostController, navGraph, modifier2, null, null, null, null, null, startRestartGroup, (i8 & 896) | 72, 248);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavHostKt$NavHost$7(navHostController, navGraph, modifier2, i8, i9));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"StateFlowValueCalledInComposition"})
    public static final void NavHost(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Composer composer, int i8, int i9) {
        Function1 function15;
        int i10;
        Function1 function16;
        Function1 function17;
        DialogNavigator dialogNavigator;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1818191915);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i9 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        Function1 function18 = (i9 & 16) != 0 ? NavHostKt$NavHost$8.INSTANCE : function1;
        Function1 function19 = (i9 & 32) != 0 ? NavHostKt$NavHost$9.INSTANCE : function12;
        if ((i9 & 64) != 0) {
            i10 = i8 & (-3670017);
            function15 = function18;
        } else {
            function15 = function13;
            i10 = i8;
        }
        if ((i9 & 128) != 0) {
            i10 &= -29360129;
            function16 = function19;
        } else {
            function16 = function14;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1818191915, i10, -1, "androidx.navigation.compose.NavHost (NavHost.kt:195)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
        if (current != null) {
            navHostController.setViewModelStore(current.getViewModelStore());
            navHostController.setGraph(navGraph);
            Navigator navigator = navHostController.getNavigatorProvider().getNavigator(ComposeNavigator.NAME);
            ComposeNavigator composeNavigator = navigator instanceof ComposeNavigator ? (ComposeNavigator) navigator : null;
            if (composeNavigator == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new NavHostKt$NavHost$composeNavigator$1(navHostController, navGraph, modifier2, center, function18, function19, function15, function16, i8, i9));
                return;
            }
            BackHandlerKt.BackHandler(NavHost$lambda$3(SnapshotStateKt.collectAsState(composeNavigator.getBackStack(), null, startRestartGroup, 8, 1)).size() > 1, new NavHostKt$NavHost$10(navHostController), startRestartGroup, 0, 0);
            EffectsKt.DisposableEffect(lifecycleOwner, new NavHostKt$NavHost$11(navHostController, lifecycleOwner), startRestartGroup, 8);
            SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
            State collectAsState = SnapshotStateKt.collectAsState(navHostController.getVisibleEntries(), null, startRestartGroup, 8, 1);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new NavHostKt$NavHost$visibleEntries$2$1(collectAsState));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            State state = (State) rememberedValue;
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) AbstractC1435t.z0(NavHost$lambda$6(state));
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new LinkedHashMap();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Map map = (Map) rememberedValue2;
            startRestartGroup.startReplaceableGroup(1822177954);
            if (navBackStackEntry != null) {
                startRestartGroup.startReplaceableGroup(1618982084);
                boolean changed = startRestartGroup.changed(composeNavigator) | startRestartGroup.changed(function15) | startRestartGroup.changed(function18);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new NavHostKt$NavHost$finalEnter$1$1(composeNavigator, function15, function18);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                Function1 function110 = (Function1) rememberedValue3;
                startRestartGroup.startReplaceableGroup(1618982084);
                boolean changed2 = startRestartGroup.changed(composeNavigator) | startRestartGroup.changed(function16) | startRestartGroup.changed(function19);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new NavHostKt$NavHost$finalExit$1$1(composeNavigator, function16, function19);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceableGroup();
                function17 = function16;
                i11 = 0;
                Transition updateTransition = TransitionKt.updateTransition(navBackStackEntry, "entry", startRestartGroup, 56, 0);
                NavHostKt$NavHost$12 navHostKt$NavHost$12 = new NavHostKt$NavHost$12(map, composeNavigator, function110, (Function1) rememberedValue4, state);
                NavHostKt$NavHost$13 navHostKt$NavHost$13 = NavHostKt$NavHost$13.INSTANCE;
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -1440061047, true, new NavHostKt$NavHost$14(rememberSaveableStateHolder, state));
                int i12 = ((i10 >> 3) & 112) | 221184 | (i10 & 7168);
                dialogNavigator = null;
                ComposeNavigator composeNavigator2 = composeNavigator;
                AnimatedContentKt.AnimatedContent(updateTransition, modifier2, navHostKt$NavHost$12, center, navHostKt$NavHost$13, composableLambda, startRestartGroup, i12, 0);
                EffectsKt.LaunchedEffect(updateTransition.getCurrentState(), updateTransition.getTargetState(), new NavHostKt$NavHost$15(updateTransition, map, state, composeNavigator2, null), startRestartGroup, 584);
                Boolean bool = Boolean.TRUE;
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed3 = startRestartGroup.changed(state) | startRestartGroup.changed(composeNavigator2);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue5 == companion.getEmpty()) {
                    rememberedValue5 = new NavHostKt$NavHost$16$1(state, composeNavigator2);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(bool, (Function1) rememberedValue5, startRestartGroup, 6);
            } else {
                function17 = function16;
                dialogNavigator = null;
                i11 = 0;
            }
            startRestartGroup.endReplaceableGroup();
            Navigator navigator2 = navHostController.getNavigatorProvider().getNavigator(DialogNavigator.NAME);
            DialogNavigator dialogNavigator2 = navigator2 instanceof DialogNavigator ? (DialogNavigator) navigator2 : dialogNavigator;
            if (dialogNavigator2 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                if (endRestartGroup2 == null) {
                    return;
                }
                endRestartGroup2.updateScope(new NavHostKt$NavHost$dialogNavigator$1(navHostController, navGraph, modifier2, center, function18, function19, function15, function17, i8, i9));
                return;
            }
            DialogHostKt.DialogHost(dialogNavigator2, startRestartGroup, i11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup3 = startRestartGroup.endRestartGroup();
            if (endRestartGroup3 == null) {
                return;
            }
            endRestartGroup3.updateScope(new NavHostKt$NavHost$17(navHostController, navGraph, modifier2, center, function18, function19, function15, function17, i8, i9));
            return;
        }
        throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString());
    }
}
