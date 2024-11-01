package s5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: s5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3970d implements m2.e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39132a;

    public C3970d(Context context) {
        AbstractC3292y.i(context, "context");
        this.f39132a = context;
    }

    @Override // m2.e
    public Bitmap a(Bitmap source) {
        AbstractC3292y.i(source, "source");
        int width = source.getWidth();
        int height = source.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, source.getConfig());
        AbstractC3292y.h(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(source, 0.0f, 0.0f, (Paint) null);
        float f8 = height - (height / 3);
        float f9 = height;
        LinearGradient linearGradient = new LinearGradient(0.0f, f8, 0.0f, f9, 0, ContextCompat.getColor(this.f39132a, R.color.background_color), Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, f8, width, f9, paint);
        source.recycle();
        return createBitmap;
    }

    @Override // m2.e
    public String key() {
        return "bottomGradient";
    }
}
