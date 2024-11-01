package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import B2.j;
import Q5.I;
import U5.d;
import android.content.Context;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import com.stripe.android.view.InterfaceC2668p;
import kotlin.jvm.internal.AbstractC3292y;
import p3.i;
import q3.AbstractC3637f;
import v3.w;

/* loaded from: classes4.dex */
public final class a extends AbstractC3637f {

    /* renamed from: a, reason: collision with root package name */
    private ActivityResultLauncher f27593a;

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0642a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27594a;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f25763q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f25732B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27594a = iArr;
        }
    }

    @Override // q3.AbstractC3637f, o3.InterfaceC3526a
    public void b(ActivityResultCaller activityResultCaller, ActivityResultCallback activityResultCallback) {
        AbstractC3292y.i(activityResultCaller, "activityResultCaller");
        AbstractC3292y.i(activityResultCallback, "activityResultCallback");
        this.f27593a = activityResultCaller.registerForActivityResult(new PollingContract(), activityResultCallback);
    }

    @Override // q3.AbstractC3637f, o3.InterfaceC3526a
    public void c() {
        ActivityResultLauncher activityResultLauncher = this.f27593a;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.f27593a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // q3.AbstractC3637f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2668p interfaceC2668p, StripeIntent stripeIntent, j.c cVar, d dVar) {
        o.p pVar;
        int i8;
        PollingContract.a aVar;
        o.p pVar2;
        o r8 = stripeIntent.r();
        String str = null;
        if (r8 != null) {
            pVar = r8.f25635e;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = C0642a.f27594a[pVar.ordinal()];
        }
        if (i8 != 1) {
            if (i8 != 2) {
                o r9 = stripeIntent.r();
                if (r9 != null && (pVar2 = r9.f25635e) != null) {
                    str = pVar2.f25773a;
                }
                throw new IllegalStateException(("Received invalid payment method type " + str + " in PollingAuthenticator").toString());
            }
            String d8 = stripeIntent.d();
            if (d8 != null) {
                aVar = new PollingContract.a(d8, interfaceC2668p.a(), 60, 5, 12, w.f40609d);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            String d9 = stripeIntent.d();
            if (d9 != null) {
                aVar = new PollingContract.a(d9, interfaceC2668p.a(), 300, 5, 12, w.f40624k0);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        Context applicationContext = interfaceC2668p.c().getApplicationContext();
        A4.a aVar2 = A4.a.f159a;
        ActivityOptionsCompat makeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(applicationContext, aVar2.a(), aVar2.b());
        AbstractC3292y.h(makeCustomAnimation, "makeCustomAnimation(...)");
        ActivityResultLauncher activityResultLauncher = this.f27593a;
        if (activityResultLauncher == null) {
            i.b.a(i.a.b(i.f36196a, interfaceC2668p.c(), null, 2, null), i.f.f36234e, null, null, 6, null);
        } else {
            activityResultLauncher.launch(aVar, makeCustomAnimation);
        }
        return I.f8786a;
    }
}
