package androidx.compose.foundation.layout;

import R5.AbstractC1428l;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import e6.AbstractC2829a;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class Arrangement {
    public static final int $stable = 0;
    public static final Arrangement INSTANCE = new Arrangement();
    private static final Horizontal Start = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Start$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i8, int[] sizes, LayoutDirection layoutDirection, int[] outPositions) {
            AbstractC3292y.i(density, "<this>");
            AbstractC3292y.i(sizes, "sizes");
            AbstractC3292y.i(layoutDirection, "layoutDirection");
            AbstractC3292y.i(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(sizes, outPositions, false);
            } else {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i8, sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public /* synthetic */ float mo497getSpacingD9Ej5fM() {
            return a.a(this);
        }

        public String toString() {
            return "Arrangement#Start";
        }
    };
    private static final Horizontal End = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$End$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i8, int[] sizes, LayoutDirection layoutDirection, int[] outPositions) {
            AbstractC3292y.i(density, "<this>");
            AbstractC3292y.i(sizes, "sizes");
            AbstractC3292y.i(layoutDirection, "layoutDirection");
            AbstractC3292y.i(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i8, sizes, outPositions, false);
            } else {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public /* synthetic */ float mo497getSpacingD9Ej5fM() {
            return a.a(this);
        }

        public String toString() {
            return "Arrangement#End";
        }
    };
    private static final Vertical Top = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i8, int[] sizes, int[] outPositions) {
            AbstractC3292y.i(density, "<this>");
            AbstractC3292y.i(sizes, "sizes");
            AbstractC3292y.i(outPositions, "outPositions");
            Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(sizes, outPositions, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public /* synthetic */ float mo497getSpacingD9Ej5fM() {
            return c.a(this);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    };
    private static final Vertical Bottom = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Bottom$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i8, int[] sizes, int[] outPositions) {
            AbstractC3292y.i(density, "<this>");
            AbstractC3292y.i(sizes, "sizes");
            AbstractC3292y.i(outPositions, "outPositions");
            Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i8, sizes, outPositions, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public /* synthetic */ float mo497getSpacingD9Ej5fM() {
            return c.a(this);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    };
    private static final HorizontalOrVertical Center = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1
        private final float spacing = Dp.m5155constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i8, int[] sizes, LayoutDirection layoutDirection, int[] outPositions) {
            AbstractC3292y.i(density, "<this>");
            AbstractC3292y.i(sizes, "sizes");
            AbstractC3292y.i(layoutDirection, "layoutDirection");
            AbstractC3292y.i(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i8, sizes, outPositions, false);
            } else {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i8, sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo497getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#Center";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i8, int[] sizes, int[] outPositions) {
            AbstractC3292y.i(density, "<this>");
            AbstractC3292y.i(sizes, "sizes");
            AbstractC3292y.i(outPositions, "outPositions");
            Arrangement.INSTANCE.placeCenter$foundation_layout_release(i8, sizes, outPositions, false);
        }
    };
    private static final HorizontalOrVertical SpaceEvenly = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1
        private final float spacing = Dp.m5155constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i8, int[] sizes, LayoutDirection layoutDirection, int[] outPositions) {
            AbstractC3292y.i(density, "<this>");
            AbstractC3292y.i(sizes, "sizes");
            AbstractC3292y.i(layoutDirection, "layoutDirection");
            AbstractC3292y.i(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i8, sizes, outPositions, false);
            } else {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i8, sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo497getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i8, int[] sizes, int[] outPositions) {
            AbstractC3292y.i(density, "<this>");
            AbstractC3292y.i(sizes, "sizes");
            AbstractC3292y.i(outPositions, "outPositions");
            Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i8, sizes, outPositions, false);
        }
    };
    private static final HorizontalOrVertical SpaceBetween = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1
        private final float spacing = Dp.m5155constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i8, int[] sizes, LayoutDirection layoutDirection, int[] outPositions) {
            AbstractC3292y.i(density, "<this>");
            AbstractC3292y.i(sizes, "sizes");
            AbstractC3292y.i(layoutDirection, "layoutDirection");
            AbstractC3292y.i(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i8, sizes, outPositions, false);
            } else {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i8, sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo497getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i8, int[] sizes, int[] outPositions) {
            AbstractC3292y.i(density, "<this>");
            AbstractC3292y.i(sizes, "sizes");
            AbstractC3292y.i(outPositions, "outPositions");
            Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i8, sizes, outPositions, false);
        }
    };
    private static final HorizontalOrVertical SpaceAround = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1
        private final float spacing = Dp.m5155constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i8, int[] sizes, LayoutDirection layoutDirection, int[] outPositions) {
            AbstractC3292y.i(density, "<this>");
            AbstractC3292y.i(sizes, "sizes");
            AbstractC3292y.i(layoutDirection, "layoutDirection");
            AbstractC3292y.i(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i8, sizes, outPositions, false);
            } else {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i8, sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo497getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i8, int[] sizes, int[] outPositions) {
            AbstractC3292y.i(density, "<this>");
            AbstractC3292y.i(sizes, "sizes");
            AbstractC3292y.i(outPositions, "outPositions");
            Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i8, sizes, outPositions, false);
        }
    };

    @Immutable
    /* loaded from: classes.dex */
    public static final class Absolute {
        public static final int $stable = 0;
        public static final Absolute INSTANCE = new Absolute();
        private static final Horizontal Left = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Left$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i8, int[] sizes, LayoutDirection layoutDirection, int[] outPositions) {
                AbstractC3292y.i(density, "<this>");
                AbstractC3292y.i(sizes, "sizes");
                AbstractC3292y.i(layoutDirection, "layoutDirection");
                AbstractC3292y.i(outPositions, "outPositions");
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(sizes, outPositions, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* renamed from: getSpacing-D9Ej5fM */
            public /* synthetic */ float mo497getSpacingD9Ej5fM() {
                return a.a(this);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        };
        private static final Horizontal Center = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Center$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i8, int[] sizes, LayoutDirection layoutDirection, int[] outPositions) {
                AbstractC3292y.i(density, "<this>");
                AbstractC3292y.i(sizes, "sizes");
                AbstractC3292y.i(layoutDirection, "layoutDirection");
                AbstractC3292y.i(outPositions, "outPositions");
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i8, sizes, outPositions, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public /* synthetic */ float mo497getSpacingD9Ej5fM() {
                return a.a(this);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        };
        private static final Horizontal Right = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Right$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i8, int[] sizes, LayoutDirection layoutDirection, int[] outPositions) {
                AbstractC3292y.i(density, "<this>");
                AbstractC3292y.i(sizes, "sizes");
                AbstractC3292y.i(layoutDirection, "layoutDirection");
                AbstractC3292y.i(outPositions, "outPositions");
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i8, sizes, outPositions, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* renamed from: getSpacing-D9Ej5fM */
            public /* synthetic */ float mo497getSpacingD9Ej5fM() {
                return a.a(this);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        };
        private static final Horizontal SpaceBetween = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceBetween$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i8, int[] sizes, LayoutDirection layoutDirection, int[] outPositions) {
                AbstractC3292y.i(density, "<this>");
                AbstractC3292y.i(sizes, "sizes");
                AbstractC3292y.i(layoutDirection, "layoutDirection");
                AbstractC3292y.i(outPositions, "outPositions");
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i8, sizes, outPositions, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* renamed from: getSpacing-D9Ej5fM */
            public /* synthetic */ float mo497getSpacingD9Ej5fM() {
                return a.a(this);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        };
        private static final Horizontal SpaceEvenly = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceEvenly$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i8, int[] sizes, LayoutDirection layoutDirection, int[] outPositions) {
                AbstractC3292y.i(density, "<this>");
                AbstractC3292y.i(sizes, "sizes");
                AbstractC3292y.i(layoutDirection, "layoutDirection");
                AbstractC3292y.i(outPositions, "outPositions");
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i8, sizes, outPositions, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* renamed from: getSpacing-D9Ej5fM */
            public /* synthetic */ float mo497getSpacingD9Ej5fM() {
                return a.a(this);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        };
        private static final Horizontal SpaceAround = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceAround$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i8, int[] sizes, LayoutDirection layoutDirection, int[] outPositions) {
                AbstractC3292y.i(density, "<this>");
                AbstractC3292y.i(sizes, "sizes");
                AbstractC3292y.i(layoutDirection, "layoutDirection");
                AbstractC3292y.i(outPositions, "outPositions");
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i8, sizes, outPositions, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* renamed from: getSpacing-D9Ej5fM */
            public /* synthetic */ float mo497getSpacingD9Ej5fM() {
                return a.a(this);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        };

        private Absolute() {
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getLeft$annotations() {
        }

        @Stable
        public static /* synthetic */ void getRight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceAround$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceBetween$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceEvenly$annotations() {
        }

        @Stable
        public final Horizontal aligned(Alignment.Horizontal alignment) {
            AbstractC3292y.i(alignment, "alignment");
            return new SpacedAligned(Dp.m5155constructorimpl(0), false, new Arrangement$Absolute$aligned$1(alignment), null);
        }

        public final Horizontal getCenter() {
            return Center;
        }

        public final Horizontal getLeft() {
            return Left;
        }

        public final Horizontal getRight() {
            return Right;
        }

        public final Horizontal getSpaceAround() {
            return SpaceAround;
        }

        public final Horizontal getSpaceBetween() {
            return SpaceBetween;
        }

        public final Horizontal getSpaceEvenly() {
            return SpaceEvenly;
        }

        @Stable
        /* renamed from: spacedBy-0680j_4, reason: not valid java name */
        public final HorizontalOrVertical m494spacedBy0680j_4(float f8) {
            return new SpacedAligned(f8, false, null, 0 == true ? 1 : 0);
        }

        @Stable
        /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Horizontal m495spacedByD5KLDUw(float f8, Alignment.Horizontal alignment) {
            AbstractC3292y.i(alignment, "alignment");
            return new SpacedAligned(f8, false, new Arrangement$Absolute$spacedBy$1(alignment), null);
        }

        @Stable
        /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Vertical m496spacedByD5KLDUw(float f8, Alignment.Vertical alignment) {
            AbstractC3292y.i(alignment, "alignment");
            return new SpacedAligned(f8, false, new Arrangement$Absolute$spacedBy$2(alignment), null);
        }
    }

    @Stable
    /* loaded from: classes.dex */
    public interface Horizontal {

        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m498getSpacingD9Ej5fM(Horizontal horizontal) {
                float a9;
                a9 = a.a(horizontal);
                return a9;
            }
        }

        void arrange(Density density, int i8, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM */
        float mo497getSpacingD9Ej5fM();
    }

    @Stable
    /* loaded from: classes.dex */
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m499getSpacingD9Ej5fM(HorizontalOrVertical horizontalOrVertical) {
                float a9;
                a9 = b.a(horizontalOrVertical);
                return a9;
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        float mo497getSpacingD9Ej5fM();
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class SpacedAligned implements HorizontalOrVertical {
        private final InterfaceC2072n alignment;
        private final boolean rtlMirror;
        private final float space;
        private final float spacing;

        public /* synthetic */ SpacedAligned(float f8, boolean z8, InterfaceC2072n interfaceC2072n, AbstractC3284p abstractC3284p) {
            this(f8, z8, interfaceC2072n);
        }

        /* renamed from: copy-8Feqmps$default, reason: not valid java name */
        public static /* synthetic */ SpacedAligned m500copy8Feqmps$default(SpacedAligned spacedAligned, float f8, boolean z8, InterfaceC2072n interfaceC2072n, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = spacedAligned.space;
            }
            if ((i8 & 2) != 0) {
                z8 = spacedAligned.rtlMirror;
            }
            if ((i8 & 4) != 0) {
                interfaceC2072n = spacedAligned.alignment;
            }
            return spacedAligned.m502copy8Feqmps(f8, z8, interfaceC2072n);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i8, int[] sizes, LayoutDirection layoutDirection, int[] outPositions) {
            int i9;
            int i10;
            AbstractC3292y.i(density, "<this>");
            AbstractC3292y.i(sizes, "sizes");
            AbstractC3292y.i(layoutDirection, "layoutDirection");
            AbstractC3292y.i(outPositions, "outPositions");
            if (sizes.length == 0) {
                return;
            }
            int mo419roundToPx0680j_4 = density.mo419roundToPx0680j_4(this.space);
            boolean z8 = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
            Arrangement arrangement = Arrangement.INSTANCE;
            if (!z8) {
                int length = sizes.length;
                int i11 = 0;
                i9 = 0;
                i10 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = sizes[i11];
                    int min = Math.min(i9, i8 - i13);
                    outPositions[i12] = min;
                    int min2 = Math.min(mo419roundToPx0680j_4, (i8 - min) - i13);
                    int i14 = outPositions[i12] + i13 + min2;
                    i11++;
                    i12++;
                    i10 = min2;
                    i9 = i14;
                }
            } else {
                int length2 = sizes.length - 1;
                i9 = 0;
                i10 = 0;
                while (-1 < length2) {
                    int i15 = sizes[length2];
                    int min3 = Math.min(i9, i8 - i15);
                    outPositions[length2] = min3;
                    int min4 = Math.min(mo419roundToPx0680j_4, (i8 - min3) - i15);
                    int i16 = outPositions[length2] + i15 + min4;
                    length2--;
                    i10 = min4;
                    i9 = i16;
                }
            }
            int i17 = i9 - i10;
            InterfaceC2072n interfaceC2072n = this.alignment;
            if (interfaceC2072n == null || i17 >= i8) {
                return;
            }
            int intValue = ((Number) interfaceC2072n.invoke(Integer.valueOf(i8 - i17), layoutDirection)).intValue();
            int length3 = outPositions.length;
            for (int i18 = 0; i18 < length3; i18++) {
                outPositions[i18] = outPositions[i18] + intValue;
            }
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name */
        public final float m501component1D9Ej5fM() {
            return this.space;
        }

        public final boolean component2() {
            return this.rtlMirror;
        }

        public final InterfaceC2072n component3() {
            return this.alignment;
        }

        /* renamed from: copy-8Feqmps, reason: not valid java name */
        public final SpacedAligned m502copy8Feqmps(float f8, boolean z8, InterfaceC2072n interfaceC2072n) {
            return new SpacedAligned(f8, z8, interfaceC2072n, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) obj;
            return Dp.m5160equalsimpl0(this.space, spacedAligned.space) && this.rtlMirror == spacedAligned.rtlMirror && AbstractC3292y.d(this.alignment, spacedAligned.alignment);
        }

        public final InterfaceC2072n getAlignment() {
            return this.alignment;
        }

        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        /* renamed from: getSpace-D9Ej5fM, reason: not valid java name */
        public final float m503getSpaceD9Ej5fM() {
            return this.space;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo497getSpacingD9Ej5fM() {
            return this.spacing;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int m5161hashCodeimpl = Dp.m5161hashCodeimpl(this.space) * 31;
            boolean z8 = this.rtlMirror;
            int i8 = z8;
            if (z8 != 0) {
                i8 = 1;
            }
            int i9 = (m5161hashCodeimpl + i8) * 31;
            InterfaceC2072n interfaceC2072n = this.alignment;
            return i9 + (interfaceC2072n == null ? 0 : interfaceC2072n.hashCode());
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            if (this.rtlMirror) {
                str = "";
            } else {
                str = "Absolute";
            }
            sb.append(str);
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) Dp.m5166toStringimpl(this.space));
            sb.append(", ");
            sb.append(this.alignment);
            sb.append(')');
            return sb.toString();
        }

        private SpacedAligned(float f8, boolean z8, InterfaceC2072n interfaceC2072n) {
            this.space = f8;
            this.rtlMirror = z8;
            this.alignment = interfaceC2072n;
            this.spacing = f8;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i8, int[] sizes, int[] outPositions) {
            AbstractC3292y.i(density, "<this>");
            AbstractC3292y.i(sizes, "sizes");
            AbstractC3292y.i(outPositions, "outPositions");
            arrange(density, i8, sizes, LayoutDirection.Ltr, outPositions);
        }
    }

    @Stable
    /* loaded from: classes.dex */
    public interface Vertical {

        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m504getSpacingD9Ej5fM(Vertical vertical) {
                float a9;
                a9 = c.a(vertical);
                return a9;
            }
        }

        void arrange(Density density, int i8, int[] iArr, int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM */
        float mo497getSpacingD9Ej5fM();
    }

    private Arrangement() {
    }

    private final void forEachIndexed(int[] iArr, boolean z8, InterfaceC2072n interfaceC2072n) {
        if (!z8) {
            int length = iArr.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                interfaceC2072n.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i8]));
                i8++;
                i9++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                interfaceC2072n.invoke(Integer.valueOf(length2), Integer.valueOf(iArr[length2]));
            } else {
                return;
            }
        }
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenter$annotations() {
    }

    @Stable
    public static /* synthetic */ void getEnd$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceAround$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceBetween$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceEvenly$annotations() {
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    @Stable
    public final Horizontal aligned(Alignment.Horizontal alignment) {
        AbstractC3292y.i(alignment, "alignment");
        return new SpacedAligned(Dp.m5155constructorimpl(0), true, new Arrangement$aligned$1(alignment), null);
    }

    public final Vertical getBottom() {
        return Bottom;
    }

    public final HorizontalOrVertical getCenter() {
        return Center;
    }

    public final Horizontal getEnd() {
        return End;
    }

    public final HorizontalOrVertical getSpaceAround() {
        return SpaceAround;
    }

    public final HorizontalOrVertical getSpaceBetween() {
        return SpaceBetween;
    }

    public final HorizontalOrVertical getSpaceEvenly() {
        return SpaceEvenly;
    }

    public final Horizontal getStart() {
        return Start;
    }

    public final Vertical getTop() {
        return Top;
    }

    public final void placeCenter$foundation_layout_release(int i8, int[] size, int[] outPosition, boolean z8) {
        AbstractC3292y.i(size, "size");
        AbstractC3292y.i(outPosition, "outPosition");
        int i9 = 0;
        int i10 = 0;
        for (int i11 : size) {
            i10 += i11;
        }
        float f8 = (i8 - i10) / 2;
        if (!z8) {
            int length = size.length;
            int i12 = 0;
            while (i9 < length) {
                int i13 = size[i9];
                outPosition[i12] = AbstractC2829a.d(f8);
                f8 += i13;
                i9++;
                i12++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i14 = size[length2];
                outPosition[length2] = AbstractC2829a.d(f8);
                f8 += i14;
            } else {
                return;
            }
        }
    }

    public final void placeLeftOrTop$foundation_layout_release(int[] size, int[] outPosition, boolean z8) {
        AbstractC3292y.i(size, "size");
        AbstractC3292y.i(outPosition, "outPosition");
        int i8 = 0;
        if (!z8) {
            int length = size.length;
            int i9 = 0;
            int i10 = 0;
            while (i8 < length) {
                int i11 = size[i8];
                outPosition[i9] = i10;
                i10 += i11;
                i8++;
                i9++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i12 = size[length2];
                outPosition[length2] = i8;
                i8 += i12;
            } else {
                return;
            }
        }
    }

    public final void placeRightOrBottom$foundation_layout_release(int i8, int[] size, int[] outPosition, boolean z8) {
        AbstractC3292y.i(size, "size");
        AbstractC3292y.i(outPosition, "outPosition");
        int i9 = 0;
        int i10 = 0;
        for (int i11 : size) {
            i10 += i11;
        }
        int i12 = i8 - i10;
        if (!z8) {
            int length = size.length;
            int i13 = 0;
            while (i9 < length) {
                int i14 = size[i9];
                outPosition[i13] = i12;
                i12 += i14;
                i9++;
                i13++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i15 = size[length2];
                outPosition[length2] = i12;
                i12 += i15;
            } else {
                return;
            }
        }
    }

    public final void placeSpaceAround$foundation_layout_release(int i8, int[] size, int[] outPosition, boolean z8) {
        boolean z9;
        float f8;
        AbstractC3292y.i(size, "size");
        AbstractC3292y.i(outPosition, "outPosition");
        int i9 = 0;
        int i10 = 0;
        for (int i11 : size) {
            i10 += i11;
        }
        if (size.length == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            f8 = (i8 - i10) / size.length;
        } else {
            f8 = 0.0f;
        }
        float f9 = f8 / 2;
        if (!z8) {
            int length = size.length;
            int i12 = 0;
            while (i9 < length) {
                int i13 = size[i9];
                outPosition[i12] = AbstractC2829a.d(f9);
                f9 += i13 + f8;
                i9++;
                i12++;
            }
            return;
        }
        for (int length2 = size.length - 1; -1 < length2; length2--) {
            int i14 = size[length2];
            outPosition[length2] = AbstractC2829a.d(f9);
            f9 += i14 + f8;
        }
    }

    public final void placeSpaceBetween$foundation_layout_release(int i8, int[] size, int[] outPosition, boolean z8) {
        float f8;
        AbstractC3292y.i(size, "size");
        AbstractC3292y.i(outPosition, "outPosition");
        if (size.length == 0) {
            return;
        }
        int i9 = 0;
        int i10 = 0;
        for (int i11 : size) {
            i10 += i11;
        }
        float max = (i8 - i10) / Math.max(AbstractC1428l.g0(size), 1);
        if (z8 && size.length == 1) {
            f8 = max;
        } else {
            f8 = 0.0f;
        }
        if (!z8) {
            int length = size.length;
            int i12 = 0;
            while (i9 < length) {
                int i13 = size[i9];
                outPosition[i12] = AbstractC2829a.d(f8);
                f8 += i13 + max;
                i9++;
                i12++;
            }
            return;
        }
        for (int length2 = size.length - 1; -1 < length2; length2--) {
            int i14 = size[length2];
            outPosition[length2] = AbstractC2829a.d(f8);
            f8 += i14 + max;
        }
    }

    public final void placeSpaceEvenly$foundation_layout_release(int i8, int[] size, int[] outPosition, boolean z8) {
        AbstractC3292y.i(size, "size");
        AbstractC3292y.i(outPosition, "outPosition");
        int i9 = 0;
        int i10 = 0;
        for (int i11 : size) {
            i10 += i11;
        }
        float length = (i8 - i10) / (size.length + 1);
        if (!z8) {
            int length2 = size.length;
            float f8 = length;
            int i12 = 0;
            while (i9 < length2) {
                int i13 = size[i9];
                outPosition[i12] = AbstractC2829a.d(f8);
                f8 += i13 + length;
                i9++;
                i12++;
            }
            return;
        }
        float f9 = length;
        for (int length3 = size.length - 1; -1 < length3; length3--) {
            int i14 = size[length3];
            outPosition[length3] = AbstractC2829a.d(f9);
            f9 += i14 + length;
        }
    }

    @Stable
    /* renamed from: spacedBy-0680j_4, reason: not valid java name */
    public final HorizontalOrVertical m491spacedBy0680j_4(float f8) {
        return new SpacedAligned(f8, true, Arrangement$spacedBy$1.INSTANCE, null);
    }

    @Stable
    /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Horizontal m492spacedByD5KLDUw(float f8, Alignment.Horizontal alignment) {
        AbstractC3292y.i(alignment, "alignment");
        return new SpacedAligned(f8, true, new Arrangement$spacedBy$2(alignment), null);
    }

    @Stable
    /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Vertical m493spacedByD5KLDUw(float f8, Alignment.Vertical alignment) {
        AbstractC3292y.i(alignment, "alignment");
        return new SpacedAligned(f8, false, new Arrangement$spacedBy$3(alignment), null);
    }

    @Stable
    public final Vertical aligned(Alignment.Vertical alignment) {
        AbstractC3292y.i(alignment, "alignment");
        return new SpacedAligned(Dp.m5155constructorimpl(0), false, new Arrangement$aligned$2(alignment), null);
    }
}
