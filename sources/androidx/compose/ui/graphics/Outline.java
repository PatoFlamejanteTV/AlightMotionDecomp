package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class Outline {

    /* loaded from: classes.dex */
    public static final class Generic extends Outline {
        private final Path path;

        public Generic(Path path) {
            super(null);
            this.path = path;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Generic) && AbstractC3292y.d(this.path, ((Generic) obj).path)) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.graphics.Outline
        public Rect getBounds() {
            return this.path.getBounds();
        }

        public final Path getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class Rectangle extends Outline {
        private final Rect rect;

        public Rectangle(Rect rect) {
            super(null);
            this.rect = rect;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Rectangle) && AbstractC3292y.d(this.rect, ((Rectangle) obj).rect)) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.graphics.Outline
        public Rect getBounds() {
            return this.rect;
        }

        public final Rect getRect() {
            return this.rect;
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class Rounded extends Outline {
        private final RoundRect roundRect;
        private final Path roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rounded(RoundRect roundRect) {
            super(0 == true ? 1 : 0);
            Path path = null;
            this.roundRect = roundRect;
            if (!OutlineKt.access$hasSameCornerRadius(roundRect)) {
                path = AndroidPath_androidKt.Path();
                path.addRoundRect(roundRect);
            }
            this.roundRectPath = path;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Rounded) && AbstractC3292y.d(this.roundRect, ((Rounded) obj).roundRect)) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.graphics.Outline
        public Rect getBounds() {
            return RoundRectKt.getBoundingRect(this.roundRect);
        }

        public final RoundRect getRoundRect() {
            return this.roundRect;
        }

        public final Path getRoundRectPath$ui_graphics_release() {
            return this.roundRectPath;
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    private Outline() {
    }

    public abstract Rect getBounds();

    public /* synthetic */ Outline(AbstractC3284p abstractC3284p) {
        this();
    }
}
