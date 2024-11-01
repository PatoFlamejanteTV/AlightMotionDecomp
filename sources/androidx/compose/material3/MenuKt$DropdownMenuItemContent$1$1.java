package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MenuKt$DropdownMenuItemContent$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ MenuItemColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC2072n $leadingIcon;
    final /* synthetic */ InterfaceC2072n $text;
    final /* synthetic */ RowScope $this_Row;
    final /* synthetic */ InterfaceC2072n $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ InterfaceC2072n $leadingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC2072n interfaceC2072n, int i8) {
            super(2);
            this.$leadingIcon = interfaceC2072n;
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
                ComposerKt.traceEventStart(2035552199, i8, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:175)");
            }
            Modifier m609defaultMinSizeVpY3zN4$default = SizeKt.m609defaultMinSizeVpY3zN4$default(Modifier.Companion, MenuTokens.INSTANCE.m2193getListItemLeadingIconSizeD9Ej5fM(), 0.0f, 2, null);
            InterfaceC2072n interfaceC2072n = this.$leadingIcon;
            int i9 = this.$$dirty;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o materializerOf = LayoutKt.materializerOf(m609defaultMinSizeVpY3zN4$default);
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
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, density, companion.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(1667854413);
            interfaceC2072n.invoke(composer, Integer.valueOf((i9 >> 9) & 14));
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ InterfaceC2072n $leadingIcon;
        final /* synthetic */ InterfaceC2072n $text;
        final /* synthetic */ RowScope $this_Row;
        final /* synthetic */ InterfaceC2072n $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(RowScope rowScope, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, int i8) {
            super(2);
            this.$this_Row = rowScope;
            this.$leadingIcon = interfaceC2072n;
            this.$trailingIcon = interfaceC2072n2;
            this.$text = interfaceC2072n3;
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
            float m5155constructorimpl;
            float m5155constructorimpl2;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1728894036, i8, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:181)");
            }
            Modifier a9 = e.a(this.$this_Row, Modifier.Companion, 1.0f, false, 2, null);
            if (this.$leadingIcon != null) {
                m5155constructorimpl = MenuKt.DropdownMenuItemHorizontalPadding;
            } else {
                m5155constructorimpl = Dp.m5155constructorimpl(0);
            }
            float f8 = m5155constructorimpl;
            if (this.$trailingIcon != null) {
                m5155constructorimpl2 = MenuKt.DropdownMenuItemHorizontalPadding;
            } else {
                m5155constructorimpl2 = Dp.m5155constructorimpl(0);
            }
            Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(a9, f8, 0.0f, m5155constructorimpl2, 0.0f, 10, null);
            InterfaceC2072n interfaceC2072n = this.$text;
            int i9 = this.$$dirty;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o materializerOf = LayoutKt.materializerOf(m581paddingqDBjuR0$default);
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
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, density, companion.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(-1301783630);
            interfaceC2072n.invoke(composer, Integer.valueOf(i9 & 14));
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ InterfaceC2072n $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(InterfaceC2072n interfaceC2072n, int i8) {
            super(2);
            this.$trailingIcon = interfaceC2072n;
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
                ComposerKt.traceEventStart(580312062, i8, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:204)");
            }
            Modifier m609defaultMinSizeVpY3zN4$default = SizeKt.m609defaultMinSizeVpY3zN4$default(Modifier.Companion, MenuTokens.INSTANCE.m2194getListItemTrailingIconSizeD9Ej5fM(), 0.0f, 2, null);
            InterfaceC2072n interfaceC2072n = this.$trailingIcon;
            int i9 = this.$$dirty;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o materializerOf = LayoutKt.materializerOf(m609defaultMinSizeVpY3zN4$default);
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
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, density, companion.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(-589942012);
            interfaceC2072n.invoke(composer, Integer.valueOf((i9 >> 12) & 14));
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuItemContent$1$1(InterfaceC2072n interfaceC2072n, MenuItemColors menuItemColors, boolean z8, int i8, InterfaceC2072n interfaceC2072n2, RowScope rowScope, InterfaceC2072n interfaceC2072n3) {
        super(2);
        this.$leadingIcon = interfaceC2072n;
        this.$colors = menuItemColors;
        this.$enabled = z8;
        this.$$dirty = i8;
        this.$trailingIcon = interfaceC2072n2;
        this.$this_Row = rowScope;
        this.$text = interfaceC2072n3;
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
            ComposerKt.traceEventStart(1065051884, i8, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:171)");
        }
        composer.startReplaceableGroup(1426254055);
        if (this.$leadingIcon != null) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            MenuItemColors menuItemColors = this.$colors;
            boolean z8 = this.$enabled;
            int i9 = this.$$dirty;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{localContentColor.provides(menuItemColors.leadingIconColor$material3_release(z8, composer, ((i9 >> 15) & 112) | ((i9 >> 15) & 14)).getValue())}, ComposableLambdaKt.composableLambda(composer, 2035552199, true, new AnonymousClass1(this.$leadingIcon, this.$$dirty)), composer, 56);
        }
        composer.endReplaceableGroup();
        ProvidableCompositionLocal<Color> localContentColor2 = ContentColorKt.getLocalContentColor();
        MenuItemColors menuItemColors2 = this.$colors;
        boolean z9 = this.$enabled;
        int i10 = this.$$dirty;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{localContentColor2.provides(menuItemColors2.textColor$material3_release(z9, composer, ((i10 >> 15) & 112) | ((i10 >> 15) & 14)).getValue())}, ComposableLambdaKt.composableLambda(composer, -1728894036, true, new AnonymousClass2(this.$this_Row, this.$leadingIcon, this.$trailingIcon, this.$text, this.$$dirty)), composer, 56);
        if (this.$trailingIcon != null) {
            ProvidableCompositionLocal<Color> localContentColor3 = ContentColorKt.getLocalContentColor();
            MenuItemColors menuItemColors3 = this.$colors;
            boolean z10 = this.$enabled;
            int i11 = this.$$dirty;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{localContentColor3.provides(menuItemColors3.trailingIconColor$material3_release(z10, composer, ((i11 >> 15) & 112) | ((i11 >> 15) & 14)).getValue())}, ComposableLambdaKt.composableLambda(composer, 580312062, true, new AnonymousClass3(this.$trailingIcon, this.$$dirty)), composer, 56);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
