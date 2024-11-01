package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class XmlVectorParser_androidKt {
    private static final int FILL_TYPE_WINDING = 0;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;
    private static final String SHAPE_CLIP_PATH = "clip-path";
    private static final String SHAPE_GROUP = "group";
    private static final String SHAPE_PATH = "path";

    public static final ImageVector.Builder createVectorImageBuilder(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        long m2984getUnspecified0d7_KjU;
        int m2894getSrcIn0nO6VwU;
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean namedBoolean = androidVectorParser.getNamedBoolean(obtainAttributes, "autoMirrored", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED(), false);
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, "viewportWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "viewportHeight", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT(), 0.0f);
        if (namedFloat > 0.0f) {
            if (namedFloat2 > 0.0f) {
                float dimension = androidVectorParser.getDimension(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH(), 0.0f);
                float dimension2 = androidVectorParser.getDimension(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT(), 0.0f);
                if (obtainAttributes.hasValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) {
                    TypedValue typedValue = new TypedValue();
                    obtainAttributes.getValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT(), typedValue);
                    if (typedValue.type == 2) {
                        m2984getUnspecified0d7_KjU = Color.Companion.m2984getUnspecified0d7_KjU();
                    } else {
                        ColorStateList namedColorStateList = androidVectorParser.getNamedColorStateList(obtainAttributes, theme, "tint", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT());
                        if (namedColorStateList != null) {
                            m2984getUnspecified0d7_KjU = ColorKt.Color(namedColorStateList.getDefaultColor());
                        } else {
                            m2984getUnspecified0d7_KjU = Color.Companion.m2984getUnspecified0d7_KjU();
                        }
                    }
                } else {
                    m2984getUnspecified0d7_KjU = Color.Companion.m2984getUnspecified0d7_KjU();
                }
                long j8 = m2984getUnspecified0d7_KjU;
                int i8 = androidVectorParser.getInt(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
                if (i8 != -1) {
                    if (i8 != 3) {
                        if (i8 != 5) {
                            if (i8 != 9) {
                                switch (i8) {
                                    case 14:
                                        m2894getSrcIn0nO6VwU = BlendMode.Companion.m2885getModulate0nO6VwU();
                                        break;
                                    case 15:
                                        m2894getSrcIn0nO6VwU = BlendMode.Companion.m2890getScreen0nO6VwU();
                                        break;
                                    case 16:
                                        m2894getSrcIn0nO6VwU = BlendMode.Companion.m2888getPlus0nO6VwU();
                                        break;
                                    default:
                                        m2894getSrcIn0nO6VwU = BlendMode.Companion.m2894getSrcIn0nO6VwU();
                                        break;
                                }
                            } else {
                                m2894getSrcIn0nO6VwU = BlendMode.Companion.m2893getSrcAtop0nO6VwU();
                            }
                        } else {
                            m2894getSrcIn0nO6VwU = BlendMode.Companion.m2894getSrcIn0nO6VwU();
                        }
                    } else {
                        m2894getSrcIn0nO6VwU = BlendMode.Companion.m2896getSrcOver0nO6VwU();
                    }
                } else {
                    m2894getSrcIn0nO6VwU = BlendMode.Companion.m2894getSrcIn0nO6VwU();
                }
                int i9 = m2894getSrcIn0nO6VwU;
                float m5155constructorimpl = Dp.m5155constructorimpl(dimension / resources.getDisplayMetrics().density);
                float m5155constructorimpl2 = Dp.m5155constructorimpl(dimension2 / resources.getDisplayMetrics().density);
                obtainAttributes.recycle();
                return new ImageVector.Builder(null, m5155constructorimpl, m5155constructorimpl2, namedFloat, namedFloat2, j8, i9, namedBoolean, 1, null);
            }
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
    }

    /* renamed from: getStrokeLineCap-CSYIeUk, reason: not valid java name */
    private static final int m3535getStrokeLineCapCSYIeUk(int i8, int i9) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    return StrokeCap.Companion.m3280getSquareKaPHkGw();
                }
                return i9;
            }
            return StrokeCap.Companion.m3279getRoundKaPHkGw();
        }
        return StrokeCap.Companion.m3278getButtKaPHkGw();
    }

    /* renamed from: getStrokeLineCap-CSYIeUk$default, reason: not valid java name */
    static /* synthetic */ int m3536getStrokeLineCapCSYIeUk$default(int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = StrokeCap.Companion.m3278getButtKaPHkGw();
        }
        return m3535getStrokeLineCapCSYIeUk(i8, i9);
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA, reason: not valid java name */
    private static final int m3537getStrokeLineJoinkLtJ_vA(int i8, int i9) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    return StrokeJoin.Companion.m3288getBevelLxFBmk8();
                }
                return i9;
            }
            return StrokeJoin.Companion.m3290getRoundLxFBmk8();
        }
        return StrokeJoin.Companion.m3289getMiterLxFBmk8();
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA$default, reason: not valid java name */
    static /* synthetic */ int m3538getStrokeLineJoinkLtJ_vA$default(int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = StrokeJoin.Companion.m3289getMiterLxFBmk8();
        }
        return m3537getStrokeLineJoinkLtJ_vA(i8, i9);
    }

    public static final boolean isAtEnd(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 1) {
            return true;
        }
        if (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3) {
            return true;
        }
        return false;
    }

    private static final Brush obtainBrushFromComplexColor(ComplexColorCompat complexColorCompat) {
        if (!complexColorCompat.willDraw()) {
            return null;
        }
        Shader shader = complexColorCompat.getShader();
        if (shader != null) {
            return BrushKt.ShaderBrush(shader);
        }
        return new SolidColor(ColorKt.Color(complexColorCompat.getColor()), null);
    }

    public static final void parseClipPath(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        if (string == null) {
            string = "";
        }
        List<PathNode> addPathNodes = VectorKt.addPathNodes(androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA()));
        obtainAttributes.recycle();
        ImageVector.Builder.addGroup$default(builder, string, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, addPathNodes, 254, null);
    }

    public static final int parseCurrentVectorNode(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i8) {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType == 3 && AbstractC3292y.d(SHAPE_GROUP, androidVectorParser.getXmlParser().getName())) {
                int i9 = i8 + 1;
                for (int i10 = 0; i10 < i9; i10++) {
                    builder.clearGroup();
                }
                return 0;
            }
            return i8;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1649314686) {
                if (hashCode != 3433509) {
                    if (hashCode == 98629247 && name.equals(SHAPE_GROUP)) {
                        parseGroup(androidVectorParser, resources, theme, attributeSet, builder);
                        return i8;
                    }
                    return i8;
                }
                if (name.equals("path")) {
                    parsePath(androidVectorParser, resources, theme, attributeSet, builder);
                    return i8;
                }
                return i8;
            }
            if (name.equals(SHAPE_CLIP_PATH)) {
                parseClipPath(androidVectorParser, resources, theme, attributeSet, builder);
                return i8 + 1;
            }
            return i8;
        }
        return i8;
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            theme = null;
        }
        return parseCurrentVectorNode(androidVectorParser, resources, attributeSet, theme, builder, i8);
    }

    public static final void parseGroup(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, Key.ROTATION, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f8 = androidVectorParser.getFloat(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f9 = androidVectorParser.getFloat(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "scaleX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = androidVectorParser.getNamedFloat(obtainAttributes, "scaleY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(obtainAttributes, "translateX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(obtainAttributes, "translateY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (string == null) {
            string = "";
        }
        obtainAttributes.recycle();
        builder.addGroup(string, namedFloat, f8, f9, namedFloat2, namedFloat3, namedFloat4, namedFloat5, VectorKt.getEmptyPath());
    }

    public static final void parsePath(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) throws IllegalArgumentException {
        int m3208getEvenOddRgk1Os;
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if (TypedArrayUtils.hasAttribute(androidVectorParser.getXmlParser(), "pathData")) {
            String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
            if (string == null) {
                string = "";
            }
            String str = string;
            List<PathNode> addPathNodes = VectorKt.addPathNodes(androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA()));
            ComplexColorCompat namedComplexColor = androidVectorParser.getNamedComplexColor(obtainAttributes, theme, "fillColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
            float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, "fillAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
            int m3535getStrokeLineCapCSYIeUk = m3535getStrokeLineCapCSYIeUk(androidVectorParser.getNamedInt(obtainAttributes, "strokeLineCap", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1), StrokeCap.Companion.m3278getButtKaPHkGw());
            int m3537getStrokeLineJoinkLtJ_vA = m3537getStrokeLineJoinkLtJ_vA(androidVectorParser.getNamedInt(obtainAttributes, "strokeLineJoin", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1), StrokeJoin.Companion.m3288getBevelLxFBmk8());
            float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
            ComplexColorCompat namedComplexColor2 = androidVectorParser.getNamedComplexColor(obtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
            float namedFloat3 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
            float namedFloat4 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
            float namedFloat5 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
            float namedFloat6 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
            float namedFloat7 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
            int namedInt = androidVectorParser.getNamedInt(obtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), FILL_TYPE_WINDING);
            obtainAttributes.recycle();
            Brush obtainBrushFromComplexColor = obtainBrushFromComplexColor(namedComplexColor);
            Brush obtainBrushFromComplexColor2 = obtainBrushFromComplexColor(namedComplexColor2);
            PathFillType.Companion companion = PathFillType.Companion;
            if (namedInt == 0) {
                m3208getEvenOddRgk1Os = companion.m3209getNonZeroRgk1Os();
            } else {
                m3208getEvenOddRgk1Os = companion.m3208getEvenOddRgk1Os();
            }
            builder.m3500addPathoIyEayM(addPathNodes, m3208getEvenOddRgk1Os, str, obtainBrushFromComplexColor, namedFloat, obtainBrushFromComplexColor2, namedFloat3, namedFloat4, m3535getStrokeLineCapCSYIeUk, m3537getStrokeLineJoinkLtJ_vA, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
            return;
        }
        throw new IllegalArgumentException("No path data available");
    }

    public static final XmlPullParser seekToStartTag(XmlPullParser xmlPullParser) throws XmlPullParserException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
