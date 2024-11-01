package androidx.compose.foundation.lazy.layout;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyLayoutKt$LazyLayout$3 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ State<Function0> $currentItemProvider;
    final /* synthetic */ InterfaceC2072n $measurePolicy;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ LazyLayoutPrefetchState $prefetchState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutKt$LazyLayout$3(LazyLayoutPrefetchState lazyLayoutPrefetchState, Modifier modifier, InterfaceC2072n interfaceC2072n, int i8, State<? extends Function0> state) {
        super(3);
        this.$prefetchState = lazyLayoutPrefetchState;
        this.$modifier = modifier;
        this.$measurePolicy = interfaceC2072n;
        this.$$dirty = i8;
        this.$currentItemProvider = state;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((SaveableStateHolder) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(SaveableStateHolder saveableStateHolder, Composer composer, int i8) {
        AbstractC3292y.i(saveableStateHolder, "saveableStateHolder");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1488997347, i8, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:60)");
        }
        State<Function0> state = this.$currentItemProvider;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1(state));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) rememberedValue2;
        LazyLayoutPrefetchState lazyLayoutPrefetchState = this.$prefetchState;
        composer.startReplaceableGroup(-1523808190);
        if (lazyLayoutPrefetchState != null) {
            LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(this.$prefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState, composer, ((this.$$dirty >> 6) & 14) | 64 | (SubcomposeLayoutState.$stable << 6));
            I i9 = I.f8786a;
        }
        composer.endReplaceableGroup();
        Modifier modifier = this.$modifier;
        InterfaceC2072n interfaceC2072n = this.$measurePolicy;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(lazyLayoutItemContentFactory) | composer.changed(interfaceC2072n);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new LazyLayoutKt$LazyLayout$3$2$1(lazyLayoutItemContentFactory, interfaceC2072n);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier, (InterfaceC2072n) rememberedValue3, composer, SubcomposeLayoutState.$stable | (this.$$dirty & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
