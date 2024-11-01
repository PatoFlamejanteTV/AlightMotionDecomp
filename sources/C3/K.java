package C3;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.PaymentOptionContract;

/* loaded from: classes4.dex */
public interface K {

    /* loaded from: classes4.dex */
    public interface a {
        a a(SavedStateHandle savedStateHandle);

        a b(Application application);

        K build();

        a c(PaymentOptionContract.a aVar);
    }

    com.stripe.android.paymentsheet.v a();
}
