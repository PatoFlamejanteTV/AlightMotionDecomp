package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
abstract class TransformEvent {

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class TransformDelta extends TransformEvent {
        public static final int $stable = 0;
        private final long panChange;
        private final float rotationChange;
        private final float zoomChange;

        public /* synthetic */ TransformDelta(float f8, long j8, float f9, AbstractC3284p abstractC3284p) {
            this(f8, j8, f9);
        }

        /* renamed from: getPanChange-F1C5BW0, reason: not valid java name */
        public final long m451getPanChangeF1C5BW0() {
            return this.panChange;
        }

        public final float getRotationChange() {
            return this.rotationChange;
        }

        public final float getZoomChange() {
            return this.zoomChange;
        }

        private TransformDelta(float f8, long j8, float f9) {
            super(null);
            this.zoomChange = f8;
            this.panChange = j8;
            this.rotationChange = f9;
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class TransformStarted extends TransformEvent {
        public static final int $stable = 0;
        public static final TransformStarted INSTANCE = new TransformStarted();

        private TransformStarted() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class TransformStopped extends TransformEvent {
        public static final int $stable = 0;
        public static final TransformStopped INSTANCE = new TransformStopped();

        private TransformStopped() {
            super(null);
        }
    }

    private TransformEvent() {
    }

    public /* synthetic */ TransformEvent(AbstractC3284p abstractC3284p) {
        this();
    }
}
