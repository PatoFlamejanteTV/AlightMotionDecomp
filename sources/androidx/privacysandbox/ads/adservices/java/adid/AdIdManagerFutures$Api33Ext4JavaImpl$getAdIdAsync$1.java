package androidx.privacysandbox.ads.adservices.java.adid;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager;
import androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1", f = "AdIdManagerFutures.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1 extends l implements InterfaceC2072n {
    int label;
    final /* synthetic */ AdIdManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(AdIdManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, d dVar) {
        super(2, dVar);
        this.this$0 = api33Ext4JavaImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AdIdManager adIdManager;
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
            adIdManager = this.this$0.mAdIdManager;
            this.label = 1;
            obj = adIdManager.getAdId(this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
