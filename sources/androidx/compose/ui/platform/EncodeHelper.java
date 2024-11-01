package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class EncodeHelper {
    public static final int $stable = 8;
    private Parcel parcel = Parcel.obtain();

    public final void encode(SpanStyle spanStyle) {
        long m4628getColor0d7_KjU = spanStyle.m4628getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m2949equalsimpl0(m4628getColor0d7_KjU, companion.m2984getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m4442encode8_81llA(spanStyle.m4628getColor0d7_KjU());
        }
        long m4629getFontSizeXSAIIZE = spanStyle.m4629getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m5339equalsimpl0(m4629getFontSizeXSAIIZE, companion2.m5353getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m4439encodeR2X_6o(spanStyle.m4629getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle m4630getFontStyle4Lr2A7w = spanStyle.m4630getFontStyle4Lr2A7w();
        if (m4630getFontStyle4Lr2A7w != null) {
            int m4782unboximpl = m4630getFontStyle4Lr2A7w.m4782unboximpl();
            encode((byte) 4);
            m4444encodenzbMABs(m4782unboximpl);
        }
        FontSynthesis m4631getFontSynthesisZQGJjVo = spanStyle.m4631getFontSynthesisZQGJjVo();
        if (m4631getFontSynthesisZQGJjVo != null) {
            int m4795unboximpl = m4631getFontSynthesisZQGJjVo.m4795unboximpl();
            encode((byte) 5);
            m4441encode6p3vJLY(m4795unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m5339equalsimpl0(spanStyle.m4632getLetterSpacingXSAIIZE(), companion2.m5353getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m4439encodeR2X_6o(spanStyle.m4632getLetterSpacingXSAIIZE());
        }
        BaselineShift m4627getBaselineShift5SSeXJ0 = spanStyle.m4627getBaselineShift5SSeXJ0();
        if (m4627getBaselineShift5SSeXJ0 != null) {
            float m4949unboximpl = m4627getBaselineShift5SSeXJ0.m4949unboximpl();
            encode((byte) 8);
            m4440encode4Dl_Bck(m4949unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m2949equalsimpl0(spanStyle.m4626getBackground0d7_KjU(), companion.m2984getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m4442encode8_81llA(spanStyle.m4626getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m4439encodeR2X_6o(long j8) {
        long m5341getTypeUIouoOA = TextUnit.m5341getTypeUIouoOA(j8);
        TextUnitType.Companion companion = TextUnitType.Companion;
        byte b9 = 0;
        if (!TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5376getUnspecifiedUIouoOA())) {
            if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5375getSpUIouoOA())) {
                b9 = 1;
            } else if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5374getEmUIouoOA())) {
                b9 = 2;
            }
        }
        encode(b9);
        if (!TextUnitType.m5370equalsimpl0(TextUnit.m5341getTypeUIouoOA(j8), companion.m5376getUnspecifiedUIouoOA())) {
            encode(TextUnit.m5342getValueimpl(j8));
        }
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m4440encode4Dl_Bck(float f8) {
        encode(f8);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m4441encode6p3vJLY(int i8) {
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        byte b9 = 0;
        if (!FontSynthesis.m4790equalsimpl0(i8, companion.m4797getNoneGVVA2EU())) {
            if (FontSynthesis.m4790equalsimpl0(i8, companion.m4796getAllGVVA2EU())) {
                b9 = 1;
            } else if (FontSynthesis.m4790equalsimpl0(i8, companion.m4799getWeightGVVA2EU())) {
                b9 = 2;
            } else if (FontSynthesis.m4790equalsimpl0(i8, companion.m4798getStyleGVVA2EU())) {
                b9 = 3;
            }
        }
        encode(b9);
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m4442encode8_81llA(long j8) {
        m4443encodeVKZWuLQ(j8);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m4443encodeVKZWuLQ(long j8) {
        this.parcel.writeLong(j8);
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m4444encodenzbMABs(int i8) {
        FontStyle.Companion companion = FontStyle.Companion;
        byte b9 = 0;
        if (!FontStyle.m4779equalsimpl0(i8, companion.m4786getNormal_LCdwA()) && FontStyle.m4779equalsimpl0(i8, companion.m4785getItalic_LCdwA())) {
            b9 = 1;
        }
        encode(b9);
    }

    public final String encodedString() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final void encode(FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        m4442encode8_81llA(shadow.m3250getColor0d7_KjU());
        encode(Offset.m2712getXimpl(shadow.m3251getOffsetF1C5BW0()));
        encode(Offset.m2713getYimpl(shadow.m3251getOffsetF1C5BW0()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b9) {
        this.parcel.writeByte(b9);
    }

    public final void encode(int i8) {
        this.parcel.writeInt(i8);
    }

    public final void encode(float f8) {
        this.parcel.writeFloat(f8);
    }

    public final void encode(String str) {
        this.parcel.writeString(str);
    }
}
