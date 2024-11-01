package androidx.privacysandbox.ads.adservices.java.adselection;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest;
import androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import n6.M;

@f(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1", f = "AdSelectionManagerFutures.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1 extends l implements InterfaceC2072n {
    final /* synthetic */ ReportImpressionRequest $reportImpressionRequest;
    int label;
    final /* synthetic */ AdSelectionManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1(AdSelectionManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, ReportImpressionRequest reportImpressionRequest, d dVar) {
        super(2, dVar);
        this.this$0 = api33Ext4JavaImpl;
        this.$reportImpressionRequest = reportImpressionRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1(this.this$0, this.$reportImpressionRequest, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AdSelectionManager adSelectionManager;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            adSelectionManager = this.this$0.mAdSelectionManager;
            AbstractC3292y.f(adSelectionManager);
            ReportImpressionRequest reportImpressionRequest = this.$reportImpressionRequest;
            this.label = 1;
            if (adSelectionManager.reportImpression(reportImpressionRequest, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
