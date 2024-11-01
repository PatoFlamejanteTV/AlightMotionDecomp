package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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
public final class ChipKt$FilterChip$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ SelectableChipColors $colors;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ State<Color> $contentColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC2072n $leadingIcon;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ InterfaceC2072n $selectedIcon;
    final /* synthetic */ InterfaceC2072n $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ChipKt$FilterChip$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ SelectableChipColors $colors;
        final /* synthetic */ InterfaceC2073o $content;
        final /* synthetic */ State<Color> $contentColor;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ InterfaceC2072n $leadingIcon;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ InterfaceC2072n $selectedIcon;
        final /* synthetic */ InterfaceC2072n $trailingIcon;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.ChipKt$FilterChip$3$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03251 extends AbstractC3293z implements InterfaceC2072n {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ int $$dirty1;
            final /* synthetic */ SelectableChipColors $colors;
            final /* synthetic */ InterfaceC2073o $content;
            final /* synthetic */ State<Color> $contentColor;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ InterfaceC2072n $leadingIcon;
            final /* synthetic */ boolean $selected;
            final /* synthetic */ InterfaceC2072n $selectedIcon;
            final /* synthetic */ InterfaceC2072n $trailingIcon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03251(InterfaceC2072n interfaceC2072n, boolean z8, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2073o interfaceC2073o, int i8, SelectableChipColors selectableChipColors, boolean z9, int i9, State<Color> state) {
                super(2);
                this.$leadingIcon = interfaceC2072n;
                this.$selected = z8;
                this.$selectedIcon = interfaceC2072n2;
                this.$trailingIcon = interfaceC2072n3;
                this.$content = interfaceC2073o;
                this.$$dirty1 = i8;
                this.$colors = selectableChipColors;
                this.$enabled = z9;
                this.$$dirty = i9;
                this.$contentColor = state;
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
                float m5155constructorimpl2;
                float f8;
                RowScopeInstance rowScopeInstance;
                int i9;
                float f9;
                int i10;
                Modifier modifier;
                float f10;
                float f11;
                float f12;
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1543702066, i8, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:213)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier m609defaultMinSizeVpY3zN4$default = SizeKt.m609defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m1141getMinHeightD9Ej5fM(), 1, null);
                if (this.$leadingIcon == null && (!this.$selected || this.$selectedIcon == null)) {
                    m5155constructorimpl = ChipKt.HorizontalPadding;
                } else {
                    m5155constructorimpl = Dp.m5155constructorimpl(0);
                }
                float f13 = m5155constructorimpl;
                if (this.$trailingIcon == null) {
                    m5155constructorimpl2 = ChipKt.HorizontalPadding;
                } else {
                    m5155constructorimpl2 = Dp.m5155constructorimpl(0);
                }
                Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(m609defaultMinSizeVpY3zN4$default, f13, 0.0f, m5155constructorimpl2, 0.0f, 10, null);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Alignment.Companion companion2 = Alignment.Companion;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                InterfaceC2072n interfaceC2072n = this.$leadingIcon;
                boolean z8 = this.$selected;
                InterfaceC2072n interfaceC2072n2 = this.$selectedIcon;
                InterfaceC2073o interfaceC2073o = this.$content;
                int i11 = this.$$dirty1;
                InterfaceC2072n interfaceC2072n3 = this.$trailingIcon;
                SelectableChipColors selectableChipColors = this.$colors;
                boolean z9 = this.$enabled;
                int i12 = this.$$dirty;
                State<Color> state = this.$contentColor;
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0 constructor = companion3.getConstructor();
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
                Updater.m2480setimpl(m2473constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composer.startReplaceableGroup(-1943412047);
                if (interfaceC2072n != null || (z8 && interfaceC2072n2 != null)) {
                    f8 = ChipKt.LeadingIconStartSpacing;
                    SpacerKt.Spacer(SizeKt.m629width3ABfNKs(companion, f8), composer, 6);
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Function0 constructor2 = companion3.getConstructor();
                    rowScopeInstance = rowScopeInstance2;
                    InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                    i9 = i11;
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer m2473constructorimpl2 = Updater.m2473constructorimpl(composer);
                    Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    InterfaceC2072n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer.startReplaceableGroup(649985685);
                    if (interfaceC2072n != null) {
                        State<Color> leadingIconColor = selectableChipColors.leadingIconColor(z9, z8, composer, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 15) & 896));
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2950getAlphaimpl(leadingIconColor.getValue().m2958unboximpl())))}, interfaceC2072n, composer, ((i12 >> 21) & 112) | 8);
                    }
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-1943411233);
                    if (z8 && interfaceC2072n2 != null) {
                        long m2958unboximpl = state.getValue().m2958unboximpl();
                        composer.startReplaceableGroup(649986516);
                        if (interfaceC2072n != null) {
                            f10 = ChipKt.SelectedIconContainerSize;
                            modifier = ClipKt.clip(BackgroundKt.m258backgroundbw27NRU(SizeKt.m616requiredSize3ABfNKs(companion, f10), state.getValue().m2958unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                            m2958unboximpl = selectableChipColors.backgroundColor(z9, z8, composer, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 15) & 896)).getValue().m2958unboximpl();
                        } else {
                            modifier = companion;
                        }
                        composer.endReplaceableGroup();
                        Alignment center = companion2.getCenter();
                        composer.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                        composer.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                        Function0 constructor3 = companion3.getConstructor();
                        InterfaceC2073o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor3);
                        } else {
                            composer.useNode();
                        }
                        Composer m2473constructorimpl3 = Updater.m2473constructorimpl(composer);
                        Updater.m2480setimpl(m2473constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m2480setimpl(m2473constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        InterfaceC2072n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (m2473constructorimpl3.getInserting() || !AbstractC3292y.d(m2473constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m2473constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m2473constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        modifierMaterializerOf3.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
                        composer.startReplaceableGroup(2058660585);
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(m2958unboximpl))}, interfaceC2072n2, composer, ((i12 >> 24) & 112) | 8);
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                    }
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    f9 = ChipKt.LeadingIconEndSpacing;
                    i10 = 6;
                    SpacerKt.Spacer(SizeKt.m629width3ABfNKs(companion, f9), composer, 6);
                } else {
                    rowScopeInstance = rowScopeInstance2;
                    i9 = i11;
                    i10 = 6;
                }
                composer.endReplaceableGroup();
                interfaceC2073o.invoke(rowScopeInstance, composer, Integer.valueOf((i9 & 112) | i10));
                composer.startReplaceableGroup(-1181292829);
                if (interfaceC2072n3 != null) {
                    f11 = ChipKt.TrailingIconSpacing;
                    SpacerKt.Spacer(SizeKt.m629width3ABfNKs(companion, f11), composer, i10);
                    interfaceC2072n3.invoke(composer, Integer.valueOf(i9 & 14));
                    f12 = ChipKt.TrailingIconSpacing;
                    SpacerKt.Spacer(SizeKt.m629width3ABfNKs(companion, f12), composer, i10);
                }
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
        AnonymousClass1(InterfaceC2072n interfaceC2072n, boolean z8, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2073o interfaceC2073o, int i8, SelectableChipColors selectableChipColors, boolean z9, int i9, State<Color> state) {
            super(2);
            this.$leadingIcon = interfaceC2072n;
            this.$selected = z8;
            this.$selectedIcon = interfaceC2072n2;
            this.$trailingIcon = interfaceC2072n3;
            this.$content = interfaceC2073o;
            this.$$dirty1 = i8;
            this.$colors = selectableChipColors;
            this.$enabled = z9;
            this.$$dirty = i9;
            this.$contentColor = state;
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
                ComposerKt.traceEventStart(1582291359, i8, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:210)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2(), ComposableLambdaKt.composableLambda(composer, -1543702066, true, new C03251(this.$leadingIcon, this.$selected, this.$selectedIcon, this.$trailingIcon, this.$content, this.$$dirty1, this.$colors, this.$enabled, this.$$dirty, this.$contentColor)), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$FilterChip$3(State<Color> state, InterfaceC2072n interfaceC2072n, boolean z8, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2073o interfaceC2073o, int i8, SelectableChipColors selectableChipColors, boolean z9, int i9) {
        super(2);
        this.$contentColor = state;
        this.$leadingIcon = interfaceC2072n;
        this.$selected = z8;
        this.$selectedIcon = interfaceC2072n2;
        this.$trailingIcon = interfaceC2072n3;
        this.$content = interfaceC2073o;
        this.$$dirty1 = i8;
        this.$colors = selectableChipColors;
        this.$enabled = z9;
        this.$$dirty = i9;
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
            ComposerKt.traceEventStart(722126431, i8, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:209)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2950getAlphaimpl(this.$contentColor.getValue().m2958unboximpl())))}, ComposableLambdaKt.composableLambda(composer, 1582291359, true, new AnonymousClass1(this.$leadingIcon, this.$selected, this.$selectedIcon, this.$trailingIcon, this.$content, this.$$dirty1, this.$colors, this.$enabled, this.$$dirty, this.$contentColor)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
