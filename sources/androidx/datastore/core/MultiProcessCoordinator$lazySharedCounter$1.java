package androidx.datastore.core;

import androidx.datastore.core.SharedCounter;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MultiProcessCoordinator$lazySharedCounter$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ MultiProcessCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MultiProcessCoordinator multiProcessCoordinator) {
            super(0);
            this.this$0 = multiProcessCoordinator;
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            String str;
            File fileWithSuffix;
            MultiProcessCoordinator multiProcessCoordinator = this.this$0;
            str = multiProcessCoordinator.VERSION_SUFFIX;
            fileWithSuffix = multiProcessCoordinator.fileWithSuffix(str);
            this.this$0.createIfNotExists(fileWithSuffix);
            return fileWithSuffix;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lazySharedCounter$1(MultiProcessCoordinator multiProcessCoordinator) {
        super(0);
        this.this$0 = multiProcessCoordinator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedCounter invoke() {
        SharedCounter.Factory factory = SharedCounter.Factory;
        factory.loadLib();
        return factory.create$datastore_core_release(new AnonymousClass1(this.this$0));
    }
}
