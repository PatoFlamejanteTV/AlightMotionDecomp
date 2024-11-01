package androidx.privacysandbox.ads.adservices.java.topics;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1 extends l implements InterfaceC2072n {
    final /* synthetic */ GetTopicsRequest $request;
    int label;
    final /* synthetic */ TopicsManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(TopicsManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, GetTopicsRequest getTopicsRequest, d dVar) {
        super(2, dVar);
        this.this$0 = api33Ext4JavaImpl;
        this.$request = getTopicsRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(this.this$0, this.$request, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TopicsManager topicsManager;
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
            topicsManager = this.this$0.mTopicsManager;
            GetTopicsRequest getTopicsRequest = this.$request;
            this.label = 1;
            obj = topicsManager.getTopics(getTopicsRequest, this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
