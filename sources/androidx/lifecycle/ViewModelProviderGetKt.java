package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.U;

/* loaded from: classes3.dex */
public final class ViewModelProviderGetKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> VM get(ViewModelProvider viewModelProvider) {
        AbstractC3292y.i(viewModelProvider, "<this>");
        AbstractC3292y.n(4, "VM");
        return (VM) viewModelProvider.get(U.b(ViewModel.class));
    }
}
