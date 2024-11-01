package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class FloatingActionButtonKt$FloatingActionButton$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ long $contentColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ InterfaceC2072n $content;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03441 extends AbstractC3293z implements InterfaceC2072n {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ InterfaceC2072n $content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03441(InterfaceC2072n interfaceC2072n, int i8) {
                super(2);
                this.$content = interfaceC2072n;
                this.$$dirty = i8;
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
                    ComposerKt.traceEventStart(167946739, i8, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:120)");
                }
                Modifier.Companion companion = Modifier.Companion;
                FabPrimaryTokens fabPrimaryTokens = FabPrimaryTokens.INSTANCE;
                Modifier m608defaultMinSizeVpY3zN4 = SizeKt.m608defaultMinSizeVpY3zN4(companion, fabPrimaryTokens.m2089getContainerWidthD9Ej5fM(), fabPrimaryTokens.m2088getContainerHeightD9Ej5fM());
                Alignment center = Alignment.Companion.getCenter();
                InterfaceC2072n interfaceC2072n = this.$content;
                int i9 = this.$$dirty;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0 constructor = companion2.getConstructor();
                InterfaceC2073o materializerOf = LayoutKt.materializerOf(m608defaultMinSizeVpY3zN4);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer m2473constructorimpl = Updater.m2473constructorimpl(composer);
                Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl, density, companion2.getSetDensity());
                Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer.startReplaceableGroup(595057145);
                interfaceC2072n.invoke(composer, Integer.valueOf((i9 >> 21) & 14));
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC2072n interfaceC2072n, int i8) {
            super(2);
            this.$content = interfaceC2072n;
            this.$$dirty = i8;
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
                ComposerKt.traceEventStart(-945978686, i8, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:113)");
            }
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), ExtendedFabPrimaryTokens.INSTANCE.getLabelTextFont()), ComposableLambdaKt.composableLambda(composer, 167946739, true, new C03441(this.$content, this.$$dirty)), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$FloatingActionButton$2(long j8, InterfaceC2072n interfaceC2072n, int i8) {
        super(2);
        this.$contentColor = j8;
        this.$content = interfaceC2072n;
        this.$$dirty = i8;
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
            ComposerKt.traceEventStart(1249316354, i8, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:112)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(this.$contentColor))}, ComposableLambdaKt.composableLambda(composer, -945978686, true, new AnonymousClass1(this.$content, this.$$dirty)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
