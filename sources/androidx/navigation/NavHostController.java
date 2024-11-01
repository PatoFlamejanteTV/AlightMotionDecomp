package androidx.navigation;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public class NavHostController extends NavController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostController(Context context) {
        super(context);
        AbstractC3292y.i(context, "context");
    }

    @Override // androidx.navigation.NavController
    public final void enableOnBackPressed(boolean z8) {
        super.enableOnBackPressed(z8);
    }

    @Override // androidx.navigation.NavController
    public final void setLifecycleOwner(LifecycleOwner owner) {
        AbstractC3292y.i(owner, "owner");
        super.setLifecycleOwner(owner);
    }

    @Override // androidx.navigation.NavController
    public final void setOnBackPressedDispatcher(OnBackPressedDispatcher dispatcher) {
        AbstractC3292y.i(dispatcher, "dispatcher");
        super.setOnBackPressedDispatcher(dispatcher);
    }

    @Override // androidx.navigation.NavController
    public final void setViewModelStore(ViewModelStore viewModelStore) {
        AbstractC3292y.i(viewModelStore, "viewModelStore");
        super.setViewModelStore(viewModelStore);
    }
}
