package androidx.compose.runtime;

import c6.InterfaceC2072n;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n6.B0;
import n6.InterfaceC3435A;
import n6.InterfaceC3488x0;
import n6.M;
import n6.N;

/* loaded from: classes.dex */
public final class EffectsKt {
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @Composable
    public static final void DisposableEffect(Function1 function1, Composer composer, int i8) {
        composer.startReplaceableGroup(-904483903);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-904483903, i8, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:119)");
        }
        throw new IllegalStateException(DisposableEffectNoParamError.toString());
    }

    @Composable
    public static final void LaunchedEffect(InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-805415771);
        if ((i8 & 1) != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-805415771, i8, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:318)");
            }
            throw new IllegalStateException(LaunchedEffectNoParamError.toString());
        }
        startRestartGroup.skipToGroupEnd();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new EffectsKt$LaunchedEffect$1(interfaceC2072n, i8));
        }
    }

    @Composable
    public static final void SideEffect(Function0 function0, Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288466761, i8, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        composer.recordSideEffect(function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final M createCompositionCoroutineScope(U5.g gVar, Composer composer) {
        InterfaceC3488x0.b bVar = InterfaceC3488x0.f35757n0;
        if (gVar.get(bVar) != null) {
            InterfaceC3435A b9 = B0.b(null, 1, null);
            b9.a(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return N.a(b9);
        }
        U5.g applyCoroutineContext = composer.getApplyCoroutineContext();
        return N.a(applyCoroutineContext.plus(B0.a((InterfaceC3488x0) applyCoroutineContext.get(bVar))).plus(gVar));
    }

    @Composable
    public static final M rememberCoroutineScope(Function0 function0, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(773894976);
        if ((i9 & 1) != 0) {
            function0 = EffectsKt$rememberCoroutineScope$1.INSTANCE;
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new CompositionScopedCoroutineScopeCanceller(createCompositionCoroutineScope((U5.g) function0.invoke(), composer));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        return coroutineScope;
    }

    @Composable
    public static final void DisposableEffect(Object obj, Function1 function1, Composer composer, int i8) {
        composer.startReplaceableGroup(-1371986847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371986847, i8, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(function1));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(Object obj, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(1179185413);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179185413, i8, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        U5.g applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, interfaceC2072n));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(Object obj, Object obj2, Function1 function1, Composer composer, int i8) {
        composer.startReplaceableGroup(1429097729);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1429097729, i8, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(function1));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(Object obj, Object obj2, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(590241125);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, i8, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        U5.g applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, interfaceC2072n));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(Object obj, Object obj2, Object obj3, Function1 function1, Composer composer, int i8) {
        composer.startReplaceableGroup(-1239538271);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239538271, i8, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(function1));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(Object obj, Object obj2, Object obj3, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(-54093371);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, i8, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        U5.g applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, interfaceC2072n));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(Object[] objArr, Function1 function1, Composer composer, int i8) {
        composer.startReplaceableGroup(-1307627122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1307627122, i8, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)");
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        composer.startReplaceableGroup(-568225417);
        boolean z8 = false;
        for (Object obj : copyOf) {
            z8 |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(function1));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(Object[] objArr, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(-139560008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, i8, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:417)");
        }
        U5.g applyCoroutineContext = composer.getApplyCoroutineContext();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        composer.startReplaceableGroup(-568225417);
        boolean z8 = false;
        for (Object obj : copyOf) {
            z8 |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, interfaceC2072n));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
