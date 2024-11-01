package l3;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: l3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3323b implements InterfaceC3326e {

    /* renamed from: b, reason: collision with root package name */
    private final ActivityResultLauncher f34663b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34664c;

    public C3323b(ActivityResultLauncher hostActivityLauncher, String str) {
        AbstractC3292y.i(hostActivityLauncher, "hostActivityLauncher");
        this.f34663b = hostActivityLauncher;
        this.f34664c = str;
    }

    @Override // l3.InterfaceC3326e
    public void a(String publishableKey, String str, String clientSecret, InterfaceC3322a configuration) {
        AbstractC3292y.i(publishableKey, "publishableKey");
        AbstractC3292y.i(clientSecret, "clientSecret");
        AbstractC3292y.i(configuration, "configuration");
        this.f34663b.launch(new CollectBankAccountContract.a.e(publishableKey, str, clientSecret, configuration, true, this.f34664c));
    }

    @Override // l3.InterfaceC3326e
    public void b(String publishableKey, String str, InterfaceC3322a configuration, String elementsSessionId, String str2, String str3) {
        AbstractC3292y.i(publishableKey, "publishableKey");
        AbstractC3292y.i(configuration, "configuration");
        AbstractC3292y.i(elementsSessionId, "elementsSessionId");
        this.f34663b.launch(new CollectBankAccountContract.a.c(publishableKey, str, configuration, this.f34664c, elementsSessionId, str2, str3));
    }

    @Override // l3.InterfaceC3326e
    public void c(String publishableKey, String str, InterfaceC3322a configuration, String elementsSessionId, String str2, String str3, Integer num, String str4) {
        AbstractC3292y.i(publishableKey, "publishableKey");
        AbstractC3292y.i(configuration, "configuration");
        AbstractC3292y.i(elementsSessionId, "elementsSessionId");
        this.f34663b.launch(new CollectBankAccountContract.a.b(publishableKey, str, configuration, this.f34664c, elementsSessionId, str2, str3, num, str4));
    }

    @Override // l3.InterfaceC3326e
    public void d(String publishableKey, String str, String clientSecret, InterfaceC3322a configuration) {
        AbstractC3292y.i(publishableKey, "publishableKey");
        AbstractC3292y.i(clientSecret, "clientSecret");
        AbstractC3292y.i(configuration, "configuration");
        this.f34663b.launch(new CollectBankAccountContract.a.d(publishableKey, str, clientSecret, configuration, true, this.f34664c));
    }

    @Override // l3.InterfaceC3326e
    public void unregister() {
        this.f34663b.unregister();
    }
}
