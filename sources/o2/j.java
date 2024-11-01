package O2;

import com.stripe.android.googlepaylauncher.j;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import r0.C3875m;

/* loaded from: classes4.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7139a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final C3875m a(j.d googlePayConfig, N2.g paymentsClientFactory) {
            AbstractC3292y.i(googlePayConfig, "googlePayConfig");
            AbstractC3292y.i(paymentsClientFactory, "paymentsClientFactory");
            return paymentsClientFactory.a(googlePayConfig.f());
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }
}
