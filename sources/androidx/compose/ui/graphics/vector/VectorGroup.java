package androidx.compose.ui.graphics.vector;

import R5.AbstractC1435t;
import androidx.compose.runtime.Immutable;
import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, InterfaceC2767a {
    public static final int $stable = 0;
    private final List<VectorNode> children;
    private final List<PathNode> clipPathData;
    private final String name;
    private final float pivotX;
    private final float pivotY;
    private final float rotation;
    private final float scaleX;
    private final float scaleY;
    private final float translationX;
    private final float translationY;

    public VectorGroup() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof VectorGroup)) {
            VectorGroup vectorGroup = (VectorGroup) obj;
            if (AbstractC3292y.d(this.name, vectorGroup.name) && this.rotation == vectorGroup.rotation && this.pivotX == vectorGroup.pivotX && this.pivotY == vectorGroup.pivotY && this.scaleX == vectorGroup.scaleX && this.scaleY == vectorGroup.scaleY && this.translationX == vectorGroup.translationX && this.translationY == vectorGroup.translationY && AbstractC3292y.d(this.clipPathData, vectorGroup.clipPathData) && AbstractC3292y.d(this.children, vectorGroup.children)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final VectorNode get(int i8) {
        return this.children.get(i8);
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    public final String getName() {
        return this.name;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSize() {
        return this.children.size();
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Float.floatToIntBits(this.rotation)) * 31) + Float.floatToIntBits(this.pivotX)) * 31) + Float.floatToIntBits(this.pivotY)) * 31) + Float.floatToIntBits(this.scaleX)) * 31) + Float.floatToIntBits(this.scaleY)) * 31) + Float.floatToIntBits(this.translationX)) * 31) + Float.floatToIntBits(this.translationY)) * 31) + this.clipPathData.hashCode()) * 31) + this.children.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<VectorNode> iterator() {
        return new VectorGroup$iterator$1(this);
    }

    public /* synthetic */ VectorGroup(String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List list, List list2, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? 0.0f : f8, (i8 & 4) != 0 ? 0.0f : f9, (i8 & 8) != 0 ? 0.0f : f10, (i8 & 16) != 0 ? 1.0f : f11, (i8 & 32) == 0 ? f12 : 1.0f, (i8 & 64) != 0 ? 0.0f : f13, (i8 & 128) == 0 ? f14 : 0.0f, (i8 & 256) != 0 ? VectorKt.getEmptyPath() : list, (i8 & 512) != 0 ? AbstractC1435t.m() : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorGroup(String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List<? extends PathNode> list, List<? extends VectorNode> list2) {
        super(null);
        this.name = str;
        this.rotation = f8;
        this.pivotX = f9;
        this.pivotY = f10;
        this.scaleX = f11;
        this.scaleY = f12;
        this.translationX = f13;
        this.translationY = f14;
        this.clipPathData = list;
        this.children = list2;
    }
}
