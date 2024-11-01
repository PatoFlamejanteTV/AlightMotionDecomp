package androidx.collection;

import Q5.I;
import U5.d;
import c6.InterfaceC2072n;
import k6.AbstractC3257i;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;

@f(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1", f = "ScatterMap.kt", l = {1495}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1 extends k implements InterfaceC2072n {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap, d dVar) {
        super(2, dVar);
        this.this$0 = mutableScatterMap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1 = new MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1(this.this$0, dVar);
        mutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1.L$0 = obj;
        return mutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0089 -> B:5:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004d -> B:15:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004f -> B:6:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006c -> B:5:0x008c). Please report as a decompilation issue!!! */
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
            if (r2 == 0) goto L2e
            if (r2 != r5) goto L26
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$1
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$0
            k6.i r12 = (k6.AbstractC3257i) r12
            Q5.t.b(r22)
            goto L8c
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2e:
            Q5.t.b(r22)
            java.lang.Object r2 = r0.L$0
            k6.i r2 = (k6.AbstractC3257i) r2
            androidx.collection.MutableScatterMap<K, V> r6 = r0.this$0
            long[] r6 = r6.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L9a
            r8 = 0
        L3f:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L95
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r2
            r2 = 0
            r18 = r11
            r11 = r6
            r6 = r18
            r19 = r9
            r10 = r7
            r9 = r8
            r7 = r19
        L63:
            if (r2 >= r6) goto L8f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L8c
            int r13 = r9 << 3
            int r13 = r13 + r2
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.b.c(r13)
            r0.L$0 = r12
            r0.L$1 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r5
            java.lang.Object r13 = r12.a(r13, r0)
            if (r13 != r1) goto L8c
            return r1
        L8c:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L63
        L8f:
            if (r6 != r4) goto L9a
            r8 = r9
            r7 = r10
            r6 = r11
            r2 = r12
        L95:
            if (r8 == r7) goto L9a
            int r8 = r8 + 1
            goto L3f
        L9a:
            Q5.I r1 = Q5.I.f8786a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(AbstractC3257i abstractC3257i, d dVar) {
        return ((MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1) create(abstractC3257i, dVar)).invokeSuspend(I.f8786a);
    }
}
