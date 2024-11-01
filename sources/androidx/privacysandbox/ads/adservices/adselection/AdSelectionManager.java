package androidx.privacysandbox.ads.adservices.adselection;

import Q5.I;
import android.adservices.adselection.AdSelectionConfig;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3472p;

/* loaded from: classes3.dex */
public abstract class AdSelectionManager {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final AdSelectionManager obtain(Context context) {
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
    public static final AdSelectionManager obtain(Context context) {
        return Companion.obtain(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object reportImpression(ReportImpressionRequest reportImpressionRequest, U5.d dVar);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object selectAds(AdSelectionConfig adSelectionConfig, U5.d dVar);

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresExtension(extension = 1000000, version = 4)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* loaded from: classes3.dex */
    public static final class Api33Ext4Impl extends AdSelectionManager {
        private final android.adservices.adselection.AdSelectionManager mAdSelectionManager;

        public Api33Ext4Impl(android.adservices.adselection.AdSelectionManager mAdSelectionManager) {
            AbstractC3292y.i(mAdSelectionManager, "mAdSelectionManager");
            this.mAdSelectionManager = mAdSelectionManager;
        }

        private final android.adservices.adselection.AdSelectionConfig convertAdSelectionConfig(AdSelectionConfig adSelectionConfig) {
            AdSelectionConfig.Builder adSelectionSignals;
            AdSelectionConfig.Builder customAudienceBuyers;
            AdSelectionConfig.Builder decisionLogicUri;
            AdTechIdentifier fromString;
            AdSelectionConfig.Builder seller;
            AdSelectionConfig.Builder perBuyerSignals;
            AdSelectionConfig.Builder sellerSignals;
            AdSelectionConfig.Builder trustedScoringSignalsUri;
            android.adservices.adselection.AdSelectionConfig build;
            adSelectionSignals = k.a().setAdSelectionSignals(convertAdSelectionSignals(adSelectionConfig.getAdSelectionSignals()));
            customAudienceBuyers = adSelectionSignals.setCustomAudienceBuyers(convertBuyers(adSelectionConfig.getCustomAudienceBuyers()));
            decisionLogicUri = customAudienceBuyers.setDecisionLogicUri(adSelectionConfig.getDecisionLogicUri());
            fromString = AdTechIdentifier.fromString(adSelectionConfig.getSeller().getIdentifier());
            seller = decisionLogicUri.setSeller(fromString);
            perBuyerSignals = seller.setPerBuyerSignals(convertPerBuyerSignals(adSelectionConfig.getPerBuyerSignals()));
            sellerSignals = perBuyerSignals.setSellerSignals(convertAdSelectionSignals(adSelectionConfig.getSellerSignals()));
            trustedScoringSignalsUri = sellerSignals.setTrustedScoringSignalsUri(adSelectionConfig.getTrustedScoringSignalsUri());
            build = trustedScoringSignalsUri.build();
            AbstractC3292y.h(build, "Builder()\n              …\n                .build()");
            return build;
        }

        private final AdSelectionSignals convertAdSelectionSignals(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals) {
            AdSelectionSignals fromString;
            fromString = AdSelectionSignals.fromString(adSelectionSignals.getSignals());
            AbstractC3292y.h(fromString, "fromString(request.signals)");
            return fromString;
        }

        private final List<AdTechIdentifier> convertBuyers(List<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> list) {
            AdTechIdentifier fromString;
            ArrayList arrayList = new ArrayList();
            Iterator<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> it = list.iterator();
            while (it.hasNext()) {
                fromString = AdTechIdentifier.fromString(it.next().getIdentifier());
                AbstractC3292y.h(fromString, "fromString(buyer.identifier)");
                arrayList.add(fromString);
            }
            return arrayList;
        }

        private final Map<AdTechIdentifier, AdSelectionSignals> convertPerBuyerSignals(Map<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals> map) {
            AdTechIdentifier fromString;
            AdSelectionSignals adSelectionSignals;
            HashMap hashMap = new HashMap();
            for (androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier : map.keySet()) {
                fromString = AdTechIdentifier.fromString(adTechIdentifier.getIdentifier());
                AbstractC3292y.h(fromString, "fromString(key.identifier)");
                if (map.get(adTechIdentifier) != null) {
                    androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals2 = map.get(adTechIdentifier);
                    AbstractC3292y.f(adSelectionSignals2);
                    adSelectionSignals = convertAdSelectionSignals(adSelectionSignals2);
                } else {
                    adSelectionSignals = null;
                }
                hashMap.put(fromString, adSelectionSignals);
            }
            return hashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.adselection.ReportImpressionRequest convertReportImpressionRequest(ReportImpressionRequest reportImpressionRequest) {
            j.a();
            return i.a(reportImpressionRequest.getAdSelectionId(), convertAdSelectionConfig(reportImpressionRequest.getAdSelectionConfig()));
        }

        private final AdSelectionOutcome convertResponse(android.adservices.adselection.AdSelectionOutcome adSelectionOutcome) {
            long adSelectionId;
            Uri renderUri;
            adSelectionId = adSelectionOutcome.getAdSelectionId();
            renderUri = adSelectionOutcome.getRenderUri();
            AbstractC3292y.h(renderUri, "response.renderUri");
            return new AdSelectionOutcome(adSelectionId, renderUri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public final Object selectAdsInternal(android.adservices.adselection.AdSelectionConfig adSelectionConfig, U5.d dVar) {
            C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
            c3472p.B();
            this.mAdSelectionManager.selectAds(adSelectionConfig, new androidx.privacysandbox.ads.adservices.adid.g(), OutcomeReceiverKt.asOutcomeReceiver(c3472p));
            Object y8 = c3472p.y();
            if (y8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y8;
        }

        @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public Object reportImpression(ReportImpressionRequest reportImpressionRequest, U5.d dVar) {
            C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
            c3472p.B();
            this.mAdSelectionManager.reportImpression(convertReportImpressionRequest(reportImpressionRequest), new androidx.privacysandbox.ads.adservices.adid.g(), OutcomeReceiverKt.asOutcomeReceiver(c3472p));
            Object y8 = c3472p.y();
            if (y8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (y8 == V5.b.e()) {
                return y8;
            }
            return I.f8786a;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
        @androidx.annotation.RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @androidx.annotation.DoNotInline
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object selectAds(androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig r5, U5.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.L$0
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl r5 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl) r5
                Q5.t.b(r6)
                goto L48
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                Q5.t.b(r6)
                android.adservices.adselection.AdSelectionConfig r5 = r4.convertAdSelectionConfig(r5)
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r6 = r4.selectAdsInternal(r5, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                r5 = r4
            L48:
                android.adservices.adselection.AdSelectionOutcome r6 = androidx.privacysandbox.ads.adservices.adselection.n.a(r6)
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome r5 = r5.convertResponse(r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl.selectAds(androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig, U5.d):java.lang.Object");
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
                java.lang.Class r0 = androidx.privacysandbox.ads.adservices.adselection.a.a()
                java.lang.Object r2 = g.AbstractC2877d.a(r2, r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.AbstractC3292y.h(r2, r0)
                android.adservices.adselection.AdSelectionManager r2 = androidx.privacysandbox.ads.adservices.adselection.l.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl.<init>(android.content.Context):void");
        }
    }
}
