package f4;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.stripe.android.stripe3ds2.views.ChallengeProgressFragment;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: f4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2856h extends FragmentFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f31877a;

    /* renamed from: b, reason: collision with root package name */
    private final c4.q f31878b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f31879c;

    public C2856h(String directoryServerName, c4.q sdkTransactionId, Integer num) {
        AbstractC3292y.i(directoryServerName, "directoryServerName");
        AbstractC3292y.i(sdkTransactionId, "sdkTransactionId");
        this.f31877a = directoryServerName;
        this.f31878b = sdkTransactionId;
        this.f31879c = num;
    }

    @Override // androidx.fragment.app.FragmentFactory
    public Fragment instantiate(ClassLoader classLoader, String className) {
        AbstractC3292y.i(classLoader, "classLoader");
        AbstractC3292y.i(className, "className");
        if (AbstractC3292y.d(className, ChallengeProgressFragment.class.getName())) {
            return new ChallengeProgressFragment(this.f31877a, this.f31878b, this.f31879c);
        }
        Fragment instantiate = super.instantiate(classLoader, className);
        AbstractC3292y.f(instantiate);
        return instantiate;
    }
}
