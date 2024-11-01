package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
abstract class DragEvent {

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class DragCancelled extends DragEvent {
        public static final int $stable = 0;
        public static final DragCancelled INSTANCE = new DragCancelled();

        private DragCancelled() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class DragDelta extends DragEvent {
        public static final int $stable = 0;
        private final long delta;

        public /* synthetic */ DragDelta(long j8, AbstractC3284p abstractC3284p) {
            this(j8);
        }

        /* renamed from: getDelta-F1C5BW0, reason: not valid java name */
        public final long m356getDeltaF1C5BW0() {
            return this.delta;
        }

        private DragDelta(long j8) {
            super(null);
            this.delta = j8;
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class DragStarted extends DragEvent {
        public static final int $stable = 0;
        private final long startPoint;

        public /* synthetic */ DragStarted(long j8, AbstractC3284p abstractC3284p) {
            this(j8);
        }

        /* renamed from: getStartPoint-F1C5BW0, reason: not valid java name */
        public final long m357getStartPointF1C5BW0() {
            return this.startPoint;
        }

        private DragStarted(long j8) {
            super(null);
            this.startPoint = j8;
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class DragStopped extends DragEvent {
        public static final int $stable = 0;
        private final long velocity;

        public /* synthetic */ DragStopped(long j8, AbstractC3284p abstractC3284p) {
            this(j8);
        }

        /* renamed from: getVelocity-9UxMQ8M, reason: not valid java name */
        public final long m358getVelocity9UxMQ8M() {
            return this.velocity;
        }

        private DragStopped(long j8) {
            super(null);
            this.velocity = j8;
        }
    }

    private DragEvent() {
    }

    public /* synthetic */ DragEvent(AbstractC3284p abstractC3284p) {
        this();
    }
}
