package n2;

import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.view.InterfaceC2666o;
import com.stripe.android.view.InterfaceC2668p;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import k3.C3235a;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface q extends InterfaceC2666o {

    /* loaded from: classes4.dex */
    public static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2668p f35410a;

        /* renamed from: b, reason: collision with root package name */
        private final C3235a f35411b;

        public a(InterfaceC2668p host, C3235a defaultReturnUrl) {
            AbstractC3292y.i(host, "host");
            AbstractC3292y.i(defaultReturnUrl, "defaultReturnUrl");
            this.f35410a = host;
            this.f35411b = defaultReturnUrl;
        }

        @Override // com.stripe.android.view.InterfaceC2666o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PaymentBrowserAuthContract.a args) {
            Class cls;
            AbstractC3292y.i(args, "args");
            Bundle Q8 = PaymentBrowserAuthContract.a.b(args, null, 0, null, null, null, false, null, null, false, false, this.f35410a.a(), null, false, null, false, 31743, null).Q();
            if (!args.z(this.f35411b) && !args.I()) {
                cls = PaymentAuthWebViewActivity.class;
            } else {
                cls = StripeBrowserLauncherActivity.class;
            }
            this.f35410a.b(cls, Q8, args.p());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        private final ActivityResultLauncher f35412a;

        public b(ActivityResultLauncher launcher) {
            AbstractC3292y.i(launcher, "launcher");
            this.f35412a = launcher;
        }

        @Override // com.stripe.android.view.InterfaceC2666o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PaymentBrowserAuthContract.a args) {
            AbstractC3292y.i(args, "args");
            this.f35412a.launch(args);
        }
    }
}
