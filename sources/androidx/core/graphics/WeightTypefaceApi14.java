package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.core.content.res.FontResourcesParserCompat;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class WeightTypefaceApi14 {
    private static final String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final String TAG = "WeightTypeface";
    private static final Field sNativeInstance;
    private static final Object sWeightCacheLock;

    @GuardedBy("sWeightCacheLock")
    private static final LongSparseArray<SparseArray<Typeface>> sWeightTypefaceCache;

    static {
        Field field;
        try {
            field = Typeface.class.getDeclaredField(NATIVE_INSTANCE_FIELD);
            field.setAccessible(true);
        } catch (Exception e8) {
            Log.e(TAG, e8.getClass().getName(), e8);
            field = null;
        }
        sNativeInstance = field;
        sWeightTypefaceCache = new LongSparseArray<>(3);
        sWeightCacheLock = new Object();
    }

    private WeightTypefaceApi14() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static Typeface createWeightStyle(@NonNull TypefaceCompatBaseImpl typefaceCompatBaseImpl, @NonNull Context context, @NonNull Typeface typeface, int i8, boolean z8) {
        if (!isPrivateApiAvailable()) {
            return null;
        }
        int i9 = (i8 << 1) | (z8 ? 1 : 0);
        synchronized (sWeightCacheLock) {
            try {
                long nativeInstance = getNativeInstance(typeface);
                LongSparseArray<SparseArray<Typeface>> longSparseArray = sWeightTypefaceCache;
                SparseArray<Typeface> sparseArray = longSparseArray.get(nativeInstance);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>(4);
                    longSparseArray.put(nativeInstance, sparseArray);
                } else {
                    Typeface typeface2 = sparseArray.get(i9);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface bestFontFromFamily = getBestFontFromFamily(typefaceCompatBaseImpl, context, typeface, i8, z8);
                if (bestFontFromFamily == null) {
                    bestFontFromFamily = platformTypefaceCreate(typeface, i8, z8);
                }
                sparseArray.put(i9, bestFontFromFamily);
                return bestFontFromFamily;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    private static Typeface getBestFontFromFamily(@NonNull TypefaceCompatBaseImpl typefaceCompatBaseImpl, @NonNull Context context, @NonNull Typeface typeface, int i8, boolean z8) {
        FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamily = typefaceCompatBaseImpl.getFontFamily(typeface);
        if (fontFamily == null) {
            return null;
        }
        return typefaceCompatBaseImpl.createFromFontFamilyFilesResourceEntry(context, fontFamily, context.getResources(), i8, z8);
    }

    private static long getNativeInstance(@NonNull Typeface typeface) {
        try {
            return ((Number) sNativeInstance.get(typeface)).longValue();
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static boolean isPrivateApiAvailable() {
        if (sNativeInstance != null) {
            return true;
        }
        return false;
    }

    private static Typeface platformTypefaceCreate(Typeface typeface, int i8, boolean z8) {
        boolean z9;
        int i9 = 0;
        if (i8 >= 600) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 || z8) {
            if (!z9) {
                i9 = 2;
            } else if (!z8) {
                i9 = 1;
            } else {
                i9 = 3;
            }
        }
        return Typeface.create(typeface, i9);
    }
}
