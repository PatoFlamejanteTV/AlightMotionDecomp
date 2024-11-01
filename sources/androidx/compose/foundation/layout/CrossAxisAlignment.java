package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public abstract class CrossAxisAlignment {
    public static final Companion Companion = new Companion(null);
    private static final CrossAxisAlignment Center = CenterCrossAxisAlignment.INSTANCE;
    private static final CrossAxisAlignment Start = StartCrossAxisAlignment.INSTANCE;
    private static final CrossAxisAlignment End = EndCrossAxisAlignment.INSTANCE;

    /* loaded from: classes.dex */
    private static final class AlignmentLineCrossAxisAlignment extends CrossAxisAlignment {
        private final AlignmentLineProvider alignmentLineProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlignmentLineCrossAxisAlignment(AlignmentLineProvider alignmentLineProvider) {
            super(null);
            AbstractC3292y.i(alignmentLineProvider, "alignmentLineProvider");
            this.alignmentLineProvider = alignmentLineProvider;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i8, LayoutDirection layoutDirection, Placeable placeable, int i9) {
            AbstractC3292y.i(layoutDirection, "layoutDirection");
            AbstractC3292y.i(placeable, "placeable");
            int calculateAlignmentLinePosition = this.alignmentLineProvider.calculateAlignmentLinePosition(placeable);
            if (calculateAlignmentLinePosition != Integer.MIN_VALUE) {
                int i10 = i9 - calculateAlignmentLinePosition;
                if (layoutDirection == LayoutDirection.Rtl) {
                    return i8 - i10;
                }
                return i10;
            }
            return 0;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public Integer calculateAlignmentLinePosition$foundation_layout_release(Placeable placeable) {
            AbstractC3292y.i(placeable, "placeable");
            return Integer.valueOf(this.alignmentLineProvider.calculateAlignmentLinePosition(placeable));
        }

        public final AlignmentLineProvider getAlignmentLineProvider() {
            return this.alignmentLineProvider;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public boolean isRelative$foundation_layout_release() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    private static final class CenterCrossAxisAlignment extends CrossAxisAlignment {
        public static final CenterCrossAxisAlignment INSTANCE = new CenterCrossAxisAlignment();

        private CenterCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i8, LayoutDirection layoutDirection, Placeable placeable, int i9) {
            AbstractC3292y.i(layoutDirection, "layoutDirection");
            AbstractC3292y.i(placeable, "placeable");
            return i8 / 2;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getStart$annotations() {
        }

        public final CrossAxisAlignment AlignmentLine(AlignmentLine alignmentLine) {
            AbstractC3292y.i(alignmentLine, "alignmentLine");
            return new AlignmentLineCrossAxisAlignment(new AlignmentLineProvider.Value(alignmentLine));
        }

        public final CrossAxisAlignment Relative$foundation_layout_release(AlignmentLineProvider alignmentLineProvider) {
            AbstractC3292y.i(alignmentLineProvider, "alignmentLineProvider");
            return new AlignmentLineCrossAxisAlignment(alignmentLineProvider);
        }

        public final CrossAxisAlignment getCenter() {
            return CrossAxisAlignment.Center;
        }

        public final CrossAxisAlignment getEnd() {
            return CrossAxisAlignment.End;
        }

        public final CrossAxisAlignment getStart() {
            return CrossAxisAlignment.Start;
        }

        public final CrossAxisAlignment horizontal$foundation_layout_release(Alignment.Horizontal horizontal) {
            AbstractC3292y.i(horizontal, "horizontal");
            return new HorizontalCrossAxisAlignment(horizontal);
        }

        public final CrossAxisAlignment vertical$foundation_layout_release(Alignment.Vertical vertical) {
            AbstractC3292y.i(vertical, "vertical");
            return new VerticalCrossAxisAlignment(vertical);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    private static final class EndCrossAxisAlignment extends CrossAxisAlignment {
        public static final EndCrossAxisAlignment INSTANCE = new EndCrossAxisAlignment();

        private EndCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i8, LayoutDirection layoutDirection, Placeable placeable, int i9) {
            AbstractC3292y.i(layoutDirection, "layoutDirection");
            AbstractC3292y.i(placeable, "placeable");
            if (layoutDirection != LayoutDirection.Ltr) {
                return 0;
            }
            return i8;
        }
    }

    /* loaded from: classes.dex */
    private static final class HorizontalCrossAxisAlignment extends CrossAxisAlignment {
        private final Alignment.Horizontal horizontal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HorizontalCrossAxisAlignment(Alignment.Horizontal horizontal) {
            super(null);
            AbstractC3292y.i(horizontal, "horizontal");
            this.horizontal = horizontal;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i8, LayoutDirection layoutDirection, Placeable placeable, int i9) {
            AbstractC3292y.i(layoutDirection, "layoutDirection");
            AbstractC3292y.i(placeable, "placeable");
            return this.horizontal.align(0, i8, layoutDirection);
        }

        public final Alignment.Horizontal getHorizontal() {
            return this.horizontal;
        }
    }

    /* loaded from: classes.dex */
    private static final class StartCrossAxisAlignment extends CrossAxisAlignment {
        public static final StartCrossAxisAlignment INSTANCE = new StartCrossAxisAlignment();

        private StartCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i8, LayoutDirection layoutDirection, Placeable placeable, int i9) {
            AbstractC3292y.i(layoutDirection, "layoutDirection");
            AbstractC3292y.i(placeable, "placeable");
            if (layoutDirection == LayoutDirection.Ltr) {
                return 0;
            }
            return i8;
        }
    }

    /* loaded from: classes.dex */
    private static final class VerticalCrossAxisAlignment extends CrossAxisAlignment {
        private final Alignment.Vertical vertical;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerticalCrossAxisAlignment(Alignment.Vertical vertical) {
            super(null);
            AbstractC3292y.i(vertical, "vertical");
            this.vertical = vertical;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i8, LayoutDirection layoutDirection, Placeable placeable, int i9) {
            AbstractC3292y.i(layoutDirection, "layoutDirection");
            AbstractC3292y.i(placeable, "placeable");
            return this.vertical.align(0, i8);
        }

        public final Alignment.Vertical getVertical() {
            return this.vertical;
        }
    }

    public /* synthetic */ CrossAxisAlignment(AbstractC3284p abstractC3284p) {
        this();
    }

    public abstract int align$foundation_layout_release(int i8, LayoutDirection layoutDirection, Placeable placeable, int i9);

    public Integer calculateAlignmentLinePosition$foundation_layout_release(Placeable placeable) {
        AbstractC3292y.i(placeable, "placeable");
        return null;
    }

    public boolean isRelative$foundation_layout_release() {
        return false;
    }

    private CrossAxisAlignment() {
    }
}
