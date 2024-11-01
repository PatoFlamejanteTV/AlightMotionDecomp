package androidx.navigation.compose;

import Q5.I;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;

@StabilityInferred(parameters = 0)
@Navigator.Name(ComposeNavigator.NAME)
/* loaded from: classes3.dex */
public final class ComposeNavigator extends Navigator<Destination> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "composable";
    private final MutableState<Boolean> isPop;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public ComposeNavigator() {
        MutableState<Boolean> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isPop = mutableStateOf$default;
    }

    public final InterfaceC3813L getBackStack() {
        return getState().getBackStack();
    }

    public final InterfaceC3813L getTransitionsInProgress$navigation_compose_release() {
        return getState().getTransitionsInProgress();
    }

    public final MutableState<Boolean> isPop$navigation_compose_release() {
        return this.isPop;
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getState().pushWithTransition((NavBackStackEntry) it.next());
        }
        this.isPop.setValue(Boolean.FALSE);
    }

    public final void onTransitionComplete(NavBackStackEntry navBackStackEntry) {
        getState().markTransitionComplete(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry navBackStackEntry, boolean z8) {
        getState().popWithTransition(navBackStackEntry, z8);
        this.isPop.setValue(Boolean.TRUE);
    }

    @StabilityInferred(parameters = 0)
    @NavDestination.ClassType(Composable.class)
    /* loaded from: classes3.dex */
    public static final class Destination extends NavDestination {
        public static final int $stable = 8;
        private final InterfaceC2074p content;
        private Function1 enterTransition;
        private Function1 exitTransition;
        private Function1 popEnterTransition;
        private Function1 popExitTransition;

        /* renamed from: androidx.navigation.compose.ComposeNavigator$Destination$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2074p {
            final /* synthetic */ InterfaceC2073o $content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InterfaceC2073o interfaceC2073o) {
                super(4);
                this.$content = interfaceC2073o;
            }

            @Override // c6.InterfaceC2074p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                return I.f8786a;
            }

            @Composable
            public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i8) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1587956030, i8, -1, "androidx.navigation.compose.ComposeNavigator.Destination.<init>.<anonymous> (ComposeNavigator.kt:101)");
                }
                this.$content.invoke(navBackStackEntry, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        public Destination(ComposeNavigator composeNavigator, InterfaceC2074p interfaceC2074p) {
            super(composeNavigator);
            this.content = interfaceC2074p;
        }

        public final InterfaceC2074p getContent$navigation_compose_release() {
            return this.content;
        }

        public final Function1 getEnterTransition$navigation_compose_release() {
            return this.enterTransition;
        }

        public final Function1 getExitTransition$navigation_compose_release() {
            return this.exitTransition;
        }

        public final Function1 getPopEnterTransition$navigation_compose_release() {
            return this.popEnterTransition;
        }

        public final Function1 getPopExitTransition$navigation_compose_release() {
            return this.popExitTransition;
        }

        public final void setEnterTransition$navigation_compose_release(Function1 function1) {
            this.enterTransition = function1;
        }

        public final void setExitTransition$navigation_compose_release(Function1 function1) {
            this.exitTransition = function1;
        }

        public final void setPopEnterTransition$navigation_compose_release(Function1 function1) {
            this.popEnterTransition = function1;
        }

        public final void setPopExitTransition$navigation_compose_release(Function1 function1) {
            this.popExitTransition = function1;
        }

        public /* synthetic */ Destination(ComposeNavigator composeNavigator, InterfaceC2073o interfaceC2073o) {
            this(composeNavigator, (InterfaceC2074p) ComposableLambdaKt.composableLambdaInstance(1587956030, true, new AnonymousClass1(interfaceC2073o)));
        }
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this, ComposableSingletons$ComposeNavigatorKt.INSTANCE.m5443getLambda1$navigation_compose_release());
    }
}
