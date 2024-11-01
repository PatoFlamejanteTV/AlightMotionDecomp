package androidx.compose.ui.tooling.preview;

import androidx.compose.ui.tooling.preview.Preview;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Preview.Container({@Preview(device = Devices.PHONE, name = "Phone", showSystemUi = true), @Preview(device = "spec:width = 411dp, height = 891dp, orientation = landscape, dpi = 420", name = "Phone - Landscape", showSystemUi = true), @Preview(device = Devices.FOLDABLE, name = "Unfolded Foldable", showSystemUi = true), @Preview(device = Devices.TABLET, name = "Tablet", showSystemUi = true), @Preview(device = Devices.DESKTOP, name = "Desktop", showSystemUi = true)})
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface PreviewScreenSizes {
}
