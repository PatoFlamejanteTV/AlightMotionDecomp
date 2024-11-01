package androidx.compose.runtime;

import Q5.I;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.collection.IntMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ComposerImpl$insertMovableContentGuarded$1$1$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ChangeList $offsetChanges;
    final /* synthetic */ SlotReader $reader;
    final /* synthetic */ MovableContentStateReference $to;
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$1$1(ComposerImpl composerImpl, ChangeList changeList, SlotReader slotReader, MovableContentStateReference movableContentStateReference) {
        super(0);
        this.this$0 = composerImpl;
        this.$offsetChanges = changeList;
        this.$reader = slotReader;
        this.$to = movableContentStateReference;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2443invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2443invoke() {
        ComposerChangeListWriter composerChangeListWriter;
        ComposerChangeListWriter composerChangeListWriter2;
        composerChangeListWriter = this.this$0.changeListWriter;
        ChangeList changeList = this.$offsetChanges;
        ComposerImpl composerImpl = this.this$0;
        SlotReader slotReader = this.$reader;
        MovableContentStateReference movableContentStateReference = this.$to;
        ChangeList changeList2 = composerChangeListWriter.getChangeList();
        try {
            composerChangeListWriter.setChangeList(changeList);
            SlotReader reader$runtime_release = composerImpl.getReader$runtime_release();
            int[] iArr = composerImpl.nodeCountOverrides;
            IntMap intMap = composerImpl.providerUpdates;
            composerImpl.nodeCountOverrides = null;
            composerImpl.providerUpdates = null;
            try {
                composerImpl.setReader$runtime_release(slotReader);
                composerChangeListWriter2 = composerImpl.changeListWriter;
                boolean implicitRootStart = composerChangeListWriter2.getImplicitRootStart();
                try {
                    composerChangeListWriter2.setImplicitRootStart(false);
                    composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals$runtime_release(), movableContentStateReference.getParameter$runtime_release(), true);
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                    I i8 = I.f8786a;
                } catch (Throwable th) {
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                    throw th;
                }
            } finally {
                composerImpl.setReader$runtime_release(reader$runtime_release);
                composerImpl.nodeCountOverrides = iArr;
                composerImpl.providerUpdates = intMap;
            }
        } finally {
            composerChangeListWriter.setChangeList(changeList2);
        }
    }
}
