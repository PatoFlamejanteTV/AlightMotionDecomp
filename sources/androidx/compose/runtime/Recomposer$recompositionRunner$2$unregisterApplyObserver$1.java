package androidx.compose.runtime;

import Q5.I;
import Q5.s;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import c6.InterfaceC2072n;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.InterfaceC3470o;
import q6.w;

/* loaded from: classes.dex */
final class Recomposer$recompositionRunner$2$unregisterApplyObserver$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2$unregisterApplyObserver$1(Recomposer recomposer) {
        super(2);
        this.this$0 = recomposer;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) obj, (Snapshot) obj2);
        return I.f8786a;
    }

    public final void invoke(Set<? extends Object> set, Snapshot snapshot) {
        w wVar;
        InterfaceC3470o interfaceC3470o;
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            try {
                wVar = recomposer._state;
                if (((Recomposer.State) wVar.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                    if (set instanceof IdentityArraySet) {
                        IdentityArraySet identityArraySet = (IdentityArraySet) set;
                        Object[] values = identityArraySet.getValues();
                        int size = identityArraySet.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            Object obj2 = values[i8];
                            AbstractC3292y.g(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            if (!(obj2 instanceof StateObjectImpl) || ((StateObjectImpl) obj2).m2583isReadInh_f27i8$runtime_release(ReaderKind.m2568constructorimpl(1))) {
                                recomposer.snapshotInvalidations.add(obj2);
                            }
                        }
                    } else {
                        for (Object obj3 : set) {
                            if (!(obj3 instanceof StateObjectImpl) || ((StateObjectImpl) obj3).m2583isReadInh_f27i8$runtime_release(ReaderKind.m2568constructorimpl(1))) {
                                recomposer.snapshotInvalidations.add(obj3);
                            }
                        }
                    }
                    interfaceC3470o = recomposer.deriveStateLocked();
                } else {
                    interfaceC3470o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC3470o != null) {
            s.a aVar = s.f8810b;
            interfaceC3470o.resumeWith(s.b(I.f8786a));
        }
    }
}
