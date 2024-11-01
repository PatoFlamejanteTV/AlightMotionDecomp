package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class PlatformImeOptions {
    public static final int $stable = 0;
    private final String privateImeOptions;

    public PlatformImeOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PlatformImeOptions) && AbstractC3292y.d(this.privateImeOptions, ((PlatformImeOptions) obj).privateImeOptions)) {
            return true;
        }
        return false;
    }

    public final String getPrivateImeOptions() {
        return this.privateImeOptions;
    }

    public int hashCode() {
        String str = this.privateImeOptions;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "PlatformImeOptions(privateImeOptions=" + this.privateImeOptions + ')';
    }

    public PlatformImeOptions(String str) {
        this.privateImeOptions = str;
    }

    public /* synthetic */ PlatformImeOptions(String str, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : str);
    }
}
