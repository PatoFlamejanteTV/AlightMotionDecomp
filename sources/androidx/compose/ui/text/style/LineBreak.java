package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class LineBreak {
    public static final Companion Companion = new Companion(null);
    private static final int Heading;
    private static final int Paragraph;
    private static final int Simple;
    private static final int Unspecified;
    private final int mask;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getHeading-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4985getHeadingrAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getParagraph-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4986getParagraphrAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getSimple-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4987getSimplerAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4988getUnspecifiedrAG3T2k$annotations() {
        }

        /* renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m4989getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m4990getParagraphrAG3T2k() {
            return LineBreak.Paragraph;
        }

        /* renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m4991getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        /* renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m4992getUnspecifiedrAG3T2k() {
            return LineBreak.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class Strategy {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Simple = m4994constructorimpl(1);
        private static final int HighQuality = m4994constructorimpl(2);
        private static final int Balanced = m4994constructorimpl(3);
        private static final int Unspecified = m4994constructorimpl(0);

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m5000getBalancedfcGXIks() {
                return Strategy.Balanced;
            }

            /* renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m5001getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m5002getSimplefcGXIks() {
                return Strategy.Simple;
            }

            /* renamed from: getUnspecified-fcGXIks, reason: not valid java name */
            public final int m5003getUnspecifiedfcGXIks() {
                return Strategy.Unspecified;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        private /* synthetic */ Strategy(int i8) {
            this.value = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strategy m4993boximpl(int i8) {
            return new Strategy(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m4994constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4995equalsimpl(int i8, Object obj) {
            return (obj instanceof Strategy) && i8 == ((Strategy) obj).m4999unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4996equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4997hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4998toStringimpl(int i8) {
            if (m4996equalsimpl0(i8, Simple)) {
                return "Strategy.Simple";
            }
            if (m4996equalsimpl0(i8, HighQuality)) {
                return "Strategy.HighQuality";
            }
            if (m4996equalsimpl0(i8, Balanced)) {
                return "Strategy.Balanced";
            }
            if (m4996equalsimpl0(i8, Unspecified)) {
                return "Strategy.Unspecified";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m4995equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m4997hashCodeimpl(this.value);
        }

        public String toString() {
            return m4998toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m4999unboximpl() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public static final class Strictness {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m5005constructorimpl(1);
        private static final int Loose = m5005constructorimpl(2);
        private static final int Normal = m5005constructorimpl(3);
        private static final int Strict = m5005constructorimpl(4);
        private static final int Unspecified = m5005constructorimpl(0);
        private final int value;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m5011getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m5012getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m5013getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m5014getStrictusljTpc() {
                return Strictness.Strict;
            }

            /* renamed from: getUnspecified-usljTpc, reason: not valid java name */
            public final int m5015getUnspecifiedusljTpc() {
                return Strictness.Unspecified;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        private /* synthetic */ Strictness(int i8) {
            this.value = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strictness m5004boximpl(int i8) {
            return new Strictness(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m5005constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5006equalsimpl(int i8, Object obj) {
            return (obj instanceof Strictness) && i8 == ((Strictness) obj).m5010unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5007equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5008hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5009toStringimpl(int i8) {
            if (m5007equalsimpl0(i8, Default)) {
                return "Strictness.None";
            }
            if (m5007equalsimpl0(i8, Loose)) {
                return "Strictness.Loose";
            }
            if (m5007equalsimpl0(i8, Normal)) {
                return "Strictness.Normal";
            }
            if (m5007equalsimpl0(i8, Strict)) {
                return "Strictness.Strict";
            }
            if (m5007equalsimpl0(i8, Unspecified)) {
                return "Strictness.Unspecified";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5006equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5008hashCodeimpl(this.value);
        }

        public String toString() {
            return m5009toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5010unboximpl() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public static final class WordBreak {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m5017constructorimpl(1);
        private static final int Phrase = m5017constructorimpl(2);
        private static final int Unspecified = m5017constructorimpl(0);
        private final int value;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m5023getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m5024getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }

            /* renamed from: getUnspecified-jp8hJ3c, reason: not valid java name */
            public final int m5025getUnspecifiedjp8hJ3c() {
                return WordBreak.Unspecified;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        private /* synthetic */ WordBreak(int i8) {
            this.value = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WordBreak m5016boximpl(int i8) {
            return new WordBreak(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m5017constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5018equalsimpl(int i8, Object obj) {
            return (obj instanceof WordBreak) && i8 == ((WordBreak) obj).m5022unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5019equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5020hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5021toStringimpl(int i8) {
            if (m5019equalsimpl0(i8, Default)) {
                return "WordBreak.None";
            }
            if (m5019equalsimpl0(i8, Phrase)) {
                return "WordBreak.Phrase";
            }
            if (m5019equalsimpl0(i8, Unspecified)) {
                return "WordBreak.Unspecified";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5018equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5020hashCodeimpl(this.value);
        }

        public String toString() {
            return m5021toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5022unboximpl() {
            return this.value;
        }
    }

    static {
        int packBytes;
        int packBytes2;
        int packBytes3;
        Strategy.Companion companion = Strategy.Companion;
        int m5002getSimplefcGXIks = companion.m5002getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.Companion;
        int m5013getNormalusljTpc = companion2.m5013getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.Companion;
        packBytes = LineBreak_androidKt.packBytes(m5002getSimplefcGXIks, m5013getNormalusljTpc, companion3.m5023getDefaultjp8hJ3c());
        Simple = m4973constructorimpl(packBytes);
        packBytes2 = LineBreak_androidKt.packBytes(companion.m5000getBalancedfcGXIks(), companion2.m5012getLooseusljTpc(), companion3.m5024getPhrasejp8hJ3c());
        Heading = m4973constructorimpl(packBytes2);
        packBytes3 = LineBreak_androidKt.packBytes(companion.m5001getHighQualityfcGXIks(), companion2.m5014getStrictusljTpc(), companion3.m5023getDefaultjp8hJ3c());
        Paragraph = m4973constructorimpl(packBytes3);
        Unspecified = m4973constructorimpl(0);
    }

    private /* synthetic */ LineBreak(int i8) {
        this.mask = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m4972boximpl(int i8) {
        return new LineBreak(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4973constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m4975copygijOMQM(int i8, int i9, int i10, int i11) {
        return m4974constructorimpl(i9, i10, i11);
    }

    /* renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m4976copygijOMQM$default(int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i9 = m4979getStrategyfcGXIks(i8);
        }
        if ((i12 & 2) != 0) {
            i10 = m4980getStrictnessusljTpc(i8);
        }
        if ((i12 & 4) != 0) {
            i11 = m4981getWordBreakjp8hJ3c(i8);
        }
        return m4975copygijOMQM(i8, i9, i10, i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4977equalsimpl(int i8, Object obj) {
        return (obj instanceof LineBreak) && i8 == ((LineBreak) obj).m4984unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4978equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m4979getStrategyfcGXIks(int i8) {
        int unpackByte1;
        unpackByte1 = LineBreak_androidKt.unpackByte1(i8);
        return Strategy.m4994constructorimpl(unpackByte1);
    }

    /* renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m4980getStrictnessusljTpc(int i8) {
        int unpackByte2;
        unpackByte2 = LineBreak_androidKt.unpackByte2(i8);
        return Strictness.m5005constructorimpl(unpackByte2);
    }

    /* renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m4981getWordBreakjp8hJ3c(int i8) {
        int unpackByte3;
        unpackByte3 = LineBreak_androidKt.unpackByte3(i8);
        return WordBreak.m5017constructorimpl(unpackByte3);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4982hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4983toStringimpl(int i8) {
        return "LineBreak(strategy=" + ((Object) Strategy.m4998toStringimpl(m4979getStrategyfcGXIks(i8))) + ", strictness=" + ((Object) Strictness.m5009toStringimpl(m4980getStrictnessusljTpc(i8))) + ", wordBreak=" + ((Object) WordBreak.m5021toStringimpl(m4981getWordBreakjp8hJ3c(i8))) + ')';
    }

    public boolean equals(Object obj) {
        return m4977equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m4982hashCodeimpl(this.mask);
    }

    public String toString() {
        return m4983toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4984unboximpl() {
        return this.mask;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4974constructorimpl(int i8, int i9, int i10) {
        int packBytes;
        packBytes = LineBreak_androidKt.packBytes(i8, i9, i10);
        return m4973constructorimpl(packBytes);
    }
}
