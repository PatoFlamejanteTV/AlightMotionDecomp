package eightbitlab.com.blurview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import androidx.compose.ui.platform.J0;

/* loaded from: classes5.dex */
public class d implements C5.a {

    /* renamed from: b, reason: collision with root package name */
    private int f31804b;

    /* renamed from: c, reason: collision with root package name */
    private int f31805c;

    /* renamed from: e, reason: collision with root package name */
    public C5.a f31807e;

    /* renamed from: f, reason: collision with root package name */
    private Context f31808f;

    /* renamed from: a, reason: collision with root package name */
    private final RenderNode f31803a = J0.a("BlurViewNode");

    /* renamed from: d, reason: collision with root package name */
    private float f31806d = 1.0f;

    @Override // C5.a
    public float a() {
        return 6.0f;
    }

    @Override // C5.a
    public Bitmap.Config b() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // C5.a
    public boolean c() {
        return true;
    }

    @Override // C5.a
    public void d(Canvas canvas, Bitmap bitmap) {
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f31803a);
            return;
        }
        if (this.f31807e == null) {
            this.f31807e = new C5.e(this.f31808f);
        }
        this.f31807e.e(bitmap, this.f31806d);
        this.f31807e.d(canvas, bitmap);
    }

    @Override // C5.a
    public void destroy() {
        this.f31803a.discardDisplayList();
        C5.a aVar = this.f31807e;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // C5.a
    public Bitmap e(Bitmap bitmap, float f8) {
        RecordingCanvas beginRecording;
        RenderEffect createBlurEffect;
        this.f31806d = f8;
        if (bitmap.getHeight() != this.f31804b || bitmap.getWidth() != this.f31805c) {
            this.f31804b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f31805c = width;
            this.f31803a.setPosition(0, 0, width, this.f31804b);
        }
        beginRecording = this.f31803a.beginRecording();
        beginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f31803a.endRecording();
        RenderNode renderNode = this.f31803a;
        createBlurEffect = RenderEffect.createBlurEffect(f8, f8, Shader.TileMode.MIRROR);
        renderNode.setRenderEffect(createBlurEffect);
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Context context) {
        this.f31808f = context;
    }
}
