package androidx.datastore.core.okio;

import U6.Q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class OkioStorage$canonicalPath$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ OkioStorage<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorage$canonicalPath$2(OkioStorage<T> okioStorage) {
        super(0);
        this.this$0 = okioStorage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Q invoke() {
        Function0 function0;
        Function0 function02;
        function0 = ((OkioStorage) this.this$0).producePath;
        Q q8 = (Q) function0.invoke();
        boolean e8 = q8.e();
        OkioStorage<T> okioStorage = this.this$0;
        if (e8) {
            return q8.h();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("OkioStorage requires absolute paths, but did not get an absolute path from producePath = ");
        function02 = ((OkioStorage) okioStorage).producePath;
        sb.append(function02);
        sb.append(", instead got ");
        sb.append(q8);
        throw new IllegalStateException(sb.toString().toString());
    }
}
