package androidx.navigation.compose;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class NavHostControllerKt {
    private static final Saver<NavHostController, ?> NavControllerSaver(Context context) {
        return SaverKt.Saver(NavHostControllerKt$NavControllerSaver$1.INSTANCE, new NavHostControllerKt$NavControllerSaver$2(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavHostController createNavController(Context context) {
        NavHostController navHostController = new NavHostController(context);
        navHostController.getNavigatorProvider().addNavigator(new ComposeNavGraphNavigator(navHostController.getNavigatorProvider()));
        navHostController.getNavigatorProvider().addNavigator(new ComposeNavigator());
        navHostController.getNavigatorProvider().addNavigator(new DialogNavigator());
        return navHostController;
    }

    @Composable
    public static final State<NavBackStackEntry> currentBackStackEntryAsState(NavController navController, Composer composer, int i8) {
        composer.startReplaceableGroup(-120375203);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-120375203, i8, -1, "androidx.navigation.compose.currentBackStackEntryAsState (NavHostController.kt:41)");
        }
        State<NavBackStackEntry> collectAsState = SnapshotStateKt.collectAsState(navController.getCurrentBackStackEntryFlow(), null, null, composer, 56, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return collectAsState;
    }

    @Composable
    public static final NavHostController rememberNavController(Navigator<? extends NavDestination>[] navigatorArr, Composer composer, int i8) {
        composer.startReplaceableGroup(-312215566);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-312215566, i8, -1, "androidx.navigation.compose.rememberNavController (NavHostController.kt:57)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        NavHostController navHostController = (NavHostController) RememberSaveableKt.m2560rememberSaveable(Arrays.copyOf(navigatorArr, navigatorArr.length), (Saver) NavControllerSaver(context), (String) null, (Function0) new NavHostControllerKt$rememberNavController$1(context), composer, 72, 4);
        for (Navigator<? extends NavDestination> navigator : navigatorArr) {
            navHostController.getNavigatorProvider().addNavigator(navigator);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navHostController;
    }
}
