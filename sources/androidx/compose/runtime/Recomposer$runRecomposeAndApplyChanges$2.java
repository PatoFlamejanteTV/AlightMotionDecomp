package androidx.compose.runtime;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import c6.InterfaceC2073o;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {540, 551}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ IdentityArraySet<ControlledComposition> $alreadyComposed;
        final /* synthetic */ IdentityArraySet<Object> $modifiedValues;
        final /* synthetic */ List<ControlledComposition> $toApply;
        final /* synthetic */ Set<ControlledComposition> $toComplete;
        final /* synthetic */ List<MovableContentStateReference> $toInsert;
        final /* synthetic */ Set<ControlledComposition> $toLateApply;
        final /* synthetic */ List<ControlledComposition> $toRecompose;
        final /* synthetic */ Recomposer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Recomposer recomposer, IdentityArraySet<Object> identityArraySet, IdentityArraySet<ControlledComposition> identityArraySet2, List<ControlledComposition> list, List<MovableContentStateReference> list2, Set<ControlledComposition> set, List<ControlledComposition> list3, Set<ControlledComposition> set2) {
            super(1);
            this.this$0 = recomposer;
            this.$modifiedValues = identityArraySet;
            this.$alreadyComposed = identityArraySet2;
            this.$toRecompose = list;
            this.$toInsert = list2;
            this.$toLateApply = set;
            this.$toApply = list3;
            this.$toComplete = set2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return I.f8786a;
        }

        public final void invoke(long j8) {
            boolean hasBroadcastFrameClockAwaiters;
            Object beginSection;
            List performInsertValues;
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
                    I i8 = I.f8786a;
                    trace.endSection(beginSection);
                } finally {
                }
            }
            Recomposer recomposer2 = this.this$0;
            IdentityArraySet<Object> identityArraySet = this.$modifiedValues;
            IdentityArraySet<ControlledComposition> identityArraySet2 = this.$alreadyComposed;
            List<ControlledComposition> list = this.$toRecompose;
            List<MovableContentStateReference> list2 = this.$toInsert;
            Set<ControlledComposition> set = this.$toLateApply;
            List<ControlledComposition> list3 = this.$toApply;
            Set<ControlledComposition> set2 = this.$toComplete;
            beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
            try {
                recomposer2.recordComposerModifications();
                synchronized (recomposer2.stateLock) {
                    try {
                        List list4 = recomposer2.compositionInvalidations;
                        int size = list4.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            list.add((ControlledComposition) list4.get(i9));
                        }
                        recomposer2.compositionInvalidations.clear();
                        I i10 = I.f8786a;
                    } finally {
                    }
                }
                identityArraySet.clear();
                identityArraySet2.clear();
                while (true) {
                    if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                        break;
                    }
                    try {
                        try {
                            int size2 = list.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                ControlledComposition controlledComposition = list.get(i11);
                                identityArraySet2.add(controlledComposition);
                                performRecompose = recomposer2.performRecompose(controlledComposition, identityArraySet);
                                if (performRecompose != null) {
                                    list3.add(performRecompose);
                                }
                            }
                            list.clear();
                            if (identityArraySet.isNotEmpty()) {
                                synchronized (recomposer2.stateLock) {
                                    try {
                                        List knownCompositions = recomposer2.getKnownCompositions();
                                        int size3 = knownCompositions.size();
                                        for (int i12 = 0; i12 < size3; i12++) {
                                            ControlledComposition controlledComposition2 = (ControlledComposition) knownCompositions.get(i12);
                                            if (!identityArraySet2.contains(controlledComposition2) && controlledComposition2.observesAnyOf(identityArraySet)) {
                                                list.add(controlledComposition2);
                                            }
                                        }
                                        I i13 = I.f8786a;
                                    } finally {
                                    }
                                }
                            }
                            if (list.isEmpty()) {
                                try {
                                    Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list2, recomposer2);
                                    while (!list2.isEmpty()) {
                                        performInsertValues = recomposer2.performInsertValues(list2, identityArraySet);
                                        AbstractC1435t.C(set, performInsertValues);
                                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list2, recomposer2);
                                    }
                                } catch (Exception e8) {
                                    Recomposer.processCompositionError$default(recomposer2, e8, null, true, 2, null);
                                    Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet, identityArraySet2);
                                    return;
                                }
                            }
                        } catch (Exception e9) {
                            Recomposer.processCompositionError$default(recomposer2, e9, null, true, 2, null);
                            Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet, identityArraySet2);
                            list.clear();
                            return;
                        }
                    } catch (Throwable th) {
                        list.clear();
                        throw th;
                    }
                }
                if (!list3.isEmpty()) {
                    recomposer2.changeCount = recomposer2.getChangeCount() + 1;
                    try {
                        try {
                            int size4 = list3.size();
                            for (int i14 = 0; i14 < size4; i14++) {
                                set2.add(list3.get(i14));
                            }
                            int size5 = list3.size();
                            for (int i15 = 0; i15 < size5; i15++) {
                                list3.get(i15).applyChanges();
                            }
                            list3.clear();
                        } finally {
                            list3.clear();
                        }
                    } catch (Exception e10) {
                        Recomposer.processCompositionError$default(recomposer2, e10, null, false, 6, null);
                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet, identityArraySet2);
                        list3.clear();
                        return;
                    }
                }
                try {
                    if (!set.isEmpty()) {
                        try {
                            AbstractC1435t.C(set2, set);
                            Iterator<T> it = set.iterator();
                            while (it.hasNext()) {
                                ((ControlledComposition) it.next()).applyLateChanges();
                            }
                        } catch (Exception e11) {
                            Recomposer.processCompositionError$default(recomposer2, e11, null, false, 6, null);
                            Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet, identityArraySet2);
                            set.clear();
                            return;
                        }
                    }
                    try {
                        if (!set2.isEmpty()) {
                            try {
                                Iterator<T> it2 = set2.iterator();
                                while (it2.hasNext()) {
                                    ((ControlledComposition) it2.next()).changesApplied();
                                }
                            } catch (Exception e12) {
                                Recomposer.processCompositionError$default(recomposer2, e12, null, false, 6, null);
                                Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet, identityArraySet2);
                                set2.clear();
                                return;
                            }
                        }
                        synchronized (recomposer2.stateLock) {
                            recomposer2.deriveStateLocked();
                        }
                        Snapshot.Companion.notifyObjectsInitialized();
                        identityArraySet2.clear();
                        identityArraySet.clear();
                        recomposer2.compositionsRemoved = null;
                        I i16 = I.f8786a;
                    } finally {
                        set2.clear();
                    }
                } finally {
                    set.clear();
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, U5.d dVar) {
        super(3, dVar);
        this.this$0 = recomposer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$clearRecompositionState(List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, Set<ControlledComposition> set, Set<ControlledComposition> set2, IdentityArraySet<Object> identityArraySet, IdentityArraySet<ControlledComposition> identityArraySet2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
        identityArraySet.clear();
        identityArraySet2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
        List list2;
        List list3;
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                list2 = recomposer.compositionValuesAwaitingInsert;
                int size = list2.size();
                for (int i8 = 0; i8 < size; i8++) {
                    list.add((MovableContentStateReference) list2.get(i8));
                }
                list3 = recomposer.compositionValuesAwaitingInsert;
                list3.clear();
                I i9 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0133  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0116 -> B:6:0x011a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0126 -> B:7:0x0121). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2073o
    public final Object invoke(M m8, MonotonicFrameClock monotonicFrameClock, U5.d dVar) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, dVar);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(I.f8786a);
    }
}
