package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Preconditions;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes3.dex */
public final class EditorInfoCompat {
    private static final String CONTENT_MIME_TYPES_INTEROP_KEY = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String CONTENT_MIME_TYPES_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String CONTENT_SELECTION_END_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    private static final String CONTENT_SELECTION_HEAD_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    private static final String CONTENT_SURROUNDING_TEXT_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;

    @VisibleForTesting
    static final int MAX_INITIAL_SELECTION_LENGTH = 1024;

    @VisibleForTesting
    static final int MEMORY_EFFICIENT_TEXT_LENGTH = 2048;
    private static final String STYLUS_HANDWRITING_ENABLED_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED";

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(30)
    /* loaded from: classes3.dex */
    public static class Api30Impl {
        private Api30Impl() {
        }

        static CharSequence getInitialSelectedText(@NonNull EditorInfo editorInfo, int i8) {
            return editorInfo.getInitialSelectedText(i8);
        }

        static CharSequence getInitialTextAfterCursor(@NonNull EditorInfo editorInfo, int i8, int i9) {
            return editorInfo.getInitialTextAfterCursor(i8, i9);
        }

        static CharSequence getInitialTextBeforeCursor(@NonNull EditorInfo editorInfo, int i8, int i9) {
            return editorInfo.getInitialTextBeforeCursor(i8, i9);
        }

        static void setInitialSurroundingSubText(@NonNull EditorInfo editorInfo, CharSequence charSequence, int i8) {
            editorInfo.setInitialSurroundingSubText(charSequence, i8);
        }
    }

    @Deprecated
    public EditorInfoCompat() {
    }

    @NonNull
    public static String[] getContentMimeTypes(@NonNull EditorInfo editorInfo) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 25) {
            strArr = editorInfo.contentMimeTypes;
            if (strArr == null) {
                return EMPTY_STRING_ARRAY;
            }
            return strArr;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return EMPTY_STRING_ARRAY;
        }
        String[] stringArray = bundle.getStringArray(CONTENT_MIME_TYPES_KEY);
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(CONTENT_MIME_TYPES_INTEROP_KEY);
        }
        if (stringArray == null) {
            return EMPTY_STRING_ARRAY;
        }
        return stringArray;
    }

    @Nullable
    public static CharSequence getInitialSelectedText(@NonNull EditorInfo editorInfo, int i8) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialSelectedText(editorInfo, i8);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int min = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int max = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i9 = editorInfo.extras.getInt(CONTENT_SELECTION_HEAD_KEY);
        int i10 = editorInfo.extras.getInt(CONTENT_SELECTION_END_KEY);
        int i11 = max - min;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i10 - i9 != i11 || (charSequence = editorInfo.extras.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        if ((i8 & 1) != 0) {
            return charSequence.subSequence(i9, i10);
        }
        return TextUtils.substring(charSequence, i9, i10);
    }

    @Nullable
    public static CharSequence getInitialTextAfterCursor(@NonNull EditorInfo editorInfo, int i8, int i9) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialTextAfterCursor(editorInfo, i8, i9);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        int i10 = editorInfo.extras.getInt(CONTENT_SELECTION_END_KEY);
        int min = Math.min(i8, charSequence.length() - i10);
        if ((i9 & 1) != 0) {
            return charSequence.subSequence(i10, min + i10);
        }
        return TextUtils.substring(charSequence, i10, min + i10);
    }

    @Nullable
    public static CharSequence getInitialTextBeforeCursor(@NonNull EditorInfo editorInfo, int i8, int i9) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialTextBeforeCursor(editorInfo, i8, i9);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        int i10 = editorInfo.extras.getInt(CONTENT_SELECTION_HEAD_KEY);
        int min = Math.min(i8, i10);
        if ((i9 & 1) != 0) {
            return charSequence.subSequence(i10 - min, i10);
        }
        return TextUtils.substring(charSequence, i10 - min, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getProtocol(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean containsKey = bundle.containsKey(CONTENT_MIME_TYPES_KEY);
        boolean containsKey2 = editorInfo.extras.containsKey(CONTENT_MIME_TYPES_INTEROP_KEY);
        if (containsKey && containsKey2) {
            return 4;
        }
        if (containsKey) {
            return 3;
        }
        if (!containsKey2) {
            return 0;
        }
        return 2;
    }

    private static boolean isCutOnSurrogate(CharSequence charSequence, int i8, int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(i8));
        }
        return Character.isLowSurrogate(charSequence.charAt(i8));
    }

    private static boolean isPasswordInputType(int i8) {
        int i9 = i8 & 4095;
        return i9 == 129 || i9 == 225 || i9 == 18;
    }

    public static boolean isStylusHandwritingEnabled(@NonNull EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(STYLUS_HANDWRITING_ENABLED_KEY);
    }

    public static void setContentMimeTypes(@NonNull EditorInfo editorInfo, @Nullable String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray(CONTENT_MIME_TYPES_KEY, strArr);
        editorInfo.extras.putStringArray(CONTENT_MIME_TYPES_INTEROP_KEY, strArr);
    }

    public static void setInitialSurroundingSubText(@NonNull EditorInfo editorInfo, @NonNull CharSequence charSequence, int i8) {
        int i9;
        int i10;
        Preconditions.checkNotNull(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setInitialSurroundingSubText(editorInfo, charSequence, i8);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        if (i11 > i12) {
            i9 = i12 - i8;
        } else {
            i9 = i11 - i8;
        }
        if (i11 > i12) {
            i10 = i11 - i8;
        } else {
            i10 = i12 - i8;
        }
        int length = charSequence.length();
        if (i8 >= 0 && i9 >= 0 && i10 <= length) {
            if (isPasswordInputType(editorInfo.inputType)) {
                setSurroundingText(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                setSurroundingText(editorInfo, charSequence, i9, i10);
                return;
            } else {
                trimLongSurroundingText(editorInfo, charSequence, i9, i10);
                return;
            }
        }
        setSurroundingText(editorInfo, null, 0, 0);
    }

    public static void setInitialSurroundingText(@NonNull EditorInfo editorInfo, @NonNull CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setInitialSurroundingSubText(editorInfo, charSequence, 0);
        } else {
            setInitialSurroundingSubText(editorInfo, charSequence, 0);
        }
    }

    public static void setStylusHandwritingEnabled(@NonNull EditorInfo editorInfo, boolean z8) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean(STYLUS_HANDWRITING_ENABLED_KEY, z8);
    }

    private static void setSurroundingText(EditorInfo editorInfo, CharSequence charSequence, int i8, int i9) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence(CONTENT_SURROUNDING_TEXT_KEY, spannableStringBuilder);
        editorInfo.extras.putInt(CONTENT_SELECTION_HEAD_KEY, i8);
        editorInfo.extras.putInt(CONTENT_SELECTION_END_KEY, i9);
    }

    private static void trimLongSurroundingText(EditorInfo editorInfo, CharSequence charSequence, int i8, int i9) {
        int i10;
        CharSequence subSequence;
        int i11 = i9 - i8;
        if (i11 > 1024) {
            i10 = 0;
        } else {
            i10 = i11;
        }
        int i12 = 2048 - i10;
        int min = Math.min(charSequence.length() - i9, i12 - Math.min(i8, (int) (i12 * 0.8d)));
        int min2 = Math.min(i8, i12 - min);
        int i13 = i8 - min2;
        if (isCutOnSurrogate(charSequence, i13, 0)) {
            i13++;
            min2--;
        }
        if (isCutOnSurrogate(charSequence, (i9 + min) - 1, 1)) {
            min--;
        }
        int i14 = min2 + i10 + min;
        if (i10 != i11) {
            subSequence = TextUtils.concat(charSequence.subSequence(i13, i13 + min2), charSequence.subSequence(i9, min + i9));
        } else {
            subSequence = charSequence.subSequence(i13, i14 + i13);
        }
        setSurroundingText(editorInfo, subSequence, min2, i10 + min2);
    }
}
