package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class TextDirectionHeuristicsCompat {
    public static final TextDirectionHeuristicCompat ANYRTL_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL;
    public static final TextDirectionHeuristicCompat LOCALE;
    public static final TextDirectionHeuristicCompat LTR = new TextDirectionHeuristicInternal(null, false);
    public static final TextDirectionHeuristicCompat RTL = new TextDirectionHeuristicInternal(null, true);
    private static final int STATE_FALSE = 1;
    private static final int STATE_TRUE = 0;
    private static final int STATE_UNKNOWN = 2;

    /* loaded from: classes3.dex */
    private static class AnyStrong implements TextDirectionAlgorithm {
        static final AnyStrong INSTANCE_RTL = new AnyStrong(true);
        private final boolean mLookForRtl;

        private AnyStrong(boolean z8) {
            this.mLookForRtl = z8;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(CharSequence charSequence, int i8, int i9) {
            int i10 = i9 + i8;
            boolean z8 = false;
            while (i8 < i10) {
                int isRtlText = TextDirectionHeuristicsCompat.isRtlText(Character.getDirectionality(charSequence.charAt(i8)));
                if (isRtlText != 0) {
                    if (isRtlText == 1) {
                        if (!this.mLookForRtl) {
                            return 1;
                        }
                    } else {
                        continue;
                        i8++;
                    }
                } else if (this.mLookForRtl) {
                    return 0;
                }
                z8 = true;
                i8++;
            }
            if (z8) {
                return this.mLookForRtl ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes3.dex */
    private static class FirstStrong implements TextDirectionAlgorithm {
        static final FirstStrong INSTANCE = new FirstStrong();

        private FirstStrong() {
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(CharSequence charSequence, int i8, int i9) {
            int i10 = i9 + i8;
            int i11 = 2;
            while (i8 < i10 && i11 == 2) {
                i11 = TextDirectionHeuristicsCompat.isRtlTextOrFormat(Character.getDirectionality(charSequence.charAt(i8)));
                i8++;
            }
            return i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface TextDirectionAlgorithm {
        int checkRtl(CharSequence charSequence, int i8, int i9);
    }

    /* loaded from: classes3.dex */
    private static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {
        private final TextDirectionAlgorithm mAlgorithm;

        TextDirectionHeuristicImpl(TextDirectionAlgorithm textDirectionAlgorithm) {
            this.mAlgorithm = textDirectionAlgorithm;
        }

        private boolean doCheck(CharSequence charSequence, int i8, int i9) {
            int checkRtl = this.mAlgorithm.checkRtl(charSequence, i8, i9);
            if (checkRtl == 0) {
                return true;
            }
            if (checkRtl != 1) {
                return defaultIsRtl();
            }
            return false;
        }

        protected abstract boolean defaultIsRtl();

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(char[] cArr, int i8, int i9) {
            return isRtl(CharBuffer.wrap(cArr), i8, i9);
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(CharSequence charSequence, int i8, int i9) {
            if (charSequence != null && i8 >= 0 && i9 >= 0 && charSequence.length() - i9 >= i8) {
                if (this.mAlgorithm == null) {
                    return defaultIsRtl();
                }
                return doCheck(charSequence, i8, i9);
            }
            throw new IllegalArgumentException();
        }
    }

    /* loaded from: classes3.dex */
    private static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {
        private final boolean mDefaultIsRtl;

        TextDirectionHeuristicInternal(TextDirectionAlgorithm textDirectionAlgorithm, boolean z8) {
            super(textDirectionAlgorithm);
            this.mDefaultIsRtl = z8;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        protected boolean defaultIsRtl() {
            return this.mDefaultIsRtl;
        }
    }

    /* loaded from: classes3.dex */
    private static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        static final TextDirectionHeuristicLocale INSTANCE = new TextDirectionHeuristicLocale();

        TextDirectionHeuristicLocale() {
            super(null);
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        protected boolean defaultIsRtl() {
            if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        FirstStrong firstStrong = FirstStrong.INSTANCE;
        FIRSTSTRONG_LTR = new TextDirectionHeuristicInternal(firstStrong, false);
        FIRSTSTRONG_RTL = new TextDirectionHeuristicInternal(firstStrong, true);
        ANYRTL_LTR = new TextDirectionHeuristicInternal(AnyStrong.INSTANCE_RTL, false);
        LOCALE = TextDirectionHeuristicLocale.INSTANCE;
    }

    private TextDirectionHeuristicsCompat() {
    }

    static int isRtlText(int i8) {
        if (i8 != 0) {
            return (i8 == 1 || i8 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int isRtlTextOrFormat(int i8) {
        if (i8 != 0) {
            if (i8 == 1 || i8 == 2) {
                return 0;
            }
            switch (i8) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
