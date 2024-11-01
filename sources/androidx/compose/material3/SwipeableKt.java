package androidx.compose.material3;

import R5.AbstractC1435t;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.InspectableValueKt;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SwipeableKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:            if (r3 < ((java.lang.Number) r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5))).floatValue()) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:            return r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:            if (r3 > ((java.lang.Number) r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0))).floatValue()) goto L19;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float computeTarget(float r3, float r4, java.util.Set<java.lang.Float> r5, c6.InterfaceC2072n r6, float r7, float r8) {
        /*
            java.util.List r5 = findBounds(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L6c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L62
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L42
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L2b
            return r5
        L2b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L5e
            goto L60
        L42:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L48
            return r0
        L48:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L60
        L5e:
            r4 = r5
            goto L6c
        L60:
            r4 = r0
            goto L6c
        L62:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableKt.computeTarget(float, float, java.util.Set, c6.n, float, float):float");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> findBounds(float f8, Set<Float> set) {
        Set<Float> set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (((Number) obj).floatValue() <= f8 + 0.001d) {
                arrayList.add(obj);
            }
        }
        Float B02 = AbstractC1435t.B0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() >= f8 - 0.001d) {
                arrayList2.add(obj2);
            }
        }
        Float D02 = AbstractC1435t.D0(arrayList2);
        if (B02 == null) {
            return AbstractC1435t.q(D02);
        }
        if (D02 == null) {
            return AbstractC1435t.e(B02);
        }
        if (AbstractC3292y.c(B02, D02)) {
            return AbstractC1435t.e(B02);
        }
        return AbstractC1435t.p(B02, D02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float getOffset(Map<Float, ? extends T> map, T t8) {
        T t9;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                t9 = it.next();
                if (AbstractC3292y.d(((Map.Entry) t9).getValue(), t8)) {
                    break;
                }
            } else {
                t9 = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) t9;
        if (entry == null) {
            return null;
        }
        return (Float) entry.getKey();
    }

    public static final <T> NestedScrollConnection getPreUpPostDownNestedScrollConnection(SwipeableState<T> swipeableState) {
        AbstractC3292y.i(swipeableState, "<this>");
        return new SwipeableKt$PreUpPostDownNestedScrollConnection$1(swipeableState);
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getPreUpPostDownNestedScrollConnection$annotations(SwipeableState swipeableState) {
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final <T> SwipeableState<T> rememberSwipeableState(T initialValue, AnimationSpec<Float> animationSpec, Function1 function1, Composer composer, int i8, int i9) {
        AbstractC3292y.i(initialValue, "initialValue");
        composer.startReplaceableGroup(102743774);
        if ((i9 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec$material3_release();
        }
        if ((i9 & 4) != 0) {
            function1 = SwipeableKt$rememberSwipeableState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(102743774, i8, -1, "androidx.compose.material3.rememberSwipeableState (Swipeable.kt:467)");
        }
        SwipeableState<T> swipeableState = (SwipeableState) RememberSaveableKt.m2560rememberSaveable(new Object[0], (Saver) SwipeableState.Companion.Saver(animationSpec, function1), (String) null, (Function0) new SwipeableKt$rememberSwipeableState$2(initialValue, animationSpec, function1), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableState;
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final <T> SwipeableState<T> rememberSwipeableStateFor(T value, Function1 onValueChange, AnimationSpec<Float> animationSpec, Composer composer, int i8, int i9) {
        AbstractC3292y.i(value, "value");
        AbstractC3292y.i(onValueChange, "onValueChange");
        composer.startReplaceableGroup(1306709399);
        if ((i9 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec$material3_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1306709399, i8, -1, "androidx.compose.material3.rememberSwipeableStateFor (Swipeable.kt:496)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new SwipeableState(value, animationSpec, SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1.INSTANCE);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SwipeableState<T> swipeableState = (SwipeableState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue2;
        int i10 = i8 & 8;
        EffectsKt.LaunchedEffect(value, mutableState.getValue(), new SwipeableKt$rememberSwipeableStateFor$1(value, swipeableState, null), composer, (i8 & 14) | i10 | 512);
        EffectsKt.DisposableEffect(swipeableState.getCurrentValue(), new SwipeableKt$rememberSwipeableStateFor$2(value, swipeableState, onValueChange, mutableState), composer, i10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableState;
    }

    @ExperimentalMaterial3Api
    /* renamed from: swipeable-pPrIpRY, reason: not valid java name */
    public static final <T> Modifier m1790swipeablepPrIpRY(Modifier swipeable, SwipeableState<T> state, Map<Float, ? extends T> anchors, Orientation orientation, boolean z8, boolean z9, MutableInteractionSource mutableInteractionSource, InterfaceC2072n thresholds, ResistanceConfig resistanceConfig, float f8) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(swipeable, "$this$swipeable");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(anchors, "anchors");
        AbstractC3292y.i(orientation, "orientation");
        AbstractC3292y.i(thresholds, "thresholds");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1(state, anchors, orientation, z8, z9, mutableInteractionSource, thresholds, resistanceConfig, f8);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(swipeable, noInspectorInfo, new SwipeableKt$swipeable$3(anchors, state, orientation, z8, mutableInteractionSource, z9, resistanceConfig, thresholds, f8));
    }

    /* renamed from: swipeable-pPrIpRY$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1791swipeablepPrIpRY$default(Modifier modifier, SwipeableState swipeableState, Map map, Orientation orientation, boolean z8, boolean z9, MutableInteractionSource mutableInteractionSource, InterfaceC2072n interfaceC2072n, ResistanceConfig resistanceConfig, float f8, int i8, Object obj) {
        boolean z10;
        boolean z11;
        MutableInteractionSource mutableInteractionSource2;
        InterfaceC2072n interfaceC2072n2;
        ResistanceConfig resistanceConfig2;
        float f9;
        if ((i8 & 8) != 0) {
            z10 = true;
        } else {
            z10 = z8;
        }
        if ((i8 & 16) != 0) {
            z11 = false;
        } else {
            z11 = z9;
        }
        if ((i8 & 32) != 0) {
            mutableInteractionSource2 = null;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if ((i8 & 64) != 0) {
            interfaceC2072n2 = SwipeableKt$swipeable$1.INSTANCE;
        } else {
            interfaceC2072n2 = interfaceC2072n;
        }
        if ((i8 & 128) != 0) {
            resistanceConfig2 = SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, map.keySet(), 0.0f, 0.0f, 6, null);
        } else {
            resistanceConfig2 = resistanceConfig;
        }
        if ((i8 & 256) != 0) {
            f9 = SwipeableDefaults.INSTANCE.m1789getVelocityThresholdD9Ej5fM$material3_release();
        } else {
            f9 = f8;
        }
        return m1790swipeablepPrIpRY(modifier, swipeableState, map, orientation, z10, z11, mutableInteractionSource2, interfaceC2072n2, resistanceConfig2, f9);
    }
}
