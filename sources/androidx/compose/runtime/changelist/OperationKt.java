package androidx.compose.runtime.changelist;

import Q5.I;
import Q5.r;
import Q5.x;
import R5.AbstractC1435t;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.List;

/* loaded from: classes.dex */
public final class OperationKt {
    public static final /* synthetic */ int access$positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier applier) {
        return positionToInsert(slotWriter, anchor, applier);
    }

    public static final /* synthetic */ void access$positionToParentOf(SlotWriter slotWriter, Applier applier, int i8) {
        positionToParentOf(slotWriter, applier, i8);
    }

    public static final /* synthetic */ void access$releaseMovableGroupAtCurrent(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, SlotWriter slotWriter) {
        releaseMovableGroupAtCurrent(controlledComposition, compositionContext, movableContentStateReference, slotWriter);
    }

    private static final int currentNodeIndex(SlotWriter slotWriter) {
        int nodeCount;
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int i8 = parent + 1;
        int i9 = 0;
        while (i8 < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, i8)) {
                if (slotWriter.isNode(i8)) {
                    i9 = 0;
                }
                i8++;
            } else {
                if (slotWriter.isNode(i8)) {
                    nodeCount = 1;
                } else {
                    nodeCount = slotWriter.nodeCount(i8);
                }
                i9 += nodeCount;
                i8 += slotWriter.groupSize(i8);
            }
        }
        return i9;
    }

    public static final int positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier<Object> applier) {
        boolean z8;
        int anchorIndex = slotWriter.anchorIndex(anchor);
        boolean z9 = true;
        if (slotWriter.getCurrentGroup() < anchorIndex) {
            z8 = true;
        } else {
            z8 = false;
        }
        ComposerKt.runtimeCheck(z8);
        positionToParentOf(slotWriter, applier, anchorIndex);
        int currentNodeIndex = currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < anchorIndex) {
            if (slotWriter.indexInCurrentGroup(anchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    currentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                currentNodeIndex += slotWriter.skipGroup();
            }
        }
        if (slotWriter.getCurrentGroup() != anchorIndex) {
            z9 = false;
        }
        ComposerKt.runtimeCheck(z9);
        return currentNodeIndex;
    }

    public static final void positionToParentOf(SlotWriter slotWriter, Applier<Object> applier, int i8) {
        while (!slotWriter.indexInParent(i8)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }

    public static final void releaseMovableGroupAtCurrent(final ControlledComposition controlledComposition, CompositionContext compositionContext, final MovableContentStateReference movableContentStateReference, SlotWriter slotWriter) {
        SlotTable slotTable = new SlotTable();
        SlotWriter openWriter = slotTable.openWriter();
        try {
            openWriter.beginInsert();
            openWriter.startGroup(MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime_release());
            SlotWriter.markGroup$default(openWriter, 0, 1, null);
            openWriter.update(movableContentStateReference.getParameter$runtime_release());
            List<Anchor> moveTo = slotWriter.moveTo(movableContentStateReference.getAnchor$runtime_release(), 1, openWriter);
            openWriter.skipGroup();
            openWriter.endGroup();
            openWriter.endInsert();
            openWriter.close();
            MovableContentState movableContentState = new MovableContentState(slotTable);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            if (companion.hasAnchoredRecomposeScopes$runtime_release(slotTable, moveTo)) {
                try {
                    companion.adoptAnchoredScopes$runtime_release(slotTable.openWriter(), moveTo, new RecomposeScopeOwner() { // from class: androidx.compose.runtime.changelist.OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1
                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
                            RecomposeScopeOwner recomposeScopeOwner;
                            InvalidationResult invalidationResult;
                            ControlledComposition controlledComposition2 = ControlledComposition.this;
                            IdentityArraySet identityArraySet = null;
                            if (controlledComposition2 instanceof RecomposeScopeOwner) {
                                recomposeScopeOwner = (RecomposeScopeOwner) controlledComposition2;
                            } else {
                                recomposeScopeOwner = null;
                            }
                            if (recomposeScopeOwner == null || (invalidationResult = recomposeScopeOwner.invalidate(recomposeScopeImpl, obj)) == null) {
                                invalidationResult = InvalidationResult.IGNORED;
                            }
                            if (invalidationResult == InvalidationResult.IGNORED) {
                                MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                                List<r> invalidations$runtime_release = movableContentStateReference2.getInvalidations$runtime_release();
                                if (obj != null) {
                                    identityArraySet = new IdentityArraySet();
                                    identityArraySet.add(identityArraySet);
                                }
                                movableContentStateReference2.setInvalidations$runtime_release(AbstractC1435t.H0(invalidations$runtime_release, x.a(recomposeScopeImpl, identityArraySet)));
                                return InvalidationResult.SCHEDULED;
                            }
                            return invalidationResult;
                        }

                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl) {
                        }

                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        public void recordReadOf(Object obj) {
                        }
                    });
                    I i8 = I.f8786a;
                } finally {
                }
            }
            compositionContext.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState);
        } finally {
        }
    }
}
