package com.mbridge.msdk.dycreator.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.e.e;
import com.mbridge.msdk.dycreator.e.g;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: g, reason: collision with root package name */
    private static volatile b f19485g;

    /* renamed from: a, reason: collision with root package name */
    private SoftReference<HashMap<String, c>> f19486a;

    /* renamed from: b, reason: collision with root package name */
    private SoftReference<HashMap<String, String>> f19487b;

    /* renamed from: c, reason: collision with root package name */
    private SoftReference<HashMap<String, c>> f19488c;

    /* renamed from: d, reason: collision with root package name */
    private String f19489d;

    /* renamed from: e, reason: collision with root package name */
    private String f19490e;

    /* renamed from: f, reason: collision with root package name */
    private Context f19491f;

    private b() {
    }

    public static b a() {
        if (f19485g == null) {
            synchronized (b.class) {
                try {
                    if (f19485g == null) {
                        f19485g = new b();
                    }
                } finally {
                }
            }
        }
        return f19485g;
    }

    public final HashMap b() {
        SoftReference<HashMap<String, c>> softReference = this.f19486a;
        if (softReference == null || softReference.get() == null) {
            HashMap hashMap = new HashMap(45);
            hashMap.put("layout_width", c.layout_width);
            hashMap.put("layout_height", c.layout_height);
            hashMap.put("orientation", c.orientation);
            hashMap.put("layout_centerHorizontal", c.layout_centerHorizontal);
            hashMap.put("layout_centerVertical", c.layout_centerVertical);
            c cVar = c.layout_marginLeft;
            hashMap.put("layout_marginLeft", cVar);
            c cVar2 = c.layout_marginRight;
            hashMap.put("layout_marginRight", cVar2);
            hashMap.put("layout_margin", c.layout_margin);
            hashMap.put("layout_gravity", c.layout_gravity);
            hashMap.put("layout_alignParentRight", c.layout_alignParentRight);
            hashMap.put("layout_weight", c.layout_weight);
            hashMap.put("contentDescription", c.contentDescription);
            hashMap.put("gravity", c.gravity);
            hashMap.put("id", c.id);
            hashMap.put("layout_below", c.layout_below);
            hashMap.put("layout_above", c.layout_above);
            hashMap.put("layout_toLeftOf", c.layout_toLeftOf);
            hashMap.put("layout_toRightOf", c.layout_toRightOf);
            hashMap.put("layout_toEndOf", c.layout_toEndOf);
            hashMap.put("background", c.background);
            hashMap.put("layout_marginTop", c.layout_marginTop);
            hashMap.put("layout_marginBottom", c.layout_marginBottom);
            hashMap.put("layout_marginLeft", cVar);
            hashMap.put("layout_marginRight", cVar2);
            hashMap.put("layout_alignParentBottom", c.layout_alignParentBottom);
            hashMap.put("layout_alignParentTop", c.layout_alignParentTop);
            hashMap.put("layout_alignParentLeft", c.layout_alignParentLeft);
            hashMap.put("layout_alignWithParentIfMissing", c.layout_alignWithParentIfMissing);
            hashMap.put("layout_alignTop", c.layout_alignTop);
            hashMap.put("layout_alignBottom", c.layout_alignBottom);
            hashMap.put("layout_alignLeft", c.layout_alignLeft);
            hashMap.put("layout_alignRight", c.layout_alignRight);
            hashMap.put("layout_centerInParent", c.layout_centerInParent);
            hashMap.put("layout_alignParentEnd", c.layout_alignParentEnd);
            this.f19486a = new SoftReference<>(hashMap);
        }
        return this.f19486a.get();
    }

    public final HashMap<String, c> c() {
        SoftReference<HashMap<String, c>> softReference = this.f19488c;
        if (softReference == null || softReference.get() == null) {
            HashMap hashMap = new HashMap(55);
            hashMap.put("id", c.id);
            hashMap.put(MimeTypes.BASE_TYPE_TEXT, c.text);
            hashMap.put("ellipsize", c.ellipsize);
            hashMap.put("singleLine", c.singleLine);
            hashMap.put("lines", c.lines);
            hashMap.put("maxLength", c.maxLength);
            hashMap.put("drawableLeft", c.drawableLeft);
            hashMap.put("drawablePadding", c.drawablePadding);
            hashMap.put("fadingEdge", c.fadingEdge);
            hashMap.put("scrollHorizontally", c.scrollHorizontally);
            hashMap.put("textColor", c.textColor);
            hashMap.put("textSize", c.textSize);
            hashMap.put("visibility", c.visibility);
            c cVar = c.background;
            hashMap.put("background", cVar);
            hashMap.put("textStyle", c.textStyle);
            hashMap.put(TtmlNode.TAG_STYLE, c.style);
            hashMap.put("layout_width", c.layout_width);
            hashMap.put("layout_height", c.layout_height);
            hashMap.put("layout_below", c.layout_below);
            hashMap.put("layout_centerInParent", c.layout_centerInParent);
            hashMap.put("contentDescription", c.contentDescription);
            hashMap.put("src", c.src);
            hashMap.put("gravity", c.gravity);
            hashMap.put("orientation", c.orientation);
            hashMap.put("numColumns", c.numColumns);
            hashMap.put("verticalSpacing", c.verticalSpacing);
            hashMap.put("horizontalSpacing", c.horizontalSpacing);
            hashMap.put("background", cVar);
            hashMap.put("layout_marginBottom", c.layout_marginBottom);
            hashMap.put("scaleType", c.scaleType);
            hashMap.put("tag", c.tag);
            hashMap.put("layout_gravity", c.layout_gravity);
            hashMap.put("parent_view", c.parent_view);
            hashMap.put("padding", c.padding);
            hashMap.put("paddingTop", c.paddingTop);
            hashMap.put("paddingBottom", c.paddingBottom);
            hashMap.put("paddingLeft", c.paddingLeft);
            hashMap.put("paddingRight", c.paddingRight);
            hashMap.put("divider", c.divider);
            hashMap.put("scrollbars", c.scrollbars);
            hashMap.put("listSelector", c.listSelector);
            this.f19488c = new SoftReference<>(hashMap);
        }
        return this.f19488c.get();
    }

    public final int d(String str) {
        if (this.f19491f != null) {
            String g8 = com.mbridge.msdk.foundation.controller.c.m().g();
            if (TextUtils.isEmpty(g8)) {
                g8 = this.f19491f.getPackageName();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(g8);
            sb.append(".R$");
            String[] split = str.split("\\.");
            sb.append(split[1]);
            try {
                Class<?> cls = Class.forName(sb.toString());
                Object newInstance = cls.newInstance();
                Field declaredField = cls.getDeclaredField(split[2]);
                declaredField.setAccessible(true);
                return ((Integer) declaredField.get(newInstance)).intValue();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return 0;
    }

    public final String e(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("@")) {
                return str;
            }
            SoftReference<HashMap<String, String>> softReference = this.f19487b;
            if (softReference == null || softReference.get() == null) {
                this.f19487b = new SoftReference<>(d());
            }
            String substring = str.substring(8);
            if (this.f19487b.get() != null && this.f19487b.get().size() > 0) {
                String str2 = this.f19487b.get().get(substring);
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
                try {
                    return com.mbridge.msdk.foundation.controller.c.m().c().getString(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), substring, TypedValues.Custom.S_STRING));
                } catch (Exception e8) {
                    ad.b("MBResource", e8.getMessage());
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final View f(String str) {
        if (this.f19491f != null) {
            try {
                a aVar = new a(this.f19491f);
                new String();
                g.a(str.toString());
                return aVar.a(str, (ViewGroup) null);
            } catch (Exception e8) {
                ad.b("MBResource", e8.getMessage());
            }
        }
        return null;
    }

    public final void a(Context context, String str) {
        try {
            if (g.f19926a) {
                this.f19489d = context.getFilesDir().toString();
            } else {
                this.f19489d = str;
            }
            if (e.a(context).heightPixels > 320 && !g.f19926a) {
                this.f19490e = "/drawable-hdpi/";
                this.f19491f = context;
                com.mbridge.msdk.dycreator.e.b.f19923a = a().d();
            }
            this.f19490e = "/drawable-mdpi/";
            this.f19491f = context;
            com.mbridge.msdk.dycreator.e.b.f19923a = a().d();
        } catch (Exception e8) {
            ad.b("MBResource", e8.getMessage());
        }
    }

    private HashMap<String, String> d() {
        InputStream inputStream;
        try {
            inputStream = this.f19491f.getAssets().open("rv_binddatas.xml");
        } catch (IOException e8) {
            e8.printStackTrace();
            inputStream = null;
        }
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setInput(inputStream, "utf-8");
            HashMap<String, String> hashMap = new HashMap<>();
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 2) {
                    if (TypedValues.Custom.S_STRING.equals(newPullParser.getName())) {
                        hashMap.put(newPullParser.getAttributeValue(0), newPullParser.nextText());
                    }
                }
            }
            return hashMap;
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    public final void a(Context context) {
        try {
            if (e.a(context).heightPixels > 320 && !g.f19926a) {
                this.f19490e = "/drawable-hdpi/";
                this.f19491f = context;
                com.mbridge.msdk.dycreator.e.b.f19923a = a().d();
            }
            this.f19490e = "/drawable-mdpi/";
            this.f19491f = context;
            com.mbridge.msdk.dycreator.e.b.f19923a = a().d();
        } catch (Exception e8) {
            ad.b("MBResource", e8.getMessage());
        }
    }

    public final int a(String str) {
        int color;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.startsWith("#")) {
            int length = str.length();
            if (length == 7) {
                return (int) Long.decode(str.replace("#", "#FF")).longValue();
            }
            if (length == 9) {
                return (int) Long.decode(str).longValue();
            }
            g.a("返回白色背景");
            return -1;
        }
        if (!str.startsWith("@color/")) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        String substring = str.substring(7);
        if (Build.VERSION.SDK_INT < 23) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        color = com.mbridge.msdk.foundation.controller.c.m().c().getColor(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), substring, "color"));
        return color;
    }

    public final GradientDrawable a(String[] strArr) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
            gradientDrawable.setGradientType(0);
            return gradientDrawable;
        } catch (Exception e8) {
            ad.b("MBResource", e8.getMessage());
            return null;
        }
    }

    public final int b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            int indexOf = str.indexOf("d");
            int indexOf2 = str.indexOf("s");
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            int parseInt = Integer.parseInt(str.substring(0, indexOf));
            if (str.contains("d")) {
                return (int) TypedValue.applyDimension(1, parseInt, this.f19491f.getResources().getDisplayMetrics());
            }
            str.contains("s");
            return parseInt;
        }
    }

    public final void a(String str, ImageView imageView) {
        Context context;
        if (str == null || !str.startsWith("@drawable/") || (context = this.f19491f) == null) {
            return;
        }
        try {
            Resources resources = context.getResources();
            String g8 = com.mbridge.msdk.foundation.controller.c.m().g();
            if (TextUtils.isEmpty(g8)) {
                g8 = this.f19491f.getPackageName();
            }
            imageView.setImageResource(resources.getIdentifier(str, "drawable", g8));
        } catch (Exception e8) {
            ad.b("MBResource", e8.getMessage());
        }
    }

    public final int c(String str) {
        String[] split = str.toUpperCase().split("\\|");
        int i8 = 48;
        try {
            Class<?> cls = Class.forName("android.view.Gravity");
            for (String str2 : split) {
                i8 = cls.getField(str2).getInt(null);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return i8;
    }
}
