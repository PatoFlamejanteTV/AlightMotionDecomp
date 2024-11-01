package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public abstract class AlignmentLine {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int Unspecified = Integer.MIN_VALUE;
    private final InterfaceC2072n merger;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ AlignmentLine(InterfaceC2072n interfaceC2072n, AbstractC3284p abstractC3284p) {
        this(interfaceC2072n);
    }

    public final InterfaceC2072n getMerger$ui_release() {
        return this.merger;
    }

    private AlignmentLine(InterfaceC2072n interfaceC2072n) {
        this.merger = interfaceC2072n;
    }
}
