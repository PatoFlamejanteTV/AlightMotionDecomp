package androidx.compose.ui.viewinterop;

import Q5.I;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidViewBindingKt$AndroidViewBinding$8$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $update;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewBindingKt$AndroidViewBinding$8$1(Function1 function1) {
        super(1);
        this.$update = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return I.f8786a;
    }

    public final void invoke(View view) {
        ViewBinding binding;
        Function1 function1 = this.$update;
        binding = AndroidViewBindingKt.getBinding(view);
        function1.invoke(binding);
    }
}
