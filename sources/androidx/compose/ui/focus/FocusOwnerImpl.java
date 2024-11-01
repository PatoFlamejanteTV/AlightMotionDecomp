package androidx.compose.ui.focus;

import Q5.I;
import Q5.p;
import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.O;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements FocusOwner {
    public static final int $stable = 8;
    private final FocusInvalidationManager focusInvalidationManager;
    private MutableLongSet keysCurrentlyDown;
    public LayoutDirection layoutDirection;
    private FocusTargetNode rootFocusNode = new FocusTargetNode();
    private final FocusTransactionManager focusTransactionManager = new FocusTransactionManager();
    private final Modifier modifier = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return FocusOwnerImpl.this.getRootFocusNode$ui_release().hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootFocusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(FocusTargetNode focusTargetNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public FocusTargetNode create() {
            return FocusOwnerImpl.this.getRootFocusNode$ui_release();
        }
    };

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public FocusOwnerImpl(Function1 function1) {
        this.focusInvalidationManager = new FocusInvalidationManager(function1);
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int m4320constructorimpl = NodeKind.m4320constructorimpl(1024) | NodeKind.m4320constructorimpl(8192);
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node = delegatableNode.getNode();
            Modifier.Node node2 = null;
            if ((node.getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                        if ((NodeKind.m4320constructorimpl(1024) & child$ui_release.getKindSet$ui_release()) != 0) {
                            return node2;
                        }
                        node2 = child$ui_release;
                    }
                }
            }
            return node2;
        }
        throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
    }

    /* renamed from: traverseAncestors-Y-YKmho, reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m2647traverseAncestorsYYKmho(DelegatableNode delegatableNode, int i8, Function1 function1, Function1 function12) {
        int size;
        NodeChain nodes$ui_release;
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
            ArrayList arrayList = null;
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i8) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i8) != 0) {
                            for (Modifier.Node node = parent$ui_release; node != null; node = DelegatableNodeKt.pop(null)) {
                                AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(node);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i9 = size - 1;
                    function1.invoke(arrayList.get(size));
                    if (i9 < 0) {
                        break;
                    } else {
                        size = i9;
                    }
                }
            }
            for (Modifier.Node node2 = delegatableNode.getNode(); node2 != null; node2 = DelegatableNodeKt.pop(null)) {
                AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                function1.invoke(node2);
            }
            for (Modifier.Node node3 = delegatableNode.getNode(); node3 != null; node3 = DelegatableNodeKt.pop(null)) {
                AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                function12.invoke(node3);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    function12.invoke(arrayList.get(i10));
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* renamed from: validateKeyEvent-ZmokQxo, reason: not valid java name */
    private final boolean m2648validateKeyEventZmokQxo(KeyEvent keyEvent) {
        long m3876getKeyZmokQxo = KeyEvent_androidKt.m3876getKeyZmokQxo(keyEvent);
        int m3877getTypeZmokQxo = KeyEvent_androidKt.m3877getTypeZmokQxo(keyEvent);
        KeyEventType.Companion companion = KeyEventType.Companion;
        if (KeyEventType.m3869equalsimpl0(m3877getTypeZmokQxo, companion.m3873getKeyDownCS__XNY())) {
            MutableLongSet mutableLongSet = this.keysCurrentlyDown;
            if (mutableLongSet == null) {
                mutableLongSet = new MutableLongSet(3);
                this.keysCurrentlyDown = mutableLongSet;
            }
            mutableLongSet.plusAssign(m3876getKeyZmokQxo);
        } else if (KeyEventType.m3869equalsimpl0(m3877getTypeZmokQxo, companion.m3874getKeyUpCS__XNY())) {
            MutableLongSet mutableLongSet2 = this.keysCurrentlyDown;
            if (mutableLongSet2 != null && mutableLongSet2.contains(m3876getKeyZmokQxo)) {
                MutableLongSet mutableLongSet3 = this.keysCurrentlyDown;
                if (mutableLongSet3 != null) {
                    mutableLongSet3.remove(m3876getKeyZmokQxo);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* renamed from: wrapAroundFocus-3ESFkO8, reason: not valid java name */
    private final boolean m2649wrapAroundFocus3ESFkO8(int i8) {
        boolean m2629equalsimpl0;
        if (this.rootFocusNode.getFocusState().getHasFocus() && !this.rootFocusNode.getFocusState().isFocused()) {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (FocusDirection.m2629equalsimpl0(i8, companion.m2639getNextdhqQ8s())) {
                m2629equalsimpl0 = true;
            } else {
                m2629equalsimpl0 = FocusDirection.m2629equalsimpl0(i8, companion.m2640getPreviousdhqQ8s());
            }
            if (m2629equalsimpl0) {
                clearFocus(false);
                if (!this.rootFocusNode.getFocusState().isFocused()) {
                    return false;
                }
                return mo2644moveFocus3ESFkO8(i8);
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean z8) {
        clearFocus(z8, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo2645dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        NodeChain nodes$ui_release;
        DelegatingNode delegatingNode;
        NodeChain nodes$ui_release2;
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            int m4320constructorimpl = NodeKind.m4320constructorimpl(131072);
            if (findActiveFocusNode.getNode().isAttached()) {
                Modifier.Node parent$ui_release = findActiveFocusNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findActiveFocusNode);
                loop0: while (true) {
                    if (requireLayoutNode != null) {
                        if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                            while (parent$ui_release != null) {
                                if ((parent$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                    MutableVector mutableVector = null;
                                    delegatingNode = parent$ui_release;
                                    while (delegatingNode != 0) {
                                        if (delegatingNode instanceof SoftKeyboardInterceptionModifierNode) {
                                            break loop0;
                                        }
                                        if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                            int i8 = 0;
                                            delegatingNode = delegatingNode;
                                            while (delegate$ui_release != null) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                                    i8++;
                                                    if (i8 == 1) {
                                                        delegatingNode = delegate$ui_release;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (delegatingNode != 0) {
                                                            mutableVector.add(delegatingNode);
                                                            delegatingNode = 0;
                                                        }
                                                        mutableVector.add(delegate$ui_release);
                                                    }
                                                }
                                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                                delegatingNode = delegatingNode;
                                            }
                                            if (i8 == 1) {
                                            }
                                        }
                                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                                    }
                                }
                                parent$ui_release = parent$ui_release.getParent$ui_release();
                            }
                        }
                        requireLayoutNode = requireLayoutNode.getParent$ui_release();
                        if (requireLayoutNode != null && (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) != null) {
                            parent$ui_release = nodes$ui_release2.getTail$ui_release();
                        } else {
                            parent$ui_release = null;
                        }
                    } else {
                        delegatingNode = 0;
                        break;
                    }
                }
                softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) delegatingNode;
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            int m4320constructorimpl2 = NodeKind.m4320constructorimpl(131072);
            if (softKeyboardInterceptionModifierNode.getNode().isAttached()) {
                Modifier.Node parent$ui_release2 = softKeyboardInterceptionModifierNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode);
                ArrayList arrayList = null;
                while (requireLayoutNode2 != null) {
                    if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl2) != 0) {
                        while (parent$ui_release2 != null) {
                            if ((parent$ui_release2.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                Modifier.Node node = parent$ui_release2;
                                MutableVector mutableVector2 = null;
                                while (node != null) {
                                    if (node instanceof SoftKeyboardInterceptionModifierNode) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(node);
                                    } else if ((node.getKindSet$ui_release() & m4320constructorimpl2) != 0 && (node instanceof DelegatingNode)) {
                                        int i9 = 0;
                                        for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                            if ((delegate$ui_release2.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    node = delegate$ui_release2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        mutableVector2.add(node);
                                                        node = null;
                                                    }
                                                    mutableVector2.add(delegate$ui_release2);
                                                }
                                            }
                                        }
                                        if (i9 == 1) {
                                        }
                                    }
                                    node = DelegatableNodeKt.pop(mutableVector2);
                                }
                            }
                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                    if (requireLayoutNode2 != null && (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) != null) {
                        parent$ui_release2 = nodes$ui_release.getTail$ui_release();
                    } else {
                        parent$ui_release2 = null;
                    }
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i10 = size - 1;
                        if (((SoftKeyboardInterceptionModifierNode) arrayList.get(size)).mo3564onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                            return true;
                        }
                        if (i10 < 0) {
                            break;
                        }
                        size = i10;
                    }
                }
                DelegatingNode node2 = softKeyboardInterceptionModifierNode.getNode();
                MutableVector mutableVector3 = null;
                while (node2 != 0) {
                    if (node2 instanceof SoftKeyboardInterceptionModifierNode) {
                        if (((SoftKeyboardInterceptionModifierNode) node2).mo3564onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                            return true;
                        }
                    } else if ((node2.getKindSet$ui_release() & m4320constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release3 = node2.getDelegate$ui_release();
                        int i11 = 0;
                        node2 = node2;
                        while (delegate$ui_release3 != null) {
                            if ((delegate$ui_release3.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    node2 = delegate$ui_release3;
                                } else {
                                    if (mutableVector3 == null) {
                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node2 != 0) {
                                        mutableVector3.add(node2);
                                        node2 = 0;
                                    }
                                    mutableVector3.add(delegate$ui_release3);
                                }
                            }
                            delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                            node2 = node2;
                        }
                        if (i11 == 1) {
                        }
                    }
                    node2 = DelegatableNodeKt.pop(mutableVector3);
                }
                DelegatingNode node3 = softKeyboardInterceptionModifierNode.getNode();
                MutableVector mutableVector4 = null;
                while (node3 != 0) {
                    if (node3 instanceof SoftKeyboardInterceptionModifierNode) {
                        if (((SoftKeyboardInterceptionModifierNode) node3).mo3563onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                            return true;
                        }
                    } else if ((node3.getKindSet$ui_release() & m4320constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release4 = node3.getDelegate$ui_release();
                        int i12 = 0;
                        node3 = node3;
                        while (delegate$ui_release4 != null) {
                            if ((delegate$ui_release4.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                i12++;
                                if (i12 == 1) {
                                    node3 = delegate$ui_release4;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node3 != 0) {
                                        mutableVector4.add(node3);
                                        node3 = 0;
                                    }
                                    mutableVector4.add(delegate$ui_release4);
                                }
                            }
                            delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                            node3 = node3;
                        }
                        if (i12 == 1) {
                        }
                    }
                    node3 = DelegatableNodeKt.pop(mutableVector4);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i13)).mo3563onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                            return true;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-ZmokQxo */
    public boolean mo2646dispatchKeyEventZmokQxo(KeyEvent keyEvent) {
        int size;
        NodeChain nodes$ui_release;
        DelegatingNode delegatingNode;
        NodeChain nodes$ui_release2;
        if (!m2648validateKeyEventZmokQxo(keyEvent)) {
            return false;
        }
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            Modifier.Node lastLocalKeyInputNode = lastLocalKeyInputNode(findActiveFocusNode);
            if (lastLocalKeyInputNode == null) {
                int m4320constructorimpl = NodeKind.m4320constructorimpl(8192);
                if (findActiveFocusNode.getNode().isAttached()) {
                    Modifier.Node parent$ui_release = findActiveFocusNode.getNode().getParent$ui_release();
                    LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findActiveFocusNode);
                    loop0: while (true) {
                        if (requireLayoutNode != null) {
                            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                                while (parent$ui_release != null) {
                                    if ((parent$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                        MutableVector mutableVector = null;
                                        delegatingNode = parent$ui_release;
                                        while (delegatingNode != 0) {
                                            if (delegatingNode instanceof KeyInputModifierNode) {
                                                break loop0;
                                            }
                                            if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                                int i8 = 0;
                                                delegatingNode = delegatingNode;
                                                while (delegate$ui_release != null) {
                                                    if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                                        i8++;
                                                        if (i8 == 1) {
                                                            delegatingNode = delegate$ui_release;
                                                        } else {
                                                            if (mutableVector == null) {
                                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                            }
                                                            if (delegatingNode != 0) {
                                                                mutableVector.add(delegatingNode);
                                                                delegatingNode = 0;
                                                            }
                                                            mutableVector.add(delegate$ui_release);
                                                        }
                                                    }
                                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                                    delegatingNode = delegatingNode;
                                                }
                                                if (i8 == 1) {
                                                }
                                            }
                                            delegatingNode = DelegatableNodeKt.pop(mutableVector);
                                        }
                                    }
                                    parent$ui_release = parent$ui_release.getParent$ui_release();
                                }
                            }
                            requireLayoutNode = requireLayoutNode.getParent$ui_release();
                            if (requireLayoutNode != null && (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) != null) {
                                parent$ui_release = nodes$ui_release2.getTail$ui_release();
                            } else {
                                parent$ui_release = null;
                            }
                        } else {
                            delegatingNode = 0;
                            break;
                        }
                    }
                    KeyInputModifierNode keyInputModifierNode = (KeyInputModifierNode) delegatingNode;
                    if (keyInputModifierNode != null) {
                        lastLocalKeyInputNode = keyInputModifierNode.getNode();
                    } else {
                        lastLocalKeyInputNode = null;
                    }
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            if (lastLocalKeyInputNode != null) {
                int m4320constructorimpl2 = NodeKind.m4320constructorimpl(8192);
                if (lastLocalKeyInputNode.getNode().isAttached()) {
                    Modifier.Node parent$ui_release2 = lastLocalKeyInputNode.getNode().getParent$ui_release();
                    LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(lastLocalKeyInputNode);
                    ArrayList arrayList = null;
                    while (requireLayoutNode2 != null) {
                        if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl2) != 0) {
                            while (parent$ui_release2 != null) {
                                if ((parent$ui_release2.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                    Modifier.Node node = parent$ui_release2;
                                    MutableVector mutableVector2 = null;
                                    while (node != null) {
                                        if (node instanceof KeyInputModifierNode) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(node);
                                        } else if ((node.getKindSet$ui_release() & m4320constructorimpl2) != 0 && (node instanceof DelegatingNode)) {
                                            int i9 = 0;
                                            for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                                if ((delegate$ui_release2.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                                    i9++;
                                                    if (i9 == 1) {
                                                        node = delegate$ui_release2;
                                                    } else {
                                                        if (mutableVector2 == null) {
                                                            mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (node != null) {
                                                            mutableVector2.add(node);
                                                            node = null;
                                                        }
                                                        mutableVector2.add(delegate$ui_release2);
                                                    }
                                                }
                                            }
                                            if (i9 == 1) {
                                            }
                                        }
                                        node = DelegatableNodeKt.pop(mutableVector2);
                                    }
                                }
                                parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                            }
                        }
                        requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                        if (requireLayoutNode2 != null && (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) != null) {
                            parent$ui_release2 = nodes$ui_release.getTail$ui_release();
                        } else {
                            parent$ui_release2 = null;
                        }
                    }
                    if (arrayList != null && arrayList.size() - 1 >= 0) {
                        while (true) {
                            int i10 = size - 1;
                            if (((KeyInputModifierNode) arrayList.get(size)).mo243onPreKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                            if (i10 < 0) {
                                break;
                            }
                            size = i10;
                        }
                    }
                    DelegatingNode node2 = lastLocalKeyInputNode.getNode();
                    MutableVector mutableVector3 = null;
                    while (node2 != 0) {
                        if (node2 instanceof KeyInputModifierNode) {
                            if (((KeyInputModifierNode) node2).mo243onPreKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                        } else if ((node2.getKindSet$ui_release() & m4320constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release3 = node2.getDelegate$ui_release();
                            int i11 = 0;
                            node2 = node2;
                            while (delegate$ui_release3 != null) {
                                if ((delegate$ui_release3.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        node2 = delegate$ui_release3;
                                    } else {
                                        if (mutableVector3 == null) {
                                            mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node2 != 0) {
                                            mutableVector3.add(node2);
                                            node2 = 0;
                                        }
                                        mutableVector3.add(delegate$ui_release3);
                                    }
                                }
                                delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                                node2 = node2;
                            }
                            if (i11 == 1) {
                            }
                        }
                        node2 = DelegatableNodeKt.pop(mutableVector3);
                    }
                    DelegatingNode node3 = lastLocalKeyInputNode.getNode();
                    MutableVector mutableVector4 = null;
                    while (node3 != 0) {
                        if (node3 instanceof KeyInputModifierNode) {
                            if (((KeyInputModifierNode) node3).mo241onKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                        } else if ((node3.getKindSet$ui_release() & m4320constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release4 = node3.getDelegate$ui_release();
                            int i12 = 0;
                            node3 = node3;
                            while (delegate$ui_release4 != null) {
                                if ((delegate$ui_release4.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                    i12++;
                                    if (i12 == 1) {
                                        node3 = delegate$ui_release4;
                                    } else {
                                        if (mutableVector4 == null) {
                                            mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node3 != 0) {
                                            mutableVector4.add(node3);
                                            node3 = 0;
                                        }
                                        mutableVector4.add(delegate$ui_release4);
                                    }
                                }
                                delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                                node3 = node3;
                            }
                            if (i12 == 1) {
                            }
                        }
                        node3 = DelegatableNodeKt.pop(mutableVector4);
                    }
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            if (((KeyInputModifierNode) arrayList.get(i13)).mo241onKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            return false;
        }
        throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        NodeChain nodes$ui_release;
        DelegatingNode delegatingNode;
        NodeChain nodes$ui_release2;
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            int m4320constructorimpl = NodeKind.m4320constructorimpl(16384);
            if (findActiveFocusNode.getNode().isAttached()) {
                Modifier.Node parent$ui_release = findActiveFocusNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findActiveFocusNode);
                loop0: while (true) {
                    if (requireLayoutNode != null) {
                        if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                            while (parent$ui_release != null) {
                                if ((parent$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                    MutableVector mutableVector = null;
                                    delegatingNode = parent$ui_release;
                                    while (delegatingNode != 0) {
                                        if (delegatingNode instanceof RotaryInputModifierNode) {
                                            break loop0;
                                        }
                                        if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                            int i8 = 0;
                                            delegatingNode = delegatingNode;
                                            while (delegate$ui_release != null) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                                    i8++;
                                                    if (i8 == 1) {
                                                        delegatingNode = delegate$ui_release;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (delegatingNode != 0) {
                                                            mutableVector.add(delegatingNode);
                                                            delegatingNode = 0;
                                                        }
                                                        mutableVector.add(delegate$ui_release);
                                                    }
                                                }
                                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                                delegatingNode = delegatingNode;
                                            }
                                            if (i8 == 1) {
                                            }
                                        }
                                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                                    }
                                }
                                parent$ui_release = parent$ui_release.getParent$ui_release();
                            }
                        }
                        requireLayoutNode = requireLayoutNode.getParent$ui_release();
                        if (requireLayoutNode != null && (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) != null) {
                            parent$ui_release = nodes$ui_release2.getTail$ui_release();
                        } else {
                            parent$ui_release = null;
                        }
                    } else {
                        delegatingNode = 0;
                        break;
                    }
                }
                rotaryInputModifierNode = (RotaryInputModifierNode) delegatingNode;
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            int m4320constructorimpl2 = NodeKind.m4320constructorimpl(16384);
            if (rotaryInputModifierNode.getNode().isAttached()) {
                Modifier.Node parent$ui_release2 = rotaryInputModifierNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode);
                ArrayList arrayList = null;
                while (requireLayoutNode2 != null) {
                    if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl2) != 0) {
                        while (parent$ui_release2 != null) {
                            if ((parent$ui_release2.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                Modifier.Node node = parent$ui_release2;
                                MutableVector mutableVector2 = null;
                                while (node != null) {
                                    if (node instanceof RotaryInputModifierNode) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(node);
                                    } else if ((node.getKindSet$ui_release() & m4320constructorimpl2) != 0 && (node instanceof DelegatingNode)) {
                                        int i9 = 0;
                                        for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                            if ((delegate$ui_release2.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    node = delegate$ui_release2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        mutableVector2.add(node);
                                                        node = null;
                                                    }
                                                    mutableVector2.add(delegate$ui_release2);
                                                }
                                            }
                                        }
                                        if (i9 == 1) {
                                        }
                                    }
                                    node = DelegatableNodeKt.pop(mutableVector2);
                                }
                            }
                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                    if (requireLayoutNode2 != null && (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) != null) {
                        parent$ui_release2 = nodes$ui_release.getTail$ui_release();
                    } else {
                        parent$ui_release2 = null;
                    }
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i10 = size - 1;
                        if (((RotaryInputModifierNode) arrayList.get(size)).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                            return true;
                        }
                        if (i10 < 0) {
                            break;
                        }
                        size = i10;
                    }
                }
                DelegatingNode node2 = rotaryInputModifierNode.getNode();
                MutableVector mutableVector3 = null;
                while (node2 != 0) {
                    if (node2 instanceof RotaryInputModifierNode) {
                        if (((RotaryInputModifierNode) node2).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                            return true;
                        }
                    } else if ((node2.getKindSet$ui_release() & m4320constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release3 = node2.getDelegate$ui_release();
                        int i11 = 0;
                        node2 = node2;
                        while (delegate$ui_release3 != null) {
                            if ((delegate$ui_release3.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    node2 = delegate$ui_release3;
                                } else {
                                    if (mutableVector3 == null) {
                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node2 != 0) {
                                        mutableVector3.add(node2);
                                        node2 = 0;
                                    }
                                    mutableVector3.add(delegate$ui_release3);
                                }
                            }
                            delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                            node2 = node2;
                        }
                        if (i11 == 1) {
                        }
                    }
                    node2 = DelegatableNodeKt.pop(mutableVector3);
                }
                DelegatingNode node3 = rotaryInputModifierNode.getNode();
                MutableVector mutableVector4 = null;
                while (node3 != 0) {
                    if (node3 instanceof RotaryInputModifierNode) {
                        if (((RotaryInputModifierNode) node3).onRotaryScrollEvent(rotaryScrollEvent)) {
                            return true;
                        }
                    } else if ((node3.getKindSet$ui_release() & m4320constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release4 = node3.getDelegate$ui_release();
                        int i12 = 0;
                        node3 = node3;
                        while (delegate$ui_release4 != null) {
                            if ((delegate$ui_release4.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                i12++;
                                if (i12 == 1) {
                                    node3 = delegate$ui_release4;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node3 != 0) {
                                        mutableVector4.add(node3);
                                        node3 = 0;
                                    }
                                    mutableVector4.add(delegate$ui_release4);
                                }
                            }
                            delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                            node3 = node3;
                        }
                        if (i12 == 1) {
                        }
                    }
                    node3 = DelegatableNodeKt.pop(mutableVector4);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        if (((RotaryInputModifierNode) arrayList.get(i13)).onRotaryScrollEvent(rotaryScrollEvent)) {
                            return true;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Rect getFocusRect() {
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(findActiveFocusNode);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusTransactionManager getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        AbstractC3292y.y("layoutDirection");
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Modifier getModifier() {
        return this.modifier;
    }

    public final FocusTargetNode getRootFocusNode$ui_release() {
        return this.rootFocusNode;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo2644moveFocus3ESFkO8(int i8) {
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode == null) {
            return false;
        }
        FocusRequester m2664customFocusSearchOMvw8 = FocusTraversalKt.m2664customFocusSearchOMvw8(findActiveFocusNode, i8, getLayoutDirection());
        FocusRequester.Companion companion = FocusRequester.Companion;
        if (m2664customFocusSearchOMvw8 != companion.getDefault()) {
            if (m2664customFocusSearchOMvw8 == companion.getCancel() || !m2664customFocusSearchOMvw8.focus$ui_release()) {
                return false;
            }
            return true;
        }
        O o8 = new O();
        boolean m2665focusSearchsMXa3k8 = FocusTraversalKt.m2665focusSearchsMXa3k8(this.rootFocusNode, i8, getLayoutDirection(), new FocusOwnerImpl$moveFocus$foundNextItem$1(findActiveFocusNode, this, i8, o8));
        if (o8.f34569a) {
            return false;
        }
        if (!m2665focusSearchsMXa3k8 && !m2649wrapAroundFocus3ESFkO8(i8)) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusTargetNode focusTargetNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusTargetNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    public final void setRootFocusNode$ui_release(FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void takeFocus() {
        if (this.rootFocusNode.getFocusState() == FocusStateImpl.Inactive) {
            this.rootFocusNode.setFocusState(FocusStateImpl.Active);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void clearFocus(boolean z8, boolean z9) {
        FocusStateImpl focusStateImpl;
        FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
        try {
            if (focusTransactionManager.ongoingTransaction) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            if (!z8) {
                int i8 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m2659performCustomClearFocusMxy_nc0(this.rootFocusNode, FocusDirection.Companion.m2637getExitdhqQ8s()).ordinal()];
                if (i8 == 1 || i8 == 2 || i8 == 3) {
                    focusTransactionManager.commitTransaction();
                    return;
                }
            }
            FocusStateImpl focusState = this.rootFocusNode.getFocusState();
            if (FocusTransactionsKt.clearFocus(this.rootFocusNode, z8, z9)) {
                FocusTargetNode focusTargetNode = this.rootFocusNode;
                int i9 = WhenMappings.$EnumSwitchMapping$1[focusState.ordinal()];
                if (i9 == 1 || i9 == 2 || i9 == 3) {
                    focusStateImpl = FocusStateImpl.Active;
                } else {
                    if (i9 != 4) {
                        throw new p();
                    }
                    focusStateImpl = FocusStateImpl.Inactive;
                }
                focusTargetNode.setFocusState(focusStateImpl);
            }
            I i10 = I.f8786a;
            focusTransactionManager.commitTransaction();
        } catch (Throwable th) {
            focusTransactionManager.commitTransaction();
            throw th;
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusEventModifierNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusPropertiesModifierNode);
    }
}
