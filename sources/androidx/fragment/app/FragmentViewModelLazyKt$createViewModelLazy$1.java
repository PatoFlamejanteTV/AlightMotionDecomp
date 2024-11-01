package androidx.fragment.app;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt$createViewModelLazy$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Fragment $this_createViewModelLazy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$createViewModelLazy$1(Fragment fragment) {
        super(0);
        this.$this_createViewModelLazy = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CreationExtras invoke() {
        CreationExtras defaultViewModelCreationExtras = this.$this_createViewModelLazy.getDefaultViewModelCreationExtras();
        AbstractC3292y.h(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
        return defaultViewModelCreationExtras;
    }
}
