package androidx.collection;

import Q5.I;
import U5.d;
import c6.InterfaceC2072n;
import k6.AbstractC3257i;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;

@f(c = "androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1", f = "ScatterMap.kt", l = {726}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScatterMap$MapWrapper$keys$1$iterator$1 extends k implements InterfaceC2072n {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScatterMap<K, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterMap$MapWrapper$keys$1$iterator$1(ScatterMap<K, V> scatterMap, d dVar) {
        super(2, dVar);
        this.this$0 = scatterMap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        ScatterMap$MapWrapper$keys$1$iterator$1 scatterMap$MapWrapper$keys$1$iterator$1 = new ScatterMap$MapWrapper$keys$1$iterator$1(this.this$0, dVar);
        scatterMap$MapWrapper$keys$1$iterator$1.L$0 = obj;
        return scatterMap$MapWrapper$keys$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x008c -> B:5:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:15:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0055 -> B:6:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006f -> B:5:0x008f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L32
            if (r2 != r5) goto L2a
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$2
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$1
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            java.lang.Object r13 = r0.L$0
            k6.i r13 = (k6.AbstractC3257i) r13
            Q5.t.b(r22)
            goto L8f
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L32:
            Q5.t.b(r22)
            java.lang.Object r2 = r0.L$0
            k6.i r2 = (k6.AbstractC3257i) r2
            androidx.collection.ScatterMap<K, V> r6 = r0.this$0
            java.lang.Object[] r7 = r6.keys
            long[] r6 = r6.metadata
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9d
            r9 = 0
        L45:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L98
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = 0
            r19 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r19
        L66:
            if (r2 >= r6) goto L92
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L8f
            int r14 = r9 << 3
            int r14 = r14 + r2
            r14 = r12[r14]
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r5
            java.lang.Object r14 = r13.a(r14, r0)
            if (r14 != r1) goto L8f
            return r1
        L8f:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L66
        L92:
            if (r6 != r4) goto L9d
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L98:
            if (r9 == r8) goto L9d
            int r9 = r9 + 1
            goto L45
        L9d:
            Q5.I r1 = Q5.I.f8786a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(AbstractC3257i abstractC3257i, d dVar) {
        return ((ScatterMap$MapWrapper$keys$1$iterator$1) create(abstractC3257i, dVar)).invokeSuspend(I.f8786a);
    }
}
