package androidx.compose.material3;

import Q5.I;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.IntSize;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
    final /* synthetic */ Function1 $onExpandedChange;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;
    final /* synthetic */ MutableState<Integer> $width$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
        final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
        final /* synthetic */ int $verticalMarginInPx;
        final /* synthetic */ View $view;
        final /* synthetic */ MutableState<Integer> $width$delegate;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03411 extends AbstractC3293z implements Function1 {
            final /* synthetic */ MutableState<Integer> $menuHeight$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03411(MutableState<Integer> mutableState) {
                super(1);
                this.$menuHeight$delegate = mutableState;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return I.f8786a;
            }

            public final void invoke(int i8) {
                ExposedDropdownMenuKt.m1600ExposedDropdownMenuBox$lambda5(this.$menuHeight$delegate, i8);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref<LayoutCoordinates> ref, View view, int i8, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
            super(1);
            this.$coordinates = ref;
            this.$view = view;
            this.$verticalMarginInPx = i8;
            this.$width$delegate = mutableState;
            this.$menuHeight$delegate = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutCoordinates) obj);
            return I.f8786a;
        }

        public final void invoke(LayoutCoordinates it) {
            AbstractC3292y.i(it, "it");
            ExposedDropdownMenuKt.m1598ExposedDropdownMenuBox$lambda2(this.$width$delegate, IntSize.m5321getWidthimpl(it.mo4115getSizeYbymL2g()));
            this.$coordinates.setValue(it);
            View rootView = this.$view.getRootView();
            AbstractC3292y.h(rootView, "view.rootView");
            ExposedDropdownMenuKt.updateHeight(rootView, this.$coordinates.getValue(), this.$verticalMarginInPx, new C03411(this.$menuHeight$delegate));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2(boolean z8, Function1 function1, int i8, FocusRequester focusRequester, Ref<LayoutCoordinates> ref, View view, int i9, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
        super(3);
        this.$expanded = z8;
        this.$onExpandedChange = function1;
        this.$$dirty = i8;
        this.$focusRequester = focusRequester;
        this.$coordinates = ref;
        this.$view = view;
        this.$verticalMarginInPx = i9;
        this.$width$delegate = mutableState;
        this.$menuHeight$delegate = mutableState2;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        Modifier expandable;
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(1714866713);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1714866713, i8, -1, "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:120)");
        }
        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(composed, new AnonymousClass1(this.$coordinates, this.$view, this.$verticalMarginInPx, this.$width$delegate, this.$menuHeight$delegate));
        boolean z8 = this.$expanded;
        Function1 function1 = this.$onExpandedChange;
        Boolean valueOf = Boolean.valueOf(z8);
        Function1 function12 = this.$onExpandedChange;
        boolean z9 = this.$expanded;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(function1) | composer.changed(valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1(function12, z9);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        expandable = ExposedDropdownMenuKt.expandable(onGloballyPositioned, z8, (Function0) rememberedValue, null, null, null, composer, (this.$$dirty << 3) & 112, 28);
        Modifier focusRequester = FocusRequesterModifierKt.focusRequester(expandable, this.$focusRequester);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return focusRequester;
    }
}
