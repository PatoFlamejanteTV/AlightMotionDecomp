package s3;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import q3.C3632a;

/* loaded from: classes4.dex */
public interface n {

    /* loaded from: classes4.dex */
    public interface a {
        a a(Context context);

        a b(Set set);

        n build();

        a c(Function0 function0);

        a d(boolean z8);

        a e(boolean z8);

        a f(U5.g gVar);

        a g(Map map);

        a h(U5.g gVar);

        a i(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

        a j(boolean z8);
    }

    C3632a a();
}
