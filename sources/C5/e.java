package C5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* loaded from: classes5.dex */
public class e implements a {

    /* renamed from: b, reason: collision with root package name */
    private final RenderScript f987b;

    /* renamed from: c, reason: collision with root package name */
    private final ScriptIntrinsicBlur f988c;

    /* renamed from: d, reason: collision with root package name */
    private Allocation f989d;

    /* renamed from: a, reason: collision with root package name */
    private final Paint f986a = new Paint(2);

    /* renamed from: e, reason: collision with root package name */
    private int f990e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f991f = -1;

    public e(Context context) {
        RenderScript create = RenderScript.create(context);
        this.f987b = create;
        this.f988c = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    private boolean f(Bitmap bitmap) {
        if (bitmap.getHeight() == this.f991f && bitmap.getWidth() == this.f990e) {
            return true;
        }
        return false;
    }

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
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f986a);
    }

    @Override // C5.a
    public final void destroy() {
        this.f988c.destroy();
        this.f987b.destroy();
        Allocation allocation = this.f989d;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    @Override // C5.a
    public Bitmap e(Bitmap bitmap, float f8) {
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f987b, bitmap);
        if (!f(bitmap)) {
            Allocation allocation = this.f989d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f989d = Allocation.createTyped(this.f987b, createFromBitmap.getType());
            this.f990e = bitmap.getWidth();
            this.f991f = bitmap.getHeight();
        }
        this.f988c.setRadius(f8);
        this.f988c.setInput(createFromBitmap);
        this.f988c.forEach(this.f989d);
        this.f989d.copyTo(bitmap);
        createFromBitmap.destroy();
        return bitmap;
    }
}
