package androidx.compose.ui.node;

/* loaded from: classes.dex */
public interface TraversableNode extends DelegatableNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* loaded from: classes.dex */
        public enum TraverseDescendantsAction {
            ContinueTraversal,
            SkipSubtreeAndContinueTraversal,
            CancelTraversal
        }

        private Companion() {
        }
    }

    Object getTraverseKey();
}
