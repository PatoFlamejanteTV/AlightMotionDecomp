package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
class PropertyValuesHolderUtils {

    @RequiresApi(21)
    /* loaded from: classes3.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static <V> PropertyValuesHolder ofObject(Property<?, V> property, Path path) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
    }

    private PropertyValuesHolderUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PropertyValuesHolder ofPointF(Property<?, PointF> property, Path path) {
        return Api21Impl.ofObject(property, path);
    }
}
