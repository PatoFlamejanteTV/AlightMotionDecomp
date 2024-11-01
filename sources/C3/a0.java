package C3;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes4.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f797a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final EventReporter.Mode a() {
            return EventReporter.Mode.f27032b;
        }

        public final boolean b() {
            return false;
        }

        public final Set c() {
            return R5.a0.d("PaymentSheet");
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }
}
