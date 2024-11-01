package androidx.datastore.core;

import Q5.I;
import U5.d;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SimpleActor$offer$2 extends l implements InterfaceC2072n {
    Object L$0;
    int label;
    final /* synthetic */ SimpleActor<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor<T> simpleActor, d dVar) {
        super(2, dVar);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SimpleActor$offer$2(this.this$0, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            Q5.t.b(r6)
            goto L5d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.L$0
            c6.n r1 = (c6.InterfaceC2072n) r1
            Q5.t.b(r6)
            goto L51
        L22:
            Q5.t.b(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
            int r6 = r6.get()
            if (r6 <= 0) goto L6c
        L31:
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            n6.M r6 = androidx.datastore.core.SimpleActor.access$getScope$p(r6)
            n6.N.f(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            c6.n r1 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            p6.d r6 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r6)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r6.s(r5)
            if (r6 != r0) goto L51
            return r0
        L51:
            r4 = 0
            r5.L$0 = r4
            r5.label = r2
            java.lang.Object r6 = r1.invoke(r6, r5)
            if (r6 != r0) goto L5d
            return r0
        L5d:
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
            int r6 = r6.decrementAndGet()
            if (r6 != 0) goto L31
            Q5.I r6 = Q5.I.f8786a
            return r6
        L6c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((SimpleActor$offer$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
