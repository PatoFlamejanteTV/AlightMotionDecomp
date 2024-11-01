package androidx.privacysandbox.ads.adservices.java.customaudience;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager;
import androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.N;
import n6.U;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
public abstract class CustomAudienceManagerFutures {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class Api33Ext4JavaImpl extends CustomAudienceManagerFutures {
        private final CustomAudienceManager mCustomAudienceManager;

        public Api33Ext4JavaImpl(CustomAudienceManager customAudienceManager) {
            this.mCustomAudienceManager = customAudienceManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public InterfaceFutureC4260d joinCustomAudienceAsync(JoinCustomAudienceRequest request) {
            U b9;
            AbstractC3292y.i(request, "request");
            b9 = AbstractC3462k.b(N.a(C3445b0.a()), null, null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1(this, request, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(b9, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public InterfaceFutureC4260d leaveCustomAudienceAsync(LeaveCustomAudienceRequest request) {
            U b9;
            AbstractC3292y.i(request, "request");
            b9 = AbstractC3462k.b(N.a(C3445b0.a()), null, null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1(this, request, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(b9, null, 1, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final CustomAudienceManagerFutures from(Context context) {
            AbstractC3292y.i(context, "context");
            CustomAudienceManager obtain = CustomAudienceManager.Companion.obtain(context);
            if (obtain != null) {
                return new Api33Ext4JavaImpl(obtain);
            }
            return null;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public static final CustomAudienceManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract InterfaceFutureC4260d joinCustomAudienceAsync(JoinCustomAudienceRequest joinCustomAudienceRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract InterfaceFutureC4260d leaveCustomAudienceAsync(LeaveCustomAudienceRequest leaveCustomAudienceRequest);
}
