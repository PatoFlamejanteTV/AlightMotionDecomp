package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TypefaceRequest {
    public static final int $stable = 8;
    private final FontFamily fontFamily;
    private final int fontStyle;
    private final int fontSynthesis;
    private final FontWeight fontWeight;
    private final Object resourceLoaderCacheKey;

    public /* synthetic */ TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i8, int i9, Object obj, AbstractC3284p abstractC3284p) {
        this(fontFamily, fontWeight, i8, i9, obj);
    }

    /* renamed from: copy-e1PVR60$default, reason: not valid java name */
    public static /* synthetic */ TypefaceRequest m4818copye1PVR60$default(TypefaceRequest typefaceRequest, FontFamily fontFamily, FontWeight fontWeight, int i8, int i9, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            fontFamily = typefaceRequest.fontFamily;
        }
        if ((i10 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        FontWeight fontWeight2 = fontWeight;
        if ((i10 & 4) != 0) {
            i8 = typefaceRequest.fontStyle;
        }
        int i11 = i8;
        if ((i10 & 8) != 0) {
            i9 = typefaceRequest.fontSynthesis;
        }
        int i12 = i9;
        if ((i10 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        return typefaceRequest.m4821copye1PVR60(fontFamily, fontWeight2, i11, i12, obj);
    }

    public final FontFamily component1() {
        return this.fontFamily;
    }

    public final FontWeight component2() {
        return this.fontWeight;
    }

    /* renamed from: component3-_-LCdwA, reason: not valid java name */
    public final int m4819component3_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: component4-GVVA2EU, reason: not valid java name */
    public final int m4820component4GVVA2EU() {
        return this.fontSynthesis;
    }

    public final Object component5() {
        return this.resourceLoaderCacheKey;
    }

    /* renamed from: copy-e1PVR60, reason: not valid java name */
    public final TypefaceRequest m4821copye1PVR60(FontFamily fontFamily, FontWeight fontWeight, int i8, int i9, Object obj) {
        return new TypefaceRequest(fontFamily, fontWeight, i8, i9, obj, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        return AbstractC3292y.d(this.fontFamily, typefaceRequest.fontFamily) && AbstractC3292y.d(this.fontWeight, typefaceRequest.fontWeight) && FontStyle.m4779equalsimpl0(this.fontStyle, typefaceRequest.fontStyle) && FontSynthesis.m4790equalsimpl0(this.fontSynthesis, typefaceRequest.fontSynthesis) && AbstractC3292y.d(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getFontStyle-_-LCdwA, reason: not valid java name */
    public final int m4822getFontStyle_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m4823getFontSynthesisGVVA2EU() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }

    public int hashCode() {
        FontFamily fontFamily = this.fontFamily;
        int hashCode = (((((((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + FontStyle.m4780hashCodeimpl(this.fontStyle)) * 31) + FontSynthesis.m4791hashCodeimpl(this.fontSynthesis)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) FontStyle.m4781toStringimpl(this.fontStyle)) + ", fontSynthesis=" + ((Object) FontSynthesis.m4794toStringimpl(this.fontSynthesis)) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }

    private TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i8, int i9, Object obj) {
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.fontStyle = i8;
        this.fontSynthesis = i9;
        this.resourceLoaderCacheKey = obj;
    }
}
