package androidx.compose.runtime.changelist;

import Q5.C1413h;
import Q5.I;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class Operation {
    public static final int $stable = 0;
    private final int ints;
    private final int objects;

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class AdvanceSlotsBy extends Operation {
        public static final int $stable = 0;
        public static final AdvanceSlotsBy INSTANCE = new AdvanceSlotsBy();

        private AdvanceSlotsBy() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.advanceBy(operationArgContainer.mo2543getIntw8GmfQM(IntParameter.m2511constructorimpl(0)));
        }

        /* renamed from: getDistance-jn0FJLE, reason: not valid java name */
        public final int m2487getDistancejn0FJLE() {
            return IntParameter.m2511constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo2485intParamNamew8GmfQM(int i8) {
            if (IntParameter.m2513equalsimpl0(i8, IntParameter.m2511constructorimpl(0))) {
                return "distance";
            }
            return super.mo2485intParamNamew8GmfQM(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class ApplyChangeList extends Operation {
        public static final int $stable = 0;
        public static final ApplyChangeList INSTANCE = new ApplyChangeList();

        private ApplyChangeList() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int i8;
            IntRef intRef = (IntRef) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(1));
            if (intRef != null) {
                i8 = intRef.getElement();
            } else {
                i8 = 0;
            }
            ChangeList changeList = (ChangeList) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0));
            if (i8 > 0) {
                applier = new OffsetApplier(applier, i8);
            }
            changeList.executeAndFlushAllPendingChanges(applier, slotWriter, rememberManager);
        }

        /* renamed from: getChanges-HpuvwBQ, reason: not valid java name */
        public final int m2488getChangesHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        /* renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m2489getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "changes";
            }
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(1))) {
                return "effectiveNodeIndex";
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class CopyNodesToNewAnchorLocation extends Operation {
        public static final int $stable = 0;
        public static final CopyNodesToNewAnchorLocation INSTANCE = new CopyNodesToNewAnchorLocation();

        private CopyNodesToNewAnchorLocation() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int element = ((IntRef) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0))).getElement();
            List list = (List) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(1));
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = list.get(i8);
                AbstractC3292y.g(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i9 = element + i8;
                applier.insertBottomUp(i9, obj);
                applier.insertTopDown(i9, obj);
            }
        }

        /* renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m2490getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        /* renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m2491getNodesHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "effectiveNodeIndex";
            }
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(1))) {
                return "nodes";
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class CopySlotTableToAnchorLocation extends Operation {
        public static final int $stable = 0;
        public static final CopySlotTableToAnchorLocation INSTANCE = new CopySlotTableToAnchorLocation();

        private CopySlotTableToAnchorLocation() {
            super(0, 4, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(2));
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(3));
            CompositionContext compositionContext = (CompositionContext) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(1));
            MovableContentState movableContentState = (MovableContentState) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0));
            if (movableContentState == null && (movableContentState = compositionContext.movableContentStateResolve$runtime_release(movableContentStateReference)) == null) {
                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                throw new C1413h();
            }
            List<Anchor> moveIntoGroupFrom = slotWriter.moveIntoGroupFrom(1, movableContentState.getSlotTable$runtime_release(), 2);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            ControlledComposition composition$runtime_release = movableContentStateReference2.getComposition$runtime_release();
            AbstractC3292y.g(composition$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            companion.adoptAnchoredScopes$runtime_release(slotWriter, moveIntoGroupFrom, (RecomposeScopeOwner) composition$runtime_release);
        }

        /* renamed from: getFrom-HpuvwBQ, reason: not valid java name */
        public final int m2492getFromHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(2);
        }

        /* renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m2493getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(1);
        }

        /* renamed from: getResolvedState-HpuvwBQ, reason: not valid java name */
        public final int m2494getResolvedStateHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        /* renamed from: getTo-HpuvwBQ, reason: not valid java name */
        public final int m2495getToHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "resolvedState";
            }
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(1))) {
                return "resolvedCompositionContext";
            }
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(2))) {
                return TypedValues.TransitionType.S_FROM;
            }
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(3))) {
                return TypedValues.TransitionType.S_TO;
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class DeactivateCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final DeactivateCurrentGroup INSTANCE = new DeactivateCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private DeactivateCurrentGroup() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.DeactivateCurrentGroup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ComposerKt.deactivateCurrentGroup(slotWriter, rememberManager);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class DetermineMovableContentNodeIndex extends Operation {
        public static final int $stable = 0;
        public static final DetermineMovableContentNodeIndex INSTANCE = new DetermineMovableContentNodeIndex();

        private DetermineMovableContentNodeIndex() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            IntRef intRef = (IntRef) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0));
            Anchor anchor = (Anchor) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(1));
            AbstractC3292y.g(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            intRef.setElement(OperationKt.access$positionToInsert(slotWriter, anchor, applier));
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2496getAnchorHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(1);
        }

        /* renamed from: getEffectiveNodeIndexOut-HpuvwBQ, reason: not valid java name */
        public final int m2497getEffectiveNodeIndexOutHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "effectiveNodeIndexOut";
            }
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(1))) {
                return "anchor";
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class Downs extends Operation {
        public static final int $stable = 0;
        public static final Downs INSTANCE = new Downs();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private Downs() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.Downs.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            AbstractC3292y.g(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0))) {
                applier.down(obj);
            }
        }

        /* renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m2498getNodesHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "nodes";
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class EndCompositionScope extends Operation {
        public static final int $stable = 0;
        public static final EndCompositionScope INSTANCE = new EndCompositionScope();

        private EndCompositionScope() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ((Function1) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0))).invoke((Composition) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(1)));
        }

        /* renamed from: getAction-HpuvwBQ, reason: not valid java name */
        public final int m2499getActionHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        /* renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m2500getCompositionHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "anchor";
            }
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(1))) {
                return "composition";
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class EndCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final EndCurrentGroup INSTANCE = new EndCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private EndCurrentGroup() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.EndCurrentGroup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.endGroup();
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class EndMovableContentPlacement extends Operation {
        public static final int $stable = 0;
        public static final EndMovableContentPlacement INSTANCE = new EndMovableContentPlacement();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private EndMovableContentPlacement() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.EndMovableContentPlacement.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            AbstractC3292y.g(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            OperationKt.access$positionToParentOf(slotWriter, applier, 0);
            slotWriter.endGroup();
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class EnsureGroupStarted extends Operation {
        public static final int $stable = 0;
        public static final EnsureGroupStarted INSTANCE = new EnsureGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private EnsureGroupStarted() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.EnsureGroupStarted.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.ensureStarted((Anchor) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0)));
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2501getAnchorHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "anchor";
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class EnsureRootGroupStarted extends Operation {
        public static final int $stable = 0;
        public static final EnsureRootGroupStarted INSTANCE = new EnsureRootGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private EnsureRootGroupStarted() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.EnsureRootGroupStarted.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.ensureStarted(0);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class InsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final InsertNodeFixup INSTANCE = new InsertNodeFixup();

        private InsertNodeFixup() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Object invoke = ((Function0) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0))).invoke();
            Anchor anchor = (Anchor) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(1));
            int mo2543getIntw8GmfQM = operationArgContainer.mo2543getIntw8GmfQM(IntParameter.m2511constructorimpl(0));
            AbstractC3292y.g(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotWriter.updateNode(anchor, invoke);
            applier.insertTopDown(mo2543getIntw8GmfQM, invoke);
            applier.down(invoke);
        }

        /* renamed from: getFactory-HpuvwBQ, reason: not valid java name */
        public final int m2502getFactoryHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        /* renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2503getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(1);
        }

        /* renamed from: getInsertIndex-jn0FJLE, reason: not valid java name */
        public final int m2504getInsertIndexjn0FJLE() {
            return IntParameter.m2511constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo2485intParamNamew8GmfQM(int i8) {
            if (IntParameter.m2513equalsimpl0(i8, IntParameter.m2511constructorimpl(0))) {
                return "insertIndex";
            }
            return super.mo2485intParamNamew8GmfQM(i8);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "factory";
            }
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(1))) {
                return "groupAnchor";
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class InsertSlots extends Operation {
        public static final int $stable = 0;
        public static final InsertSlots INSTANCE = new InsertSlots();

        private InsertSlots() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0));
            slotWriter.beginInsert();
            slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
            slotWriter.endInsert();
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2505getAnchorHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        /* renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m2506getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "anchor";
            }
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(1))) {
                return TypedValues.TransitionType.S_FROM;
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class InsertSlotsWithFixups extends Operation {
        public static final int $stable = 0;
        public static final InsertSlotsWithFixups INSTANCE = new InsertSlotsWithFixups();

        private InsertSlotsWithFixups() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0));
            FixupList fixupList = (FixupList) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(2));
            SlotWriter openWriter = slotTable.openWriter();
            try {
                fixupList.executeAndFlushAllPendingFixups(applier, openWriter, rememberManager);
                I i8 = I.f8786a;
                openWriter.close();
                slotWriter.beginInsert();
                slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
                slotWriter.endInsert();
            } catch (Throwable th) {
                openWriter.close();
                throw th;
            }
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2507getAnchorHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        /* renamed from: getFixups-HpuvwBQ, reason: not valid java name */
        public final int m2508getFixupsHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(2);
        }

        /* renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m2509getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "anchor";
            }
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(1))) {
                return TypedValues.TransitionType.S_FROM;
            }
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(2))) {
                return "fixups";
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    /* loaded from: classes.dex */
    public static final class IntParameter {
        private final int offset;

        private /* synthetic */ IntParameter(int i8) {
            this.offset = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ IntParameter m2510boximpl(int i8) {
            return new IntParameter(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m2511constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m2512equalsimpl(int i8, Object obj) {
            return (obj instanceof IntParameter) && i8 == ((IntParameter) obj).m2516unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m2513equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m2514hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m2515toStringimpl(int i8) {
            return "IntParameter(offset=" + i8 + ')';
        }

        public boolean equals(Object obj) {
            return m2512equalsimpl(this.offset, obj);
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return m2514hashCodeimpl(this.offset);
        }

        public String toString() {
            return m2515toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m2516unboximpl() {
            return this.offset;
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class MoveCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final MoveCurrentGroup INSTANCE = new MoveCurrentGroup();

        private MoveCurrentGroup() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.moveGroup(operationArgContainer.mo2543getIntw8GmfQM(IntParameter.m2511constructorimpl(0)));
        }

        /* renamed from: getOffset-jn0FJLE, reason: not valid java name */
        public final int m2517getOffsetjn0FJLE() {
            return IntParameter.m2511constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo2485intParamNamew8GmfQM(int i8) {
            if (IntParameter.m2513equalsimpl0(i8, IntParameter.m2511constructorimpl(0))) {
                return TypedValues.CycleType.S_WAVE_OFFSET;
            }
            return super.mo2485intParamNamew8GmfQM(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class MoveNode extends Operation {
        public static final int $stable = 0;
        public static final MoveNode INSTANCE = new MoveNode();

        private MoveNode() {
            super(3, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            applier.move(operationArgContainer.mo2543getIntw8GmfQM(IntParameter.m2511constructorimpl(0)), operationArgContainer.mo2543getIntw8GmfQM(IntParameter.m2511constructorimpl(1)), operationArgContainer.mo2543getIntw8GmfQM(IntParameter.m2511constructorimpl(2)));
        }

        /* renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m2518getCountjn0FJLE() {
            return IntParameter.m2511constructorimpl(2);
        }

        /* renamed from: getFrom-jn0FJLE, reason: not valid java name */
        public final int m2519getFromjn0FJLE() {
            return IntParameter.m2511constructorimpl(0);
        }

        /* renamed from: getTo-jn0FJLE, reason: not valid java name */
        public final int m2520getTojn0FJLE() {
            return IntParameter.m2511constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo2485intParamNamew8GmfQM(int i8) {
            if (IntParameter.m2513equalsimpl0(i8, IntParameter.m2511constructorimpl(0))) {
                return TypedValues.TransitionType.S_FROM;
            }
            if (IntParameter.m2513equalsimpl0(i8, IntParameter.m2511constructorimpl(1))) {
                return TypedValues.TransitionType.S_TO;
            }
            if (IntParameter.m2513equalsimpl0(i8, IntParameter.m2511constructorimpl(2))) {
                return "count";
            }
            return super.mo2485intParamNamew8GmfQM(i8);
        }
    }

    /* loaded from: classes.dex */
    public static final class ObjectParameter<T> {
        private final int offset;

        private /* synthetic */ ObjectParameter(int i8) {
            this.offset = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ObjectParameter m2521boximpl(int i8) {
            return new ObjectParameter(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static <T> int m2522constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m2523equalsimpl(int i8, Object obj) {
            return (obj instanceof ObjectParameter) && i8 == ((ObjectParameter) obj).m2527unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m2524equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m2525hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m2526toStringimpl(int i8) {
            return "ObjectParameter(offset=" + i8 + ')';
        }

        public boolean equals(Object obj) {
            return m2523equalsimpl(this.offset, obj);
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return m2525hashCodeimpl(this.offset);
        }

        public String toString() {
            return m2526toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m2527unboximpl() {
            return this.offset;
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class PostInsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final PostInsertNodeFixup INSTANCE = new PostInsertNodeFixup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private PostInsertNodeFixup() {
            /*
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Anchor anchor = (Anchor) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0));
            int mo2543getIntw8GmfQM = operationArgContainer.mo2543getIntw8GmfQM(IntParameter.m2511constructorimpl(0));
            applier.up();
            AbstractC3292y.g(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            applier.insertBottomUp(mo2543getIntw8GmfQM, slotWriter.node(anchor));
        }

        /* renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2528getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        /* renamed from: getInsertIndex-jn0FJLE, reason: not valid java name */
        public final int m2529getInsertIndexjn0FJLE() {
            return IntParameter.m2511constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo2485intParamNamew8GmfQM(int i8) {
            if (IntParameter.m2513equalsimpl0(i8, IntParameter.m2511constructorimpl(0))) {
                return "insertIndex";
            }
            return super.mo2485intParamNamew8GmfQM(i8);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "groupAnchor";
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class ReleaseMovableGroupAtCurrent extends Operation {
        public static final int $stable = 0;
        public static final ReleaseMovableGroupAtCurrent INSTANCE = new ReleaseMovableGroupAtCurrent();

        private ReleaseMovableGroupAtCurrent() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            OperationKt.access$releaseMovableGroupAtCurrent((ControlledComposition) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0)), (CompositionContext) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(1)), (MovableContentStateReference) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(2)), slotWriter);
        }

        /* renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m2530getCompositionHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        /* renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m2531getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(1);
        }

        /* renamed from: getReference-HpuvwBQ, reason: not valid java name */
        public final int m2532getReferenceHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "composition";
            }
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(1))) {
                return "parentCompositionContext";
            }
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(2))) {
                return "reference";
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class Remember extends Operation {
        public static final int $stable = 0;
        public static final Remember INSTANCE = new Remember();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private Remember() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.Remember.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            rememberManager.remembering((RememberObserver) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0)));
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m2533getValueHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "value";
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class RemoveCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final RemoveCurrentGroup INSTANCE = new RemoveCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private RemoveCurrentGroup() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.RemoveCurrentGroup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ComposerKt.removeCurrentGroup(slotWriter, rememberManager);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class RemoveNode extends Operation {
        public static final int $stable = 0;
        public static final RemoveNode INSTANCE = new RemoveNode();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private RemoveNode() {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                r2 = 2
                r3.<init>(r2, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.RemoveNode.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            applier.remove(operationArgContainer.mo2543getIntw8GmfQM(IntParameter.m2511constructorimpl(0)), operationArgContainer.mo2543getIntw8GmfQM(IntParameter.m2511constructorimpl(1)));
        }

        /* renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m2534getCountjn0FJLE() {
            return IntParameter.m2511constructorimpl(1);
        }

        /* renamed from: getRemoveIndex-jn0FJLE, reason: not valid java name */
        public final int m2535getRemoveIndexjn0FJLE() {
            return IntParameter.m2511constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo2485intParamNamew8GmfQM(int i8) {
            if (IntParameter.m2513equalsimpl0(i8, IntParameter.m2511constructorimpl(0))) {
                return "removeIndex";
            }
            if (IntParameter.m2513equalsimpl0(i8, IntParameter.m2511constructorimpl(1))) {
                return "count";
            }
            return super.mo2485intParamNamew8GmfQM(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class ResetSlots extends Operation {
        public static final int $stable = 0;
        public static final ResetSlots INSTANCE = new ResetSlots();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private ResetSlots() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.ResetSlots.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.reset();
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class SideEffect extends Operation {
        public static final int $stable = 0;
        public static final SideEffect INSTANCE = new SideEffect();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private SideEffect() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.SideEffect.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            rememberManager.sideEffect((Function0) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0)));
        }

        /* renamed from: getEffect-HpuvwBQ, reason: not valid java name */
        public final int m2536getEffectHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "effect";
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class SkipToEndOfCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final SkipToEndOfCurrentGroup INSTANCE = new SkipToEndOfCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private SkipToEndOfCurrentGroup() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.SkipToEndOfCurrentGroup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.skipToGroupEnd();
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class TestOperation extends Operation {
        public static final int $stable = 8;
        private final InterfaceC2073o block;
        private final List<IntParameter> intParams;
        private final List<ObjectParameter<Object>> objParams;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.runtime.changelist.Operation$TestOperation$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2073o {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(3);
            }

            public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            }

            @Override // c6.InterfaceC2073o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                return I.f8786a;
            }
        }

        public TestOperation() {
            this(0, 0, null, 7, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            this.block.invoke(applier, slotWriter, rememberManager);
        }

        public final InterfaceC2073o getBlock() {
            return this.block;
        }

        public final List<IntParameter> getIntParams() {
            return this.intParams;
        }

        public final List<ObjectParameter<Object>> getObjParams() {
            return this.objParams;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String toString() {
            return "TestOperation(ints = " + getInts() + ", objects = " + getObjects() + ")@" + System.identityHashCode(this);
        }

        public /* synthetic */ TestOperation(int i8, int i9, InterfaceC2073o interfaceC2073o, int i10, AbstractC3284p abstractC3284p) {
            this((i10 & 1) != 0 ? 0 : i8, (i10 & 2) != 0 ? 0 : i9, (i10 & 4) != 0 ? AnonymousClass1.INSTANCE : interfaceC2073o);
        }

        public TestOperation(int i8, int i9, InterfaceC2073o interfaceC2073o) {
            super(i8, i9, null);
            this.block = interfaceC2073o;
            ArrayList arrayList = new ArrayList(i8);
            for (int i10 = 0; i10 < i8; i10++) {
                arrayList.add(IntParameter.m2510boximpl(IntParameter.m2511constructorimpl(i10)));
            }
            this.intParams = arrayList;
            ArrayList arrayList2 = new ArrayList(i9);
            for (int i11 = 0; i11 < i9; i11++) {
                arrayList2.add(ObjectParameter.m2521boximpl(ObjectParameter.m2522constructorimpl(i11)));
            }
            this.objParams = arrayList2;
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class UpdateAuxData extends Operation {
        public static final int $stable = 0;
        public static final UpdateAuxData INSTANCE = new UpdateAuxData();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private UpdateAuxData() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.UpdateAuxData.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.updateAux(operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0)));
        }

        /* renamed from: getData-HpuvwBQ, reason: not valid java name */
        public final int m2537getDataHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return DataSchemeDataSource.SCHEME_DATA;
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class UpdateNode extends Operation {
        public static final int $stable = 0;
        public static final UpdateNode INSTANCE = new UpdateNode();

        private UpdateNode() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ((InterfaceC2072n) operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(1))).invoke(applier.getCurrent(), operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0)));
        }

        /* renamed from: getBlock-HpuvwBQ, reason: not valid java name */
        public final int m2538getBlockHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(1);
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m2539getValueHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "value";
            }
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(1))) {
                return "block";
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class UpdateValue extends Operation {
        public static final int $stable = 0;
        public static final UpdateValue INSTANCE = new UpdateValue();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private UpdateValue() {
            /*
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.UpdateValue.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Object mo2544getObject31yXWZQ = operationArgContainer.mo2544getObject31yXWZQ(ObjectParameter.m2522constructorimpl(0));
            int mo2543getIntw8GmfQM = operationArgContainer.mo2543getIntw8GmfQM(IntParameter.m2511constructorimpl(0));
            if (mo2544getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering(((RememberObserverHolder) mo2544getObject31yXWZQ).getWrapped());
            }
            Object obj = slotWriter.set(mo2543getIntw8GmfQM, mo2544getObject31yXWZQ);
            if (obj instanceof RememberObserverHolder) {
                rememberManager.forgetting(((RememberObserverHolder) obj).getWrapped());
            } else if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }

        /* renamed from: getGroupSlotIndex-jn0FJLE, reason: not valid java name */
        public final int m2540getGroupSlotIndexjn0FJLE() {
            return IntParameter.m2511constructorimpl(0);
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m2541getValueHpuvwBQ() {
            return ObjectParameter.m2522constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo2485intParamNamew8GmfQM(int i8) {
            if (IntParameter.m2513equalsimpl0(i8, IntParameter.m2511constructorimpl(0))) {
                return "groupSlotIndex";
            }
            return super.mo2485intParamNamew8GmfQM(i8);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo2486objectParamName31yXWZQ(int i8) {
            if (ObjectParameter.m2524equalsimpl0(i8, ObjectParameter.m2522constructorimpl(0))) {
                return "value";
            }
            return super.mo2486objectParamName31yXWZQ(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class Ups extends Operation {
        public static final int $stable = 0;
        public static final Ups INSTANCE = new Ups();

        private Ups() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int mo2543getIntw8GmfQM = operationArgContainer.mo2543getIntw8GmfQM(IntParameter.m2511constructorimpl(0));
            for (int i8 = 0; i8 < mo2543getIntw8GmfQM; i8++) {
                applier.up();
            }
        }

        /* renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m2542getCountjn0FJLE() {
            return IntParameter.m2511constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo2485intParamNamew8GmfQM(int i8) {
            if (IntParameter.m2513equalsimpl0(i8, IntParameter.m2511constructorimpl(0))) {
                return "count";
            }
            return super.mo2485intParamNamew8GmfQM(i8);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class UseCurrentNode extends Operation {
        public static final int $stable = 0;
        public static final UseCurrentNode INSTANCE = new UseCurrentNode();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private UseCurrentNode() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.UseCurrentNode.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Object current = applier.getCurrent();
            AbstractC3292y.g(current, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((ComposeNodeLifecycleCallback) current).onReuse();
        }
    }

    public /* synthetic */ Operation(int i8, int i9, AbstractC3284p abstractC3284p) {
        this(i8, i9);
    }

    public abstract void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager);

    public final int getInts() {
        return this.ints;
    }

    public final String getName() {
        String b9 = U.b(getClass()).b();
        if (b9 == null) {
            return "";
        }
        return b9;
    }

    public final int getObjects() {
        return this.objects;
    }

    /* renamed from: intParamName-w8GmfQM, reason: not valid java name */
    public String mo2485intParamNamew8GmfQM(int i8) {
        return "IntParameter(" + i8 + ')';
    }

    /* renamed from: objectParamName-31yXWZQ, reason: not valid java name */
    public String mo2486objectParamName31yXWZQ(int i8) {
        return "ObjectParameter(" + i8 + ')';
    }

    public String toString() {
        return getName();
    }

    private Operation(int i8, int i9) {
        this.ints = i8;
        this.objects = i9;
    }

    public /* synthetic */ Operation(int i8, int i9, int i10, AbstractC3284p abstractC3284p) {
        this((i10 & 1) != 0 ? 0 : i8, (i10 & 2) != 0 ? 0 : i9, null);
    }
}
