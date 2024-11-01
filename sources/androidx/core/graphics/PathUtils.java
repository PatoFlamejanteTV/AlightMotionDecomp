package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class PathUtils {

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(26)
    /* loaded from: classes3.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        static float[] approximate(Path path, float f8) {
            return path.approximate(f8);
        }
    }

    private PathUtils() {
    }

    @NonNull
    @RequiresApi(26)
    public static Collection<PathSegment> flatten(@NonNull Path path) {
        return flatten(path, 0.5f);
    }

    @NonNull
    @RequiresApi(26)
    public static Collection<PathSegment> flatten(@NonNull Path path, @FloatRange(from = 0.0d) float f8) {
        float[] approximate = Api26Impl.approximate(path, f8);
        int length = approximate.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i8 = 1; i8 < length; i8++) {
            int i9 = i8 * 3;
            int i10 = (i8 - 1) * 3;
            float f9 = approximate[i9];
            float f10 = approximate[i9 + 1];
            float f11 = approximate[i9 + 2];
            float f12 = approximate[i10];
            float f13 = approximate[i10 + 1];
            float f14 = approximate[i10 + 2];
            if (f9 != f12 && (f10 != f13 || f11 != f14)) {
                arrayList.add(new PathSegment(new PointF(f13, f14), f12, new PointF(f10, f11), f9));
            }
        }
        return arrayList;
    }
}
