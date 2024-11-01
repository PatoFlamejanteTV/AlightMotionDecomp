package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class AlignmentLineProvider {

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Block extends AlignmentLineProvider {
        public static final int $stable = 0;
        private final Function1 lineProviderBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Block(Function1 lineProviderBlock) {
            super(null);
            AbstractC3292y.i(lineProviderBlock, "lineProviderBlock");
            this.lineProviderBlock = lineProviderBlock;
        }

        public static /* synthetic */ Block copy$default(Block block, Function1 function1, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                function1 = block.lineProviderBlock;
            }
            return block.copy(function1);
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(Placeable placeable) {
            AbstractC3292y.i(placeable, "placeable");
            return ((Number) this.lineProviderBlock.invoke(placeable)).intValue();
        }

        public final Function1 component1() {
            return this.lineProviderBlock;
        }

        public final Block copy(Function1 lineProviderBlock) {
            AbstractC3292y.i(lineProviderBlock, "lineProviderBlock");
            return new Block(lineProviderBlock);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Block) && AbstractC3292y.d(this.lineProviderBlock, ((Block) obj).lineProviderBlock);
        }

        public final Function1 getLineProviderBlock() {
            return this.lineProviderBlock;
        }

        public int hashCode() {
            return this.lineProviderBlock.hashCode();
        }

        public String toString() {
            return "Block(lineProviderBlock=" + this.lineProviderBlock + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Value extends AlignmentLineProvider {
        public static final int $stable = 0;
        private final AlignmentLine alignmentLine;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Value(AlignmentLine alignmentLine) {
            super(null);
            AbstractC3292y.i(alignmentLine, "alignmentLine");
            this.alignmentLine = alignmentLine;
        }

        public static /* synthetic */ Value copy$default(Value value, AlignmentLine alignmentLine, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                alignmentLine = value.alignmentLine;
            }
            return value.copy(alignmentLine);
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(Placeable placeable) {
            AbstractC3292y.i(placeable, "placeable");
            return placeable.get(this.alignmentLine);
        }

        public final AlignmentLine component1() {
            return this.alignmentLine;
        }

        public final Value copy(AlignmentLine alignmentLine) {
            AbstractC3292y.i(alignmentLine, "alignmentLine");
            return new Value(alignmentLine);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Value) && AbstractC3292y.d(this.alignmentLine, ((Value) obj).alignmentLine);
        }

        public final AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        public int hashCode() {
            return this.alignmentLine.hashCode();
        }

        public String toString() {
            return "Value(alignmentLine=" + this.alignmentLine + ')';
        }
    }

    private AlignmentLineProvider() {
    }

    public abstract int calculateAlignmentLinePosition(Placeable placeable);

    public /* synthetic */ AlignmentLineProvider(AbstractC3284p abstractC3284p) {
        this();
    }
}
