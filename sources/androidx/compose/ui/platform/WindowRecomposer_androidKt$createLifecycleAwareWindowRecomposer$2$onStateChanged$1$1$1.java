package androidx.compose.ui.platform;

import Q5.C1413h;
import c6.InterfaceC2072n;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {389}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ InterfaceC3813L $durationScaleStateFlow;
    final /* synthetic */ MotionDurationScaleImpl $it;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(InterfaceC3813L interfaceC3813L, MotionDurationScaleImpl motionDurationScaleImpl, U5.d dVar) {
        super(2, dVar);
        this.$durationScaleStateFlow = interfaceC3813L;
        this.$it = motionDurationScaleImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(this.$durationScaleStateFlow, this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q5.t.b(obj);
        } else {
            Q5.t.b(obj);
            InterfaceC3813L interfaceC3813L = this.$durationScaleStateFlow;
            final MotionDurationScaleImpl motionDurationScaleImpl = this.$it;
            InterfaceC3822g interfaceC3822g = new InterfaceC3822g() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1.1
                @Override // q6.InterfaceC3822g
                public /* bridge */ /* synthetic */ Object emit(Object obj2, U5.d dVar) {
                    return emit(((Number) obj2).floatValue(), dVar);
                }

                public final Object emit(float f8, U5.d dVar) {
                    MotionDurationScaleImpl.this.setScaleFactor(f8);
                    return Q5.I.f8786a;
                }
            };
            this.label = 1;
            if (interfaceC3813L.collect(interfaceC3822g, this) == e8) {
                return e8;
            }
        }
        throw new C1413h();
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(n6.M m8, U5.d dVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
    }
}
