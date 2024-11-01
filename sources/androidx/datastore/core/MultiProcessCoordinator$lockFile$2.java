package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MultiProcessCoordinator$lockFile$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lockFile$2(MultiProcessCoordinator multiProcessCoordinator) {
        super(0);
        this.this$0 = multiProcessCoordinator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        String str;
        File fileWithSuffix;
        MultiProcessCoordinator multiProcessCoordinator = this.this$0;
        str = multiProcessCoordinator.LOCK_SUFFIX;
        fileWithSuffix = multiProcessCoordinator.fileWithSuffix(str);
        this.this$0.createIfNotExists(fileWithSuffix);
        return fileWithSuffix;
    }
}
