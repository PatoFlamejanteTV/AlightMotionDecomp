package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Ref;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$3(View view, Ref<LayoutCoordinates> ref, int i8, MutableState<Integer> mutableState) {
        super(1);
        this.$view = view;
        this.$coordinates = ref;
        this.$verticalMarginInPx = i8;
        this.$menuHeight$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        AbstractC3292y.i(DisposableEffect, "$this$DisposableEffect");
        View view = this.$view;
        final OnGlobalLayoutListener onGlobalLayoutListener = new OnGlobalLayoutListener(view, new ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$listener$1(view, this.$coordinates, this.$verticalMarginInPx, this.$menuHeight$delegate));
        return new DisposableEffectResult() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                OnGlobalLayoutListener.this.dispose();
            }
        };
    }
}
