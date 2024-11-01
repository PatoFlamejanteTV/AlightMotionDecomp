package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3472p;

@RequiresExtension(extension = 1000000, version = 4)
@SuppressLint({"NewApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class TopicsManagerImplCommon extends TopicsManager {
    private final android.adservices.topics.TopicsManager mTopicsManager;

    public TopicsManagerImplCommon(android.adservices.topics.TopicsManager mTopicsManager) {
        AbstractC3292y.i(mTopicsManager, "mTopicsManager");
        this.mTopicsManager = mTopicsManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @androidx.annotation.RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @androidx.annotation.DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object getTopics$suspendImpl(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r4, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r5, U5.d r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r4 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon) r4
            Q5.t.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Q5.t.b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.convertRequest$ads_adservices_release(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r4.getTopicsAsyncInternal(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r5 = androidx.privacysandbox.ads.adservices.topics.g.a(r6)
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse r4 = r4.convertResponse$ads_adservices_release(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.getTopics$suspendImpl(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    public final Object getTopicsAsyncInternal(android.adservices.topics.GetTopicsRequest getTopicsRequest, U5.d dVar) {
        C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        this.mTopicsManager.getTopics(getTopicsRequest, new androidx.privacysandbox.ads.adservices.adid.g(), OutcomeReceiverKt.asOutcomeReceiver(c3472p));
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(GetTopicsRequest request) {
        GetTopicsRequest.Builder adsSdkName;
        android.adservices.topics.GetTopicsRequest build;
        AbstractC3292y.i(request, "request");
        adsSdkName = f.a().setAdsSdkName(request.getAdsSdkName());
        build = adsSdkName.build();
        AbstractC3292y.h(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    public final GetTopicsResponse convertResponse$ads_adservices_release(android.adservices.topics.GetTopicsResponse response) {
        List topics;
        long taxonomyVersion;
        long modelVersion;
        int topicId;
        AbstractC3292y.i(response, "response");
        ArrayList arrayList = new ArrayList();
        topics = response.getTopics();
        Iterator it = topics.iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic a9 = i.a(it.next());
            taxonomyVersion = a9.getTaxonomyVersion();
            modelVersion = a9.getModelVersion();
            topicId = a9.getTopicId();
            arrayList.add(new Topic(taxonomyVersion, modelVersion, topicId));
        }
        return new GetTopicsResponse(arrayList);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @DoNotInline
    public Object getTopics(GetTopicsRequest getTopicsRequest, U5.d dVar) {
        return getTopics$suspendImpl(this, getTopicsRequest, dVar);
    }
}
