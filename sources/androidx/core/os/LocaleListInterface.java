package androidx.core.os;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.Locale;

/* loaded from: classes3.dex */
interface LocaleListInterface {
    Locale get(int i8);

    @Nullable
    Locale getFirstMatch(@NonNull String[] strArr);

    Object getLocaleList();

    @IntRange(from = -1)
    int indexOf(Locale locale);

    boolean isEmpty();

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    int size();

    String toLanguageTags();
}
