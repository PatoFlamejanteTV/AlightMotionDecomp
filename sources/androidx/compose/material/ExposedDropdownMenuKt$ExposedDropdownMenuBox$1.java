package androidx.compose.material;

import Q5.I;
import android.view.View;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ MutableIntState $menuHeight$delegate;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;
    final /* synthetic */ MutableIntState $width$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ MutableIntState $menuHeight$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableIntState mutableIntState) {
            super(1);
            this.$menuHeight$delegate = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return I.f8786a;
        }

        public final void invoke(int i8) {
            this.$menuHeight$delegate.setIntValue(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$1(Ref<LayoutCoordinates> ref, View view, int i8, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        super(1);
        this.$coordinates = ref;
        this.$view = view;
        this.$verticalMarginInPx = i8;
        this.$width$delegate = mutableIntState;
        this.$menuHeight$delegate = mutableIntState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return I.f8786a;
    }

    public final void invoke(LayoutCoordinates it) {
        AbstractC3292y.i(it, "it");
        this.$width$delegate.setIntValue(IntSize.m5321getWidthimpl(it.mo4115getSizeYbymL2g()));
        this.$coordinates.setValue(it);
        View rootView = this.$view.getRootView();
        AbstractC3292y.h(rootView, "view.rootView");
        ExposedDropdownMenuKt.updateHeight(rootView, this.$coordinates.getValue(), this.$verticalMarginInPx, new AnonymousClass1(this.$menuHeight$delegate));
    }
}
