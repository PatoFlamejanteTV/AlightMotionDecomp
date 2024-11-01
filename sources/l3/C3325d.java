package l3;

import Q5.q;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l3.C3325d;

/* renamed from: l3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3325d implements InterfaceC3326e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f34666d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f34667e = 8;

    /* renamed from: b, reason: collision with root package name */
    private final ActivityResultLauncher f34668b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34669c;

    /* renamed from: l3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Function1 callback, com.stripe.android.payments.bankaccount.navigation.d dVar) {
            AbstractC3292y.i(callback, "$callback");
            AbstractC3292y.f(dVar);
            callback.invoke(com.stripe.android.payments.bankaccount.navigation.b.a(dVar));
        }

        public final InterfaceC3326e b(String hostedSurface, ActivityResultRegistryOwner activityResultRegistryOwner, final Function1 callback) {
            AbstractC3292y.i(hostedSurface, "hostedSurface");
            AbstractC3292y.i(activityResultRegistryOwner, "activityResultRegistryOwner");
            AbstractC3292y.i(callback, "callback");
            ActivityResultLauncher register = activityResultRegistryOwner.getActivityResultRegistry().register("CollectBankAccountForInstantDebitsLauncher", new CollectBankAccountContract(), new ActivityResultCallback() { // from class: l3.c
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    C3325d.a.c(Function1.this, (com.stripe.android.payments.bankaccount.navigation.d) obj);
                }
            });
            AbstractC3292y.f(register);
            return new C3325d(register, hostedSurface);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C3325d(ActivityResultLauncher hostActivityLauncher, String str) {
        AbstractC3292y.i(hostActivityLauncher, "hostActivityLauncher");
        this.f34668b = hostActivityLauncher;
        this.f34669c = str;
    }

    @Override // l3.InterfaceC3326e
    public void a(String publishableKey, String str, String clientSecret, InterfaceC3322a configuration) {
        AbstractC3292y.i(publishableKey, "publishableKey");
        AbstractC3292y.i(clientSecret, "clientSecret");
        AbstractC3292y.i(configuration, "configuration");
        this.f34668b.launch(new CollectBankAccountContract.a.e(publishableKey, str, clientSecret, configuration, true, this.f34669c));
    }

    @Override // l3.InterfaceC3326e
    public void b(String publishableKey, String str, InterfaceC3322a configuration, String elementsSessionId, String str2, String str3) {
        AbstractC3292y.i(publishableKey, "publishableKey");
        AbstractC3292y.i(configuration, "configuration");
        AbstractC3292y.i(elementsSessionId, "elementsSessionId");
        throw new q("An operation is not implemented: Instant Debits do not support deferred payments yet");
    }

    @Override // l3.InterfaceC3326e
    public void c(String publishableKey, String str, InterfaceC3322a configuration, String elementsSessionId, String str2, String str3, Integer num, String str4) {
        AbstractC3292y.i(publishableKey, "publishableKey");
        AbstractC3292y.i(configuration, "configuration");
        AbstractC3292y.i(elementsSessionId, "elementsSessionId");
        throw new q("An operation is not implemented: Instant Debits do not support deferred payments yet");
    }

    @Override // l3.InterfaceC3326e
    public void d(String publishableKey, String str, String clientSecret, InterfaceC3322a configuration) {
        AbstractC3292y.i(publishableKey, "publishableKey");
        AbstractC3292y.i(clientSecret, "clientSecret");
        AbstractC3292y.i(configuration, "configuration");
        this.f34668b.launch(new CollectBankAccountContract.a.d(publishableKey, str, clientSecret, configuration, true, this.f34669c));
    }

    @Override // l3.InterfaceC3326e
    public void unregister() {
        this.f34668b.unregister();
    }
}
