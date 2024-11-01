package com.mbridge.msdk.dycreator.e;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.tools.ad;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c {
    public static double a(double d8, double d9, int i8) {
        if (i8 < 0) {
            return 1.0d;
        }
        try {
            return new BigDecimal(Double.toString(d8)).divide(new BigDecimal(Double.toString(d9)), i8, 4).doubleValue();
        } catch (Exception e8) {
            ad.b("CommUtil", e8.getMessage());
            return 1.0d;
        }
    }

    public static int a(Context context, float f8) {
        if (context == null) {
            return 0;
        }
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                return 0;
            }
            return (int) ((f8 * resources.getDisplayMetrics().density) + 0.5f);
        } catch (Exception e8) {
            ad.b("CommUtil", e8.getMessage());
            return 0;
        }
    }

    public static Map<String, String> a(Context context, AttributeSet attributeSet) {
        HashMap hashMap = new HashMap();
        if (context != null && attributeSet != null) {
            int attributeCount = attributeSet.getAttributeCount();
            for (int i8 = 0; i8 < attributeCount; i8++) {
                String attributeName = attributeSet.getAttributeName(i8);
                if (!TextUtils.isEmpty(attributeName)) {
                    if (attributeName.equals("mbridge_data")) {
                        try {
                            hashMap.put("mbridgeData", b.f19923a.get(attributeSet.getAttributeValue(i8).substring(8)));
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_click")) {
                        try {
                            hashMap.put("mbridgeAction", b.f19923a.get(attributeSet.getAttributeValue(i8).substring(8)));
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_strategy")) {
                        try {
                            hashMap.put("mbridgeStrategy", b.f19923a.get(attributeSet.getAttributeValue(i8).substring(8)));
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_effect")) {
                        try {
                            hashMap.put("mbridgeEffect", b.f19923a.get(attributeSet.getAttributeValue(i8).substring(8)));
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_report")) {
                        try {
                            hashMap.put("mbridgeReport", attributeSet.getAttributeValue(i8));
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public static void a(Map<String, String> map, View view) {
        if (map == null || view == null) {
            return;
        }
        if (map.containsKey("mbridgeData")) {
            com.mbridge.msdk.dycreator.binding.b.a().c(view);
        }
        if (map.containsKey("mbridgeAction")) {
            com.mbridge.msdk.dycreator.binding.b.a().d(view);
        }
        if (map.containsKey("mbridgeEffect")) {
            com.mbridge.msdk.dycreator.binding.b.a().b(view);
        }
        if (map.containsKey("mbridgeReport")) {
            com.mbridge.msdk.dycreator.binding.b.a().a(view);
        }
    }

    public static Map<String, Boolean> a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("\\|");
            if (split != null && split.length > 0) {
                for (String str2 : split) {
                    if (str2.equals("mbridgeAttached")) {
                        hashMap.put("mbridgeAttached", Boolean.TRUE);
                    }
                    if (str2.equals("mbridgeDetached")) {
                        hashMap.put("mbridgeDetached", Boolean.TRUE);
                    }
                }
            } else {
                if (str.equals("mbridgeAttached")) {
                    hashMap.put("mbridgeAttached", Boolean.TRUE);
                }
                if (str.equals("mbridgeDetached")) {
                    hashMap.put("mbridgeDetached", Boolean.TRUE);
                }
            }
        }
        return hashMap;
    }
}
