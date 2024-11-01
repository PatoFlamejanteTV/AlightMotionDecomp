package androidx.compose.ui.node;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class DepthSortedSet$mapOfOriginalDepth$2 extends AbstractC3293z implements Function0 {
    public static final DepthSortedSet$mapOfOriginalDepth$2 INSTANCE = new DepthSortedSet$mapOfOriginalDepth$2();

    DepthSortedSet$mapOfOriginalDepth$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<LayoutNode, Integer> invoke() {
        return new LinkedHashMap();
    }
}
