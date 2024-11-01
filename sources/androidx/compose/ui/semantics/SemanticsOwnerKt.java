package androidx.compose.ui.semantics;

import R5.AbstractC1435t;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class SemanticsOwnerKt {
    public static final List<SemanticsNode> getAllSemanticsNodes(SemanticsOwner semanticsOwner, boolean z8, boolean z9) {
        return AbstractC1435t.W0(getAllSemanticsNodesToMap(semanticsOwner, !z8, z9).values());
    }

    public static /* synthetic */ List getAllSemanticsNodes$default(SemanticsOwner semanticsOwner, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z9 = true;
        }
        return getAllSemanticsNodes(semanticsOwner, z8, z9);
    }

    public static final Map<Integer, SemanticsNode> getAllSemanticsNodesToMap(SemanticsOwner semanticsOwner, boolean z8, boolean z9) {
        SemanticsNode rootSemanticsNode;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z8) {
            rootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        } else {
            rootSemanticsNode = semanticsOwner.getRootSemanticsNode();
        }
        getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(z9, linkedHashMap, rootSemanticsNode);
        return linkedHashMap;
    }

    public static /* synthetic */ Map getAllSemanticsNodesToMap$default(SemanticsOwner semanticsOwner, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        if ((i8 & 2) != 0) {
            z9 = true;
        }
        return getAllSemanticsNodesToMap(semanticsOwner, z8, z9);
    }

    private static final void getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(boolean z8, Map<Integer, SemanticsNode> map, SemanticsNode semanticsNode) {
        if (!z8 || !semanticsNode.getLayoutInfo().isDeactivated()) {
            map.put(Integer.valueOf(semanticsNode.getId()), semanticsNode);
            List<SemanticsNode> children = semanticsNode.getChildren();
            int size = children.size();
            for (int i8 = 0; i8 < size; i8++) {
                getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(z8, map, children.get(i8));
            }
        }
    }
}
