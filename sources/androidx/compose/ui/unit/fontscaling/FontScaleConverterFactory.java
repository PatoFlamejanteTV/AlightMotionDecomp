package androidx.compose.ui.unit.fontscaling;

import Q5.I;
import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class FontScaleConverterFactory {
    public static final int $stable;
    public static final FontScaleConverterFactory INSTANCE;
    private static final Object[] LOOKUP_TABLES_WRITE_LOCK;
    private static final float SCALE_KEY_MULTIPLIER = 100.0f;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static volatile SparseArrayCompat<FontScaleConverter> sLookupTables;
    private static float sMinScaleBeforeCurvesApplied;

    static {
        FontScaleConverterFactory fontScaleConverterFactory = new FontScaleConverterFactory();
        INSTANCE = fontScaleConverterFactory;
        sLookupTables = new SparseArrayCompat<>();
        Object[] objArr = new Object[0];
        LOOKUP_TABLES_WRITE_LOCK = objArr;
        sMinScaleBeforeCurvesApplied = 1.05f;
        synchronized (objArr) {
            fontScaleConverterFactory.putInto(sLookupTables, 1.15f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.3f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.5f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.8f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 2.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            I i8 = I.f8786a;
        }
        float scaleFromKey = fontScaleConverterFactory.getScaleFromKey(sLookupTables.keyAt(0)) - 0.02f;
        sMinScaleBeforeCurvesApplied = scaleFromKey;
        if (scaleFromKey > 1.0f) {
            $stable = 8;
            return;
        }
        throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1".toString());
    }

    private FontScaleConverterFactory() {
    }

    private final FontScaleConverter createInterpolatedTableBetween(FontScaleConverter fontScaleConverter, FontScaleConverter fontScaleConverter2, float f8) {
        float[] fArr = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        float[] fArr2 = new float[9];
        for (int i8 = 0; i8 < 9; i8++) {
            float f9 = fArr[i8];
            fArr2[i8] = MathUtils.INSTANCE.lerp(fontScaleConverter.convertSpToDp(f9), fontScaleConverter2.convertSpToDp(f9), f8);
        }
        return new FontScaleConverterTable(fArr, fArr2);
    }

    private final FontScaleConverter get(float f8) {
        return sLookupTables.get(getKey(f8));
    }

    private final int getKey(float f8) {
        return (int) (f8 * 100.0f);
    }

    @VisibleForTesting
    public static /* synthetic */ void getSLookupTables$annotations() {
    }

    private final float getScaleFromKey(int i8) {
        return i8 / 100.0f;
    }

    private final void put(float f8, FontScaleConverter fontScaleConverter) {
        synchronized (LOOKUP_TABLES_WRITE_LOCK) {
            SparseArrayCompat<FontScaleConverter> m105clone = sLookupTables.m105clone();
            INSTANCE.putInto(m105clone, f8, fontScaleConverter);
            sLookupTables = m105clone;
            I i8 = I.f8786a;
        }
    }

    private final void putInto(SparseArrayCompat<FontScaleConverter> sparseArrayCompat, float f8, FontScaleConverter fontScaleConverter) {
        sparseArrayCompat.put(getKey(f8), fontScaleConverter);
    }

    @AnyThread
    public final FontScaleConverter forScale(float f8) {
        if (!isNonLinearFontScalingActive(f8)) {
            return null;
        }
        FontScaleConverter fontScaleConverter = INSTANCE.get(f8);
        if (fontScaleConverter != null) {
            return fontScaleConverter;
        }
        int indexOfKey = sLookupTables.indexOfKey(getKey(f8));
        if (indexOfKey >= 0) {
            return sLookupTables.valueAt(indexOfKey);
        }
        int i8 = -(indexOfKey + 1);
        int i9 = i8 - 1;
        if (i9 >= 0 && i8 < sLookupTables.size()) {
            FontScaleConverter createInterpolatedTableBetween = createInterpolatedTableBetween(sLookupTables.valueAt(i9), sLookupTables.valueAt(i8), MathUtils.INSTANCE.constrainedMap(0.0f, 1.0f, getScaleFromKey(sLookupTables.keyAt(i9)), getScaleFromKey(sLookupTables.keyAt(i8)), f8));
            put(f8, createInterpolatedTableBetween);
            return createInterpolatedTableBetween;
        }
        FontScaleConverterTable fontScaleConverterTable = new FontScaleConverterTable(new float[]{1.0f}, new float[]{f8});
        put(f8, fontScaleConverterTable);
        return fontScaleConverterTable;
    }

    public final SparseArrayCompat<FontScaleConverter> getSLookupTables() {
        return sLookupTables;
    }

    @AnyThread
    public final boolean isNonLinearFontScalingActive(float f8) {
        if (f8 >= sMinScaleBeforeCurvesApplied) {
            return true;
        }
        return false;
    }

    public final void setSLookupTables(SparseArrayCompat<FontScaleConverter> sparseArrayCompat) {
        sLookupTables = sparseArrayCompat;
    }
}
