package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {22}, m = "getTopics$suspendImpl")
/* loaded from: classes3.dex */
public final class TopicsManagerImplCommon$getTopics$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TopicsManagerImplCommon this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerImplCommon$getTopics$1(TopicsManagerImplCommon topicsManagerImplCommon, U5.d dVar) {
        super(dVar);
        this.this$0 = topicsManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TopicsManagerImplCommon.getTopics$suspendImpl(this.this$0, null, this);
    }
}
