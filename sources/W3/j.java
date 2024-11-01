package w3;

import Q5.I;
import android.content.Context;
import c3.C2028h;
import com.stripe.android.paymentsheet.w;
import d3.InterfaceC2756h;
import h4.InterfaceC2949a;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import p2.C3568j;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f40746a = new j();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40747a = new a();

        a() {
            super(1);
        }

        public final void a(Y2.e it) {
            AbstractC3292y.i(it, "it");
            throw new IllegalStateException("`InlineSignUpViewState` updates should not be received by `FormController`!");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Y2.e) obj);
            return I.f8786a;
        }
    }

    private j() {
    }

    public final C2028h a(Context context, String merchantName, Map initialValues, Map map) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(merchantName, "merchantName");
        AbstractC3292y.i(initialValues, "initialValues");
        Context applicationContext = context.getApplicationContext();
        AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
        return new C2028h(new InterfaceC2756h.a(new C3568j(applicationContext), null, initialValues, map, false, merchantName, InterfaceC2949a.c.f32646a, new w.d(null, null, null, null, false, 31, null), false, a.f40747a));
    }
}
