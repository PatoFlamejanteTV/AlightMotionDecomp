package androidx.compose.runtime;

import Q5.q;
import androidx.exifinterface.media.ExifInterface;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ComposablesKt {
    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0 function0, Function1 function1, Composer composer, int i8) {
        composer.startReplaceableGroup(1886828752);
        Applier<?> applier = composer.getApplier();
        AbstractC3292y.n(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(new ComposablesKt$ComposeNode$1(function0));
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m2472boximpl(Updater.m2473constructorimpl(composer)));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0 function0, Function1 function1, Composer composer, int i8) {
        composer.startReplaceableGroup(1405779621);
        Applier<?> applier = composer.getApplier();
        AbstractC3292y.n(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new ComposablesKt$ReusableComposeNode$1(function0));
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m2472boximpl(Updater.m2473constructorimpl(composer)));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void ReusableContent(Object obj, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(444418301);
        composer.startReusableGroup(ComposerKt.reuseKey, obj);
        interfaceC2072n.invoke(composer, Integer.valueOf((i8 >> 3) & 14));
        composer.endReusableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ReusableContentHost(boolean z8, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReusableGroup(ComposerKt.reuseKey, Boolean.valueOf(z8));
        boolean changed = composer.changed(z8);
        if (z8) {
            interfaceC2072n.invoke(composer, Integer.valueOf((i8 >> 3) & 14));
        } else {
            composer.deactivateToEndGroup(changed);
        }
        composer.endReusableGroup();
    }

    @Composable
    @ReadOnlyComposable
    public static final Composer getCurrentComposer(Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554250212, i8, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:183)");
        }
        throw new q("Implemented as an intrinsic");
    }

    @Composable
    public static final int getCurrentCompositeKeyHash(Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(524444915, i8, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    @Composable
    public static final CompositionLocalContext getCurrentCompositionLocalContext(Composer composer, int i8) {
        composer.startReplaceableGroup(-43352356);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43352356, i8, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:207)");
        }
        CompositionLocalContext compositionLocalContext = new CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime_release());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return compositionLocalContext;
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    @Composable
    @ReadOnlyComposable
    public static final RecomposeScope getCurrentRecomposeScope(Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394957799, i8, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)");
        }
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope != null) {
            composer.recordUsed(recomposeScope);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return recomposeScope;
        }
        throw new IllegalStateException("no recompose scope found".toString());
    }

    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> T key(Object[] objArr, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(-11941951);
        T t8 = (T) interfaceC2072n.invoke(composer, Integer.valueOf((i8 >> 3) & 14));
        composer.endReplaceableGroup();
        return t8;
    }

    @Composable
    public static final <T> T remember(Object obj, Function0 function0, Composer composer, int i8) {
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        T t8 = (T) composer.rememberedValue();
        if (changed || t8 == Composer.Companion.getEmpty()) {
            t8 = (T) function0.invoke();
            composer.updateRememberedValue(t8);
        }
        composer.endReplaceableGroup();
        return t8;
    }

    @Composable
    public static final CompositionContext rememberCompositionContext(Composer composer, int i8) {
        composer.startReplaceableGroup(-1165786124);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165786124, i8, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:480)");
        }
        CompositionContext buildContext = composer.buildContext();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buildContext;
    }

    @Composable
    public static final <T> T remember(Object obj, Object obj2, Function0 function0, Composer composer, int i8) {
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        T t8 = (T) composer.rememberedValue();
        if (changed || t8 == Composer.Companion.getEmpty()) {
            t8 = (T) function0.invoke();
            composer.updateRememberedValue(t8);
        }
        composer.endReplaceableGroup();
        return t8;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0 function0, Function1 function1, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(-548224868);
        Applier<?> applier = composer.getApplier();
        AbstractC3292y.n(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m2472boximpl(Updater.m2473constructorimpl(composer)));
        interfaceC2072n.invoke(composer, Integer.valueOf((i8 >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0 function0, Function1 function1, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(-692256719);
        Applier<?> applier = composer.getApplier();
        AbstractC3292y.n(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m2472boximpl(Updater.m2473constructorimpl(composer)));
        interfaceC2072n.invoke(composer, Integer.valueOf((i8 >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final <T> T remember(Object obj, Object obj2, Object obj3, Function0 function0, Composer composer, int i8) {
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        T t8 = (T) composer.rememberedValue();
        if (changed || t8 == Composer.Companion.getEmpty()) {
            t8 = (T) function0.invoke();
            composer.updateRememberedValue(t8);
        }
        composer.endReplaceableGroup();
        return t8;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0 function0, Function1 function1, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        Applier<?> applier = composer.getApplier();
        AbstractC3292y.n(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m2472boximpl(Updater.m2473constructorimpl(composer)));
        interfaceC2073o.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, Integer.valueOf((i8 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        interfaceC2072n.invoke(composer, Integer.valueOf((i8 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0 function0, Function1 function1, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        Applier<?> applier = composer.getApplier();
        AbstractC3292y.n(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m2472boximpl(Updater.m2473constructorimpl(composer)));
        interfaceC2073o.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, Integer.valueOf((i8 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        interfaceC2072n.invoke(composer, Integer.valueOf((i8 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    public static final <T> T remember(Object[] objArr, Function0 function0, Composer composer, int i8) {
        composer.startReplaceableGroup(-568225417);
        boolean z8 = false;
        for (Object obj : objArr) {
            z8 |= composer.changed(obj);
        }
        T t8 = (T) composer.rememberedValue();
        if (z8 || t8 == Composer.Companion.getEmpty()) {
            t8 = (T) function0.invoke();
            composer.updateRememberedValue(t8);
        }
        composer.endReplaceableGroup();
        return t8;
    }

    @Composable
    public static final <T> T remember(Function0 function0, Composer composer, int i8) {
        composer.startReplaceableGroup(-492369756);
        T t8 = (T) composer.rememberedValue();
        if (t8 == Composer.Companion.getEmpty()) {
            t8 = (T) function0.invoke();
            composer.updateRememberedValue(t8);
        }
        composer.endReplaceableGroup();
        return t8;
    }
}
