package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n6.B0;
import n6.InterfaceC3488x0;
import n6.M;
import n6.N;

@Stable
/* loaded from: classes.dex */
public interface Modifier {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Modifier then(Modifier modifier, Modifier modifier2) {
            return a.b(modifier, modifier2);
        }
    }

    /* loaded from: classes.dex */
    public interface Element extends Modifier {

        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static boolean all(Element element, Function1 function1) {
                return b.e(element, function1);
            }

            @Deprecated
            public static boolean any(Element element, Function1 function1) {
                return b.f(element, function1);
            }

            @Deprecated
            public static <R> R foldIn(Element element, R r8, InterfaceC2072n interfaceC2072n) {
                return (R) b.g(element, r8, interfaceC2072n);
            }

            @Deprecated
            public static <R> R foldOut(Element element, R r8, InterfaceC2072n interfaceC2072n) {
                return (R) b.h(element, r8, interfaceC2072n);
            }

            @Deprecated
            public static Modifier then(Element element, Modifier modifier) {
                return b.i(element, modifier);
            }
        }

        @Override // androidx.compose.ui.Modifier
        boolean all(Function1 function1);

        @Override // androidx.compose.ui.Modifier
        boolean any(Function1 function1);

        @Override // androidx.compose.ui.Modifier
        <R> R foldIn(R r8, InterfaceC2072n interfaceC2072n);

        @Override // androidx.compose.ui.Modifier
        <R> R foldOut(R r8, InterfaceC2072n interfaceC2072n);
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;
        private Node child;
        private NodeCoordinator coordinator;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private ObserverNodeOwnerScope ownerScope;
        private Node parent;
        private M scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;
        private Node node = this;
        private int aggregateChildKindSet = -1;

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public final int getAggregateChildKindSet$ui_release() {
            return this.aggregateChildKindSet;
        }

        public final Node getChild$ui_release() {
            return this.child;
        }

        public final NodeCoordinator getCoordinator$ui_release() {
            return this.coordinator;
        }

        public final M getCoroutineScope() {
            M m8 = this.scope;
            if (m8 == null) {
                M a9 = N.a(DelegatableNodeKt.requireOwner(this).getCoroutineContext().plus(B0.a((InterfaceC3488x0) DelegatableNodeKt.requireOwner(this).getCoroutineContext().get(InterfaceC3488x0.f35757n0))));
                this.scope = a9;
                return a9;
            }
            return m8;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui_release() {
            return this.kindSet;
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        public final Node getNode() {
            return this.node;
        }

        public final ObserverNodeOwnerScope getOwnerScope$ui_release() {
            return this.ownerScope;
        }

        public final Node getParent$ui_release() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        /* renamed from: isKind-H91voCI$ui_release, reason: not valid java name */
        public final boolean m2586isKindH91voCI$ui_release(int i8) {
            if ((i8 & getKindSet$ui_release()) != 0) {
                return true;
            }
            return false;
        }

        public void markAsAttached$ui_release() {
            if (!this.isAttached) {
                if (this.coordinator != null) {
                    this.isAttached = true;
                    this.onAttachRunExpected = true;
                    return;
                }
                throw new IllegalStateException("attach invoked on a node without a coordinator".toString());
            }
            throw new IllegalStateException("node attached multiple times".toString());
        }

        public void markAsDetached$ui_release() {
            if (this.isAttached) {
                if (!this.onAttachRunExpected) {
                    if (!this.onDetachRunExpected) {
                        this.isAttached = false;
                        M m8 = this.scope;
                        if (m8 != null) {
                            N.c(m8, new ModifierNodeDetachedCancellationException());
                            this.scope = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()".toString());
                }
                throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()".toString());
            }
            throw new IllegalStateException("Cannot detach a node that is not attached".toString());
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        public void reset$ui_release() {
            if (this.isAttached) {
                onReset();
                return;
            }
            throw new IllegalStateException("reset() called on an unattached node".toString());
        }

        public void runAttachLifecycle$ui_release() {
            if (this.isAttached) {
                if (this.onAttachRunExpected) {
                    this.onAttachRunExpected = false;
                    onAttach();
                    this.onDetachRunExpected = true;
                    return;
                }
                throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()".toString());
            }
            throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle".toString());
        }

        public void runDetachLifecycle$ui_release() {
            if (this.isAttached) {
                if (this.coordinator != null) {
                    if (this.onDetachRunExpected) {
                        this.onDetachRunExpected = false;
                        onDetach();
                        return;
                    }
                    throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()".toString());
                }
                throw new IllegalStateException("detach invoked on a node without a coordinator".toString());
            }
            throw new IllegalStateException("node detached multiple times".toString());
        }

        public final void setAggregateChildKindSet$ui_release(int i8) {
            this.aggregateChildKindSet = i8;
        }

        public final void setAsDelegateTo$ui_release(Node node) {
            this.node = node;
        }

        public final void setChild$ui_release(Node node) {
            this.child = node;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z8) {
            this.insertedNodeAwaitingAttachForInvalidation = z8;
        }

        public final void setKindSet$ui_release(int i8) {
            this.kindSet = i8;
        }

        public final void setOwnerScope$ui_release(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final void setParent$ui_release(Node node) {
            this.parent = node;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z8) {
            this.updatedNodeAwaitingAttachForInvalidation = z8;
        }

        @ExperimentalComposeUiApi
        public final void sideEffect(Function0 function0) {
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(function0);
        }

        public void updateCoordinator$ui_release(NodeCoordinator nodeCoordinator) {
            this.coordinator = nodeCoordinator;
        }
    }

    boolean all(Function1 function1);

    boolean any(Function1 function1);

    <R> R foldIn(R r8, InterfaceC2072n interfaceC2072n);

    <R> R foldOut(R r8, InterfaceC2072n interfaceC2072n);

    Modifier then(Modifier modifier);

    /* loaded from: classes.dex */
    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.ui.Modifier
        public boolean all(Function1 function1) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(Function1 function1) {
            return false;
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier then(Modifier modifier) {
            return modifier;
        }

        public String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R r8, InterfaceC2072n interfaceC2072n) {
            return r8;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldOut(R r8, InterfaceC2072n interfaceC2072n) {
            return r8;
        }
    }
}
