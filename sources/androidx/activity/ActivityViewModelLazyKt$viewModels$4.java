package androidx.activity;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt$viewModels$4 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Function0 $extrasProducer;
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityViewModelLazyKt$viewModels$4(Function0 function0, ComponentActivity componentActivity) {
        super(0);
        this.$extrasProducer = function0;
        this.$this_viewModels = componentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CreationExtras invoke() {
        CreationExtras creationExtras;
        Function0 function0 = this.$extrasProducer;
        return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras;
    }
}
