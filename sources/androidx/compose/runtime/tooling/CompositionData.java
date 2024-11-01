package androidx.compose.runtime.tooling;

/* loaded from: classes.dex */
public interface CompositionData {
    CompositionGroup find(Object obj);

    Iterable<CompositionGroup> getCompositionGroups();

    boolean isEmpty();
}
