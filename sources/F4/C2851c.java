package f4;

import Y3.q;
import android.content.Context;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: f4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2851c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f31865a;

    public C2851c(Context context) {
        AbstractC3292y.i(context, "context");
        this.f31865a = context;
    }

    public final C2858j a(d4.b challengeResponseData, Y3.q uiCustomization) {
        boolean z8;
        AbstractC3292y.i(challengeResponseData, "challengeResponseData");
        AbstractC3292y.i(uiCustomization, "uiCustomization");
        if (challengeResponseData.b0() == d4.g.f31451e) {
            z8 = true;
        } else {
            z8 = false;
        }
        C2858j c2858j = new C2858j(this.f31865a, null, 0, z8, 6, null);
        c2858j.d(challengeResponseData.s(), uiCustomization.b());
        c2858j.c(challengeResponseData.v(), uiCustomization.a(q.a.SELECT));
        return c2858j;
    }

    public final C2859k b(d4.b challengeResponseData, Y3.q uiCustomization) {
        AbstractC3292y.i(challengeResponseData, "challengeResponseData");
        AbstractC3292y.i(uiCustomization, "uiCustomization");
        C2859k c2859k = new C2859k(this.f31865a, null, 0, 6, null);
        c2859k.setTextEntryLabel(challengeResponseData.s());
        c2859k.setTextBoxCustomization(uiCustomization.f());
        return c2859k;
    }

    public final com.stripe.android.stripe3ds2.views.e c(d4.b challengeResponseData) {
        AbstractC3292y.i(challengeResponseData, "challengeResponseData");
        com.stripe.android.stripe3ds2.views.e eVar = new com.stripe.android.stripe3ds2.views.e(this.f31865a, null, 0, 6, null);
        eVar.c(challengeResponseData.f());
        return eVar;
    }
}
