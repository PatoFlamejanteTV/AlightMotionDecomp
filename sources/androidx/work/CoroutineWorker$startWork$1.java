package androidx.work;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.work.ListenableWorker;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CoroutineWorker$startWork$1 extends l implements InterfaceC2072n {
    int label;
    final /* synthetic */ CoroutineWorker this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$startWork$1(CoroutineWorker coroutineWorker, d dVar) {
        super(2, dVar);
        this.this$0 = coroutineWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new CoroutineWorker$startWork$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = b.e();
        int i8 = this.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                CoroutineWorker coroutineWorker = this.this$0;
                this.label = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.this$0.getFuture$work_runtime_release().set((ListenableWorker.Result) obj);
        } catch (Throwable th) {
            this.this$0.getFuture$work_runtime_release().setException(th);
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((CoroutineWorker$startWork$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
