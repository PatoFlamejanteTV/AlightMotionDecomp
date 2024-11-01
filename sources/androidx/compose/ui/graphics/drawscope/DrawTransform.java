package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Path;

@DrawScopeMarker
/* loaded from: classes.dex */
public interface DrawTransform {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m3472getCenterF1C5BW0(DrawTransform drawTransform) {
            long a9;
            a9 = d.a(drawTransform);
            return a9;
        }
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo3399clipPathmtrdDE(Path path, int i8);

    /* renamed from: clipRect-N_I0leg */
    void mo3400clipRectN_I0leg(float f8, float f9, float f10, float f11, int i8);

    /* renamed from: getCenter-F1C5BW0 */
    long mo3401getCenterF1C5BW0();

    /* renamed from: getSize-NH-jbRc */
    long mo3402getSizeNHjbRc();

    void inset(float f8, float f9, float f10, float f11);

    /* renamed from: rotate-Uv8p0NA */
    void mo3403rotateUv8p0NA(float f8, long j8);

    /* renamed from: scale-0AR0LA0 */
    void mo3404scale0AR0LA0(float f8, float f9, long j8);

    /* renamed from: transform-58bKbWc */
    void mo3405transform58bKbWc(float[] fArr);

    void translate(float f8, float f9);
}
