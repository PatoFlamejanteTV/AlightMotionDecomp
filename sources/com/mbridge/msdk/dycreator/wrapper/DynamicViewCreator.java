package com.mbridge.msdk.dycreator.wrapper;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.b.a;
import com.mbridge.msdk.dycreator.e.f;
import com.mbridge.msdk.dycreator.viewmodel.BaseViewModel;
import com.mbridge.msdk.dycreator.viewmodel.MBCommonViewVModel;
import com.mbridge.msdk.dycreator.viewmodel.MBRewardViewVModel;
import com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class DynamicViewCreator {

    /* renamed from: a, reason: collision with root package name */
    private static volatile DynamicViewCreator f19985a = null;

    /* renamed from: b, reason: collision with root package name */
    private static int f19986b = -201;

    /* renamed from: com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19987a;

        static {
            int[] iArr = new int[DyAdType.values().length];
            f19987a = iArr;
            try {
                iArr[DyAdType.SPLASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19987a[DyAdType.REWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private DynamicViewCreator() {
        b.a().a(c.m().c());
    }

    private View a(Context context, DyOption dyOption) {
        List<String> fileDirs;
        ViewGroup viewGroup;
        if (dyOption == null || (fileDirs = dyOption.getFileDirs()) == null) {
            return null;
        }
        int i8 = 0;
        ViewGroup viewGroup2 = null;
        int i9 = 0;
        while (i9 < fileDirs.size()) {
            try {
                if (!TextUtils.isEmpty(fileDirs.get(i9))) {
                    if (i9 == 0) {
                        viewGroup2 = (ViewGroup) f.a(context).a(fileDirs.get(i9));
                    } else {
                        String str = fileDirs.get(i9);
                        if (context != null && viewGroup2 != null && !TextUtils.isEmpty(str)) {
                            try {
                                JSONObject jSONObject = new JSONObject(str);
                                String string = jSONObject.getString("folder_dir");
                                if (!TextUtils.isEmpty(string)) {
                                    JSONArray jSONArray = new JSONArray(jSONObject.optString("ext_template"));
                                    if (jSONArray.length() != 0) {
                                        int i10 = 0;
                                        while (i10 < jSONArray.length()) {
                                            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                                            if (jSONObject2 != null) {
                                                View a9 = f.a(context).a(string + File.separator + jSONObject2.optString("name"));
                                                if (a9 != null) {
                                                    JSONObject jSONObject3 = jSONObject2.getJSONObject(TtmlNode.TAG_LAYOUT);
                                                    if (jSONObject3 != null) {
                                                        try {
                                                            String optString = jSONObject3.optString("parent_id");
                                                            if (!TextUtils.isEmpty(optString)) {
                                                                viewGroup = (ViewGroup) f.a(context).a(viewGroup2, optString);
                                                            } else {
                                                                viewGroup = viewGroup2;
                                                            }
                                                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                                                            if (layoutParams != null) {
                                                                String optString2 = jSONObject3.optString("below", "");
                                                                if (!TextUtils.isEmpty(optString2)) {
                                                                    layoutParams.addRule(3, optString2.hashCode());
                                                                }
                                                                String optString3 = jSONObject3.optString("left_of", "");
                                                                if (!TextUtils.isEmpty(optString3)) {
                                                                    layoutParams.addRule(i8, optString3.hashCode());
                                                                }
                                                                String optString4 = jSONObject3.optString("right_of", "");
                                                                if (!TextUtils.isEmpty(optString4)) {
                                                                    layoutParams.addRule(1, optString4.hashCode());
                                                                }
                                                                int optInt = jSONObject3.optInt("index", -2);
                                                                int optInt2 = jSONObject3.optInt("visibility", -1);
                                                                if (optInt2 != -1) {
                                                                    a9.setVisibility(optInt2);
                                                                }
                                                                if (optInt != -2) {
                                                                    viewGroup.addView(a9, optInt, layoutParams);
                                                                } else {
                                                                    viewGroup.addView(a9, layoutParams);
                                                                }
                                                            }
                                                        } catch (Exception e8) {
                                                            ad.b("DynamicViewCreator", e8.getMessage());
                                                        }
                                                    } else {
                                                        viewGroup2.addView(a9, 3);
                                                    }
                                                }
                                            }
                                            i10++;
                                            i8 = 0;
                                        }
                                    }
                                }
                            } catch (Exception e9) {
                                ad.b("DynamicViewCreator", e9.getMessage());
                            }
                        }
                    }
                }
                i9++;
                i8 = 0;
            } catch (Exception e10) {
                ad.b("DynamicViewCreator", e10.getMessage());
            }
        }
        return viewGroup2;
    }

    public static DynamicViewCreator getInstance() {
        if (f19985a == null) {
            synchronized (DynamicViewCreator.class) {
                try {
                    if (f19985a == null) {
                        f19985a = new DynamicViewCreator();
                    }
                } finally {
                }
            }
        }
        return f19985a;
    }

    public void createDynamicView(DyOption dyOption, DynamicViewBackListener dynamicViewBackListener) {
        boolean z8;
        BaseViewModel mBSplashViewVModel;
        BaseViewModel baseViewModel;
        if (dyOption == null) {
            dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.NOT_FOUND_DYNAMIC_OPTION));
            return;
        }
        if (dynamicViewBackListener == null) {
            return;
        }
        Context c8 = c.m().c();
        if (c8 == null) {
            dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.NOT_FOUND_CONTEXT));
            return;
        }
        boolean z9 = false;
        if (dyOption.getCampaignEx() == null) {
            dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.NOT_FOUND_CAMPAIGN));
            z8 = false;
        } else {
            z8 = true;
        }
        if (dyOption.getFile() != null || dyOption.getFileDirs() == null) {
            z9 = z8;
        } else {
            dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.BIND_DATA_FILE_OR_DIR));
        }
        if (z9) {
            try {
                View a9 = a(c8, dyOption);
                if (a9 == null) {
                    dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.FILE_CREATE_VIEW_FILE));
                    return;
                }
                int i8 = AnonymousClass1.f19987a[dyOption.getDyAdType().ordinal()];
                if (i8 == 1) {
                    mBSplashViewVModel = new MBSplashViewVModel(dyOption);
                } else {
                    if (i8 != 2) {
                        baseViewModel = new MBCommonViewVModel();
                        baseViewModel.setDynamicViewBackListener(dynamicViewBackListener);
                        com.mbridge.msdk.dycreator.binding.b.a().a(baseViewModel);
                        baseViewModel.setModelDataAndBind();
                        dynamicViewBackListener.viewCreatedSuccess(a9);
                    }
                    mBSplashViewVModel = new MBRewardViewVModel(dyOption);
                }
                baseViewModel = mBSplashViewVModel;
                baseViewModel.setDynamicViewBackListener(dynamicViewBackListener);
                com.mbridge.msdk.dycreator.binding.b.a().a(baseViewModel);
                baseViewModel.setModelDataAndBind();
                dynamicViewBackListener.viewCreatedSuccess(a9);
            } catch (Exception e8) {
                ad.b("DynamicViewCreator", e8.getMessage());
                dynamicViewBackListener.viewCreateFail(new a(f19986b, e8.getMessage()));
            }
        }
    }

    public View createDynamicView(DyOption dyOption) {
        Context c8;
        if (dyOption == null || (c8 = c.m().c()) == null) {
            return null;
        }
        return a(c8, dyOption);
    }
}
