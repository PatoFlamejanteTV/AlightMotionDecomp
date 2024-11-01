package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.xmlpull.v1.XmlPullParser;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidVectorParser {
    public static final int $stable = 8;
    private int config;
    private final XmlPullParser xmlParser;

    public AndroidVectorParser(XmlPullParser xmlPullParser, int i8) {
        this.xmlParser = xmlPullParser;
        this.config = i8;
    }

    public static /* synthetic */ AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            xmlPullParser = androidVectorParser.xmlParser;
        }
        if ((i9 & 2) != 0) {
            i8 = androidVectorParser.config;
        }
        return androidVectorParser.copy(xmlPullParser, i8);
    }

    private final void updateConfig(int i8) {
        this.config = i8 | this.config;
    }

    public final XmlPullParser component1() {
        return this.xmlParser;
    }

    public final int component2() {
        return this.config;
    }

    public final AndroidVectorParser copy(XmlPullParser xmlPullParser, int i8) {
        return new AndroidVectorParser(xmlPullParser, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        return AbstractC3292y.d(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    public final int getConfig() {
        return this.config;
    }

    public final float getDimension(TypedArray typedArray, int i8, float f8) {
        float dimension = typedArray.getDimension(i8, f8);
        updateConfig(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float getFloat(TypedArray typedArray, int i8, float f8) {
        float f9 = typedArray.getFloat(i8, f8);
        updateConfig(typedArray.getChangingConfigurations());
        return f9;
    }

    public final int getInt(TypedArray typedArray, int i8, int i9) {
        int i10 = typedArray.getInt(i8, i9);
        updateConfig(typedArray.getChangingConfigurations());
        return i10;
    }

    public final boolean getNamedBoolean(TypedArray typedArray, String str, @StyleableRes int i8, boolean z8) {
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(typedArray, this.xmlParser, str, i8, z8);
        updateConfig(typedArray.getChangingConfigurations());
        return namedBoolean;
    }

    public final ColorStateList getNamedColorStateList(TypedArray typedArray, Resources.Theme theme, String str, @StyleableRes int i8) {
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(typedArray, this.xmlParser, theme, str, i8);
        updateConfig(typedArray.getChangingConfigurations());
        return namedColorStateList;
    }

    public final ComplexColorCompat getNamedComplexColor(TypedArray typedArray, Resources.Theme theme, String str, @StyleableRes int i8, @ColorInt int i9) {
        ComplexColorCompat namedComplexColor = TypedArrayUtils.getNamedComplexColor(typedArray, this.xmlParser, theme, str, i8, i9);
        updateConfig(typedArray.getChangingConfigurations());
        return namedComplexColor;
    }

    public final float getNamedFloat(TypedArray typedArray, String str, @StyleableRes int i8, float f8) {
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, this.xmlParser, str, i8, f8);
        updateConfig(typedArray.getChangingConfigurations());
        return namedFloat;
    }

    public final int getNamedInt(TypedArray typedArray, String str, @StyleableRes int i8, int i9) {
        int namedInt = TypedArrayUtils.getNamedInt(typedArray, this.xmlParser, str, i8, i9);
        updateConfig(typedArray.getChangingConfigurations());
        return namedInt;
    }

    public final String getString(TypedArray typedArray, int i8) {
        String string = typedArray.getString(i8);
        updateConfig(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public int hashCode() {
        return (this.xmlParser.hashCode() * 31) + this.config;
    }

    public final TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, iArr);
        updateConfig(obtainAttributes.getChangingConfigurations());
        return obtainAttributes;
    }

    public final void setConfig(int i8) {
        this.config = i8;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.xmlParser + ", config=" + this.config + ')';
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(xmlPullParser, (i9 & 2) != 0 ? 0 : i8);
    }
}
