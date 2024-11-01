package androidx.compose.runtime;

import Q5.I;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.InterfaceC3470o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Recomposer$runFrameLoop$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ProduceFrameSignal $frameSignal;
    final /* synthetic */ List<ControlledComposition> $toApply;
    final /* synthetic */ List<ControlledComposition> $toRecompose;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runFrameLoop$2(Recomposer recomposer, List<ControlledComposition> list, List<ControlledComposition> list2, ProduceFrameSignal produceFrameSignal) {
        super(1);
        this.this$0 = recomposer;
        this.$toRecompose = list;
        this.$toApply = list2;
        this.$frameSignal = produceFrameSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    public final InterfaceC3470o invoke(long j8) {
        boolean hasBroadcastFrameClockAwaiters;
        Object beginSection;
        List list;
        int i8;
        List list2;
        InterfaceC3470o deriveStateLocked;
        ControlledComposition performRecompose;
        BroadcastFrameClock broadcastFrameClock;
        hasBroadcastFrameClockAwaiters = this.this$0.getHasBroadcastFrameClockAwaiters();
        if (hasBroadcastFrameClockAwaiters) {
            Recomposer recomposer = this.this$0;
            Trace trace = Trace.INSTANCE;
            beginSection = trace.beginSection("Recomposer:animation");
            try {
                broadcastFrameClock = recomposer.broadcastFrameClock;
                broadcastFrameClock.sendFrame(j8);
                Snapshot.Companion.sendApplyNotifications();
                I i9 = I.f8786a;
                trace.endSection(beginSection);
            } finally {
            }
        }
        Recomposer recomposer2 = this.this$0;
        List<ControlledComposition> list3 = this.$toRecompose;
        List<ControlledComposition> list4 = this.$toApply;
        ProduceFrameSignal produceFrameSignal = this.$frameSignal;
        beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            recomposer2.recordComposerModifications();
            synchronized (recomposer2.stateLock) {
                try {
                    list = recomposer2.compositionsAwaitingApply;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list4.add((ControlledComposition) list.get(i10));
                    }
                    list2 = recomposer2.compositionsAwaitingApply;
                    list2.clear();
                    List list5 = recomposer2.compositionInvalidations;
                    int size2 = list5.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        list3.add((ControlledComposition) list5.get(i11));
                    }
                    recomposer2.compositionInvalidations.clear();
                    produceFrameSignal.takeFrameRequestLocked();
                    I i12 = I.f8786a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            IdentityArraySet identityArraySet = new IdentityArraySet();
            try {
                int size3 = list3.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    performRecompose = recomposer2.performRecompose(list3.get(i13), identityArraySet);
                    if (performRecompose != null) {
                        list4.add(performRecompose);
                    }
                }
                list3.clear();
                if (!list4.isEmpty()) {
                    recomposer2.changeCount = recomposer2.getChangeCount() + 1;
                }
                try {
                    int size4 = list4.size();
                    for (i8 = 0; i8 < size4; i8++) {
                        list4.get(i8).applyChanges();
                    }
                    list4.clear();
                    synchronized (recomposer2.stateLock) {
                        deriveStateLocked = recomposer2.deriveStateLocked();
                    }
                    return deriveStateLocked;
                } catch (Throwable th2) {
                    list4.clear();
                    throw th2;
                }
            } catch (Throwable th3) {
                list3.clear();
                throw th3;
            }
        } finally {
        }
    }
}
