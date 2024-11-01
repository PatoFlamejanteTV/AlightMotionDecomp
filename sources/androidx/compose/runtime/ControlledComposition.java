package androidx.compose.runtime;

import Q5.r;
import c6.InterfaceC2072n;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface ControlledComposition extends Composition {
    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(InterfaceC2072n interfaceC2072n);

    <R> R delegateInvalidations(ControlledComposition controlledComposition, int i8, Function0 function0);

    @InternalComposeApi
    void disposeUnusedMovableContent(MovableContentState movableContentState);

    boolean getHasPendingChanges();

    @InternalComposeApi
    void insertMovableContent(List<r> list);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(Set<? extends Object> set);

    void prepareCompose(Function0 function0);

    boolean recompose();

    void recordModificationsOf(Set<? extends Object> set);

    void recordReadOf(Object obj);

    void recordWriteOf(Object obj);

    @InternalComposeApi
    void verifyConsistent();
}
