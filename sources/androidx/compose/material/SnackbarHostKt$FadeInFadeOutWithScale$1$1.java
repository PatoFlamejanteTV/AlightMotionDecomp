package androidx.compose.material;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnackbarHostKt$FadeInFadeOutWithScale$1$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ SnackbarData $current;
    final /* synthetic */ SnackbarData $key;
    final /* synthetic */ List<SnackbarData> $keys;
    final /* synthetic */ FadeInFadeOutState<SnackbarData> $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ SnackbarData $key;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03361 extends AbstractC3293z implements Function0 {
            final /* synthetic */ SnackbarData $key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03361(SnackbarData snackbarData) {
                super(0);
                this.$key = snackbarData;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                this.$key.dismiss();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SnackbarData snackbarData) {
            super(1);
            this.$key = snackbarData;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.m4515setLiveRegionhR3wRGc(semantics, LiveRegionMode.Companion.m4492getPolite0phEisY());
            SemanticsPropertiesKt.dismiss$default(semantics, null, new C03361(this.$key), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1(SnackbarData snackbarData, SnackbarData snackbarData2, List<SnackbarData> list, FadeInFadeOutState<SnackbarData> fadeInFadeOutState) {
        super(3);
        this.$key = snackbarData;
        this.$current = snackbarData2;
        this.$keys = list;
        this.$state = fadeInFadeOutState;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((InterfaceC2072n) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public final void invoke(InterfaceC2072n children, Composer composer, int i8) {
        int i9;
        State animatedOpacity;
        State animatedScale;
        AbstractC3292y.i(children, "children");
        if ((i8 & 14) == 0) {
            i9 = i8 | (composer.changedInstance(children) ? 4 : 2);
        } else {
            i9 = i8;
        }
        if ((i9 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-94104314, i9, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:270)");
        }
        boolean d8 = AbstractC3292y.d(this.$key, this.$current);
        int i10 = d8 ? 150 : 75;
        int i11 = (!d8 || AbstractC1435t.j0(this.$keys).size() == 1) ? 0 : 75;
        animatedOpacity = SnackbarHostKt.animatedOpacity(AnimationSpecKt.tween(i10, i11, EasingKt.getLinearEasing()), d8, new SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1(this.$key, this.$state), composer, 0, 0);
        animatedScale = SnackbarHostKt.animatedScale(AnimationSpecKt.tween(i10, i11, EasingKt.getFastOutSlowInEasing()), d8, composer, 0);
        Modifier semantics$default = SemanticsModifierKt.semantics$default(GraphicsLayerModifierKt.m3108graphicsLayerAp8cVGQ$default(Modifier.Companion, ((Number) animatedScale.getValue()).floatValue(), ((Number) animatedScale.getValue()).floatValue(), ((Number) animatedOpacity.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null), false, new AnonymousClass1(this.$key), 1, null);
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics$default);
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
        Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        children.invoke(composer, Integer.valueOf(i9 & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
