package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* loaded from: classes.dex */
public final class AndroidPaint implements Paint {
    private int _blendMode;
    private ColorFilter internalColorFilter;
    private android.graphics.Paint internalPaint;
    private Shader internalShader;
    private PathEffect pathEffect;

    public AndroidPaint(android.graphics.Paint paint) {
        this.internalPaint = paint;
        this._blendMode = BlendMode.Companion.m2896getSrcOver0nO6VwU();
    }

    @Override // androidx.compose.ui.graphics.Paint
    public android.graphics.Paint asFrameworkPaint() {
        return this.internalPaint;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getAlpha() {
        return AndroidPaint_androidKt.getNativeAlpha(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public int mo2826getBlendMode0nO6VwU() {
        return this._blendMode;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo2827getColor0d7_KjU() {
        return AndroidPaint_androidKt.getNativeColor(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public ColorFilter getColorFilter() {
        return this.internalColorFilter;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getFilterQuality-f-v9h1I, reason: not valid java name */
    public int mo2828getFilterQualityfv9h1I() {
        return AndroidPaint_androidKt.getNativeFilterQuality(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public PathEffect getPathEffect() {
        return this.pathEffect;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public Shader getShader() {
        return this.internalShader;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getStrokeCap-KaPHkGw, reason: not valid java name */
    public int mo2829getStrokeCapKaPHkGw() {
        return AndroidPaint_androidKt.getNativeStrokeCap(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getStrokeJoin-LxFBmk8, reason: not valid java name */
    public int mo2830getStrokeJoinLxFBmk8() {
        return AndroidPaint_androidKt.getNativeStrokeJoin(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getStrokeMiterLimit() {
        return AndroidPaint_androidKt.getNativeStrokeMiterLimit(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getStrokeWidth() {
        return AndroidPaint_androidKt.getNativeStrokeWidth(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getStyle-TiuSbCo, reason: not valid java name */
    public int mo2831getStyleTiuSbCo() {
        return AndroidPaint_androidKt.getNativeStyle(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public boolean isAntiAlias() {
        return AndroidPaint_androidKt.getNativeAntiAlias(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setAlpha(float f8) {
        AndroidPaint_androidKt.setNativeAlpha(this.internalPaint, f8);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setAntiAlias(boolean z8) {
        AndroidPaint_androidKt.setNativeAntiAlias(this.internalPaint, z8);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public void mo2832setBlendModes9anfk8(int i8) {
        if (!BlendMode.m2865equalsimpl0(this._blendMode, i8)) {
            this._blendMode = i8;
            AndroidPaint_androidKt.m2838setNativeBlendModeGB0RdKg(this.internalPaint, i8);
        }
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public void mo2833setColor8_81llA(long j8) {
        AndroidPaint_androidKt.m2839setNativeColor4WTKRHQ(this.internalPaint, j8);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setColorFilter(ColorFilter colorFilter) {
        this.internalColorFilter = colorFilter;
        AndroidPaint_androidKt.setNativeColorFilter(this.internalPaint, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setFilterQuality-vDHp3xo, reason: not valid java name */
    public void mo2834setFilterQualityvDHp3xo(int i8) {
        AndroidPaint_androidKt.m2840setNativeFilterQuality50PEsBU(this.internalPaint, i8);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setPathEffect(PathEffect pathEffect) {
        AndroidPaint_androidKt.setNativePathEffect(this.internalPaint, pathEffect);
        this.pathEffect = pathEffect;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setShader(Shader shader) {
        this.internalShader = shader;
        AndroidPaint_androidKt.setNativeShader(this.internalPaint, shader);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setStrokeCap-BeK7IIE, reason: not valid java name */
    public void mo2835setStrokeCapBeK7IIE(int i8) {
        AndroidPaint_androidKt.m2841setNativeStrokeCapCSYIeUk(this.internalPaint, i8);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setStrokeJoin-Ww9F2mQ, reason: not valid java name */
    public void mo2836setStrokeJoinWw9F2mQ(int i8) {
        AndroidPaint_androidKt.m2842setNativeStrokeJoinkLtJ_vA(this.internalPaint, i8);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setStrokeMiterLimit(float f8) {
        AndroidPaint_androidKt.setNativeStrokeMiterLimit(this.internalPaint, f8);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setStrokeWidth(float f8) {
        AndroidPaint_androidKt.setNativeStrokeWidth(this.internalPaint, f8);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setStyle-k9PVt8s, reason: not valid java name */
    public void mo2837setStylek9PVt8s(int i8) {
        AndroidPaint_androidKt.m2843setNativeStyle5YerkU(this.internalPaint, i8);
    }

    public AndroidPaint() {
        this(AndroidPaint_androidKt.makeNativePaint());
    }
}
