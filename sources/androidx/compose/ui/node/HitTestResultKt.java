package androidx.compose.ui.node;

/* loaded from: classes.dex */
public final class HitTestResultKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long DistanceAndInLayer(float f8, boolean z8) {
        long j8;
        long floatToIntBits = Float.floatToIntBits(f8);
        if (z8) {
            j8 = 1;
        } else {
            j8 = 0;
        }
        return DistanceAndInLayer.m4215constructorimpl((j8 & 4294967295L) | (floatToIntBits << 32));
    }
}
