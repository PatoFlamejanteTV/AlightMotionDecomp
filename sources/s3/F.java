package s3;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;

/* loaded from: classes4.dex */
public interface F {

    /* loaded from: classes4.dex */
    public interface a {
        a a(SavedStateHandle savedStateHandle);

        a b(Application application);

        F build();

        a c(Stripe3ds2TransactionContract.a aVar);
    }

    com.stripe.android.payments.core.authentication.threeds2.d a();
}
