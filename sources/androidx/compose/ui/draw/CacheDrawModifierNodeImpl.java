package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CacheDrawModifierNodeImpl extends Modifier.Node implements CacheDrawModifierNode, ObserverModifierNode, BuildDrawCacheParams {
    private Function1 block;
    private final CacheDrawScope cacheDrawScope;
    private boolean isCacheValid;

    public CacheDrawModifierNodeImpl(CacheDrawScope cacheDrawScope, Function1 function1) {
        this.cacheDrawScope = cacheDrawScope;
        this.block = function1;
        cacheDrawScope.setCacheParams$ui_release(this);
    }

    private final DrawResult getOrBuildCachedDrawBlock() {
        if (!this.isCacheValid) {
            CacheDrawScope cacheDrawScope = this.cacheDrawScope;
            cacheDrawScope.setDrawResult$ui_release(null);
            ObserverModifierNodeKt.observeReads(this, new CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1(this, cacheDrawScope));
            if (cacheDrawScope.getDrawResult$ui_release() != null) {
                this.isCacheValid = true;
            } else {
                throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
            }
        }
        DrawResult drawResult$ui_release = this.cacheDrawScope.getDrawResult$ui_release();
        AbstractC3292y.f(drawResult$ui_release);
        return drawResult$ui_release;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        getOrBuildCachedDrawBlock().getBlock$ui_release().invoke(contentDrawScope);
    }

    public final Function1 getBlock() {
        return this.block;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public Density getDensity() {
        return DelegatableNodeKt.requireDensity(this);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutDirection(this);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo2614getSizeNHjbRc() {
        return IntSizeKt.m5331toSizeozmzZPI(DelegatableNodeKt.m4203requireCoordinator64DMado(this, NodeKind.m4320constructorimpl(128)).mo4115getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.draw.CacheDrawModifierNode
    public void invalidateDrawCache() {
        this.isCacheValid = false;
        this.cacheDrawScope.setDrawResult$ui_release(null);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        invalidateDrawCache();
    }

    public final void setBlock(Function1 function1) {
        this.block = function1;
        invalidateDrawCache();
    }
}
