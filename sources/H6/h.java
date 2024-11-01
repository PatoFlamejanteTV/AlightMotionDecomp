package H6;

import Q5.I;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ChoiceError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public final class h extends AbstractC3293z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f3301a = new h();

    public h() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        I i8;
        ChoiceCmpCallback callback;
        ChoiceCmpCallback callback2;
        USRegulationData uSRegulationData = (USRegulationData) obj;
        if (uSRegulationData == null || (callback2 = ChoiceCmp.INSTANCE.getCallback()) == null) {
            i8 = null;
        } else {
            callback2.onReceiveUSRegulationsConsent(uSRegulationData);
            i8 = I.f8786a;
        }
        if (i8 == null && (callback = ChoiceCmp.INSTANCE.getCallback()) != null) {
            callback.onCmpError(ChoiceError.ERROR_WHILE_SAVING_CONSENT);
        }
        return I.f8786a;
    }
}
