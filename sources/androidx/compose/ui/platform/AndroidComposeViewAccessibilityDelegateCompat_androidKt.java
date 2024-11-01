package androidx.compose.ui.platform;

import R5.AbstractC1435t;
import android.graphics.Region;
import android.view.View;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import e6.AbstractC2829a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    private static final Rect DefaultFakeNodeBounds = new Rect(0.0f, 0.0f, 10.0f, 10.0f);
    private static boolean DisableContentCapture;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean accessibilityEquals(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!AbstractC3292y.d(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.getAction() == null && accessibilityAction2.getAction() != null) {
            return false;
        }
        if (accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enabled(SemanticsNode semanticsNode) {
        if (SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getDisabled()) == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        boolean z8;
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText()) && !AbstractC3292y.d(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode findClosestParentNode = findClosestParentNode(semanticsNode.getLayoutNode$ui_release(), AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.INSTANCE);
        if (findClosestParentNode != null) {
            SemanticsConfiguration collapsedSemantics$ui_release = findClosestParentNode.getCollapsedSemantics$ui_release();
            if (collapsedSemantics$ui_release != null) {
                z8 = AbstractC3292y.d(SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE);
            } else {
                z8 = false;
            }
            if (!z8) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrollObservationScope findById(List<ScrollObservationScope> list, int i8) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (list.get(i9).getSemanticsNodeId() == i8) {
                return list.get(i9);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, Function1 function1) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (((Boolean) function1.invoke(parent$ui_release)).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Integer, SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToMap(SemanticsOwner semanticsOwner) {
        SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (unmergedRootSemanticsNode.getLayoutNode$ui_release().isPlaced() && unmergedRootSemanticsNode.getLayoutNode$ui_release().isAttached()) {
            Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
            getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(new Region(AbstractC2829a.d(boundsInRoot.getLeft()), AbstractC2829a.d(boundsInRoot.getTop()), AbstractC2829a.d(boundsInRoot.getRight()), AbstractC2829a.d(boundsInRoot.getBottom())), unmergedRootSemanticsNode, linkedHashMap, unmergedRootSemanticsNode, new Region());
        }
        return linkedHashMap;
    }

    private static final void getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(Region region, SemanticsNode semanticsNode, Map<Integer, SemanticsNodeWithAdjustedBounds> map, SemanticsNode semanticsNode2, Region region2) {
        boolean z8;
        int id;
        Rect rect;
        LayoutInfo layoutInfo;
        if (semanticsNode2.getLayoutNode$ui_release().isPlaced() && semanticsNode2.getLayoutNode$ui_release().isAttached()) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (!region.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (z8 && !semanticsNode2.isFake$ui_release()) {
                return;
            }
            Rect touchBoundsInRoot = semanticsNode2.getTouchBoundsInRoot();
            int d8 = AbstractC2829a.d(touchBoundsInRoot.getLeft());
            int d9 = AbstractC2829a.d(touchBoundsInRoot.getTop());
            int d10 = AbstractC2829a.d(touchBoundsInRoot.getRight());
            int d11 = AbstractC2829a.d(touchBoundsInRoot.getBottom());
            region2.set(d8, d9, d10, d11);
            if (semanticsNode2.getId() == semanticsNode.getId()) {
                id = -1;
            } else {
                id = semanticsNode2.getId();
            }
            if (region2.op(region, Region.Op.INTERSECT)) {
                map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                List<SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
                for (int size = replacedChildren$ui_release.size() - 1; -1 < size; size--) {
                    getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region, semanticsNode, map, replacedChildren$ui_release.get(size), region2);
                }
                if (isImportantForAccessibility(semanticsNode2)) {
                    region.op(d8, d9, d10, d11, Region.Op.DIFFERENCE);
                    return;
                }
                return;
            }
            if (semanticsNode2.isFake$ui_release()) {
                SemanticsNode parent = semanticsNode2.getParent();
                if (parent != null && (layoutInfo = parent.getLayoutInfo()) != null && layoutInfo.isPlaced()) {
                    rect = parent.getBoundsInRoot();
                } else {
                    rect = DefaultFakeNodeBounds;
                }
                map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(AbstractC2829a.d(rect.getLeft()), AbstractC2829a.d(rect.getTop()), AbstractC2829a.d(rect.getRight()), AbstractC2829a.d(rect.getBottom()))));
                return;
            }
            if (id == -1) {
                map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final boolean getDisableContentCapture() {
        return DisableContentCapture;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getDisableContentCapture$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInfoContentDescriptionOrNull(SemanticsNode semanticsNode) {
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
        if (list != null) {
            return (String) AbstractC1435t.o0(list);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getTextForTranslation(SemanticsNode semanticsNode) {
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (list != null) {
            return ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    private static final float getTraversalIndex(SemanticsNode semanticsNode) {
        return ((Number) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getTraversalIndex(), AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1.INSTANCE)).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasPaneTitle(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAncestorOf(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode parent$ui_release = layoutNode2.getParent$ui_release();
        if (parent$ui_release == null) {
            return false;
        }
        if (!AbstractC3292y.d(parent$ui_release, layoutNode) && !isAncestorOf(layoutNode, parent$ui_release)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isImportantForAccessibility(SemanticsNode semanticsNode) {
        if (!semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() && !semanticsNode.getUnmergedConfig$ui_release().containsImportantForAccessibility$ui_release()) {
            return false;
        }
        return true;
    }

    private static final boolean isPassword(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPassword());
    }

    private static final boolean isRtl(SemanticsNode semanticsNode) {
        if (semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl) {
            return true;
        }
        return false;
    }

    private static final boolean isTextField(SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText());
    }

    private static final boolean isTraversalGroup(SemanticsNode semanticsNode) {
        return ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), AndroidComposeViewAccessibilityDelegateCompat_androidKt$isTraversalGroup$1.INSTANCE)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isVisible(SemanticsNode semanticsNode) {
        if (!semanticsNode.isTransparent$ui_release() && !semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) {
            return true;
        }
        return false;
    }

    private static /* synthetic */ void isVisible$annotations(SemanticsNode semanticsNode) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean propertiesDeleted(SemanticsNode semanticsNode, SemanticsConfiguration semanticsConfiguration) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!semanticsNode.getConfig().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final View semanticsIdToView(AndroidViewsHandler androidViewsHandler, int i8) {
        Object obj;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((LayoutNode) ((Map.Entry) obj).getKey()).getSemanticsId() == i8) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (AndroidViewHolder) entry.getValue();
    }

    @ExperimentalComposeUiApi
    public static final void setDisableContentCapture(boolean z8) {
        DisableContentCapture = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLegacyClassName-V4PA4sw, reason: not valid java name */
    public static final String m4412toLegacyClassNameV4PA4sw(int i8) {
        Role.Companion companion = Role.Companion;
        if (Role.m4496equalsimpl0(i8, companion.m4500getButtono7Vup1c())) {
            return "android.widget.Button";
        }
        if (Role.m4496equalsimpl0(i8, companion.m4501getCheckboxo7Vup1c())) {
            return "android.widget.CheckBox";
        }
        if (Role.m4496equalsimpl0(i8, companion.m4504getRadioButtono7Vup1c())) {
            return "android.widget.RadioButton";
        }
        if (Role.m4496equalsimpl0(i8, companion.m4503getImageo7Vup1c())) {
            return "android.widget.ImageView";
        }
        if (Role.m4496equalsimpl0(i8, companion.m4502getDropdownListo7Vup1c())) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
