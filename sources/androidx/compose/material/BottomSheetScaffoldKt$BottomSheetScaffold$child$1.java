package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$child$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ int $$dirty2;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ InterfaceC2072n $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ InterfaceC2073o $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ InterfaceC2073o $snackbarHost;
    final /* synthetic */ InterfaceC2072n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2073o {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ float $peekHeightPx;
        final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
        final /* synthetic */ long $sheetBackgroundColor;
        final /* synthetic */ InterfaceC2073o $sheetContent;
        final /* synthetic */ long $sheetContentColor;
        final /* synthetic */ float $sheetElevation;
        final /* synthetic */ boolean $sheetGesturesEnabled;
        final /* synthetic */ float $sheetPeekHeight;
        final /* synthetic */ Shape $sheetShape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z8, BottomSheetScaffoldState bottomSheetScaffoldState, float f8, float f9, Shape shape, float f10, long j8, long j9, InterfaceC2073o interfaceC2073o, int i8, int i9) {
            super(3);
            this.$sheetGesturesEnabled = z8;
            this.$scaffoldState = bottomSheetScaffoldState;
            this.$sheetPeekHeight = f8;
            this.$peekHeightPx = f9;
            this.$sheetShape = shape;
            this.$sheetElevation = f10;
            this.$sheetBackgroundColor = j8;
            this.$sheetContentColor = j9;
            this.$sheetContent = interfaceC2073o;
            this.$$dirty = i8;
            this.$$dirty1 = i9;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).intValue(), (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(int i8, Composer composer, int i9) {
            int i10;
            Modifier modifier;
            if ((i9 & 14) == 0) {
                i10 = i9 | (composer.changed(i8) ? 4 : 2);
            } else {
                i10 = i9;
            }
            if ((i10 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1378534681, i10, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:452)");
            }
            composer.startReplaceableGroup(-816851374);
            if (this.$sheetGesturesEnabled) {
                Modifier.Companion companion = Modifier.Companion;
                AnchoredDraggableState<BottomSheetValue> anchoredDraggableState$material_release = this.$scaffoldState.getBottomSheetState().getAnchoredDraggableState$material_release();
                BottomSheetScaffoldState bottomSheetScaffoldState = this.$scaffoldState;
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(anchoredDraggableState$material_release);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = BottomSheetScaffoldKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(bottomSheetScaffoldState.getBottomSheetState().getAnchoredDraggableState$material_release(), Orientation.Vertical);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                modifier = NestedScrollModifierKt.nestedScroll$default(companion, (NestedScrollConnection) rememberedValue, null, 2, null);
            } else {
                modifier = Modifier.Companion;
            }
            composer.endReplaceableGroup();
            BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
            Modifier m615requiredHeightInVpY3zN4$default = SizeKt.m615requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), this.$sheetPeekHeight, 0.0f, 2, null);
            boolean z8 = this.$sheetGesturesEnabled;
            Integer valueOf = Integer.valueOf(i8);
            Float valueOf2 = Float.valueOf(this.$peekHeightPx);
            float f8 = this.$peekHeightPx;
            composer.startReplaceableGroup(511388516);
            boolean changed2 = composer.changed(valueOf) | composer.changed(valueOf2);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1(i8, f8);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            Function1 function1 = (Function1) rememberedValue2;
            Shape shape = this.$sheetShape;
            float f9 = this.$sheetElevation;
            long j8 = this.$sheetBackgroundColor;
            long j9 = this.$sheetContentColor;
            InterfaceC2073o interfaceC2073o = this.$sheetContent;
            int i11 = this.$$dirty;
            int i12 = this.$$dirty1;
            BottomSheetScaffoldKt.m1110BottomSheet0cLKjW4(bottomSheetState, z8, function1, shape, f9, j8, j9, m615requiredHeightInVpY3zN4$default, interfaceC2073o, composer, ((i11 >> 18) & 112) | ((i11 >> 15) & 7168) | ((i11 >> 15) & 57344) | ((i12 << 15) & 458752) | ((i12 << 15) & 3670016) | ((i11 << 24) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
        final /* synthetic */ InterfaceC2073o $snackbarHost;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC2073o interfaceC2073o, BottomSheetScaffoldState bottomSheetScaffoldState, int i8) {
            super(2);
            this.$snackbarHost = interfaceC2073o;
            this.$scaffoldState = bottomSheetScaffoldState;
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
                ComposerKt.traceEventStart(-486138068, i8, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:490)");
            }
            this.$snackbarHost.invoke(this.$scaffoldState.getSnackbarHostState(), composer, Integer.valueOf((this.$$dirty >> 9) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$child$1(BottomSheetScaffoldState bottomSheetScaffoldState, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n2, float f8, int i8, int i9, int i10, int i11, boolean z8, float f9, Shape shape, float f10, long j8, long j9, InterfaceC2073o interfaceC2073o2, InterfaceC2073o interfaceC2073o3) {
        super(2);
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$topBar = interfaceC2072n;
        this.$content = interfaceC2073o;
        this.$floatingActionButton = interfaceC2072n2;
        this.$sheetPeekHeight = f8;
        this.$floatingActionButtonPosition = i8;
        this.$$dirty = i9;
        this.$$dirty2 = i10;
        this.$$dirty1 = i11;
        this.$sheetGesturesEnabled = z8;
        this.$peekHeightPx = f9;
        this.$sheetShape = shape;
        this.$sheetElevation = f10;
        this.$sheetBackgroundColor = j8;
        this.$sheetContentColor = j9;
        this.$sheetContent = interfaceC2073o2;
        this.$snackbarHost = interfaceC2073o3;
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
            ComposerKt.traceEventStart(893101063, i8, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:448)");
        }
        BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
        InterfaceC2072n interfaceC2072n = this.$topBar;
        InterfaceC2073o interfaceC2073o = this.$content;
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1378534681, true, new AnonymousClass1(this.$sheetGesturesEnabled, this.$scaffoldState, this.$sheetPeekHeight, this.$peekHeightPx, this.$sheetShape, this.$sheetElevation, this.$sheetBackgroundColor, this.$sheetContentColor, this.$sheetContent, this.$$dirty, this.$$dirty1));
        InterfaceC2072n interfaceC2072n2 = this.$floatingActionButton;
        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer, -486138068, true, new AnonymousClass2(this.$snackbarHost, this.$scaffoldState, this.$$dirty));
        float f8 = this.$sheetPeekHeight;
        int i9 = this.$floatingActionButtonPosition;
        BottomSheetScaffoldState bottomSheetScaffoldState = this.$scaffoldState;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(bottomSheetScaffoldState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffold$child$1$3$1(bottomSheetScaffoldState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        int i10 = this.$$dirty;
        BottomSheetScaffoldKt.m1112BottomSheetScaffoldLayoutKCBPh4w(interfaceC2072n, interfaceC2073o, composableLambda, interfaceC2072n2, composableLambda2, f8, i9, (Function0) rememberedValue, bottomSheetState, composer, ((i10 >> 9) & 14) | 24960 | ((this.$$dirty2 >> 3) & 112) | ((i10 >> 6) & 7168) | ((this.$$dirty1 << 9) & 458752) | (i10 & 3670016));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
