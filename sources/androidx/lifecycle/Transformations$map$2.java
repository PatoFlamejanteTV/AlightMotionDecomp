package androidx.lifecycle;

import Q5.I;
import androidx.arch.core.util.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Transformations$map$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function $mapFunction;
    final /* synthetic */ MediatorLiveData $result;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$map$2(MediatorLiveData mediatorLiveData, Function function) {
        super(1);
        this.$result = mediatorLiveData;
        this.$mapFunction = function;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m5436invoke(obj);
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5436invoke(Object obj) {
        this.$result.setValue(this.$mapFunction.apply(obj));
    }
}
