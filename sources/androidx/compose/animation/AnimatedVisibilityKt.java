package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AnimatedVisibilityKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final <T> void AnimatedEnterExitImpl(Transition<T> transition, Function1 function1, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, InterfaceC2073o interfaceC2073o, Composer composer, int i8) {
        int i9;
        MutableState mutableState;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(808253933);
        if ((i8 & 14) == 0) {
            i9 = (startRestartGroup.changed(transition) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i9 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i8 & 7168) == 0) {
            i9 |= startRestartGroup.changed(enterTransition) ? 2048 : 1024;
        }
        if ((57344 & i8) == 0) {
            i9 |= startRestartGroup.changed(exitTransition) ? 16384 : 8192;
        }
        if ((458752 & i8) == 0) {
            i9 |= startRestartGroup.changedInstance(interfaceC2073o) ? 131072 : 65536;
        }
        int i10 = i9;
        if ((374491 & i10) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(808253933, i10, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:726)");
            }
            int i11 = i10 & 14;
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(transition);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function1.invoke(transition.getCurrentState()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) rememberedValue;
            if (((Boolean) function1.invoke(transition.getTargetState())).booleanValue() || ((Boolean) mutableState2.getValue()).booleanValue() || transition.isSeeking()) {
                startRestartGroup.startReplaceableGroup(1215497572);
                int i12 = (i11 | 48) & 14;
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed2 = startRestartGroup.changed(transition);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = transition.getCurrentState();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                if (transition.isSeeking()) {
                    rememberedValue2 = transition.getCurrentState();
                }
                startRestartGroup.startReplaceableGroup(-1220581778);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1220581778, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                int i13 = i10 & 126;
                EnterExitState targetEnterExit = targetEnterExit(transition, function1, rememberedValue2, startRestartGroup, i13);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceableGroup();
                T targetState = transition.getTargetState();
                startRestartGroup.startReplaceableGroup(-1220581778);
                if (ComposerKt.isTraceInProgress()) {
                    mutableState = mutableState2;
                    ComposerKt.traceEventStart(-1220581778, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                } else {
                    mutableState = mutableState2;
                }
                EnterExitState targetEnterExit2 = targetEnterExit(transition, function1, targetState, startRestartGroup, i13);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState3 = mutableState;
                Transition createChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, targetEnterExit, targetEnterExit2, "EnterExitTransition", startRestartGroup, i12 | 3072);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed3 = startRestartGroup.changed(createChildTransitionInternal) | startRestartGroup.changed(mutableState3);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(createChildTransitionInternal, mutableState3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(createChildTransitionInternal, (InterfaceC2072n) rememberedValue3, startRestartGroup, 64);
                int i14 = (i10 >> 3) & 65520;
                startRestartGroup.startReplaceableGroup(-1967270694);
                Object currentState = createChildTransitionInternal.getCurrentState();
                EnterExitState enterExitState = EnterExitState.Visible;
                if (currentState == enterExitState || createChildTransitionInternal.getTargetState() == enterExitState) {
                    startRestartGroup.startReplaceableGroup(1157296644);
                    boolean changed4 = startRestartGroup.changed(createChildTransitionInternal);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        rememberedValue4 = new AnimatedVisibilityScopeImpl(createChildTransitionInternal);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceableGroup();
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) rememberedValue4;
                    int i15 = i14 >> 3;
                    int i16 = (i15 & 112) | 3072 | (i15 & 896);
                    composer2 = startRestartGroup;
                    Modifier then = modifier.then(EnterExitTransitionKt.createModifier(createChildTransitionInternal, enterTransition, exitTransition, "Built-in", startRestartGroup, i16));
                    composer2.startReplaceableGroup(-492369756);
                    Object rememberedValue5 = composer2.rememberedValue();
                    if (rememberedValue5 == Composer.Companion.getEmpty()) {
                        rememberedValue5 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue5;
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    Function0 constructor = companion.getConstructor();
                    InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m2473constructorimpl = Updater.m2473constructorimpl(composer2);
                    Updater.m2480setimpl(m2473constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
                    Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    interfaceC2073o.invoke(animatedVisibilityScopeImpl, composer2, Integer.valueOf(((i14 >> 9) & 112) | 8));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = startRestartGroup;
                }
                composer2.endReplaceableGroup();
            } else {
                composer2 = startRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedEnterExitImpl$2(transition, function1, modifier, enterTransition, exitTransition, interfaceC2073o, i8));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0051  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(boolean r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, java.lang.String r28, c6.InterfaceC2073o r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    private static final <T> EnterExitState targetEnterExit(Transition<T> transition, Function1 function1, T t8, Composer composer, int i8) {
        EnterExitState enterExitState;
        composer.startReplaceableGroup(361571134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(361571134, i8, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:830)");
        }
        composer.startMovableGroup(-721837504, transition);
        if (transition.isSeeking()) {
            if (((Boolean) function1.invoke(t8)).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (((Boolean) function1.invoke(transition.getCurrentState())).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        } else {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            if (((Boolean) function1.invoke(transition.getCurrentState())).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(t8)).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        }
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return enterExitState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.RowScope r24, boolean r25, androidx.compose.ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, c6.InterfaceC2073o r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope r24, boolean r25, androidx.compose.ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, c6.InterfaceC2073o r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0054  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, java.lang.String r28, c6.InterfaceC2073o r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.RowScope r24, androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r25, androidx.compose.ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, c6.InterfaceC2073o r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope r24, androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r25, androidx.compose.ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, c6.InterfaceC2073o r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0074  */
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void AnimatedVisibility(androidx.compose.animation.core.Transition<T> r22, kotlin.jvm.functions.Function1 r23, androidx.compose.ui.Modifier r24, androidx.compose.animation.EnterTransition r25, androidx.compose.animation.ExitTransition r26, c6.InterfaceC2073o r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.Transition, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(boolean r17, androidx.compose.ui.Modifier r18, androidx.compose.animation.EnterTransition r19, androidx.compose.animation.ExitTransition r20, boolean r21, c6.InterfaceC2072n r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, boolean, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ExperimentalAnimationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void AnimatedEnterExitImpl(Transition<EnterExitState> transition, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, InterfaceC2073o interfaceC2073o, Composer composer, int i8) {
        composer.startReplaceableGroup(-1967270694);
        EnterExitState currentState = transition.getCurrentState();
        EnterExitState enterExitState = EnterExitState.Visible;
        if (currentState == enterExitState || transition.getTargetState() == enterExitState) {
            int i9 = i8 & 14;
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(transition);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AnimatedVisibilityScopeImpl(transition);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) rememberedValue;
            int i10 = i8 >> 3;
            Modifier then = modifier.then(EnterExitTransitionKt.createModifier(transition, enterTransition, exitTransition, "Built-in", composer, i9 | 3072 | (i10 & 112) | (i10 & 896)));
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2473constructorimpl = Updater.m2473constructorimpl(composer);
            Updater.m2480setimpl(m2473constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            interfaceC2073o.invoke(animatedVisibilityScopeImpl, composer, Integer.valueOf(((i8 >> 9) & 112) | 8));
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }
}
