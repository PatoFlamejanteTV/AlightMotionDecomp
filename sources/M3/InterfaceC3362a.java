package m3;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import q6.v;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3362a {

    /* renamed from: m3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0803a {
        InterfaceC0803a a(SavedStateHandle savedStateHandle);

        InterfaceC0803a b(Application application);

        InterfaceC3362a build();

        InterfaceC0803a c(CollectBankAccountContract.a aVar);

        InterfaceC0803a d(v vVar);
    }

    com.stripe.android.payments.bankaccount.ui.b a();
}
