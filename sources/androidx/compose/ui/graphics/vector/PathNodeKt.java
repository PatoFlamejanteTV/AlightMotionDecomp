package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    public static final void addPathNodes(char c8, ArrayList<PathNode> arrayList, float[] fArr, int i8) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (c8 == 'z' || c8 == 'Z') {
            arrayList.add(PathNode.Close.INSTANCE);
            return;
        }
        int i9 = 0;
        if (c8 == 'm') {
            int i10 = i8 - 2;
            while (i9 <= i10) {
                int i11 = i9 + 1;
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(fArr[i9], fArr[i11]);
                if (i9 > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(fArr[i9], fArr[i11]);
                }
                arrayList.add(relativeMoveTo);
                i9 += 2;
            }
            return;
        }
        if (c8 == 'M') {
            int i12 = i8 - 2;
            while (i9 <= i12) {
                int i13 = i9 + 1;
                PathNode moveTo = new PathNode.MoveTo(fArr[i9], fArr[i13]);
                if (i9 > 0) {
                    moveTo = new PathNode.LineTo(fArr[i9], fArr[i13]);
                }
                arrayList.add(moveTo);
                i9 += 2;
            }
            return;
        }
        if (c8 == 'l') {
            int i14 = i8 - 2;
            while (i9 <= i14) {
                arrayList.add(new PathNode.RelativeLineTo(fArr[i9], fArr[i9 + 1]));
                i9 += 2;
            }
            return;
        }
        if (c8 == 'L') {
            int i15 = i8 - 2;
            while (i9 <= i15) {
                arrayList.add(new PathNode.LineTo(fArr[i9], fArr[i9 + 1]));
                i9 += 2;
            }
            return;
        }
        if (c8 == 'h') {
            int i16 = i8 - 1;
            while (i9 <= i16) {
                arrayList.add(new PathNode.RelativeHorizontalTo(fArr[i9]));
                i9++;
            }
            return;
        }
        if (c8 == 'H') {
            int i17 = i8 - 1;
            while (i9 <= i17) {
                arrayList.add(new PathNode.HorizontalTo(fArr[i9]));
                i9++;
            }
            return;
        }
        if (c8 == 'v') {
            int i18 = i8 - 1;
            while (i9 <= i18) {
                arrayList.add(new PathNode.RelativeVerticalTo(fArr[i9]));
                i9++;
            }
            return;
        }
        if (c8 == 'V') {
            int i19 = i8 - 1;
            while (i9 <= i19) {
                arrayList.add(new PathNode.VerticalTo(fArr[i9]));
                i9++;
            }
            return;
        }
        if (c8 == 'c') {
            int i20 = i8 - 6;
            while (i9 <= i20) {
                arrayList.add(new PathNode.RelativeCurveTo(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3], fArr[i9 + 4], fArr[i9 + 5]));
                i9 += 6;
            }
            return;
        }
        if (c8 == 'C') {
            int i21 = i8 - 6;
            while (i9 <= i21) {
                arrayList.add(new PathNode.CurveTo(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3], fArr[i9 + 4], fArr[i9 + 5]));
                i9 += 6;
            }
            return;
        }
        if (c8 == 's') {
            int i22 = i8 - 4;
            while (i9 <= i22) {
                arrayList.add(new PathNode.RelativeReflectiveCurveTo(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3]));
                i9 += 4;
            }
            return;
        }
        if (c8 == 'S') {
            int i23 = i8 - 4;
            while (i9 <= i23) {
                arrayList.add(new PathNode.ReflectiveCurveTo(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3]));
                i9 += 4;
            }
            return;
        }
        if (c8 == 'q') {
            int i24 = i8 - 4;
            while (i9 <= i24) {
                arrayList.add(new PathNode.RelativeQuadTo(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3]));
                i9 += 4;
            }
            return;
        }
        if (c8 == 'Q') {
            int i25 = i8 - 4;
            while (i9 <= i25) {
                arrayList.add(new PathNode.QuadTo(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3]));
                i9 += 4;
            }
            return;
        }
        if (c8 == 't') {
            int i26 = i8 - 2;
            while (i9 <= i26) {
                arrayList.add(new PathNode.RelativeReflectiveQuadTo(fArr[i9], fArr[i9 + 1]));
                i9 += 2;
            }
            return;
        }
        if (c8 == 'T') {
            int i27 = i8 - 2;
            while (i9 <= i27) {
                arrayList.add(new PathNode.ReflectiveQuadTo(fArr[i9], fArr[i9 + 1]));
                i9 += 2;
            }
            return;
        }
        if (c8 == 'a') {
            int i28 = i8 - 7;
            for (int i29 = 0; i29 <= i28; i29 += 7) {
                float f8 = fArr[i29];
                float f9 = fArr[i29 + 1];
                float f10 = fArr[i29 + 2];
                if (Float.compare(fArr[i29 + 3], 0.0f) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (Float.compare(fArr[i29 + 4], 0.0f) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                arrayList.add(new PathNode.RelativeArcTo(f8, f9, f10, z10, z11, fArr[i29 + 5], fArr[i29 + 6]));
            }
            return;
        }
        if (c8 == 'A') {
            int i30 = i8 - 7;
            for (int i31 = 0; i31 <= i30; i31 += 7) {
                float f11 = fArr[i31];
                float f12 = fArr[i31 + 1];
                float f13 = fArr[i31 + 2];
                if (Float.compare(fArr[i31 + 3], 0.0f) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (Float.compare(fArr[i31 + 4], 0.0f) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                arrayList.add(new PathNode.ArcTo(f11, f12, f13, z8, z9, fArr[i31 + 5], fArr[i31 + 6]));
            }
            return;
        }
        throw new IllegalArgumentException("Unknown command for: " + c8);
    }

    private static final void pathNodesFromArgs(List<PathNode> list, float[] fArr, int i8, int i9, InterfaceC2072n interfaceC2072n) {
        int i10 = i8 - i9;
        int i11 = 0;
        while (i11 <= i10) {
            PathNode pathNode = (PathNode) interfaceC2072n.invoke(fArr, Integer.valueOf(i11));
            if ((pathNode instanceof PathNode.MoveTo) && i11 > 0) {
                pathNode = new PathNode.LineTo(fArr[i11], fArr[i11 + 1]);
            } else if ((pathNode instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                pathNode = new PathNode.RelativeLineTo(fArr[i11], fArr[i11 + 1]);
            }
            list.add(pathNode);
            i11 += i9;
        }
    }
}
