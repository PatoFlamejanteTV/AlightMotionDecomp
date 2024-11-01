package androidx.compose.ui.platform;

import R5.AbstractC1435t;
import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DecodeHelper {
    public static final int $stable = 8;
    private final Parcel parcel;

    public DecodeHelper(String str) {
        Parcel obtain = Parcel.obtain();
        this.parcel = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }

    /* renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m4425decodeBaselineShifty9eOQZs() {
        return BaselineShift.m4944constructorimpl(decodeFloat());
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    private final Shadow decodeShadow() {
        return new Shadow(m4427decodeColor0d7_KjU(), OffsetKt.Offset(decodeFloat(), decodeFloat()), decodeFloat(), null);
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final TextDecoration decodeTextDecoration() {
        boolean z8;
        boolean z9;
        int decodeInt = decodeInt();
        TextDecoration.Companion companion = TextDecoration.Companion;
        if ((companion.getLineThrough().getMask() & decodeInt) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((decodeInt & companion.getUnderline().getMask()) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 && z9) {
            return companion.combine(AbstractC1435t.p(companion.getLineThrough(), companion.getUnderline()));
        }
        if (z8) {
            return companion.getLineThrough();
        }
        if (z9) {
            return companion.getUnderline();
        }
        return companion.getNone();
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    /* renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m4426decodeULongsVKNKU() {
        return Q5.C.b(this.parcel.readLong());
    }

    /* renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m4427decodeColor0d7_KjU() {
        return Color.m2944constructorimpl(m4426decodeULongsVKNKU());
    }

    /* renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m4428decodeFontStyle_LCdwA() {
        byte decodeByte = decodeByte();
        if (decodeByte == 0) {
            return FontStyle.Companion.m4786getNormal_LCdwA();
        }
        if (decodeByte == 1) {
            return FontStyle.Companion.m4785getItalic_LCdwA();
        }
        return FontStyle.Companion.m4786getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m4429decodeFontSynthesisGVVA2EU() {
        byte decodeByte = decodeByte();
        if (decodeByte == 0) {
            return FontSynthesis.Companion.m4797getNoneGVVA2EU();
        }
        if (decodeByte == 1) {
            return FontSynthesis.Companion.m4796getAllGVVA2EU();
        }
        if (decodeByte == 3) {
            return FontSynthesis.Companion.m4798getStyleGVVA2EU();
        }
        if (decodeByte == 2) {
            return FontSynthesis.Companion.m4799getWeightGVVA2EU();
        }
        return FontSynthesis.Companion.m4797getNoneGVVA2EU();
    }

    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    public final SpanStyle decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle;
        MutableSpanStyle mutableSpanStyle2 = r15;
        MutableSpanStyle mutableSpanStyle3 = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte decodeByte = decodeByte();
            if (decodeByte == 1) {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle2.m4459setColor8_81llA(m4427decodeColor0d7_KjU());
            } else {
                mutableSpanStyle = mutableSpanStyle2;
                if (decodeByte == 2) {
                    if (dataAvailable() < 5) {
                        break;
                    }
                    mutableSpanStyle.m4460setFontSizeR2X_6o(m4430decodeTextUnitXSAIIZE());
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte == 3) {
                    if (dataAvailable() < 4) {
                        break;
                    }
                    mutableSpanStyle.setFontWeight(decodeFontWeight());
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte == 4) {
                    if (dataAvailable() < 1) {
                        break;
                    }
                    mutableSpanStyle.m4461setFontStylemLjRB2g(FontStyle.m4776boximpl(m4428decodeFontStyle_LCdwA()));
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte == 5) {
                    if (dataAvailable() < 1) {
                        break;
                    }
                    mutableSpanStyle.m4462setFontSynthesistDdu0R4(FontSynthesis.m4787boximpl(m4429decodeFontSynthesisGVVA2EU()));
                    mutableSpanStyle2 = mutableSpanStyle;
                } else {
                    if (decodeByte == 6) {
                        mutableSpanStyle.setFontFeatureSettings(decodeString());
                    } else if (decodeByte == 7) {
                        if (dataAvailable() < 5) {
                            break;
                        }
                        mutableSpanStyle.m4463setLetterSpacingR2X_6o(m4430decodeTextUnitXSAIIZE());
                    } else if (decodeByte == 8) {
                        if (dataAvailable() < 4) {
                            break;
                        }
                        mutableSpanStyle.m4458setBaselineShift_isdbwI(BaselineShift.m4943boximpl(m4425decodeBaselineShifty9eOQZs()));
                    } else if (decodeByte == 9) {
                        if (dataAvailable() < 8) {
                            break;
                        }
                        mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                    } else if (decodeByte == 10) {
                        if (dataAvailable() < 8) {
                            break;
                        }
                        mutableSpanStyle.m4457setBackground8_81llA(m4427decodeColor0d7_KjU());
                    } else if (decodeByte == 11) {
                        if (dataAvailable() < 4) {
                            break;
                        }
                        mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                    } else if (decodeByte == 12) {
                        if (dataAvailable() < 20) {
                            break;
                        }
                        mutableSpanStyle.setShadow(decodeShadow());
                    }
                    mutableSpanStyle2 = mutableSpanStyle;
                }
            }
        }
        mutableSpanStyle = mutableSpanStyle2;
        return mutableSpanStyle.toSpanStyle();
    }

    /* renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m4430decodeTextUnitXSAIIZE() {
        long m5376getUnspecifiedUIouoOA;
        byte decodeByte = decodeByte();
        if (decodeByte == 1) {
            m5376getUnspecifiedUIouoOA = TextUnitType.Companion.m5375getSpUIouoOA();
        } else if (decodeByte == 2) {
            m5376getUnspecifiedUIouoOA = TextUnitType.Companion.m5374getEmUIouoOA();
        } else {
            m5376getUnspecifiedUIouoOA = TextUnitType.Companion.m5376getUnspecifiedUIouoOA();
        }
        if (TextUnitType.m5370equalsimpl0(m5376getUnspecifiedUIouoOA, TextUnitType.Companion.m5376getUnspecifiedUIouoOA())) {
            return TextUnit.Companion.m5353getUnspecifiedXSAIIZE();
        }
        return TextUnitKt.m5354TextUnitanM5pPY(decodeFloat(), m5376getUnspecifiedUIouoOA);
    }
}
