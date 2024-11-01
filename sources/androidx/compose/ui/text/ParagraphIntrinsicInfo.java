package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ParagraphIntrinsicInfo {
    public static final int $stable = 8;
    private final int endIndex;
    private final ParagraphIntrinsics intrinsics;
    private final int startIndex;

    public ParagraphIntrinsicInfo(ParagraphIntrinsics paragraphIntrinsics, int i8, int i9) {
        this.intrinsics = paragraphIntrinsics;
        this.startIndex = i8;
        this.endIndex = i9;
    }

    public static /* synthetic */ ParagraphIntrinsicInfo copy$default(ParagraphIntrinsicInfo paragraphIntrinsicInfo, ParagraphIntrinsics paragraphIntrinsics, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paragraphIntrinsics = paragraphIntrinsicInfo.intrinsics;
        }
        if ((i10 & 2) != 0) {
            i8 = paragraphIntrinsicInfo.startIndex;
        }
        if ((i10 & 4) != 0) {
            i9 = paragraphIntrinsicInfo.endIndex;
        }
        return paragraphIntrinsicInfo.copy(paragraphIntrinsics, i8, i9);
    }

    public final ParagraphIntrinsics component1() {
        return this.intrinsics;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final ParagraphIntrinsicInfo copy(ParagraphIntrinsics paragraphIntrinsics, int i8, int i9) {
        return new ParagraphIntrinsicInfo(paragraphIntrinsics, i8, i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphIntrinsicInfo)) {
            return false;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
        return AbstractC3292y.d(this.intrinsics, paragraphIntrinsicInfo.intrinsics) && this.startIndex == paragraphIntrinsicInfo.startIndex && this.endIndex == paragraphIntrinsicInfo.endIndex;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final ParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public int hashCode() {
        return (((this.intrinsics.hashCode() * 31) + this.startIndex) * 31) + this.endIndex;
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.intrinsics + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ')';
    }
}
