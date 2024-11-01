package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChipKt$Chip$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ State<Color> $contentColor$delegate;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC2072n $leadingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ChipKt$Chip$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ ChipColors $colors;
        final /* synthetic */ InterfaceC2073o $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ InterfaceC2072n $leadingIcon;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.ChipKt$Chip$3$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03241 extends AbstractC3293z implements InterfaceC2072n {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ ChipColors $colors;
            final /* synthetic */ InterfaceC2073o $content;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ InterfaceC2072n $leadingIcon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03241(InterfaceC2072n interfaceC2072n, ChipColors chipColors, boolean z8, int i8, InterfaceC2073o interfaceC2073o) {
                super(2);
                this.$leadingIcon = interfaceC2072n;
                this.$colors = chipColors;
                this.$enabled = z8;
                this.$$dirty = i8;
                this.$content = interfaceC2073o;
            }

            private static final long invoke$lambda$1$lambda$0(State<Color> state) {
                return state.getValue().m2958unboximpl();
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer, int i8) {
                float m5155constructorimpl;
                float f8;
                float f9;
                float f10;
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1131213696, i8, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:112)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier m609defaultMinSizeVpY3zN4$default = SizeKt.m609defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m1141getMinHeightD9Ej5fM(), 1, null);
                if (this.$leadingIcon == null) {
                    m5155constructorimpl = ChipKt.HorizontalPadding;
                } else {
                    m5155constructorimpl = Dp.m5155constructorimpl(0);
                }
                float f11 = m5155constructorimpl;
                f8 = ChipKt.HorizontalPadding;
                Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(m609defaultMinSizeVpY3zN4$default, f11, 0.0f, f8, 0.0f, 10, null);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                InterfaceC2072n interfaceC2072n = this.$leadingIcon;
                ChipColors chipColors = this.$colors;
                boolean z8 = this.$enabled;
                int i9 = this.$$dirty;
                InterfaceC2073o interfaceC2073o = this.$content;
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0 constructor = companion2.getConstructor();
                InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m581paddingqDBjuR0$default);
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
                Updater.m2480setimpl(m2473constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer.startReplaceableGroup(2084788937);
                if (interfaceC2072n != null) {
                    f9 = ChipKt.LeadingIconStartSpacing;
                    SpacerKt.Spacer(SizeKt.m629width3ABfNKs(companion, f9), composer, 6);
                    State<Color> leadingIconContentColor = chipColors.leadingIconContentColor(z8, composer, ((i9 >> 6) & 14) | ((i9 >> 15) & 112));
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(invoke$lambda$1$lambda$0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2950getAlphaimpl(invoke$lambda$1$lambda$0(leadingIconContentColor))))}, interfaceC2072n, composer, ((i9 >> 18) & 112) | 8);
                    f10 = ChipKt.LeadingIconEndSpacing;
                    SpacerKt.Spacer(SizeKt.m629width3ABfNKs(companion, f10), composer, 6);
                }
                composer.endReplaceableGroup();
                interfaceC2073o.invoke(rowScopeInstance, composer, Integer.valueOf(((i9 >> 21) & 112) | 6));
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
        AnonymousClass1(InterfaceC2072n interfaceC2072n, ChipColors chipColors, boolean z8, int i8, InterfaceC2073o interfaceC2073o) {
            super(2);
            this.$leadingIcon = interfaceC2072n;
            this.$colors = chipColors;
            this.$enabled = z8;
            this.$$dirty = i8;
            this.$content = interfaceC2073o;
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
                ComposerKt.traceEventStart(667535631, i8, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:109)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2(), ComposableLambdaKt.composableLambda(composer, -1131213696, true, new C03241(this.$leadingIcon, this.$colors, this.$enabled, this.$$dirty, this.$content)), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$Chip$3(State<Color> state, InterfaceC2072n interfaceC2072n, ChipColors chipColors, boolean z8, int i8, InterfaceC2073o interfaceC2073o) {
        super(2);
        this.$contentColor$delegate = state;
        this.$leadingIcon = interfaceC2072n;
        this.$colors = chipColors;
        this.$enabled = z8;
        this.$$dirty = i8;
        this.$content = interfaceC2073o;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        long Chip$lambda$1;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139076687, i8, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:108)");
        }
        ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
        Chip$lambda$1 = ChipKt.Chip$lambda$1(this.$contentColor$delegate);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{localContentAlpha.provides(Float.valueOf(Color.m2950getAlphaimpl(Chip$lambda$1)))}, ComposableLambdaKt.composableLambda(composer, 667535631, true, new AnonymousClass1(this.$leadingIcon, this.$colors, this.$enabled, this.$$dirty, this.$content)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
