package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.State;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public abstract class FontFamily {
    public static final int $stable = 0;
    private final boolean canLoadSynchronously;
    public static final Companion Companion = new Companion(null);
    private static final SystemFontFamily Default = new DefaultFontFamily();
    private static final GenericFontFamily SansSerif = new GenericFontFamily(C.SANS_SERIF_NAME, "FontFamily.SansSerif");
    private static final GenericFontFamily Serif = new GenericFontFamily(C.SERIF_NAME, "FontFamily.Serif");
    private static final GenericFontFamily Monospace = new GenericFontFamily("monospace", "FontFamily.Monospace");
    private static final GenericFontFamily Cursive = new GenericFontFamily("cursive", "FontFamily.Cursive");

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final GenericFontFamily getCursive() {
            return FontFamily.Cursive;
        }

        public final SystemFontFamily getDefault() {
            return FontFamily.Default;
        }

        public final GenericFontFamily getMonospace() {
            return FontFamily.Monospace;
        }

        public final GenericFontFamily getSansSerif() {
            return FontFamily.SansSerif;
        }

        public final GenericFontFamily getSerif() {
            return FontFamily.Serif;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface Resolver {
        Object preload(FontFamily fontFamily, U5.d dVar);

        /* renamed from: resolve-DPcqOEQ, reason: not valid java name */
        State<Object> mo4754resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i8, int i9);
    }

    public /* synthetic */ FontFamily(boolean z8, AbstractC3284p abstractC3284p) {
        this(z8);
    }

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }

    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }

    private FontFamily(boolean z8) {
        this.canLoadSynchronously = z8;
    }
}
