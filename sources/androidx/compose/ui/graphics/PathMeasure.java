package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public interface PathMeasure {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    float getLength();

    /* renamed from: getPosition-tuRUvjQ */
    long mo2852getPositiontuRUvjQ(float f8);

    boolean getSegment(float f8, float f9, Path path, boolean z8);

    /* renamed from: getTangent-tuRUvjQ */
    long mo2853getTangenttuRUvjQ(float f8);

    void setPath(Path path, boolean z8);
}
