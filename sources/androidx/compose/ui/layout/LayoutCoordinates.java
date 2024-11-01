package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import java.util.Set;

/* loaded from: classes.dex */
public interface LayoutCoordinates {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: transformFrom-EL8BTi8, reason: not valid java name */
        public static void m4121transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, float[] fArr) {
            c.b(layoutCoordinates, layoutCoordinates2, fArr);
        }
    }

    int get(AlignmentLine alignmentLine);

    LayoutCoordinates getParentCoordinates();

    LayoutCoordinates getParentLayoutCoordinates();

    Set<AlignmentLine> getProvidedAlignmentLines();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo4115getSizeYbymL2g();

    boolean isAttached();

    Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z8);

    /* renamed from: localPositionOf-R5De75A, reason: not valid java name */
    long mo4116localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j8);

    /* renamed from: localToRoot-MK-Hz9U, reason: not valid java name */
    long mo4117localToRootMKHz9U(long j8);

    /* renamed from: localToWindow-MK-Hz9U, reason: not valid java name */
    long mo4118localToWindowMKHz9U(long j8);

    /* renamed from: transformFrom-EL8BTi8, reason: not valid java name */
    void mo4119transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr);

    /* renamed from: windowToLocal-MK-Hz9U, reason: not valid java name */
    long mo4120windowToLocalMKHz9U(long j8);
}
