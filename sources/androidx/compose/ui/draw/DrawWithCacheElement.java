package androidx.compose.ui.draw;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DrawWithCacheElement extends ModifierNodeElement<CacheDrawModifierNodeImpl> {
    private final Function1 onBuildDrawCache;

    public DrawWithCacheElement(Function1 function1) {
        this.onBuildDrawCache = function1;
    }

    public static /* synthetic */ DrawWithCacheElement copy$default(DrawWithCacheElement drawWithCacheElement, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = drawWithCacheElement.onBuildDrawCache;
        }
        return drawWithCacheElement.copy(function1);
    }

    public final Function1 component1() {
        return this.onBuildDrawCache;
    }

    public final DrawWithCacheElement copy(Function1 function1) {
        return new DrawWithCacheElement(function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && AbstractC3292y.d(this.onBuildDrawCache, ((DrawWithCacheElement) obj).onBuildDrawCache);
    }

    public final Function1 getOnBuildDrawCache() {
        return this.onBuildDrawCache;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onBuildDrawCache.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawWithCache");
        inspectorInfo.getProperties().set("onBuildDrawCache", this.onBuildDrawCache);
    }

    public String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.onBuildDrawCache + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public CacheDrawModifierNodeImpl create() {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), this.onBuildDrawCache);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl) {
        cacheDrawModifierNodeImpl.setBlock(this.onBuildDrawCache);
    }
}
