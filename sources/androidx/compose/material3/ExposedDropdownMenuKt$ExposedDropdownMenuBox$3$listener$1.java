package androidx.compose.material3;

import Q5.I;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Ref;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$listener$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$listener$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ MutableState<Integer> $menuHeight$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableState<Integer> mutableState) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$listener$1(View view, Ref<LayoutCoordinates> ref, int i8, MutableState<Integer> mutableState) {
        super(0);
        this.$view = view;
        this.$coordinates = ref;
        this.$verticalMarginInPx = i8;
        this.$menuHeight$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1606invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1606invoke() {
        View rootView = this.$view.getRootView();
        AbstractC3292y.h(rootView, "view.rootView");
        ExposedDropdownMenuKt.updateHeight(rootView, this.$coordinates.getValue(), this.$verticalMarginInPx, new AnonymousClass1(this.$menuHeight$delegate));
    }
}
