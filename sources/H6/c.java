package H6;

import Q5.I;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public final class c extends AbstractC3293z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f3271a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Function1 function1) {
        super(1);
        this.f3271a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        this.f3271a.invoke((USRegulationData) obj);
        return I.f8786a;
    }
}
