package com.stripe.android.link;

import P2.b;
import P2.c;
import P2.d;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import j3.m;
import kotlin.jvm.internal.AbstractC3292y;
import n2.r;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class LinkActivityContract extends ActivityResultContract<a, b> {

    /* renamed from: a, reason: collision with root package name */
    private final m f25193a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final d f25194a;

        public a(d configuration) {
            AbstractC3292y.i(configuration, "configuration");
            this.f25194a = configuration;
        }

        public final d a() {
            return this.f25194a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3292y.d(this.f25194a, ((a) obj).f25194a);
        }

        public int hashCode() {
            return this.f25194a.hashCode();
        }

        public String toString() {
            return "Args(configuration=" + this.f25194a + ")";
        }
    }

    public LinkActivityContract(m stripeRepository) {
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        this.f25193a = stripeRepository;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        r a9 = r.f35413c.a(context);
        return LinkForegroundActivity.f25195b.a(context, V2.a.Companion.a(input.a(), context, a9.f(), a9.h(), m.a.a(this.f25193a, null, 1, null)).b());
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b parseResult(int i8, Intent intent) {
        return c.a(i8, intent);
    }
}
