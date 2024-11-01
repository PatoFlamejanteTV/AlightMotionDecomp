package androidx.compose.material;

import Q5.I;
import Q5.t;
import R5.Q;
import U5.d;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import e6.AbstractC2829a;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheetLayout$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> $anchorChangeCallback;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ M $scope;
    final /* synthetic */ long $scrimColor;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ InterfaceC2073o $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ ModalBottomSheetState $sheetState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends AbstractC3293z implements Function1 {
        final /* synthetic */ ModalBottomSheetState $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ModalBottomSheetState modalBottomSheetState) {
            super(1);
            this.$sheetState = modalBottomSheetState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return IntOffset.m5270boximpl(m1259invokeBjo55l4((Density) obj));
        }

        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m1259invokeBjo55l4(Density offset) {
            AbstractC3292y.i(offset, "$this$offset");
            return IntOffsetKt.IntOffset(0, AbstractC2829a.d(this.$sheetState.getAnchoredDraggableState$material_release().requireOffset()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends AbstractC3293z implements Function1 {
        final /* synthetic */ AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> $anchorChangeCallback;
        final /* synthetic */ float $fullHeight;
        final /* synthetic */ ModalBottomSheetState $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(ModalBottomSheetState modalBottomSheetState, AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback, float f8) {
            super(1);
            this.$sheetState = modalBottomSheetState;
            this.$anchorChangeCallback = anchorChangedCallback;
            this.$fullHeight = f8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1260invokeozmzZPI(((IntSize) obj).m5325unboximpl());
            return I.f8786a;
        }

        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final void m1260invokeozmzZPI(long j8) {
            float f8 = this.$fullHeight;
            ModalBottomSheetState modalBottomSheetState = this.$sheetState;
            Map c8 = Q.c();
            c8.put(ModalBottomSheetValue.Hidden, Float.valueOf(f8));
            float f9 = f8 / 2.0f;
            if (!modalBottomSheetState.isSkipHalfExpanded$material_release() && IntSize.m5320getHeightimpl(j8) > f9) {
                c8.put(ModalBottomSheetValue.HalfExpanded, Float.valueOf(f9));
            }
            if (IntSize.m5320getHeightimpl(j8) != 0) {
                c8.put(ModalBottomSheetValue.Expanded, Float.valueOf(Math.max(0.0f, f8 - IntSize.m5320getHeightimpl(j8))));
            }
            this.$sheetState.getAnchoredDraggableState$material_release().updateAnchors$material_release(Q.b(c8), this.$anchorChangeCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends AbstractC3293z implements Function1 {
        final /* synthetic */ M $scope;
        final /* synthetic */ ModalBottomSheetState $sheetState;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
            final /* synthetic */ M $scope;
            final /* synthetic */ ModalBottomSheetState $sheetState;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1", f = "ModalBottomSheet.kt", l = {653}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C03291 extends l implements InterfaceC2072n {
                final /* synthetic */ ModalBottomSheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C03291(ModalBottomSheetState modalBottomSheetState, d dVar) {
                    super(2, dVar);
                    this.$sheetState = modalBottomSheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d create(Object obj, d dVar) {
                    return new C03291(this.$sheetState, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.label;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                        this.label = 1;
                        if (modalBottomSheetState.hide(this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, d dVar) {
                    return ((C03291) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ModalBottomSheetState modalBottomSheetState, M m8) {
                super(0);
                this.$sheetState = modalBottomSheetState;
                this.$scope = m8;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                if (((Boolean) this.$sheetState.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden)).booleanValue()) {
                    AbstractC3462k.d(this.$scope, null, null, new C03291(this.$sheetState, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends AbstractC3293z implements Function0 {
            final /* synthetic */ M $scope;
            final /* synthetic */ ModalBottomSheetState $sheetState;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1", f = "ModalBottomSheet.kt", l = {665}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass1 extends l implements InterfaceC2072n {
                final /* synthetic */ ModalBottomSheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ModalBottomSheetState modalBottomSheetState, d dVar) {
                    super(2, dVar);
                    this.$sheetState = modalBottomSheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d create(Object obj, d dVar) {
                    return new AnonymousClass1(this.$sheetState, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.label;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                        this.label = 1;
                        if (modalBottomSheetState.expand$material_release(this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, d dVar) {
                    return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ModalBottomSheetState modalBottomSheetState, M m8) {
                super(0);
                this.$sheetState = modalBottomSheetState;
                this.$scope = m8;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                if (((Boolean) this.$sheetState.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded)).booleanValue()) {
                    AbstractC3462k.d(this.$scope, null, null, new AnonymousClass1(this.$sheetState, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends AbstractC3293z implements Function0 {
            final /* synthetic */ M $scope;
            final /* synthetic */ ModalBottomSheetState $sheetState;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1", f = "ModalBottomSheet.kt", l = {675}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass1 extends l implements InterfaceC2072n {
                final /* synthetic */ ModalBottomSheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ModalBottomSheetState modalBottomSheetState, d dVar) {
                    super(2, dVar);
                    this.$sheetState = modalBottomSheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d create(Object obj, d dVar) {
                    return new AnonymousClass1(this.$sheetState, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.label;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                        this.label = 1;
                        if (modalBottomSheetState.halfExpand$material_release(this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, d dVar) {
                    return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ModalBottomSheetState modalBottomSheetState, M m8) {
                super(0);
                this.$sheetState = modalBottomSheetState;
                this.$scope = m8;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                if (((Boolean) this.$sheetState.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded)).booleanValue()) {
                    AbstractC3462k.d(this.$scope, null, null, new AnonymousClass1(this.$sheetState, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(ModalBottomSheetState modalBottomSheetState, M m8) {
            super(1);
            this.$sheetState = modalBottomSheetState;
            this.$scope = m8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            if (this.$sheetState.isVisible()) {
                SemanticsPropertiesKt.dismiss$default(semantics, null, new AnonymousClass1(this.$sheetState, this.$scope), 1, null);
                if (this.$sheetState.getAnchoredDraggableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                    SemanticsPropertiesKt.expand$default(semantics, null, new AnonymousClass2(this.$sheetState, this.$scope), 1, null);
                } else if (this.$sheetState.getHasHalfExpandedState$material_release()) {
                    SemanticsPropertiesKt.collapse$default(semantics, null, new AnonymousClass3(this.$sheetState, this.$scope), 1, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ InterfaceC2073o $sheetContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(InterfaceC2073o interfaceC2073o, int i8) {
            super(2);
            this.$sheetContent = interfaceC2073o;
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
                ComposerKt.traceEventStart(1552994302, i8, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:687)");
            }
            InterfaceC2073o interfaceC2073o = this.$sheetContent;
            int i9 = (this.$$dirty << 9) & 7168;
            composer.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            interfaceC2073o.invoke(ColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i9 >> 6) & 112) | 6));
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
    public ModalBottomSheetKt$ModalBottomSheetLayout$2(boolean z8, ModalBottomSheetState modalBottomSheetState, Orientation orientation, Shape shape, long j8, long j9, float f8, int i8, InterfaceC2072n interfaceC2072n, long j10, M m8, AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback, InterfaceC2073o interfaceC2073o) {
        super(3);
        this.$sheetGesturesEnabled = z8;
        this.$sheetState = modalBottomSheetState;
        this.$orientation = orientation;
        this.$sheetShape = shape;
        this.$sheetBackgroundColor = j8;
        this.$sheetContentColor = j9;
        this.$sheetElevation = f8;
        this.$$dirty = i8;
        this.$content = interfaceC2072n;
        this.$scrimColor = j10;
        this.$scope = m8;
        this.$anchorChangeCallback = anchorChangedCallback;
        this.$sheetContent = interfaceC2073o;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
        int i9;
        float f8;
        Modifier modifier;
        AbstractC3292y.i(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i8 & 14) == 0) {
            i9 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1731958854, i8, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:586)");
        }
        float m5122getMaxHeightimpl = Constraints.m5122getMaxHeightimpl(BoxWithConstraints.mo515getConstraintsmsEJaDk());
        Modifier modifier2 = Modifier.Companion;
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
        InterfaceC2072n interfaceC2072n = this.$content;
        int i10 = this.$$dirty;
        long j8 = this.$scrimColor;
        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
        M m8 = this.$scope;
        composer.startReplaceableGroup(733328855);
        Alignment.Companion companion = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
        interfaceC2072n.invoke(composer, Integer.valueOf((i10 >> 27) & 14));
        ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1 modalBottomSheetKt$ModalBottomSheetLayout$2$1$1 = new ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1(modalBottomSheetState, m8);
        ModalBottomSheetValue targetValue = modalBottomSheetState.getAnchoredDraggableState$material_release().getTargetValue();
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
        ModalBottomSheetKt.m1255Scrim3JVO9M(j8, modalBottomSheetKt$ModalBottomSheetLayout$2$1$1, targetValue != modalBottomSheetValue, composer, (i10 >> 24) & 14);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        Modifier align = BoxWithConstraints.align(modifier2, companion.getTopCenter());
        f8 = ModalBottomSheetKt.MaxModalBottomSheetWidth;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m631widthInVpY3zN4$default(align, 0.0f, f8, 1, null), 0.0f, 1, null);
        composer.startReplaceableGroup(1241536180);
        if (this.$sheetGesturesEnabled) {
            Object anchoredDraggableState$material_release = this.$sheetState.getAnchoredDraggableState$material_release();
            Orientation orientation = this.$orientation;
            ModalBottomSheetState modalBottomSheetState2 = this.$sheetState;
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(anchoredDraggableState$material_release) | composer.changed(orientation);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState2.getAnchoredDraggableState$material_release(), orientation);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            modifier = NestedScrollModifierKt.nestedScroll$default(modifier2, (NestedScrollConnection) rememberedValue, null, 2, null);
        } else {
            modifier = modifier2;
        }
        composer.endReplaceableGroup();
        Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(AnchoredDraggableKt.anchoredDraggable$default(OffsetKt.offset(fillMaxWidth$default.then(modifier), new AnonymousClass3(this.$sheetState)), this.$sheetState.getAnchoredDraggableState$material_release(), this.$orientation, this.$sheetGesturesEnabled && this.$sheetState.getAnchoredDraggableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null), new AnonymousClass4(this.$sheetState, this.$anchorChangeCallback, m5122getMaxHeightimpl));
        if (this.$sheetGesturesEnabled) {
            modifier2 = SemanticsModifierKt.semantics$default(modifier2, false, new AnonymousClass5(this.$sheetState, this.$scope), 1, null);
        }
        Modifier then = onSizeChanged.then(modifier2);
        Shape shape = this.$sheetShape;
        long j9 = this.$sheetBackgroundColor;
        long j10 = this.$sheetContentColor;
        float f9 = this.$sheetElevation;
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1552994302, true, new AnonymousClass6(this.$sheetContent, this.$$dirty));
        int i11 = this.$$dirty;
        SurfaceKt.m1330SurfaceFjzlyU(then, shape, j9, j10, null, f9, composableLambda, composer, ((i11 >> 9) & 112) | 1572864 | ((i11 >> 12) & 896) | ((i11 >> 12) & 7168) | (i11 & 458752), 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
