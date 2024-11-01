package O2;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;

/* loaded from: classes4.dex */
public interface m {

    /* loaded from: classes4.dex */
    public interface a {
        a a(SavedStateHandle savedStateHandle);

        a b(GooglePayPaymentMethodLauncherContractV2.a aVar);

        m build();
    }

    com.stripe.android.googlepaylauncher.l a();
}
