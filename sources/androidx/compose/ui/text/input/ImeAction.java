package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class ImeAction {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Default = m4830constructorimpl(1);
    private static final int None = m4830constructorimpl(0);
    private static final int Go = m4830constructorimpl(2);
    private static final int Search = m4830constructorimpl(3);
    private static final int Send = m4830constructorimpl(4);
    private static final int Previous = m4830constructorimpl(5);
    private static final int Next = m4830constructorimpl(6);
    private static final int Done = m4830constructorimpl(7);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getDefault-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4836getDefaulteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getDone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4837getDoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getGo-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4838getGoeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNext-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4839getNexteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4840getNoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getPrevious-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4841getPreviouseUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSearch-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4842getSearcheUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSend-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4843getSendeUduSuo$annotations() {
        }

        /* renamed from: getDefault-eUduSuo, reason: not valid java name */
        public final int m4844getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* renamed from: getDone-eUduSuo, reason: not valid java name */
        public final int m4845getDoneeUduSuo() {
            return ImeAction.Done;
        }

        /* renamed from: getGo-eUduSuo, reason: not valid java name */
        public final int m4846getGoeUduSuo() {
            return ImeAction.Go;
        }

        /* renamed from: getNext-eUduSuo, reason: not valid java name */
        public final int m4847getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* renamed from: getNone-eUduSuo, reason: not valid java name */
        public final int m4848getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* renamed from: getPrevious-eUduSuo, reason: not valid java name */
        public final int m4849getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* renamed from: getSearch-eUduSuo, reason: not valid java name */
        public final int m4850getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* renamed from: getSend-eUduSuo, reason: not valid java name */
        public final int m4851getSendeUduSuo() {
            return ImeAction.Send;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ ImeAction(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImeAction m4829boximpl(int i8) {
        return new ImeAction(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4830constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4831equalsimpl(int i8, Object obj) {
        return (obj instanceof ImeAction) && i8 == ((ImeAction) obj).m4835unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4832equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4833hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4834toStringimpl(int i8) {
        if (m4832equalsimpl0(i8, None)) {
            return "None";
        }
        if (m4832equalsimpl0(i8, Default)) {
            return "Default";
        }
        if (m4832equalsimpl0(i8, Go)) {
            return "Go";
        }
        if (m4832equalsimpl0(i8, Search)) {
            return "Search";
        }
        if (m4832equalsimpl0(i8, Send)) {
            return "Send";
        }
        if (m4832equalsimpl0(i8, Previous)) {
            return "Previous";
        }
        if (m4832equalsimpl0(i8, Next)) {
            return "Next";
        }
        if (m4832equalsimpl0(i8, Done)) {
            return "Done";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4831equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4833hashCodeimpl(this.value);
    }

    public String toString() {
        return m4834toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4835unboximpl() {
        return this.value;
    }
}
