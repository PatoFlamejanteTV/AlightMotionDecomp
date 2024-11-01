package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class SiblingsAlignedNode extends Modifier.Node implements ParentDataModifierNode {

    /* loaded from: classes.dex */
    public static final class WithAlignmentLineBlockNode extends SiblingsAlignedNode {
        private Function1 block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithAlignmentLineBlockNode(Function1 block) {
            super(null);
            AbstractC3292y.i(block, "block");
            this.block = block;
        }

        public final Function1 getBlock() {
            return this.block;
        }

        @Override // androidx.compose.foundation.layout.SiblingsAlignedNode, androidx.compose.ui.node.ParentDataModifierNode
        public Object modifyParentData(Density density, Object obj) {
            RowColumnParentData rowColumnParentData;
            AbstractC3292y.i(density, "<this>");
            if (obj instanceof RowColumnParentData) {
                rowColumnParentData = (RowColumnParentData) obj;
            } else {
                rowColumnParentData = null;
            }
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.Relative$foundation_layout_release(new AlignmentLineProvider.Block(this.block)));
            return rowColumnParentData;
        }

        public final void setBlock(Function1 function1) {
            AbstractC3292y.i(function1, "<set-?>");
            this.block = function1;
        }
    }

    /* loaded from: classes.dex */
    public static final class WithAlignmentLineNode extends SiblingsAlignedNode {
        private AlignmentLine alignmentLine;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithAlignmentLineNode(AlignmentLine alignmentLine) {
            super(null);
            AbstractC3292y.i(alignmentLine, "alignmentLine");
            this.alignmentLine = alignmentLine;
        }

        public final AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        @Override // androidx.compose.foundation.layout.SiblingsAlignedNode, androidx.compose.ui.node.ParentDataModifierNode
        public Object modifyParentData(Density density, Object obj) {
            RowColumnParentData rowColumnParentData;
            AbstractC3292y.i(density, "<this>");
            if (obj instanceof RowColumnParentData) {
                rowColumnParentData = (RowColumnParentData) obj;
            } else {
                rowColumnParentData = null;
            }
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.Relative$foundation_layout_release(new AlignmentLineProvider.Value(this.alignmentLine)));
            return rowColumnParentData;
        }

        public final void setAlignmentLine(AlignmentLine alignmentLine) {
            AbstractC3292y.i(alignmentLine, "<set-?>");
            this.alignmentLine = alignmentLine;
        }
    }

    public /* synthetic */ SiblingsAlignedNode(AbstractC3284p abstractC3284p) {
        this();
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public abstract Object modifyParentData(Density density, Object obj);

    private SiblingsAlignedNode() {
    }
}
