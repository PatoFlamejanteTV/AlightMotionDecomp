package androidx.compose.ui.graphics.vector;

import R5.AbstractC1428l;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class PathParser {
    private final ArrayList<PathNode> nodes = new ArrayList<>();
    private float[] nodeData = new float[64];

    private final void addNodes(char c8, float[] fArr, int i8) {
        PathNodeKt.addPathNodes(c8, this.nodes, fArr, i8);
    }

    private final void resizeNodeData(int i8) {
        float[] fArr = this.nodeData;
        if (i8 >= fArr.length) {
            float[] fArr2 = new float[i8 * 2];
            this.nodeData = fArr2;
            AbstractC1428l.f(fArr, fArr2, 0, 0, fArr.length);
        }
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    public final PathParser addPathNodes(List<? extends PathNode> list) {
        this.nodes.addAll(list);
        return this;
    }

    public final void clear() {
        this.nodes.clear();
    }

    public final PathParser parsePathString(String str) {
        int i8;
        char charAt;
        int i9;
        this.nodes.clear();
        int length = str.length();
        int i10 = 0;
        while (i10 < length && AbstractC3292y.k(str.charAt(i10), 32) <= 0) {
            i10++;
        }
        while (length > i10 && AbstractC3292y.k(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i11 = 0;
        while (i10 < length) {
            while (true) {
                i8 = i10 + 1;
                charAt = str.charAt(i10);
                int i12 = charAt | ' ';
                if ((i12 - 97) * (i12 - 122) <= 0 && i12 != 101) {
                    break;
                }
                if (i8 >= length) {
                    charAt = 0;
                    break;
                }
                i10 = i8;
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i11 = 0;
                    while (true) {
                        if (i8 < length && AbstractC3292y.k(str.charAt(i8), 32) <= 0) {
                            i8++;
                        } else {
                            long nextFloat = FastFloatParserKt.nextFloat(str, i8, length);
                            i9 = (int) (nextFloat >>> 32);
                            float intBitsToFloat = Float.intBitsToFloat((int) (nextFloat & 4294967295L));
                            if (!Float.isNaN(intBitsToFloat)) {
                                float[] fArr = this.nodeData;
                                int i13 = i11 + 1;
                                fArr[i11] = intBitsToFloat;
                                if (i13 >= fArr.length) {
                                    float[] fArr2 = new float[i13 * 2];
                                    this.nodeData = fArr2;
                                    AbstractC1428l.f(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i11 = i13;
                            }
                            while (i9 < length && str.charAt(i9) == ',') {
                                i9++;
                            }
                            if (i9 >= length || Float.isNaN(intBitsToFloat)) {
                                break;
                            }
                            i8 = i9;
                        }
                    }
                    i8 = i9;
                }
                PathNodeKt.addPathNodes(charAt, this.nodes, this.nodeData, i11);
            }
            i10 = i8;
        }
        return this;
    }

    public final List<PathNode> toNodes() {
        return this.nodes;
    }

    public final Path toPath(Path path) {
        return PathParserKt.toPath(this.nodes, path);
    }
}
