package androidx.navigation.compose;

import R5.AbstractC1435t;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.DialogNavigator;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes3.dex */
public final class NavGraphBuilderKt {
    public static final /* synthetic */ void composable(NavGraphBuilder navGraphBuilder, String str, List list, List list2, InterfaceC2073o interfaceC2073o) {
        ComposeNavigator.Destination destination = new ComposeNavigator.Destination((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), (InterfaceC2074p) ComposableLambdaKt.composableLambdaInstance(484185514, true, new NavGraphBuilderKt$composable$1(interfaceC2073o)));
        destination.setRoute(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
            destination.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            destination.addDeepLink((NavDeepLink) it2.next());
        }
        navGraphBuilder.addDestination(destination);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, InterfaceC2073o interfaceC2073o, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            list = AbstractC1435t.m();
        }
        if ((i8 & 4) != 0) {
            list2 = AbstractC1435t.m();
        }
        composable(navGraphBuilder, str, list, list2, interfaceC2073o);
    }

    public static final void dialog(NavGraphBuilder navGraphBuilder, String str, List<NamedNavArgument> list, List<NavDeepLink> list2, DialogProperties dialogProperties, InterfaceC2073o interfaceC2073o) {
        DialogNavigator.Destination destination = new DialogNavigator.Destination((DialogNavigator) navGraphBuilder.getProvider().getNavigator(DialogNavigator.class), dialogProperties, interfaceC2073o);
        destination.setRoute(str);
        for (NamedNavArgument namedNavArgument : list) {
            destination.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            destination.addDeepLink((NavDeepLink) it.next());
        }
        navGraphBuilder.addDestination(destination);
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, DialogProperties dialogProperties, InterfaceC2073o interfaceC2073o, int i8, Object obj) {
        List list3;
        List list4;
        DialogProperties dialogProperties2;
        if ((i8 & 2) != 0) {
            list3 = AbstractC1435t.m();
        } else {
            list3 = list;
        }
        if ((i8 & 4) != 0) {
            list4 = AbstractC1435t.m();
        } else {
            list4 = list2;
        }
        if ((i8 & 8) != 0) {
            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (AbstractC3284p) null);
        } else {
            dialogProperties2 = dialogProperties;
        }
        dialog(navGraphBuilder, str, list3, list4, dialogProperties2, interfaceC2073o);
    }

    public static final /* synthetic */ void navigation(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, Function1 function1) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), str, str2);
        function1.invoke(navGraphBuilder2);
        NavGraph build = navGraphBuilder2.build();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
            build.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            build.addDeepLink((NavDeepLink) it2.next());
        }
        navGraphBuilder.addDestination(build);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, Function1 function1, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            list = AbstractC1435t.m();
        }
        List list3 = list;
        if ((i8 & 8) != 0) {
            list2 = AbstractC1435t.m();
        }
        navigation(navGraphBuilder, str, str2, list3, list2, function1);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, InterfaceC2074p interfaceC2074p, int i8, Object obj) {
        List m8 = (i8 & 2) != 0 ? AbstractC1435t.m() : list;
        List m9 = (i8 & 4) != 0 ? AbstractC1435t.m() : list2;
        Function1 function15 = (i8 & 8) != 0 ? null : function1;
        Function1 function16 = (i8 & 16) != 0 ? null : function12;
        composable(navGraphBuilder, str, m8, m9, function15, function16, (i8 & 32) != 0 ? function15 : function13, (i8 & 64) != 0 ? function16 : function14, interfaceC2074p);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i8, Object obj) {
        List m8 = (i8 & 4) != 0 ? AbstractC1435t.m() : list;
        List m9 = (i8 & 8) != 0 ? AbstractC1435t.m() : list2;
        Function1 function16 = (i8 & 16) != 0 ? null : function1;
        Function1 function17 = (i8 & 32) != 0 ? null : function12;
        navigation(navGraphBuilder, str, str2, m8, m9, function16, function17, (i8 & 64) != 0 ? function16 : function13, (i8 & 128) != 0 ? function17 : function14, function15);
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder, String str, String str2, List<NamedNavArgument> list, List<NavDeepLink> list2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), str, str2);
        function15.invoke(navGraphBuilder2);
        NavGraph build = navGraphBuilder2.build();
        for (NamedNavArgument namedNavArgument : list) {
            build.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            build.addDeepLink((NavDeepLink) it.next());
        }
        if (build instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) build;
            composeNavGraph.setEnterTransition$navigation_compose_release(function1);
            composeNavGraph.setExitTransition$navigation_compose_release(function12);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(function13);
            composeNavGraph.setPopExitTransition$navigation_compose_release(function14);
        }
        navGraphBuilder.addDestination(build);
    }

    public static final void composable(NavGraphBuilder navGraphBuilder, String str, List<NamedNavArgument> list, List<NavDeepLink> list2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, InterfaceC2074p interfaceC2074p) {
        ComposeNavigator.Destination destination = new ComposeNavigator.Destination((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), interfaceC2074p);
        destination.setRoute(str);
        for (NamedNavArgument namedNavArgument : list) {
            destination.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            destination.addDeepLink((NavDeepLink) it.next());
        }
        destination.setEnterTransition$navigation_compose_release(function1);
        destination.setExitTransition$navigation_compose_release(function12);
        destination.setPopEnterTransition$navigation_compose_release(function13);
        destination.setPopExitTransition$navigation_compose_release(function14);
        navGraphBuilder.addDestination(destination);
    }
}
