package androidx.compose.runtime;

import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class CompositionLocalKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(ProvidedValue<?>[] providedValueArr, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-1390796515);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1390796515, i8, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        startRestartGroup.startProviders(providedValueArr);
        interfaceC2072n.invoke(startRestartGroup, Integer.valueOf((i8 >> 3) & 14));
        startRestartGroup.endProviders();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CompositionLocalKt$CompositionLocalProvider$1(providedValueArr, interfaceC2072n, i8));
        }
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, Function0 function0) {
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy, function0);
    }

    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return compositionLocalOf(snapshotMutationPolicy, function0);
    }

    public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(Function0 function0) {
        return new StaticProvidableCompositionLocal(function0);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(ProvidedValue<?> providedValue, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-1350970552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1350970552, i8, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:245)");
        }
        startRestartGroup.startProvider(providedValue);
        interfaceC2072n.invoke(startRestartGroup, Integer.valueOf((i8 >> 3) & 14));
        startRestartGroup.endProvider();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CompositionLocalKt$CompositionLocalProvider$2(providedValue, interfaceC2072n, i8));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(CompositionLocalContext compositionLocalContext, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(1853897736);
        int i9 = (i8 & 14) == 0 ? (startRestartGroup.changed(compositionLocalContext) ? 4 : 2) | i8 : i8;
        if ((i8 & 112) == 0) {
            i9 |= startRestartGroup.changedInstance(interfaceC2072n) ? 32 : 16;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1853897736, i9, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:264)");
            }
            PersistentCompositionLocalMap compositionLocals$runtime_release = compositionLocalContext.getCompositionLocals$runtime_release();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime_release.size());
            for (Map.Entry<CompositionLocal<Object>, State<? extends Object>> entry : compositionLocals$runtime_release.entrySet()) {
                CompositionLocal<Object> key = entry.getKey();
                AbstractC3292y.g(key, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
                arrayList.add(((ProvidableCompositionLocal) key).provides(entry.getValue().getValue()));
            }
            ProvidedValue[] providedValueArr = (ProvidedValue[]) arrayList.toArray(new ProvidedValue[0]);
            CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr, providedValueArr.length), interfaceC2072n, startRestartGroup, (i9 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CompositionLocalKt$CompositionLocalProvider$4(compositionLocalContext, interfaceC2072n, i8));
        }
    }
}
