package androidx.navigation.compose;

import Q5.I;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavigator;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$14 extends AbstractC3293z implements InterfaceC2074p {
    final /* synthetic */ SaveableStateHolder $saveableStateHolder;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$14$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ NavBackStackEntry $currentEntry;
        final /* synthetic */ AnimatedContentScope $this_AnimatedContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavBackStackEntry navBackStackEntry, AnimatedContentScope animatedContentScope) {
            super(2);
            this.$currentEntry = navBackStackEntry;
            this.$this_AnimatedContent = animatedContentScope;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1425390790, i8, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:306)");
            }
            NavDestination destination = this.$currentEntry.getDestination();
            AbstractC3292y.g(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            ((ComposeNavigator.Destination) destination).getContent$navigation_compose_release().invoke(this.$this_AnimatedContent, this.$currentEntry, composer, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$14(SaveableStateHolder saveableStateHolder, State<? extends List<NavBackStackEntry>> state) {
        super(4);
        this.$saveableStateHolder = saveableStateHolder;
        this.$visibleEntries$delegate = state;
    }

    @Override // c6.InterfaceC2074p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i8) {
        List NavHost$lambda$6;
        Object obj;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1440061047, i8, -1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:301)");
        }
        NavHost$lambda$6 = NavHostKt.NavHost$lambda$6(this.$visibleEntries$delegate);
        ListIterator listIterator = NavHost$lambda$6.listIterator(NavHost$lambda$6.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (AbstractC3292y.d(navBackStackEntry, (NavBackStackEntry) obj)) {
                    break;
                }
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
        if (navBackStackEntry2 != null) {
            NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry2, this.$saveableStateHolder, ComposableLambdaKt.composableLambda(composer, -1425390790, true, new AnonymousClass1(navBackStackEntry2, animatedContentScope)), composer, 456);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
