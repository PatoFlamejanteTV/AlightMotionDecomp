package androidx.compose.runtime.changelist;

import Q5.C1413h;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3290w;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ComposerChangeListWriter {
    private static final int invalidGroupLocation = -2;
    private ChangeList changeList;
    private final ComposerImpl composer;
    private int moveCount;
    private int pendingUps;
    private boolean startedGroup;
    private int writersReaderDelta;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startedGroups = new IntStack();
    private boolean implicitRootStart = true;
    private Stack<Object> pendingDownNodes = new Stack<>();
    private int removeFrom = -1;
    private int moveFrom = -1;
    private int moveTo = -1;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public ComposerChangeListWriter(ComposerImpl composerImpl, ChangeList changeList) {
        this.composer = composerImpl;
        this.changeList = changeList;
    }

    private final void ensureGroupStarted(Anchor anchor) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureGroupStarted(anchor);
        this.startedGroup = true;
    }

    private final void ensureRootStarted() {
        if (!this.startedGroup && this.implicitRootStart) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.changeList.pushEnsureRootStarted();
            this.startedGroup = true;
        }
    }

    private final SlotReader getReader() {
        return this.composer.getReader$runtime_release();
    }

    public static /* synthetic */ void includeOperationsIn$default(ComposerChangeListWriter composerChangeListWriter, ChangeList changeList, IntRef intRef, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            intRef = null;
        }
        composerChangeListWriter.includeOperationsIn(changeList, intRef);
    }

    private final void pushApplierOperationPreamble() {
        pushPendingUpsAndDowns();
    }

    private final void pushPendingUpsAndDowns() {
        int i8 = this.pendingUps;
        if (i8 > 0) {
            this.changeList.pushUps(i8);
            this.pendingUps = 0;
        }
        if (this.pendingDownNodes.isNotEmpty()) {
            this.changeList.pushDowns(this.pendingDownNodes.toArray());
            this.pendingDownNodes.clear();
        }
    }

    private final void pushSlotEditingOperationPreamble() {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
    }

    private final void pushSlotTableOperationPreamble(boolean z8) {
        realizeOperationLocation(z8);
    }

    static /* synthetic */ void pushSlotTableOperationPreamble$default(ComposerChangeListWriter composerChangeListWriter, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        composerChangeListWriter.pushSlotTableOperationPreamble(z8);
    }

    private final void realizeMoveNode(int i8, int i9, int i10) {
        pushApplierOperationPreamble();
        this.changeList.pushMoveNode(i8, i9, i10);
    }

    private final void realizeNodeMovementOperations() {
        int i8 = this.moveCount;
        if (i8 > 0) {
            int i9 = this.removeFrom;
            if (i9 >= 0) {
                realizeRemoveNode(i9, i8);
                this.removeFrom = -1;
            } else {
                realizeMoveNode(this.moveTo, this.moveFrom, i8);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void realizeOperationLocation(boolean z8) {
        int currentGroup;
        boolean z9;
        if (z8) {
            currentGroup = getReader().getParent();
        } else {
            currentGroup = getReader().getCurrentGroup();
        }
        int i8 = currentGroup - this.writersReaderDelta;
        if (i8 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (i8 > 0) {
                this.changeList.pushAdvanceSlotsBy(i8);
                this.writersReaderDelta = currentGroup;
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Tried to seek backward".toString());
        throw new C1413h();
    }

    static /* synthetic */ void realizeOperationLocation$default(ComposerChangeListWriter composerChangeListWriter, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        composerChangeListWriter.realizeOperationLocation(z8);
    }

    private final void realizeRemoveNode(int i8, int i9) {
        pushApplierOperationPreamble();
        this.changeList.pushRemoveNode(i8, i9);
    }

    public final void copyNodesToNewAnchorLocation(List<? extends Object> list, IntRef intRef) {
        this.changeList.pushCopyNodesToNewAnchorLocation(list, intRef);
    }

    public final void copySlotTableToAnchorLocation(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        this.changeList.pushCopySlotTableToAnchorLocation(movableContentState, compositionContext, movableContentStateReference, movableContentStateReference2);
    }

    public final void deactivateCurrentGroup() {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushDeactivateCurrentGroup();
    }

    public final void determineMovableContentNodeIndex(IntRef intRef, Anchor anchor) {
        pushPendingUpsAndDowns();
        this.changeList.pushDetermineMovableContentNodeIndex(intRef, anchor);
    }

    public final void endCompositionScope(Function1 function1, Composition composition) {
        this.changeList.pushEndCompositionScope(function1, composition);
    }

    public final void endCurrentGroup() {
        boolean z8;
        int parent = getReader().getParent();
        if (this.startedGroups.peekOr(-1) <= parent) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (this.startedGroups.peekOr(-1) == parent) {
                pushSlotTableOperationPreamble$default(this, false, 1, null);
                this.startedGroups.pop();
                this.changeList.pushEndCurrentGroup();
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Missed recording an endGroup".toString());
        throw new C1413h();
    }

    public final void endMovableContentPlacement() {
        this.changeList.pushEndMovableContentPlacement();
        this.writersReaderDelta = 0;
    }

    public final void endNodeMovement() {
        realizeNodeMovementOperations();
    }

    public final void endNodeMovementAndDeleteNode(int i8, int i9) {
        int nodeCount;
        endNodeMovement();
        pushPendingUpsAndDowns();
        if (getReader().isNode(i9)) {
            nodeCount = 1;
        } else {
            nodeCount = getReader().nodeCount(i9);
        }
        if (nodeCount > 0) {
            removeNode(i8, nodeCount);
        }
    }

    public final void endRoot() {
        if (this.startedGroup) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.changeList.pushEndCurrentGroup();
            this.startedGroup = false;
        }
    }

    public final void finalizeComposition() {
        pushPendingUpsAndDowns();
        if (this.startedGroups.isEmpty()) {
            return;
        }
        ComposerKt.composeRuntimeError("Missed recording an endGroup()".toString());
        throw new C1413h();
    }

    public final ChangeList getChangeList() {
        return this.changeList;
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void includeOperationsIn(ChangeList changeList, IntRef intRef) {
        this.changeList.pushExecuteOperationsIn(changeList, intRef);
    }

    public final void insertSlots(Anchor anchor, SlotTable slotTable) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        this.changeList.pushInsertSlots(anchor, slotTable);
    }

    public final void moveCurrentGroup(int i8) {
        pushSlotEditingOperationPreamble();
        this.changeList.pushMoveCurrentGroup(i8);
    }

    public final void moveDown(Object obj) {
        this.pendingDownNodes.push(obj);
    }

    public final void moveNode(int i8, int i9, int i10) {
        if (i10 > 0) {
            int i11 = this.moveCount;
            if (i11 > 0 && this.moveFrom == i8 - i11 && this.moveTo == i9 - i11) {
                this.moveCount = i11 + i10;
                return;
            }
            realizeNodeMovementOperations();
            this.moveFrom = i8;
            this.moveTo = i9;
            this.moveCount = i10;
        }
    }

    public final void moveReaderRelativeTo(int i8) {
        this.writersReaderDelta += i8 - getReader().getCurrentGroup();
    }

    public final void moveReaderToAbsolute(int i8) {
        this.writersReaderDelta = i8;
    }

    public final void moveUp() {
        if (this.pendingDownNodes.isNotEmpty()) {
            this.pendingDownNodes.pop();
        } else {
            this.pendingUps++;
        }
    }

    public final void recordSlotEditing() {
        SlotReader reader;
        int parent;
        if (getReader().getSize() > 0 && this.startedGroups.peekOr(-2) != (parent = (reader = getReader()).getParent())) {
            ensureRootStarted();
            if (parent > 0) {
                Anchor anchor = reader.anchor(parent);
                this.startedGroups.push(parent);
                ensureGroupStarted(anchor);
            }
        }
    }

    public final void releaseMovableContent() {
        pushPendingUpsAndDowns();
        if (this.startedGroup) {
            skipToEndOfCurrentGroup();
            endRoot();
        }
    }

    public final void releaseMovableGroupAtCurrent(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        this.changeList.pushReleaseMovableGroupAtCurrent(controlledComposition, compositionContext, movableContentStateReference);
    }

    public final void remember(RememberObserver rememberObserver) {
        this.changeList.pushRemember(rememberObserver);
    }

    public final void removeCurrentGroup() {
        pushSlotEditingOperationPreamble();
        this.changeList.pushRemoveCurrentGroup();
        this.writersReaderDelta += getReader().getGroupSize();
    }

    public final void removeNode(int i8, int i9) {
        boolean z8;
        if (i9 > 0) {
            if (i8 >= 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                if (this.removeFrom == i8) {
                    this.moveCount += i9;
                    return;
                }
                realizeNodeMovementOperations();
                this.removeFrom = i8;
                this.moveCount = i9;
                return;
            }
            ComposerKt.composeRuntimeError(("Invalid remove index " + i8).toString());
            throw new C1413h();
        }
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
    }

    public final void resetTransientState() {
        this.startedGroup = false;
        this.startedGroups.clear();
        this.writersReaderDelta = 0;
    }

    public final void setChangeList(ChangeList changeList) {
        this.changeList = changeList;
    }

    public final void setImplicitRootStart(boolean z8) {
        this.implicitRootStart = z8;
    }

    public final void sideEffect(Function0 function0) {
        this.changeList.pushSideEffect(function0);
    }

    public final void skipToEndOfCurrentGroup() {
        this.changeList.pushSkipToEndOfCurrentGroup();
    }

    public final void updateAuxData(Object obj) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushUpdateAuxData(obj);
    }

    public final <T, V> void updateNode(V v8, InterfaceC2072n interfaceC2072n) {
        pushApplierOperationPreamble();
        this.changeList.pushUpdateNode(v8, interfaceC2072n);
    }

    public final void updateValue(Object obj, int i8) {
        pushSlotTableOperationPreamble(true);
        this.changeList.pushUpdateValue(obj, i8);
    }

    public final void useNode(Object obj) {
        pushApplierOperationPreamble();
        this.changeList.pushUseNode(obj);
    }

    public final void withChangeList(ChangeList changeList, Function0 function0) {
        ChangeList changeList2 = getChangeList();
        try {
            setChangeList(changeList);
            function0.invoke();
        } finally {
            AbstractC3290w.b(1);
            setChangeList(changeList2);
            AbstractC3290w.a(1);
        }
    }

    public final void withoutImplicitRootStart(Function0 function0) {
        boolean implicitRootStart = getImplicitRootStart();
        try {
            setImplicitRootStart(false);
            function0.invoke();
        } finally {
            AbstractC3290w.b(1);
            setImplicitRootStart(implicitRootStart);
            AbstractC3290w.a(1);
        }
    }

    public final void insertSlots(Anchor anchor, SlotTable slotTable, FixupList fixupList) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        this.changeList.pushInsertSlots(anchor, slotTable, fixupList);
    }
}
