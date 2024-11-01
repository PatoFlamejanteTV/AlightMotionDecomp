package androidx.privacysandbox.ads.adservices.java.adselection;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.N;
import n6.U;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
public abstract class AdSelectionManagerFutures {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class Api33Ext4JavaImpl extends AdSelectionManagerFutures {
        private final AdSelectionManager mAdSelectionManager;

        public Api33Ext4JavaImpl(AdSelectionManager adSelectionManager) {
            this.mAdSelectionManager = adSelectionManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public InterfaceFutureC4260d reportImpressionAsync(ReportImpressionRequest reportImpressionRequest) {
            U b9;
            AbstractC3292y.i(reportImpressionRequest, "reportImpressionRequest");
            b9 = AbstractC3462k.b(N.a(C3445b0.a()), null, null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1(this, reportImpressionRequest, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(b9, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public InterfaceFutureC4260d selectAdsAsync(AdSelectionConfig adSelectionConfig) {
            U b9;
            AbstractC3292y.i(adSelectionConfig, "adSelectionConfig");
            b9 = AbstractC3462k.b(N.a(C3445b0.a()), null, null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(this, adSelectionConfig, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(b9, null, 1, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final AdSelectionManagerFutures from(Context context) {
            AbstractC3292y.i(context, "context");
            AdSelectionManager obtain = AdSelectionManager.Companion.obtain(context);
            if (obtain != null) {
                return new Api33Ext4JavaImpl(obtain);
            }
            return null;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public static final AdSelectionManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract InterfaceFutureC4260d reportImpressionAsync(ReportImpressionRequest reportImpressionRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract InterfaceFutureC4260d selectAdsAsync(AdSelectionConfig adSelectionConfig);
}
