package K3;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
final class c implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.paymentdatacollection.polling.b f4597a;

    public c(com.stripe.android.paymentsheet.paymentdatacollection.polling.b viewModel) {
        AbstractC3292y.i(viewModel, "viewModel");
        this.f4597a = viewModel;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.b(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        AbstractC3292y.i(owner, "owner");
        androidx.lifecycle.c.e(this, owner);
        this.f4597a.r();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        AbstractC3292y.i(owner, "owner");
        this.f4597a.p();
        androidx.lifecycle.c.f(this, owner);
    }
}
