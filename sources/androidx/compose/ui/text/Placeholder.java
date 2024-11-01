package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class Placeholder {
    public static final int $stable = 0;
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    public /* synthetic */ Placeholder(long j8, long j9, int i8, AbstractC3284p abstractC3284p) {
        this(j8, j9, i8);
    }

    /* renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ Placeholder m4588copyK8Q__8$default(Placeholder placeholder, long j8, long j9, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j8 = placeholder.width;
        }
        long j10 = j8;
        if ((i9 & 2) != 0) {
            j9 = placeholder.height;
        }
        long j11 = j9;
        if ((i9 & 4) != 0) {
            i8 = placeholder.placeholderVerticalAlign;
        }
        return placeholder.m4589copyK8Q__8(j10, j11, i8);
    }

    /* renamed from: copy-K8Q-__8, reason: not valid java name */
    public final Placeholder m4589copyK8Q__8(long j8, long j9, int i8) {
        return new Placeholder(j8, j9, i8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        if (TextUnit.m5339equalsimpl0(this.width, placeholder.width) && TextUnit.m5339equalsimpl0(this.height, placeholder.height) && PlaceholderVerticalAlign.m4596equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign)) {
            return true;
        }
        return false;
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m4590getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name */
    public final int m4591getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m4592getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        return (((TextUnit.m5343hashCodeimpl(this.width) * 31) + TextUnit.m5343hashCodeimpl(this.height)) * 31) + PlaceholderVerticalAlign.m4597hashCodeimpl(this.placeholderVerticalAlign);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m5349toStringimpl(this.width)) + ", height=" + ((Object) TextUnit.m5349toStringimpl(this.height)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.m4598toStringimpl(this.placeholderVerticalAlign)) + ')';
    }

    private Placeholder(long j8, long j9, int i8) {
        this.width = j8;
        this.height = j9;
        this.placeholderVerticalAlign = i8;
        if (!TextUnitKt.m5360isUnspecifiedR2X_6o(j8)) {
            if (!(!TextUnitKt.m5360isUnspecifiedR2X_6o(j9))) {
                throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
            }
            return;
        }
        throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
    }
}
