package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public interface TypefaceResult extends State<Object> {

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class Async implements TypefaceResult, State<Object> {
        public static final int $stable = 0;
        private final AsyncFontListLoader current;

        public Async(AsyncFontListLoader asyncFontListLoader) {
            this.current = asyncFontListLoader;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.current.getCacheable$ui_text_release();
        }

        public final AsyncFontListLoader getCurrent$ui_text_release() {
            return this.current;
        }

        @Override // androidx.compose.runtime.State
        public Object getValue() {
            return this.current.getValue();
        }
    }

    boolean getCacheable();

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class Immutable implements TypefaceResult {
        public static final int $stable = 0;
        private final boolean cacheable;
        private final Object value;

        public Immutable(Object obj, boolean z8) {
            this.value = obj;
            this.cacheable = z8;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.cacheable;
        }

        @Override // androidx.compose.runtime.State
        public Object getValue() {
            return this.value;
        }

        public /* synthetic */ Immutable(Object obj, boolean z8, int i8, AbstractC3284p abstractC3284p) {
            this(obj, (i8 & 2) != 0 ? true : z8);
        }
    }
}
