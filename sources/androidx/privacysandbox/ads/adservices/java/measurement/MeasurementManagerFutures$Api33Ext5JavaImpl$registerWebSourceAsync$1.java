package androidx.privacysandbox.ads.adservices.java.measurement;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1 extends l implements InterfaceC2072n {
    final /* synthetic */ WebSourceRegistrationRequest $request;
    int label;
    final /* synthetic */ MeasurementManagerFutures.Api33Ext5JavaImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1(MeasurementManagerFutures.Api33Ext5JavaImpl api33Ext5JavaImpl, WebSourceRegistrationRequest webSourceRegistrationRequest, d dVar) {
        super(2, dVar);
        this.this$0 = api33Ext5JavaImpl;
        this.$request = webSourceRegistrationRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1(this.this$0, this.$request, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MeasurementManager measurementManager;
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
            measurementManager = this.this$0.mMeasurementManager;
            WebSourceRegistrationRequest webSourceRegistrationRequest = this.$request;
            this.label = 1;
            if (measurementManager.registerWebSource(webSourceRegistrationRequest, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
