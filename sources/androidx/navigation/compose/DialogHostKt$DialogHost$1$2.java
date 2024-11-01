package androidx.navigation.compose;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogNavigator;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class DialogHostKt$DialogHost$1$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ DialogNavigator.Destination $destination;
    final /* synthetic */ DialogNavigator $dialogNavigator;
    final /* synthetic */ SnapshotStateList<NavBackStackEntry> $dialogsToDispose;
    final /* synthetic */ SaveableStateHolder $saveableStateHolder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ NavBackStackEntry $backStackEntry;
        final /* synthetic */ DialogNavigator $dialogNavigator;
        final /* synthetic */ SnapshotStateList<NavBackStackEntry> $dialogsToDispose;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SnapshotStateList<NavBackStackEntry> snapshotStateList, NavBackStackEntry navBackStackEntry, DialogNavigator dialogNavigator) {
            super(1);
            this.$dialogsToDispose = snapshotStateList;
            this.$backStackEntry = navBackStackEntry;
            this.$dialogNavigator = dialogNavigator;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            this.$dialogsToDispose.add(this.$backStackEntry);
            final DialogNavigator dialogNavigator = this.$dialogNavigator;
            final NavBackStackEntry navBackStackEntry = this.$backStackEntry;
            final SnapshotStateList<NavBackStackEntry> snapshotStateList = this.$dialogsToDispose;
            return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    DialogNavigator.this.onTransitionComplete$navigation_compose_release(navBackStackEntry);
                    snapshotStateList.remove(navBackStackEntry);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ NavBackStackEntry $backStackEntry;
        final /* synthetic */ DialogNavigator.Destination $destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DialogNavigator.Destination destination, NavBackStackEntry navBackStackEntry) {
            super(2);
            this.$destination = destination;
            this.$backStackEntry = navBackStackEntry;
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
                ComposerKt.traceEventStart(-497631156, i8, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
            }
            this.$destination.getContent$navigation_compose_release().invoke(this.$backStackEntry, composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$1$2(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, SnapshotStateList<NavBackStackEntry> snapshotStateList, DialogNavigator dialogNavigator, DialogNavigator.Destination destination) {
        super(2);
        this.$backStackEntry = navBackStackEntry;
        this.$saveableStateHolder = saveableStateHolder;
        this.$dialogsToDispose = snapshotStateList;
        this.$dialogNavigator = dialogNavigator;
        this.$destination = destination;
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
            ComposerKt.traceEventStart(1129586364, i8, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
        }
        NavBackStackEntry navBackStackEntry = this.$backStackEntry;
        EffectsKt.DisposableEffect(navBackStackEntry, new AnonymousClass1(this.$dialogsToDispose, navBackStackEntry, this.$dialogNavigator), composer, 8);
        NavBackStackEntry navBackStackEntry2 = this.$backStackEntry;
        NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry2, this.$saveableStateHolder, ComposableLambdaKt.composableLambda(composer, -497631156, true, new AnonymousClass2(this.$destination, navBackStackEntry2)), composer, 456);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
