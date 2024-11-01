package androidx.compose.runtime.collection;

import Q5.I;
import U5.d;
import c6.InterfaceC2072n;
import k6.AbstractC3257i;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;

@f(c = "androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$values$1$iterator$1", f = "IdentityArrayMap.kt", l = {271}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class IdentityArrayMap$asMap$1$values$1$iterator$1 extends k implements InterfaceC2072n {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IdentityArrayMap<Key, Value> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityArrayMap$asMap$1$values$1$iterator$1(IdentityArrayMap<Key, Value> identityArrayMap, d dVar) {
        super(2, dVar);
        this.this$0 = identityArrayMap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        IdentityArrayMap$asMap$1$values$1$iterator$1 identityArrayMap$asMap$1$values$1$iterator$1 = new IdentityArrayMap$asMap$1$values$1$iterator$1(this.this$0, dVar);
        identityArrayMap$asMap$1$values$1$iterator$1.L$0 = obj;
        return identityArrayMap$asMap$1$values$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0044 -> B:5:0x0047). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            int r1 = r5.I$1
            int r3 = r5.I$0
            java.lang.Object r4 = r5.L$0
            k6.i r4 = (k6.AbstractC3257i) r4
            Q5.t.b(r6)
            goto L47
        L17:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1f:
            Q5.t.b(r6)
            java.lang.Object r6 = r5.L$0
            k6.i r6 = (k6.AbstractC3257i) r6
            androidx.compose.runtime.collection.IdentityArrayMap<Key, Value> r1 = r5.this$0
            int r1 = r1.getSize()
            r3 = 0
            r4 = r6
        L2e:
            if (r3 >= r1) goto L49
            androidx.compose.runtime.collection.IdentityArrayMap<Key, Value> r6 = r5.this$0
            java.lang.Object[] r6 = r6.getValues()
            r6 = r6[r3]
            r5.L$0 = r4
            r5.I$0 = r3
            r5.I$1 = r1
            r5.label = r2
            java.lang.Object r6 = r4.a(r6, r5)
            if (r6 != r0) goto L47
            return r0
        L47:
            int r3 = r3 + r2
            goto L2e
        L49:
            Q5.I r6 = Q5.I.f8786a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$values$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(AbstractC3257i abstractC3257i, d dVar) {
        return ((IdentityArrayMap$asMap$1$values$1$iterator$1) create(abstractC3257i, dVar)).invokeSuspend(I.f8786a);
    }
}
