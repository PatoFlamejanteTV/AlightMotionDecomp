package androidx.compose.ui.platform;

import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollObservationScope implements OwnerScope {
    private final List<ScrollObservationScope> allScopes;
    private ScrollAxisRange horizontalScrollAxisRange;
    private Float oldXValue;
    private Float oldYValue;
    private final int semanticsNodeId;
    private ScrollAxisRange verticalScrollAxisRange;

    public ScrollObservationScope(int i8, List<ScrollObservationScope> list, Float f8, Float f9, ScrollAxisRange scrollAxisRange, ScrollAxisRange scrollAxisRange2) {
        this.semanticsNodeId = i8;
        this.allScopes = list;
        this.oldXValue = f8;
        this.oldYValue = f9;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }

    public final List<ScrollObservationScope> getAllScopes() {
        return this.allScopes;
    }

    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    public final Float getOldXValue() {
        return this.oldXValue;
    }

    public final Float getOldYValue() {
        return this.oldYValue;
    }

    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.allScopes.contains(this);
    }

    public final void setHorizontalScrollAxisRange(ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final void setOldXValue(Float f8) {
        this.oldXValue = f8;
    }

    public final void setOldYValue(Float f8) {
        this.oldYValue = f8;
    }

    public final void setVerticalScrollAxisRange(ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }
}
