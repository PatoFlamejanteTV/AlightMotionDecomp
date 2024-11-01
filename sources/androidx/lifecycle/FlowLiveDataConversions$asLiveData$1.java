package androidx.lifecycle;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowLiveDataConversions$asLiveData$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ InterfaceC3821f $this_asLiveData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asLiveData$1(InterfaceC3821f interfaceC3821f, U5.d dVar) {
        super(2, dVar);
        this.$this_asLiveData = interfaceC3821f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, dVar);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(LiveDataScope<T> liveDataScope, U5.d dVar) {
        return ((FlowLiveDataConversions$asLiveData$1) create(liveDataScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
            InterfaceC3821f interfaceC3821f = this.$this_asLiveData;
            InterfaceC3822g interfaceC3822g = new InterfaceC3822g() { // from class: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1.1
                @Override // q6.InterfaceC3822g
                public final Object emit(T t8, U5.d dVar) {
                    Object emit = liveDataScope.emit(t8, dVar);
                    if (emit == V5.b.e()) {
                        return emit;
                    }
                    return I.f8786a;
                }
            };
            this.label = 1;
            if (interfaceC3821f.collect(interfaceC3822g, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
