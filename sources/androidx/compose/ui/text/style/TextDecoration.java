package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class TextDecoration {
    public static final int $stable = 0;
    private final int mask;
    public static final Companion Companion = new Companion(null);
    private static final TextDecoration None = new TextDecoration(0);
    private static final TextDecoration Underline = new TextDecoration(1);
    private static final TextDecoration LineThrough = new TextDecoration(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getLineThrough$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        @Stable
        public static /* synthetic */ void getUnderline$annotations() {
        }

        public final TextDecoration combine(List<TextDecoration> list) {
            Integer num = 0;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                num = Integer.valueOf(num.intValue() | list.get(i8).getMask());
            }
            return new TextDecoration(num.intValue());
        }

        public final TextDecoration getLineThrough() {
            return TextDecoration.LineThrough;
        }

        public final TextDecoration getNone() {
            return TextDecoration.None;
        }

        public final TextDecoration getUnderline() {
            return TextDecoration.Underline;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public TextDecoration(int i8) {
        this.mask = i8;
    }

    public final boolean contains(TextDecoration textDecoration) {
        int i8 = this.mask;
        if ((textDecoration.mask | i8) == i8) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TextDecoration) && this.mask == ((TextDecoration) obj).mask) {
            return true;
        }
        return false;
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return this.mask;
    }

    public final TextDecoration plus(TextDecoration textDecoration) {
        return new TextDecoration(textDecoration.mask | this.mask);
    }

    public String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.mask & Underline.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((this.mask & LineThrough.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + ListUtilsKt.fastJoinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
