package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class PathParser {
    private static final String LOGTAG = "PathParser";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
        }
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c8, float[] fArr) {
        arrayList.add(new PathDataNode(c8, fArr));
    }

    public static boolean canMorph(@Nullable PathDataNode[] pathDataNodeArr, @Nullable PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i8 = 0; i8 < pathDataNodeArr.length; i8++) {
            if (pathDataNodeArr[i8].mType != pathDataNodeArr2[i8].mType || pathDataNodeArr[i8].mParams.length != pathDataNodeArr2[i8].mParams.length) {
                return false;
            }
        }
        return true;
    }

    static float[] copyOfRange(float[] fArr, int i8, int i9) {
        if (i8 <= i9) {
            int length = fArr.length;
            if (i8 >= 0 && i8 <= length) {
                int i10 = i9 - i8;
                int min = Math.min(i10, length - i8);
                float[] fArr2 = new float[i10];
                System.arraycopy(fArr, i8, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    @NonNull
    public static PathDataNode[] createNodesFromPathData(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        int i8 = 1;
        int i9 = 0;
        while (i8 < str.length()) {
            int nextStart = nextStart(str, i8);
            String trim = str.substring(i9, nextStart).trim();
            if (!trim.isEmpty()) {
                addNode(arrayList, trim.charAt(0), getFloats(trim));
            }
            i9 = nextStart;
            i8 = nextStart + 1;
        }
        if (i8 - i9 == 1 && i9 < str.length()) {
            addNode(arrayList, str.charAt(i9), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[0]);
    }

    @NonNull
    public static Path createPathFromPathData(@NonNull String str) {
        Path path = new Path();
        try {
            PathDataNode.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (RuntimeException e8) {
            throw new RuntimeException("Error in parsing " + str, e8);
        }
    }

    @NonNull
    public static PathDataNode[] deepCopyNodes(@NonNull PathDataNode[] pathDataNodeArr) {
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i8 = 0; i8 < pathDataNodeArr.length; i8++) {
            pathDataNodeArr2[i8] = new PathDataNode(pathDataNodeArr[i8]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[LOOP:0: B:2:0x0007->B:14:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void extract(java.lang.String r8, int r9, androidx.core.graphics.PathParser.ExtractFloatResult r10) {
        /*
            r0 = 0
            r10.mEndWithNegOrDot = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L36
        L27:
            r10.mEndWithNegOrDot = r7
        L29:
            r2 = 0
            r4 = 1
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.mEndWithNegOrDot = r7
            goto L29
        L33:
            r2 = 0
            goto L36
        L35:
            r2 = 1
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.mEndPosition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.extract(java.lang.String, int, androidx.core.graphics.PathParser$ExtractFloatResult):void");
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) != 'z' && str.charAt(0) != 'Z') {
            try {
                float[] fArr = new float[str.length()];
                ExtractFloatResult extractFloatResult = new ExtractFloatResult();
                int length = str.length();
                int i8 = 1;
                int i9 = 0;
                while (i8 < length) {
                    extract(str, i8, extractFloatResult);
                    int i10 = extractFloatResult.mEndPosition;
                    if (i8 < i10) {
                        fArr[i9] = Float.parseFloat(str.substring(i8, i10));
                        i9++;
                    }
                    if (extractFloatResult.mEndWithNegOrDot) {
                        i8 = i10;
                    } else {
                        i8 = i10 + 1;
                    }
                }
                return copyOfRange(fArr, 0, i9);
            } catch (NumberFormatException e8) {
                throw new RuntimeException("error in parsing \"" + str + "\"", e8);
            }
        }
        return new float[0];
    }

    public static void interpolatePathDataNodes(@NonNull PathDataNode[] pathDataNodeArr, float f8, @NonNull PathDataNode[] pathDataNodeArr2, @NonNull PathDataNode[] pathDataNodeArr3) {
        if (!interpolatePathDataNodes(pathDataNodeArr, pathDataNodeArr2, pathDataNodeArr3, f8)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    private static int nextStart(String str, int i8) {
        while (i8 < str.length()) {
            char charAt = str.charAt(i8);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i8;
            }
            i8++;
        }
        return i8;
    }

    public static void nodesToPath(@NonNull PathDataNode[] pathDataNodeArr, @NonNull Path path) {
        float[] fArr = new float[6];
        char c8 = 'm';
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            PathDataNode.addCommand(path, fArr, c8, pathDataNode.mType, pathDataNode.mParams);
            c8 = pathDataNode.mType;
        }
    }

    public static void updateNodes(@NonNull PathDataNode[] pathDataNodeArr, @NonNull PathDataNode[] pathDataNodeArr2) {
        for (int i8 = 0; i8 < pathDataNodeArr2.length; i8++) {
            pathDataNodeArr[i8].mType = pathDataNodeArr2[i8].mType;
            for (int i9 = 0; i9 < pathDataNodeArr2[i8].mParams.length; i9++) {
                pathDataNodeArr[i8].mParams[i9] = pathDataNodeArr2[i8].mParams[i9];
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class PathDataNode {
        private final float[] mParams;
        private char mType;

        PathDataNode(char c8, float[] fArr) {
            this.mType = c8;
            this.mParams = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void addCommand(Path path, float[] fArr, char c8, char c9, float[] fArr2) {
            int i8;
            int i9;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            char c10 = c9;
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr[2];
            float f19 = fArr[3];
            float f20 = fArr[4];
            float f21 = fArr[5];
            switch (c10) {
                case 'A':
                case 'a':
                    i8 = 7;
                    break;
                case 'C':
                case 'c':
                    i8 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i8 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i8 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i8 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f20, f21);
                    f16 = f20;
                    f18 = f16;
                    f17 = f21;
                    f19 = f17;
                    i8 = 2;
                    break;
            }
            float f22 = f16;
            float f23 = f17;
            float f24 = f20;
            float f25 = f21;
            int i10 = 0;
            char c11 = c8;
            while (i10 < fArr2.length) {
                if (c10 != 'A') {
                    if (c10 == 'C') {
                        i9 = i10;
                        int i11 = i9 + 2;
                        int i12 = i9 + 3;
                        int i13 = i9 + 4;
                        int i14 = i9 + 5;
                        path.cubicTo(fArr2[i9], fArr2[i9 + 1], fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                        f22 = fArr2[i13];
                        float f26 = fArr2[i14];
                        float f27 = fArr2[i11];
                        float f28 = fArr2[i12];
                        f23 = f26;
                        f19 = f28;
                        f18 = f27;
                    } else if (c10 == 'H') {
                        i9 = i10;
                        path.lineTo(fArr2[i9], f23);
                        f22 = fArr2[i9];
                    } else if (c10 == 'Q') {
                        i9 = i10;
                        int i15 = i9 + 1;
                        int i16 = i9 + 2;
                        int i17 = i9 + 3;
                        path.quadTo(fArr2[i9], fArr2[i15], fArr2[i16], fArr2[i17]);
                        float f29 = fArr2[i9];
                        float f30 = fArr2[i15];
                        f22 = fArr2[i16];
                        f23 = fArr2[i17];
                        f18 = f29;
                        f19 = f30;
                    } else if (c10 == 'V') {
                        i9 = i10;
                        path.lineTo(f22, fArr2[i9]);
                        f23 = fArr2[i9];
                    } else if (c10 != 'a') {
                        if (c10 != 'c') {
                            if (c10 == 'h') {
                                path.rLineTo(fArr2[i10], 0.0f);
                                f22 += fArr2[i10];
                            } else if (c10 != 'q') {
                                if (c10 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i10]);
                                    f11 = fArr2[i10];
                                } else if (c10 == 'L') {
                                    int i18 = i10 + 1;
                                    path.lineTo(fArr2[i10], fArr2[i18]);
                                    f22 = fArr2[i10];
                                    f23 = fArr2[i18];
                                } else if (c10 == 'M') {
                                    f22 = fArr2[i10];
                                    f23 = fArr2[i10 + 1];
                                    if (i10 > 0) {
                                        path.lineTo(f22, f23);
                                    } else {
                                        path.moveTo(f22, f23);
                                        i9 = i10;
                                        f25 = f23;
                                        f24 = f22;
                                    }
                                } else if (c10 == 'S') {
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        f22 = (f22 * 2.0f) - f18;
                                        f23 = (f23 * 2.0f) - f19;
                                    }
                                    float f31 = f23;
                                    float f32 = f22;
                                    int i19 = i10 + 1;
                                    int i20 = i10 + 2;
                                    int i21 = i10 + 3;
                                    path.cubicTo(f32, f31, fArr2[i10], fArr2[i19], fArr2[i20], fArr2[i21]);
                                    f8 = fArr2[i10];
                                    f9 = fArr2[i19];
                                    f22 = fArr2[i20];
                                    f23 = fArr2[i21];
                                    f18 = f8;
                                    f19 = f9;
                                } else if (c10 == 'T') {
                                    if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                        f22 = (f22 * 2.0f) - f18;
                                        f23 = (f23 * 2.0f) - f19;
                                    }
                                    int i22 = i10 + 1;
                                    path.quadTo(f22, f23, fArr2[i10], fArr2[i22]);
                                    i9 = i10;
                                    f19 = f23;
                                    f18 = f22;
                                    f22 = fArr2[i10];
                                    f23 = fArr2[i22];
                                } else if (c10 == 'l') {
                                    int i23 = i10 + 1;
                                    path.rLineTo(fArr2[i10], fArr2[i23]);
                                    f22 += fArr2[i10];
                                    f11 = fArr2[i23];
                                } else if (c10 == 'm') {
                                    float f33 = fArr2[i10];
                                    f22 += f33;
                                    float f34 = fArr2[i10 + 1];
                                    f23 += f34;
                                    if (i10 > 0) {
                                        path.rLineTo(f33, f34);
                                    } else {
                                        path.rMoveTo(f33, f34);
                                        i9 = i10;
                                        f25 = f23;
                                        f24 = f22;
                                    }
                                } else if (c10 == 's') {
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        float f35 = f22 - f18;
                                        f12 = f23 - f19;
                                        f13 = f35;
                                    } else {
                                        f13 = 0.0f;
                                        f12 = 0.0f;
                                    }
                                    int i24 = i10 + 1;
                                    int i25 = i10 + 2;
                                    int i26 = i10 + 3;
                                    path.rCubicTo(f13, f12, fArr2[i10], fArr2[i24], fArr2[i25], fArr2[i26]);
                                    f8 = fArr2[i10] + f22;
                                    f9 = fArr2[i24] + f23;
                                    f22 += fArr2[i25];
                                    f10 = fArr2[i26];
                                } else if (c10 == 't') {
                                    if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                        f14 = f22 - f18;
                                        f15 = f23 - f19;
                                    } else {
                                        f15 = 0.0f;
                                        f14 = 0.0f;
                                    }
                                    int i27 = i10 + 1;
                                    path.rQuadTo(f14, f15, fArr2[i10], fArr2[i27]);
                                    float f36 = f14 + f22;
                                    float f37 = f15 + f23;
                                    f22 += fArr2[i10];
                                    f23 += fArr2[i27];
                                    f19 = f37;
                                    f18 = f36;
                                }
                                f23 += f11;
                            } else {
                                int i28 = i10 + 1;
                                int i29 = i10 + 2;
                                int i30 = i10 + 3;
                                path.rQuadTo(fArr2[i10], fArr2[i28], fArr2[i29], fArr2[i30]);
                                f8 = fArr2[i10] + f22;
                                f9 = fArr2[i28] + f23;
                                f22 += fArr2[i29];
                                f10 = fArr2[i30];
                            }
                            i9 = i10;
                        } else {
                            int i31 = i10 + 2;
                            int i32 = i10 + 3;
                            int i33 = i10 + 4;
                            int i34 = i10 + 5;
                            path.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i31], fArr2[i32], fArr2[i33], fArr2[i34]);
                            f8 = fArr2[i31] + f22;
                            f9 = fArr2[i32] + f23;
                            f22 += fArr2[i33];
                            f10 = fArr2[i34];
                        }
                        f23 += f10;
                        f18 = f8;
                        f19 = f9;
                        i9 = i10;
                    } else {
                        int i35 = i10 + 5;
                        int i36 = i10 + 6;
                        i9 = i10;
                        drawArc(path, f22, f23, fArr2[i35] + f22, fArr2[i36] + f23, fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f, fArr2[i10 + 4] != 0.0f);
                        f22 += fArr2[i35];
                        f23 += fArr2[i36];
                    }
                    i10 = i9 + i8;
                    c11 = c9;
                    c10 = c11;
                } else {
                    i9 = i10;
                    int i37 = i9 + 5;
                    int i38 = i9 + 6;
                    drawArc(path, f22, f23, fArr2[i37], fArr2[i38], fArr2[i9], fArr2[i9 + 1], fArr2[i9 + 2], fArr2[i9 + 3] != 0.0f, fArr2[i9 + 4] != 0.0f);
                    f22 = fArr2[i37];
                    f23 = fArr2[i38];
                }
                f19 = f23;
                f18 = f22;
                i10 = i9 + i8;
                c11 = c9;
                c10 = c11;
            }
            fArr[0] = f22;
            fArr[1] = f23;
            fArr[2] = f18;
            fArr[3] = f19;
            fArr[4] = f24;
            fArr[5] = f25;
        }

        private static void arcToBezier(Path path, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
            double d17 = d10;
            int ceil = (int) Math.ceil(Math.abs((d16 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d14);
            double sin = Math.sin(d14);
            double cos2 = Math.cos(d15);
            double sin2 = Math.sin(d15);
            double d18 = -d17;
            double d19 = d18 * cos;
            double d20 = d11 * sin;
            double d21 = (d19 * sin2) - (d20 * cos2);
            double d22 = d18 * sin;
            double d23 = d11 * cos;
            double d24 = (sin2 * d22) + (cos2 * d23);
            double d25 = d16 / ceil;
            double d26 = d15;
            double d27 = d24;
            double d28 = d21;
            int i8 = 0;
            double d29 = d12;
            double d30 = d13;
            while (i8 < ceil) {
                double d31 = d26 + d25;
                double sin3 = Math.sin(d31);
                double cos3 = Math.cos(d31);
                double d32 = (d8 + ((d17 * cos) * cos3)) - (d20 * sin3);
                double d33 = d9 + (d17 * sin * cos3) + (d23 * sin3);
                double d34 = (d19 * sin3) - (d20 * cos3);
                double d35 = (sin3 * d22) + (cos3 * d23);
                double d36 = d31 - d26;
                double tan = Math.tan(d36 / 2.0d);
                double sin4 = (Math.sin(d36) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d37 = d29 + (d28 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d37, (float) (d30 + (d27 * sin4)), (float) (d32 - (sin4 * d34)), (float) (d33 - (sin4 * d35)), (float) d32, (float) d33);
                i8++;
                d25 = d25;
                sin = sin;
                d29 = d32;
                d22 = d22;
                cos = cos;
                d26 = d31;
                d27 = d35;
                d28 = d34;
                ceil = ceil;
                d30 = d33;
                d17 = d10;
            }
        }

        private static void drawArc(Path path, float f8, float f9, float f10, float f11, float f12, float f13, float f14, boolean z8, boolean z9) {
            double d8;
            double d9;
            double radians = Math.toRadians(f14);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d10 = f8;
            double d11 = d10 * cos;
            double d12 = f9;
            double d13 = f12;
            double d14 = (d11 + (d12 * sin)) / d13;
            double d15 = ((-f8) * sin) + (d12 * cos);
            double d16 = f13;
            double d17 = d15 / d16;
            double d18 = f11;
            double d19 = ((f10 * cos) + (d18 * sin)) / d13;
            double d20 = (((-f10) * sin) + (d18 * cos)) / d16;
            double d21 = d14 - d19;
            double d22 = d17 - d20;
            double d23 = (d14 + d19) / 2.0d;
            double d24 = (d17 + d20) / 2.0d;
            double d25 = (d21 * d21) + (d22 * d22);
            if (d25 == 0.0d) {
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double d26 = (1.0d / d25) - 0.25d;
            if (d26 < 0.0d) {
                Log.w(PathParser.LOGTAG, "Points are too far apart " + d25);
                float sqrt = (float) (Math.sqrt(d25) / 1.99999d);
                drawArc(path, f8, f9, f10, f11, f12 * sqrt, f13 * sqrt, f14, z8, z9);
                return;
            }
            double sqrt2 = Math.sqrt(d26);
            double d27 = d21 * sqrt2;
            double d28 = sqrt2 * d22;
            if (z8 == z9) {
                d8 = d23 - d28;
                d9 = d24 + d27;
            } else {
                d8 = d23 + d28;
                d9 = d24 - d27;
            }
            double atan2 = Math.atan2(d17 - d9, d14 - d8);
            double atan22 = Math.atan2(d20 - d9, d19 - d8) - atan2;
            if (z9 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d29 = d8 * d13;
            double d30 = d9 * d16;
            arcToBezier(path, (d29 * cos) - (d30 * sin), (d29 * sin) + (d30 * cos), d13, d16, d10, d12, radians, atan2, atan22);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static void nodesToPath(@NonNull PathDataNode[] pathDataNodeArr, @NonNull Path path) {
            PathParser.nodesToPath(pathDataNodeArr, path);
        }

        @NonNull
        public float[] getParams() {
            return this.mParams;
        }

        public char getType() {
            return this.mType;
        }

        public void interpolatePathDataNode(@NonNull PathDataNode pathDataNode, @NonNull PathDataNode pathDataNode2, float f8) {
            this.mType = pathDataNode.mType;
            int i8 = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i8 < fArr.length) {
                    this.mParams[i8] = (fArr[i8] * (1.0f - f8)) + (pathDataNode2.mParams[i8] * f8);
                    i8++;
                } else {
                    return;
                }
            }
        }

        PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static boolean interpolatePathDataNodes(@NonNull PathDataNode[] pathDataNodeArr, @NonNull PathDataNode[] pathDataNodeArr2, @NonNull PathDataNode[] pathDataNodeArr3, float f8) {
        if (pathDataNodeArr.length == pathDataNodeArr2.length && pathDataNodeArr2.length == pathDataNodeArr3.length) {
            if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
                return false;
            }
            for (int i8 = 0; i8 < pathDataNodeArr.length; i8++) {
                pathDataNodeArr[i8].interpolatePathDataNode(pathDataNodeArr2[i8], pathDataNodeArr3[i8], f8);
            }
            return true;
        }
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
    }
}
