package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import e6.AbstractC2829a;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AccessibilityIterators {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 8;
        private final int[] segment = new int[2];
        protected String text;

        protected final int[] getRange(int i8, int i9) {
            if (i8 >= 0 && i9 >= 0 && i8 != i9) {
                int[] iArr = this.segment;
                iArr[0] = i8;
                iArr[1] = i9;
                return iArr;
            }
            return null;
        }

        protected final String getText() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            AbstractC3292y.y(MimeTypes.BASE_TYPE_TEXT);
            return null;
        }

        public void initialize(String str) {
            setText(str);
        }

        protected final void setText(String str) {
            this.text = str;
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        private static CharacterTextSegmentIterator instance;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public final CharacterTextSegmentIterator getInstance(Locale locale) {
                if (CharacterTextSegmentIterator.instance == null) {
                    CharacterTextSegmentIterator.instance = new CharacterTextSegmentIterator(locale, null);
                }
                CharacterTextSegmentIterator characterTextSegmentIterator = CharacterTextSegmentIterator.instance;
                AbstractC3292y.g(characterTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return characterTextSegmentIterator;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public /* synthetic */ CharacterTextSegmentIterator(Locale locale, AbstractC3284p abstractC3284p) {
            this(locale);
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getCharacterInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i8) {
            int length = getText().length();
            if (length <= 0 || i8 >= length) {
                return null;
            }
            if (i8 < 0) {
                i8 = 0;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    AbstractC3292y.y("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i8)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        AbstractC3292y.y("impl");
                        breakIterator2 = null;
                    }
                    i8 = breakIterator2.following(i8);
                } else {
                    BreakIterator breakIterator3 = this.impl;
                    if (breakIterator3 == null) {
                        AbstractC3292y.y("impl");
                        breakIterator3 = null;
                    }
                    int following = breakIterator3.following(i8);
                    if (following == -1) {
                        return null;
                    }
                    return getRange(i8, following);
                }
            } while (i8 != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                AbstractC3292y.y("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i8) {
            int length = getText().length();
            if (length <= 0 || i8 <= 0) {
                return null;
            }
            if (i8 > length) {
                i8 = length;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    AbstractC3292y.y("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i8)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        AbstractC3292y.y("impl");
                        breakIterator2 = null;
                    }
                    i8 = breakIterator2.preceding(i8);
                } else {
                    BreakIterator breakIterator3 = this.impl;
                    if (breakIterator3 == null) {
                        AbstractC3292y.y("impl");
                        breakIterator3 = null;
                    }
                    int preceding = breakIterator3.preceding(i8);
                    if (preceding == -1) {
                        return null;
                    }
                    return getRange(preceding, i8);
                }
            } while (i8 != -1);
            return null;
        }

        private CharacterTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        private static LineTextSegmentIterator lineInstance;
        private TextLayoutResult layoutResult;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public final LineTextSegmentIterator getInstance() {
                if (LineTextSegmentIterator.lineInstance == null) {
                    LineTextSegmentIterator.lineInstance = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator lineTextSegmentIterator = LineTextSegmentIterator.lineInstance;
                AbstractC3292y.g(lineTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return lineTextSegmentIterator;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public /* synthetic */ LineTextSegmentIterator(AbstractC3284p abstractC3284p) {
            this();
        }

        private final int getLineEdgeIndex(int i8, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                AbstractC3292y.y("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i8);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                AbstractC3292y.y("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    AbstractC3292y.y("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i8);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                AbstractC3292y.y("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i8, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i8) {
            int i9;
            if (getText().length() <= 0 || i8 >= getText().length()) {
                return null;
            }
            if (i8 < 0) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    AbstractC3292y.y("layoutResult");
                    textLayoutResult = null;
                }
                i9 = textLayoutResult.getLineForOffset(0);
            } else {
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    AbstractC3292y.y("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(i8);
                if (getLineEdgeIndex(lineForOffset, DirectionStart) == i8) {
                    i9 = lineForOffset;
                } else {
                    i9 = lineForOffset + 1;
                }
            }
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                AbstractC3292y.y("layoutResult");
                textLayoutResult3 = null;
            }
            if (i9 >= textLayoutResult3.getLineCount()) {
                return null;
            }
            return getRange(getLineEdgeIndex(i9, DirectionStart), getLineEdgeIndex(i9, DirectionEnd) + 1);
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult) {
            setText(str);
            this.layoutResult = textLayoutResult;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i8) {
            int i9;
            if (getText().length() <= 0 || i8 <= 0) {
                return null;
            }
            if (i8 > getText().length()) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    AbstractC3292y.y("layoutResult");
                    textLayoutResult = null;
                }
                i9 = textLayoutResult.getLineForOffset(getText().length());
            } else {
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    AbstractC3292y.y("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(i8);
                if (getLineEdgeIndex(lineForOffset, DirectionEnd) + 1 == i8) {
                    i9 = lineForOffset;
                } else {
                    i9 = lineForOffset - 1;
                }
            }
            if (i9 < 0) {
                return null;
            }
            return getRange(getLineEdgeIndex(i9, DirectionStart), getLineEdgeIndex(i9, DirectionEnd) + 1);
        }

        private LineTextSegmentIterator() {
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        private static PageTextSegmentIterator pageInstance;
        private TextLayoutResult layoutResult;
        private SemanticsNode node;
        private Rect tempRect;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public final PageTextSegmentIterator getInstance() {
                if (PageTextSegmentIterator.pageInstance == null) {
                    PageTextSegmentIterator.pageInstance = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator pageTextSegmentIterator = PageTextSegmentIterator.pageInstance;
                AbstractC3292y.g(pageTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return pageTextSegmentIterator;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public /* synthetic */ PageTextSegmentIterator(AbstractC3284p abstractC3284p) {
            this();
        }

        private final int getLineEdgeIndex(int i8, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                AbstractC3292y.y("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i8);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                AbstractC3292y.y("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    AbstractC3292y.y("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i8);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                AbstractC3292y.y("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i8, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i8) {
            int lineCount;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || i8 >= getText().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    AbstractC3292y.y("node");
                    semanticsNode = null;
                }
                int d8 = AbstractC2829a.d(semanticsNode.getBoundsInRoot().getHeight());
                int d9 = i6.m.d(0, i8);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    AbstractC3292y.y("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(d9);
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    AbstractC3292y.y("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) + d8;
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    AbstractC3292y.y("layoutResult");
                    textLayoutResult4 = null;
                }
                TextLayoutResult textLayoutResult5 = this.layoutResult;
                if (textLayoutResult5 == null) {
                    AbstractC3292y.y("layoutResult");
                    textLayoutResult5 = null;
                }
                if (lineTop < textLayoutResult4.getLineTop(textLayoutResult5.getLineCount() - 1)) {
                    TextLayoutResult textLayoutResult6 = this.layoutResult;
                    if (textLayoutResult6 == null) {
                        AbstractC3292y.y("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult6;
                    }
                    lineCount = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    TextLayoutResult textLayoutResult7 = this.layoutResult;
                    if (textLayoutResult7 == null) {
                        AbstractC3292y.y("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult7;
                    }
                    lineCount = textLayoutResult.getLineCount();
                }
                return getRange(d9, getLineEdgeIndex(lineCount - 1, DirectionEnd) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult, SemanticsNode semanticsNode) {
            setText(str);
            this.layoutResult = textLayoutResult;
            this.node = semanticsNode;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i8) {
            int i9;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || i8 <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    AbstractC3292y.y("node");
                    semanticsNode = null;
                }
                int d8 = AbstractC2829a.d(semanticsNode.getBoundsInRoot().getHeight());
                int g8 = i6.m.g(getText().length(), i8);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    AbstractC3292y.y("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(g8);
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    AbstractC3292y.y("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) - d8;
                if (lineTop > 0.0f) {
                    TextLayoutResult textLayoutResult4 = this.layoutResult;
                    if (textLayoutResult4 == null) {
                        AbstractC3292y.y("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult4;
                    }
                    i9 = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    i9 = 0;
                }
                if (g8 == getText().length() && i9 < lineForOffset) {
                    i9++;
                }
                return getRange(getLineEdgeIndex(i9, DirectionStart), g8);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        private PageTextSegmentIterator() {
            this.tempRect = new Rect();
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static ParagraphTextSegmentIterator instance;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public final ParagraphTextSegmentIterator getInstance() {
                if (ParagraphTextSegmentIterator.instance == null) {
                    ParagraphTextSegmentIterator.instance = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator paragraphTextSegmentIterator = ParagraphTextSegmentIterator.instance;
                AbstractC3292y.g(paragraphTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return paragraphTextSegmentIterator;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public /* synthetic */ ParagraphTextSegmentIterator(AbstractC3284p abstractC3284p) {
            this();
        }

        private final boolean isEndBoundary(int i8) {
            if (i8 > 0 && getText().charAt(i8 - 1) != '\n' && (i8 == getText().length() || getText().charAt(i8) == '\n')) {
                return true;
            }
            return false;
        }

        private final boolean isStartBoundary(int i8) {
            if (getText().charAt(i8) != '\n' && (i8 == 0 || getText().charAt(i8 - 1) == '\n')) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:            return null;     */
        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int[] following(int r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.getText()
                int r0 = r0.length()
                r1 = 0
                if (r0 > 0) goto Lc
                return r1
            Lc:
                if (r5 < r0) goto Lf
                return r1
            Lf:
                if (r5 >= 0) goto L12
                r5 = 0
            L12:
                if (r5 >= r0) goto L29
                java.lang.String r2 = r4.getText()
                char r2 = r2.charAt(r5)
                r3 = 10
                if (r2 != r3) goto L29
                boolean r2 = r4.isStartBoundary(r5)
                if (r2 != 0) goto L29
                int r5 = r5 + 1
                goto L12
            L29:
                if (r5 < r0) goto L2c
                return r1
            L2c:
                int r1 = r5 + 1
            L2e:
                if (r1 >= r0) goto L39
                boolean r2 = r4.isEndBoundary(r1)
                if (r2 != 0) goto L39
                int r1 = r1 + 1
                goto L2e
            L39:
                int[] r5 = r4.getRange(r5, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.following(int):int[]");
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:            return null;     */
        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int[] preceding(int r4) {
            /*
                r3 = this;
                java.lang.String r0 = r3.getText()
                int r0 = r0.length()
                r1 = 0
                if (r0 > 0) goto Lc
                return r1
            Lc:
                if (r4 > 0) goto Lf
                return r1
            Lf:
                if (r4 <= r0) goto L12
                r4 = r0
            L12:
                if (r4 <= 0) goto L2b
                java.lang.String r0 = r3.getText()
                int r2 = r4 + (-1)
                char r0 = r0.charAt(r2)
                r2 = 10
                if (r0 != r2) goto L2b
                boolean r0 = r3.isEndBoundary(r4)
                if (r0 != 0) goto L2b
                int r4 = r4 + (-1)
                goto L12
            L2b:
                if (r4 > 0) goto L2e
                return r1
            L2e:
                int r0 = r4 + (-1)
            L30:
                if (r0 <= 0) goto L3b
                boolean r1 = r3.isStartBoundary(r0)
                if (r1 != 0) goto L3b
                int r0 = r0 + (-1)
                goto L30
            L3b:
                int[] r4 = r3.getRange(r0, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.preceding(int):int[]");
        }

        private ParagraphTextSegmentIterator() {
        }
    }

    /* loaded from: classes.dex */
    public interface TextSegmentIterator {
        int[] following(int i8);

        int[] preceding(int i8);
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        private static WordTextSegmentIterator instance;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public final WordTextSegmentIterator getInstance(Locale locale) {
                if (WordTextSegmentIterator.instance == null) {
                    WordTextSegmentIterator.instance = new WordTextSegmentIterator(locale, null);
                }
                WordTextSegmentIterator wordTextSegmentIterator = WordTextSegmentIterator.instance;
                AbstractC3292y.g(wordTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return wordTextSegmentIterator;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public /* synthetic */ WordTextSegmentIterator(Locale locale, AbstractC3284p abstractC3284p) {
            this(locale);
        }

        private final boolean isEndBoundary(int i8) {
            if (i8 > 0 && isLetterOrDigit(i8 - 1) && (i8 == getText().length() || !isLetterOrDigit(i8))) {
                return true;
            }
            return false;
        }

        private final boolean isLetterOrDigit(int i8) {
            if (i8 >= 0 && i8 < getText().length()) {
                return Character.isLetterOrDigit(getText().codePointAt(i8));
            }
            return false;
        }

        private final boolean isStartBoundary(int i8) {
            if (isLetterOrDigit(i8) && (i8 == 0 || !isLetterOrDigit(i8 - 1))) {
                return true;
            }
            return false;
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i8) {
            if (getText().length() <= 0 || i8 >= getText().length()) {
                return null;
            }
            if (i8 < 0) {
                i8 = 0;
            }
            while (!isLetterOrDigit(i8) && !isStartBoundary(i8)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    AbstractC3292y.y("impl");
                    breakIterator = null;
                }
                i8 = breakIterator.following(i8);
                if (i8 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                AbstractC3292y.y("impl");
                breakIterator2 = null;
            }
            int following = breakIterator2.following(i8);
            if (following == -1 || !isEndBoundary(following)) {
                return null;
            }
            return getRange(i8, following);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                AbstractC3292y.y("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i8) {
            int length = getText().length();
            if (length <= 0 || i8 <= 0) {
                return null;
            }
            if (i8 > length) {
                i8 = length;
            }
            while (i8 > 0 && !isLetterOrDigit(i8 - 1) && !isEndBoundary(i8)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    AbstractC3292y.y("impl");
                    breakIterator = null;
                }
                i8 = breakIterator.preceding(i8);
                if (i8 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                AbstractC3292y.y("impl");
                breakIterator2 = null;
            }
            int preceding = breakIterator2.preceding(i8);
            if (preceding == -1 || !isStartBoundary(preceding)) {
                return null;
            }
            return getRange(preceding, i8);
        }

        private WordTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }
    }
}
