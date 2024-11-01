package s3;

import android.app.Application;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class G {
    public final c4.n a(Application application, Stripe3ds2TransactionContract.a args, U5.g workContext) {
        AbstractC3292y.i(application, "application");
        AbstractC3292y.i(args, "args");
        AbstractC3292y.i(workContext, "workContext");
        return new com.stripe.android.stripe3ds2.transaction.l(application, args.v().c(), args.s(), args.a().f().a(), args.f().a().i(), args.b(), workContext).a();
    }
}
