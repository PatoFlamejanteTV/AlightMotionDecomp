package v3;

import Q5.x;
import R5.Q;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.model.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import p3.i;
import u3.AbstractC4079c;

/* renamed from: v3.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4130j {

    /* renamed from: a, reason: collision with root package name */
    public static final C4130j f40490a = new C4130j();

    /* renamed from: b, reason: collision with root package name */
    public static final int f40491b = 8;

    private C4130j() {
    }

    public final InterfaceC4128h a() {
        return null;
    }

    public final void b(String externalPaymentMethodType, o.e eVar, Function1 onPaymentResult, ActivityResultLauncher activityResultLauncher, p3.i errorReporter) {
        AbstractC3292y.i(externalPaymentMethodType, "externalPaymentMethodType");
        AbstractC3292y.i(onPaymentResult, "onPaymentResult");
        AbstractC3292y.i(errorReporter, "errorReporter");
        i.b.a(errorReporter, i.d.f36216t, null, Q.e(x.a("external_payment_method_type", externalPaymentMethodType)), 2, null);
        onPaymentResult.invoke(new AbstractC4079c.d(new IllegalStateException("externalPaymentMethodConfirmHandler is null. Cannot process payment for payment selection: " + externalPaymentMethodType)));
    }

    public final void c(InterfaceC4128h interfaceC4128h) {
    }
}
