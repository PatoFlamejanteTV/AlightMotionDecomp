package androidx.compose.runtime;

import Q5.r;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

@StabilityInferred(parameters = 0)
@InternalComposeApi
/* loaded from: classes.dex */
public final class MovableContentStateReference {
    public static final int $stable = 8;
    private final Anchor anchor;
    private final ControlledComposition composition;
    private final MovableContent<Object> content;
    private List<r> invalidations;
    private final PersistentCompositionLocalMap locals;
    private final Object parameter;
    private final SlotTable slotTable;

    public MovableContentStateReference(MovableContent<Object> movableContent, Object obj, ControlledComposition controlledComposition, SlotTable slotTable, Anchor anchor, List<r> list, PersistentCompositionLocalMap persistentCompositionLocalMap) {
        this.content = movableContent;
        this.parameter = obj;
        this.composition = controlledComposition;
        this.slotTable = slotTable;
        this.anchor = anchor;
        this.invalidations = list;
        this.locals = persistentCompositionLocalMap;
    }

    public final Anchor getAnchor$runtime_release() {
        return this.anchor;
    }

    public final ControlledComposition getComposition$runtime_release() {
        return this.composition;
    }

    public final MovableContent<Object> getContent$runtime_release() {
        return this.content;
    }

    public final List<r> getInvalidations$runtime_release() {
        return this.invalidations;
    }

    public final PersistentCompositionLocalMap getLocals$runtime_release() {
        return this.locals;
    }

    public final Object getParameter$runtime_release() {
        return this.parameter;
    }

    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }

    public final void setInvalidations$runtime_release(List<r> list) {
        this.invalidations = list;
    }
}
