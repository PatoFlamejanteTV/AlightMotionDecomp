package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
class ObjectAnimatorUtils {

    @RequiresApi(21)
    /* loaded from: classes3.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static <T, V> ObjectAnimator ofObject(T t8, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t8, property, (TypeConverter) null, path);
        }
    }

    private ObjectAnimatorUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> ObjectAnimator ofPointF(T t8, Property<T, PointF> property, Path path) {
        return Api21Impl.ofObject(t8, property, path);
    }
}
