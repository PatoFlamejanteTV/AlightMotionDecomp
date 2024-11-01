package com.stripe.android.payments.core.authentication.threeds2;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.view.InterfaceC2666o;
import com.stripe.android.view.InterfaceC2668p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface c extends InterfaceC2666o {

    /* loaded from: classes4.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2668p f26434a;

        public a(InterfaceC2668p host) {
            AbstractC3292y.i(host, "host");
            this.f26434a = host;
        }

        @Override // com.stripe.android.view.InterfaceC2666o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Stripe3ds2TransactionContract.a args) {
            AbstractC3292y.i(args, "args");
            this.f26434a.b(Stripe3ds2TransactionActivity.class, args.w(), com.stripe.android.b.f24705q.b(args.v()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ActivityResultLauncher f26435a;

        public b(ActivityResultLauncher launcher) {
            AbstractC3292y.i(launcher, "launcher");
            this.f26435a = launcher;
        }

        @Override // com.stripe.android.view.InterfaceC2666o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Stripe3ds2TransactionContract.a args) {
            AbstractC3292y.i(args, "args");
            this.f26435a.launch(args);
        }
    }
}
