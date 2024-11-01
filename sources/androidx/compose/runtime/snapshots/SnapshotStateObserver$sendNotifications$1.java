package androidx.compose.runtime.snapshots;

import Q5.I;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnapshotStateObserver$sendNotifications$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$sendNotifications$1(SnapshotStateObserver snapshotStateObserver) {
        super(0);
        this.this$0 = snapshotStateObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2582invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2582invoke() {
        MutableVector mutableVector;
        boolean z8;
        boolean drainChanges;
        MutableVector mutableVector2;
        do {
            mutableVector = this.this$0.observedScopeMaps;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (mutableVector) {
                try {
                    z8 = snapshotStateObserver.sendingNotifications;
                    if (!z8) {
                        snapshotStateObserver.sendingNotifications = true;
                        try {
                            mutableVector2 = snapshotStateObserver.observedScopeMaps;
                            int size = mutableVector2.getSize();
                            if (size > 0) {
                                Object[] content = mutableVector2.getContent();
                                int i8 = 0;
                                do {
                                    ((SnapshotStateObserver.ObservedScopeMap) content[i8]).notifyInvalidatedScopes();
                                    i8++;
                                } while (i8 < size);
                            }
                            snapshotStateObserver.sendingNotifications = false;
                        } finally {
                        }
                    }
                    I i9 = I.f8786a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            drainChanges = this.this$0.drainChanges();
        } while (drainChanges);
    }
}
