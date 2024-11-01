package q;

import Q5.I;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ChoiceError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: q.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3607n extends AbstractC3293z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3606m f36595a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3607n(C3606m c3606m) {
        super(1);
        this.f36595a = c3606m;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        I i8;
        ChoiceCmpCallback choiceCmpCallback;
        ChoiceCmpCallback choiceCmpCallback2;
        USRegulationData uSRegulationData = (USRegulationData) obj;
        if (uSRegulationData == null || (choiceCmpCallback2 = this.f36595a.f36592c) == null) {
            i8 = null;
        } else {
            choiceCmpCallback2.onReceiveUSRegulationsConsent(uSRegulationData);
            i8 = I.f8786a;
        }
        if (i8 == null && (choiceCmpCallback = this.f36595a.f36592c) != null) {
            choiceCmpCallback.onCmpError(ChoiceError.ERROR_WHILE_SAVING_CONSENT);
        }
        return I.f8786a;
    }
}
