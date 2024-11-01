package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FillElement extends ModifierNodeElement<FillNode> {
    public static final Companion Companion = new Companion(null);
    private final Direction direction;
    private final float fraction;
    private final String inspectorName;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        public final FillElement height(float f8) {
            return new FillElement(Direction.Vertical, f8, "fillMaxHeight");
        }

        @Stable
        public final FillElement size(float f8) {
            return new FillElement(Direction.Both, f8, "fillMaxSize");
        }

        @Stable
        public final FillElement width(float f8) {
            return new FillElement(Direction.Horizontal, f8, "fillMaxWidth");
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public FillElement(Direction direction, float f8, String inspectorName) {
        AbstractC3292y.i(direction, "direction");
        AbstractC3292y.i(inspectorName, "inspectorName");
        this.direction = direction;
        this.fraction = f8;
        this.inspectorName = inspectorName;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        if (this.direction == fillElement.direction && this.fraction == fillElement.fraction) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.direction.hashCode() * 31) + Float.floatToIntBits(this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.getProperties().set("fraction", Float.valueOf(this.fraction));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FillNode create() {
        return new FillNode(this.direction, this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FillNode node) {
        AbstractC3292y.i(node, "node");
        node.setDirection(this.direction);
        node.setFraction(this.fraction);
    }
}
