package androidx.compose.ui.focus;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;

@Stable
/* loaded from: classes.dex */
public final class FocusRequester {
    public static final int $stable = 0;
    private final MutableVector<FocusRequesterModifierNode> focusRequesterNodes = new MutableVector<>(new FocusRequesterModifierNode[16], 0);
    public static final Companion Companion = new Companion(null);
    private static final FocusRequester Default = new FocusRequester();
    private static final FocusRequester Cancel = new FocusRequester();

    /* loaded from: classes.dex */
    public static final class Companion {

        @StabilityInferred(parameters = 1)
        @ExperimentalComposeUiApi
        /* loaded from: classes.dex */
        public static final class FocusRequesterFactory {
            public static final int $stable = 0;
            public static final FocusRequesterFactory INSTANCE = new FocusRequesterFactory();

            private FocusRequesterFactory() {
            }

            public final FocusRequester component1() {
                return new FocusRequester();
            }

            public final FocusRequester component10() {
                return new FocusRequester();
            }

            public final FocusRequester component11() {
                return new FocusRequester();
            }

            public final FocusRequester component12() {
                return new FocusRequester();
            }

            public final FocusRequester component13() {
                return new FocusRequester();
            }

            public final FocusRequester component14() {
                return new FocusRequester();
            }

            public final FocusRequester component15() {
                return new FocusRequester();
            }

            public final FocusRequester component16() {
                return new FocusRequester();
            }

            public final FocusRequester component2() {
                return new FocusRequester();
            }

            public final FocusRequester component3() {
                return new FocusRequester();
            }

            public final FocusRequester component4() {
                return new FocusRequester();
            }

            public final FocusRequester component5() {
                return new FocusRequester();
            }

            public final FocusRequester component6() {
                return new FocusRequester();
            }

            public final FocusRequester component7() {
                return new FocusRequester();
            }

            public final FocusRequester component8() {
                return new FocusRequester();
            }

            public final FocusRequester component9() {
                return new FocusRequester();
            }
        }

        private Companion() {
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getCancel$annotations() {
        }

        @ExperimentalComposeUiApi
        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }

        @ExperimentalComposeUiApi
        public final FocusRequester getCancel() {
            return FocusRequester.Cancel;
        }

        public final FocusRequester getDefault() {
            return FocusRequester.Default;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @ExperimentalComposeUiApi
    private final boolean findFocusTarget(Function1 function1) {
        Companion companion = Companion;
        if (this != companion.getDefault()) {
            if (this != companion.getCancel()) {
                if (this.focusRequesterNodes.isNotEmpty()) {
                    MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
                    int size = mutableVector.getSize();
                    if (size <= 0) {
                        return false;
                    }
                    FocusRequesterModifierNode[] content = mutableVector.getContent();
                    int i8 = 0;
                    boolean z8 = false;
                    do {
                        FocusRequesterModifierNode focusRequesterModifierNode = content[i8];
                        int m4320constructorimpl = NodeKind.m4320constructorimpl(1024);
                        if (focusRequesterModifierNode.getNode().isAttached()) {
                            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                            Modifier.Node child$ui_release = focusRequesterModifierNode.getNode().getChild$ui_release();
                            if (child$ui_release == null) {
                                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode());
                            } else {
                                mutableVector2.add(child$ui_release);
                            }
                            while (true) {
                                if (!mutableVector2.isNotEmpty()) {
                                    break;
                                }
                                Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                                if ((node.getAggregateChildKindSet$ui_release() & m4320constructorimpl) == 0) {
                                    DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, node);
                                } else {
                                    while (true) {
                                        if (node == null) {
                                            break;
                                        }
                                        if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                            MutableVector mutableVector3 = null;
                                            while (node != null) {
                                                if (node instanceof FocusTargetNode) {
                                                    if (((Boolean) function1.invoke((FocusTargetNode) node)).booleanValue()) {
                                                        z8 = true;
                                                        break;
                                                    }
                                                } else if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                                    int i9 = 0;
                                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                                        if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                                            i9++;
                                                            if (i9 == 1) {
                                                                node = delegate$ui_release;
                                                            } else {
                                                                if (mutableVector3 == null) {
                                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                                }
                                                                if (node != null) {
                                                                    mutableVector3.add(node);
                                                                    node = null;
                                                                }
                                                                mutableVector3.add(delegate$ui_release);
                                                            }
                                                        }
                                                    }
                                                    if (i9 == 1) {
                                                    }
                                                }
                                                node = DelegatableNodeKt.access$pop(mutableVector3);
                                            }
                                        } else {
                                            node = node.getChild$ui_release();
                                        }
                                    }
                                }
                            }
                            i8++;
                        } else {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                    } while (i8 < size);
                    return z8;
                }
                throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
            }
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
    }

    public final boolean captureFocus() {
        if (this.focusRequesterNodes.isNotEmpty()) {
            MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
            int size = mutableVector.getSize();
            if (size > 0) {
                FocusRequesterModifierNode[] content = mutableVector.getContent();
                int i8 = 0;
                while (!FocusRequesterModifierNodeKt.captureFocus(content[i8])) {
                    i8++;
                    if (i8 >= size) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0059, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean focus$ui_release() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRequester.focus$ui_release():boolean");
    }

    public final boolean freeFocus() {
        if (this.focusRequesterNodes.isNotEmpty()) {
            MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
            int size = mutableVector.getSize();
            if (size > 0) {
                FocusRequesterModifierNode[] content = mutableVector.getContent();
                int i8 = 0;
                while (!FocusRequesterModifierNodeKt.freeFocus(content[i8])) {
                    i8++;
                    if (i8 >= size) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }

    public final MutableVector<FocusRequesterModifierNode> getFocusRequesterNodes$ui_release() {
        return this.focusRequesterNodes;
    }

    public final void requestFocus() {
        focus$ui_release();
    }

    @ExperimentalComposeUiApi
    public final boolean restoreFocusedChild() {
        if (this.focusRequesterNodes.isNotEmpty()) {
            MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
            int size = mutableVector.getSize();
            if (size <= 0) {
                return false;
            }
            FocusRequesterModifierNode[] content = mutableVector.getContent();
            int i8 = 0;
            boolean z8 = false;
            do {
                if (!FocusRequesterModifierNodeKt.restoreFocusedChild(content[i8]) && !z8) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                i8++;
            } while (i8 < size);
            return z8;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }

    @ExperimentalComposeUiApi
    public final boolean saveFocusedChild() {
        if (this.focusRequesterNodes.isNotEmpty()) {
            MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
            int size = mutableVector.getSize();
            if (size > 0) {
                FocusRequesterModifierNode[] content = mutableVector.getContent();
                int i8 = 0;
                while (!FocusRequesterModifierNodeKt.saveFocusedChild(content[i8])) {
                    i8++;
                    if (i8 >= size) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }
}
