package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Z;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ChangeList implements OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();

    public static /* synthetic */ void pushExecuteOperationsIn$default(ChangeList changeList, ChangeList changeList2, IntRef intRef, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    public final void clear() {
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        this.operations.executeAndFlushAllPendingOperations(applier, slotWriter, rememberManager);
    }

    public final int getSize() {
        return this.operations.getSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void pushAdvanceSlotsBy(int i8) {
        Operations operations = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        Operations.WriteScope.m2555setIntA6tL2VI(Operations.WriteScope.m2550constructorimpl(operations), Operation.IntParameter.m2511constructorimpl(0), i8);
        if (operations.pushedIntMask == operations.createExpectedArgMask(advanceSlotsBy.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(advanceSlotsBy.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = advanceSlotsBy.getInts();
        int i9 = 0;
        for (int i10 = 0; i10 < ints; i10++) {
            if (((1 << i10) & operations.pushedIntMask) != 0) {
                if (i9 > 0) {
                    sb.append(", ");
                }
                sb.append(advanceSlotsBy.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i10)));
                i9++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = advanceSlotsBy.getObjects();
        int i11 = 0;
        for (int i12 = 0; i12 < objects; i12++) {
            if (((1 << i12) & operations.pushedObjectMask) != 0) {
                if (i9 > 0) {
                    sb3.append(", ");
                }
                sb3.append(advanceSlotsBy.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i12)));
                i11++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + advanceSlotsBy + ". Not all arguments were provided. Missing " + i9 + " int arguments (" + sb2 + ") and " + i11 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushCopyNodesToNewAnchorLocation(List<? extends Object> list, IntRef intRef) {
        if (!list.isEmpty()) {
            Operations operations = this.operations;
            Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
            operations.pushOp(copyNodesToNewAnchorLocation);
            Operations m2550constructorimpl = Operations.WriteScope.m2550constructorimpl(operations);
            Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(1), list);
            Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(0), intRef);
            if (operations.pushedIntMask != operations.createExpectedArgMask(copyNodesToNewAnchorLocation.getInts()) || operations.pushedObjectMask != operations.createExpectedArgMask(copyNodesToNewAnchorLocation.getObjects())) {
                StringBuilder sb = new StringBuilder();
                int ints = copyNodesToNewAnchorLocation.getInts();
                int i8 = 0;
                for (int i9 = 0; i9 < ints; i9++) {
                    if (((1 << i9) & operations.pushedIntMask) != 0) {
                        if (i8 > 0) {
                            sb.append(", ");
                        }
                        sb.append(copyNodesToNewAnchorLocation.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                        i8++;
                    }
                }
                String sb2 = sb.toString();
                AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb3 = new StringBuilder();
                int objects = copyNodesToNewAnchorLocation.getObjects();
                int i10 = 0;
                for (int i11 = 0; i11 < objects; i11++) {
                    if (((1 << i11) & operations.pushedObjectMask) != 0) {
                        if (i8 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(copyNodesToNewAnchorLocation.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                        i10++;
                    }
                }
                String sb4 = sb3.toString();
                AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
                throw new IllegalStateException(("Error while pushing " + copyNodesToNewAnchorLocation + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
            }
        }
    }

    public final void pushCopySlotTableToAnchorLocation(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        Operations operations = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        Operations m2550constructorimpl = Operations.WriteScope.m2550constructorimpl(operations);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(0), movableContentState);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(1), compositionContext);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(3), movableContentStateReference2);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(2), movableContentStateReference);
        if (operations.pushedIntMask == operations.createExpectedArgMask(copySlotTableToAnchorLocation.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(copySlotTableToAnchorLocation.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = copySlotTableToAnchorLocation.getInts();
        int i8 = 0;
        for (int i9 = 0; i9 < ints; i9++) {
            if (((1 << i9) & operations.pushedIntMask) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(copySlotTableToAnchorLocation.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                i8++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = copySlotTableToAnchorLocation.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & operations.pushedObjectMask) != 0) {
                if (i8 > 0) {
                    sb3.append(", ");
                }
                sb3.append(copySlotTableToAnchorLocation.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                i10++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + copySlotTableToAnchorLocation + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushDetermineMovableContentNodeIndex(IntRef intRef, Anchor anchor) {
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations m2550constructorimpl = Operations.WriteScope.m2550constructorimpl(operations);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(0), intRef);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(1), anchor);
        if (operations.pushedIntMask == operations.createExpectedArgMask(determineMovableContentNodeIndex.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(determineMovableContentNodeIndex.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = determineMovableContentNodeIndex.getInts();
        int i8 = 0;
        for (int i9 = 0; i9 < ints; i9++) {
            if (((1 << i9) & operations.pushedIntMask) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(determineMovableContentNodeIndex.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                i8++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = determineMovableContentNodeIndex.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & operations.pushedObjectMask) != 0) {
                if (i8 > 0) {
                    sb3.append(", ");
                }
                sb3.append(determineMovableContentNodeIndex.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                i10++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + determineMovableContentNodeIndex + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushDowns(Object[] objArr) {
        boolean z8;
        if (objArr.length == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            Operations operations = this.operations;
            Operation.Downs downs = Operation.Downs.INSTANCE;
            operations.pushOp(downs);
            Operations.WriteScope.m2556setObjectDKhxnng(Operations.WriteScope.m2550constructorimpl(operations), Operation.ObjectParameter.m2522constructorimpl(0), objArr);
            if (operations.pushedIntMask != operations.createExpectedArgMask(downs.getInts()) || operations.pushedObjectMask != operations.createExpectedArgMask(downs.getObjects())) {
                StringBuilder sb = new StringBuilder();
                int ints = downs.getInts();
                int i8 = 0;
                for (int i9 = 0; i9 < ints; i9++) {
                    if (((1 << i9) & operations.pushedIntMask) != 0) {
                        if (i8 > 0) {
                            sb.append(", ");
                        }
                        sb.append(downs.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                        i8++;
                    }
                }
                String sb2 = sb.toString();
                AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb3 = new StringBuilder();
                int objects = downs.getObjects();
                int i10 = 0;
                for (int i11 = 0; i11 < objects; i11++) {
                    if (((1 << i11) & operations.pushedObjectMask) != 0) {
                        if (i8 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(downs.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                        i10++;
                    }
                }
                String sb4 = sb3.toString();
                AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
                throw new IllegalStateException(("Error while pushing " + downs + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
            }
        }
    }

    public final void pushEndCompositionScope(Function1 function1, Composition composition) {
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        Operations m2550constructorimpl = Operations.WriteScope.m2550constructorimpl(operations);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(0), function1);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(1), composition);
        if (operations.pushedIntMask == operations.createExpectedArgMask(endCompositionScope.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(endCompositionScope.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = endCompositionScope.getInts();
        int i8 = 0;
        for (int i9 = 0; i9 < ints; i9++) {
            if (((1 << i9) & operations.pushedIntMask) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(endCompositionScope.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                i8++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = endCompositionScope.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & operations.pushedObjectMask) != 0) {
                if (i8 > 0) {
                    sb3.append(", ");
                }
                sb3.append(endCompositionScope.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                i10++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + endCompositionScope + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public final void pushEnsureGroupStarted(Anchor anchor) {
        Operations operations = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        Operations.WriteScope.m2556setObjectDKhxnng(Operations.WriteScope.m2550constructorimpl(operations), Operation.ObjectParameter.m2522constructorimpl(0), anchor);
        if (operations.pushedIntMask == operations.createExpectedArgMask(ensureGroupStarted.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(ensureGroupStarted.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = ensureGroupStarted.getInts();
        int i8 = 0;
        for (int i9 = 0; i9 < ints; i9++) {
            if (((1 << i9) & operations.pushedIntMask) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(ensureGroupStarted.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                i8++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = ensureGroupStarted.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & operations.pushedObjectMask) != 0) {
                if (i8 > 0) {
                    sb3.append(", ");
                }
                sb3.append(ensureGroupStarted.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                i10++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + ensureGroupStarted + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushExecuteOperationsIn(ChangeList changeList, IntRef intRef) {
        if (changeList.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations m2550constructorimpl = Operations.WriteScope.m2550constructorimpl(operations);
            Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(0), changeList);
            Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(1), intRef);
            if (operations.pushedIntMask != operations.createExpectedArgMask(applyChangeList.getInts()) || operations.pushedObjectMask != operations.createExpectedArgMask(applyChangeList.getObjects())) {
                StringBuilder sb = new StringBuilder();
                int ints = applyChangeList.getInts();
                int i8 = 0;
                for (int i9 = 0; i9 < ints; i9++) {
                    if (((1 << i9) & operations.pushedIntMask) != 0) {
                        if (i8 > 0) {
                            sb.append(", ");
                        }
                        sb.append(applyChangeList.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                        i8++;
                    }
                }
                String sb2 = sb.toString();
                AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb3 = new StringBuilder();
                int objects = applyChangeList.getObjects();
                int i10 = 0;
                for (int i11 = 0; i11 < objects; i11++) {
                    if (((1 << i11) & operations.pushedObjectMask) != 0) {
                        if (i8 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(applyChangeList.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                        i10++;
                    }
                }
                String sb4 = sb3.toString();
                AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
                throw new IllegalStateException(("Error while pushing " + applyChangeList + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
            }
        }
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable slotTable) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        Operations m2550constructorimpl = Operations.WriteScope.m2550constructorimpl(operations);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(0), anchor);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(1), slotTable);
        if (operations.pushedIntMask == operations.createExpectedArgMask(insertSlots.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(insertSlots.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = insertSlots.getInts();
        int i8 = 0;
        for (int i9 = 0; i9 < ints; i9++) {
            if (((1 << i9) & operations.pushedIntMask) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(insertSlots.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                i8++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = insertSlots.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & operations.pushedObjectMask) != 0) {
                if (i8 > 0) {
                    sb3.append(", ");
                }
                sb3.append(insertSlots.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                i10++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + insertSlots + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushMoveCurrentGroup(int i8) {
        Operations operations = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        Operations.WriteScope.m2555setIntA6tL2VI(Operations.WriteScope.m2550constructorimpl(operations), Operation.IntParameter.m2511constructorimpl(0), i8);
        if (operations.pushedIntMask == operations.createExpectedArgMask(moveCurrentGroup.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(moveCurrentGroup.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = moveCurrentGroup.getInts();
        int i9 = 0;
        for (int i10 = 0; i10 < ints; i10++) {
            if (((1 << i10) & operations.pushedIntMask) != 0) {
                if (i9 > 0) {
                    sb.append(", ");
                }
                sb.append(moveCurrentGroup.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i10)));
                i9++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = moveCurrentGroup.getObjects();
        int i11 = 0;
        for (int i12 = 0; i12 < objects; i12++) {
            if (((1 << i12) & operations.pushedObjectMask) != 0) {
                if (i9 > 0) {
                    sb3.append(", ");
                }
                sb3.append(moveCurrentGroup.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i12)));
                i11++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + moveCurrentGroup + ". Not all arguments were provided. Missing " + i9 + " int arguments (" + sb2 + ") and " + i11 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushMoveNode(int i8, int i9, int i10) {
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        Operations m2550constructorimpl = Operations.WriteScope.m2550constructorimpl(operations);
        Operations.WriteScope.m2555setIntA6tL2VI(m2550constructorimpl, Operation.IntParameter.m2511constructorimpl(1), i8);
        Operations.WriteScope.m2555setIntA6tL2VI(m2550constructorimpl, Operation.IntParameter.m2511constructorimpl(0), i9);
        Operations.WriteScope.m2555setIntA6tL2VI(m2550constructorimpl, Operation.IntParameter.m2511constructorimpl(2), i10);
        if (operations.pushedIntMask == operations.createExpectedArgMask(moveNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(moveNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = moveNode.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < ints; i12++) {
            if (((1 << i12) & operations.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb.append(", ");
                }
                sb.append(moveNode.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i12)));
                i11++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = moveNode.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < objects; i14++) {
            if (((1 << i14) & operations.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(moveNode.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i14)));
                i13++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + moveNode + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb2 + ") and " + i13 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushReleaseMovableGroupAtCurrent(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        Operations operations = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        Operations m2550constructorimpl = Operations.WriteScope.m2550constructorimpl(operations);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(0), controlledComposition);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(1), compositionContext);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(2), movableContentStateReference);
        if (operations.pushedIntMask == operations.createExpectedArgMask(releaseMovableGroupAtCurrent.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(releaseMovableGroupAtCurrent.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = releaseMovableGroupAtCurrent.getInts();
        int i8 = 0;
        for (int i9 = 0; i9 < ints; i9++) {
            if (((1 << i9) & operations.pushedIntMask) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(releaseMovableGroupAtCurrent.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                i8++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = releaseMovableGroupAtCurrent.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & operations.pushedObjectMask) != 0) {
                if (i8 > 0) {
                    sb3.append(", ");
                }
                sb3.append(releaseMovableGroupAtCurrent.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                i10++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + releaseMovableGroupAtCurrent + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushRemember(RememberObserver rememberObserver) {
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        Operations.WriteScope.m2556setObjectDKhxnng(Operations.WriteScope.m2550constructorimpl(operations), Operation.ObjectParameter.m2522constructorimpl(0), rememberObserver);
        if (operations.pushedIntMask == operations.createExpectedArgMask(remember.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(remember.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = remember.getInts();
        int i8 = 0;
        for (int i9 = 0; i9 < ints; i9++) {
            if (((1 << i9) & operations.pushedIntMask) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(remember.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                i8++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = remember.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & operations.pushedObjectMask) != 0) {
                if (i8 > 0) {
                    sb3.append(", ");
                }
                sb3.append(remember.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                i10++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + remember + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushRemoveNode(int i8, int i9) {
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        Operations m2550constructorimpl = Operations.WriteScope.m2550constructorimpl(operations);
        Operations.WriteScope.m2555setIntA6tL2VI(m2550constructorimpl, Operation.IntParameter.m2511constructorimpl(0), i8);
        Operations.WriteScope.m2555setIntA6tL2VI(m2550constructorimpl, Operation.IntParameter.m2511constructorimpl(1), i9);
        if (operations.pushedIntMask == operations.createExpectedArgMask(removeNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(removeNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = removeNode.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(removeNode.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i11)));
                i10++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = removeNode.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(removeNode.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i13)));
                i12++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + removeNode + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb2 + ") and " + i12 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushSideEffect(Function0 function0) {
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        Operations.WriteScope.m2556setObjectDKhxnng(Operations.WriteScope.m2550constructorimpl(operations), Operation.ObjectParameter.m2522constructorimpl(0), function0);
        if (operations.pushedIntMask == operations.createExpectedArgMask(sideEffect.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(sideEffect.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = sideEffect.getInts();
        int i8 = 0;
        for (int i9 = 0; i9 < ints; i9++) {
            if (((1 << i9) & operations.pushedIntMask) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(sideEffect.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                i8++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = sideEffect.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & operations.pushedObjectMask) != 0) {
                if (i8 > 0) {
                    sb3.append(", ");
                }
                sb3.append(sideEffect.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                i10++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + sideEffect + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushUpdateAuxData(Object obj) {
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        Operations.WriteScope.m2556setObjectDKhxnng(Operations.WriteScope.m2550constructorimpl(operations), Operation.ObjectParameter.m2522constructorimpl(0), obj);
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateAuxData.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateAuxData.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateAuxData.getInts();
        int i8 = 0;
        for (int i9 = 0; i9 < ints; i9++) {
            if (((1 << i9) & operations.pushedIntMask) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(updateAuxData.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                i8++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = updateAuxData.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & operations.pushedObjectMask) != 0) {
                if (i8 > 0) {
                    sb3.append(", ");
                }
                sb3.append(updateAuxData.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                i10++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + updateAuxData + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
    }

    public final <T, V> void pushUpdateNode(V v8, InterfaceC2072n interfaceC2072n) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations m2550constructorimpl = Operations.WriteScope.m2550constructorimpl(operations);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(0), v8);
        int m2522constructorimpl = Operation.ObjectParameter.m2522constructorimpl(1);
        AbstractC3292y.g(interfaceC2072n, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, m2522constructorimpl, (InterfaceC2072n) Z.d(interfaceC2072n, 2));
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateNode.getInts();
        int i8 = 0;
        for (int i9 = 0; i9 < ints; i9++) {
            if (((1 << i9) & operations.pushedIntMask) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(updateNode.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                i8++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = updateNode.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & operations.pushedObjectMask) != 0) {
                if (i8 > 0) {
                    sb3.append(", ");
                }
                sb3.append(updateNode.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                i10++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + updateNode + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushUpdateValue(Object obj, int i8) {
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        Operations m2550constructorimpl = Operations.WriteScope.m2550constructorimpl(operations);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(0), obj);
        Operations.WriteScope.m2555setIntA6tL2VI(m2550constructorimpl, Operation.IntParameter.m2511constructorimpl(0), i8);
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateValue.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateValue.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateValue.getInts();
        int i9 = 0;
        for (int i10 = 0; i10 < ints; i10++) {
            if (((1 << i10) & operations.pushedIntMask) != 0) {
                if (i9 > 0) {
                    sb.append(", ");
                }
                sb.append(updateValue.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i10)));
                i9++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = updateValue.getObjects();
        int i11 = 0;
        for (int i12 = 0; i12 < objects; i12++) {
            if (((1 << i12) & operations.pushedObjectMask) != 0) {
                if (i9 > 0) {
                    sb3.append(", ");
                }
                sb3.append(updateValue.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i12)));
                i11++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + updateValue + ". Not all arguments were provided. Missing " + i9 + " int arguments (" + sb2 + ") and " + i11 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushUps(int i8) {
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        Operations.WriteScope.m2555setIntA6tL2VI(Operations.WriteScope.m2550constructorimpl(operations), Operation.IntParameter.m2511constructorimpl(0), i8);
        if (operations.pushedIntMask == operations.createExpectedArgMask(ups.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(ups.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = ups.getInts();
        int i9 = 0;
        for (int i10 = 0; i10 < ints; i10++) {
            if (((1 << i10) & operations.pushedIntMask) != 0) {
                if (i9 > 0) {
                    sb.append(", ");
                }
                sb.append(ups.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i10)));
                i9++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = ups.getObjects();
        int i11 = 0;
        for (int i12 = 0; i12 < objects; i12++) {
            if (((1 << i12) & operations.pushedObjectMask) != 0) {
                if (i9 > 0) {
                    sb3.append(", ");
                }
                sb3.append(ups.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i12)));
                i11++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + ups + ". Not all arguments were provided. Missing " + i9 + " int arguments (" + sb2 + ") and " + i11 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushUseNode(Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeList instance containing");
        sb.append(getSize());
        sb.append(" operations");
        if (sb.length() > 0) {
            sb.append(":\n");
            sb.append(this.operations.toDebugString(str));
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable slotTable, FixupList fixupList) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        Operations m2550constructorimpl = Operations.WriteScope.m2550constructorimpl(operations);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(0), anchor);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(1), slotTable);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(2), fixupList);
        if (operations.pushedIntMask == operations.createExpectedArgMask(insertSlotsWithFixups.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(insertSlotsWithFixups.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = insertSlotsWithFixups.getInts();
        int i8 = 0;
        for (int i9 = 0; i9 < ints; i9++) {
            if (((1 << i9) & operations.pushedIntMask) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(insertSlotsWithFixups.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                i8++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = insertSlotsWithFixups.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & operations.pushedObjectMask) != 0) {
                if (i8 > 0) {
                    sb3.append(", ");
                }
                sb3.append(insertSlotsWithFixups.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                i10++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + insertSlotsWithFixups + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
    }
}
