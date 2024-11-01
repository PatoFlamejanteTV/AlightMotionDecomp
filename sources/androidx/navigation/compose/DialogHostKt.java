package androidx.navigation.compose;

import U5.d;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.DialogNavigator;
import c6.InterfaceC2072n;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class DialogHostKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DialogHost(DialogNavigator dialogNavigator, Composer composer, int i8) {
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(294589392);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(dialogNavigator)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(294589392, i9, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
            d dVar = null;
            boolean z8 = true;
            State collectAsState = SnapshotStateKt.collectAsState(dialogNavigator.getBackStack$navigation_compose_release(), null, startRestartGroup, 8, 1);
            SnapshotStateList<NavBackStackEntry> rememberVisibleList = rememberVisibleList(DialogHost$lambda$0(collectAsState), startRestartGroup, 8);
            PopulateVisibleList(rememberVisibleList, DialogHost$lambda$0(collectAsState), startRestartGroup, 64);
            State collectAsState2 = SnapshotStateKt.collectAsState(dialogNavigator.getTransitionInProgress$navigation_compose_release(), null, startRestartGroup, 8, 1);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            startRestartGroup.startReplaceableGroup(875188318);
            for (NavBackStackEntry navBackStackEntry : rememberVisibleList) {
                NavDestination destination = navBackStackEntry.getDestination();
                AbstractC3292y.g(destination, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                DialogNavigator.Destination destination2 = (DialogNavigator.Destination) destination;
                AndroidDialog_androidKt.Dialog(new DialogHostKt$DialogHost$1$1(dialogNavigator, navBackStackEntry), destination2.getDialogProperties$navigation_compose_release(), ComposableLambdaKt.composableLambda(startRestartGroup, 1129586364, z8, new DialogHostKt$DialogHost$1$2(navBackStackEntry, rememberSaveableStateHolder, snapshotStateList, dialogNavigator, destination2)), startRestartGroup, 384, 0);
                collectAsState2 = collectAsState2;
                dVar = null;
                snapshotStateList = snapshotStateList;
                z8 = true;
            }
            SnapshotStateList snapshotStateList2 = snapshotStateList;
            State state = collectAsState2;
            d dVar2 = dVar;
            startRestartGroup.endReplaceableGroup();
            Set<NavBackStackEntry> DialogHost$lambda$1 = DialogHost$lambda$1(state);
            startRestartGroup.startReplaceableGroup(1618982084);
            boolean changed = startRestartGroup.changed(state) | startRestartGroup.changed(dialogNavigator) | startRestartGroup.changed(snapshotStateList2);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new DialogHostKt$DialogHost$2$1(state, dialogNavigator, snapshotStateList2, dVar2);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(DialogHost$lambda$1, snapshotStateList2, (InterfaceC2072n) rememberedValue2, startRestartGroup, 568);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DialogHostKt$DialogHost$3(dialogNavigator, i8));
        }
    }

    private static final List<NavBackStackEntry> DialogHost$lambda$0(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<NavBackStackEntry> DialogHost$lambda$1(State<? extends Set<NavBackStackEntry>> state) {
        return state.getValue();
    }

    @Composable
    public static final void PopulateVisibleList(List<NavBackStackEntry> list, Collection<NavBackStackEntry> collection, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(1537894851);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1537894851, i8, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:86)");
        }
        boolean booleanValue = ((Boolean) startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
        for (NavBackStackEntry navBackStackEntry : collection) {
            EffectsKt.DisposableEffect(navBackStackEntry.getLifecycle(), new DialogHostKt$PopulateVisibleList$1$1(navBackStackEntry, booleanValue, list), startRestartGroup, 8);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DialogHostKt$PopulateVisibleList$2(list, collection, i8));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:            if (r1 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L9;     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.navigation.NavBackStackEntry> rememberVisibleList(java.util.Collection<androidx.navigation.NavBackStackEntry> r5, androidx.compose.runtime.Composer r6, int r7) {
        /*
            r0 = 467378629(0x1bdba1c5, float:3.6335052E-22)
            r6.startReplaceableGroup(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L12
            r1 = -1
            java.lang.String r2 = "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r7, r1, r2)
        L12:
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode()
            java.lang.Object r7 = r6.consume(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r6.startReplaceableGroup(r0)
            boolean r0 = r6.changed(r5)
            java.lang.Object r1 = r6.rememberedValue()
            if (r0 != 0) goto L38
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L72
        L38:
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L47:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r5.next()
            r3 = r2
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            if (r7 == 0) goto L58
            r3 = 1
            goto L66
        L58:
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r3 = r3.getCurrentState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r3 = r3.isAtLeast(r4)
        L66:
            if (r3 == 0) goto L47
            r0.add(r2)
            goto L47
        L6c:
            r1.addAll(r0)
            r6.updateRememberedValue(r1)
        L72:
            r6.endReplaceableGroup()
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = (androidx.compose.runtime.snapshots.SnapshotStateList) r1
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L80
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L80:
            r6.endReplaceableGroup()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.DialogHostKt.rememberVisibleList(java.util.Collection, androidx.compose.runtime.Composer, int):androidx.compose.runtime.snapshots.SnapshotStateList");
    }
}
