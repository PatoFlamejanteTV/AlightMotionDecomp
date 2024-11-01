package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public interface ViewConfiguration {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static float getMaximumFlingVelocity(ViewConfiguration viewConfiguration) {
            float a9;
            a9 = W0.a(viewConfiguration);
            return a9;
        }

        @Deprecated
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public static long m4479getMinimumTouchTargetSizeMYxV2XQ(ViewConfiguration viewConfiguration) {
            long b9;
            b9 = W0.b(viewConfiguration);
            return b9;
        }
    }

    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    long getLongPressTimeoutMillis();

    float getMaximumFlingVelocity();

    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    long mo4233getMinimumTouchTargetSizeMYxV2XQ();

    float getTouchSlop();
}
