package com.mbridge.msdk.dycreator.e;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(View view, com.mbridge.msdk.dycreator.f.a.a aVar) {
        String[] split;
        if (view == 0) {
            return true;
        }
        try {
            if (!(view instanceof InterBase) || aVar == null) {
                return true;
            }
            String actionDes = ((InterBase) view).getActionDes();
            if (TextUtils.isEmpty(actionDes) || (split = actionDes.split("\\|")) == null || split.length < 2 || TextUtils.isEmpty(split[0]) || !split[0].startsWith(CampaignEx.JSON_NATIVE_VIDEO_CLICK) || TextUtils.isEmpty(split[1]) || !split[1].equals("alecfc") || aVar.getEffectData() == null) {
                return true;
            }
            return aVar.getEffectData().isClickScreen();
        } catch (Exception e8) {
            e8.printStackTrace();
            return true;
        }
    }

    public static void a(String str, View view, boolean z8) {
        if (view == null || !(view instanceof InterBase) || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] split = str.split("\\|");
            if (split == null || split.length < 2 || TextUtils.isEmpty(split[0]) || !split[0].startsWith("visible") || TextUtils.isEmpty(split[1]) || !split[1].equals("parent") || !z8) {
                return;
            }
            view.setVisibility(8);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static Object a(Object obj, String str) {
        Method method;
        try {
            try {
                method = obj.getClass().getMethod(str, null);
                if (method != null) {
                    try {
                        return method.invoke(obj, null);
                    } catch (NoSuchMethodException unused) {
                        if (obj instanceof com.mbridge.msdk.dycreator.f.a.a) {
                            method = ((com.mbridge.msdk.dycreator.f.a.a) obj).getBindData().getClass().getMethod(str, null);
                        }
                        if (method != null) {
                            return method.invoke(((com.mbridge.msdk.dycreator.f.a.a) obj).getBindData(), null);
                        }
                        return null;
                    }
                }
            } catch (NoSuchMethodException unused2) {
                method = null;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return null;
    }

    public static String a(boolean z8, int i8, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2) || !str2.contains("zh")) {
            return str + " " + i8 + "s";
        }
        if (z8) {
            return str + i8 + "s";
        }
        return i8 + "s " + str;
    }
}
