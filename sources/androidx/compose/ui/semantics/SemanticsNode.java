package androidx.compose.ui.semantics;

import R5.AbstractC1435t;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SemanticsNode {
    public static final int $stable = 8;
    private SemanticsNode fakeNodeParent;
    private final int id;
    private boolean isFake;
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;
    private final Modifier.Node outerSemanticsNode;
    private final SemanticsConfiguration unmergedConfig;

    public SemanticsNode(Modifier.Node node, boolean z8, LayoutNode layoutNode, SemanticsConfiguration semanticsConfiguration) {
        this.outerSemanticsNode = node;
        this.mergingEnabled = z8;
        this.layoutNode = layoutNode;
        this.unmergedConfig = semanticsConfiguration;
        this.id = layoutNode.getSemanticsId();
    }

    private final void emitFakeNodes(List<SemanticsNode> list) {
        Role role;
        String str;
        role = SemanticsNodeKt.getRole(this);
        if (role != null && this.unmergedConfig.isMergingSemanticsOfDescendants() && (!list.isEmpty())) {
            list.add(m4507fakeSemanticsNodeypyhhiA(role, new SemanticsNode$emitFakeNodes$fakeNode$1(role)));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && (!list.isEmpty()) && this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            List list2 = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, semanticsProperties.getContentDescription());
            if (list2 != null) {
                str = (String) AbstractC1435t.o0(list2);
            } else {
                str = null;
            }
            if (str != null) {
                list.add(0, m4507fakeSemanticsNodeypyhhiA(null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
            }
        }
    }

    /* renamed from: fakeSemanticsNode-ypyhhiA, reason: not valid java name */
    private final SemanticsNode m4507fakeSemanticsNodeypyhhiA(Role role, Function1 function1) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(false);
        function1.invoke(semanticsConfiguration);
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(function1), false, new LayoutNode(true, role != null ? SemanticsNodeKt.roleFakeNodeId(this) : SemanticsNodeKt.contentDescriptionFakeNodeId(this)), semanticsConfiguration);
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    private final void fillOneLayerOfSemanticsWrappers(LayoutNode layoutNode, List<SemanticsNode> list) {
        MutableVector<LayoutNode> zSortedChildren = layoutNode.getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            LayoutNode[] content = zSortedChildren.getContent();
            int i8 = 0;
            do {
                LayoutNode layoutNode2 = content[i8];
                if (layoutNode2.isAttached()) {
                    if (layoutNode2.getNodes$ui_release().m4277hasH91voCI$ui_release(NodeKind.m4320constructorimpl(8))) {
                        list.add(SemanticsNodeKt.SemanticsNode(layoutNode2, this.mergingEnabled));
                    } else {
                        fillOneLayerOfSemanticsWrappers(layoutNode2, list);
                    }
                }
                i8++;
            } while (i8 < size);
        }
    }

    private final List<SemanticsNode> findOneLayerOfMergingSemanticsNodes(List<SemanticsNode> list) {
        List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
        int size = unmergedChildren$ui_release$default.size();
        for (int i8 = 0; i8 < size; i8++) {
            SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren$ui_release$default.get(i8);
            if (semanticsNode.isMergingSemanticsOfDescendants()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.isClearingSemantics()) {
                semanticsNode.findOneLayerOfMergingSemanticsNodes(list);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode semanticsNode, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = new ArrayList();
        }
        return semanticsNode.findOneLayerOfMergingSemanticsNodes(list);
    }

    private final boolean isMergingSemanticsOfDescendants() {
        if (this.mergingEnabled && this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            return true;
        }
        return false;
    }

    private final void mergeConfig(SemanticsConfiguration semanticsConfiguration) {
        if (!this.unmergedConfig.isClearingSemantics()) {
            List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
            int size = unmergedChildren$ui_release$default.size();
            for (int i8 = 0; i8 < size; i8++) {
                SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren$ui_release$default.get(i8);
                if (!semanticsNode.isMergingSemanticsOfDescendants()) {
                    semanticsConfiguration.mergeChild$ui_release(semanticsNode.unmergedConfig);
                    semanticsNode.mergeConfig(semanticsConfiguration);
                }
            }
        }
    }

    public static /* synthetic */ List unmergedChildren$ui_release$default(SemanticsNode semanticsNode, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return semanticsNode.unmergedChildren$ui_release(z8);
    }

    public final SemanticsNode copyWithMergingEnabled$ui_release() {
        return new SemanticsNode(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    public final NodeCoordinator findCoordinatorToGetBounds$ui_release() {
        if (this.isFake) {
            SemanticsNode parent = getParent();
            if (parent != null) {
                return parent.findCoordinatorToGetBounds$ui_release();
            }
            return null;
        }
        DelegatableNode outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
        if (outerMergingSemantics == null) {
            outerMergingSemantics = this.outerSemanticsNode;
        }
        return DelegatableNodeKt.m4203requireCoordinator64DMado(outerMergingSemantics, NodeKind.m4320constructorimpl(8));
    }

    public final int getAlignmentLinePosition(AlignmentLine alignmentLine) {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            return findCoordinatorToGetBounds$ui_release.get(alignmentLine);
        }
        return Integer.MIN_VALUE;
    }

    public final Rect getBoundsInParent$ui_release() {
        LayoutCoordinates coordinates;
        SemanticsNode parent = getParent();
        if (parent == null) {
            return Rect.Companion.getZero();
        }
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null && (coordinates = findCoordinatorToGetBounds$ui_release.getCoordinates()) != null) {
                return c.c(DelegatableNodeKt.m4203requireCoordinator64DMado(parent.outerSemanticsNode, NodeKind.m4320constructorimpl(8)), coordinates, false, 2, null);
            }
        }
        return Rect.Companion.getZero();
    }

    public final Rect getBoundsInRoot() {
        Rect boundsInRoot;
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null && (boundsInRoot = LayoutCoordinatesKt.boundsInRoot(findCoordinatorToGetBounds$ui_release)) != null) {
                return boundsInRoot;
            }
        }
        return Rect.Companion.getZero();
    }

    public final Rect getBoundsInWindow() {
        Rect boundsInWindow;
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null && (boundsInWindow = LayoutCoordinatesKt.boundsInWindow(findCoordinatorToGetBounds$ui_release)) != null) {
                return boundsInWindow;
            }
        }
        return Rect.Companion.getZero();
    }

    public final List<SemanticsNode> getChildren() {
        return getChildren(!this.mergingEnabled, false);
    }

    public final SemanticsConfiguration getConfig() {
        if (isMergingSemanticsOfDescendants()) {
            SemanticsConfiguration copy = this.unmergedConfig.copy();
            mergeConfig(copy);
            return copy;
        }
        return this.unmergedConfig;
    }

    public final int getId() {
        return this.id;
    }

    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    public final LayoutNode getLayoutNode$ui_release() {
        return this.layoutNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    public final Modifier.Node getOuterSemanticsNode$ui_release() {
        return this.outerSemanticsNode;
    }

    public final SemanticsNode getParent() {
        LayoutNode layoutNode;
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        if (this.mergingEnabled) {
            layoutNode = SemanticsNodeKt.findClosestParentNode(this.layoutNode, SemanticsNode$parent$1.INSTANCE);
        } else {
            layoutNode = null;
        }
        if (layoutNode == null) {
            layoutNode = SemanticsNodeKt.findClosestParentNode(this.layoutNode, SemanticsNode$parent$2.INSTANCE);
        }
        if (layoutNode == null) {
            return null;
        }
        return SemanticsNodeKt.SemanticsNode(layoutNode, this.mergingEnabled);
    }

    /* renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m4508getPositionInRootF1C5BW0() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInRoot(findCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.Companion.m2728getZeroF1C5BW0();
    }

    /* renamed from: getPositionInWindow-F1C5BW0, reason: not valid java name */
    public final long m4509getPositionInWindowF1C5BW0() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInWindow(findCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.Companion.m2728getZeroF1C5BW0();
    }

    public final List<SemanticsNode> getReplacedChildren$ui_release() {
        return getChildren(false, true);
    }

    public final RootForTest getRoot() {
        Owner owner$ui_release = this.layoutNode.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release.getRootForTest();
        }
        return null;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m4510getSizeYbymL2g() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            return findCoordinatorToGetBounds$ui_release.mo4115getSizeYbymL2g();
        }
        return IntSize.Companion.m5326getZeroYbymL2g();
    }

    public final Rect getTouchBoundsInRoot() {
        DelegatableNode delegatableNode;
        if (this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            delegatableNode = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
            if (delegatableNode == null) {
                delegatableNode = this.outerSemanticsNode;
            }
        } else {
            delegatableNode = this.outerSemanticsNode;
        }
        return SemanticsModifierNodeKt.touchBoundsInRoot(delegatableNode.getNode(), SemanticsModifierNodeKt.getUseMinimumTouchTarget(this.unmergedConfig));
    }

    public final SemanticsConfiguration getUnmergedConfig$ui_release() {
        return this.unmergedConfig;
    }

    public final boolean isFake$ui_release() {
        return this.isFake;
    }

    public final boolean isRoot() {
        if (getParent() == null) {
            return true;
        }
        return false;
    }

    public final boolean isTransparent$ui_release() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            return findCoordinatorToGetBounds$ui_release.isTransparent();
        }
        return false;
    }

    public final boolean isUnmergedLeafNode$ui_release() {
        if (!this.isFake && getReplacedChildren$ui_release().isEmpty() && SemanticsNodeKt.findClosestParentNode(this.layoutNode, SemanticsNode$isUnmergedLeafNode$1.INSTANCE) == null) {
            return true;
        }
        return false;
    }

    public final void setFake$ui_release(boolean z8) {
        this.isFake = z8;
    }

    public final List<SemanticsNode> unmergedChildren$ui_release(boolean z8) {
        if (this.isFake) {
            return AbstractC1435t.m();
        }
        ArrayList arrayList = new ArrayList();
        fillOneLayerOfSemanticsWrappers(this.layoutNode, arrayList);
        if (z8) {
            emitFakeNodes(arrayList);
        }
        return arrayList;
    }

    private final List<SemanticsNode> getChildren(boolean z8, boolean z9) {
        if (!z8 && this.unmergedConfig.isClearingSemantics()) {
            return AbstractC1435t.m();
        }
        if (isMergingSemanticsOfDescendants()) {
            return findOneLayerOfMergingSemanticsNodes$default(this, null, 1, null);
        }
        return unmergedChildren$ui_release(z9);
    }
}
