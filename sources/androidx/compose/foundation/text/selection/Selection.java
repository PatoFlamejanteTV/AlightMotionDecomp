package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class Selection {
    private final AnchorInfo end;
    private final boolean handlesCrossed;
    private final AnchorInfo start;

    @Immutable
    /* loaded from: classes.dex */
    public static final class AnchorInfo {
        private final ResolvedTextDirection direction;
        private final int offset;
        private final long selectableId;

        public AnchorInfo(ResolvedTextDirection direction, int i8, long j8) {
            AbstractC3292y.i(direction, "direction");
            this.direction = direction;
            this.offset = i8;
            this.selectableId = j8;
        }

        public static /* synthetic */ AnchorInfo copy$default(AnchorInfo anchorInfo, ResolvedTextDirection resolvedTextDirection, int i8, long j8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                resolvedTextDirection = anchorInfo.direction;
            }
            if ((i9 & 2) != 0) {
                i8 = anchorInfo.offset;
            }
            if ((i9 & 4) != 0) {
                j8 = anchorInfo.selectableId;
            }
            return anchorInfo.copy(resolvedTextDirection, i8, j8);
        }

        public final ResolvedTextDirection component1() {
            return this.direction;
        }

        public final int component2() {
            return this.offset;
        }

        public final long component3() {
            return this.selectableId;
        }

        public final AnchorInfo copy(ResolvedTextDirection direction, int i8, long j8) {
            AbstractC3292y.i(direction, "direction");
            return new AnchorInfo(direction, i8, j8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) obj;
            return this.direction == anchorInfo.direction && this.offset == anchorInfo.offset && this.selectableId == anchorInfo.selectableId;
        }

        public final ResolvedTextDirection getDirection() {
            return this.direction;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final long getSelectableId() {
            return this.selectableId;
        }

        public int hashCode() {
            return (((this.direction.hashCode() * 31) + this.offset) * 31) + androidx.collection.a.a(this.selectableId);
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.direction + ", offset=" + this.offset + ", selectableId=" + this.selectableId + ')';
        }
    }

    public Selection(AnchorInfo start, AnchorInfo end, boolean z8) {
        AbstractC3292y.i(start, "start");
        AbstractC3292y.i(end, "end");
        this.start = start;
        this.end = end;
        this.handlesCrossed = z8;
    }

    public static /* synthetic */ Selection copy$default(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            anchorInfo = selection.start;
        }
        if ((i8 & 2) != 0) {
            anchorInfo2 = selection.end;
        }
        if ((i8 & 4) != 0) {
            z8 = selection.handlesCrossed;
        }
        return selection.copy(anchorInfo, anchorInfo2, z8);
    }

    public final AnchorInfo component1() {
        return this.start;
    }

    public final AnchorInfo component2() {
        return this.end;
    }

    public final boolean component3() {
        return this.handlesCrossed;
    }

    public final Selection copy(AnchorInfo start, AnchorInfo end, boolean z8) {
        AbstractC3292y.i(start, "start");
        AbstractC3292y.i(end, "end");
        return new Selection(start, end, z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        return AbstractC3292y.d(this.start, selection.start) && AbstractC3292y.d(this.end, selection.end) && this.handlesCrossed == selection.handlesCrossed;
    }

    public final AnchorInfo getEnd() {
        return this.end;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    public final AnchorInfo getStart() {
        return this.start;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.start.hashCode() * 31) + this.end.hashCode()) * 31;
        boolean z8 = this.handlesCrossed;
        int i8 = z8;
        if (z8 != 0) {
            i8 = 1;
        }
        return hashCode + i8;
    }

    public final Selection merge(Selection selection) {
        if (selection == null) {
            return this;
        }
        if (this.handlesCrossed) {
            return copy$default(this, selection.start, null, false, 6, null);
        }
        return copy$default(this, null, selection.end, false, 5, null);
    }

    public String toString() {
        return "Selection(start=" + this.start + ", end=" + this.end + ", handlesCrossed=" + this.handlesCrossed + ')';
    }

    /* renamed from: toTextRange-d9O1mEE, reason: not valid java name */
    public final long m996toTextRanged9O1mEE() {
        return TextRangeKt.TextRange(this.start.getOffset(), this.end.getOffset());
    }

    public /* synthetic */ Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this(anchorInfo, anchorInfo2, (i8 & 4) != 0 ? false : z8);
    }
}
