package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresExtension(extension = 1000000, version = 5)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class TopicsManagerApi33Ext5Impl extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TopicsManagerApi33Ext5Impl(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3292y.i(r2, r0)
            java.lang.Class r0 = androidx.privacysandbox.ads.adservices.topics.a.a()
            java.lang.Object r2 = g.AbstractC2877d.a(r2, r0)
            java.lang.String r0 = "context.getSystemService…opicsManager::class.java)"
            kotlin.jvm.internal.AbstractC3292y.h(r2, r0)
            android.adservices.topics.TopicsManager r2 = androidx.privacysandbox.ads.adservices.topics.b.a(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi33Ext5Impl.<init>(android.content.Context):void");
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(GetTopicsRequest request) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        android.adservices.topics.GetTopicsRequest build;
        AbstractC3292y.i(request, "request");
        adsSdkName = f.a().setAdsSdkName(request.getAdsSdkName());
        shouldRecordObservation = adsSdkName.setShouldRecordObservation(request.shouldRecordObservation());
        build = shouldRecordObservation.build();
        AbstractC3292y.h(build, "Builder()\n            .s…ion)\n            .build()");
        return build;
    }
}
