package androidx.privacysandbox.ads.adservices.adid;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3472p;

/* loaded from: classes3.dex */
public abstract class AdIdManager {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final AdIdManager obtain(Context context) {
            AbstractC3292y.i(context, "context");
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final AdIdManager obtain(Context context) {
        return Companion.obtain(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
    public abstract Object getAdId(U5.d dVar);

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresExtension(extension = 1000000, version = 4)
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    /* loaded from: classes3.dex */
    public static final class Api33Ext4Impl extends AdIdManager {
        private final android.adservices.adid.AdIdManager mAdIdManager;

        public Api33Ext4Impl(android.adservices.adid.AdIdManager mAdIdManager) {
            AbstractC3292y.i(mAdIdManager, "mAdIdManager");
            this.mAdIdManager = mAdIdManager;
        }

        private final AdId convertResponse(android.adservices.adid.AdId adId) {
            String adId2;
            boolean isLimitAdTrackingEnabled;
            adId2 = adId.getAdId();
            AbstractC3292y.h(adId2, "response.adId");
            isLimitAdTrackingEnabled = adId.isLimitAdTrackingEnabled();
            return new AdId(adId2, isLimitAdTrackingEnabled);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
        public final Object getAdIdAsyncInternal(U5.d dVar) {
            C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
            c3472p.B();
            this.mAdIdManager.getAdId(new g(), OutcomeReceiverKt.asOutcomeReceiver(c3472p));
            Object y8 = c3472p.y();
            if (y8 == V5.b.e()) {
                h.c(dVar);
            }
            return y8;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // androidx.privacysandbox.ads.adservices.adid.AdIdManager
        @androidx.annotation.RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
        @androidx.annotation.DoNotInline
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object getAdId(U5.d r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1
                if (r0 == 0) goto L13
                r0 = r5
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1 r0 = (androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1 r0 = new androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1
                r0.<init>(r4, r5)
            L18:
                java.lang.Object r5 = r0.result
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r0 = r0.L$0
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl r0 = (androidx.privacysandbox.ads.adservices.adid.AdIdManager.Api33Ext4Impl) r0
                Q5.t.b(r5)
                goto L44
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L35:
                Q5.t.b(r5)
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r5 = r4.getAdIdAsyncInternal(r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                r0 = r4
            L44:
                android.adservices.adid.AdId r5 = androidx.privacysandbox.ads.adservices.adid.c.a(r5)
                androidx.privacysandbox.ads.adservices.adid.AdId r5 = r0.convertResponse(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adid.AdIdManager.Api33Ext4Impl.getAdId(U5.d):java.lang.Object");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Api33Ext4Impl(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.AbstractC3292y.i(r2, r0)
                java.lang.Class r0 = androidx.privacysandbox.ads.adservices.adid.d.a()
                java.lang.Object r2 = g.AbstractC2877d.a(r2, r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.AbstractC3292y.h(r2, r0)
                android.adservices.adid.AdIdManager r2 = androidx.privacysandbox.ads.adservices.adid.e.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adid.AdIdManager.Api33Ext4Impl.<init>(android.content.Context):void");
        }
    }
}
