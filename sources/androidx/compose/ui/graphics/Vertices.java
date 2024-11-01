package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class Vertices {
    private final int[] colors;
    private final short[] indices;
    private final float[] positions;
    private final float[] textureCoordinates;
    private final int vertexMode;

    public /* synthetic */ Vertices(int i8, List list, List list2, List list3, List list4, AbstractC3284p abstractC3284p) {
        this(i8, list, list2, list3, list4);
    }

    private final int[] encodeColorList(List<Color> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr[i8] = ColorKt.m3002toArgb8_81llA(list.get(i8).m2958unboximpl());
        }
        return iArr;
    }

    private final float[] encodePointList(List<Offset> list) {
        float m2713getYimpl;
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i8 = 0; i8 < size; i8++) {
            long m2722unboximpl = list.get(i8 / 2).m2722unboximpl();
            if (i8 % 2 == 0) {
                m2713getYimpl = Offset.m2712getXimpl(m2722unboximpl);
            } else {
                m2713getYimpl = Offset.m2713getYimpl(m2722unboximpl);
            }
            fArr[i8] = m2713getYimpl;
        }
        return fArr;
    }

    public final int[] getColors() {
        return this.colors;
    }

    public final short[] getIndices() {
        return this.indices;
    }

    public final float[] getPositions() {
        return this.positions;
    }

    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    /* renamed from: getVertexMode-c2xauaI, reason: not valid java name */
    public final int m3327getVertexModec2xauaI() {
        return this.vertexMode;
    }

    private Vertices(int i8, List<Offset> list, List<Offset> list2, List<Color> list3, List<Integer> list4) {
        this.vertexMode = i8;
        Vertices$outOfBounds$1 vertices$outOfBounds$1 = new Vertices$outOfBounds$1(list);
        if (list2.size() == list.size()) {
            if (list3.size() == list.size()) {
                int size = list4.size();
                for (int i9 = 0; i9 < size; i9++) {
                    if (((Boolean) vertices$outOfBounds$1.invoke(list4.get(i9))).booleanValue()) {
                        throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
                    }
                }
                this.positions = encodePointList(list);
                this.textureCoordinates = encodePointList(list2);
                this.colors = encodeColorList(list3);
                int size2 = list4.size();
                short[] sArr = new short[size2];
                for (int i10 = 0; i10 < size2; i10++) {
                    sArr[i10] = (short) list4.get(i10).intValue();
                }
                this.indices = sArr;
                return;
            }
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
    }
}
