package androidx.compose.material;

import Q5.I;
import Q5.x;
import R5.Q;
import U5.h;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$BackdropScaffold$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ InterfaceC2072n $backLayer;
    final /* synthetic */ Function1 $calculateBackLayerConstraints;
    final /* synthetic */ long $frontLayerBackgroundColor;
    final /* synthetic */ InterfaceC2072n $frontLayerContent;
    final /* synthetic */ long $frontLayerContentColor;
    final /* synthetic */ float $frontLayerElevation;
    final /* synthetic */ long $frontLayerScrimColor;
    final /* synthetic */ Shape $frontLayerShape;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ float $headerHeight;
    final /* synthetic */ float $headerHeightPx;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $peekHeight;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ BackdropScaffoldState $scaffoldState;
    final /* synthetic */ InterfaceC2073o $snackbarHost;
    final /* synthetic */ boolean $stickyFrontLayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2074p {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ long $frontLayerBackgroundColor;
        final /* synthetic */ InterfaceC2072n $frontLayerContent;
        final /* synthetic */ long $frontLayerContentColor;
        final /* synthetic */ float $frontLayerElevation;
        final /* synthetic */ long $frontLayerScrimColor;
        final /* synthetic */ Shape $frontLayerShape;
        final /* synthetic */ boolean $gesturesEnabled;
        final /* synthetic */ float $headerHeight;
        final /* synthetic */ float $headerHeightPx;
        final /* synthetic */ float $peekHeight;
        final /* synthetic */ float $peekHeightPx;
        final /* synthetic */ BackdropScaffoldState $scaffoldState;
        final /* synthetic */ M $scope;
        final /* synthetic */ InterfaceC2073o $snackbarHost;
        final /* synthetic */ boolean $stickyFrontLayer;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends AbstractC3293z implements InterfaceC2072n {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ int $$dirty1;
            final /* synthetic */ InterfaceC2072n $frontLayerContent;
            final /* synthetic */ long $frontLayerScrimColor;
            final /* synthetic */ boolean $gesturesEnabled;
            final /* synthetic */ float $peekHeight;
            final /* synthetic */ BackdropScaffoldState $scaffoldState;
            final /* synthetic */ M $scope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(float f8, InterfaceC2072n interfaceC2072n, int i8, long j8, BackdropScaffoldState backdropScaffoldState, int i9, boolean z8, M m8) {
                super(2);
                this.$peekHeight = f8;
                this.$frontLayerContent = interfaceC2072n;
                this.$$dirty = i8;
                this.$frontLayerScrimColor = j8;
                this.$scaffoldState = backdropScaffoldState;
                this.$$dirty1 = i9;
                this.$gesturesEnabled = z8;
                this.$scope = m8;
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
                    ComposerKt.traceEventStart(-1065299503, i8, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:350)");
                }
                Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, this.$peekHeight, 7, null);
                InterfaceC2072n interfaceC2072n = this.$frontLayerContent;
                int i9 = this.$$dirty;
                long j8 = this.$frontLayerScrimColor;
                BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                int i10 = this.$$dirty1;
                boolean z8 = this.$gesturesEnabled;
                M m8 = this.$scope;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0 constructor = companion.getConstructor();
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
                interfaceC2072n.invoke(composer, Integer.valueOf((i9 >> 6) & 14));
                BackdropScaffoldKt.m1090Scrim3JVO9M(j8, new BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1(z8, backdropScaffoldState, m8), backdropScaffoldState.getTargetValue() == BackdropValue.Revealed, composer, (i10 >> 18) & 14);
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
        AnonymousClass1(float f8, boolean z8, boolean z9, BackdropScaffoldState backdropScaffoldState, float f9, int i8, Shape shape, long j8, long j9, float f10, int i9, float f11, M m8, float f12, InterfaceC2072n interfaceC2072n, long j10, InterfaceC2073o interfaceC2073o) {
            super(4);
            this.$headerHeightPx = f8;
            this.$stickyFrontLayer = z8;
            this.$gesturesEnabled = z9;
            this.$scaffoldState = backdropScaffoldState;
            this.$peekHeightPx = f9;
            this.$$dirty = i8;
            this.$frontLayerShape = shape;
            this.$frontLayerBackgroundColor = j8;
            this.$frontLayerContentColor = j9;
            this.$frontLayerElevation = f10;
            this.$$dirty1 = i9;
            this.$headerHeight = f11;
            this.$scope = m8;
            this.$peekHeight = f12;
            this.$frontLayerContent = interfaceC2072n;
            this.$frontLayerScrimColor = j10;
            this.$snackbarHost = interfaceC2073o;
        }

        @Override // c6.InterfaceC2074p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m1092invokejYbf7pk(((Constraints) obj).m5129unboximpl(), ((Number) obj2).floatValue(), (Composer) obj3, ((Number) obj4).intValue());
            return I.f8786a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        /* renamed from: invoke-jYbf7pk, reason: not valid java name */
        public final void m1092invokejYbf7pk(long j8, float f8, Composer composer, int i8) {
            int i9;
            Modifier modifier;
            float m5155constructorimpl;
            int i10;
            int i11;
            if ((i8 & 14) == 0) {
                if (composer.changed(j8)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i9 = i11 | i8;
            } else {
                i9 = i8;
            }
            if ((i8 & 112) == 0) {
                if (composer.changed(f8)) {
                    i10 = 32;
                } else {
                    i10 = 16;
                }
                i9 |= i10;
            }
            if ((i9 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1800047509, i8, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:302)");
            }
            float m5122getMaxHeightimpl = Constraints.m5122getMaxHeightimpl(j8);
            float f9 = m5122getMaxHeightimpl - this.$headerHeightPx;
            if (this.$stickyFrontLayer) {
                f9 = Math.min(f9, f8);
            }
            float f10 = f9;
            if (this.$gesturesEnabled) {
                modifier = NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, this.$scaffoldState.getNestedScrollConnection$material_release(), null, 2, null);
            } else {
                modifier = Modifier.Companion;
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier semantics$default = SemanticsModifierKt.semantics$default(SwipeableKt.m1341swipeablepPrIpRY$default(companion.then(modifier), this.$scaffoldState, Q.k(x.a(Float.valueOf(this.$peekHeightPx), BackdropValue.Concealed), x.a(Float.valueOf(f10), BackdropValue.Revealed)), Orientation.Vertical, this.$gesturesEnabled, false, null, null, null, 0.0f, 496, null), false, new BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1(this.$scaffoldState, this.$scope), 1, null);
            BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(backdropScaffoldState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BackdropScaffoldKt$BackdropScaffold$1$1$1$1(backdropScaffoldState);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier then = OffsetKt.offset(companion, (Function1) rememberedValue).then(semantics$default);
            Shape shape = this.$frontLayerShape;
            long j9 = this.$frontLayerBackgroundColor;
            long j10 = this.$frontLayerContentColor;
            float f11 = this.$frontLayerElevation;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1065299503, true, new AnonymousClass2(this.$peekHeight, this.$frontLayerContent, this.$$dirty, this.$frontLayerScrimColor, this.$scaffoldState, this.$$dirty1, this.$gesturesEnabled, this.$scope));
            int i12 = this.$$dirty1;
            SurfaceKt.m1330SurfaceFjzlyU(then, shape, j9, j10, null, f11, composableLambda, composer, ((i12 >> 3) & 112) | 1572864 | ((i12 >> 6) & 896) | ((i12 >> 6) & 7168) | ((i12 << 6) & 458752), 16);
            if (this.$scaffoldState.isRevealed() && f10 == m5122getMaxHeightimpl - this.$headerHeightPx) {
                m5155constructorimpl = this.$headerHeight;
            } else {
                m5155constructorimpl = Dp.m5155constructorimpl(0);
            }
            Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, m5155constructorimpl, 7, null);
            Alignment bottomCenter = Alignment.Companion.getBottomCenter();
            InterfaceC2073o interfaceC2073o = this.$snackbarHost;
            BackdropScaffoldState backdropScaffoldState2 = this.$scaffoldState;
            int i13 = this.$$dirty1;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer, 6);
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
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC2073o.invoke(backdropScaffoldState2.getSnackbarHostState(), composer, Integer.valueOf((i13 >> 18) & 112));
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
    public BackdropScaffoldKt$BackdropScaffold$1(Modifier modifier, InterfaceC2072n interfaceC2072n, Function1 function1, float f8, boolean z8, boolean z9, BackdropScaffoldState backdropScaffoldState, float f9, int i8, Shape shape, long j8, long j9, float f10, int i9, float f11, float f12, InterfaceC2072n interfaceC2072n2, long j10, InterfaceC2073o interfaceC2073o) {
        super(2);
        this.$modifier = modifier;
        this.$backLayer = interfaceC2072n;
        this.$calculateBackLayerConstraints = function1;
        this.$headerHeightPx = f8;
        this.$stickyFrontLayer = z8;
        this.$gesturesEnabled = z9;
        this.$scaffoldState = backdropScaffoldState;
        this.$peekHeightPx = f9;
        this.$$dirty = i8;
        this.$frontLayerShape = shape;
        this.$frontLayerBackgroundColor = j8;
        this.$frontLayerContentColor = j9;
        this.$frontLayerElevation = f10;
        this.$$dirty1 = i9;
        this.$headerHeight = f11;
        this.$peekHeight = f12;
        this.$frontLayerContent = interfaceC2072n2;
        this.$frontLayerScrimColor = j10;
        this.$snackbarHost = interfaceC2073o;
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
            ComposerKt.traceEventStart(-1049909631, i8, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:296)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(h.f10149a, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        BackdropScaffoldKt.BackdropStack(SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null), this.$backLayer, this.$calculateBackLayerConstraints, ComposableLambdaKt.composableLambda(composer, 1800047509, true, new AnonymousClass1(this.$headerHeightPx, this.$stickyFrontLayer, this.$gesturesEnabled, this.$scaffoldState, this.$peekHeightPx, this.$$dirty, this.$frontLayerShape, this.$frontLayerBackgroundColor, this.$frontLayerContentColor, this.$frontLayerElevation, this.$$dirty1, this.$headerHeight, coroutineScope, this.$peekHeight, this.$frontLayerContent, this.$frontLayerScrimColor, this.$snackbarHost)), composer, 3120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
