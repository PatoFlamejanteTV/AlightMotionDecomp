package androidx.compose.runtime;

import Q5.I;
import Q5.t;
import androidx.core.view.PointerIconCompat;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {PointerIconCompat.TYPE_HELP}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Recomposer$recompositionRunner$2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2073o $block;
    final /* synthetic */ MonotonicFrameClock $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", l = {PointerIconCompat.TYPE_WAIT}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
        final /* synthetic */ InterfaceC2073o $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(InterfaceC2073o interfaceC2073o, MonotonicFrameClock monotonicFrameClock, U5.d dVar) {
            super(2, dVar);
            this.$block = interfaceC2073o;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$block, this.$parentFrameClock, dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
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
                M m8 = (M) this.L$0;
                InterfaceC2073o interfaceC2073o = this.$block;
                MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                this.label = 1;
                if (interfaceC2073o.invoke(m8, monotonicFrameClock, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((AnonymousClass3) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, InterfaceC2073o interfaceC2073o, MonotonicFrameClock monotonicFrameClock, U5.d dVar) {
        super(2, dVar);
        this.this$0 = recomposer;
        this.$block = interfaceC2073o;
        this.$parentFrameClock = monotonicFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, dVar);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$recompositionRunner$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((Recomposer$recompositionRunner$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
