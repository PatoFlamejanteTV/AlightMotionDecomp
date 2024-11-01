package androidx.compose.runtime;

import Q5.I;
import c6.InterfaceC2072n;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateKt__ProduceStateKt {
    @Composable
    public static final <T> State<T> produceState(T t8, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(10454275);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10454275, i8, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        EffectsKt.LaunchedEffect(I.f8786a, new SnapshotStateKt__ProduceStateKt$produceState$1(interfaceC2072n, mutableState, null), composer, 70);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    public static final <T> State<T> produceState(T t8, Object obj, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(-1928268701);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928268701, i8, -1, "androidx.compose.runtime.produceState (ProduceState.kt:112)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        EffectsKt.LaunchedEffect(obj, new SnapshotStateKt__ProduceStateKt$produceState$2(interfaceC2072n, mutableState, null), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    public static final <T> State<T> produceState(T t8, Object obj, Object obj2, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(-1703169085);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703169085, i8, -1, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        EffectsKt.LaunchedEffect(obj, obj2, new SnapshotStateKt__ProduceStateKt$produceState$3(interfaceC2072n, mutableState, null), composer, 584);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    public static final <T> State<T> produceState(T t8, Object obj, Object obj2, Object obj3, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(1807205155);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1807205155, i8, -1, "androidx.compose.runtime.produceState (ProduceState.kt:181)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        EffectsKt.LaunchedEffect(obj, obj2, obj3, new SnapshotStateKt__ProduceStateKt$produceState$4(interfaceC2072n, mutableState, null), composer, 4680);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    public static final <T> State<T> produceState(T t8, Object[] objArr, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(490154582);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(490154582, i8, -1, "androidx.compose.runtime.produceState (ProduceState.kt:214)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        EffectsKt.LaunchedEffect(Arrays.copyOf(objArr, objArr.length), (InterfaceC2072n) new SnapshotStateKt__ProduceStateKt$produceState$5(interfaceC2072n, mutableState, null), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
